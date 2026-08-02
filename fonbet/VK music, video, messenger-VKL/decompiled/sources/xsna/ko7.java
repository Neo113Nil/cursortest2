package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: BookingEditBottomBar.kt */
/* loaded from: classes18.dex */
public final class ko7 {
    public final String a;
    public final mtk0 b;
    public final mtk0 c;
    public final wh50 d;
    public final q630 e;
    public final q630 f;
    public final q630 g;

    public ko7() {
        throw null;
    }

    public ko7(mtk0 mtk0Var, mtk0 mtk0Var2, String str, izs izsVar, long j, uog0 uog0Var, y18 y18Var) {
        this.a = str;
        this.b = mtk0Var;
        this.c = mtk0Var2;
        this.d = androidx.compose.runtime.k.b(izsVar);
        q630.a aVar = q630.a.a;
        q630 f = txj0.f(aVar, 1.0f);
        this.e = f;
        float f2 = 12;
        this.f = txj0.h(aVar, f2);
        q630 g = hr80.m(f, j, uog0Var).g(bu00.f(aVar, new r630(y18Var, f2)));
        float f3 = 16;
        this.g = s200.G(g, f3, 26, f3, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0290, code lost:
    
        if (r4 == r2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(BookingEditScreenState.a.C0956a c0956a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        BookingEditScreenState.a.C0956a c0956a2;
        ko7 ko7Var;
        q630 q630Var2;
        int i3;
        q630 q630Var3;
        a.C0011a.C0012a c0012a;
        iyk0 iyk0Var;
        a.C0011a.C0012a c0012a2;
        String str;
        androidx.compose.runtime.a M = aVar.M(-593529275);
        if ((i & 6) == 0) {
            i2 = (M.J(c0956a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-593529275, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBarImpl.ConfirmContent (BookingEditBottomBar.kt:165)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, this.g);
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
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 q630Var4 = this.e;
            q630 c2 = qri.c(M, q630Var4);
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
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(new xpy(1.0f, true), "service_footer_count");
            int i4 = (i2 & 14) | ((i2 >> 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(-150318751, i4, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBarImpl.statusText (BookingEditBottomBar.kt:96)");
            } else {
                i3 = -1;
            }
            iyk0 iyk0Var2 = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var3 = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getText().s;
            int i5 = c0956a.b;
            ft7 ft7Var = c0956a.c;
            int i6 = c0956a.a;
            boolean J = M.J(context) | M.p(j) | M.p(j2) | M.o(i5) | M.o(i6);
            int i7 = i2;
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (J || x == c0012a3) {
                us2.b bVar2 = new us2.b();
                int m = bVar2.m(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                q630Var3 = E;
                try {
                    c0012a = c0012a3;
                    iyk0Var = iyk0Var2;
                    bVar2.g(context.getResources().getQuantityString(R.plurals.booking_service_count_plurals, i6, Integer.valueOf(i6)));
                    bVar2.g("  ");
                    s3q0 s3q0Var = s3q0.a;
                    bVar2.k(m);
                    m = bVar2.m(new hik0(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        bVar2.g(mri0.b(i5, context));
                        bVar2.k(m);
                        x = bVar2.n();
                        M.R(x);
                    } finally {
                    }
                } finally {
                }
            } else {
                q630Var3 = E;
                c0012a = c0012a3;
                iyk0Var = iyk0Var2;
            }
            us2 us2Var = (us2) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.C0011a.C0012a c0012a4 = c0012a;
            iyk0 iyk0Var4 = iyk0Var;
            yqv0.d(us2Var, q630Var3, 0L, 0, null, 0, false, 0, null, null, wlb0.l(M).N, M, 0, 0, 8188);
            q630.a aVar4 = q630.a.a;
            q630 E2 = ahn.E(aVar4, "service_footer_price");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1178626538, i4, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBarImpl.priceText (BookingEditBottomBar.kt:124)");
            }
            Context context2 = (Context) M.r(iyk0Var4);
            boolean J2 = M.J(context2) | M.J(ft7Var);
            Object x2 = M.x();
            if (J2) {
                c0012a2 = c0012a4;
            } else {
                c0012a2 = c0012a4;
            }
            x2 = mri0.c(context2, ft7Var, this.a);
            M.R(x2);
            String str2 = (String) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str2, E2, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).M, M, 48, 0, 8184);
            M.G();
            q630 q630Var5 = this.f;
            f9t.e(q630Var5, M, 0);
            q630 E3 = ahn.E(q630Var4, "cta_button");
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            mtk0 mtk0Var = this.c;
            boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
            if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                M.K(1944133423);
                M.j();
                str = "";
            } else {
                str = zq.a(M, -352929759, R.string.booking_edit_confirm, M, 0);
            }
            int i8 = i7 & 896;
            boolean z = i8 == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a2) {
                x3 = new ac(this, 9);
                M.R(x3);
            }
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, E3, null, booleanValue, false, null, null, null, str, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190048);
            f9t.e(q630Var5, M, 0);
            c0956a2 = c0956a;
            String str3 = c0956a2.f;
            String O = d370.O(R.string.booking_edit_policy_and_terms, new Object[]{str3 != null ? str3 : ""}, M);
            long j3 = wlb0.h(M).getText().f;
            boolean z2 = i8 == 256;
            Object x4 = M.x();
            if (z2 || x4 == c0012a2) {
                ko7Var = this;
                x4 = new pz(ko7Var, 6);
                M.R(x4);
            } else {
                ko7Var = this;
            }
            izs izsVar = (izs) x4;
            boolean J3 = M.J(O) | M.p(j3) | M.J(izsVar);
            Object x5 = M.x();
            if (J3 || x5 == c0012a2) {
                x5 = bj90.a(O, izsVar, j3);
                M.R(x5);
            }
            aVar2 = M;
            yqv0.d((us2) x5, ahn.E(q630Var4, "legal_text"), wlb0.h(M).getText().p, 3, null, 0, false, 0, null, null, wlb0.l(M).s0, aVar2, 0, 0, 8120);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            c0956a2 = c0956a;
            ko7Var = this;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jo7(i, 0, ko7Var, c0956a2, q630Var2);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1891237227);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1891237227, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBarImpl.Content (BookingEditBottomBar.kt:136)");
            }
            BookingEditScreenState.a aVar2 = (BookingEditScreenState.a) this.b.getValue();
            if (epx.f(aVar2, BookingEditScreenState.a.b.a)) {
                M.K(-467085410);
                c(null, M, i2 & 112);
                M.j();
            } else {
                if (!(aVar2 instanceof BookingEditScreenState.a.C0956a)) {
                    throw alb0.c(-707806474, M);
                }
                M.K(-466978088);
                a((BookingEditScreenState.a.C0956a) aVar2, null, M, (i2 << 3) & 896);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(this, q630Var, i, 0);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1046309593);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1046309593, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditBottomBarImpl.RebookContent (BookingEditBottomBar.kt:149)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, this.g);
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
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.booking_edit_again, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new defpackage.k(this, 6);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, this.e, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new og4(this, q630Var2, i, 1);
        }
    }
}
