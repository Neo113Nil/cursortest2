package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BookingCalendarDayBlockView.kt */
/* loaded from: classes18.dex */
public final class y1l {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final q630 d;
    public final q630 e;

    /* compiled from: BookingCalendarDayBlockView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingCalendarScreenState.DaySelector.DayType.values().length];
            try {
                iArr[BookingCalendarScreenState.DaySelector.DayType.NotAvailable.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingCalendarScreenState.DaySelector.DayType.Available.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingCalendarScreenState.DaySelector.DayType.Selected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y1l(BookingCalendarScreenState.DaySelector.a aVar, int i, gzs<s3q0> gzsVar) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(Integer.valueOf(i));
        this.c = androidx.compose.runtime.k.b(gzsVar);
        q630.a aVar2 = q630.a.a;
        this.d = ahn.E(rte0.d(txj0.s(s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 48, 62), vog0.b(10)), "calendar_day_item_" + i);
        this.e = txj0.h(aVar2, (float) 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        long j;
        long j2;
        long j3;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-1775337095);
        int i2 = i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1775337095, i2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.DayViewImpl.Content (BookingCalendarDayBlockView.kt:258)");
            }
            wh50 wh50Var = this.a;
            int i3 = a.$EnumSwitchMapping$0[((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).d.ordinal()];
            if (i3 == 1) {
                M.K(-839879188);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var2.getText().s;
                M.j();
            } else if (i3 == 2) {
                M.K(-839643309);
                long j4 = wlb0.h(M).getBackground().x;
                int i4 = ((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).c;
                j2 = (6 == i4 || 5 == i4) ? gub0.a(M, -996911995, M).k : gub0.a(M, -996910780, M).m;
                M.j();
                M.j();
                j3 = j4;
                z = true;
                String[] M2 = d370.M(R.array.booking_day_of_week, M);
                int i5 = ((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).c;
                String str = (i5 >= 0 || i5 >= M2.length) ? "" : M2[i5];
                String valueOf = String.valueOf(((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).b);
                q630 c = ojc.c(hr80.m(this.d, j3, androidx.compose.ui.graphics.e.a), z, null, null, (gzs) ((zak0) this.c).getValue(), 14);
                a.c cVar = androidx.compose.foundation.layout.a.e;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, c);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() != null) {
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
                k9q0.w(M, c2, cri.a.d);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                iyk0 iyk0Var2 = rrv0.c;
                wuv0 wuv0Var = (wuv0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j5 = j2;
                yqv0.c(str, null, j5, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, M, 0, 0, 8186);
                f9t.e(this.e, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(valueOf, null, j5, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.N, aVar2, 0, 0, 8186);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630.a.a;
            } else {
                if (i3 != 3) {
                    throw alb0.c(-996925775, M);
                }
                M.K(-839355505);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var3 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getBackground().b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var4.getText().d;
                M.j();
            }
            j3 = j;
            z = false;
            String[] M22 = d370.M(R.array.booking_day_of_week, M);
            int i52 = ((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).c;
            if (i52 >= 0) {
            }
            String valueOf2 = String.valueOf(((BookingCalendarScreenState.DaySelector.a) ((zak0) wh50Var).getValue()).b);
            q630 c3 = ojc.c(hr80.m(this.d, j3, androidx.compose.ui.graphics.e.a), z, null, null, (gzs) ((zak0) this.c).getValue(), 14);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a22 = androidx.compose.foundation.layout.b.a(cVar2, dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c22 = qri.c(M, c3);
            cri.h7.getClass();
            LayoutNode.a aVar32 = cri.a.b;
            if (M.N() != null) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new do7(this, q630Var2, i, 2);
        }
    }
}
