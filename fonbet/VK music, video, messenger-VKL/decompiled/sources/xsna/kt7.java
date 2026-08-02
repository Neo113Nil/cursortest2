package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vkontakte.android.R;
import java.util.Calendar;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.ft7;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: BookingRecordCell.kt */
/* loaded from: classes18.dex */
public final class kt7 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public kt7(av7 av7Var, String str, izs<? super BookingButton.Action, s3q0> izsVar) {
        this.a = androidx.compose.runtime.k.b(av7Var);
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(izsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1643423832);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1643423832, i2, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.Content (BookingRecordCell.kt:90)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            uog0 b = vog0.b(kqu0.g);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().B;
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(f, b, j, 0L, aqw.a(f2, ylu0Var2.getImage().a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1718909776, new it7(this, 0), M), M, 1572864, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jt7(this, q630Var, i, 0);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        kt7 kt7Var;
        androidx.compose.runtime.a aVar2;
        String b;
        androidx.compose.runtime.a M = aVar.M(-557054239);
        int i2 = i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-557054239, i2, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.Descriptions (BookingRecordCell.kt:161)");
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, xpyVar);
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
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "record_date");
            int i3 = d().a;
            int i4 = i2 & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(803814232, i4, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.datetimeString (BookingRecordCell.kt:193)");
            }
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var);
            boolean o = M.o(i3);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                if (pvo0.g(i3)) {
                    b = cqm0.b(pvo0.i(false, i3, false, false));
                } else {
                    String m = pvo0.m(i3);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(i3 * 1000);
                    b = cqm0.b(enj.j(R.array.booking_day_of_week, context)[(calendar.get(7) + 5) % 7] + ", " + m);
                }
                x = b;
                M.R(x);
            }
            String str = (String) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, E, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).k, aVar2, 48, 0, 8188);
            float f = 13;
            f9t.e(txj0.q(aVar4, f), aVar2, 6);
            yqv0.c(d().b, ahn.E(aVar4, "record_services"), 0L, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(aVar2).N, aVar2, 100663344, 48, 5884);
            f9t.e(txj0.q(aVar4, f), aVar2, 6);
            kt7Var = this;
            yqv0.c(mri0.c((Context) aVar2.r(iyk0Var), ft7.a.a(new i5g(d().e.e)), (String) ((zak0) kt7Var.b).getValue()), ahn.E(aVar4, "record_price"), 0L, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar2).N, aVar2, 100663344, 48, 5884);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            kt7Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ht7(kt7Var, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        efj a;
        androidx.compose.runtime.a M = aVar.M(1341859053);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1341859053, i2, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.MasterAvatar (BookingRecordCell.kt:126)");
            }
            float f = 64;
            q630.a aVar2 = q630.a.a;
            q630 v = txj0.v(aVar2, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(4), dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, v);
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
            if (d().c.length() == 0) {
                M.K(1860705307);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2106424732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-User28> (VkSdkIcons.kt:3542)");
                }
                lg90 b = or.b(M, -1267804465, R.drawable.vk_icon_user_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long c2 = l5g.c(14, ylu0Var.getIcon().a, 0.4f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = xpv.a.a(b, c2, new rek0(ylu0Var2.getBackground().p), M, 24584, 8);
                M.j();
            } else {
                M.K(1861011091);
                lg90 l = fwu0.l(d().c, null, null, null, M, 0, 62);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = phw.a.a(l, new rek0(ylu0Var3.getBackground().x), null, null, null, M, 196616, 28);
                M = M;
                M.j();
            }
            androidx.compose.runtime.a aVar4 = M;
            ldu0.b(a, f, null, null, null, false, null, null, null, aVar4, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            q630 E = ahn.E(aVar2, "record_master");
            String str = d().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var4 = (ylu0) aVar4.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E, ylu0Var4.getText().r, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar4, 100663344, 48, 5880);
            M = aVar4;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wa5(this, i, 1);
        }
    }

    public final av7 d() {
        return (av7) ((zak0) this.a).getValue();
    }
}
