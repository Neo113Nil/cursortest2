package xsna;

import android.graphics.RectF;
import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientPointAndColorMultiplier;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.Shadow;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import xsna.er9;

/* compiled from: ComposeCompatShadowsRenderer.kt */
/* loaded from: classes17.dex */
public final class kpi {
    public final RectF a;
    public float b;
    public Shadow c;
    public gte0 d;
    public y7z e;
    public final RectF f;
    public final RectF g;
    public final androidx.compose.ui.graphics.a h;

    public kpi() {
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = rectF;
        this.c = Shadow.i;
        a();
        this.f = new RectF(rectF);
        this.g = new RectF();
        this.h = androidx.compose.ui.graphics.b.a();
    }

    public static void b(oio oioVar, gte0 gte0Var, Path path, long j, float f, int i) {
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (4294967295L & j);
        float intBitsToFloat2 = Float.intBitsToFloat(i3);
        float f2 = -Float.intBitsToFloat(i2);
        float f3 = -Float.intBitsToFloat(i3);
        oioVar.a0().a.d(intBitsToFloat, intBitsToFloat2, f2, f3);
        try {
            path.reset();
            float f4 = -f;
            path.s(new zhf0(f4, f4, f, f), i * 90.0f, 90.0f);
            path.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.close();
            oio.u1(oioVar, path, gte0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 60);
        } finally {
            oioVar.a0().a.d(-intBitsToFloat, -intBitsToFloat2, -f2, -f3);
        }
    }

    public static void c(oio oioVar, y7z y7zVar, RectF rectF, float f, float f2, int i) {
        if (((int) rectF.left) >= ((int) rectF.right) || ((int) rectF.top) >= ((int) rectF.bottom)) {
            return;
        }
        er9.b a0 = oioVar.a0();
        long d = a0.d();
        a0.a().e();
        try {
            fr9 fr9Var = a0.a;
            fr9Var.d(f, f2, -f, -f2);
            fr9Var.h(i * 90.0f, 0L);
            float width = rectF.width();
            float height = rectF.height();
            oio.x1(oioVar, y7zVar, 0L, (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        } finally {
            nq.b(a0, d);
        }
    }

    public final GradientParams a() {
        float d = d();
        float[] fArr = this.c.g.d;
        ArrayList arrayList = new ArrayList(fArr.length);
        int i = 0;
        for (float f : fArr) {
            arrayList.add(Float.valueOf(((this.b - d) + ((this.c.d + d) * f)) / e()));
        }
        List<GradientPointAndColorMultiplier> list = this.c.g.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            GradientPointAndColorMultiplier gradientPointAndColorMultiplier = (GradientPointAndColorMultiplier) obj;
            float floatValue = ((Number) arrayList.get(i)).floatValue();
            float f2 = gradientPointAndColorMultiplier.c;
            gradientPointAndColorMultiplier.getClass();
            arrayList2.add(new GradientPointAndColorMultiplier(floatValue, f2));
            i = i2;
        }
        return new GradientParams(arrayList2);
    }

    public final float d() {
        return this.c.d / 2;
    }

    public final float e() {
        return this.b + this.c.d;
    }

    public final int f() {
        return ((Number) this.c.h.getValue()).intValue();
    }
}
