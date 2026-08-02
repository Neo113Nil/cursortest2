package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dg70;
import xsna.dt1;
import xsna.q630;

/* compiled from: NotificationSettingsCellViews.kt */
/* loaded from: classes5.dex */
public final class fg70 {
    public static final void a(dg70.b bVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String O;
        androidx.compose.runtime.a M = aVar.M(-461743654);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-461743654, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.ComposeDisableDndBannerCell (NotificationSettingsCellViews.kt:318)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z87(izsVar, 9);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            M.K(-1354006007);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(523970914, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VolumeOutline28> (VkIcons.kt:11828)");
            }
            lg90 b = or.b(M, 1706518850, R.drawable.vk_icon_volume_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            M.K(-1354002076);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.q().b;
            M.j();
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(b, Cell$Left.Main.Size.Medium, j, null, null, M, 196664, 24), null, M, 2);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(d370.N(R.string.dnd_banner_turn_off_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.K(-1353983120);
            int i3 = bVar.a;
            if (pvo0.g(i3)) {
                M.K(-1353988877);
                M.j();
                O = pvo0.c(i3);
            } else {
                M.K(-1353987071);
                O = d370.O(R.string.dnd_until_tomorrow_format, new Object[]{pvo0.c(i3)}, M);
                M.j();
            }
            String O2 = d370.O(R.string.dnd_banner_turn_off_subtitle, new Object[]{O}, M);
            M.j();
            wiu0.b(c, false, a, Cell$Middle.a.a(a2, Cell$Middle.c.b.b(O2, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new au7(bVar, izsVar, i, 6);
        }
    }

    public static final void b(izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-822286953);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-822286953, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.ComposeEnableDndBannerCell (NotificationSettingsCellViews.kt:345)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new b97(izsVar, 6);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            M.K(56232964);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-218157788, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MuteOutline28> (VkIcons.kt:7930)");
            }
            lg90 b = or.b(M, -852971966, R.drawable.vk_icon_mute_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            M.K(56236833);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.q().b;
            M.j();
            wiu0.b(c, false, Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(b, Cell$Left.Main.Size.Medium, j, null, null, M, 196664, 24), null, M, 2), Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.dnd_banner_turn_on_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(d370.N(R.string.dnd_banner_turn_on_subtitle, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new eg70(i, 0, izsVar);
        }
    }

    public static final void c(dg70.k kVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-240242438);
        int i2 = (M.J(kVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-240242438, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.ComposeNotifyBannerCell (NotificationSettingsCellViews.kt:366)");
            }
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            M.K(1055262889);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-585300996, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Notifications28> (VkSdkIcons.kt:2750)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_notifications_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            M.K(1055266756);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            M.j();
            com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(a, Cell$Left.Main.Size.Medium, j, null, null, M, 196664, 24), null, M, 2);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(kVar.a, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            boolean z = kVar.b;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new iyl(izsVar, 2);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new vsq(18);
                M.R(x2);
            }
            wiu0.b(H, false, a2, a3, o.c.a(com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 24576, 4), null, null, null, null, M, 62), null, null, M, 6, 98);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o1k(kVar, izsVar, i, 3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void d(dg70.l lVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        lg90 y6gVar;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(-1582201508);
        int i2 = (M.J(lVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1582201508, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.ComposeSectionCell (NotificationSettingsCellViews.kt:287)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ew3(17, izsVar, lVar);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            String str = lVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(307858727, 0, -1, "com.vk.settings.impl.presentation.base.mvi.common.mapSectionIcon (NotificationSettingsCellViews.kt:391)");
            }
            switch (str.hashCode()) {
                case -253014634:
                    if (str.equals("new_story")) {
                        M.K(-500480101);
                        qzu0.a.getClass();
                        y6gVar = qzu0.u1(M);
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 73209505:
                    if (str.equals("friend_found")) {
                        M.K(-500490594);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-90025232, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UsersCircleFillYellow28> (VkIcons.kt:11398)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_users_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 96891546:
                    if (str.equals(NotificationCompat.CATEGORY_EVENT)) {
                        M.K(-500483429);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-82841630, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ListCircleFillGray28> (VkIcons.kt:6584)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_list_circle_fill_gray_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        M.K(-500497699);
                        qzu0.a.getClass();
                        y6gVar = qzu0.A1(M);
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 950345194:
                    if (str.equals("mention")) {
                        M.K(-500494242);
                        qzu0.a.getClass();
                        y6gVar = qzu0.K0(M);
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        M.K(-500501153);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1550866494, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageCircleFillGreen28> (VkIcons.kt:7410)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_message_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1379209310:
                    if (str.equals("services")) {
                        M.K(-500487007);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-307643390, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ServicesCircleFillYellow28> (VkIcons.kt:9738)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_services_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    y6gVar = new y6g(l5g.j);
                    break;
                default:
                    y6gVar = new y6g(l5g.j);
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(y6gVar, Cell$Left.Main.Size.Medium, 0L, null, null, M, 196664, 28), null, M, 2);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(lVar.c, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (lVar.d) {
                M.K(1901918081);
                M.j();
                h1Var = null;
            } else {
                M.K(1901566046);
                String N = d370.N(R.string.section_disabled_subtitle, 0, M);
                qzu0.a.getClass();
                lg90 S0 = qzu0.S0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                h1Var = Cell$Middle.c.b.b(N, 0, com.vk.core.compose.component.cell.content.h.a(S0, ylu0Var.getIcon().l, M, 24584, 12), null, null, M, 12582912, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                M = M;
                M.j();
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, h1Var, null, null, aVar2, 196608, 28);
            aVar2.K(1902017281);
            aVar2.j();
            wiu0.b(c, false, a, a3, null, null, null, aVar2, 0, 98);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yn7(lVar, izsVar, i, 8);
        }
    }

    public static final void e(dg70 dg70Var, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1969867507);
        int i2 = (M.J(dg70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1969867507, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.ComposeSettingsCell (NotificationSettingsCellViews.kt:39)");
            }
            if (dg70Var instanceof dg70.c) {
                M.K(1037909786);
                wju.a(0, 15, M, null, null, false);
                M.j();
            } else if (dg70Var instanceof dg70.a) {
                M.K(2110505797);
                ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, txj0.f(s200.E(q630.a.a, 16, 6), 1.0f), M, 438, 0);
                M.j();
            } else if (dg70Var instanceof dg70.f) {
                M.K(1037921193);
                g((dg70.f) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.g) {
                M.K(1037923690);
                h((dg70.g) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.j) {
                M.K(1037926647);
                k((dg70.j) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.l) {
                M.K(1037929519);
                d((dg70.l) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.m) {
                M.K(2111134601);
                com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(((dg70.m) dg70Var).a, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                M = M;
                M.j();
            } else if (dg70Var instanceof dg70.o) {
                M.K(1037940601);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new j750(izsVar, 1);
                    M.R(x);
                }
                phe0.a(0, M, (gzs) x, null);
                M.j();
            } else if (dg70Var instanceof dg70.b) {
                M.K(1037946840);
                a((dg70.b) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.d) {
                M.K(1037950033);
                b(izsVar, M, (i2 >> 3) & 14);
                M.j();
            } else if (dg70Var instanceof dg70.e) {
                M.K(1037953789);
                f((dg70.e) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.k) {
                M.K(1037957076);
                c((dg70.k) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.n) {
                M.K(1037959881);
                l((dg70.n) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else if (dg70Var instanceof dg70.h) {
                M.K(1037962865);
                i((dg70.h) dg70Var, izsVar, M, i2 & 112);
                M.j();
            } else {
                if (!(dg70Var instanceof dg70.i)) {
                    throw alb0.c(1037909714, M);
                }
                M.K(1037966624);
                j((dg70.i) dg70Var, izsVar, M, i2 & 112);
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
            s.d = new mog(dg70Var, izsVar, i, 7);
        }
    }

    public static final void f(dg70.e eVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1340464092);
        int i2 = (M.J(eVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1340464092, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.HeadphoneNotificationSettingCell (NotificationSettingsCellViews.kt:149)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            wju.a(0, 15, M, null, null, false);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.music_section_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.headphone_setting_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            boolean z = eVar.a;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new h97(izsVar, 6);
                M.R(x);
            }
            wiu0.b(aVar2, false, null, a2, com.vk.core.compose.component.cell.content.n.a(z, (gzs) x, false, null, M, 24576, 12), null, null, M, 6, 102);
            M = M;
            wju.a(384, 9, M, d370.N(R.string.headphone_setting_description, 0, M), null, false);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bta(eVar, izsVar, i, 6);
        }
    }

    public static final void g(dg70.f fVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1005603068);
        int i2 = (M.J(fVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1005603068, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.LedColorCell (NotificationSettingsCellViews.kt:85)");
            }
            long c = f870.c(fVar.a);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wn1(izsVar, 5);
                M.R(x);
            }
            s5g.a(0, c, M, (gzs) x, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qg(fVar, izsVar, i, 3);
        }
    }

    public static final void h(dg70.g gVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1335957358);
        int i2 = (M.J(gVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1335957358, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.LedSwitchCell (NotificationSettingsCellViews.kt:96)");
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.led_setting_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            boolean z = gVar.a;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ddn(izsVar, 4);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new qey(18);
                M.R(x2);
            }
            wiu0.b(q630.a.a, false, null, a, o.c.a(com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 24576, 4), null, null, null, null, M, 62), null, null, M, 6, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mz1(gVar, izsVar, i, 8);
        }
    }

    public static final void i(dg70.h hVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1098704548);
        int i2 = (M.J(hVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1098704548, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.MessengerCounterCell (NotificationSettingsCellViews.kt:260)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            wju.a(0, 15, M, null, null, false);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.messages_counter_section_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            String N = d370.N(R.string.messages_counter_section_option_all, 0, M);
            hVar.getClass();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new yt7(izsVar, 6);
                M.R(x);
            }
            afv0.b(false, N, (gzs) x, null, null, false, M, 0, 120);
            String N2 = d370.N(R.string.messages_counter_section_option_only_unmuted, 0, M);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new zn1(izsVar, 9);
                M.R(x2);
            }
            afv0.b(true, N2, (gzs) x2, null, null, false, M, 0, 120);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r21(hVar, izsVar, i, 4);
        }
    }

    public static final void j(dg70.i iVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-464731853);
        int i2 = (M.J(iVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (!M.t(i2 & 1, (i2 & 19) != 18)) {
            M.h();
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new wbi(iVar, izsVar, i, 7);
                return;
            }
            return;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-464731853, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.MessengerIncludeFolderToCounterCell (NotificationSettingsCellViews.kt:219)");
        }
        q630 f = txj0.f(q630.a.a, 1.0f);
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
        k9q0.w(M, a, cri.a.f);
        k9q0.w(M, D, cri.a.e);
        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(M, cri.a.h);
        k9q0.w(M, c, cri.a.d);
        wju.a(0, 15, M, null, null, false);
        com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.messages_counter_include_section_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        M.K(2045240884);
        iVar.getClass();
        throw null;
    }

    public static final void k(dg70.j jVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-899033916);
        int i2 = (M.J(jVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-899033916, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.MultiAccountPushSwitchCell (NotificationSettingsCellViews.kt:120)");
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.multiacc_push_setting_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(d370.N(R.string.multiacc_push_setting_subtitle, 0, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            boolean z = jVar.a;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new cr0(izsVar, 6);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new xht(15);
                M.R(x2);
            }
            wiu0.b(q630.a.a, false, null, a, o.c.a(com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 24576, 4), null, null, null, null, M, 62), null, null, M, 6, 102);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m9c(jVar, izsVar, i, 7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void l(dg70.n nVar, izs<? super rf70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        lg90 y6gVar;
        com.vk.core.compose.component.cell.content.x xVar;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1109952159);
        int i2 = (M.J(nVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1109952159, i2, -1, "com.vk.settings.impl.presentation.base.mvi.common.SettingsCell (NotificationSettingsCellViews.kt:182)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new j4(19, izsVar, nVar);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            String str = nVar.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-737960356, 0, -1, "com.vk.settings.impl.presentation.base.mvi.common.mapSettingIcon (NotificationSettingsCellViews.kt:405)");
            }
            switch (str.hashCode()) {
                case -1280421179:
                    if (str.equals("message_from_important_user")) {
                        M.K(-510159171);
                        M.K(-510157063);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-369064278, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageUnreadCircleFillGray28> (VkIcons.kt:7530)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_message_unread_circle_fill_gray_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -1268958287:
                    if (str.equals("follow")) {
                        M.K(-510236685);
                        M.K(-510234577);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2109882578, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddCircleFillBlue28> (VkIcons.kt:108)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_add_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -940060127:
                    if (str.equals("clock_circle")) {
                        M.K(-510245360);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2013703266, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ClockCircleFillRed28> (VkIcons.kt:1574)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_clock_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -934521517:
                    if (str.equals("repost")) {
                        M.K(-510203854);
                        M.K(-510201901);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1408783220, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-RepostCircleFillGreen28> (VkIcons.kt:9542)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_repost_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -928140366:
                    if (str.equals("service_recommend")) {
                        M.K(-510258153);
                        M.K(-510256107);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1566894850, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ThumbsUpCircleFillGreen28> (VkIcons.kt:10860)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_thumbs_up_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -916839648:
                    if (str.equals("story_reply")) {
                        M.K(-510143344);
                        M.K(-510141608);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1672320386, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StoryReplyCircleFillViolet28> (VkIcons.kt:10586)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_story_reply_circle_fill_violet_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -893195205:
                    if (str.equals("play_circle")) {
                        M.K(-510247089);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1880328730, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PlayCircleFillRed28> (VkIcons.kt:8954)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_play_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -847657971:
                    if (str.equals("photo_tag")) {
                        M.K(-510214157);
                        M.K(-510212173);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-310653208, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CameraCircleFillGreen28> (VkIcons.kt:1022)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_camera_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -810656473:
                    if (str.equals("voting")) {
                        M.K(-510224746);
                        M.K(-510222607);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(9163636, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PollCircleFillGreen28> (VkIcons.kt:9144)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_poll_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -688205752:
                    if (str.equals("market_orders")) {
                        M.K(-510287284);
                        M.K(-510285393);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2000329982, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BoxCircleFillBlue28> (VkIcons.kt:830)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_box_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -684173014:
                    if (str.equals("content_achievements")) {
                        M.K(-510276396);
                        M.K(-510274505);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(404585162, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AchievementCircleFillBlue28> (VkIcons.kt:32)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_achievement_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        M.K(-510155338);
                        M.K(-510153292);
                        qzu0.a.getClass();
                        y6gVar = qzu0.N0(M);
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -427997110:
                    if (str.equals("tear_off_flyer_fill_blue")) {
                        M.K(-510288942);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-986627870, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-TearOffFlyerFillBlue28> (VkIcons.kt:10720)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_tear_off_flyer_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -405568764:
                    if (str.equals("podcast")) {
                        M.K(-510284013);
                        M.K(-510281998);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1818523682, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PodcastCircleFillRed28> (VkIcons.kt:9080)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_podcast_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -253014634:
                    if (str.equals("new_story")) {
                        M.K(-510139892);
                        M.K(-510138032);
                        qzu0.a.getClass();
                        y6gVar = qzu0.u1(M);
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case -106388905:
                    if (str.equals("message_request")) {
                        M.K(-510232928);
                        M.K(-510230758);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-162481790, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageRequestCircleFillBlue28> (VkIcons.kt:7506)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_message_request_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 3168655:
                    if (str.equals("gear")) {
                        M.K(-510178517);
                        M.K(-510176688);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1299466946, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GearCircleFillGray28> (VkIcons.kt:2946)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_gear_circle_fill_gray_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 3172656:
                    if (str.equals("gift")) {
                        M.K(-510217523);
                        M.K(-510215694);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1247081278, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GiftCircleFillYellow28> (VkIcons.kt:3044)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_gift_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        M.K(-510200498);
                        M.K(-510198545);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-124768480, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LikeCircleFillRed28> (VkIcons.kt:6374)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_like_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        M.K(-510262151);
                        M.K(-510260074);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-683563870, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoCameraCircleFillRed28> (VkIcons.kt:11510)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_video_camera_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 3641802:
                    if (str.equals("wall")) {
                        M.K(-510210771);
                        M.K(-510208880);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1750747518, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-EditCircleFillBlue28> (VkIcons.kt:2316)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_edit_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 38918370:
                    if (str.equals("community_messages")) {
                        M.K(-510185734);
                        M.K(-510183626);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(798697154, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessagesCircleFillYellow28> (VkIcons.kt:7570)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_messages_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 73209505:
                    if (str.equals("friend_found")) {
                        M.K(-510240048);
                        M.K(-510238064);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-610613406, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UserCircleFillBlue28> (VkIcons.kt:11208)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_user_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 94750499:
                    if (str.equals("clips")) {
                        M.K(-510272942);
                        M.K(-510270958);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1465067230, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ClipCircleFillViolet28> (VkIcons.kt:1520)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_clip_circle_fill_violet_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 96891546:
                    if (str.equals(NotificationCompat.CATEGORY_EVENT)) {
                        M.K(-510189519);
                        M.K(-510187597);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(874988242, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CalendarCircleFillRed28> (VkIcons.kt:940)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_calendar_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        M.K(-510192910);
                        M.K(-510190926);
                        qzu0.a.getClass();
                        y6gVar = qzu0.A1(M);
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 177449501:
                    if (str.equals("video_playlists")) {
                        M.K(-510269226);
                        M.K(-510267180);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1724025122, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-FilmStripCircleFillRed28> (VkIcons.kt:2622)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_film_strip_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 440651083:
                    if (str.equals("discussions")) {
                        M.K(-510228236);
                        M.K(-510226221);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-80762738, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DiscussionsCircleFill28> (VkIcons.kt:1936)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_discussions_circle_fill_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 522658657:
                    if (str.equals("message_reaction")) {
                        M.K(-510163061);
                        M.K(-510161325);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1653946040, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StarsCircleFillViolet28> (VkIcons.kt:10328)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_stars_circle_fill_violet_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 526773990:
                    if (str.equals("vkvideo")) {
                        M.K(-510265642);
                        M.K(-510263534);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1338359266, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VkVideoCircleFillRed28> (VkIcons.kt:11750)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_vk_video_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 579134254:
                    if (str.equals("feed_promo")) {
                        M.K(-510135946);
                        M.K(-510133962);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1925224994, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AdvertisingCircleFillRed28> (VkIcons.kt:190)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_advertising_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 619208137:
                    if (str.equals("invite_group")) {
                        M.K(-510181870);
                        M.K(-510179824);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-527641118, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MailCircleFillBlue28> (VkIcons.kt:7176)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_mail_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 825797468:
                    if (str.equals("co_ownership")) {
                        M.K(-510121330);
                        M.K(-510119408);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(641021314, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StarCircleFillBlue28> (VkIcons.kt:10296)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_star_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 863542501:
                    if (str.equals("stickers_bonus_discounts_expiration")) {
                        M.K(-510117097);
                        M.K(-510115082);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-952229694, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StickerEnergySaleProduct28> (VkIcons.kt:10382)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_sticker_energy_sale_product_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 950345194:
                    if (str.equals("mention")) {
                        M.K(-510151757);
                        M.K(-510149773);
                        qzu0.a.getClass();
                        y6gVar = qzu0.K0(M);
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 950398559:
                    if (str.equals("comment")) {
                        M.K(-510207464);
                        M.K(-510205356);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-469496126, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CommentCircleFillGreen28> (VkIcons.kt:1648)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_comment_circle_fill_green_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        M.K(-510170442);
                        M.K(-510168396);
                        qzu0.a.getClass();
                        y6gVar = qzu0.N0(M);
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1000875484:
                    if (str.equals("private_post")) {
                        M.K(-510196240);
                        M.K(-510194256);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1740203742, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-RssCircleFillBlack28> (VkIcons.kt:9570)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_rss_circle_fill_black_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1069376125:
                    if (str.equals("birthday")) {
                        M.K(-510243290);
                        M.K(-510241585);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1466015250, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GiftCircleFillRed28> (VkIcons.kt:3040)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_gift_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1198402539:
                    if (str.equals("invite_app")) {
                        M.K(-510250831);
                        M.K(-510248816);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-469819006, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GameCircleFillBlue28> (VkIcons.kt:2930)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_game_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1248734217:
                    if (str.equals("message_reminders")) {
                        M.K(-510174274);
                        M.K(-510172104);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2038452066, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageUnreadCircleFillRed28> (VkIcons.kt:7534)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_message_unread_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1281985816:
                    if (str.equals("group_chat")) {
                        M.K(-510166767);
                        M.K(-510164783);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2128186738, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UsersCircleFillGray28> (VkIcons.kt:11394)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_users_circle_fill_gray_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1377217503:
                    if (str.equals("new_post")) {
                        M.K(-510128911);
                        M.K(-510126927);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1232743228, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-RssCircleFillYellow28> (VkIcons.kt:9578)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_rss_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1379209310:
                    if (str.equals("services")) {
                        M.K(-510254506);
                        M.K(-510252460);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-186784126, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ServicesCircleFillBlue28> (VkIcons.kt:9734)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_services_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1654231320:
                    if (str.equals("stickers_bonus_expiration")) {
                        M.K(-510124911);
                        M.K(-510122958);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(643963426, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StickerEnergyProduct28> (VkIcons.kt:10378)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_sticker_energy_product_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1685895152:
                    if (str.equals("story_question")) {
                        M.K(-510147391);
                        M.K(-510145283);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1295341360, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageQuestionCircleFillViolet28> (VkIcons.kt:7498)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_message_question_circle_fill_violet_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1891847085:
                    if (str.equals("related_events")) {
                        M.K(-510220940);
                        M.K(-510218925);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1898561712, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CompassCircleFillBlue28> (VkIcons.kt:1716)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_compass_circle_fill_blue_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 1973397624:
                    if (str.equals("interesting")) {
                        M.K(-510132243);
                        M.K(-510130321);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1034105886, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-FireCircleFillRed28> (VkIcons.kt:2670)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_fire_circle_fill_red_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 2037187069:
                    if (str.equals("bookmarks")) {
                        M.K(-510280456);
                        M.K(-510278410);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1759930562, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-FavoriteCircleFillYellow28> (VkIcons.kt:2582)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_favorite_circle_fill_yellow_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i3222222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                case 2048797212:
                    if (str.equals("hearts_2_circle_fill_twilight")) {
                        M.K(-510293258);
                        M.K(-510291305);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(35711138, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Hearts2CircleFillTwilight28> (VkIcons.kt:3330)");
                        }
                        y6gVar = pg90.a(R.drawable.vk_icon_hearts_2_circle_fill_twilight_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        M.j();
                        break;
                    }
                    M.K(-510113669);
                    M.j();
                    int i32222222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
                default:
                    M.K(-510113669);
                    M.j();
                    int i322222222222222222222222222222222222222222222222222 = l5g.l;
                    y6gVar = new y6g(l5g.j);
                    break;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(y6gVar, Cell$Left.Main.Size.Medium, 0L, null, null, M, 196664, 28), null, M, 2);
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(nVar.c, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.K(369258530);
            String obj = nVar.e.a((Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            M.j();
            if (nVar.f) {
                M.K(369617788);
                M.j();
                xVar = null;
                aVar2 = M;
            } else {
                M.K(369408942);
                qzu0.a.getClass();
                lg90 S0 = qzu0.S0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.h.a(S0, ylu0Var.getIcon().l, aVar2, 24584, 12);
                M.j();
                xVar = a3;
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a2, Cell$Middle.c.b.b(obj, 0, xVar, null, null, aVar3, 12582912, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), null, null, aVar3, 196608, 28);
            aVar3.K(369731868);
            aVar3.j();
            wiu0.b(c, false, a, a4, null, null, null, aVar3, 0, 98);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fd1(nVar, izsVar, i, 7);
        }
    }
}
