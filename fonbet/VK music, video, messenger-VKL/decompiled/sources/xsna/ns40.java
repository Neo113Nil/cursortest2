package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.vgc0;

/* compiled from: MusicPickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class ns40 {
    public static final void a(ma40 ma40Var, ActionsAvailabilityState.AttachmentState attachmentState, ActionsAvailabilityState.AttachmentState attachmentState2, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        gzs gzsVar;
        ActionsAvailabilityState.AttachmentState attachmentState3;
        a.C0011a.C0012a c0012a;
        int i3;
        Cell$Left cell$Left;
        gbx0 gbx0Var;
        androidx.compose.runtime.a M = aVar.M(41720134);
        if ((i & 6) == 0) {
            i2 = (M.J(ma40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(attachmentState2) : M.y(attachmentState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(41720134, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.MusicPickerEntryPointCell (MusicPickerEntryPointCell.kt:32)");
            }
            ActionsAvailabilityState.Availability availability = attachmentState.b;
            if (!(availability instanceof ActionsAvailabilityState.Availability.Available)) {
                ActionsAvailabilityState.Availability availability2 = attachmentState2.b;
                if (!(availability2 instanceof ActionsAvailabilityState.Availability.Available)) {
                    if (!(availability instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                        if (!(availability2 instanceof ActionsAvailabilityState.Availability.NotAvailable)) {
                            availability = ActionsAvailabilityState.Availability.Available.b;
                        }
                    }
                }
                availability = availability2;
            }
            ActionsAvailabilityState.AttachmentState attachmentState4 = new ActionsAvailabilityState.AttachmentState(availability, ma40Var.g ? attachmentState2.c : attachmentState.c);
            boolean z2 = ma40Var.f;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2) {
                M.K(1639997922);
                boolean y = ((i4 & 7168) == 2048) | M.y(attachmentState4);
                Object x = M.x();
                if (y || x == c0012a2) {
                    x = new com.vk.movika.sdk.base.ui.k(16, izsVar, attachmentState4);
                    M.R(x);
                }
                M.j();
                z = true;
                gzsVar = (gzs) x;
            } else {
                M.K(1640121736);
                M.j();
                z = true;
                gzsVar = null;
            }
            boolean y2 = ((i4 & 7168) == 2048 ? z : false) | M.y(attachmentState4);
            Object x2 = M.x();
            if (y2 || x2 == c0012a2) {
                x2 = new com.vk.movika.sdk.base.ui.l(16, izsVar, attachmentState4);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            if (ma40Var.e == null) {
                M.K(1640364001);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-662252324, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MusicOutline28> (VkSdkIcons.kt:2684)");
                }
                lg90 b = or.b(M, 1920949126, R.drawable.vk_icon_music_outline_28, M, 0);
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
                Cell$Left a = vgc0.a.a(b, ylu0Var.getIcon().l, M);
                M.j();
                c0012a = c0012a2;
                i3 = 0;
                cell$Left = a;
                attachmentState3 = attachmentState4;
            } else {
                M.K(1640502385);
                attachmentState3 = attachmentState4;
                c0012a = c0012a2;
                i3 = 0;
                Cell$Left a2 = toc0.a(fwu0.l(null, ma40Var.e, null, null, M, 0, 61), M);
                M.j();
                cell$Left = a2;
            }
            float f = attachmentState3.b instanceof ActionsAvailabilityState.Availability.Available ? 1.0f : 0.5f;
            us2 us2Var = ma40Var.a;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            int i5 = (i4 & 14) == 4 ? 1 : i3;
            Object x3 = M.x();
            if (i5 != 0 || x3 == c0012a) {
                x3 = new jjx(ma40Var, 14);
                M.R(x3);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
            if (ma40Var.c) {
                M.K(1438410578);
                qzu0.a.getClass();
                gbx0 gbx0Var2 = new gbx0(qzu0.M(M));
                M.j();
                gbx0Var = gbx0Var2;
            } else {
                M.K(1641148951);
                M.j();
                gbx0Var = null;
            }
            qoc0.c(us2Var, o19.a(ahn.E(q630.a.a, "PostingOpenMusicPickerButton"), f), gbx0Var, cell$Left, ma40Var.d, d370.N(R.string.posting_step2_remove_music_button_content_description, i3, M), null, a3, null, gzsVar2, gzsVar, 1, 0, false, M, 0, 48, 12608);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hai(ma40Var, attachmentState, attachmentState2, izsVar, i, 2);
        }
    }
}
