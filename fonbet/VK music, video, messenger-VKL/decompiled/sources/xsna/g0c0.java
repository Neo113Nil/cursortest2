package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$RecalculateRatio;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;

/* compiled from: PostAttachmentsView.kt */
/* loaded from: classes4.dex */
public final class g0c0 implements x64 {
    public final /* synthetic */ h0c0 b;

    public g0c0(h0c0 h0c0Var) {
        this.b = h0c0Var;
    }

    @Override // xsna.x64
    public final void a(Attachment attachment) {
        if ((attachment instanceof SnippetAttachment) || (attachment instanceof ArticleAttachment) || attachment == null) {
            return;
        }
        h0c0.a(this.b, attachment);
    }

    @Override // xsna.x64
    public final void c(Attachment attachment) {
        if (attachment == null) {
            return;
        }
        this.b.b.invoke(new PostingAction.MediaPicker.Selection.RemoveAttachFromSelected(attachment));
    }

    @Override // xsna.x64
    public final void d(int i, int i2) {
        hb40 hb40Var = this.b.b;
        hb40Var.invoke(new PostingAction.Editing.MovePhotoVideo(i, i2));
        hb40Var.invoke(PostingAction$Editing$CropPhoto$RecalculateRatio.b);
    }

    @Override // xsna.x64
    public final void f(Attachment attachment) {
        pcc0 pcc0Var;
        a4d0 a4d0Var;
        Object obj;
        if (attachment == null || (pcc0Var = this.b.g) == null || (a4d0Var = pcc0Var.n.g) == null) {
            return;
        }
        pbq pbqVar = a4d0Var.G;
        Iterator it = pbqVar.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((ce6) obj).c, attachment)) {
                    break;
                }
            }
        }
        ce6 ce6Var = (ce6) obj;
        if (ce6Var == null) {
            return;
        }
        if (attachment instanceof VideoAttachment) {
            pbqVar.p.remove(((VideoAttachment) attachment).getId().intValue());
        }
        ce6Var.c = attachment;
        ce6Var.m(attachment);
    }
}
