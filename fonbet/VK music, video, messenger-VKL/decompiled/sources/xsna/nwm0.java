package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityTopBarContent.kt */
/* loaded from: classes5.dex */
public final class nwm0 extends d.c {
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public nwm0(CommunityProfileViewState.Data.d dVar, boolean z, y89 y89Var, com.vk.core.compose.component.semantics.a aVar) {
        this.d = androidx.compose.runtime.k.b(dVar);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(y89Var);
        this.g = androidx.compose.runtime.k.b(aVar);
    }

    @Override // com.vk.core.compose.component.topbar.d.c
    public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2050727229);
        int i2 = (M.J(mtk0Var) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2050727229, i2, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.SubscribeItemTopBarAfter.Content (CommunityTopBarContent.kt:334)");
            }
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new zo80(7);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 48);
            CommunityProfileViewState.Data.d dVar = (CommunityProfileViewState.Data.d) ((zak0) this.d).getValue();
            Boolean bool = (Boolean) ((zak0) this.e).getValue();
            bool.getClass();
            Pair pair = new Pair(dVar, bool);
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.g).getValue());
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ap30(mtk0Var, 19);
                M.R(x2);
            }
            q630 a = rdu.a(b, (izs) x2);
            dt1.a.getClass();
            xh2.a(pair, a, null, dt1.a.f, null, null, kai.c(1036205552, new zzs() { // from class: xsna.lwm0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Pair pair2 = (Pair) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1036205552, intValue, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.SubscribeItemTopBarAfter.Content.<anonymous> (CommunityTopBarContent.kt:346)");
                    }
                    CommunityProfileViewState.Data.d dVar2 = (CommunityProfileViewState.Data.d) pair2.d();
                    if (!((Boolean) pair2.g()).booleanValue()) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    boolean z2 = dVar2 instanceof CommunityProfileViewState.Data.d.b;
                    q630 q630Var = q630.a.a;
                    wh50 wh50Var2 = wh50.this;
                    nwm0 nwm0Var = this;
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (z2) {
                        aVar2.K(1669854361);
                        ButtonSize buttonSize = ButtonSize.Medium;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                        q630 E = ahn.E(q630Var, "community_top_bar_subscription_subscribe_button");
                        boolean J = aVar2.J(wh50Var2);
                        Object x3 = aVar2.x();
                        if (J || x3 == c0012a2) {
                            x3 = new x26(2, wh50Var2);
                            aVar2.R(x3);
                        }
                        q630 z3 = sv1.z(E, (izs) x3);
                        String N = d370.N(R.string.join_group_short, 0, aVar2);
                        boolean J2 = aVar2.J(nwm0Var);
                        Object x4 = aVar2.x();
                        if (J2 || x4 == c0012a2) {
                            x4 = new mwm0(nwm0Var, 0);
                            aVar2.R(x4);
                        }
                        bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, z3, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
                        aVar2.j();
                    } else if (dVar2 instanceof CommunityProfileViewState.Data.d.c) {
                        aVar2.K(1670873951);
                        ButtonSize buttonSize2 = ButtonSize.Medium;
                        ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
                        ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
                        q630 E2 = ahn.E(q630Var, "community_top_bar_subscription_leave_button");
                        boolean J3 = aVar2.J(wh50Var2);
                        Object x5 = aVar2.x();
                        if (J3 || x5 == c0012a2) {
                            x5 = new z26(3, wh50Var2);
                            aVar2.R(x5);
                        }
                        q630 z4 = sv1.z(E2, (izs) x5);
                        String N2 = d370.N(R.string.community_profile_toolbar_you_are_joined, 0, aVar2);
                        boolean J4 = aVar2.J(nwm0Var);
                        Object x6 = aVar2.x();
                        if (J4 || x6 == c0012a2) {
                            x6 = new jw30(nwm0Var, 29);
                            aVar2.R(x6);
                        }
                        bhu0.e((gzs) x6, buttonSize2, buttonStyle2, buttonAppearance2, z4, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
                        aVar2.j();
                    } else if (dVar2 instanceof CommunityProfileViewState.Data.d.C1627d) {
                        aVar2.K(1671753204);
                        aVar2.K(-638806280);
                        if (((Number) wh50Var2.getValue()).intValue() != 0) {
                            q630Var = txj0.v(q630Var, ((azl) aVar2.r(uvi.h)).j1(((Number) wh50Var2.getValue()).intValue()));
                        }
                        aVar2.j();
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, q630Var);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        zfr0.e(null, 0L, SpinnerSize.Size16, aVar2, 384, 3);
                        aVar2.G();
                        aVar2.j();
                    } else {
                        aVar2.K(1672330672);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1575936, 52);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p9(this, mtk0Var, i, 9);
        }
    }
}
