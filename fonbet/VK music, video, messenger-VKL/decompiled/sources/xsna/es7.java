package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;

/* compiled from: BookingNotificationCell.kt */
/* loaded from: classes18.dex */
public final class es7 {
    public final mtk0 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(Boolean.FALSE);

    /* compiled from: BookingNotificationCell.kt */
    public static final class a implements gzs<s3q0> {
        public a() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            es7.this.d(false);
            return s3q0.a;
        }
    }

    /* compiled from: BookingNotificationCell.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ NotificationVariants c;

        public b(NotificationVariants notificationVariants) {
            this.c = notificationVariants;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            es7 es7Var = es7.this;
            es7Var.d(false);
            ((izs) ((zak0) es7Var.b).getValue()).invoke(new lp7(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ Object[] b;

        public c(Object[] objArr) {
            this.b = objArr;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            Object obj = this.b[num.intValue()];
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ es7 c;

        public d(Object[] objArr, es7 es7Var) {
            this.b = objArr;
            this.c = es7Var;
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
                    androidx.compose.runtime.b.f(-1781742563, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:250)");
                }
                NotificationVariants notificationVariants = (NotificationVariants) this.b[intValue];
                aVar2.K(-1958696281);
                com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(notificationVariants.h(), 0, aVar2), null, null, 0, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, cq.b("notification_item", null, 3), aVar2, 196608, 14);
                es7 es7Var = this.c;
                boolean J = aVar2.J(es7Var);
                Object x = aVar2.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = es7Var.new a();
                    aVar2.R(x);
                }
                com.vk.core.compose.component.cell.content.y0 a2 = notificationVariants.j() == ((BookingEditScreenState.f) es7Var.a.getValue()).a.j() ? o.c.a(null, null, o.e.a.C0736a.a(true, (gzs) x, false, cq.b("notification_item_select", null, 3), aVar2, 24582, 4), null, null, aVar2, 59) : null;
                boolean J2 = aVar2.J(es7Var) | aVar2.o(notificationVariants.ordinal());
                Object x2 = aVar2.x();
                if (J2 || x2 == obj) {
                    x2 = es7Var.new b(notificationVariants);
                    aVar2.R(x2);
                }
                wiu0.b(null, false, null, a, a2, (gzs) x2, null, aVar2, 0, 71);
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

    public es7(izs izsVar, mtk0 mtk0Var) {
        this.a = mtk0Var;
        this.b = androidx.compose.runtime.k.b(izsVar);
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-270995175);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = i | (M.J(aVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-270995175, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingNotificationCellImpl.Content (BookingNotificationCell.kt:68)");
            }
            BookingEditScreenState.f fVar = (BookingEditScreenState.f) this.a.getValue();
            if (fVar == null) {
                M.K(1321370741);
            } else {
                M.K(1321370742);
                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, H);
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
                k9q0.w(M, c2, cri.a.d);
                f9t.e(txj0.q(aVar2, 5), M, 6);
                int i4 = i2;
                com.vk.core.compose.component.group.header.f a3 = f.a.a(d370.N(R.string.booking_edit_notification_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
                M = M;
                com.vk.core.compose.component.group.header.g.b(a3, null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                q630 E = s200.E(aVar2, 16, 12);
                String N = d370.N(fVar.a.h(), 0, M);
                boolean z = (i4 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new ld(this, 10);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z0v0.a(s2x.b.a.a(N, gzsVar, null, ylu0Var.getText().m, null, cq.b("notification_select", null, 3), M, 805306368, 244), E, InputSelect$State.Default, true, M, X2.b.f, 0);
                if (((Boolean) ((zak0) this.c).getValue()).booleanValue()) {
                    M.K(1700807002);
                    b((i4 >> 3) & 14, M);
                } else {
                    M.K(1696707190);
                }
                M.j();
                M.G();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j95(this, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(944456940);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(944456940, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingNotificationCellImpl.NotificationPicker (BookingNotificationCell.kt:100)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.ui.f(this, 10);
                M.R(x);
            }
            aVar2 = M;
            a030.c((gzs) x, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, kai.c(1228876951, new cs7(this, 0), M), aVar2, 100663296);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ds7(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        es7 es7Var;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1041456425);
        int i2 = i | (M.J(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1041456425, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingNotificationCellImpl.NotificationPickerContent (BookingNotificationCell.kt:109)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.booking_edit_notification_picker_title, 0, M), null, null, null, null, M, 196608, 30), null, null, cq.b("notification_picker_title", null, 3), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-78024716, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline24> (VkSdkIcons.kt:270)");
            }
            lg90 b2 = or.b(M, -856830611, R.drawable.vk_icon_cancel_outline_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.booking_accessability_close, 0, M);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new m1(this, 8);
                M.R(x);
            }
            muv0.h(a3, null, null, null, null, null, d.a.a(d.c.C0760d.a.a(b2, N, (gzs) x, null, null, cq.b("close_notification_picker", null, 3), M, 1572872, 24), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8126);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                es7Var = this;
                x2 = new r9(es7Var, 9);
                M.R(x2);
            } else {
                es7Var = this;
            }
            aVar2 = M;
            lqy.a(null, null, null, null, null, null, false, null, (izs) x2, aVar2, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            es7Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p00(es7Var, i, 2);
        }
    }

    public final void d(boolean z) {
        ((zak0) this.c).setValue(Boolean.valueOf(z));
    }
}
