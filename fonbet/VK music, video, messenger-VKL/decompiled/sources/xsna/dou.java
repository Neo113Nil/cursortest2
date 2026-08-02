package xsna;

import androidx.compose.runtime.a;
import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vkontakte.android.R;
import xsna.xh70;

/* compiled from: GroupedNotificationListView.kt */
/* loaded from: classes4.dex */
public final class dou {

    /* compiled from: GroupedNotificationListView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListNextState.values().length];
            try {
                iArr[ListNextState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListNextState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(umu umuVar, izs<? super vmu, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(106830707);
        int i2 = (M.J(umuVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(106830707, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListAlert (GroupedNotificationListView.kt:247)");
            }
            if (umuVar == null) {
                M.K(23006880);
                M.j();
                aVar2 = M;
            } else {
                M.K(23006881);
                String str = umuVar.a;
                String str2 = umuVar.b;
                String str3 = umuVar.c;
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new lse(izsVar, 1);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean y = (i3 == 32) | M.y(umuVar);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.logic.processor.actions.e(9, izsVar, umuVar);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                String str4 = umuVar.d;
                boolean y2 = M.y(umuVar) | (i3 == 32);
                Object x3 = M.x();
                if (y2 || x3 == c0012a) {
                    x3 = new j3(13, izsVar, umuVar);
                    M.R(x3);
                }
                aVar2 = M;
                p7u0.e(str, str2, str3, izsVar2, gzsVar, null, str4, null, null, null, null, null, (gzs) x3, aVar2, 0, 0, 4000);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bc1(umuVar, izsVar, i, 4);
        }
    }

    public static final void b(dlv0 dlv0Var, xh70 xh70Var, izs<? super vmu, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        mqv z;
        akg0 akg0Var;
        androidx.compose.runtime.a M = aVar.M(1000895322);
        int i2 = i | (M.J(xh70Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1000895322, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListSnackbar (GroupedNotificationListView.kt:180)");
            }
            if (epx.f(xh70Var, xh70.b.a)) {
                M.K(2009918707);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1522720900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorCircleOutline28> (VkSdkIcons.kt:804)");
                }
                lg90 b = or.b(M, 66431199, R.drawable.vk_icon_error_circle_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(b, ylu0Var.getIcon().h, M);
                M.j();
                akg0Var = null;
            } else {
                if (!(xh70Var instanceof xh70.a)) {
                    throw alb0.c(-212259947, M);
                }
                M.K(2010206635);
                qzu0.a.getClass();
                lg90 t = qzu0.t(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z = s200.z(t, ylu0Var2.getIcon().i, M);
                String N = d370.N(R.string.notification_list_dot_menu_cancel_action, 0, M);
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new b1d(dlv0Var, izsVar, xh70Var, 2);
                    M.R(x);
                }
                akg0 q = xx1.q(0, 16380, M, null, N, (gzs) x);
                M.j();
                akg0Var = q;
            }
            mqv mqvVar = z;
            l7k0 b2 = dlv0Var.b();
            zkv0.c(dlv0Var, wlb0.m(b2 != null ? b2.a : null, null, null, M, 6), null, mqvVar, akg0Var, null, M, 6, 100);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr3(dlv0Var, xh70Var, izsVar, i, 1);
        }
    }
}
