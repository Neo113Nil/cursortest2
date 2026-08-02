package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistActionItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VideoPlaylistMenu.kt */
/* loaded from: classes2.dex */
public final class y4t0 {

    /* compiled from: VideoPlaylistMenu.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPlaylistActionItem.values().length];
            try {
                iArr[VideoPlaylistActionItem.UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlaylistActionItem.ADD_VIDEO_BY_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlaylistActionItem.EDIT_PLAYLIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPlaylistActionItem.REMOVE_PLAYLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPlaylistActionItem.COPY_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoPlaylistActionItem.COPY_PLAYLIST_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoPlaylistActionItem.SHARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoPlaylistActionItem.SHARE_PLAYLIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoPlaylistActionItem.GO_TO_AUTHOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VideoPlaylistActionItem videoPlaylistActionItem, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2;
        lg90 b;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1934305770);
        int i2 = (M.o(videoPlaylistActionItem.ordinal()) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1934305770, i2, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistCell (VideoPlaylistMenu.kt:36)");
            }
            String N = d370.N(videoPlaylistActionItem.h(), 0, M);
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1648650027, i3, -1, "com.vk.libvideo.bottomsheet.videoplaylist.left (VideoPlaylistMenu.kt:60)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1427933295, i3, -1, "com.vk.libvideo.bottomsheet.videoplaylist.icon (VideoPlaylistMenu.kt:69)");
            }
            switch (a.$EnumSwitchMapping$0[videoPlaylistActionItem.ordinal()]) {
                case 1:
                    M.K(-2145634466);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1892312980, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UploadOutline28> (VkIcons.kt:11062)");
                    }
                    b = or.b(M, -1844566576, R.drawable.vk_icon_upload_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 2:
                    M.K(-2145632124);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1590704444, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-FilmStripAddOutline28> (VkIcons.kt:2618)");
                    }
                    b = pg90.a(R.drawable.vk_icon_film_strip_add_outline_28, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 3:
                    M.K(-2145629636);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                    }
                    b = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 4:
                    M.K(-2145627330);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1369856538, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline28> (VkSdkIcons.kt:630)");
                    }
                    b = or.b(M, -1382946425, R.drawable.vk_icon_delete_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 5:
                    M.K(-2145625156);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(4547654, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CopyOutline28> (VkSdkIcons.kt:584)");
                    }
                    b = or.b(M, -1959618595, R.drawable.vk_icon_copy_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 6:
                    M.K(-2145622755);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-693665444, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChainOutline28> (VkSdkIcons.kt:318)");
                    }
                    b = or.b(M, -1899405562, R.drawable.vk_icon_chain_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 7:
                case 8:
                    M.K(-2145619459);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
                    }
                    b = or.b(M, 1878014662, R.drawable.vk_icon_share_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                case 9:
                    M.K(-2145617224);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1440099070, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Profile28> (VkSdkIcons.kt:2902)");
                    }
                    b = pg90.a(R.drawable.vk_icon_profile_28, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    break;
                default:
                    throw alb0.c(-2145635791, M);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(974051660, i3, -1, "com.vk.libvideo.bottomsheet.videoplaylist.iconTint (VideoPlaylistMenu.kt:81)");
            }
            if (videoPlaylistActionItem == VideoPlaylistActionItem.REMOVE_PLAYLIST) {
                M.K(1174198046);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().h;
                M.j();
            } else {
                M.K(1174350938);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().b;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a2 = com.vk.core.compose.component.cell.content.f.a(b, size, j, null, null, M, 196664, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.K(673578580);
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(N, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.j();
            gzsVar2 = gzsVar;
            wiu0.b(null, false, a2, Cell$Middle.a.a(a3, null, null, null, M, 196608, 30), null, gzsVar2, null, M, (i2 << 12) & 458752, 83);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qg(videoPlaylistActionItem, gzsVar2, i, 10);
        }
    }

    public static final void b(xow<? extends VideoPlaylistActionItem> xowVar, izs<? super VideoPlaylistActionItem, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1931326414);
        int i2 = (M.J(xowVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1931326414, i2, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistMenu (VideoPlaylistMenu.kt:21)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            M.K(-1228812822);
            for (VideoPlaylistActionItem videoPlaylistActionItem : xowVar) {
                boolean o = ((i2 & 112) == 32) | M.o(videoPlaylistActionItem.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new s4s0(2, izsVar, videoPlaylistActionItem);
                    M.R(x);
                }
                a(videoPlaylistActionItem, (gzs) x, M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nz1(xowVar, izsVar, i, 10);
        }
    }
}
