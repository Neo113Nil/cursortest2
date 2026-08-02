package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.c8d;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;

/* compiled from: VideoClipCardScreenContent.kt */
/* loaded from: classes18.dex */
public final class hbs0 implements yah0 {

    /* compiled from: VideoClipCardScreenContent.kt */
    public interface a {

        /* compiled from: VideoClipCardScreenContent.kt */
        /* renamed from: xsna.hbs0$a$a, reason: collision with other inner class name */
        public static final class C2985a implements a {
            public final nmc a;

            public C2985a(nmc nmcVar) {
                this.a = nmcVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2985a) && epx.f(this.a, ((C2985a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Card(card=" + this.a + ')';
            }
        }

        /* compiled from: VideoClipCardScreenContent.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Subhead(text="), this.a, ')');
            }
        }
    }

    public static PreviewViewState.h c() {
        return new PreviewViewState.h(new c8d(oq.d(tlo0.Companion, "Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), new c8d.a(new tlo0.h("VK Видео")), new c8d.c(new tlo0.h("2,8К"), new tlo0.h("3 часа назад"))));
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2131509715);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2131509715, i2, -1, "com.vk.design.demo.presentation.screens.VideoClipCardScreenContent.Content (VideoClipCardScreenContent.kt:40)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            jjn0.a("Clip Card", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, false, M, 438, 0);
            q630 f = txj0.f(q9g.a(aVar2, 1.0f), 1.0f);
            float f2 = 16;
            u890 u890Var = new u890(f2, f2, f2, f2);
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            boolean z = (458752 & i2) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mga0(this, 29);
                M.R(x);
            }
            lqy.a(f, null, u890Var, g, null, null, false, null, (izs) x, M, 24960, 490);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9t(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1746411522);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1746411522, i2, -1, "com.vk.design.demo.presentation.screens.VideoClipCardScreenContent.Item (VideoClipCardScreenContent.kt:69)");
            }
            if (aVar instanceof a.b) {
                M.K(1888300525);
                String str = ((a.b) aVar).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str, s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, M, 48, 0, 8184);
                aVar3 = M;
                aVar3.j();
            } else {
                aVar3 = M;
                if (!(aVar instanceof a.C2985a)) {
                    throw alb0.c(1030742855, aVar3);
                }
                aVar3.K(1888603085);
                mmc.a(((a.C2985a) aVar).a, null, aVar3, 0, 2);
                aVar3.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new yku(this, aVar, i, 9);
        }
    }
}
