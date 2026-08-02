package xsna;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: MathUtils.java */
/* loaded from: classes.dex */
public final class bn10 {
    @Nullable
    public static PointF a(PointF[] pointFArr) {
        int i;
        if (pointFArr.length < 3) {
            return null;
        }
        int length = pointFArr.length;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i2 = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            PointF pointF = pointFArr[i2];
            float f2 = pointF.x;
            i2++;
            PointF pointF2 = pointFArr[i2];
            f += (f2 * pointF2.y) - (pointF2.x * pointF.y);
        }
        PointF pointF3 = pointFArr[i];
        float f3 = pointF3.x;
        PointF pointF4 = pointFArr[0];
        float f4 = (((f3 * pointF4.y) - (pointF4.x * pointF3.y)) + f) / 2.0f;
        PointF pointF5 = new PointF();
        int i3 = 0;
        while (i3 < i) {
            PointF pointF6 = pointFArr[i3];
            float f5 = pointF6.x;
            i3++;
            PointF pointF7 = pointFArr[i3];
            float f6 = pointF7.y;
            float f7 = pointF7.x;
            float f8 = pointF6.y;
            float f9 = (f5 * f6) - (f7 * f8);
            pointF5.x = ((f5 + f7) * f9) + pointF5.x;
            pointF5.y = ((f8 + f6) * f9) + pointF5.y;
        }
        PointF pointF8 = pointFArr[i];
        float f10 = pointF8.x;
        PointF pointF9 = pointFArr[0];
        float f11 = pointF9.y;
        float f12 = pointF9.x;
        float f13 = pointF8.y;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = ((f10 + f12) * f14) + pointF5.x;
        float f16 = ((f13 + f11) * f14) + pointF5.y;
        float f17 = 1.0f / (f4 * 6.0f);
        pointF5.x = f15 * f17;
        pointF5.y = f17 * f16;
        return pointF5;
    }

    public static float b(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int d(float f, float f2) {
        if (Math.abs(f - f2) < 5.0E-4d) {
            return 0;
        }
        return f < f2 ? -1 : 1;
    }

    public static final View[] e(androidx.constraintlayout.widget.a aVar) {
        int[] referencedIds = aVar.getReferencedIds();
        View rootView = aVar.getRootView();
        ArrayList arrayList = new ArrayList(referencedIds.length);
        for (int i : referencedIds) {
            arrayList.add(rootView.findViewById(i));
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public static boolean f(PointF[] pointFArr, float f, float f2) {
        if (pointFArr.length < 3) {
            return false;
        }
        PointF pointF = pointFArr[0];
        float f3 = pointF.x;
        PointF pointF2 = pointFArr[2];
        if (f3 == pointF2.x && pointF.y == pointF2.y) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= pointFArr.length) {
                break;
            }
            PointF pointF3 = pointFArr[i];
            PointF pointF4 = i == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i + 1];
            float f4 = pointF3.y;
            boolean z2 = f4 >= f2;
            float f5 = pointF4.y;
            if (z2 != (f5 >= f2)) {
                float f6 = pointF4.x;
                float f7 = pointF3.x;
                if (f <= (((f2 - f4) * (f6 - f7)) / (f5 - f4)) + f7) {
                    z = !z;
                }
            }
            i++;
        }
        if (!z) {
            int i2 = 0;
            while (i2 < pointFArr.length) {
                PointF pointF5 = pointFArr[i2];
                PointF pointF6 = i2 == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i2 + 1];
                float f8 = pointF5.y;
                float f9 = pointF6.x;
                float f10 = pointF5.x;
                if (d(Math.abs(((f9 - f10) * (f2 - f8)) - ((pointF6.y - f8) * (f - f10))), 5.0E-4f) <= 0) {
                    float f11 = pointF5.x;
                    float f12 = (pointF6.x - f11) * (f - f11);
                    float f13 = pointF5.y;
                    float b = u11.b(pointF6.y, f13, f2 - f13, f12);
                    if (d(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 0) {
                        continue;
                    } else {
                        float f14 = pointF6.x - pointF5.x;
                        float f15 = pointF6.y - pointF5.y;
                        if (d(b, (f15 * f15) + (f14 * f14)) <= 0) {
                            return true;
                        }
                    }
                }
                i2++;
            }
        }
        return z;
    }

    public static boolean g(PointF[] pointFArr, PointF[] pointFArr2) {
        for (PointF pointF : pointFArr2) {
            if (!f(pointFArr, pointF.x, pointF.y)) {
                return false;
            }
        }
        return true;
    }
}
