package ru.ok.tensorflow.gesture;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.util.Trigonometry;
import xsna.ji;
import xsna.m1v;

/* loaded from: classes9.dex */
public class HeartUtil {
    static float DISTANCE_THRESHOLD_FACTOR = 1.25f;
    public static float HEART_STANDARD_ANGLE = 40.0f;
    static float LINE_LENGTH = 3.5f;
    static float PAIR_PROXIMITY_COEF = 0.75f;

    private static boolean closeEnough(Recognition recognition, Recognition recognition2) {
        Gesture recognitionToGesture = GestureManager.recognitionToGesture(recognition);
        return (recognitionToGesture == GestureManager.recognitionToGesture(recognition2) ? getDistance(recognition.detection.getCenter(), recognition2.detection.getCenter()) : getDistance(getHeartPairPoint(recognition, recognitionToGesture), recognition2.detection.getCenter())) < ((recognition2.detection.getSize() + recognition.detection.getSize()) / 2.0f) * DISTANCE_THRESHOLD_FACTOR;
    }

    public static boolean doHeartsMatch(Recognition recognition, Gesture gesture, Recognition recognition2, Gesture gesture2) {
        if (getDistance(recognition2.detection.getCenter(), getHeartPairPoint(recognition, gesture)) > recognition2.detection.getSize() * PAIR_PROXIMITY_COEF) {
            return false;
        }
        return getDistance(recognition.detection.getCenter(), getHeartPairPoint(recognition2, gesture2)) <= recognition.detection.getSize() * PAIR_PROXIMITY_COEF;
    }

    public static float getDistance(float[] fArr, float[] fArr2) {
        return (float) Math.sqrt(Math.pow(fArr[1] - fArr2[1], 2.0d) + Math.pow(fArr[0] - fArr2[0], 2.0d));
    }

    public static float getHeartAngle(Recognition recognition, Gesture gesture) {
        float f;
        float rotationDegrees = recognition.detection.getRotationDegrees(7, false);
        if (gesture == Gesture.HEART_LEFT) {
            f = HEART_STANDARD_ANGLE;
        } else {
            if (gesture != Gesture.HEART_RIGHT) {
                throw new IllegalArgumentException();
            }
            f = 180.0f - HEART_STANDARD_ANGLE;
        }
        return Trigonometry.make0to360(f - rotationDegrees);
    }

    public static float[] getHeartCenter(Recognition recognition, Gesture gesture) {
        return getHeartPoint(recognition, gesture, true);
    }

    public static float[] getHeartPairPoint(Recognition recognition, Gesture gesture) {
        return getHeartPoint(recognition, gesture, false);
    }

    private static float[] getHeartPoint(Recognition recognition, Gesture gesture, boolean z) {
        float[] fArr;
        float f;
        Detection detection = recognition.detection;
        float[] fArr2 = {(detection.getX2() + detection.getX1()) / 2.0f, (detection.getY2() + detection.getY1()) / 2.0f};
        float x2 = detection.getX2() - detection.getX1();
        Matrix matrix = new Matrix();
        float rotationDegrees = recognition.detection.getRotationDegrees(7, false);
        float f2 = z ? LINE_LENGTH / 2.0f : LINE_LENGTH;
        if (gesture == Gesture.HEART_LEFT) {
            fArr = new float[]{(x2 * f2) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            f = HEART_STANDARD_ANGLE;
        } else {
            if (gesture != Gesture.HEART_RIGHT) {
                throw new IllegalArgumentException();
            }
            fArr = new float[]{((-x2) * f2) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            f = 180.0f - HEART_STANDARD_ANGLE;
        }
        matrix.postRotate(f - rotationDegrees);
        matrix.postTranslate(fArr2[0], fArr2[1]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    public static float[] getMean(float[] fArr, float[] fArr2) {
        return new float[]{(fArr[0] + fArr2[0]) / 2.0f, (fArr[1] + fArr2[1]) / 2.0f};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$nmsSplit$0(Recognition recognition, Recognition recognition2) {
        return (int) Math.signum(recognition.detection.score - recognition2.detection.score);
    }

    public static List<List<Recognition>> nmsSplit(List<Recognition> list) {
        Collections.sort(list, new m1v());
        ArrayList arrayList = new ArrayList(list.size());
        while (!list.isEmpty()) {
            Recognition recognition = (Recognition) ji.a(1, list);
            list.remove(list.size() - 1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(recognition);
            for (int size = list.size() - 1; size >= 0; size--) {
                Recognition recognition2 = list.get(size);
                if (closeEnough(recognition, recognition2)) {
                    arrayList2.add(recognition2);
                    list.remove(size);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
