package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vkontakte.android.R;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;

/* compiled from: DeliveryPointDetails.kt */
/* loaded from: classes18.dex */
public final class hwl {

    /* compiled from: DeliveryPointDetails.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryPoint.OpenStatus.Status.values().length];
            try {
                iArr[DeliveryPoint.OpenStatus.Status.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryPoint.OpenStatus.Status.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryPoint.OpenStatus.Status.BREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeliveryPoint.OpenStatus.Status.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-557384626);
        int i2 = (M.J(str) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-557384626, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointAddress (DeliveryPointDetails.kt:116)");
            }
            qzu0.a.getClass();
            e(qzu0.b1(M), d370.N(R.string.ecomm_delivery_points_address, 0, M), kai.c(-1388951098, new xa2(str, 4), M), M, 3464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og4(str, q630Var, i, 4);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1971442104);
        int i2 = (M.J(str) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1971442104, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointAddressDetails (DeliveryPointDetails.kt:232)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(738709218, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArticleOutline20> (VkIcons.kt:490)");
            }
            lg90 b = or.b(M, -525936703, R.drawable.vk_icon_article_outline_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            e(b, d370.N(R.string.ecomm_delivery_points_address_details, 0, M), kai.c(-935400128, new dr0(str, 5), M), M, 3464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(str, q630Var, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
    
        if (r5 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(boolean z, DeliveryPoint.WeekDay weekDay, DeliveryPoint.WeekDayTimetable weekDayTimetable, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        long j;
        boolean z2;
        String b;
        androidx.compose.runtime.a M = aVar.M(714439918);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.o(weekDay.ordinal()) ? 32 : 16) | (M.J(weekDayTimetable) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(714439918, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointDayTimetableCell (DeliveryPointDetails.kt:193)");
            }
            if (z) {
                M.K(-1978070395);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().m;
                M.j();
            } else {
                M.K(-1978017819);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().r;
                M.j();
            }
            q630.a aVar3 = q630.a.a;
            q630 j2 = txj0.j(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, j2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.v(aVar3, 48), M, 6);
            int i3 = (i2 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-374469031, i3, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.getTitle (DeliveryPointDetails.kt:303)");
            }
            String str = d370.M(R.array.ecomm_delivery_points_weekdays, M)[weekDay.ordinal()];
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 x = txj0.x(52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            if (androidx.compose.runtime.b.d()) {
                z2 = false;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                z2 = false;
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j3 = j;
            yqv0.c(str, x, j3, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.c0, M, 48, 0, 8120);
            DeliveryPoint.TimetableBreak timetableBreak = weekDayTimetable.d;
            String str2 = weekDayTimetable.c;
            String str3 = weekDayTimetable.b;
            if (timetableBreak != null) {
                StringBuilder b2 = ho8.b(str3, " – ");
                b2.append(timetableBreak.b);
                b2.append(", ");
                b = tdj.a(b2, timetableBreak.c, " – ", str2);
            }
            b = pzl.b(str3, " – ", str2);
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(b, F, j3, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.c0, aVar2, 48, 0, 8184);
            aVar2.G();
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
            s.d = new rc5(z, weekDay, weekDayTimetable, q630Var2, i);
        }
    }

    public static final void d(izs izsVar, kyl.e.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        izs izsVar2;
        kyl.e.d dVar2;
        androidx.compose.runtime.a M = aVar.M(-1551315244);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(dVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1551315244, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointDetails (DeliveryPointDetails.kt:47)");
            }
            DeliveryPoint deliveryPoint = dVar.d;
            q630 D = p490.D(q630Var, p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = deliveryPoint.f;
            DeliveryPoint.WorkingInfo workingInfo = deliveryPoint.h;
            DeliveryPoint.Address address = deliveryPoint.g;
            izsVar2 = izsVar;
            dVar2 = dVar;
            f(dVar2, izsVar2, str, null, M, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
            a(address.b, null, M, 0);
            DeliveryPoint.OpenStatus openStatus = workingInfo != null ? workingInfo.b : null;
            if (openStatus == null) {
                M.K(-1140229596);
            } else {
                M.K(-1140229595);
                g(openStatus, null, M, 0);
            }
            M.j();
            Map<DeliveryPoint.WeekDay, DeliveryPoint.WeekDayTimetable> map = workingInfo != null ? workingInfo.d : null;
            if (map == null) {
                M.K(-1140074782);
            } else {
                M.K(-1140074781);
                h(dVar2.e, map, null, M, 0);
            }
            M.j();
            String str2 = address.e;
            if (str2 == null) {
                M.K(-1139858836);
            } else {
                M.K(-1139858835);
                b(str2, null, M, 0);
            }
            M.j();
            f9t.e(txj0.h(q630.a.a, pwl.a + 8), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            dVar2 = dVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new em(izsVar2, dVar2, q630Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [xsna.jai] */
    public static final void e(lg90 lg90Var, String str, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        jai jaiVar2;
        ColorFilter porterDuffColorFilter;
        lg90 lg90Var2 = lg90Var;
        String str2 = str;
        jai jaiVar3 = jaiVar;
        androidx.compose.runtime.a M = aVar.M(1223777024);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar3) ? 2048 : 1024;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1223777024, i4, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointDetailsCell (DeliveryPointDetails.kt:254)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            q630 E = s200.E(txj0.f(aVar2, 1.0f), 16, 10);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            int i5 = 5;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                i5 = 5;
            }
            str2 = str;
            lg90Var2 = lg90Var;
            vjw.a(lg90Var2, str2, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, i5, porterDuffColorFilter), M, (i4 & 14) | 8 | (i4 & 112), 60);
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            ?? r10 = jaiVar;
            r10.invoke(M, Integer.valueOf((i4 >> 9) & 14));
            M.G();
            M.G();
            jaiVar2 = r10;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                jaiVar2 = r10;
            }
        } else {
            M.h();
            jaiVar2 = jaiVar3;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ty5(lg90Var2, str2, jaiVar2, i);
        }
    }

    public static final void f(final kyl.e.d dVar, final izs izsVar, final String str, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        TopBar$Before.d dVar2;
        androidx.compose.runtime.a M = aVar.M(761989836);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(761989836, i3, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointHeader (DeliveryPointDetails.kt:91)");
            }
            int i4 = i3 >> 6;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i4 & 14) | 196608, 30), null, null, null, M, 14);
            if (dVar.c) {
                M.K(1537504679);
                String N = d370.N(R.string.ecomm_delivery_points_close, 0, M);
                boolean z = (i3 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new gy7(izsVar, 1);
                    M.R(x);
                }
                dVar2 = TopBar$Before.d.a.a(N, (gzs) x, null, null, M, 24576, 12);
                M.j();
            } else {
                M.K(1537771930);
                M.j();
                dVar2 = null;
            }
            TopBar$Before.d dVar3 = dVar2;
            q630.a aVar2 = q630.a.a;
            muv0.h(a2, aVar2, null, null, null, dVar3, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i4 & 112, 0, 8156);
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
            s.d = new wzs() { // from class: xsna.gwl
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hwl.f(kyl.e.d.this, izsVar, str, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(DeliveryPoint.OpenStatus openStatus, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-617930869);
        int i2 = (M.J(openStatus) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-617930869, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointOpenStatus (DeliveryPointDetails.kt:136)");
            }
            qzu0.a.getClass();
            e(qzu0.h1(M), d370.N(R.string.ecomm_delivery_points_worktime, 0, M), kai.c(-1317406461, new com.vk.movika.sdk.android.defaultplayer.control.n(openStatus, 4), M), M, 3464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(openStatus, q630Var, i, 3);
        }
    }

    public static final void h(DeliveryPoint.WeekDay weekDay, Map map, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1805882340);
        int i2 = (M.o(weekDay.ordinal()) ? 4 : 2) | i | (M.J(map) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1805882340, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointWeekTimetable (DeliveryPointDetails.kt:172)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            M.K(-815386802);
            for (Map.Entry entry : map.entrySet()) {
                DeliveryPoint.WeekDay weekDay2 = (DeliveryPoint.WeekDay) entry.getKey();
                DeliveryPoint.WeekDayTimetable weekDayTimetable = (DeliveryPoint.WeekDayTimetable) entry.getValue();
                if (weekDayTimetable != null) {
                    c(weekDay2 == weekDay, weekDay2, weekDayTimetable, null, M, 0);
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ejh(weekDay, map, q630Var, i);
        }
    }
}
