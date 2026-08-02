package ru.ok.tensorflow.smoothing;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.filter.CyclicFilter;
import ru.ok.tensorflow.smoothing.filter.DrawingPointEmaFilter;
import ru.ok.tensorflow.smoothing.filter.OneEuroFilter;
import ru.ok.tensorflow.util.Function;

/* loaded from: classes9.dex */
public class DetectionSmoother {
    private Function<Float, Float> betaPosDynamicFunc;
    private Integer drawingPointIndex;
    private final CyclicFilter filterAngle;
    private final OneEuroFilter filterAngle2;
    private final OneEuroFilter filterCX;
    private final OneEuroFilter filterCY;
    private final DrawingPointEmaFilter filterDrawingPoint;
    private final OneEuroFilter filterH;
    private final OneEuroFilter filterW;
    private final List<List<OneEuroFilter>> keyPointFilters;

    public DetectionSmoother(float f, float f2, float f3, float f4, float f5, float f6, float f7, Integer num, float f8, Detection detection, long j) {
        this.betaPosDynamicFunc = null;
        this.drawingPointIndex = num;
        PointF centerPoint = detection.getCenterPoint();
        long j2 = j;
        this.filterCX = new OneEuroFilter(j2, centerPoint.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 1.0f);
        this.filterCY = new OneEuroFilter(j2, centerPoint.y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 1.0f);
        this.filterW = new OneEuroFilter(j2, detection.getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, 1.0f);
        this.filterH = new OneEuroFilter(j2, detection.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, 1.0f);
        this.filterAngle = new CyclicFilter(j2, detection.angleDegrees.floatValue(), f5);
        this.filterAngle2 = new OneEuroFilter(j2, detection.angleDegrees.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f7, 1.0f);
        if (num != null) {
            this.filterDrawingPoint = new DrawingPointEmaFilter(j2, detection.getKeypoint(this.drawingPointIndex.intValue()), f8);
        } else {
            this.filterDrawingPoint = null;
        }
        this.keyPointFilters = new ArrayList();
        int i = 4;
        while (i < detection.getNumKeypoints()) {
            PointF keypoint = detection.getKeypoint(i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OneEuroFilter(j2, keypoint.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 1.0f));
            arrayList.add(new OneEuroFilter(j, keypoint.y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 1.0f));
            if (detection.is3DLocation) {
                arrayList.add(new OneEuroFilter(j, detection.getKeypointForDimention(i, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 1.0f));
            }
            this.keyPointFilters.add(arrayList);
            i++;
            j2 = j;
        }
    }

    public void applyDynamicBeta(Detection detection) {
        Function<Float, Float> function = this.betaPosDynamicFunc;
        if (function != null) {
            Float apply = function.apply(Float.valueOf(detection.speed));
            this.filterCX.setBeta(apply.floatValue());
            this.filterCY.setBeta(apply.floatValue());
            for (int i = 0; i < this.keyPointFilters.size(); i++) {
                List<OneEuroFilter> list = this.keyPointFilters.get(i);
                list.get(0).setBeta(apply.floatValue());
                list.get(1).setBeta(apply.floatValue());
                if (detection.is3DLocation && list.size() > 2) {
                    list.get(2).setBeta(apply.floatValue());
                }
            }
        }
    }

    public Detection smooth(Detection detection, long j, boolean z) {
        Detection updatePosition;
        float f;
        applyDynamicBeta(detection);
        PointF centerPoint = detection.getCenterPoint();
        float filter = this.filterCX.filter(j, centerPoint.x);
        float filter2 = this.filterCY.filter(j, centerPoint.y);
        float floatValue = detection.angleDegrees.floatValue();
        if (z) {
            this.filterAngle.filter(j, floatValue);
            floatValue = this.filterAngle2.filter(j, floatValue);
        }
        float f2 = floatValue;
        float filter3 = this.filterW.filter(j, detection.getWidth());
        float filter4 = this.filterH.filter(j, detection.getHeight());
        PointF[] pointFArr = new PointF[this.keyPointFilters.size()];
        float[] fArr = detection.is3DLocation ? new float[this.keyPointFilters.size()] : null;
        int i = 0;
        int i2 = 0;
        while (i2 < this.keyPointFilters.size()) {
            PointF keypoint = detection.getKeypoint(i2 + 4);
            List<OneEuroFilter> list = this.keyPointFilters.get(i2);
            float filter5 = list.get(i).filter(j, keypoint.x);
            float filter6 = list.get(1).filter(j, keypoint.y);
            if (detection.is3DLocation) {
                f = filter2;
                if (list.size() > 2) {
                    fArr[i2] = list.get(2).filter(j, detection.getKeypointForDimention(i2, 2));
                }
            } else {
                f = filter2;
            }
            pointFArr[i2] = new PointF(filter5, filter6);
            i2++;
            filter2 = f;
            i = 0;
        }
        float f3 = filter2;
        if (detection.is3DLocation) {
            float f4 = filter3 / 2.0f;
            float f5 = filter4 / 2.0f;
            updatePosition = detection.updatePosition(filter - f4, f3 - f5, f4 + filter, f3 + f5, pointFArr, fArr, 4, f2);
        } else {
            float f6 = filter3 / 2.0f;
            float f7 = filter4 / 2.0f;
            updatePosition = detection.updatePosition(filter - f6, f3 - f7, f6 + filter, f3 + f7, pointFArr, 4, f2);
        }
        Integer num = this.drawingPointIndex;
        if (num != null) {
            return updatePosition.updatePoint(this.drawingPointIndex.intValue(), this.filterDrawingPoint.filter(j, updatePosition.getKeypoint(num.intValue())));
        }
        return updatePosition;
    }

    public DetectionSmoother(float f, float f2, float f3, float f4, float f5, float f6, float f7, Integer num, float f8, Detection detection, long j, Function<Float, Float> function) {
        this(f, f2, f3, f4, f5, f6, f7, num, f8, detection, j);
        this.betaPosDynamicFunc = function;
    }
}
