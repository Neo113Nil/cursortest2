package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: VideoAlbumActionItem.kt */
/* loaded from: classes16.dex */
public final class t0s0 {

    /* compiled from: VideoAlbumActionItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAlbumActionItem.values().length];
            try {
                iArr[VideoAlbumActionItem.PLAYLIST_ADD_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAlbumActionItem.EDIT_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAlbumActionItem.REMOVE_PLAYLIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAlbumActionItem.COPY_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoAlbumActionItem.COPY_PLAYLIST_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoAlbumActionItem.SHARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoAlbumActionItem.SHARE_PLAYLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoAlbumActionItem.UNSUBSCRIBE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoAlbumActionItem.SUBSCRIBE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoAlbumActionItem.GO_TO_AUTHOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VideoAlbumActionItem videoAlbumActionItem, String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        long j;
        Cell$Left a2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(445861166);
        int i2 = i | (M.o(videoAlbumActionItem.ordinal()) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(445861166, i2, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumCell (VideoAlbumActionItem.kt:70)");
            }
            String N = d370.N(videoAlbumActionItem.h(), 0, M);
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1914667140, i3, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.left (VideoAlbumActionItem.kt:110)");
            }
            if (videoAlbumActionItem != VideoAlbumActionItem.GO_TO_AUTHOR || str == null) {
                M.K(1612230539);
                int i4 = i2 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-881501833, i4, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.icon (VideoAlbumActionItem.kt:95)");
                }
                switch (a.$EnumSwitchMapping$0[videoAlbumActionItem.ordinal()]) {
                    case 1:
                        M.K(-1014700914);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-332205872, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoAddSquareOutline28> (VkIcons.kt:11488)");
                        }
                        b = or.b(M, -1140298998, R.drawable.vk_icon_video_add_square_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 2:
                        M.K(-1014699132);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                        }
                        b = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 3:
                        M.K(-1014697594);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1369856538, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline28> (VkSdkIcons.kt:630)");
                        }
                        b = or.b(M, -1382946425, R.drawable.vk_icon_delete_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 4:
                        M.K(-1014696188);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(4547654, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CopyOutline28> (VkSdkIcons.kt:584)");
                        }
                        b = or.b(M, -1959618595, R.drawable.vk_icon_copy_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 5:
                        M.K(-1014694555);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-693665444, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChainOutline28> (VkSdkIcons.kt:318)");
                        }
                        b = or.b(M, -1899405562, R.drawable.vk_icon_chain_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 6:
                    case 7:
                        M.K(-1014692795);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
                        }
                        b = or.b(M, 1878014662, R.drawable.vk_icon_share_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 8:
                        M.K(-1014691445);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1996727102, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MinusSquareOutline28> (VkIcons.kt:7686)");
                        }
                        b = or.b(M, 800133596, R.drawable.vk_icon_minus_square_outline_28, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 9:
                        M.K(-1014689884);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
                        }
                        b = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        break;
                    case 10:
                        M.K(-1014688448);
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
                        throw alb0.c(-1014702024, M);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                lg90 lg90Var = b;
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1477040428, i4, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.iconTint (VideoAlbumActionItem.kt:127)");
                }
                if (videoAlbumActionItem == VideoAlbumActionItem.UNSUBSCRIBE || videoAlbumActionItem == VideoAlbumActionItem.REMOVE_PLAYLIST) {
                    M.K(-571200234);
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
                    M.K(-571047342);
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
                a2 = com.vk.core.compose.component.cell.content.f.a(lg90Var, size, j, null, null, M, 196664, 24);
                aVar2 = M;
                aVar2.j();
            } else {
                M.K(1612047763);
                a2 = com.vk.core.compose.component.cell.content.e.b(phw.a.a(fwu0.l(str, null, null, null, M, (i3 >> 3) & 14, 62), null, null, null, null, M, 196616, 30), 28, null, M, 100663344, 252);
                aVar2 = M;
                aVar2.j();
            }
            Cell$Left cell$Left = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.K(-1683225508);
            androidx.compose.runtime.a aVar3 = aVar2;
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(N, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            aVar3.j();
            wiu0.b(null, false, cell$Left, Cell$Middle.a.a(a3, null, null, null, aVar3, 196608, 30), null, gzsVar, null, aVar3, (i2 << 9) & 458752, 83);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k77(i, 5, videoAlbumActionItem, str, gzsVar);
        }
    }

    public static final void b(xow<? extends VideoAlbumActionItem> xowVar, String str, izs<? super VideoAlbumActionItem, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1961894533);
        int i2 = (M.J(xowVar) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1961894533, i2, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumMenu (VideoAlbumActionItem.kt:53)");
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
            M.K(1813253253);
            for (VideoAlbumActionItem videoAlbumActionItem : xowVar) {
                boolean o = ((i2 & 896) == 256) | M.o(videoAlbumActionItem.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.presenter.c(23, izsVar, videoAlbumActionItem);
                    M.R(x);
                }
                a(videoAlbumActionItem, str, (gzs) x, M, i2 & 112);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ri1((xow) xowVar, str, (izs) izsVar, i);
        }
    }
}
