package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dt1;
import xsna.q630;
import xsna.unu;
import xsna.xh70;

/* compiled from: GroupedNotificationListView.kt */
/* loaded from: classes4.dex */
public final class cou extends i6v0<eou, vmu> {
    public cou(Context context, f5z f5zVar) {
        super(context, f5zVar);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((eou) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(unu.a aVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        int i2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar2.M(1386081501);
        int i5 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            i5 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1386081501, i5, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface (GroupedNotificationListView.kt:81)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            yzt0<Boolean> yzt0Var = aVar.a;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            final wh50 d2 = jk50.d(aVar.b, bool, M, 48);
            wh50 d3 = jk50.d(aVar.c, bool, M, 48);
            final wh50 c = jk50.c(aVar.d, M);
            final wh50 a = jk50.a(aVar.e, M, 0, 3);
            final wh50 c2 = jk50.c(aVar.f, M);
            wh50 a2 = jk50.a(aVar.g, M, 0, 3);
            final wh50 a3 = jk50.a(aVar.j, M, 0, 3);
            wh50 d4 = jk50.d(aVar.h, 0, M, 48);
            wh50 c3 = jk50.c(aVar.i, M);
            xh70 xh70Var = (xh70) c3.getValue();
            if (androidx.compose.runtime.b.d()) {
                wh50Var = d;
                wh50Var2 = d3;
                wh50Var3 = a2;
                i2 = 0;
                androidx.compose.runtime.b.f(-1495173107, 0, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.getSnackBarText (GroupedNotificationListView.kt:168)");
            } else {
                wh50Var = d;
                wh50Var2 = d3;
                wh50Var3 = a2;
                i2 = 0;
            }
            if (epx.f(xh70Var, xh70.b.a)) {
                i3 = 1952693165;
                i4 = R.string.notification_list_general_error_message;
            } else {
                if (!(xh70Var instanceof xh70.a)) {
                    throw alb0.c(1952691572, M);
                }
                i3 = 1952697332;
                i4 = R.string.notification_list_notification_deleted_success;
            }
            String a4 = zq.a(M, i3, i4, M, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Integer valueOf = Integer.valueOf(((Number) d4.getValue()).intValue());
            boolean J = M.J(d4) | M.J(a4);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new bou(dlv0Var, a4, d4, null);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, 0);
            q630.a aVar4 = q630.a.a;
            q630 d5 = txj0.d(aVar4, 1.0f);
            jai c4 = kai.c(1978061028, new wzs() { // from class: xsna.xnu
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    CharSequence a5;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar5.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1978061028, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface.<anonymous> (GroupedNotificationListView.kt:105)");
                        }
                        tlo0 tlo0Var = (tlo0) a.getValue();
                        String obj3 = (tlo0Var == null || (a5 = tlo0Var.a(cou.this.c)) == null) ? null : a5.toString();
                        if (obj3 == null) {
                            obj3 = zq.a(aVar5, -1753859644, R.string.not_notifications, aVar5, 0);
                        } else {
                            aVar5.K(-1753861628);
                            aVar5.j();
                        }
                        String str = obj3;
                        boolean booleanValue = ((Boolean) c2.getValue()).booleanValue();
                        izs izsVar2 = izsVar;
                        boolean J2 = aVar5.J(izsVar2);
                        Object x3 = aVar5.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (J2 || x3 == c0012a2) {
                            x3 = new dn7(izsVar2, 4);
                            aVar5.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean J3 = aVar5.J(izsVar2);
                        Object x4 = aVar5.x();
                        if (J3 || x4 == c0012a2) {
                            x4 = new vpd(izsVar2, 3);
                            aVar5.R(x4);
                        }
                        xmu.a(24576, aVar5, str, gzsVar, (gzs) x4, ahn.E(q630.a.a, "NotificationsAppBar"), booleanValue);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M);
            jai c5 = kai.c(1110133666, new nwo(dlv0Var, izsVar, c3), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final wh50 wh50Var4 = wh50Var;
            final wh50 wh50Var5 = wh50Var2;
            final wh50 wh50Var6 = wh50Var3;
            phv0.b(d5, c4, null, c5, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1568966855, new yzs() { // from class: xsna.ynu
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar5.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1568966855, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface.<anonymous> (GroupedNotificationListView.kt:117)");
                        }
                        q630 d6 = txj0.d(q630.a.a, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getBackground().g;
                        final izs izsVar2 = izs.this;
                        final mtk0 mtk0Var = d2;
                        final mtk0 mtk0Var2 = wh50Var6;
                        final mtk0 mtk0Var3 = wh50Var4;
                        final mtk0 mtk0Var4 = wh50Var5;
                        final mtk0 mtk0Var5 = c;
                        final mtk0 mtk0Var6 = a3;
                        uov0.a(d6, null, j, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(281796864, new wzs() { // from class: xsna.znu
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(281796864, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface.<anonymous>.<anonymous> (GroupedNotificationListView.kt:121)");
                                    }
                                    boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                                    final izs izsVar3 = izs.this;
                                    boolean J2 = aVar6.J(izsVar3);
                                    Object x3 = aVar6.x();
                                    if (J2 || x3 == a.C0011a.a) {
                                        x3 = new nyg(izsVar3, 2);
                                        aVar6.R(x3);
                                    }
                                    q630 d7 = txj0.d(q630.a.a, 1.0f);
                                    dt1.a.getClass();
                                    ty6 ty6Var = dt1.a.f;
                                    final mtk0 mtk0Var7 = mtk0Var2;
                                    final mtk0 mtk0Var8 = mtk0Var3;
                                    final mtk0 mtk0Var9 = mtk0Var4;
                                    final mtk0 mtk0Var10 = mtk0Var5;
                                    final mtk0 mtk0Var11 = mtk0Var6;
                                    dge0.a(booleanValue, (gzs) x3, d7, null, ty6Var, kai.c(-1473979438, new yzs() { // from class: xsna.aou
                                        /* JADX WARN: Removed duplicated region for block: B:15:0x0141  */
                                        @Override // xsna.yzs
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            izs izsVar4;
                                            androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj7;
                                            int intValue3 = ((Integer) obj8).intValue();
                                            if (aVar7.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1473979438, intValue3, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ContentSurface.<anonymous>.<anonymous>.<anonymous> (GroupedNotificationListView.kt:128)");
                                                }
                                                boolean booleanValue2 = ((Boolean) mtk0Var8.getValue()).booleanValue();
                                                izs izsVar5 = izs.this;
                                                if (booleanValue2) {
                                                    aVar7.K(844969900);
                                                    cc70.a(0, aVar7);
                                                    aVar7.j();
                                                } else {
                                                    boolean booleanValue3 = ((Boolean) mtk0Var9.getValue()).booleanValue();
                                                    Object obj9 = a.C0011a.a;
                                                    if (booleanValue3) {
                                                        aVar7.K(844971972);
                                                        boolean J3 = aVar7.J(izsVar5);
                                                        Object x4 = aVar7.x();
                                                        if (J3 || x4 == obj9) {
                                                            x4 = new k74(izsVar5, 6);
                                                            aVar7.R(x4);
                                                        }
                                                        vwp.a(0, 1, aVar7, (gzs) x4, null);
                                                        aVar7.j();
                                                    } else {
                                                        aVar7.K(424480467);
                                                        q630 E = ahn.E(q630.a.a, "NotificationsGroupedList");
                                                        List list = (List) mtk0Var10.getValue();
                                                        boolean J4 = aVar7.J(izsVar5);
                                                        Object x5 = aVar7.x();
                                                        if (J4 || x5 == obj9) {
                                                            x5 = new wzf(izsVar5, 23);
                                                            aVar7.R(x5);
                                                        }
                                                        izs izsVar6 = (izs) x5;
                                                        boolean J5 = aVar7.J(izsVar5);
                                                        Object x6 = aVar7.x();
                                                        if (J5 || x6 == obj9) {
                                                            x6 = new oz7(izsVar5, 2);
                                                            aVar7.R(x6);
                                                        }
                                                        izs izsVar7 = (izs) x6;
                                                        boolean J6 = aVar7.J(izsVar5);
                                                        Object x7 = aVar7.x();
                                                        if (J6 || x7 == obj9) {
                                                            x7 = new opd(izsVar5, 3);
                                                            aVar7.R(x7);
                                                        }
                                                        izs izsVar8 = (izs) x7;
                                                        boolean J7 = aVar7.J(izsVar5);
                                                        Object x8 = aVar7.x();
                                                        if (J7 || x8 == obj9) {
                                                            x8 = new src(izsVar5, 2);
                                                            aVar7.R(x8);
                                                        }
                                                        gzs gzsVar = (gzs) x8;
                                                        Object obj10 = mtk0Var7;
                                                        boolean J8 = aVar7.J(obj10) | aVar7.J(izsVar5);
                                                        Object x9 = aVar7.x();
                                                        if (J8 || x9 == obj9) {
                                                            x9 = new yl0(11, izsVar5, obj10);
                                                            aVar7.R(x9);
                                                        }
                                                        izsVar4 = izsVar5;
                                                        ub70.c(list, izsVar6, izsVar7, izsVar8, gzsVar, E, false, null, null, (izs) x9, aVar7, 196608, 448);
                                                        aVar7.j();
                                                        dou.a((umu) mtk0Var11.getValue(), izsVar4, aVar7, 0);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    }
                                                }
                                                izsVar4 = izsVar5;
                                                dou.a((umu) mtk0Var11.getValue(), izsVar4, aVar7, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                }
                                            } else {
                                                aVar7.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar6), aVar6, 221568, 8);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar6.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar5), aVar5, 1572870, 58);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309488, 372);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wx9(this, aVar, izsVar, q630Var2, i);
        }
    }

    public final void i(eou eouVar, izs<? super vmu, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(302739958);
        int i2 = (M.J(eouVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(302739958, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.grouped.GroupedNotificationListView.ThemedContent (GroupedNotificationListView.kt:58)");
            }
            unu unuVar = (unu) d(unu.b.a, new n0u0[]{eouVar.a}, M, (i2 & 896) | 518).getValue();
            if (unuVar instanceof unu.a) {
                M.K(-504803594);
                h((unu.a) unuVar, izsVar, null, M, (i2 & 112) | 4096 | ((i2 << 3) & 7168));
                M.j();
            } else {
                M.K(-1124657286);
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
            s.d = new w2k(this, eouVar, izsVar, i, 2);
        }
    }
}
