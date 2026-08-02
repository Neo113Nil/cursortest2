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
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.fm70;
import xsna.q630;

/* compiled from: NpsView.kt */
/* loaded from: classes17.dex */
public final class fm70 extends rpo0 {
    public static final float n = 12;
    public final wh50 m;

    /* compiled from: NpsView.kt */
    public interface a {

        /* compiled from: NpsView.kt */
        /* renamed from: xsna.fm70$a$a, reason: collision with other inner class name */
        public static final class C2883a implements a {
            public final boolean a;

            public C2883a(boolean z) {
                this.a = z;
            }

            @Override // xsna.fm70.a
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2883a) && this.a == ((C2883a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Hidden(animated="), this.a, ')');
            }
        }

        /* compiled from: NpsView.kt */
        public static final class b implements a {
            public final boolean a;
            public final String b;
            public final ArrayList c;
            public final izs<Integer, s3q0> d;

            public b(boolean z, String str, ArrayList arrayList, izs izsVar) {
                this.a = z;
                this.b = str;
                this.c = arrayList;
                this.d = izsVar;
            }

            @Override // xsna.fm70.a
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + qr.a(this.c, urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Question(animated=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", answers=");
                kr.d(this.c, sb, ", onAnswerClick=");
                return up.c(sb, this.d, ')');
            }
        }

        /* compiled from: NpsView.kt */
        public static final class c implements a {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            @Override // xsna.fm70.a
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

    public fm70(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(new a.C2883a(false));
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(645868182);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(645868182, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsView.ThemedContent (NpsView.kt:52)");
            }
            long c = l5g.c(14, l5g.b, 0.45f);
            float f = n;
            q630 m = hr80.m(q630.a.a, c, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.o0(28);
                M.R(x);
            }
            q630 c2 = ojc.c(m, false, null, null, (gzs) x, 14);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, c2);
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
            k9q0.w(M, c3, cri.a.d);
            a state = getState();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d0k(17);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new gvs(16);
                M.R(x3);
            }
            xh2.a(state, null, izsVar, null, "NpsViewAnimation", (izs) x3, kai.c(602139720, new zzs() { // from class: xsna.dm70
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    fm70.a aVar3 = (fm70.a) obj2;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(602139720, intValue, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsView.ThemedContent.<anonymous>.<anonymous> (NpsView.kt:76)");
                    }
                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                    sy90 D2 = aVar4.D();
                    q630 c4 = qri.c(aVar4, f2);
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
                    k9q0.w(aVar4, d2, cri.a.f);
                    k9q0.w(aVar4, D2, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c4, cri.a.d);
                    if (aVar3 instanceof fm70.a.C2883a) {
                        aVar4.K(-824421570);
                        aVar4.j();
                    } else {
                        boolean z = aVar3 instanceof fm70.a.b;
                        fm70 fm70Var = fm70.this;
                        if (z) {
                            aVar4.K(250501975);
                            fm70Var.B((fm70.a.b) aVar3, aVar4, 64);
                            aVar4.j();
                        } else {
                            if (!(aVar3 instanceof fm70.a.c)) {
                                throw alb0.c(250498577, aVar4);
                            }
                            aVar4.K(250504042);
                            fm70Var.C(8, aVar4);
                            aVar4.j();
                        }
                    }
                    aVar4.G();
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
            s.d = new k87(this, i, 9);
        }
    }

    public final void B(a.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var;
        a.b bVar2 = bVar;
        androidx.compose.runtime.a M = aVar.M(-901059820);
        int i2 = i | (M.J(bVar2) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-901059820, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsView.Question (NpsView.kt:88)");
            }
            q630.a aVar3 = q630.a.a;
            q630 D = s200.D(aVar3, 16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(12), dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, aVar3);
            String str = bVar2.b;
            ArrayList arrayList = bVar2.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                q630Var = F;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                q630Var = F;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar5 = aVar3;
            ArrayList arrayList2 = arrayList;
            yqv0.c(str, q630Var, ylu0Var.getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            androidx.compose.runtime.a aVar6 = M;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(8), dt1.a.k, aVar6, 6);
            int hashCode2 = Long.hashCode(n34.n(aVar6));
            sy90 D3 = aVar6.D();
            q630 c2 = qri.c(aVar6, aVar5);
            if (aVar6.N() == null) {
                n34.r();
                throw null;
            }
            aVar6.H();
            if (aVar6.L()) {
                aVar6.I(aVar4);
            } else {
                aVar6.f();
            }
            k9q0.w(aVar6, a3, cVar);
            k9q0.w(aVar6, D3, eVar);
            ur.d(hashCode2, aVar6, bVar3, aVar6, c2678a);
            k9q0.w(aVar6, c2, dVar);
            aVar6.K(-188677656);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                q630 E = ahn.E(aVar5, "questionnaryButton");
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 d = defpackage.j0.d(1.0f, E, true);
                ArrayList arrayList3 = arrayList2;
                String str2 = (String) arrayList3.get(i3);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                boolean o = ((i2 & 14) == 4) | aVar6.o(i3);
                Object x = aVar6.x();
                if (o || x == a.C0011a.a) {
                    x = new em70(bVar, i3, 0);
                    aVar6.R(x);
                }
                androidx.compose.runtime.a aVar7 = aVar6;
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, d, null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar7, X2.b.f, 0, 0, 4190176);
                i3++;
                aVar6 = aVar7;
                arrayList2 = arrayList3;
                aVar5 = aVar5;
            }
            bVar2 = bVar;
            aVar2 = aVar6;
            aVar2.j();
            aVar2.G();
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
            s.d = new h0k(this, bVar2, i, 3);
        }
    }

    public final void C(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1464965187);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1464965187, i, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsView.Thanks (NpsView.kt:122)");
            }
            q630 f = txj0.f(s200.E(q630.a.a, 16, 26), 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(4), dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            yqv0.c(d370.N(R.string.clips_inline_nps_thanks_title, 0, M), null, wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).O, aVar2, 0, 0, 8122);
            yqv0.c(d370.N(R.string.clips_inline_nps_thanks_subtitle, 0, aVar2), null, wlb0.h(aVar2).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).Y, aVar2, 0, 0, 8122);
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
            s.d = new nx7(this, i, 8);
        }
    }

    public final a getState() {
        return (a) ((zak0) this.m).getValue();
    }

    public final void setState(a aVar) {
        ((zak0) this.m).setValue(aVar);
    }

    @Override // xsna.rpo0
    public final void z(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(647197392);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(647197392, i2, -1, "com.vk.clips.viewer.impl.feed.item.view.nps.NpsView.Theme (NpsView.kt:44)");
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
            s.d = new sag(this, jaiVar2, i, 5);
        }
    }
}
