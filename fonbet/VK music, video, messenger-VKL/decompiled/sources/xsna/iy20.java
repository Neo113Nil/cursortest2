package xsna;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dw20;
import xsna.q630;

/* compiled from: ModalBottomSheetScreenContent.kt */
/* loaded from: classes18.dex */
public final class iy20 implements yah0 {
    public static LinearLayout f(int i, Context context) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        int a2 = iah0.a(8);
        a.setPadding(a2, a2, a2, a2);
        int i2 = 0;
        while (i2 < i) {
            Button button = new Button(context);
            StringBuilder sb = new StringBuilder("Кнопка ");
            i2++;
            sb.append(i2);
            button.setText(sb.toString());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iah0.a(4);
            s3q0 s3q0Var = s3q0.a;
            a.addView(button, layoutParams);
        }
        return a;
    }

    public static void g(int i, Context context) {
        new dw20.b(context, null).w0("Hug: " + i + " кнопок").D0(f(i, context), false).I0(null);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        x5 x5Var2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(2104868137);
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
            x5Var2 = x5Var;
            i2 |= M.y(x5Var2) ? 256 : 128;
        } else {
            x5Var2 = x5Var;
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
                androidx.compose.runtime.b.f(2104868137, i2, -1, "com.vk.design.demo.presentation.screens.ModalBottomSheetScreenContent.Content (ModalBottomSheetScreenContent.kt:48)");
            }
            Boolean bool = Boolean.FALSE;
            boolean l = M.l(false);
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                x = new ulz(3);
                M.R(x);
            }
            bap.c(bool, (izs) x, M, 0);
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
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
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Modal Card", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(1798230059);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(1798230892);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(1798238512);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, null, d.b.a.C0757a.a(q, null, x5Var2, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, M, 24576, 10), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            q630 f = txj0.f(aVar2, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d2 = defpackage.j0.d(1.0f, f, true);
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, d2);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            e((i2 >> 15) & 14, M);
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
            s.d = new i07(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1953932882);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1953932882, i2, -1, "com.vk.design.demo.presentation.screens.ModalBottomSheetScreenContent.ClassicBuilderSection (ModalBottomSheetScreenContent.kt:148)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c("Classic ModalBottomSheet.Builder Examples", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, M, 6, 0, 8190);
            f9t.e(txj0.h(q630.a.a, 16), M, 6);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            boolean y = M.y(context) | ((i3 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new by20(this, context);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "fullscreen, title, subtitle", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
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
            s.d = new x8q(this, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        boolean y;
        a.C0011a.C0012a c0012a2;
        boolean y2;
        Object x;
        iy20 iy20Var = this;
        androidx.compose.runtime.a M = aVar.M(-33972398);
        if ((i & 6) == 0) {
            i2 = i | (M.J(iy20Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-33972398, i2, -1, "com.vk.design.demo.presentation.screens.ModalBottomSheetScreenContent.ComposeBuilderSection (ModalBottomSheetScreenContent.kt:106)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c("VkComposeModalBottomSheetBuilder Examples", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, M, 6, 0, 8190);
            float f = 16;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f), M, 6);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i4 = i3 & 14;
            boolean y3 = (i4 == 4) | M.y(context);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (y3 || x2 == c0012a3) {
                x2 = new zx20(iy20Var, context);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Swipe DISABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
            boolean y4 = (i4 == 4) | M.y(context);
            Object x3 = M.x();
            if (y4) {
                c0012a = c0012a3;
            } else {
                c0012a = c0012a3;
                if (x3 != c0012a) {
                    a.C0011a.C0012a c0012a4 = c0012a;
                    bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Swipe ENABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y = M.y(context) | (i4 != 4);
                    Object x4 = M.x();
                    if (y) {
                        c0012a2 = c0012a4;
                        if (x4 != c0012a2) {
                            a.C0011a.C0012a c0012a5 = c0012a2;
                            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Tap DISABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                            f9t.e(txj0.h(aVar3, f), M, 6);
                            y2 = M.y(context) | (i4 == 4);
                            x = M.x();
                            if (!y2 || x == c0012a5) {
                                iy20Var = this;
                                x = new dy20(iy20Var, context);
                                M.R(x);
                            } else {
                                iy20Var = this;
                            }
                            aVar2 = M;
                            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Tap ENABLED", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    } else {
                        c0012a2 = c0012a4;
                    }
                    x4 = new ol1(context, this, 1);
                    M.R(x4);
                    a.C0011a.C0012a c0012a52 = c0012a2;
                    bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Tap DISABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y2 = M.y(context) | (i4 == 4);
                    x = M.x();
                    if (y2) {
                    }
                    iy20Var = this;
                    x = new dy20(iy20Var, context);
                    M.R(x);
                    aVar2 = M;
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Tap ENABLED", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
            }
            x3 = new nl1(context, this, 1);
            M.R(x3);
            a.C0011a.C0012a c0012a42 = c0012a;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Swipe ENABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y = M.y(context) | (i4 != 4);
            Object x42 = M.x();
            if (y) {
            }
            x42 = new ol1(context, this, 1);
            M.R(x42);
            a.C0011a.C0012a c0012a522 = c0012a2;
            bhu0.e((gzs) x42, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Tap DISABLED", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y2 = M.y(context) | (i4 == 4);
            x = M.x();
            if (y2) {
            }
            iy20Var = this;
            x = new dy20(iy20Var, context);
            M.R(x);
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Tap ENABLED", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b9q(iy20Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        boolean y;
        a.C0011a.C0012a c0012a2;
        boolean y2;
        a.C0011a.C0012a c0012a3;
        boolean y3;
        a.C0011a.C0012a c0012a4;
        boolean y4;
        a.C0011a.C0012a c0012a5;
        boolean y5;
        Object x;
        iy20 iy20Var = this;
        androidx.compose.runtime.a M = aVar.M(394123262);
        if ((i & 6) == 0) {
            i2 = i | (M.J(iy20Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(394123262, i2, -1, "com.vk.design.demo.presentation.screens.ModalBottomSheetScreenContent.LegoV2Section (ModalBottomSheetScreenContent.kt:166)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c("Lego v2 Props (only effective when Lego ON)", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, M, 6, 0, 8190);
            float f = 16;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f), M, 6);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i4 = i3 & 14;
            boolean y6 = (i4 == 4) | M.y(context);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a6 = a.C0011a.a;
            if (y6 || x2 == c0012a6) {
                x2 = new ey20(iy20Var, context);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, "Action-list (setAllowFullScreen=false)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Neutral;
            boolean y7 = (i4 == 4) | M.y(context);
            Object x3 = M.x();
            if (y7) {
                c0012a = c0012a6;
            } else {
                c0012a = c0012a6;
                if (x3 != c0012a) {
                    a.C0011a.C0012a c0012a7 = c0012a;
                    bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Open in FullScreen (setFullScreen=true)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y = (i4 != 4) | M.y(context);
                    Object x4 = M.x();
                    if (y) {
                        c0012a2 = c0012a7;
                        if (x4 != c0012a2) {
                            a.C0011a.C0012a c0012a8 = c0012a2;
                            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: мало контента (3 кнопки)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                            f9t.e(txj0.h(aVar3, f), M, 6);
                            y2 = (i4 == 4) | M.y(context);
                            Object x5 = M.x();
                            if (y2) {
                                c0012a3 = c0012a8;
                            } else {
                                c0012a3 = c0012a8;
                                if (x5 != c0012a3) {
                                    a.C0011a.C0012a c0012a9 = c0012a3;
                                    bhu0.e((gzs) x5, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: средне (8 кнопок)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                    f9t.e(txj0.h(aVar3, f), M, 6);
                                    y3 = (i4 != 4) | M.y(context);
                                    Object x6 = M.x();
                                    if (y3) {
                                        c0012a4 = c0012a9;
                                        if (x6 != c0012a4) {
                                            a.C0011a.C0012a c0012a10 = c0012a4;
                                            bhu0.e((gzs) x6, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: много (20 кнопок → 2/3, свайп вверх = фуллскрин)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                            f9t.e(txj0.h(aVar3, f), M, 6);
                                            y4 = (i4 == 4) | M.y(context);
                                            Object x7 = M.x();
                                            if (y4) {
                                                c0012a5 = c0012a10;
                                            } else {
                                                c0012a5 = c0012a10;
                                                if (x7 != c0012a5) {
                                                    a.C0011a.C0012a c0012a11 = c0012a5;
                                                    bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                                    f9t.e(txj0.h(aVar3, f), M, 6);
                                                    y5 = M.y(context) | (i4 != 4);
                                                    x = M.x();
                                                    if (!y5 || x == c0012a11) {
                                                        iy20Var = this;
                                                        x = new ay20(iy20Var, context);
                                                        M.R(x);
                                                    } else {
                                                        iy20Var = this;
                                                    }
                                                    aVar2 = M;
                                                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                }
                                            }
                                            x7 = new v8q(this, context);
                                            M.R(x7);
                                            a.C0011a.C0012a c0012a112 = c0012a5;
                                            bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                            f9t.e(txj0.h(aVar3, f), M, 6);
                                            y5 = M.y(context) | (i4 != 4);
                                            x = M.x();
                                            if (y5) {
                                            }
                                            iy20Var = this;
                                            x = new ay20(iy20Var, context);
                                            M.R(x);
                                            aVar2 = M;
                                            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                                            if (androidx.compose.runtime.b.d()) {
                                            }
                                        }
                                    } else {
                                        c0012a4 = c0012a9;
                                    }
                                    x6 = new f5x(this, context);
                                    M.R(x6);
                                    a.C0011a.C0012a c0012a102 = c0012a4;
                                    bhu0.e((gzs) x6, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: много (20 кнопок → 2/3, свайп вверх = фуллскрин)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                    f9t.e(txj0.h(aVar3, f), M, 6);
                                    y4 = (i4 == 4) | M.y(context);
                                    Object x72 = M.x();
                                    if (y4) {
                                    }
                                    x72 = new v8q(this, context);
                                    M.R(x72);
                                    a.C0011a.C0012a c0012a1122 = c0012a5;
                                    bhu0.e((gzs) x72, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                                    f9t.e(txj0.h(aVar3, f), M, 6);
                                    y5 = M.y(context) | (i4 != 4);
                                    x = M.x();
                                    if (y5) {
                                    }
                                    iy20Var = this;
                                    x = new ay20(iy20Var, context);
                                    M.R(x);
                                    aVar2 = M;
                                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                }
                            }
                            x5 = new y3i(this, context);
                            M.R(x5);
                            a.C0011a.C0012a c0012a92 = c0012a3;
                            bhu0.e((gzs) x5, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: средне (8 кнопок)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                            f9t.e(txj0.h(aVar3, f), M, 6);
                            y3 = (i4 != 4) | M.y(context);
                            Object x62 = M.x();
                            if (y3) {
                            }
                            x62 = new f5x(this, context);
                            M.R(x62);
                            a.C0011a.C0012a c0012a1022 = c0012a4;
                            bhu0.e((gzs) x62, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: много (20 кнопок → 2/3, свайп вверх = фуллскрин)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                            f9t.e(txj0.h(aVar3, f), M, 6);
                            y4 = (i4 == 4) | M.y(context);
                            Object x722 = M.x();
                            if (y4) {
                            }
                            x722 = new v8q(this, context);
                            M.R(x722);
                            a.C0011a.C0012a c0012a11222 = c0012a5;
                            bhu0.e((gzs) x722, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                            f9t.e(txj0.h(aVar3, f), M, 6);
                            y5 = M.y(context) | (i4 != 4);
                            x = M.x();
                            if (y5) {
                            }
                            iy20Var = this;
                            x = new ay20(iy20Var, context);
                            M.R(x);
                            aVar2 = M;
                            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                            if (androidx.compose.runtime.b.d()) {
                            }
                        }
                    } else {
                        c0012a2 = c0012a7;
                    }
                    x4 = new gy20(this, context);
                    M.R(x4);
                    a.C0011a.C0012a c0012a82 = c0012a2;
                    bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: мало контента (3 кнопки)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y2 = (i4 == 4) | M.y(context);
                    Object x52 = M.x();
                    if (y2) {
                    }
                    x52 = new y3i(this, context);
                    M.R(x52);
                    a.C0011a.C0012a c0012a922 = c0012a3;
                    bhu0.e((gzs) x52, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: средне (8 кнопок)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y3 = (i4 != 4) | M.y(context);
                    Object x622 = M.x();
                    if (y3) {
                    }
                    x622 = new f5x(this, context);
                    M.R(x622);
                    a.C0011a.C0012a c0012a10222 = c0012a4;
                    bhu0.e((gzs) x622, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: много (20 кнопок → 2/3, свайп вверх = фуллскрин)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y4 = (i4 == 4) | M.y(context);
                    Object x7222 = M.x();
                    if (y4) {
                    }
                    x7222 = new v8q(this, context);
                    M.R(x7222);
                    a.C0011a.C0012a c0012a112222 = c0012a5;
                    bhu0.e((gzs) x7222, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
                    f9t.e(txj0.h(aVar3, f), M, 6);
                    y5 = M.y(context) | (i4 != 4);
                    x = M.x();
                    if (y5) {
                    }
                    iy20Var = this;
                    x = new ay20(iy20Var, context);
                    M.R(x);
                    aVar2 = M;
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
            }
            x3 = new fy20(this, context);
            M.R(x3);
            a.C0011a.C0012a c0012a72 = c0012a;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Open in FullScreen (setFullScreen=true)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y = (i4 != 4) | M.y(context);
            Object x42 = M.x();
            if (y) {
            }
            x42 = new gy20(this, context);
            M.R(x42);
            a.C0011a.C0012a c0012a822 = c0012a2;
            bhu0.e((gzs) x42, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: мало контента (3 кнопки)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y2 = (i4 == 4) | M.y(context);
            Object x522 = M.x();
            if (y2) {
            }
            x522 = new y3i(this, context);
            M.R(x522);
            a.C0011a.C0012a c0012a9222 = c0012a3;
            bhu0.e((gzs) x522, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: средне (8 кнопок)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y3 = (i4 != 4) | M.y(context);
            Object x6222 = M.x();
            if (y3) {
            }
            x6222 = new f5x(this, context);
            M.R(x6222);
            a.C0011a.C0012a c0012a102222 = c0012a4;
            bhu0.e((gzs) x6222, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Hug: много (20 кнопок → 2/3, свайп вверх = фуллскрин)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y4 = (i4 == 4) | M.y(context);
            Object x72222 = M.x();
            if (y4) {
            }
            x72222 = new v8q(this, context);
            M.R(x72222);
            a.C0011a.C0012a c0012a1122222 = c0012a5;
            bhu0.e((gzs) x72222, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Bottom Accessory: 2 кнопки + скролл (blur)", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190192);
            f9t.e(txj0.h(aVar3, f), M, 6);
            y5 = M.y(context) | (i4 != 4);
            x = M.x();
            if (y5) {
            }
            iy20Var = this;
            x = new ay20(iy20Var, context);
            M.R(x);
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, null, null, null, "Dynamic background blur (API 31+)", null, null, null, null, false, null, null, null, aVar2, X2.b.f, 384, 0, 4190192);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new oaz(iy20Var, i, 1);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-675371448);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-675371448, i2, -1, "com.vk.design.demo.presentation.screens.ModalBottomSheetScreenContent.ModalBottomSheetContent (ModalBottomSheetScreenContent.kt:91)");
            }
            jgh0 x = p490.x(M);
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(aVar2, x, 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            c(i3, M);
            float f = 32;
            f9t.e(txj0.h(aVar2, f), M, 6);
            b(i3, M);
            f9t.e(txj0.h(aVar2, f), M, 6);
            d(i3, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9q(this, i, 1);
        }
    }
}
