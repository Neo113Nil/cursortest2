package xsna;

import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.feed.tool.view.newsfeed.digest.DigestLayout;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: DigestGridAdapter.kt */
/* loaded from: classes4.dex */
public final class cym extends DigestLayout.a<DigestItem> {
    public final jn4 c;

    public cym(jn4 jn4Var) {
        this.c = jn4Var;
    }

    @Override // com.vk.feed.tool.view.newsfeed.digest.DigestLayout.a
    public final int a(int i) {
        return b(i) == 0 ? 1 : 2;
    }

    @Override // com.vk.feed.tool.view.newsfeed.digest.DigestLayout.a
    public final int b(int i) {
        DigestItem digestItem = (DigestItem) this.b.get(i);
        if (digestItem.h) {
            return digestItem.d() instanceof VideoAttachment ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.feed.tool.view.newsfeed.digest.DigestLayout.a
    public final void c(DigestLayout.d<DigestItem> dVar, int i) {
        dVar.a(this.b.get(i));
    }

    @Override // com.vk.feed.tool.view.newsfeed.digest.DigestLayout.a
    public final mym d(DigestLayout digestLayout, int i) {
        mym xxmVar = i == 2 ? new xxm(digestLayout) : new mym(digestLayout);
        xxmVar.b.setOnClickListener(new bym(0, this, xxmVar));
        return xxmVar;
    }
}
