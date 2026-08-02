package xsna;

import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: PreviewPostMediaStep2Content.kt */
/* loaded from: classes4.dex */
public final class a5d0 implements x64 {
    public final /* synthetic */ c5d0 b;

    public a5d0(c5d0 c5d0Var) {
        this.b = c5d0Var;
    }

    @Override // xsna.x64
    public final void a(Attachment attachment) {
        this.b.a.invoke(PostingAction.ShowModalBackToStep1.b);
    }

    @Override // xsna.x64
    public final void c(Attachment attachment) {
        if (attachment == null) {
            return;
        }
        c5d0 c5d0Var = this.b;
        c5d0Var.getClass();
        c5d0Var.a.invoke(new PostingAction.ShowMessage(new PostingUserMessage.AlertDialog(new PostingUserMessageText.ResText(R.string.uploading_delete_attachment_title), new PostingUserMessageText.ResText(R.string.uploading_delete_attachment_text), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.uploading_delete_attachment_accept_button), new PostingAction.MediaPicker.Selection.RemoveAttachFromSelected(attachment), null, false, 12, null), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.uploading_delete_attachment_cancel_button), null, null, false, 14, null), null, 16, null), null, 0, 0, 0, 0, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null));
    }

    @Override // xsna.x64
    public final void f(Attachment attachment) {
        if (attachment == null) {
            return;
        }
        c5d0 c5d0Var = this.b;
        c5d0Var.getClass();
        c5d0Var.a.invoke(new PostingAction.ShowMessage(new PostingUserMessage.AlertDialog(new PostingUserMessageText.ResText(R.string.uploading_retry_attachment_title), null, new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.uploading_retry_attachment_accept_button), new PostingAction.Upload.UploadRetryAttachment(attachment), null, false, 12, null), null, new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.uploading_retry_attachment_cancel_button), new PostingAction.MediaPicker.Selection.RemoveAttachFromSelected(attachment), null, false, 12, null), 10, null), null, 0, 0, 0, 0, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null));
    }

    @Override // xsna.x64
    public final void d(int i, int i2) {
    }
}
