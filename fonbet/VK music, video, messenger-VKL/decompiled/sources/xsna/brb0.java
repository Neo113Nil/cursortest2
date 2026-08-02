package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PollPickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class brb0 {
    public static final void a(PostingPollDto postingPollDto, PostingPollSettings postingPollSettings, ActionsAvailabilityState.AttachmentState attachmentState, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        PostingPollSettings postingPollSettings2;
        androidx.compose.runtime.a aVar2;
        Object uw5Var;
        float f;
        int i3;
        String a;
        PostingPollDto postingPollDto2 = postingPollDto;
        androidx.compose.runtime.a M = aVar.M(-1567832987);
        if ((i & 6) == 0) {
            i2 = (M.J(postingPollDto2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            postingPollSettings2 = postingPollSettings;
            i2 |= M.J(postingPollSettings2) ? 32 : 16;
        } else {
            postingPollSettings2 = postingPollSettings;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1567832987, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollPickerEntryPointCell (PollPickerEntryPointCell.kt:28)");
            }
            int i4 = i2 & 14;
            int i5 = i2 & 7168;
            int i6 = i2 & 896;
            boolean z = (i4 == 4) | (i5 == 2048) | (i6 == 256 || ((i2 & 512) != 0 && M.y(attachmentState)));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new svd(postingPollDto2, izsVar, attachmentState, 9);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            float f2 = attachmentState.b instanceof ActionsAvailabilityState.Availability.Available ? 1.0f : 0.5f;
            boolean z2 = ((i2 & 112) == 32) | (i5 == 2048) | (i6 == 256 || ((i2 & 512) != 0 && M.y(attachmentState))) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                f = f2;
                uw5Var = new uw5(2, postingPollSettings2, izsVar, attachmentState, postingPollDto);
                postingPollDto2 = postingPollDto;
                M.R(uw5Var);
            } else {
                f = f2;
                uw5Var = x2;
            }
            gzs gzsVar2 = (gzs) uw5Var;
            String str = postingPollDto2 != null ? postingPollDto2.d : null;
            if (str == null || str.length() == 0) {
                i3 = 0;
                a = zq.a(M, 458236615, R.string.posting_step2_poll_button_content_description, M, 0);
            } else {
                i3 = 0;
                a = zq.a(M, 458327259, R.string.posting_step2_poll_button, M, 0);
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(933332040, i3, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PollOutline20> (VkIcons.kt:9148)");
            }
            lg90 b = or.b(M, -723299170, R.drawable.vk_icon_poll_outline_20, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.posting_step2_poll_button, i3, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(a);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new zw(a, 6);
                M.R(x3);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
            String str2 = postingPollDto2 != null ? postingPollDto2.d : null;
            String N2 = d370.N(R.string.posting_step2_poll_accessibility_remove, 0, M);
            if (postingPollDto2 == null) {
                gzsVar = null;
            }
            SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.Merge;
            boolean z3 = i4 == 4;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new arb0(postingPollDto2, 0);
                M.R(x4);
            }
            aVar2 = M;
            qoc0.a(b, N, o19.a(ahn.E(q630.a.a, "PostingOpenPollEditorButton"), f), str2, N2, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x4, 2), a2, null, gzsVar2, gzsVar, 0, 0, aVar2, 8, 0, 3200);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lb10(postingPollDto2, postingPollSettings, attachmentState, izsVar, i);
        }
    }
}
