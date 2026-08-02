package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.feed.core.models.attachment.OnMediaAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: OnMediaPostDisplayItem.kt */
/* loaded from: classes4.dex */
public final class u880 extends u1c0 {
    public final OnMediaAttachmentStyle q;

    public u880(NewsEntry newsEntry, NewsEntry newsEntry2, int i, OnMediaAttachmentStyle onMediaAttachmentStyle) {
        super(newsEntry, newsEntry2, i);
        this.q = onMediaAttachmentStyle;
    }

    @Override // xsna.u1c0
    public final yg5 a() {
        VideoFileOld videoFileOld = pc4.q;
        return pc4.r;
    }
}
