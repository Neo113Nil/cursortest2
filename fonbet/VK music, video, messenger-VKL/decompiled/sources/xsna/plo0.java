package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.us2;

/* compiled from: TextScreenContent.kt */
/* loaded from: classes18.dex */
public final class plo0 implements yah0, w8i {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        plo0 plo0Var = this;
        androidx.compose.runtime.a M = aVar.M(1536786537);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
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
            i2 |= M.J(plo0Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73859 & i2) != 73858)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1536786537, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.Content (TextScreenContent.kt:621)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Text", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            M.K(1296407063);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(d.c.C0760d.a.a(q, null, x5Var, null, null, null, M, 1572872 | (i2 & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            q630 f2 = txj0.f(p490.D(aVar2, p490.x(M), 14), 1.0f);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new nfr(2, wh50Var);
                M.R(x2);
            }
            zov0.b(booleanValue, "Включить fade эффект", (izs) x2, null, null, false, false, M, Tensorflow.FRAME_WIDTH, 120);
            M = M;
            int i4 = 14 & (i2 >> 15);
            plo0Var = this;
            plo0Var.p(i4, M);
            plo0Var.q(i4, M);
            int i5 = (i2 >> 12) & 112;
            plo0Var.d(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.c(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.b(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.e(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.f(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.h(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.g(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.l(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.k(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.n(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.m(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.i(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.j(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            plo0Var.o(((Boolean) wh50Var.getValue()).booleanValue(), M, i5);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q36(plo0Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1761492723);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1761492723, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeAlwaysFadeSection (TextScreenContent.kt:158)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose, always fade):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            us2 a2 = ws2.a(str, M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ntu0.c(a2, F2, frv0Var, ylu0Var.getText().m, 2, true, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 221232, 0, 8064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.elo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.b(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(512578654);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(512578654, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeLongSection (TextScreenContent.kt:129)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = "This is a very long text that will be faded at the bottom when it exceeds the maximum number of lines. The fade effect helps users understand that there is more content that is not visible. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
                M.R("This is a very long text that will be faded at the bottom when it exceeds the maximum number of lines. The fade effect helps users understand that there is more content that is not visible. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose, long text):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            us2 a2 = ws2.a(str, M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ntu0.c(a2, F2, frv0Var, ylu0Var.getText().m, 3, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dlo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.c(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1179527224);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1179527224, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeShortSection (TextScreenContent.kt:102)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 36), M, 6);
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            us2 a2 = ws2.a("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!", M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ntu0.c(a2, F2, frv0Var, ylu0Var.getText().m, 1, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yko0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.d(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2116355500);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2116355500, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeSpanSection (TextScreenContent.kt:190)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            long j = wlb0.h(M).getText().p;
            long j2 = wlb0.h(M).getText().m;
            boolean z2 = (i2 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                us2.b bVar = new us2.b();
                int m = bVar.m(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    bVar.g("Вы: ");
                    s3q0 s3q0Var = s3q0.a;
                    bVar.k(m);
                    m = bVar.m(new hik0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        bVar.g("Это очень длинное сообщение которое должно быть обрезано фейдом при достижении лимита количества строк. Здесь много текста для проверки работы фейда с реальными спанами.");
                        bVar.k(m);
                        x = bVar.n();
                        M.R(x);
                    } finally {
                    }
                } finally {
                }
            }
            us2 us2Var = (us2) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose, with spans):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            ntu0.c(us2Var, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), wlb0.l(M).d0, wlb0.h(M).getText().m, 3, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.alo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.e(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void f(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-213779224);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-213779224, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeSpanSingleLineSection (TextScreenContent.kt:229)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            long j = wlb0.h(M).getText().p;
            long j2 = wlb0.h(M).getText().m;
            boolean z2 = (i2 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                us2.b bVar = new us2.b();
                int m = bVar.m(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    bVar.g("Вы: ");
                    s3q0 s3q0Var = s3q0.a;
                    bVar.k(m);
                    m = bVar.m(new hik0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        bVar.g("Это очень длинное сообщение которое должно быть обрезано фейдом на одной строке.");
                        bVar.k(m);
                        x = bVar.n();
                        M.R(x);
                    } finally {
                    }
                } finally {
                }
            }
            us2 us2Var = (us2) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose, spans, 1 line):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            ntu0.c(us2Var, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), wlb0.l(M).d0, wlb0.h(M).getText().m, 1, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wko0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.f(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void g(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1518577772);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1518577772, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextComposeTransparentBackgroundSection (TextScreenContent.kt:465)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            yqv0.c("FadeText (Compose, transparent bg):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            q630 f2 = txj0.f(aVar2, 1.0f);
            long j = l5g.e;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(f2, j, aVar4));
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            us2 a3 = ws2.a(str, M, 6);
            q630 m = hr80.m(txj0.f(aVar2, 1.0f), l5g.j, aVar4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ntu0.c(a3, m, frv0Var, ylu0Var.getText().m, 1, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hlo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.g(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void h(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1346600699);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1346600699, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextLargeFontSizeSection (TextScreenContent.kt:546)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 24), M, 6);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan Boys squad!";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan Boys squad!");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (Compose, large font):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M = M;
            M.G();
            f9t.e(txj0.h(aVar2, 8), M, 6);
            us2 a2 = ws2.a(str, M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ntu0.c(a2, F2, frv0Var, ylu0Var.getText().m, 1, false, z, false, null, 0, null, 0, null, M, ((i2 << 18) & 3670016) | 24624, 0, 8096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xko0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.h(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1564003282);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1564003282, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewAlwaysFadeSection (TextScreenContent.kt:391)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (View, always fade):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                z2 = z;
                x2 = new j4l0(z2, 1);
                M.R(x2);
            } else {
                z2 = z;
            }
            izs izsVar = (izs) x2;
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new zhw(str, z2, 2);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new dc1(i, 2, this, z2);
        }
    }

    public final void j(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1741895446);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1741895446, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewLargeFontSizeSection (TextScreenContent.kt:575)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan Boys squad!";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan Boys squad!");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (View, large font):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                z2 = z;
                x2 = new izs() { // from class: xsna.llo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                        vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                        vkFadeText.setTextAppearance(R.style.VkUiTypography_Headline1Medium);
                        vkFadeText.setMaxTextLines(1);
                        vkFadeText.setTextAlignment(2);
                        vkFadeText.setFade(z2);
                        return vkFadeText;
                    }
                };
                M.R(x2);
            } else {
                z2 = z;
            }
            izs izsVar = (izs) x2;
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new vqn0(str, z2, 1);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mlo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.j(z2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2074866751);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2074866751, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewLongSection (TextScreenContent.kt:268)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = "This is a very long text that will be faded at the bottom when it exceeds the maximum number of lines. The fade effect helps users understand that there is more content that is not visible. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
                M.R("This is a very long text that will be faded at the bottom when it exceeds the maximum number of lines. The fade effect helps users understand that there is more content that is not visible. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
            }
            String str = (String) x;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (View, long text):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                z2 = z;
                x2 = new izs() { // from class: xsna.nlo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                        vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                        vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                        vkFadeText.setMaxTextLines(3);
                        vkFadeText.setTextAlignment(2);
                        vkFadeText.setFade(z2);
                        return vkFadeText;
                    }
                };
                M.R(x2);
            } else {
                z2 = z;
            }
            izs izsVar = (izs) x2;
            boolean z4 = i3 == 4;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new mu0(str, z2, 5);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.olo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.k(z2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void l(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(6763527);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(6763527, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewShortSection (TextScreenContent.kt:430)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c("FadeText (View):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new izs() { // from class: xsna.ilo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                        vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                        vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                        vkFadeText.setMaxTextLines(1);
                        vkFadeText.setTextAlignment(2);
                        vkFadeText.setFade(z);
                        return vkFadeText;
                    }
                };
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.jlo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkFadeText vkFadeText = (VkFadeText) obj;
                        vkFadeText.setText("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!");
                        vkFadeText.setFade(z);
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            ae2.a(48, 0, M, izsVar, (izs) x2, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.klo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.l(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void m(boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-616323699);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-616323699, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewSpanSection (TextScreenContent.kt:348)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                abg0 abg0Var = dhr0.t;
                abg0Var.c(R.attr.vk_ui_text_primary);
                int c = abg0Var.c(R.attr.vk_ui_text_secondary);
                spannableStringBuilder.append((CharSequence) "Вы: ");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(c), 0, 4, 33);
                spannableStringBuilder.append((CharSequence) "Это очень длинное сообщение которое должно быть обрезано фейдом при достижении лимита количества строк. Здесь много текста для проверки работы фейда с реальными спанами.");
                M.R(spannableStringBuilder);
                obj = spannableStringBuilder;
            }
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) obj;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            yqv0.c("FadeText (View, with spans):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                z2 = z;
                x2 = new kom(z2, 1);
                M.R(x2);
            } else {
                z2 = z;
            }
            izs izsVar = (izs) x2;
            boolean y = M.y(spannableStringBuilder2) | (i3 == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new lom(spannableStringBuilder2, z2, 1);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new q7b0(this, z2, i);
        }
    }

    public final void n(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-353962103);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-353962103, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewSpanSingleLineSection (TextScreenContent.kt:305)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                abg0 abg0Var = dhr0.t;
                abg0Var.c(R.attr.vk_ui_text_primary);
                int c = abg0Var.c(R.attr.vk_ui_text_secondary);
                spannableStringBuilder.append((CharSequence) "Вы: ");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(c), 0, 4, 33);
                spannableStringBuilder.append((CharSequence) "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan");
                M.R(spannableStringBuilder);
                obj = spannableStringBuilder;
            }
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) obj;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            yqv0.c("FadeText (View, spans, 1 line):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                z2 = z;
                x2 = new izs() { // from class: xsna.blo0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        VkFadeText vkFadeText = new VkFadeText((Context) obj2, null, 6, 0);
                        vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                        vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                        vkFadeText.setMaxTextLines(1);
                        vkFadeText.setTextAlignment(2);
                        vkFadeText.setFade(z2);
                        return vkFadeText;
                    }
                };
                M.R(x2);
            } else {
                z2 = z;
            }
            izs izsVar = (izs) x2;
            boolean y = M.y(spannableStringBuilder2) | (i3 == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new l99(spannableStringBuilder2, z2, 1);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, F2);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.clo0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int I = ne7.I(i | 1);
                    plo0.this.n(z2, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        boolean z3;
        Object x;
        androidx.compose.runtime.a M = aVar.M(2093917867);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2093917867, i2, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.FadeTextViewTransparentBackgroundSection (TextScreenContent.kt:501)");
            }
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 24), M, 6);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x2 == c0012a2) {
                x2 = "BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!";
                M.R("BTS RM, Jin, Suga, J-Hope, Jimin, V, Jungkook! This is BTS or Bangtan!");
            }
            String str = (String) x2;
            float f = 16;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2;
            yqv0.c("FadeText (View, transparent bg):", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(txj0.f(aVar3, 1.0f), l5g.e, androidx.compose.ui.graphics.e.a));
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f2 = txj0.f(aVar3, 1.0f);
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object x3 = M.x();
            if (z4) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x3 != c0012a) {
                    z2 = z;
                    izs izsVar = (izs) x3;
                    z3 = i4 == 4;
                    x = M.x();
                    if (!z3 || x == c0012a) {
                        x = new glo0(str, z2, 0);
                        M.R(x);
                    }
                    ae2.a(48, 0, M, izsVar, (izs) x, f2);
                    aVar2 = M;
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            z2 = z;
            x3 = new flo0(z2, 0);
            M.R(x3);
            izs izsVar2 = (izs) x3;
            if (i4 == 4) {
            }
            x = M.x();
            if (!z3) {
            }
            x = new glo0(str, z2, 0);
            M.R(x);
            ae2.a(48, 0, M, izsVar2, (izs) x, f2);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xn1(this, z2, i);
        }
    }

    public final void p(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(179940661);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(179940661, i, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.LinkedTextSection (TextScreenContent.kt:50)");
            }
            f9t.e(txj0.h(q630.a.a, 36), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ws2.e("This is a test [https://vk.com](https://vk.com) link");
                M.R(x);
            }
            us2 us2Var = (us2) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new fxi0(6);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new av70(21);
                M.R(x3);
            }
            ae2.a(390, 2, M, izsVar, (izs) x3, null);
            yqv0.d(us2Var, null, 0L, 0, null, 0, false, 0, null, null, null, M, 6, 0, 16382);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a71(this, i, 2);
        }
    }

    public final void q(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-236267436);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-236267436, i, -1, "com.vk.design.demo.presentation.screens.TextScreenContent.MiniInfoCellSection (TextScreenContent.kt:72)");
            }
            f9t.e(txj0.h(q630.a.a, 36), M, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new wo40(19);
                M.R(x);
            }
            izs izsVar = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new acc0(14);
                M.R(x2);
            }
            ae2.a(390, 2, M, izsVar, (izs) x2, null);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new t810(20);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new m0m0(3);
                M.R(x4);
            }
            ae2.a(390, 2, M, izsVar2, (izs) x4, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zko0(this, i, 0);
        }
    }
}
