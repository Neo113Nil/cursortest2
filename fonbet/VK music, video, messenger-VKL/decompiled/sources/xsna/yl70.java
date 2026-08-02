package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yl70;

/* compiled from: NpsOverlay.kt */
/* loaded from: classes17.dex */
public final class yl70 extends rpo0 {
    public static final float n = 12;
    public static final float o;
    public static final float p;
    public final wh50 m;

    /* compiled from: NpsOverlay.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AnswerState(title="), this.a, ')');
        }
    }

    /* compiled from: NpsOverlay.kt */
    public interface b {

        /* compiled from: NpsOverlay.kt */
        public static final class a implements b {
            @Override // xsna.yl70.b
            public final boolean a() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "Hidden(animated=false)";
            }
        }

        /* compiled from: NpsOverlay.kt */
        /* renamed from: xsna.yl70$b$b, reason: collision with other inner class name */
        public static final class C4110b implements b {
            public final boolean a;
            public final String b;
            public final String c;
            public final ArrayList d;
            public final com.vk.voip.ui.menu.feature.a e;
            public final com.vk.movika.sdk.base.logic.interactor.j f;

            public C4110b(boolean z, String str, String str2, ArrayList arrayList, com.vk.voip.ui.menu.feature.a aVar, com.vk.movika.sdk.base.logic.interactor.j jVar) {
                this.a = z;
                this.b = str;
                this.c = str2;
                this.d = arrayList;
                this.e = aVar;
                this.f = jVar;
            }

            @Override // xsna.yl70.b
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4110b)) {
                    return false;
                }
                C4110b c4110b = (C4110b) obj;
                return this.a == c4110b.a && epx.f(this.b, c4110b.b) && epx.f(this.c, c4110b.c) && this.d.equals(c4110b.d) && this.e.equals(c4110b.e) && this.f.equals(c4110b.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + qr.a(this.d, urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Question(animated=");
                sb.append(this.a);
                sb.append(", coverUrl=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", answers=");
                kr.d(this.d, sb, ", onAnswerClick=");
                sb.append(this.e);
                sb.append(", onSkipClick=");
                sb.append(this.f);
                sb.append(')');
                return sb.toString();
            }
        }

        /* compiled from: NpsOverlay.kt */
        public static final class c implements b {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            @Override // xsna.yl70.b
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Thanks(animated="), this.a, ')');
            }
        }

        boolean a();
    }

    static {
        float f = 186;
        o = f;
        p = f * 0.5625f;
    }

    public yl70(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(new b.a());
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1174278596);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1174278596, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsOverlay.ThemedContent (NpsOverlay.kt:61)");
            }
            q630 F = s200.F(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(q630.a.a, l5g.c(14, l5g.b, 0.75f), androidx.compose.ui.graphics.e.a));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ee4(27);
                M.R(x);
            }
            q630 c = ojc.c(F, false, null, null, (gzs) x, 14);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            b state = getState();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new per(19);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new viu(11);
                M.R(x3);
            }
            xh2.a(state, null, izsVar, null, "NpsOverlayContainerAnimation", (izs) x3, kai.c(1999053422, new zzs() { // from class: xsna.xl70
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yl70.b bVar = (yl70.b) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1999053422, intValue, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsOverlay.ThemedContent.<anonymous>.<anonymous> (NpsOverlay.kt:80)");
                    }
                    q630 d2 = txj0.d(q630.a.a, 1.0f);
                    dt1.a.getClass();
                    cp10 d3 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                    sy90 D2 = aVar3.D();
                    q630 c3 = qri.c(aVar3, d2);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d3, cri.a.f);
                    k9q0.w(aVar3, D2, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c3, cri.a.d);
                    if (bVar instanceof yl70.b.a) {
                        aVar3.K(-1084832040);
                        aVar3.j();
                    } else {
                        boolean z = bVar instanceof yl70.b.C4110b;
                        yl70 yl70Var = yl70.this;
                        if (z) {
                            aVar3.K(-34993027);
                            yl70Var.B((yl70.b.C4110b) bVar, aVar3, 518);
                            aVar3.j();
                        } else {
                            if (!(bVar instanceof yl70.b.c)) {
                                throw alb0.c(-34996425, aVar3);
                            }
                            aVar3.K(-34990960);
                            yl70Var.C(70, aVar3);
                            aVar3.j();
                        }
                    }
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1794432, 10);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v95(this, i, 7);
        }
    }

    public final void B(b.C4110b c4110b, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-986422909);
        int i2 = i | (M.J(c4110b) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-986422909, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsOverlay.Question (NpsOverlay.kt:92)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(ra8Var.b(aVar3, ty6Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, 7);
            float f = 12;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            fwu0.c(txj0.s(rte0.d(aVar3, vog0.b(n)), p, o), null, c4110b.b, null, null, null, null, nr2.c, M, 100663296, 250);
            q630 D2 = s200.D(aVar3, f);
            String str = c4110b.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, D2, ylu0Var.getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            androidx.compose.runtime.a aVar5 = M;
            aVar5.K(295476571);
            Iterator it = c4110b.d.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                q630 f2 = txj0.f(aVar3, 1.0f);
                String str2 = ((a) next).a;
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                boolean o2 = ((i2 & 112) == 32) | aVar5.o(i3);
                Object x = aVar5.x();
                if (o2 || x == a.C0011a.a) {
                    x = new prz(c4110b, i3, 1);
                    aVar5.R(x);
                }
                androidx.compose.runtime.a aVar6 = aVar5;
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f2, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190176);
                aVar5 = aVar6;
                i3 = i4;
            }
            aVar5.j();
            aVar5.G();
            dt1.a.getClass();
            aVar2 = aVar5;
            bhu0.e(c4110b.f, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Overlay, s200.H(ra8Var.b(aVar3, dt1.a.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7), null, false, false, null, null, null, d370.N(R.string.clips_inline_nps_overlay_skip, 0, aVar5), null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qm7(this, c4110b, i, 5);
        }
    }

    public final void C(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(243028652);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(243028652, i, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsOverlay.Thanks (NpsOverlay.kt:145)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 b2 = ra8Var.b(aVar3, ty6Var);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            pzu0.b(pg90.a(R.drawable.vk_icon_check_circle_outline_56, 0, M), null, aVar3, wlb0.h(M).getIcon().j, M, 440, 0);
            f9t.e(txj0.h(aVar3, 12), M, 6);
            aVar2 = M;
            yqv0.c(d370.N(R.string.clips_inline_nps_thanks_title, 0, M), null, wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, aVar2, 0, 0, 8122);
            f9t.e(txj0.h(aVar3, 8), aVar2, 6);
            yqv0.c(d370.N(R.string.clips_inline_nps_thanks_subtitle, 0, aVar2), null, wlb0.h(aVar2).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).T, aVar2, 0, 0, 8122);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a86(this, i, 13);
        }
    }

    public final b getState() {
        return (b) ((zak0) this.m).getValue();
    }

    public final void setState(b bVar) {
        ((zak0) this.m).setValue(bVar);
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(401187574);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(401187574, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsOverlay.Theme (NpsOverlay.kt:53)");
            }
            jaiVar2 = jaiVar;
            rrv0.e(true, null, null, null, null, null, jaiVar2, M, ((i2 << 18) & 3670016) | 6, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e8k(this, jaiVar2, i, 2);
        }
    }
}
