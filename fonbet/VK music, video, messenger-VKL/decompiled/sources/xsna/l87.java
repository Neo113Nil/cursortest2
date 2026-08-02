package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class l87 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ l87(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(742258990, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupView.MainScreen.<anonymous> (BiometricsLockSecuritySetupView.kt:69)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().g;
                    e.a aVar2 = androidx.compose.ui.graphics.e.a;
                    q630.a aVar3 = q630.a.a;
                    q630 m = hr80.m(aVar3, j, aVar2);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar4);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String N = d370.N(R.string.bl_security_suggestion_placeholder_title, 0, aVar);
                    String N2 = d370.N(R.string.bl_security_suggestion_placeholder_subtitle, 0, aVar);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    a87.a(N, N2, s200.E(new xpy(1.0f, true), 32, 48), wwf0.b, aVar, 3072, 0);
                    float f = 16;
                    q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
                    ButtonSize buttonSize = ButtonSize.Large;
                    String N3 = d370.N(R.string.bl_turn_on, 0, aVar);
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new o87(izsVar, 0);
                        aVar.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, F, null, false, false, null, null, null, N3, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
                    f9t.e(txj0.h(aVar3, 8), aVar, 6);
                    q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
                    String N4 = d370.N(R.string.bl_skip, 0, aVar);
                    ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new j87(izsVar, 0);
                        aVar.R(x2);
                    }
                    bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, F2, null, false, false, null, null, null, N4, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
                    if (xga0.c(aVar3, 12, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                this.c.invoke(new ov70(((xlb0) obj2).c));
                return s3q0.a;
        }
    }
}
