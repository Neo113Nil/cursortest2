package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.vgc0;

/* compiled from: FilePickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class v9r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(FileDto fileDto, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        gzs gzsVar;
        String str;
        lg90 a;
        vgc0 vgc0Var;
        String a2;
        UploadDto.UploadState I4;
        UploadDto.UploadState I42;
        androidx.compose.runtime.a M = aVar.M(137366486);
        if ((i & 6) == 0) {
            i2 = (M.J(fileDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(137366486, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.FilePickerEntryPointCell (FilePickerEntryPointCell.kt:26)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (fileDto != null) {
                M.K(-818676889);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new qq5(izsVar, 4);
                    M.R(x);
                }
                M.j();
                gzsVar = (gzs) x;
            } else {
                M.K(-818604008);
                M.j();
                gzsVar = null;
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            String title = fileDto != null ? fileDto.getTitle() : null;
            if (title == null) {
                title = zq.a(M, -1134782296, R.string.posting_step2_file_button, M, 0);
            } else {
                M.K(-1134782761);
                M.j();
            }
            if (fileDto != null) {
                M.K(-818420085);
                Integer f = fileDto.f();
                if (f != null) {
                    M.K(-818347049);
                    String N = d370.N(f.intValue(), 0, M);
                    M.j();
                    str = N;
                } else {
                    M.K(-818287653);
                    M.j();
                    str = dun.s6(fileDto.e(), context.getResources());
                }
                M.j();
            } else {
                M.K(-818197288);
                M.j();
                str = null;
            }
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new n0(13, fileDto, izsVar);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            if (((fileDto == null || (I42 = fileDto.I4()) == null) ? null : I42.b) instanceof UploadDto.UploadStep.Failed) {
                M.K(-817810656);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1769762850, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ErrorCircleOutline20> (VkIcons.kt:2440)");
                }
                a = or.b(M, -2013281668, R.drawable.vk_icon_error_circle_outline_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-817761149);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1515838448, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DocumentOutline20> (VkIcons.kt:1976)");
                }
                a = pg90.a(R.drawable.vk_icon_document_outline_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (epx.f((fileDto == null || (I4 = fileDto.I4()) == null) ? null : I4.b, UploadDto.UploadStep.Uploading.b)) {
                M.K(-817630670);
                int i3 = fileDto.I4().f;
                float f2 = i3 == 0 ? Float.NaN : r5.e / i3;
                float f3 = 24;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-45976077, 384, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.PostingStep2LeftProgressContent.Companion.invoke (PostingStep2LeftProgressContent.kt:56)");
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new uoc0(f3, f2);
                    M.R(x3);
                }
                uoc0 uoc0Var = (uoc0) x3;
                ((zak0) uoc0Var.a).setValue(new pco(f3));
                ((vak0) uoc0Var.b).g(f2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                vgc0Var = uoc0Var;
            } else {
                M.K(-817535314);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vgc0 a3 = vgc0.a.a(a, ylu0Var.getIcon().l, M);
                M.j();
                vgc0Var = a3;
            }
            String title2 = fileDto != null ? fileDto.getTitle() : null;
            if (title2 == null || title2.length() == 0) {
                a2 = zq.a(M, -817346896, R.string.posting_step2_empty_file_button_content_description, M, 0);
            } else {
                M.K(-817249556);
                a2 = d370.O(R.string.posting_step2_file_button_content_description, new Object[]{title2}, M);
                M.j();
            }
            q630 E = ahn.E(q630.a.a, "PostingAddFileButton");
            String N2 = d370.N(R.string.posting_step2_file_accessibility_remove, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(a2);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new ak2(a2, 2);
                M.R(x4);
            }
            aVar2 = M;
            qoc0.b(title, E, vgc0Var, str, N2, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), null, gzsVar2, gzsVar, 1, 0, false, aVar2, 48, 48, 12612);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wp8(fileDto, izsVar, i, 2);
        }
    }
}
