package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CircularPropagation.java */
/* loaded from: classes12.dex */
public final class wdc extends z4u0 {
    public final float b = 3.0f;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // xsna.bnp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(ViewGroup viewGroup, vlp0 vlp0Var, gnp0 gnp0Var, gnp0 gnp0Var2) {
        int i;
        Rect epicenter;
        int round;
        int i2;
        long duration;
        Integer num;
        if (gnp0Var == null && gnp0Var2 == null) {
            return 0L;
        }
        if (gnp0Var2 != null) {
            if (((gnp0Var == null || (num = (Integer) gnp0Var.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                gnp0Var = gnp0Var2;
                i = 1;
                int c = z4u0.c(gnp0Var, 0);
                int c2 = z4u0.c(gnp0Var, 1);
                epicenter = vlp0Var.getEpicenter();
                if (epicenter == null) {
                    i2 = epicenter.centerX();
                    round = epicenter.centerY();
                } else {
                    viewGroup.getLocationOnScreen(new int[2]);
                    int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
                    round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
                    i2 = round2;
                }
                float f = i2 - c;
                float f2 = round - c2;
                float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                float width = viewGroup.getWidth();
                float height = viewGroup.getHeight();
                float f3 = width - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f4 = height - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float sqrt2 = sqrt / ((float) Math.sqrt((f4 * f4) + (f3 * f3)));
                duration = vlp0Var.getDuration();
                if (duration < 0) {
                    duration = 300;
                }
                return Math.round(((duration * i) / this.b) * sqrt2);
            }
        }
        i = -1;
        int c3 = z4u0.c(gnp0Var, 0);
        int c22 = z4u0.c(gnp0Var, 1);
        epicenter = vlp0Var.getEpicenter();
        if (epicenter == null) {
        }
        float f5 = i2 - c3;
        float f22 = round - c22;
        float sqrt3 = (float) Math.sqrt((f22 * f22) + (f5 * f5));
        float width2 = viewGroup.getWidth();
        float height2 = viewGroup.getHeight();
        float f32 = width2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f42 = height2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float sqrt22 = sqrt3 / ((float) Math.sqrt((f42 * f42) + (f32 * f32)));
        duration = vlp0Var.getDuration();
        if (duration < 0) {
        }
        return Math.round(((duration * i) / this.b) * sqrt22);
    }
}
