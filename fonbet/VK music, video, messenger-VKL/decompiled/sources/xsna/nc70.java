package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;
import xsna.v6p0;
import xsna.xh70;
import xsna.yb70;

/* compiled from: NotificationListView.kt */
/* loaded from: classes4.dex */
public final class nc70 extends i6v0<ad70, oa70> {
    public final mzp0 f;

    public nc70(f5z f5zVar, Context context, mzp0 mzp0Var) {
        super(context, f5zVar);
        this.f = mzp0Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((ad70) ao50Var, izsVar, aVar, 512);
    }

    public final void h(final String str, final yb70.f fVar, final yb70.g gVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(2049648162);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(gVar) : M.y(gVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        boolean z = true;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2049648162, i4, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface (NotificationListView.kt:140)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x;
            x6p0 A = m200.A(M);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new aq0(10);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(439292564, 48, -1, "com.vk.notifications.list.impl.presentation.base.view.list.createDirectedScrollSpanBehavior (ScrollBehaviour.kt:19)");
            }
            boolean z2 = false;
            final rmp a = v6p0.a.a(A, gzsVar, c, M, 196656, 20);
            Integer valueOf = Integer.valueOf(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation);
            boolean J = M.J(A);
            Object x3 = M.x();
            if (J || x3 == obj) {
                x3 = new seh0(A, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xh70 xh70Var = gVar.b;
            if (epx.f(xh70Var, xh70.b.a)) {
                i3 = R.string.notification_list_general_error_message;
            } else {
                if (!(xh70Var instanceof xh70.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.notification_list_notification_deleted_success;
            }
            String N = d370.N(i3, 0, M);
            Integer valueOf2 = Integer.valueOf(gVar.a);
            boolean J2 = ((i4 & 896) == 256 || ((i4 & 512) != 0 && M.y(gVar))) | M.J(N);
            Object x4 = M.x();
            if (J2 || x4 == obj) {
                x4 = new jc70(gVar, dlv0Var, N, null);
                M.R(x4);
            }
            bap.g(valueOf2, (wzs) x4, M, 0);
            int i5 = i4 & 112;
            boolean z3 = i5 == 32;
            Object x5 = M.x();
            if (z3 || x5 == obj) {
                x5 = new f550(fVar, 7);
                M.R(x5);
            }
            final yjl b = rc90.b(0, (gzs) x5, M, 0, 3);
            int i6 = i5 | ((i4 >> 3) & 896) | 4096 | ((i4 >> 6) & 7168);
            int i7 = i4;
            j(b, fVar, izsVar, M, i6);
            ArrayList arrayList = fVar.a;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else {
                        if (((yb70.e) it.next()).a.a == NotificationPageState.CONTENT) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            Boolean valueOf3 = Boolean.valueOf(z2);
            boolean l = M.l(z2);
            if ((i7 & 458752) != 131072 && ((i7 & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 || !M.y(this))) {
                z = false;
            }
            boolean z4 = l | z;
            Object x6 = M.x();
            if (z4 || x6 == obj) {
                x6 = new kc70(z2, this, null);
                M.R(x6);
            }
            bap.g(valueOf3, (wzs) x6, M, 0);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            jai c2 = kai.c(-117310405, new wzs() { // from class: xsna.hc70
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-117310405, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface.<anonymous> (NotificationListView.kt:176)");
                        }
                        q630 E = ahn.E(q630.a.a, "NotificationsAppBar");
                        String str2 = str;
                        if (str2 == null) {
                            str2 = zq.a(aVar3, -1066144005, R.string.not_notifications, aVar3, 0);
                        } else {
                            aVar3.K(-1066144284);
                            aVar3.j();
                        }
                        String str3 = str2;
                        izs izsVar2 = izsVar;
                        boolean J3 = aVar3.J(izsVar2);
                        Object x7 = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (J3 || x7 == obj4) {
                            x7 = new a97(izsVar2, 8);
                            aVar3.R(x7);
                        }
                        gzs gzsVar2 = (gzs) x7;
                        boolean J4 = aVar3.J(izsVar2);
                        Object x8 = aVar3.x();
                        if (J4 || x8 == obj4) {
                            x8 = new b97(izsVar2, 5);
                            aVar3.R(x8);
                        }
                        ra70.b(str3, gzsVar2, (gzs) x8, a, E, kai.c(1618561608, new gd1(4, fVar, b), aVar3), aVar3, 221184, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M);
            jai c3 = kai.c(12554173, new cr7(dlv0Var, gVar, izsVar, 6), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(d, c2, null, c3, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1094026170, new yzs() { // from class: xsna.ic70
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1094026170, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface.<anonymous> (NotificationListView.kt:196)");
                        }
                        q630 d2 = txj0.d(q630.a.a, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getBackground().g;
                        final yb70.f fVar2 = yb70.f.this;
                        final yjl yjlVar = b;
                        final v6p0 v6p0Var = a;
                        final yb70.g gVar2 = gVar;
                        final izs izsVar2 = izsVar;
                        uov0.a(d2, null, j, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1309944673, new wzs() { // from class: xsna.gc70
                            @Override // xsna.wzs
                            public final Object invoke(Object obj5, Object obj6) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1309944673, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface.<anonymous>.<anonymous> (NotificationListView.kt:200)");
                                    }
                                    yb70.f fVar3 = yb70.f.this;
                                    boolean isEmpty = fVar3.b.isEmpty();
                                    v6p0 v6p0Var2 = v6p0Var;
                                    izs izsVar3 = izsVar2;
                                    if (isEmpty) {
                                        aVar4.K(-488489709);
                                        zc70.e(0, (yb70.e) fVar3.a.get(0), v6p0Var2, izsVar3, aVar4, 6);
                                        aVar4.j();
                                    } else {
                                        aVar4.K(-488833716);
                                        zc70.f(yjlVar, fVar3, v6p0Var2, gVar2, izsVar3, aVar4, 0);
                                        aVar4.j();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 1572870, 58);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309488, 372);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l2a(this, str, fVar, gVar, izsVar, q630Var2, i);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(740050559);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(740050559, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.LoadingContentSurface (NotificationListView.kt:261)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            jai c = kai.c(179236422, new dd4(gzsVar, 6), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, tii.b, aVar2, 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a9c(i, 3, this, q630Var2, gzsVar);
        }
    }

    public final void j(final yjl yjlVar, final yb70.f fVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(326072727);
        if ((i & 6) == 0) {
            i2 = (M.J(yjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(326072727, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.NotificationListPagerSynchronizationEffects (NotificationListView.kt:225)");
            }
            int i3 = fVar.c;
            List list = fVar.b;
            Integer valueOf = Integer.valueOf(i3);
            Integer valueOf2 = Integer.valueOf(list.size());
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new lc70(fVar, yjlVar, null);
                M.R(x);
            }
            bap.f(valueOf, valueOf2, (wzs) x, M, 0);
            Integer valueOf3 = Integer.valueOf(list.size());
            Integer valueOf4 = Integer.valueOf(fVar.c);
            boolean z2 = (i5 == 4) | (i4 == 32) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new mc70(yjlVar, fVar, izsVar, null);
                M.R(x2);
            }
            bap.e(yjlVar, valueOf3, valueOf4, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fc70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nc70.this.j(yjlVar, fVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(ad70 ad70Var, izs<? super oa70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1851834586);
        int i2 = (M.J(ad70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1851834586, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ThemedContent (NotificationListView.kt:92)");
            }
            int i3 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            M.K(851217452);
            rrv0.d(null, null, null, null, kai.c(1717543151, new vb5(this, ad70Var, izsVar, 3), M), M, 24576, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zle(i, 5, this, ad70Var, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(ad70 ad70Var, izs<? super oa70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(987169528);
        int i2 = (M.J(ad70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(987169528, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ThemedContentImplementation (NotificationListView.kt:110)");
            }
            int i3 = i2 & 896;
            yb70 yb70Var = (yb70) d(yb70.b.a, new n0u0[]{ad70Var.a}, M, 518 | i3).getValue();
            if (yb70Var instanceof yb70.b) {
                M.K(1126706829);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new d97(izsVar, 3);
                    M.R(x);
                }
                i(i3 | 512, M, (gzs) x, null);
                M.j();
            } else {
                if (!(yb70Var instanceof yb70.a)) {
                    throw alb0.c(-517846295, M);
                }
                M.K(1126921070);
                yb70.a aVar2 = (yb70.a) yb70Var;
                h(aVar2.a.a(), (yb70.f) jk50.c(aVar2.b, M).getValue(), (yb70.g) jk50.c(aVar2.c, M).getValue(), izsVar, null, M, ((i2 << 6) & 7168) | SQLiteDatabase.OPEN_PRIVATECACHE | ((i2 << 9) & 458752));
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
            s.d = new br0(i, 10, this, ad70Var, izsVar);
        }
    }
}
