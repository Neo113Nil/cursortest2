package xsna;

import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerState;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.u3e0;

/* compiled from: PostingPendingProgressHolder.kt */
/* loaded from: classes4.dex */
public final class zjc0 {
    public final PreviewAttachmentWrapper a;
    public a1u0 b;
    public u3e0 c = u3e0.c.a;

    public zjc0(PreviewAttachmentWrapper previewAttachmentWrapper, a1u0 a1u0Var) {
        this.a = previewAttachmentWrapper;
        this.b = a1u0Var;
        boolean z = a1u0Var.a;
        previewAttachmentWrapper.setSpinnerSize(z ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
        previewAttachmentWrapper.setSpinnerScreen(!z);
    }

    public final void a(u3e0 u3e0Var) {
        PreviewAttachmentWrapper previewAttachmentWrapper = this.a;
        PostingVkSpinnerWrapperView postingVkSpinnerWrapperView = previewAttachmentWrapper.c;
        if (u3e0Var instanceof u3e0.e) {
            PostingSpinnerState postingSpinnerState = PostingSpinnerState.Loading;
            if (previewAttachmentWrapper.getSpinnerState() != postingSpinnerState) {
                previewAttachmentWrapper.setSpinnerState(postingSpinnerState);
            }
            u3e0.e eVar = (u3e0.e) u3e0Var;
            if (eVar.b) {
                previewAttachmentWrapper.setSpinnerSubtitle(previewAttachmentWrapper.getContext().getString(R.string.attachment_uploading_percentage, Integer.valueOf(eVar.a)));
            } else {
                previewAttachmentWrapper.setSpinnerSubtitle(null);
            }
        } else if (u3e0Var.equals(u3e0.d.a)) {
            PostingSpinnerState postingSpinnerState2 = PostingSpinnerState.Loading;
            if (previewAttachmentWrapper.getSpinnerState() != postingSpinnerState2) {
                previewAttachmentWrapper.setSpinnerState(postingSpinnerState2);
            }
            previewAttachmentWrapper.setSpinnerSubtitle(null);
        } else if (u3e0Var instanceof u3e0.b) {
            PostingSpinnerState postingSpinnerState3 = PostingSpinnerState.Error;
            if (previewAttachmentWrapper.getSpinnerState() != postingSpinnerState3) {
                previewAttachmentWrapper.setSpinnerState(postingSpinnerState3);
            }
            if (((u3e0.b) u3e0Var).a) {
                previewAttachmentWrapper.setSpinnerSubtitle(previewAttachmentWrapper.getContext().getString(R.string.attachment_uploading_error));
            } else {
                previewAttachmentWrapper.setSpinnerSubtitle(null);
            }
        } else if (u3e0Var.equals(u3e0.a.a)) {
            PostingSpinnerState postingSpinnerState4 = PostingSpinnerState.Done;
            if (previewAttachmentWrapper.getSpinnerState() != postingSpinnerState4) {
                previewAttachmentWrapper.setSpinnerState(postingSpinnerState4);
            }
            previewAttachmentWrapper.setSpinnerSubtitle(null);
        } else if (!u3e0Var.equals(u3e0.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u3e0 u3e0Var2 = this.c;
        if (!epx.f(u3e0Var2, u3e0Var)) {
            if ((epx.f(u3e0Var2, u3e0.d.a) || (u3e0Var2 instanceof u3e0.e)) && epx.f(u3e0Var, u3e0.a.a)) {
                postingVkSpinnerWrapperView.bringToFront();
                postingVkSpinnerWrapperView.postDelayed(new m67(previewAttachmentWrapper, 9), 500L);
            } else {
                boolean z = (epx.f(u3e0Var, u3e0.c.a) || epx.f(u3e0Var, u3e0.a.a)) ? false : true;
                if (bwt0.K(postingVkSpinnerWrapperView) != z) {
                    postingVkSpinnerWrapperView.bringToFront();
                    j6r0.d(postingVkSpinnerWrapperView, z ? 0 : 8, false, 300, null);
                }
            }
        }
        this.c = u3e0Var;
    }
}
