package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.bv7;
import xsna.cri;
import xsna.dt1;
import xsna.dv7;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: BookingRecordsScreenMviView.kt */
/* loaded from: classes18.dex */
public final class wv7 {

    /* compiled from: BookingRecordsScreenMviView.kt */
    public static final class a implements izs<BookingButton.Action, s3q0> {
        public final /* synthetic */ izs<dv7, s3q0> b;
        public final /* synthetic */ bv7 c;

        public a(izs izsVar, bv7.c cVar) {
            this.b = izsVar;
            this.c = cVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(BookingButton.Action action) {
            this.b.invoke(new dv7.g(action, ((bv7.c) this.c).b.e));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public b(fj1 fj1Var, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((bv7) this.b.b.get(num.intValue())).a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public c(vr0 vr0Var, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((bv7) this.b.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ String c;
        public final /* synthetic */ izs d;

        public d(wow wowVar, String str, izs izsVar) {
            this.b = wowVar;
            this.c = str;
            this.d = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                Object obj = (bv7) this.b.b.get(intValue);
                aVar2.K(-655938874);
                boolean z = obj instanceof bv7.c;
                izs izsVar = this.d;
                if (z) {
                    aVar2.K(-655884470);
                    av7 av7Var = ((bv7.c) obj).b;
                    boolean J = aVar2.J(izsVar) | aVar2.J(obj);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new a(izsVar, (bv7.c) obj);
                        aVar2.R(x);
                    }
                    mt7.b(av7Var, this.c, null, (izs) x, aVar2, 0, 4);
                    aVar2.j();
                } else if (obj instanceof bv7.b) {
                    aVar2.K(-655548678);
                    wv7.b(0, aVar2);
                    aVar2.j();
                } else {
                    if (!(obj instanceof bv7.a)) {
                        throw alb0.c(-436801315, aVar2);
                    }
                    aVar2.K(-655416525);
                    wv7.a(izsVar, aVar2, 0);
                    aVar2.j();
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(izs<? super dv7, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1514672280);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1514672280, i2, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsPaginationFailed (BookingRecordsScreenMviView.kt:211)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            vl20 a2 = zra0.a.a(d370.N(R.string.booking_service_failure_load_page_records, 0, M), null, null, null, M, 196608, 30);
            String N = d370.N(R.string.booking_service_retry_load_page_records, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new fe1(izsVar, 1);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(f, null, a2, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, aVar2, 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qv7(izsVar, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2024279238);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2024279238, i, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsPaginationLoading (BookingRecordsScreenMviView.kt:196)");
            }
            q630 D = s200.D(txj0.f(q630.a.a, 1.0f), 24);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            zfr0.f(SpinnerState.Loading, null, null, 0L, SpinnerSize.Size24, null, M, 24582, 46);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pv7(i);
        }
    }

    public static final void c(dlv0 dlv0Var, BookingActionResult bookingActionResult, androidx.compose.runtime.a aVar, int i) {
        dlv0 dlv0Var2;
        androidx.compose.runtime.a M = aVar.M(-70915948);
        int i2 = (M.o(bookingActionResult == null ? -1 : bookingActionResult.ordinal()) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-70915948, i2, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsSnackbarHost (BookingRecordsScreenMviView.kt:169)");
            }
            dlv0Var2 = dlv0Var;
            zkv0.d(dlv0Var2, null, kai.c(1975343858, new ov7(bookingActionResult, 0), M), M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            dlv0Var2 = dlv0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv7(dlv0Var2, bookingActionResult, i, 0);
        }
    }

    public static final void d(izs<? super dv7, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1229903761);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1229903761, i2, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsTopBar (BookingRecordsScreenMviView.kt:143)");
            }
            String N = d370.N(R.string.booking_accessability_back, 0, M);
            com.vk.core.compose.component.semantics.a b2 = cq.b("back_button", null, 3);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new to0(izsVar, 1);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, N, null, null, b2, M, 196608, 12);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.booking_records_title, 0, M), null, null, null, cq.b("screen_title", null, 3), M, 196608, 14), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b3 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.booking_accessability_close, 0, M);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new m77(izsVar, 1);
                M.R(x2);
            }
            muv0.h(a3, null, null, null, a2, null, d.a.a(d.c.C0760d.a.a(b3, N2, (gzs) x2, null, null, cq.b("close_button", null, 3), M, 1572872, 24), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8110);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y5(izsVar, i, 1);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(439179113);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(439179113, i, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.EmptyRecordsView (BookingRecordsScreenMviView.kt:182)");
            }
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d2);
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
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            String N = d370.N(R.string.bookings_empty_records, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.p1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, null, ylu0Var.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
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
            s.d = new vv7(i, 0);
        }
    }

    public static final void f(final int i, androidx.compose.runtime.a aVar, final String str, final List list, final izs izsVar, final boolean z) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-221472960);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-221472960, i2, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.RecordsListView (BookingRecordsScreenMviView.kt:235)");
            }
            float f = 16;
            q630 E = ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), "main_list");
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.j g = androidx.compose.foundation.layout.a.g(f);
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new sv7(izsVar, 0);
                M.R(x);
            }
            xvy z3 = crx0.z(z, (gzs) x, 0, M, (i2 >> 6) & 14, 60);
            boolean z4 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | (i3 == 2048);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new tv7(list, str, izsVar, 0);
                M.R(x2);
            }
            lqy.a(E, z3, n, g, null, null, false, null, (izs) x2, M, 24966, 488);
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
            s.d = new wzs(i, str, list, izsVar, z) { // from class: xsna.uv7
                public final /* synthetic */ List b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;

                {
                    this.b = list;
                    this.c = str;
                    this.d = z;
                    this.e = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wv7.f(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b, this.e, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
