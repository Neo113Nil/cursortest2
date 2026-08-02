package com.yandex.mapkit.maps.core.utils.sensors;

import android.view.Display;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0004¨\u0006\u001a"}, d2 = {"", "rotation1", "rotation2", "averageDegree", "(DD)D", "", "rotations", "(Ljava/util/List;)D", "rotate", "normalizeOnCircle", "(D)D", "Landroid/view/Display;", "display", "", "displayDiff", "(Landroid/view/Display;I)I", "noiseRotations", "", "rightLeft", "Lzy11;", "averageRightLeft", "(Ljava/util/List;D[D)V", "maxRightLeftDist", "d", "d2", "degreesDistance", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RotationsOnCircleUtilsKt {
    public static final double averageDegree(double d, double d2) {
        if ((d2 < 0.0d || d < 0.0d) && (d2 > 0.0d || d > 0.0d)) {
            double abs = Math.abs(d);
            double abs2 = Math.abs(d2);
            if (abs2 + abs > 180.0d) {
                if (d2 < 0.0d) {
                    abs2 = 360.0d + d2;
                }
                if (d < 0.0d) {
                    abs = 360.0d + d;
                }
                double d3 = (abs2 + abs) / 2.0d;
                return d3 > 180.0d ? d3 - 360.0d : d3;
            }
        }
        return (d + d2) / 2.0d;
    }

    public static final void averageRightLeft(List<Double> list, double d, double[] dArr) {
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            double normalizeOnCircle = normalizeOnCircle(it.next().doubleValue() - d);
            if (normalizeOnCircle > 0.0d) {
                double d2 = dArr[0];
                if (d2 == 0.0d) {
                    dArr[0] = normalizeOnCircle;
                } else {
                    dArr[0] = averageDegree(normalizeOnCircle, d2);
                }
            }
            if (normalizeOnCircle < 0.0d) {
                double d3 = dArr[1];
                if (d3 == 0.0d) {
                    dArr[1] = normalizeOnCircle;
                } else {
                    dArr[1] = averageDegree(normalizeOnCircle, d3);
                }
            }
        }
    }

    private static final double degreesDistance(double d, double d2) {
        double abs = Math.abs(d - d2);
        return abs > 180.0d ? 360.0d - abs : abs;
    }

    public static final int displayDiff(Display display, int i) {
        int rotation = display.getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = SubsamplingScaleImageView.ORIENTATION_180;
            } else if (rotation == 3) {
                i2 = SubsamplingScaleImageView.ORIENTATION_270;
            }
        }
        return (int) normalizeOnCircle(i + i2);
    }

    public static final void maxRightLeftDist(List<Double> list, double d, double[] dArr) {
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            double normalizeOnCircle = normalizeOnCircle(it.next().doubleValue() - d);
            double degreesDistance = degreesDistance(normalizeOnCircle, 0.0d);
            if (normalizeOnCircle > 0.0d) {
                double d2 = dArr[0];
                if (d2 == 0.0d) {
                    dArr[0] = degreesDistance;
                } else if (d2 < degreesDistance) {
                    dArr[0] = degreesDistance;
                }
            }
            if (normalizeOnCircle < 0.0d) {
                double d3 = dArr[1];
                if (d3 == 0.0d) {
                    dArr[1] = degreesDistance;
                } else if (d3 < degreesDistance) {
                    dArr[1] = degreesDistance;
                }
            }
        }
    }

    public static final double normalizeOnCircle(double d) {
        return d < -180.0d ? 360.0d + d : d > 180.0d ? d - 360.0d : d;
    }

    public static final double averageDegree(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0d;
        }
        double doubleValue = list.get(0).doubleValue();
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            doubleValue = averageDegree(it.next().doubleValue(), doubleValue);
        }
        return doubleValue;
    }
}
