package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFeatureCell;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.f2s0;
import xsna.hsk;
import xsna.phw;
import xsna.q630;
import xsna.wkj;

/* compiled from: ClipsUploadVideoAttachItem.kt */
/* loaded from: classes17.dex */
public final class glf {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final gzs gzsVar, final q630 q630Var, final boolean z, final boolean z2) {
        gzs gzsVar2;
        int i2;
        lg90 b;
        com.vk.core.compose.component.cell.content.h1 a;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-889098171);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-889098171, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.video.VideoAttachmentEmptyCell (ClipsUploadVideoAttachItem.kt:74)");
            }
            if (z2) {
                M.K(-60023973);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(284187004, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ClipsAttachOutline28> (VkSdkIcons.kt:544)");
                }
                b = pg90.a(R.drawable.vk_icon_clips_attach_outline_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-59920805);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(851324796, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VideoSquareOutline28> (VkSdkIcons.kt:3712)");
                }
                b = or.b(M, 35297503, R.drawable.vk_icon_video_square_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a2 = com.vk.core.compose.component.cell.content.f.a(lg90Var, Cell$Left.Main.Size.Medium, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            if (z2) {
                M.K(-59628196);
                a = Cell$Middle.d.b.a(d370.N(R.string.clips_publish_video_attachment_button_title_v2, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                M.K(-59462625);
                a = Cell$Middle.d.b.a(d370.N(R.string.clips_publish_video_attachment_button_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a, null, null, null, M, 196608, 30);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.movika.sdk.base.observable.s(18);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.u0 a4 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), 0L, false, M, 196608, 27);
            M.K(275189019);
            q630.a aVar2 = q630.a.a;
            if (z) {
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = ir.h(M);
                }
                q630Var2 = q630Var.g(ojc.b(aVar2, (sg50) x2, null, false, null, gzsVar2, 28));
            } else {
                q630Var2 = q630Var;
            }
            M.j();
            if (!z) {
                q630Var2 = q630Var2.g(o19.a(aVar2, 0.64f));
            }
            wiu0.b(ahn.E(q630Var2, ClipsUploadFeatureCell.VideoAttachment.i()), false, a2, a3, a4, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.elf
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    glf.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final f2s0 f2s0Var, boolean z, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        q630 q630Var2;
        final boolean z2;
        final gzs gzsVar4;
        androidx.compose.runtime.a M = aVar.M(1142158270);
        int i2 = (M.J(f2s0Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1142158270, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.video.VideoAttachmentItem (ClipsUploadVideoAttachItem.kt:45)");
            }
            if (f2s0Var instanceof f2s0.a) {
                M.K(1306369291);
                gzsVar3 = gzsVar;
                q630Var2 = q630Var;
                a(((i2 >> 6) & 14) | ((i2 << 3) & 896) | ((i2 >> 3) & 7168), M, gzsVar3, q630Var2, !((f2s0.a) f2s0Var).a, z);
                z2 = z;
                M.j();
                gzsVar4 = gzsVar2;
            } else {
                gzsVar3 = gzsVar;
                z2 = z;
                if (!(f2s0Var instanceof f2s0.b)) {
                    throw alb0.c(-1897522998, M);
                }
                M.K(1306660567);
                c((f2s0.b) f2s0Var, z2, gzsVar3, gzsVar2, q630Var, M, i2 & 65520);
                gzsVar4 = gzsVar2;
                q630Var2 = q630Var;
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar;
            q630Var2 = q630Var;
            z2 = z;
            gzsVar4 = gzsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final gzs gzsVar5 = gzsVar3;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(z2, gzsVar5, gzsVar4, q630Var3, i) { // from class: xsna.clf
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    glf.b(f2s0.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final f2s0.b bVar, final boolean z, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a aVar2;
        z190 a;
        androidx.compose.runtime.a M = aVar.M(501016666);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 256 : 128;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i & 3072) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 2048 : 1024;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(501016666, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.video.VideoAttachmentItemCell (ClipsUploadVideoAttachItem.kt:123)");
            }
            phw a2 = phw.a.a(fwu0.l(bVar.b, null, null, new qow(new flf()), M, 0, 30), null, wkj.a.a, null, null, M, 197000, 26);
            androidx.compose.runtime.a aVar3 = M;
            float f = 28;
            if (z) {
                aVar3.K(778223804);
                aVar3.j();
                a = tgp.a;
            } else {
                aVar3.K(778277186);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2073634940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VideoSquareOutline20> (VkSdkIcons.kt:3708)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_video_square_outline_20, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = hsk.a.a(a3, l5g.d, aVar3, 3128, 4);
                aVar3 = aVar3;
                aVar3.j();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.z b = com.vk.core.compose.component.cell.content.g.b(a2, f, a, PictureRadius.Large, null, null, aVar4, 100);
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(bVar.a, null, null, 1, null, null, aVar4, 12610560, 102), Cell$Middle.c.b.b(d370.N(R.string.clips_publish_video_attachment_description, 0, aVar4), 0, null, null, null, aVar4, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar4, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b2 = or.b(aVar4, 1833859693, R.drawable.vk_icon_cancel_24, aVar4, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 24;
            com.vk.core.compose.component.cell.content.y0 a5 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b2, ylu0Var.getIcon().l, byc0.b(f2, f2), d370.N(R.string.clips_publish_remove_attachment_a11y, 0, aVar4), gzsVar4, null, aVar4, 1573256 | ((i2 << 3) & 57344), 32), null, null, null, aVar4, 61);
            Object x = aVar4.x();
            if (x == a.C0011a.a) {
                x = ir.h(aVar4);
            }
            wiu0.b(ojc.b(q630Var, (sg50) x, null, false, null, gzsVar3, 28), false, b, a4, a5, null, null, aVar4, 0, 98);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dlf
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    glf.c(f2s0.b.this, z, gzsVar, gzsVar2, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
