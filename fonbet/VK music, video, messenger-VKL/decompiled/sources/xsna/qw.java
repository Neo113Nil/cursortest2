package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ry;
import xsna.tlo0;
import xsna.tt9;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qw implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qw(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.b) {
            case 0:
                ry ryVar = (ry) this.c;
                kx kxVar = (kx) this.d;
                izs izsVar = (izs) this.e;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(s890Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1250589161, intValue, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (ActionButtonsContentView.kt:86)");
                    }
                    if (ryVar instanceof ry.b) {
                        aVar.K(1755487556);
                        kxVar.j((ry.b) ryVar, izsVar, s200.C(q630.a.a, s890Var), aVar, 4096);
                        aVar.j();
                    } else {
                        if (!(ryVar instanceof ry.a)) {
                            throw alb0.c(-774657788, aVar);
                        }
                        aVar.K(-774645747);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                tt9.b.C3771b c3771b = (tt9.b.C3771b) this.c;
                azl azlVar = (azl) this.d;
                wh50 wh50Var = (wh50) this.e;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(va8Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(54525263, intValue2, -1, "com.vk.clips.design.compose.profile.UserNameAndIcons.<anonymous> (ProfileCard.kt:338)");
                    }
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    a.c cVar = androidx.compose.foundation.layout.a.e;
                    q630.a aVar3 = q630.a.a;
                    q630 f = txj0.f(aVar3, 1.0f);
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, bVar, aVar2, 54);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.i.a(0);
                        aVar2.R(x);
                    }
                    rg50 rg50Var = (rg50) x;
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.k.b(new pco(va8Var.j()));
                        aVar2.R(x2);
                    }
                    wh50 wh50Var2 = (wh50) x2;
                    Integer valueOf = Integer.valueOf(rg50Var.getIntValue());
                    boolean z = (intValue2 & 14) == 4;
                    Object x3 = aVar2.x();
                    if (z || x3 == c0012a) {
                        x3 = new mud0(va8Var, rg50Var, wh50Var2, null);
                        aVar2.R(x3);
                    }
                    bap.g(valueOf, (wzs) x3, aVar2, 0);
                    tt9.b.C3771b.C3774b c3774b = c3771b.a;
                    tlo0.h hVar = c3774b.a;
                    Context context = (Context) aVar2.r(AndroidCompositionLocals_androidKt.b);
                    hVar.getClass();
                    CharSequence a2 = tlo0.b.a(hVar, context);
                    if (a2 == null || (str = a2.toString()) == null) {
                        str = "";
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    q630 x4 = txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) wh50Var2.getValue()).b, 1, aVar3);
                    aVar2.K(-1017983051);
                    Object x5 = aVar2.x();
                    if (x5 == c0012a) {
                        x5 = new iud0(0);
                        aVar2.R(x5);
                    }
                    aVar2.j();
                    q630 b = com.vk.core.compose.component.semantics.b.b(ojc.c(x4, false, null, null, (gzs) x5, 14), c3774b.b);
                    boolean J = aVar2.J(azlVar);
                    Object x6 = aVar2.x();
                    if (J || x6 == c0012a) {
                        x6 = new sh3(27, azlVar, wh50Var);
                        aVar2.R(x6);
                    }
                    yqv0.c(str, b, j, null, null, 0, 3, null, 2, false, 0, 1, (izs) x6, frv0Var, aVar2, 100663296, 48, 1720);
                    tt9.b.C3771b.a aVar5 = c3771b.b;
                    Object x7 = aVar2.x();
                    if (x7 == c0012a) {
                        x7 = new f410(rg50Var, 27);
                        aVar2.R(x7);
                    }
                    nud0.g(aVar5, (izs) x7, txj0.B(aVar3, null, 3), aVar2, Tensorflow.FRAME_WIDTH);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
