package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PreviewPostMediaStep2Content.kt */
/* loaded from: classes4.dex */
public final class b5d0 implements ihk {
    public final /* synthetic */ c5d0 b;

    public b5d0(c5d0 c5d0Var) {
        this.b = c5d0Var;
    }

    @Override // xsna.ihk
    public final void a(PhotoAttachment photoAttachment) {
        this.b.a.invoke(PostingAction.ShowModalBackToStep1.b);
    }
}
