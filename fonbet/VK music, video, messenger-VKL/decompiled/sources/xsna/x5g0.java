package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.antispam.SpamAction;
import com.vk.antispam.view.ItemLocation;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.kpv;
import xsna.p5g;
import xsna.q630;
import xsna.tlo0;
import xsna.ty6;

/* compiled from: ReportSpamContent.kt */
/* loaded from: classes14.dex */
public final class x5g0 {

    /* compiled from: ReportSpamContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemLocation.values().length];
            try {
                iArr[ItemLocation.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemLocation.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemLocation.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(yr5 yr5Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-529751062);
        if ((i & 6) == 0) {
            i2 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-529751062, i2, -1, "com.vk.antispam.view.AntispamModalAvatar (ReportSpamContent.kt:120)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new dam(27);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(690616994, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PrivacyCircleFillRed20> (VkIcons.kt:9198)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_privacy_circle_fill_red_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            kpv a4 = kpv.a.a(a3, l5g.k, 0L, BadgeAlignment.BottomRight, true, a2, null, M, 100884536, VersionConstants.PRODUCT_MAJOR_VERSION);
            M = M;
            boolean z = yr5Var.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616767560, 0, -1, "com.vk.antispam.view.getBorder (ReportSpamContent.kt:159)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            p5g a5 = p5g.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196608, 30, ylu0Var.getImage().a, M, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j0v0.a(yr5Var, a4, q630Var, a5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i2 & 14) | ((i2 << 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ct3(yr5Var, q630Var, i, 4);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2062607671);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2062607671, i2, -1, "com.vk.antispam.view.AntispamModalTitle (ReportSpamContent.kt:137)");
            }
            q630 E = ahn.E(q630Var, "Title");
            String N = d370.N(R.string.dialog_bar_spam_modal_subtitle, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, E, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.C, aVar2, 0, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new oac(q630Var, i, 14);
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1411540425);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1411540425, i2, -1, "com.vk.antispam.view.BottomContent (ReportSpamContent.kt:150)");
            }
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new dz7(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z3 = i3 == 32;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new sv7(izsVar, 5);
                M.R(x2);
            }
            v38.a(z, gzsVar, (gzs) x2, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u5g0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x5g0.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final yr5 yr5Var, final List list, boolean z, izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        izs izsVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1637667761);
        if ((i & 6) == 0) {
            i3 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                izsVar2 = izsVar;
                i3 |= M.y(izsVar2) ? 2048 : 1024;
                if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
                    if (i5 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new e420(18);
                            M.R(x);
                        }
                        izsVar2 = (izs) x;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1637667761, i3, -1, "com.vk.antispam.view.ReportSpamContent (ReportSpamContent.kt:54)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 f = txj0.f(aVar2, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f);
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
                    f9t.e(txj0.h(aVar2, 8), M, 6);
                    g(yr5Var, M, i3 & 14);
                    f9t.e(txj0.h(aVar2, 12), M, 6);
                    q630 D2 = p490.D(n34.t(aVar2, dz5.I(6, 0, M, false), null), p490.x(M), 14);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    int i6 = (i3 >> 3) & 14;
                    int i7 = i3 >> 6;
                    f(i6 | (i7 & 112), M, list, izsVar2, defpackage.j0.d(1.0f, D2, false));
                    f9t.e(txj0.h(aVar2, 4), M, 6);
                    c(i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, izsVar2, z2);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                final izs izsVar3 = izsVar2;
                s = M.s();
                if (s != null) {
                    final boolean z3 = z2;
                    s.d = new wzs() { // from class: xsna.w5g0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            x5g0.d(yr5.this, list, z3, izsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            izsVar2 = izsVar;
            if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            }
            final izs izsVar32 = izsVar2;
            s = M.s();
            if (s != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        izsVar2 = izsVar;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
        }
        final izs izsVar322 = izsVar2;
        s = M.s();
        if (s != null) {
        }
    }

    public static final void e(final mhk0 mhk0Var, final ItemLocation itemLocation, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        uog0 d;
        androidx.compose.runtime.a M = aVar.M(1333196551);
        if ((i & 6) == 0) {
            i2 = (M.J(mhk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(itemLocation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1333196551, i2, -1, "com.vk.antispam.view.SpamActionSwitch (ReportSpamContent.kt:190)");
            }
            tlo0.f fVar = mhk0Var.a;
            tlo0 tlo0Var = mhk0Var.b;
            boolean z2 = mhk0Var.c;
            SpamAction spamAction = mhk0Var.d;
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                int i3 = a.$EnumSwitchMapping$0[itemLocation.ordinal()];
                if (i3 == 1) {
                    float f = 12;
                    d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                } else if (i3 == 2) {
                    d = vog0.b(0);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f2 = 12;
                    d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3);
                }
                x = d;
                M.R(x);
            }
            q630 d2 = rte0.d(q630Var, (r5j0) x);
            if (androidx.compose.runtime.b.d()) {
                z = false;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                z = false;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(hr80.m(d2, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), "SpamAction");
            String obj = tlo0.b.a(fVar, context).toString();
            String obj2 = tlo0Var != null ? tlo0Var.a(context).toString() : null;
            if ((i2 & 7168) == 2048) {
                z = true;
            }
            boolean y = z | M.y(spamAction);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new defpackage.v(20, izsVar, spamAction);
                M.R(x2);
            }
            zov0.b(z2, obj, (izs) x2, E, obj2, false, true, M, 1572864, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v5g0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    x5g0.e(mhk0.this, itemLocation, q630Var, izsVar, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        int i2;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(1927204096);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1927204096, i2, -1, "com.vk.antispam.view.SpammerActions (ReportSpamContent.kt:168)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c, cri.a.d, 1857012625, list);
            while (a3.hasNext()) {
                Object next = a3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                e((mhk0) next, i3 == 0 ? ItemLocation.Top : i3 == e43.h(new wow(list)) ? ItemLocation.Bottom : ItemLocation.Middle, ahn.E(q630.a.a, "SpamActionSwitch"), izsVar, M, ((i2 << 6) & 7168) | 384);
                i3 = i4;
            }
            izsVar2 = izsVar;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bj(i, list, izsVar2, q630Var);
        }
    }

    public static final void g(yr5 yr5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(786400598);
        if ((i & 6) == 0) {
            i2 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(786400598, i2, -1, "com.vk.antispam.view.TopContent (ReportSpamContent.kt:76)");
            }
            if (((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                M.K(-183264071);
                h(yr5Var, null, M, i2 & 14);
                M.j();
            } else {
                M.K(-183262409);
                i(yr5Var, null, M, i2 & 14);
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
            s.d = new hev(yr5Var, i, 2);
        }
    }

    public static final void h(yr5 yr5Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1480617665);
        if ((i & 6) == 0) {
            i2 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1480617665, i3, -1, "com.vk.antispam.view.TopContentHorizontal (ReportSpamContent.kt:102)");
            }
            q630Var = q630.a.a;
            q630 f = txj0.f(q630Var, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(q630Var, "AntispamModalAvatar");
            ty6.b bVar = dt1.a.l;
            a(yr5Var, E.g(new gor0(bVar)), M, i3 & 14);
            f9t.e(txj0.v(q630Var, 16), M, 6);
            b(txj0.f(q630Var, 1.0f).g(new gor0(bVar)), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ema(yr5Var, q630Var, i, 4);
        }
    }

    public static final void i(yr5 yr5Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-393355089);
        if ((i & 6) == 0) {
            i2 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-393355089, i3, -1, "com.vk.antispam.view.TopContentVertical (ReportSpamContent.kt:84)");
            }
            q630Var = q630.a.a;
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(q630Var, "AntispamModalAvatar");
            ty6.a aVar3 = dt1.a.o;
            a(yr5Var, lr.c(aVar3, E), M, i3 & 14);
            f9t.e(txj0.h(q630Var, 16), M, 6);
            b(txj0.f(q630Var, 1.0f).g(new gcv(aVar3)), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gga(yr5Var, q630Var, i, 2);
        }
    }
}
