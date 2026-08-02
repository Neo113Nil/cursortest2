package xsna;

import com.vkontakte.android.R;
import xsna.jqe;

/* compiled from: CoverContent.kt */
/* loaded from: classes16.dex */
public final class zzr implements com.vk.core.compose.component.cell.content.o {
    public final jqe a;

    public zzr(jqe jqeVar) {
        this.a = jqeVar;
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 r;
        long j;
        androidx.compose.runtime.a M = aVar.M(-62105840);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-62105840, i2, -1, "com.vk.clips.playlists.folders.list.ui.FolderRightIcon.Content (CoverContent.kt:225)");
            }
            jqe.a aVar2 = jqe.a.a;
            jqe jqeVar = this.a;
            if (jqeVar.equals(aVar2)) {
                M.K(935963739);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1416148378, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Reorder24> (VkSdkIcons.kt:2948)");
                }
                lg90 b = or.b(M, -987250162, R.drawable.vk_icon_reorder_24, M, 0);
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
                vqv.a(b, null, null, ylu0Var.getIcon().l, M, 56, 4);
                M.j();
            } else {
                if (!(jqeVar instanceof jqe.b)) {
                    throw alb0.c(445833008, M);
                }
                M.K(936229533);
                boolean z = ((jqe.b) jqeVar).a;
                if (z) {
                    M.K(445845375);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                    }
                    r = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.K(445846304);
                    qzu0.a.getClass();
                    r = qzu0.r(M);
                }
                M.j();
                if (z) {
                    M.K(445850938);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().a;
                } else {
                    M.K(445852092);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getIcon().n;
                }
                M.j();
                vqv.a(r, null, null, j, M, 56, 4);
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
            s.d = new q1h(i, 2, this, spg0Var, q630Var);
        }
    }
}
