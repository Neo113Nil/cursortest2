package xsna;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.lr40;
import xsna.lt40;
import xsna.q630;
import xsna.vgc0;
import xsna.xzj;
import xsna.zra0;

/* compiled from: MusicPickerItems.kt */
/* loaded from: classes4.dex */
public final class lt40 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final sgi0<Integer> b;

    /* compiled from: MusicPickerItems.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicPickerLoadingState.values().length];
            try {
                iArr[MusicPickerLoadingState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicPickerLoadingState.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicPickerLoadingState.NextPageLoading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicPickerLoadingState.NextPageLoadingError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(lt40.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
        b = new sgi0<>("ListItemPosition");
    }

    public static final void a(cc40 cc40Var, ls40 ls40Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        androidx.compose.runtime.a aVar2;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(1916635894);
        if ((i & 6) == 0) {
            i2 = (M.J(cc40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ls40Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1916635894, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerBottomPanel (MusicPickerItems.kt:366)");
            }
            long j = wlb0.h(M).getBackground().g;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630.a aVar5 = q630.a.a;
            q630 m = hr80.m(aVar5, j, aVar4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, M, txj0.f(aVar5, 1.0f));
            ma40 ma40Var = cc40Var.b;
            if (!cc40Var.c || ma40Var == null) {
                i3 = 2013907478;
                M.K(2013907478);
            } else {
                M.K(2029677147);
                i3 = 2013907478;
                b(cc40Var, ls40Var.a, ls40Var.f, ls40Var.b, ls40Var.e, M, i2 & 14);
            }
            M.j();
            if (cc40Var.e) {
                M.K(2030028656);
                String str = cc40Var.f;
                frv0 frv0Var = wlb0.l(M).i0;
                long j2 = wlb0.h(M).getText().p;
                aVar3 = aVar5;
                f = 1.0f;
                i4 = 4;
                i6 = 16;
                i5 = 0;
                yqv0.c(str, ahn.E(s200.D(txj0.j(36, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar5, 1.0f)), 16), "MusicPickerHintText"), j2, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
                aVar2 = M;
            } else {
                i4 = 4;
                i5 = 0;
                f = 1.0f;
                i6 = 16;
                aVar2 = M;
                aVar3 = aVar5;
                aVar2.K(i3);
            }
            aVar2.j();
            tzo tzoVar = ls40Var.c;
            String N = d370.N(R.string.music_picker_ready, i5, aVar2);
            androidx.compose.runtime.a aVar7 = aVar2;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            float f2 = i6;
            float f3 = i4;
            float f4 = 12;
            bhu0.e(tzoVar, buttonSize, buttonStyle, buttonAppearance, ahn.E(s200.G(txj0.f(aVar3, f), f2, f3, f2, f4), "MusicPickerReadyButton"), null, false, false, null, null, null, N, null, null, null, null, cc40Var.g, null, null, null, aVar7, 28080, 0, 0, 4059104);
            if (cc40Var.i) {
                aVar7.K(2031059778);
                bhu0.e(ls40Var.d, buttonSize, ButtonStyle.Link, buttonAppearance, ahn.E(s200.G(txj0.f(aVar3, f), f2, f3, f2, f4), "MusicPickerAttachPlaylistButton"), null, false, false, null, null, null, d370.N(R.string.music_picker_attach_playlist, i5, aVar7), null, null, null, null, false, null, null, null, aVar7, 28080, 0, 0, 4190176);
                M = aVar7;
            } else {
                M = aVar7;
                M.K(2013907478);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ks3(cc40Var, ls40Var, i, 6);
        }
    }

    public static final void b(cc40 cc40Var, z87 z87Var, b97 b97Var, gzs gzsVar, a97 a97Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        Cell$Left a2;
        gbx0 gbx0Var;
        a.C0011a.C0012a c0012a;
        SemanticsConfiguration.Mode mode;
        String str3;
        int i6;
        com.vk.core.compose.component.cell.content.o a3;
        com.vk.core.compose.component.cell.content.h1 b2;
        gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(-1657338575);
        if ((i & 6) == 0) {
            i2 = (M.J(cc40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(z87Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(b97Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(a97Var) ? 16384 : 8192;
        }
        int i7 = i2;
        if (M.t(i7 & 1, (i7 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1657338575, i7, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerEntryPointCell (MusicPickerItems.kt:694)");
            }
            ma40 ma40Var = cc40Var.b;
            if (ma40Var == null) {
                throw new IllegalArgumentException("panelUiDto.attachUiDto == null");
            }
            String str4 = ma40Var.d;
            if (ma40Var.e == null) {
                M.K(1170928758);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-662252324, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MusicOutline28> (VkSdkIcons.kt:2684)");
                }
                lg90 b3 = or.b(M, 1920949126, R.drawable.vk_icon_music_outline_28, M, 0);
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
                a2 = vgc0.a.a(b3, ylu0Var.getIcon().l, M);
                M.j();
                str = str4;
                i3 = i7;
                i4 = 0;
                i5 = -1;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            } else {
                M.K(1171068134);
                i3 = i7;
                str = str4;
                i4 = 0;
                i5 = -1;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                lg90 l = fwu0.l(null, ma40Var.e, null, null, M, 0, 61);
                M = M;
                a2 = toc0.a(l, M);
                M.j();
            }
            Cell$Left cell$Left = a2;
            us2 us2Var = ma40Var.a;
            com.vk.core.compose.component.cell.content.h1 h1Var = null;
            if (ma40Var.c) {
                M.K(730524013);
                qzu0.a.getClass();
                gbx0 gbx0Var2 = new gbx0(qzu0.M(M));
                M.j();
                gbx0Var = gbx0Var2;
            } else {
                M.K(1171526220);
                M.j();
                gbx0Var = null;
            }
            SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(ma40Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = new kn20(ma40Var, 6);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 b4 = Cell$Middle.d.b.b(us2Var, null, null, gbx0Var, 1, 2, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x, 2), null, null, M, 12804096, 6, 774);
            if (str == null || str.length() == 0) {
                c0012a = c0012a2;
                mode = mode2;
                str3 = str2;
                M.K(1172645196);
                M.j();
            } else {
                M.K(1172044603);
                if (cc40Var.j) {
                    M.K(1172092002);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1631988311, i4, i5, "com.vk.newsfeed.posting.music_picker.presentation.view.snippetSubtitle (MusicPickerItems.kt:853)");
                    }
                    s8u0 s8u0Var = new s8u0(i4);
                    s8u0Var.e(str);
                    s8u0Var.d(new klv0(VkTypographyToken.Footnote, VkColorToken.TextPrimary), i4, s8u0Var.a.length());
                    us2 j = s8u0Var.j(8, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-108293764, i4, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cards212> (VkSdkIcons.kt:294)");
                    }
                    lg90 b5 = or.b(M, -658914580, R.drawable.vk_icon_cards_2_12, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i4, i5, str2);
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar2 = M;
                    c0012a = c0012a2;
                    com.vk.core.compose.component.cell.content.x a4 = com.vk.core.compose.component.cell.content.h.a(b5, ylu0Var2.getIcon().j, aVar2, 24584, 12);
                    M = aVar2;
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new t810(5);
                        M.R(x2);
                    }
                    b2 = Cell$Middle.c.b.a(j, null, 0, 0, a4, null, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x2, 2), null, M, 805306368, 430);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    mode = mode2;
                    str3 = str2;
                } else {
                    c0012a = c0012a2;
                    M.K(1172187234);
                    String str5 = ma40Var.d;
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new svz(9);
                        M.R(x3);
                    }
                    str3 = str2;
                    mode = mode2;
                    b2 = Cell$Middle.c.b.b(str5, 1, null, null, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x3, 2), M, 12582960, 92);
                    M.j();
                }
                h1Var = b2;
                M.j();
            }
            androidx.compose.runtime.a aVar3 = M;
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(b4, h1Var, null, null, aVar3, 196608, 28);
            M = aVar3;
            if (cc40Var.d) {
                M.K(1172766221);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new ct40(cc40Var, a97Var, z87Var, b97Var);
                    M.R(x4);
                }
                a3 = (ct40) x4;
                M.j();
                i6 = 2;
            } else {
                M.K(730585557);
                boolean z = ma40Var.f;
                int i8 = i3 & 112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1727493230, i8, i5, "com.vk.newsfeed.posting.music_picker.presentation.view.rightIcon (MusicPickerItems.kt:833)");
                }
                if (z) {
                    M.K(1452813419);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1243383292, i4, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                    }
                    lg90 b6 = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.posting_step2_remove_music_button_content_description, i4, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i4, i5, str3);
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var3.getIcon().l;
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new k220(6);
                        M.R(x5);
                    }
                    com.vk.core.compose.component.cell.content.x a6 = com.vk.core.compose.component.cell.content.p.a(b6, j2, 0L, N, z87Var, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), M, ((i8 << 9) & 57344) | 1572872, 4);
                    M = M;
                    M.j();
                    a3 = a6;
                    c0012a = c0012a;
                    i6 = 2;
                } else {
                    String str6 = str3;
                    i6 = 2;
                    M.K(-2031328981);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i4, i5, str6);
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    a3 = o.b.a.a(null, null, ylu0Var4.getIcon().n, false, M, 221184, 7);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            com.vk.core.compose.component.cell.content.o oVar = a3;
            M.K(730590431);
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "MusicPickerPreviewCell");
            gzsVar2 = gzsVar;
            if (gzsVar != null) {
                boolean J2 = M.J(gzsVar2);
                Object x6 = M.x();
                if (J2 || x6 == c0012a) {
                    x6 = new us20(1, gzsVar2);
                    M.R(x6);
                }
                q630 g = E.g(ojc.c(aVar4, false, null, null, (gzs) x6, 15));
                if (g != null) {
                    E = g;
                }
            }
            M.j();
            wiu0.b(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6, E), false, cell$Left, a5, oVar, null, null, M, 0, 98);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xg7(cc40Var, z87Var, b97Var, gzsVar2, a97Var, i);
        }
    }

    public static final void c(final int i, final wax waxVar, final List list, cc40 cc40Var, final MusicPickerLoadingState musicPickerLoadingState, q630 q630Var, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final izs izsVar, final gzs gzsVar, final gzs gzsVar2, final boolean z5, final MusicPickerListItem.MusicTrackItem.PlayingState playingState, final String str2, final boolean z6, androidx.compose.runtime.a aVar, final int i2) {
        final cc40 cc40Var2;
        final q630 q630Var2;
        cri.a.C2678a c2678a;
        izs izsVar2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(459886754);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.J(waxVar) ? 32 : 16) | (M.J(list) ? 256 : 128) | (M.J(cc40Var) ? 2048 : 1024) | (M.o(musicPickerLoadingState.ordinal()) ? 16384 : 8192) | 196608 | (M.J(str) ? 1048576 : 524288) | (M.l(z) ? 8388608 : 4194304) | (M.l(z2) ? 67108864 : 33554432) | (M.l(z3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (M.l(z4) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.l(z5) ? 16384 : 8192) | (M.o(playingState == null ? -1 : playingState.ordinal()) ? 131072 : 65536) | (M.J(str2) ? 1048576 : 524288) | (M.l(z6) ? 8388608 : 4194304);
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (4793491 & i4) == 4793490) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(459886754, i3, i4, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItems (MusicPickerItems.kt:126)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(txj0.d(aVar3, 1.0f), f5v0.c);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            int i5 = i3 & 112;
            boolean z7 = i5 == 32;
            Object x2 = M.x();
            if (z7 || x2 == c0012a) {
                c2678a = c2678a2;
                x2 = new dt40(waxVar, sg50Var, null);
                M.R(x2);
            } else {
                c2678a = c2678a2;
            }
            bap.g(waxVar, (wzs) x2, M, (i3 >> 3) & 14);
            int i6 = (i3 & 14) | 384 | i5;
            int i7 = i3 >> 6;
            int i8 = i3 >> 9;
            int i9 = i4 << 21;
            cri.a.C2678a c2678a3 = c2678a;
            f(i, waxVar, sg50Var, null, str, z2, z3, z4, izsVar, gzsVar, M, i6 | (57344 & i7) | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192));
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 f = txj0.f(new xpy(1.0f, true), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a3);
            k9q0.w(M, c2, dVar);
            int i10 = a.$EnumSwitchMapping$0[musicPickerLoadingState.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    M.K(2020116430);
                    gzsVar2.invoke();
                    int i11 = i4 << 6;
                    d(list, z, musicPickerLoadingState, sg50Var, null, z5, izsVar, playingState, str2, z6, M, (i7 & 14) | 3072 | ((i3 >> 18) & 112) | (i7 & 896) | ((i4 << 3) & 458752) | ((i4 << 15) & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192));
                    izsVar2 = izsVar;
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    izsVar2 = izsVar;
                    M.K(2143372730);
                    h(izsVar2, M, (i4 & 112) | 6);
                    M.j();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                aVar2 = aVar3;
            } else {
                izsVar2 = izsVar;
                M.K(2143365180);
                aVar2 = aVar3;
                zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, SpinnerSize.Size56, null, M, 24582, 44);
                M = M;
                M.j();
                s3q0 s3q0Var3 = s3q0.a;
            }
            M.G();
            cc40Var2 = cc40Var;
            if (cc40Var2.a) {
                M.K(1914489329);
                wh50 c3 = androidx.compose.runtime.k.c(Boolean.valueOf(z6), M, (i4 >> 21) & 14);
                boolean z8 = (i3 & 7168) == 2048;
                Object x3 = M.x();
                if (z8 || x3 == c0012a) {
                    ls40 ls40Var = new ls40(new z87(izsVar2, 7), cc40Var2.h ? new z8c(izsVar2, 6) : null, new tzo(izsVar2, 5), new j4(17, izsVar2, c3), new a97(izsVar2, 6), new b97(izsVar2, 3));
                    M.R(ls40Var);
                    x3 = ls40Var;
                }
                a(cc40Var2, (ls40) x3, M, i8 & 14);
            } else {
                M.K(1905768874);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            cc40Var2 = cc40Var;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, waxVar, list, cc40Var2, musicPickerLoadingState, q630Var2, str, z, z2, z3, z4, izsVar, gzsVar, gzsVar2, z5, playingState, str2, z6, i2) { // from class: xsna.xs40
                public final /* synthetic */ int b;
                public final /* synthetic */ wax c;
                public final /* synthetic */ List d;
                public final /* synthetic */ cc40 e;
                public final /* synthetic */ MusicPickerLoadingState f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ String h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ izs m;
                public final /* synthetic */ gzs n;
                public final /* synthetic */ gzs o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ MusicPickerListItem.MusicTrackItem.PlayingState q;
                public final /* synthetic */ String r;
                public final /* synthetic */ boolean s;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    lt40.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final List list, final boolean z, final MusicPickerLoadingState musicPickerLoadingState, final wax waxVar, q630 q630Var, final boolean z2, final izs izsVar, final MusicPickerListItem.MusicTrackItem.PlayingState playingState, final String str, final boolean z3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        Object b2;
        int i3;
        e160 e160Var;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-1270521805);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(musicPickerLoadingState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(waxVar) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.o(playingState == null ? -1 : playingState.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(str) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.l(z3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (i2 & 306775187) != 306775186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1270521805, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerList (MusicPickerItems.kt:446)");
            }
            xvy a2 = zvy.a(0, 3, M);
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            boolean J = M.J(kci.i(a2)) | (i4 == 256) | (i5 == 4) | ((458752 & i2) == 131072);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                b2 = bbk0.b(new ys40(a2, list, z2, musicPickerLoadingState));
                M.R(b2);
            } else {
                b2 = x;
            }
            mtk0 mtk0Var = (mtk0) b2;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            int i6 = i2 & 3670016;
            boolean J2 = M.J(mtk0Var) | (i6 == 1048576);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new et40(null, izsVar, mtk0Var);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            int i7 = i2 & 7168;
            boolean J3 = (i7 == 2048) | M.J(a2);
            Object x3 = M.x();
            if (J3 || x3 == c0012a) {
                x3 = new ft40(waxVar, a2, null);
                M.R(x3);
            }
            bap.g(waxVar, (wzs) x3, M, (i2 >> 9) & 14);
            nek0 nek0Var = (nek0) M.r(uvi.q);
            s3q0 s3q0Var = s3q0.a;
            boolean J4 = M.J(a2) | M.J(nek0Var);
            Object x4 = M.x();
            if (J4 || x4 == c0012a) {
                i3 = i2;
                e160Var = null;
                x4 = new gt40(a2, nek0Var, null);
                M.R(x4);
            } else {
                i3 = i2;
                e160Var = null;
            }
            bap.g(s3q0Var, (wzs) x4, M, 6);
            q630.a aVar4 = q630.a.a;
            q630 t = n34.t(txj0.d(aVar4, 1.0f), dz5.I(0, 1, M, false), e160Var);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new sm0(6);
                M.R(x5);
            }
            q630 E = ahn.E(ahh0.b(t, m4s.C((izs) x5, M, 6), Orientation.Vertical), "TracksList");
            boolean z4 = (i7 == 2048) | (i5 == 4) | ((i3 & 112) == 32) | (i6 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i4 == 256);
            Object x6 = M.x();
            if (z4 || x6 == c0012a) {
                aVar3 = aVar4;
                izs izsVar2 = new izs() { // from class: xsna.zs40
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        List list2 = list;
                        wow wowVar = new wow(list2);
                        v3l v3lVar = new v3l(2);
                        int size = list2.size();
                        ht40 ht40Var = new ht40(v3lVar, wowVar);
                        it40 it40Var = new it40(wowVar, 0);
                        boolean z5 = z;
                        izs izsVar3 = izsVar;
                        nvyVar.e(size, ht40Var, it40Var, new jai(2039820996, new jt40(wowVar, z5, izsVar3, playingState, str, waxVar, z3), true));
                        int i8 = lt40.a.$EnumSwitchMapping$0[musicPickerLoadingState.ordinal()];
                        if (i8 == 3) {
                            nvyVar.h("Loader", "Loader", eii.a);
                        } else if (i8 == 4) {
                            nvyVar.h("NextPageLoadingError", "NextPageLoadingError", new jai(-2130623203, new ze4(izsVar3, 3), true));
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x6 = izsVar2;
            } else {
                aVar3 = aVar4;
            }
            aVar2 = M;
            lqy.a(E, a2, null, null, null, null, false, null, (izs) x6, aVar2, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
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
            s.d = new wzs() { // from class: xsna.at40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lt40.d(list, z, musicPickerLoadingState, waxVar, q630Var2, z2, izsVar, playingState, str, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final int i, final MusicPickerListItem musicPickerListItem, final boolean z, final izs izsVar, q630 q630Var, final MusicPickerListItem.MusicTrackItem.PlayingState playingState, final String str, final wax waxVar, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final q630 q630Var2;
        q630.a aVar2;
        int i4;
        int i5;
        xzj c4061b;
        androidx.compose.runtime.a M = aVar.M(-666082075);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(musicPickerListItem) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(playingState == null ? -1 : playingState.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= M.J(waxVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= M.l(z2) ? 67108864 : 33554432;
        }
        if (M.t(i3 & 1, (i3 & 38339731) != 38339730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-666082075, i3, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerListItem (MusicPickerItems.kt:539)");
            }
            boolean z3 = musicPickerListItem instanceof MusicPickerListItem.MusicPlaylistItem;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            q630.a aVar3 = q630.a.a;
            if (z3) {
                M.K(-154730793);
                Playlist playlist = ((MusicPickerListItem.MusicPlaylistItem) musicPickerListItem).b;
                int i6 = playlist.l;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                String g = c9b0.g(context, playlist);
                String str2 = playlist.h;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                boolean z4 = g.length() > 0;
                String valueOf = String.valueOf(i6);
                boolean z5 = i6 != 0;
                List<Thumb> list = playlist.p;
                Thumb thumb = playlist.m;
                if (thumb == null) {
                    List<Thumb> list2 = list;
                    c4061b = (list2 == null || list2.isEmpty()) ? xzj.b.a.a : list.size() == 1 ? new xzj.b.C4061b((Thumb) j5g.Y(list)) : new xzj.a(j5g.H0(list, 4));
                } else {
                    c4061b = new xzj.b.C4061b(thumb);
                }
                c250 c250Var = new c250(str3, g, z4, valueOf, z5, c4061b);
                boolean z6 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
                Object x = M.x();
                if (z6 || x == c0012a) {
                    x = new xk(21, izsVar, musicPickerListItem);
                    M.R(x);
                }
                nz40.c(c250Var, i, (gzs) x, M, (i3 << 3) & 112);
                M.j();
                aVar2 = aVar3;
            } else if (musicPickerListItem instanceof MusicPickerListItem.MusicTrackItem) {
                M.K(-501356887);
                MusicPickerListItem.MusicTrackItem musicTrackItem = (MusicPickerListItem.MusicTrackItem) musicPickerListItem;
                MusicDto musicDto = musicTrackItem.c;
                MusicTrack musicTrack = musicTrackItem.b;
                ae50 b2 = nb50.b(musicDto, z, true);
                boolean z7 = musicTrackItem.d;
                boolean z8 = epx.f(str, musicTrack.Ib()) && playingState != MusicPickerListItem.MusicTrackItem.PlayingState.None;
                boolean z9 = epx.f(str, musicTrack.Ib()) && playingState == MusicPickerListItem.MusicTrackItem.PlayingState.Playing;
                boolean z10 = (i3 & 14) == 4;
                Object x2 = M.x();
                if (z10 || x2 == c0012a) {
                    x2 = new izs() { // from class: xsna.us40
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            lt40.i((tgi0) obj, i);
                            return s3q0.a;
                        }
                    };
                    M.R(x2);
                }
                q630 b3 = egi0.b(aVar3, false, (izs) x2);
                int i7 = i3 & 7168;
                int i8 = i3 & 112;
                boolean z11 = (i7 == 2048) | (i8 == 32);
                Object x3 = M.x();
                if (z11 || x3 == c0012a) {
                    x3 = new m84(14, izsVar, musicPickerListItem);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                boolean z12 = (i7 == 2048) | (i8 == 32);
                Object x4 = M.x();
                if (z12 || x4 == c0012a) {
                    x4 = new lb6(17, izsVar, musicPickerListItem);
                    M.R(x4);
                }
                gzs gzsVar2 = (gzs) x4;
                boolean z13 = (i7 == 2048) | (i8 == 32);
                Object x5 = M.x();
                if (z13 || x5 == c0012a) {
                    x5 = new cy0(19, izsVar, musicPickerListItem);
                    M.R(x5);
                }
                aVar2 = aVar3;
                qa50.a(b2, z7, z8, z9, b3, waxVar, false, null, gzsVar, null, gzsVar2, (gzs) x5, M, (i3 >> 6) & 458752, 704);
                M = M;
                M.j();
            } else {
                aVar2 = aVar3;
                if (musicPickerListItem instanceof MusicPickerListItem.SelectPlaylistItem) {
                    M.K(-499820527);
                    if (androidx.compose.runtime.b.d()) {
                        i5 = 0;
                        androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                    } else {
                        i5 = 0;
                    }
                    lg90 b4 = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, i5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.music_picker_select_playlist, i5, M);
                    boolean z14 = (i3 & 14) == 4;
                    Object x6 = M.x();
                    if (z14 || x6 == c0012a) {
                        x6 = new izs() { // from class: xsna.vs40
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                lt40.i((tgi0) obj, i);
                                return s3q0.a;
                            }
                        };
                        M.R(x6);
                    }
                    q630 b5 = egi0.b(aVar2, false, (izs) x6);
                    boolean z15 = !z2;
                    boolean z16 = ((i3 & 7168) == 2048) | ((i3 & 234881024) == 67108864);
                    Object x7 = M.x();
                    if (z16 || x7 == c0012a) {
                        x7 = new gzs() { // from class: xsna.ws40
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new lr40.a(true, z2));
                                return s3q0.a;
                            }
                        };
                        M.R(x7);
                    }
                    y8b0.a(b4, N, b5, (gzs) x7, false, z15, M, 8, 16);
                    M = M;
                    M.j();
                } else if (musicPickerListItem instanceof MusicPickerListItem.PlaylistsAndAlbumsItem) {
                    M.K(-499215004);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        i4 = 0;
                        androidx.compose.runtime.b.f(1281986666, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PlaylistOutline24> (VkIcons.kt:9030)");
                    } else {
                        i4 = 0;
                    }
                    lg90 b6 = or.b(M, 815746360, R.drawable.vk_icon_playlist_outline_24, M, i4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N2 = d370.N(R.string.music_picker_toolbar_title_playlists, i4, M);
                    boolean z17 = (i3 & 14) == 4;
                    Object x8 = M.x();
                    if (z17 || x8 == c0012a) {
                        x8 = new ojb(i, 1);
                        M.R(x8);
                    }
                    q630 b7 = egi0.b(aVar2, false, (izs) x8);
                    boolean z18 = (i3 & 7168) == 2048;
                    Object x9 = M.x();
                    if (z18 || x9 == c0012a) {
                        x9 = new yt7(izsVar, 5);
                        M.R(x9);
                    }
                    y8b0.a(b6, N2, b7, (gzs) x9, true, false, M, 24584, 32);
                    M = M;
                    M.j();
                } else {
                    if (!(musicPickerListItem instanceof MusicPickerListItem.EmptyListItem)) {
                        throw alb0.c(-154729852, M);
                    }
                    M.K(-498763768);
                    vl20 a2 = zra0.a.a(null, null, d370.N(((MusicPickerListItem.EmptyListItem) musicPickerListItem).b, 0, M), null, M, 196608, 27);
                    boolean z19 = (i3 & 14) == 4;
                    Object x10 = M.x();
                    if (z19 || x10 == c0012a) {
                        x10 = new da6(i, 3);
                        M.R(x10);
                    }
                    ldv0.d(txj0.j(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, egi0.b(aVar2, false, (izs) x10)), null, a2, null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                    M = M;
                    M.j();
                }
            }
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
            s.d = new wzs() { // from class: xsna.ts40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lt40.e(i, musicPickerListItem, z, izsVar, q630Var2, playingState, str, waxVar, z2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x043b, code lost:
    
        if (r6 == r2) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final int i, final wax waxVar, final sg50 sg50Var, q630 q630Var, String str, final boolean z, final boolean z2, final boolean z3, final izs izsVar, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        q630 q630Var2;
        int i5;
        TopBar$Before.e a2;
        int i6;
        TopBar$Before.e eVar;
        int i7;
        String str2;
        int i8;
        com.vk.core.compose.component.topbar.a aVar2;
        Object obj;
        int i9;
        TopBar$Middle a3;
        int i10;
        int i11;
        com.vk.core.compose.component.topbar.a aVar3;
        int i12;
        lkg0 lkg0Var;
        int i13;
        String str3 = str;
        androidx.compose.runtime.a M = aVar.M(-1433358138);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(waxVar) ? 32 : 16;
        }
        int i14 = i3;
        if ((i2 & 384) == 0) {
            i4 = i14 | (M.J(sg50Var) ? 256 : 128);
        } else {
            i4 = i14;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(str3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= M.l(z) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= M.l(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= M.y(izsVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i4 & 1, (i4 & 306782355) != 306782354)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1433358138, i4, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerTopBar (MusicPickerItems.kt:229)");
            }
            String N = d370.N(R.string.music_picker_toolbar_accessibility_search, 0, M);
            q630.a aVar4 = q630.a.a;
            q630 d = rte0.d(txj0.f(aVar4, 1.0f), f5v0.c);
            int i15 = i4 >> 18;
            int i16 = (i15 & 896) | ((i4 >> 15) & 14) | ((i4 << 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1565169198, i16, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.getLeftIcon (MusicPickerItems.kt:327)");
            }
            Object obj2 = a.C0011a.a;
            q630Var2 = aVar4;
            if (z) {
                M.K(-889039395);
                if (androidx.compose.runtime.b.d()) {
                    i13 = 0;
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                } else {
                    i13 = 0;
                }
                lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i13);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N2 = d370.N(R.string.vk_accessibility_back, i13, M);
                boolean z4 = (((i16 & 896) ^ 384) > 256 && M.J(izsVar)) || (i16 & 384) == 256;
                Object x = M.x();
                if (z4 || x == obj2) {
                    x = new oq5(izsVar, 7);
                    M.R(x);
                }
                gzs gzsVar2 = (gzs) x;
                Object x2 = M.x();
                if (x2 == obj2) {
                    x2 = new f1s(13);
                    M.R(x2);
                }
                a2 = TopBar$Before.e.a.a(b2, N2, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 1572872, 24);
                M.j();
            } else if (i <= 1) {
                M.K(-889026434);
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                } else {
                    i6 = 0;
                }
                lg90 b3 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N3 = d370.N(R.string.vk_ui_accessibility_close, i6, M);
                boolean z5 = (((i16 & 896) ^ 384) > 256 && M.J(izsVar)) || (i16 & 384) == 256;
                Object x3 = M.x();
                if (z5 || x3 == obj2) {
                    x3 = new qq5(izsVar, 6);
                    M.R(x3);
                }
                gzs gzsVar3 = (gzs) x3;
                Object x4 = M.x();
                if (x4 == obj2) {
                    x4 = new x620(7);
                    M.R(x4);
                }
                a2 = TopBar$Before.e.a.a(b3, N3, gzsVar3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 1572872, 24);
                M.j();
            } else {
                M.K(-889013891);
                if (androidx.compose.runtime.b.d()) {
                    i5 = 0;
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                } else {
                    i5 = 0;
                }
                lg90 b4 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N4 = d370.N(R.string.vk_accessibility_back, i5, M);
                boolean z6 = (((i16 & 896) ^ 384) > 256 && M.J(izsVar)) || (i16 & 384) == 256;
                Object x5 = M.x();
                if (z6 || x5 == obj2) {
                    x5 = new j87(izsVar, 4);
                    M.R(x5);
                }
                gzs gzsVar4 = (gzs) x5;
                Object x6 = M.x();
                if (x6 == obj2) {
                    x6 = new wo40(2);
                    M.R(x6);
                }
                a2 = TopBar$Before.e.a.a(b4, N4, gzsVar4, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, 1572872, 24);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (z) {
                M.K(1227359882);
                boolean z7 = (i4 & 234881024) == 67108864;
                Object x7 = M.x();
                if (z7 || x7 == obj2) {
                    x7 = new g97(izsVar, 2);
                    M.R(x7);
                }
                Object obj3 = (izs) x7;
                int i17 = (i15 & 7168) | ((i4 >> 3) & 14) | (i15 & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1577742223, i17, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.buildMiddleSearch (MusicPickerItems.kt:292)");
                }
                Object x8 = M.x();
                if (x8 == obj2) {
                    i12 = i4;
                    eVar = a2;
                    x8 = or.a("", 0L, 6, M);
                } else {
                    eVar = a2;
                    i12 = i4;
                }
                wh50 wh50Var = (wh50) x8;
                int i18 = i17 & 14;
                boolean z8 = ((i18 ^ 6) > 4 && M.J(waxVar)) || (i17 & 6) == 4;
                Object x9 = M.x();
                if (z8 || x9 == obj2) {
                    x9 = new mt40(waxVar, wh50Var, null);
                    M.R(x9);
                }
                bap.g(waxVar, (wzs) x9, M, i18);
                String N5 = d370.N(R.string.music_picker_toolbar_search, 0, M);
                tho0 tho0Var = (tho0) wh50Var.getValue();
                if (z3) {
                    M.K(-1602689834);
                    String N6 = d370.N(R.string.music_picker_toolbar_search_voice_talkback, 0, M);
                    boolean z9 = (((i17 & 7168) ^ 3072) > 2048 && M.J(gzsVar)) || (i17 & 3072) == 2048;
                    Object x10 = M.x();
                    if (z9 || x10 == obj2) {
                        x10 = new rs40(0, gzsVar);
                        M.R(x10);
                    }
                    lkg0 a4 = vlh0.a(3072, 4, M, null, N6, (gzs) x10);
                    M.j();
                    lkg0Var = a4;
                } else {
                    M.K(-1602439881);
                    M.j();
                    lkg0Var = null;
                }
                boolean J = M.J(obj3);
                Object x11 = M.x();
                if (J || x11 == obj2) {
                    x11 = new ij8(22, obj3, wh50Var);
                    M.R(x11);
                }
                TopBar$Middle a5 = TopBar$Middle.b.a.a(N5, tho0Var, (izs) x11, lkg0Var, null, null, null, null, null, true, null, false, M, 805306368, 384, 3568);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                str3 = str;
                a3 = a5;
                obj = obj2;
                i7 = i12;
                str2 = N;
                i9 = 2;
                i8 = 1;
                aVar2 = null;
            } else {
                eVar = a2;
                int i19 = i4;
                M.K(1227371438);
                i7 = i19;
                str2 = N;
                i8 = 1;
                aVar2 = null;
                str3 = str;
                TopBar$Middle.Text.Title a6 = TopBar$Middle.Text.Title.b.a(str3, null, null, null, null, M, ((i19 >> 12) & 14) | 196608, 30);
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                boolean z10 = (57344 & i7) == 16384;
                Object x12 = M.x();
                if (z10) {
                    obj = obj2;
                } else {
                    obj = obj2;
                }
                x12 = new rqd(str3, 5);
                M.R(x12);
                i9 = 2;
                a3 = TopBar$Middle.Text.b.a(a6, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x12, 2), M, 6);
                M.j();
            }
            if (z2) {
                M.K(1227385886);
                if (androidx.compose.runtime.b.d()) {
                    i10 = -1;
                    i11 = 0;
                    androidx.compose.runtime.b.f(-1717878368, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline28> (VkSdkIcons.kt:3020)");
                } else {
                    i10 = -1;
                    i11 = 0;
                }
                lg90 b5 = or.b(M, 1516014657, R.drawable.vk_icon_search_outline_28, M, i11);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N7 = d370.N(R.string.music_picker_toolbar_accessibility_search, i11, M);
                int i20 = (i7 & 234881024) == 67108864 ? i8 : i11;
                if ((i7 & 896) != 256) {
                    i8 = i11;
                }
                int i21 = i20 | i8;
                Object x13 = M.x();
                if (i21 != 0 || x13 == obj) {
                    x13 = new ni0(10, izsVar, sg50Var);
                    M.R(x13);
                }
                gzs gzsVar5 = (gzs) x13;
                SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.ClearAndSet;
                boolean J2 = M.J(str2);
                Object x14 = M.x();
                if (J2 || x14 == obj) {
                    x14 = new vrs(str2, 1);
                    M.R(x14);
                }
                com.vk.core.compose.component.topbar.a a7 = d.a.a(d.c.C0760d.a.a(b5, N7, gzsVar5, null, null, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x14, i9), M, 1572872, 24), null, null, null, M, 24576, 14);
                M.j();
                aVar3 = a7;
            } else {
                i10 = -1;
                i11 = 0;
                M.K(-605020648);
                M.j();
                aVar3 = aVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i11, i10, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, d, k.b.a, null, null, eVar, aVar3, null, false, ylu0Var.getBackground().g, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 0, 7576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final String str4 = str3;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.bt40
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    lt40.f(i, waxVar, sg50Var, q630Var3, str4, z, z2, z3, izsVar, gzsVar, (androidx.compose.runtime.a) obj4, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final cc40 cc40Var, final a97 a97Var, final z87 z87Var, final b97 b97Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1371762030);
        if ((i & 6) == 0) {
            i2 = (M.J(cc40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(a97Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(z87Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(b97Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1371762030, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.SnippetRightIcons (MusicPickerItems.kt:779)");
            }
            wh50 c = androidx.compose.runtime.k.c(Boolean.valueOf(cc40Var.l), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1794058044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Filter24> (VkSdkIcons.kt:890)");
            }
            lg90 b2 = or.b(M, 210325805, R.drawable.vk_icon_filter_24, M, 0);
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
            long j = ylu0Var.getIcon().l;
            String N = d370.N(R.string.posting_step2_snippet_settings_music_button_content_description, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new oqu(13);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.x a2 = com.vk.core.compose.component.cell.content.p.a(b2, j, 0L, N, a97Var, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2), M, 1572872 | ((i2 << 9) & 57344), 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-78024716, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline24> (VkSdkIcons.kt:270)");
            }
            lg90 b3 = or.b(M, -856830611, R.drawable.vk_icon_cancel_outline_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getIcon().l;
            String N2 = d370.N(R.string.posting_step2_remove_music_button_content_description, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bqt(10);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.p.a(b3, j2, 0L, N2, z87Var, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 1572872 | ((i2 << 6) & 57344), 4);
            boolean booleanValue = ((Boolean) c.getValue()).booleanValue();
            boolean z = (i2 & 7168) == 2048;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new tcn(b97Var, 26);
                M.R(x3);
            }
            int i3 = i2;
            buv0 z2 = rdi.z(booleanValue, (izs) x3, null, M, 0, 4);
            Boolean bool = (Boolean) c.getValue();
            bool.getClass();
            boolean y = M.y(z2) | M.J(c);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new kt40(z2, c, null);
                M.R(x4);
            }
            bap.g(bool, (wzs) x4, M, 0);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, a4, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(-880605302);
            String str = cc40Var.k;
            if (str == null) {
                str = "";
            }
            o9v0.a(str, z2, null, null, VkTooltip$MarkerSize.Size56, null, VkTooltip$BalloonPosition.TopLeft, null, a97Var, b97Var, null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(-1903067836, new it7(a2, 4), M), M, ((i3 << 21) & 234881024) | 1597440 | ((i3 << 18) & 1879048192), 805306368, 523436);
            aVar2 = M;
            aVar2.j();
            float f = kqu0.t;
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.v(aVar4, f), aVar2, 0);
            aVar2.K(-880588328);
            a3.a(tpg0.a, aVar4, aVar2, 54);
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ss40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lt40.g(cc40.this, a97Var, z87Var, b97Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1296839650);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1296839650, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.errorPlaceholder (MusicPickerItems.kt:633)");
            }
            dt1.a.getClass();
            q630 b2 = ra8Var.b(q630.a.a, dt1.a.f);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nxu(izsVar, 1);
                M.R(x);
            }
            ldv0.b(b2, false, null, (gzs) x, M, 0, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iy9(izsVar, i, 1);
        }
    }

    public static final void i(tgi0 tgi0Var, int i) {
        qcy<Object> qcyVar = a[0];
        Integer valueOf = Integer.valueOf(i);
        sgi0<Integer> sgi0Var = b;
        sgi0Var.getClass();
        tgi0Var.a(sgi0Var, valueOf);
    }
}
