package ru.ok.tensorflow.gesture;

import android.graphics.Canvas;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.CompositeRecognition;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.util.Trigonometry;
import ru.ok.tensorflow.visualization.MultiBoxVisualizer;

/* loaded from: classes9.dex */
public class HeartGestureAssembler {
    private MultiBoxVisualizer visualizer;

    public HeartGestureAssembler(MultiBoxVisualizer multiBoxVisualizer) {
        this.visualizer = multiBoxVisualizer;
    }

    private void appendPotentialHearts(List<Recognition> list, List<Recognition> list2, List<Recognition> list3) {
        ArrayList arrayList = new ArrayList();
        for (Recognition recognition : list) {
            for (Recognition recognition2 : list3) {
                if (!list.contains(recognition2) && !list2.contains(recognition2) && HeartUtil.doHeartsMatch(recognition, Gesture.HEART_LEFT, recognition2, Gesture.HEART_RIGHT)) {
                    arrayList.add(recognition2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Recognition recognition3 : list2) {
            for (Recognition recognition4 : list3) {
                if (!list.contains(recognition4) && !list2.contains(recognition4) && HeartUtil.doHeartsMatch(recognition3, Gesture.HEART_RIGHT, recognition4, Gesture.HEART_LEFT)) {
                    arrayList2.add(recognition4);
                }
            }
        }
        list.addAll(arrayList2);
        list2.addAll(arrayList);
    }

    private List<Recognition> collectsHearts(List<Recognition> list) {
        ArrayList arrayList = new ArrayList();
        for (Recognition recognition : list) {
            Gesture recognitionToGesture = GestureManager.recognitionToGesture(recognition);
            if (recognitionToGesture == Gesture.HEART_LEFT || recognitionToGesture == Gesture.HEART_RIGHT) {
                arrayList.add(recognition);
            }
        }
        return arrayList;
    }

    private List<Recognition> filterRecognitions(List<Recognition> list, Gesture gesture) {
        ArrayList arrayList = new ArrayList();
        for (Recognition recognition : list) {
            if (GestureManager.recognitionToGesture(recognition) == gesture) {
                arrayList.add(recognition);
            }
        }
        return arrayList;
    }

    private Recognition findStrongest(List<Recognition> list) {
        Recognition recognition = list.get(0);
        for (Recognition recognition2 : list) {
            if (recognition2.detection.score > recognition.detection.score) {
                recognition = recognition2;
            }
        }
        return recognition;
    }

    private Pair<Recognition, Recognition> matchBestPair(List<Recognition> list, List<Recognition> list2) {
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        int i = -1;
        float f = Float.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            for (int i4 = 0; i4 < list2.size(); i4++) {
                float distance = HeartUtil.getDistance(HeartUtil.getHeartCenter(list.get(i3), Gesture.HEART_LEFT), HeartUtil.getHeartCenter(list2.get(i4), Gesture.HEART_RIGHT));
                if (distance < f) {
                    i = i3;
                    i2 = i4;
                    f = distance;
                }
            }
        }
        return new Pair<>(list.get(i), list2.get(i2));
    }

    public List<CompositeRecognition> assembleHearts(List<Recognition> list, Canvas canvas) {
        float heartAngle;
        Recognition recognition;
        Recognition recognition2;
        List<List<Recognition>> nmsSplit = HeartUtil.nmsSplit(collectsHearts(list));
        ArrayList arrayList = new ArrayList();
        for (List<Recognition> list2 : nmsSplit) {
            Gesture gesture = Gesture.HEART_LEFT;
            List<Recognition> filterRecognitions = filterRecognitions(list2, gesture);
            Gesture gesture2 = Gesture.HEART_RIGHT;
            List<Recognition> filterRecognitions2 = filterRecognitions(list2, gesture2);
            appendPotentialHearts(filterRecognitions, filterRecognitions2, list);
            if (!filterRecognitions.isEmpty() && !filterRecognitions2.isEmpty()) {
                Pair<Recognition, Recognition> matchBestPair = matchBestPair(filterRecognitions, filterRecognitions2);
                float[] mean = HeartUtil.getMean(HeartUtil.getHeartCenter((Recognition) matchBestPair.first, gesture), HeartUtil.getHeartCenter((Recognition) matchBestPair.second, gesture2));
                Detection detection = ((Recognition) matchBestPair.first).detection;
                arrayList.add(new CompositeRecognition((Recognition) matchBestPair.first, (Recognition) matchBestPair.second, mean, (((Recognition) matchBestPair.second).detection.getSize() + detection.getSize()) / 2.0f, Trigonometry.meanAngleDegrees(HeartUtil.getHeartAngle((Recognition) matchBestPair.first, gesture), HeartUtil.getHeartAngle((Recognition) matchBestPair.second, gesture2)), CompositeGesture.HEART));
            } else if (list2.isEmpty()) {
                continue;
            } else {
                Recognition findStrongest = findStrongest(list2);
                Gesture gesture3 = findStrongest.getGesture();
                float[] heartCenter = HeartUtil.getHeartCenter(findStrongest, gesture3);
                float size = findStrongest.detection.getSize();
                if (gesture3 == gesture) {
                    heartAngle = HeartUtil.getHeartAngle(findStrongest, gesture);
                    recognition2 = findStrongest;
                    recognition = null;
                } else {
                    if (gesture3 != gesture2) {
                        throw new IllegalArgumentException();
                    }
                    heartAngle = HeartUtil.getHeartAngle(findStrongest, gesture2);
                    recognition = findStrongest;
                    recognition2 = null;
                }
                arrayList.add(new CompositeRecognition(recognition2, recognition, heartCenter, size, heartAngle, CompositeGesture.HEART));
            }
        }
        return arrayList;
    }
}
