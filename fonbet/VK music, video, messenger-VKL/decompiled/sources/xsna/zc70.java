package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xh70;
import xsna.yb70;

/* compiled from: NotificationListView.kt */
/* loaded from: classes4.dex */
public final class zc70 {

    /* compiled from: NotificationListView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NotificationPageState.values().length];
            try {
                iArr[NotificationPageState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationPageState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ListNextState.values().length];
            try {
                iArr2[ListNextState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ListNextState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(final List list, final yjl yjlVar, final int i, final wh50 wh50Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-1716361323);
        int i3 = i2 | (M.J(list) ? 4 : 2) | (M.J(yjlVar) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1716361323, i3, -1, "com.vk.notifications.list.impl.presentation.base.view.list.MilkshakeNotificationCategoryTabs (NotificationListView.kt:415)");
            }
            u6u0.c(i, kai.c(-1181920955, new yzs() { // from class: xsna.sc70
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.jj] */
                /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.a] */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final yvj yvjVar;
                    ?? r1 = (jj) obj;
                    ?? r6 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    int i4 = 2;
                    if ((intValue & 6) == 0) {
                        intValue |= r6.J(r1) ? 4 : 2;
                    }
                    int i5 = intValue;
                    if (r6.t(i5 & 1, (i5 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1181920955, i5, -1, "com.vk.notifications.list.impl.presentation.base.view.list.MilkshakeNotificationCategoryTabs.<anonymous> (NotificationListView.kt:420)");
                        }
                        Object x = r6.x();
                        Object obj4 = a.C0011a.a;
                        if (x == obj4) {
                            x = bap.j(EmptyCoroutineContext.b, r6);
                            r6.R(x);
                        }
                        yvj yvjVar2 = (yvj) x;
                        Object x2 = r6.x();
                        dt1.b bVar = null;
                        if (x2 == obj4) {
                            x2 = androidx.compose.runtime.k.b(null);
                            r6.R(x2);
                        }
                        final wh50 wh50Var2 = (wh50) x2;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(new wow(list2), 10));
                        int i6 = 0;
                        for (Object obj5 : list2) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                ?? r11 = bVar;
                                e43.t();
                                throw r11;
                            }
                            final zi70 zi70Var = (zi70) obj5;
                            final boolean z = i == i6;
                            q630 E = ahn.E(s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4, txj0.C(q630.a.a, bVar, 3)), "NotificationsCategoryTab");
                            boolean l = r6.l(z) | r6.o(i6);
                            final yjl yjlVar2 = yjlVar;
                            boolean J = l | r6.J(yjlVar2);
                            final wh50 wh50Var3 = wh50Var;
                            boolean J2 = J | r6.J(wh50Var3) | r6.y(yvjVar2);
                            Object x3 = r6.x();
                            if (J2 || x3 == obj4) {
                                yvjVar = yvjVar2;
                                final int i8 = i6;
                                gzs gzsVar = new gzs() { // from class: xsna.oc70
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        if (!z) {
                                            yjl yjlVar3 = yjlVar2;
                                            int o = yjlVar3.o();
                                            int i9 = i8;
                                            if (i9 < o) {
                                                wh50Var3.setValue(Integer.valueOf(i9));
                                                wh50 wh50Var4 = wh50Var2;
                                                eyx eyxVar = (eyx) wh50Var4.getValue();
                                                if (eyxVar != null) {
                                                    eyxVar.b(null);
                                                }
                                                wh50Var4.setValue(myc0.h(yvjVar, null, null, new xc70(yjlVar3, i9, null), 3));
                                            }
                                        }
                                        return s3q0.a;
                                    }
                                };
                                r6.R(gzsVar);
                                x3 = gzsVar;
                            } else {
                                yvjVar = yvjVar2;
                            }
                            ArrayList arrayList2 = arrayList;
                            r1.b(z, (gzs) x3, kai.c(-1980035678, new zzs() { // from class: xsna.rc70
                                @Override // xsna.zzs
                                public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    jj jjVar = (jj) obj6;
                                    ((Boolean) obj7).getClass();
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= aVar2.J(jjVar) ? 4 : 2;
                                    }
                                    if (aVar2.t(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1980035678, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.MilkshakeNotificationCategoryTabs.<anonymous>.<anonymous>.<anonymous> (NotificationListView.kt:440)");
                                        }
                                        String str = zi70.this.b;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        jjVar.d(str, wuv0Var.P, aVar2, (intValue2 << 6) & 896);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, r6), E, r6, ((i5 << 12) & 57344) | 3456, 0);
                            arrayList2.add(s3q0.a);
                            arrayList = arrayList2;
                            bVar = null;
                            yvjVar2 = yvjVar;
                            i6 = i7;
                            i4 = 2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        r6.h();
                    }
                    return s3q0.a;
                }
            }, M), ahn.E(q630.a.a, "NotificationsCategoryTabs"), 0L, false, null, null, null, false, M, ((i3 >> 6) & 14) | Tensorflow.FRAME_WIDTH, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ec2(list, yjlVar, i, wh50Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List list, yjl yjlVar, int i, androidx.compose.runtime.a aVar, int i2) {
        List list2;
        yjl yjlVar2;
        androidx.compose.runtime.a M = aVar.M(1364705041);
        int i3 = (M.J(list) ? 4 : 2) | i2 | (M.J(yjlVar) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1364705041, i3, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationCategoryTabs (NotificationListView.kt:346)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qq.h(i, M);
            }
            wh50 wh50Var = (wh50) x;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(list.size());
            int i4 = i3 & 14;
            boolean z = (i4 == 4) | ((i3 & 896) == 256);
            Object x2 = M.x();
            Object obj = null;
            if (z || x2 == c0012a) {
                x2 = new yc70(wh50Var, i, list, null);
                M.R(x2);
            }
            bap.f(valueOf, valueOf2, (wzs) x2, M, (i3 >> 6) & 14);
            Object value = wh50Var.getValue();
            int intValue = ((Number) value).intValue();
            if (intValue >= 0 && intValue < list.size()) {
                obj = value;
            }
            Integer num = (Integer) obj;
            int intValue2 = num != null ? num.intValue() : 0;
            M.K(-231717881);
            list2 = list;
            yjlVar2 = yjlVar;
            a(list2, yjlVar2, intValue2, wh50Var, M, i4 | 3072 | (i3 & 112));
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            list2 = list;
            yjlVar2 = yjlVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u9z(list2, yjlVar2, i, i2);
        }
    }

    public static final void c(t770 t770Var, izs<? super oa70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1653852923);
        int i2 = (M.J(t770Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1653852923, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListAlert (NotificationListView.kt:553)");
            }
            if (t770Var == null) {
                M.K(-1932230100);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1932230099);
                String str = t770Var.a;
                String str2 = t770Var.b;
                String str3 = t770Var.c;
                String str4 = t770Var.d;
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new uy7(izsVar, 4);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean y = (i3 == 32) | M.y(t770Var);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new com.vk.newsfeed.common.recycler.holders.attachments.a(22, izsVar, t770Var);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean y2 = M.y(t770Var) | (i3 == 32);
                Object x3 = M.x();
                if (y2 || x3 == c0012a) {
                    x3 = new defpackage.u(25, izsVar, t770Var);
                    M.R(x3);
                }
                aVar2 = M;
                p7u0.e(str, str2, str3, izsVar2, gzsVar, q630.a.a, str4, null, null, null, null, null, (gzs) x3, aVar2, 196608, 0, 3968);
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
            s.d = new q85(t770Var, izsVar, i, 7);
        }
    }

    public static final void d(dlv0 dlv0Var, xh70 xh70Var, izs<? super oa70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        mqv z;
        akg0 akg0Var;
        androidx.compose.runtime.a M = aVar.M(-1012552970);
        int i2 = i | (M.J(xh70Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1012552970, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListSnackbar (NotificationListView.kt:305)");
            }
            if (epx.f(xh70Var, xh70.b.a)) {
                M.K(-1409873513);
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
                    throw alb0.c(1894181482, M);
                }
                M.K(-1409585802);
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
                    x = new defpackage.a0(dlv0Var, izsVar, xh70Var, 5);
                    M.R(x);
                }
                akg0 q = xx1.q(0, 16380, M, null, N, (gzs) x);
                M.j();
                akg0Var = q;
            }
            mqv mqvVar = z;
            l7k0 b2 = dlv0Var.b();
            zkv0.c(dlv0Var, wlb0.m(b2 != null ? b2.a : null, null, null, M, 6), q630.a.a, mqvVar, akg0Var, null, M, 390, 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fo3(i, 2, dlv0Var, xh70Var, izsVar);
        }
    }

    public static final void e(final int i, final yb70.e eVar, final v6p0 v6p0Var, final izs<? super oa70, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1157464151);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(v6p0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1157464151, i3, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationsPage (NotificationListView.kt:484)");
            }
            int i4 = a.$EnumSwitchMapping$0[eVar.a.a.ordinal()];
            if (i4 != 1) {
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i4 != 2) {
                    M.K(-2016553598);
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    boolean z = eVar.a.a == NotificationPageState.REFRESHING;
                    boolean z2 = (i3 & 7168) == 2048;
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new to0(izsVar, 3);
                        M.R(x);
                    }
                    dge0.a(z, (gzs) x, d, null, null, kai.c(2120874650, new yzs() { // from class: xsna.vc70
                        @Override // xsna.yzs
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(2120874650, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationsPage.<anonymous> (NotificationListView.kt:496)");
                                }
                                q630 E = ahn.E(n34.t(q630.a.a, v6p0.this.a(), null), "NotificationsList");
                                yb70.e eVar2 = eVar;
                                ArrayList arrayList = eVar2.b.a;
                                boolean z3 = eVar2.c;
                                izs izsVar2 = izsVar;
                                boolean J = aVar2.J(izsVar2);
                                Object x2 = aVar2.x();
                                Object obj4 = a.C0011a.a;
                                if (J || x2 == obj4) {
                                    x2 = new qc70(izsVar2, 0);
                                    aVar2.R(x2);
                                }
                                izs izsVar3 = (izs) x2;
                                boolean J2 = aVar2.J(izsVar2);
                                Object x3 = aVar2.x();
                                if (J2 || x3 == obj4) {
                                    x3 = new pc5(izsVar2, 2);
                                    aVar2.R(x3);
                                }
                                izs izsVar4 = (izs) x3;
                                boolean J3 = aVar2.J(izsVar2);
                                Object x4 = aVar2.x();
                                if (J3 || x4 == obj4) {
                                    x4 = new p0(izsVar2, 3);
                                    aVar2.R(x4);
                                }
                                izs izsVar5 = (izs) x4;
                                boolean J4 = aVar2.J(izsVar2);
                                int i5 = i;
                                boolean o = J4 | aVar2.o(i5);
                                Object x5 = aVar2.x();
                                if (o || x5 == obj4) {
                                    x5 = new ufa(i5, 1, izsVar2);
                                    aVar2.R(x5);
                                }
                                gzs gzsVar = (gzs) x5;
                                boolean J5 = aVar2.J(izsVar2);
                                Object x6 = aVar2.x();
                                if (J5 || x6 == obj4) {
                                    x6 = new l6u(izsVar2, 22);
                                    aVar2.R(x6);
                                }
                                izs izsVar6 = (izs) x6;
                                boolean o2 = aVar2.o(i5) | aVar2.J(eVar2) | aVar2.J(izsVar2);
                                Object x7 = aVar2.x();
                                if (o2 || x7 == obj4) {
                                    x7 = new x28(i5, eVar2, izsVar2);
                                    aVar2.R(x7);
                                }
                                ub70.c(arrayList, izsVar3, izsVar4, izsVar5, gzsVar, E, z3, null, izsVar6, (izs) x7, aVar2, 0, 128);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, 196992, 24);
                    M.j();
                } else {
                    M.K(73491770);
                    boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
                    Object x2 = M.x();
                    if (z3 || x2 == c0012a) {
                        x2 = new uc70(i, 0, izsVar);
                        M.R(x2);
                    }
                    vwp.a(0, 1, M, (gzs) x2, null);
                    M.j();
                }
            } else {
                M.K(73489726);
                cd70.a(0, M);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wc70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zc70.e(i, eVar, v6p0Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(yjl yjlVar, final yb70.f fVar, final v6p0 v6p0Var, final yb70.g gVar, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1247036355);
        int i2 = i | (M.J(yjlVar) ? 4 : 2) | (M.J(fVar) ? 32 : 16) | (M.J(v6p0Var) ? 256 : 128) | (M.J(gVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1247036355, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationsViewPager (NotificationListView.kt:458)");
            }
            aVar2 = M;
            nb90.a(yjlVar, null, null, null, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(-1562911362, new zzs() { // from class: xsna.pc70
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1562911362, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationsViewPager.<anonymous> (NotificationListView.kt:463)");
                    }
                    yb70.e eVar = (yb70.e) yb70.f.this.a.get(intValue);
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d2, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    v6p0 v6p0Var2 = v6p0Var;
                    izs izsVar2 = izsVar;
                    zc70.e(intValue, eVar, v6p0Var2, izsVar2, aVar3, (intValue2 >> 3) & 14);
                    zc70.c(gVar.c, izsVar2, aVar3, 0);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 24576, 24576, 16366);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new x1k(yjlVar, fVar, v6p0Var, gVar, izsVar, i, 1);
        }
    }
}
