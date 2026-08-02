package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import java.util.List;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rd00 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rd00(int i, Object obj, xzs xzsVar) {
        this.b = i;
        this.d = obj;
        this.c = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s3q0 loadHandsQueue$lambda$0;
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1496420577, intValue, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.MainContent.<anonymous>.<anonymous>.<anonymous> (MainContent.kt:70)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new l1e(izsVar, 2);
                        aVar.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new me1(izsVar, 4);
                        aVar.R(x2);
                    }
                    fe00.d(0, aVar, str, (gzs) x2, izsVar2, null);
                    f9t.e(txj0.h(aVar2, 8), aVar, 6);
                    q630 f = txj0.f(aVar2, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    jqu0.a(f, ylu0Var.p().c, (float) 0.33d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 390, 8);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                vsd0 vsd0Var = (vsd0) this.d;
                izs izsVar3 = (izs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1146233769, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ProductsManagementConfirmationModal.<anonymous>.<anonymous> (ProductManagementConfirmationModal.kt:57)");
                    }
                    q630.a aVar5 = q630.a.a;
                    q630 f2 = txj0.f(aVar5, 1.0f);
                    float f3 = kqu0.b;
                    q630 G = s200.G(f2, f3, kqu0.x, f3, kqu0.r);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar4, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                    sy90 D2 = aVar4.D();
                    q630 c2 = qri.c(aVar4, G);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a2, cri.a.f);
                    k9q0.w(aVar4, D2, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c2, cri.a.d);
                    yqv0.c(vsd0Var.a, null, wlb0.h(aVar4).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).z, aVar4, 0, 0, 8122);
                    f9t.e(txj0.q(aVar5, kqu0.t), aVar4, 0);
                    yqv0.c(vsd0Var.b, null, wlb0.h(aVar4).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).i0, aVar4, 0, 0, 8122);
                    androidx.compose.runtime.a aVar7 = aVar4;
                    f9t.e(txj0.q(aVar5, 32), aVar7, 6);
                    aVar7.K(-509236375);
                    for (usd0 usd0Var : j5g.H0(vsd0Var.c, 2)) {
                        q630 f4 = txj0.f(aVar5, 1.0f);
                        String str2 = usd0Var.a;
                        ButtonSize buttonSize = ButtonSize.Large;
                        ButtonStyle buttonStyle = usd0Var.b ? ButtonStyle.Primary : ButtonStyle.Secondary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        boolean J3 = aVar7.J(izsVar3) | aVar7.J(usd0Var);
                        Object x3 = aVar7.x();
                        if (J3 || x3 == a.C0011a.a) {
                            x3 = new ig1(28, izsVar3, usd0Var);
                            aVar7.R(x3);
                        }
                        androidx.compose.runtime.a aVar8 = aVar7;
                        bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, f4, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar8, 27696, 0, 0, 4190176);
                        aVar7 = aVar8;
                        f9t.e(txj0.q(aVar5, kqu0.v), aVar7, 0);
                    }
                    if (gp.d(aVar7)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                loadHandsQueue$lambda$0 = StereoRoomHandsQueueImpl.loadHandsQueue$lambda$0((StereoRoomHandsQueueImpl) this.d, (gzs) this.c, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                return loadHandsQueue$lambda$0;
        }
    }
}
