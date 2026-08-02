package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.me70;
import xsna.q630;
import xsna.wpc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zw5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar;
        com.vk.core.compose.component.semantics.a aVar2;
        int i = this.b;
        q630.a aVar3 = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cx5.a(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj4, (q630) obj3);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                rs7.b((et7) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ex7 ex7Var = (ex7) obj4;
                wh50 wh50Var = ex7Var.a;
                Context context = (Context) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(3531562, intValue, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesBottomBarImpl.Content.<anonymous> (BookingServicesBottomBar.kt:94)");
                    }
                    q630 q630Var = ex7Var.f;
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, q630Var);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar4, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar4, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar4, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar4, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar4, c, dVar);
                    if (((Boolean) ((zak0) ex7Var.d).getValue()).booleanValue()) {
                        aVar4.K(946222533);
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar4, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, aVar3);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a2, cVar);
                        k9q0.w(aVar4, D2, eVar);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar);
                        aVar2 = null;
                        yqv0.c(d370.F(R.plurals.booking_service_count_plurals, ((BookingServicesScreenState.e) ((zak0) wh50Var).getValue()).a, new Object[]{Integer.valueOf(((BookingServicesScreenState.e) ((zak0) wh50Var).getValue()).a)}, aVar4, 0), ahn.E(aVar3, "service_footer_count"), wlb0.h(aVar4).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar4).e0, aVar4, 48, 0, 8184);
                        aVar = aVar4;
                        f9t.e(ex7Var.g, aVar, 0);
                        yqv0.c(mri0.b(((BookingServicesScreenState.e) ((zak0) wh50Var).getValue()).b, context), ahn.E(aVar3, "service_footer_duration"), wlb0.h(aVar).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).e0, aVar4, 48, 0, 8184);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        f9t.e(new xpy(1.0f, true), aVar, 0);
                        yqv0.c(mri0.c(context, ((BookingServicesScreenState.e) ((zak0) wh50Var).getValue()).c, (String) ((zak0) ex7Var.b).getValue()), ahn.E(aVar3, "service_footer_price"), wlb0.h(aVar).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).g0, aVar, 48, 0, 8184);
                        aVar.G();
                        f9t.e(ex7Var.h, aVar, 0);
                    } else {
                        aVar = aVar4;
                        aVar2 = null;
                        aVar.K(942212962);
                    }
                    aVar.j();
                    q630 E = ahn.E(ex7Var.i.g(new gcv(dt1.a.o)), "cta_button");
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    gio0 a3 = cp8.d.a.a(d370.N(((wak0) ex7Var.e).getIntValue(), 0, aVar), aVar2, aVar, 3072, 6);
                    boolean J = aVar.J(ex7Var);
                    Object x = aVar.x();
                    if (J || x == c0012a) {
                        x = new no(ex7Var, 10);
                        aVar.R(x);
                    }
                    bhu0.d((gzs) x, buttonStyle, buttonAppearance, E, buttonSize, null, null, a3, false, null, aVar, 25008, 3936);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                Throwable th = (Throwable) obj4;
                GoodFragment goodFragment = (GoodFragment) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-725217039, intValue2, -1, "com.vk.ecomm.market.good.GoodFragment.bindErrorView.<anonymous> (GoodFragment.kt:671)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-401966100, new jhq(i2, th, goodFragment), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 4:
                qse0 qse0Var = (qse0) obj4;
                n7u n7uVar = (n7u) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(21108006, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.goodquickmessages.GoodQuickMessagesHolder.onBind.<anonymous> (GoodQuickMessagesHolder.kt:104)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1071611679, new cx(8, qse0Var, n7uVar), aVar7), aVar7, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((co20) obj4).f((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ue70.a((me70.c) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj4;
                final cic0 cic0Var = (cic0) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1994304957, intValue4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.ThemedContent.<anonymous> (PostingOtherStepsContentView.kt:92)");
                    }
                    boolean J2 = aVar8.J(izsVar);
                    Object x2 = aVar8.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new lse(izsVar, 3);
                        aVar8.R(x2);
                    }
                    final izs izsVar2 = (izs) x2;
                    xqi<wpc0<?>> xqiVar = cic0Var.f;
                    int i3 = ComposeView.n;
                    final wpc0 wpc0Var = (wpc0) ((zak0) xqiVar.e).getValue();
                    Object x3 = aVar8.x();
                    if (x3 == c0012a) {
                        x3 = androidx.compose.runtime.i.a(0);
                        aVar8.R(x3);
                    }
                    final rg50 rg50Var = (rg50) x3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar8.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().g;
                    Object x4 = aVar8.x();
                    if (x4 == c0012a) {
                        x4 = new njj(1, rg50Var);
                        aVar8.R(x4);
                    }
                    phv0.b(egi.o(aVar3, (izs) x4), kai.c(1065149530, new er3(cic0Var, izsVar2, 5, wpc0Var), aVar8), kai.c(-389175751, new ip6(cic0Var, wpc0Var, izsVar2, 4), aVar8), null, null, 0, j, 0L, kai.c(-171533265, new yzs() { // from class: xsna.aic0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            s890 s890Var = (s890) obj5;
                            androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj6;
                            int intValue5 = ((Integer) obj7).intValue();
                            if ((intValue5 & 6) == 0) {
                                intValue5 |= aVar9.J(s890Var) ? 4 : 2;
                            }
                            if (aVar9.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-171533265, intValue5, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (PostingOtherStepsContentView.kt:118)");
                                }
                                wpc0 wpc0Var2 = wpc0.this;
                                if (wpc0Var2 instanceof wpc0.a) {
                                    aVar9.K(863694274);
                                    wpc0.a aVar10 = (wpc0.a) wpc0Var2;
                                    int intValue6 = rg50Var.getIntValue();
                                    int i4 = ComposeView.n;
                                    cic0Var.j(aVar10, intValue6, izsVar2, s890Var, aVar9, ((intValue5 << 9) & 7168) | 32768);
                                    aVar9.j();
                                } else {
                                    aVar9.K(-1634698445);
                                    aVar9.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar9.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar8), aVar8, 805306806, 376);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                qjs0.a((btp) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ zw5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
