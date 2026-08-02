package ru.ok.tensorflow.ssd;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Functional;
import xsna.a2k0;
import xsna.ji;
import xsna.p11;
import xsna.trk0;

/* loaded from: classes9.dex */
public class Util {
    private static float area(Detection detection) {
        return area(detection.getX1(), detection.getY1(), detection.getX2(), detection.getY2());
    }

    public static List<Detection> calculateSpeed(List<Detection> list, List<Detection> list2) {
        for (Detection detection : list) {
            detection.speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Iterator<Detection> it = list2.iterator();
            while (it.hasNext()) {
                double embeddingSimilarity = embeddingSimilarity(detection, it.next());
                if (embeddingSimilarity > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    detection.speed = (float) Math.max(1.0d - embeddingSimilarity, detection.speed);
                }
            }
        }
        return list;
    }

    public static List<Detection> calculateSpeedByPoints(List<Detection> list, List<Detection> list2) {
        for (int i = 0; i < list.size(); i++) {
            Detection detection = list.get(i);
            detection.speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i < list2.size()) {
                Detection detection2 = list2.get(i);
                float[] fArr = detection.location;
                float[] fArr2 = detection2.location;
                float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                boolean z = detection.is3DLocation;
                boolean z2 = detection2.is3DLocation;
                if (z == z2) {
                    boolean z3 = z && z2;
                    int i2 = z3 ? 3 : 2;
                    int min = Math.min((fArr2.length - 4) / i2, (fArr.length - 4) / i2);
                    for (int i3 = 0; i3 < min; i3++) {
                        int i4 = i3 * i2;
                        int i5 = i4 + 4;
                        fArr3[0] = fArr[i5] - fArr2[i5];
                        int i6 = i4 + 5;
                        fArr3[1] = fArr[i6] - fArr2[i6];
                        if (z3) {
                            int i7 = i4 + 6;
                            fArr3[2] = fArr[i7] - fArr2[i7];
                        }
                    }
                    float f = fArr3[0];
                    float f2 = fArr3[1];
                    float f3 = (f2 * f2) + (f * f);
                    float f4 = fArr3[2];
                    detection.speed = ((float) Math.sqrt((f4 * f4) + f3)) / min;
                }
            }
        }
        return list;
    }

    public static float embeddingSimilarity(Detection detection, Detection detection2) {
        return intersectionArea(detection, detection2) / Math.min(detection.getArea(), detection2.getArea());
    }

    private static float intersectionArea(Detection detection, Detection detection2) {
        return area(Math.max(detection.getX1(), detection2.getX1()), Math.max(detection.getY1(), detection2.getY1()), Math.min(detection.getX2(), detection2.getX2()), Math.min(detection.getY2(), detection2.getY2()));
    }

    private static float iou(Detection detection, Detection detection2) {
        float intersectionArea = intersectionArea(detection, detection2);
        return intersectionArea / ((area(detection) + area(detection2)) - intersectionArea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Float lambda$mergeDetections$2(Detection detection) {
        return Float.valueOf(detection.score);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$nms$0(Detection detection, Detection detection2) {
        return (int) Math.signum(detection.score - detection2.score);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Float lambda$nms$1(Detection detection) {
        return Float.valueOf(detection.score);
    }

    private static Detection mergeDetections(List<Detection> list) {
        Detection detection = (Detection) Functional.max(list, new trk0(4));
        Iterator<Detection> it = list.iterator();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            f += it.next().score;
        }
        int length = list.get(0).location.length;
        float[] fArr = new float[length];
        for (Detection detection2 : list) {
            float f2 = detection2.score / f;
            for (int i = 0; i < length; i++) {
                fArr[i] = (detection2.location[i] * f2) + fArr[i];
            }
        }
        return new Detection(detection.score, fArr, detection.id, detection.angleDegrees, detection.detectionClass, detection.is3DLocation, detection.speed);
    }

    public static List<Detection> nms(List<Detection> list, float f) {
        return nms(list, f, true);
    }

    public static List<Detection> removeSimilar(List<Detection> list, List<Detection> list2, float f) {
        ArrayList arrayList = new ArrayList();
        for (Detection detection : list) {
            Iterator<Detection> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(detection);
                    break;
                }
                Detection next = it.next();
                if (embeddingSimilarity(detection, next) > f) {
                    next.speed = detection.speed;
                    break;
                }
            }
        }
        return arrayList;
    }

    private static float area(float f, float f2, float f3, float f4) {
        return Math.max(f4 - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * Math.max(f3 - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static List<Detection> nms(List<Detection> list, float f, boolean z) {
        Collections.sort(list, new a2k0(1));
        ArrayList arrayList = new ArrayList(list.size());
        while (!list.isEmpty()) {
            Detection detection = (Detection) ji.a(1, list);
            list.remove(list.size() - 1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(detection);
            for (int size = list.size() - 1; size >= 0; size--) {
                Detection detection2 = list.get(size);
                if (iou(detection, detection2) >= f) {
                    arrayList2.add(detection2);
                    list.remove(size);
                }
            }
            arrayList.add(z ? mergeDetections(arrayList2) : (Detection) Functional.max(arrayList2, new p11(29)));
        }
        return arrayList;
    }
}
