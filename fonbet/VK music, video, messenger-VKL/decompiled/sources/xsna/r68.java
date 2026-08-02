package xsna;

import com.vk.dto.common.Attachment;
import java.util.Iterator;
import java.util.List;

/* compiled from: BottomPanelPostingAttachmentPresenter.kt */
/* loaded from: classes4.dex */
public final class r68 implements c84 {
    public final /* synthetic */ com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b a;

    public r68(com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.c84
    public final void a(Attachment attachment) {
        com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b.a(this.a, attachment, false);
    }

    @Override // xsna.c84
    public final void b(List<? extends Attachment> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b.a(this.a, (Attachment) it.next(), true);
        }
    }
}
