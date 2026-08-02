package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: BookingEditScreenMviView.kt */
/* loaded from: classes18.dex */
public final class yp7 extends i6v0<hq7, com.vk.ecomm.onlinebooking.impl.edit.a> {
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;
    public final q630 j;

    /* compiled from: BookingEditScreenMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingEditModel.EditMode.values().length];
            try {
                iArr[BookingEditModel.EditMode.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingEditModel.EditMode.Reschedule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingEditModel.EditMode.Overview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yp7(Context context, f5z f5zVar) {
        super(context, f5zVar);
        q630.a aVar = q630.a.a;
        this.f = ahn.E(txj0.f(aVar, 1.0f), "container_view");
        float f = 12;
        this.g = txj0.h(aVar, f);
        this.h = txj0.h(aVar, 1);
        float f2 = 16;
        this.i = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar, f));
        this.j = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar, 7));
    }

    public static void j(yp7 yp7Var, nvy nvyVar, String str) {
        nvy.g(nvyVar, str, null, new jai(-1841774146, new op7(yp7Var.i, 0), true), 2);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((hq7) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(hq7 hq7Var, final izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(705115653);
        int i2 = i | (M.J(hq7Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(705115653, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.ThemedContent (BookingEditScreenMviView.kt:81)");
            }
            T value = d(fq7.a, new n0u0[]{hq7Var.a}, M, (i2 & 896) | 518).getValue();
            final com.vk.ecomm.onlinebooking.impl.edit.q qVar = value instanceof com.vk.ecomm.onlinebooking.impl.edit.q ? (com.vk.ecomm.onlinebooking.impl.edit.q) value : null;
            if (qVar != null) {
                M.K(-584317141);
                int i3 = i2 & 112;
                ro7.a(jk50.a(qVar.b, M, 0, 3), izsVar, M, i3);
                cvk.i(jk50.c(qVar.m, M), izsVar, M, i3);
                final wh50 c = jk50.c(qVar.c, M);
                final gq7 gq7Var = (gq7) jk50.a(qVar.a, M, 0, 3).getValue();
                jai c2 = kai.c(-1231056455, new h06(this, qVar, izsVar), M);
                jai c3 = kai.c(-224133766, new wzs() { // from class: xsna.vp7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-224133766, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.ThemedContent.<anonymous> (BookingEditScreenMviView.kt:101)");
                            }
                            if (gq7.this == null) {
                                aVar3.K(1505173309);
                                com.vk.ecomm.onlinebooking.impl.edit.q qVar2 = qVar;
                                mo7.a(jk50.c(qVar2.h, aVar3), c, (String) jk50.c(qVar2.j, aVar3).getValue(), izsVar, aVar3, 0);
                            } else {
                                aVar3.K(1500387560);
                            }
                            aVar3.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                phv0.b(null, c2, c3, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-137918524, new wp7(qVar, this, gq7Var, izsVar, c, 0), M), M, 805306800, 377);
                aVar2 = M;
            } else {
                aVar2 = M;
                aVar2.K(-588549571);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mq0(i, 1, this, hq7Var, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(com.vk.ecomm.onlinebooking.impl.edit.q qVar, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String a2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1865843724);
        int i3 = i | (M.J(qVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1865843724, i3, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.TopBar (BookingEditScreenMviView.kt:154)");
            }
            int i4 = a.$EnumSwitchMapping$0[((BookingEditModel.EditMode) jk50.c(qVar.d, M).getValue()).ordinal()];
            if (i4 == 1 || i4 == 2) {
                a2 = zq.a(M, 116628758, R.string.booking_edit_title_editing, M, 0);
            } else {
                if (i4 != 3) {
                    throw alb0.c(-2074451860, M);
                }
                a2 = zq.a(M, 116767669, R.string.booking_edit_title_overview, M, 0);
            }
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new zn1(izsVar, 2);
                M.R(x);
            }
            TopBar$Before.e a3 = e.a.a((gzs) x, d370.N(R.string.booking_accessability_back, 0, M), null, null, cq.b("back_button", null, 3), M, 196608, 12);
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(a2, null, null, null, null, M, 196608, 30), null, null, cq.b("screen_title", null, 3), M, 6);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            } else {
                i2 = 0;
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.booking_accessability_close, i2, M);
            int i6 = i5 == 32 ? 1 : i2;
            Object x2 = M.x();
            if (i6 != 0 || x2 == c0012a) {
                x2 = new gc0(izsVar, 1);
                M.R(x2);
            }
            muv0.h(a4, null, null, null, a3, null, d.a.a(d.c.C0760d.a.a(b, N, (gzs) x2, null, null, null, M, 1572872, 56), null, null, cq.b("close_button", null, 3), M, 24576, 6), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8110);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 1, this, qVar, izsVar);
        }
    }
}
