package xsna;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import com.unity3d.services.UnityAdsConstants;
import xsna.wlp0;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class w5p0 implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
    public final /* synthetic */ wlp0<Boolean> b;

    public w5p0(wlp0<Boolean> wlp0Var) {
        this.b = wlp0Var;
    }

    @Override // xsna.yzs
    public final q630 invoke(q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        aVar2.K(-1498516085);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1498516085, intValue, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:1268)");
        }
        phr a = lb30.a(MotionSchemeKeyTokens.FastSpatial, aVar2);
        phr a2 = lb30.a(MotionSchemeKeyTokens.FastEffects, aVar2);
        jtp0 jtp0Var = rte0.e;
        wlp0<Boolean> wlp0Var = this.b;
        z46 z46Var = wlp0Var.a;
        wh50 wh50Var = wlp0Var.d;
        boolean booleanValue = ((Boolean) z46Var.B()).booleanValue();
        aVar2.K(-1553362193);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
        }
        float f = booleanValue ? 1.0f : 0.8f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        Float valueOf = Float.valueOf(f);
        zak0 zak0Var = (zak0) wh50Var;
        boolean booleanValue2 = ((Boolean) zak0Var.getValue()).booleanValue();
        aVar2.K(-1553362193);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1275)");
        }
        float f2 = booleanValue2 ? 1.0f : 0.8f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        Float valueOf2 = Float.valueOf(f2);
        wlp0Var.e();
        aVar2.K(386845748);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(386845748, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1272)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        wlp0.d c = ump0.c(wlp0Var, valueOf, valueOf2, a, jtp0Var, aVar2, 196608);
        boolean booleanValue3 = ((Boolean) wlp0Var.a.B()).booleanValue();
        aVar2.K(2073045083);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
        }
        float f3 = booleanValue3 ? 1.0f : 0.0f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        Float valueOf3 = Float.valueOf(f3);
        boolean booleanValue4 = ((Boolean) zak0Var.getValue()).booleanValue();
        aVar2.K(2073045083);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1283)");
        }
        float f4 = booleanValue4 ? 1.0f : 0.0f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        Float valueOf4 = Float.valueOf(f4);
        wlp0Var.e();
        aVar2.K(-281714272);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-281714272, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1280)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        q630 b = rdu.b(q630Var2, ((Number) c.getValue()).floatValue(), ((Number) c.getValue()).floatValue(), ((Number) ump0.c(wlp0Var, valueOf3, valueOf4, a2, jtp0Var, aVar2, 196608).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 131064);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return b;
    }
}
