package xsna;

import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: CompactAttachmentPostDisplayItem.kt */
/* loaded from: classes4.dex */
public final class k5i extends r74 {
    public final CompactAttachmentStyle r;

    public k5i(NewsEntry newsEntry, NewsEntry newsEntry2, int i, Attachment attachment, CompactAttachmentStyle compactAttachmentStyle) {
        super(i, attachment, newsEntry, newsEntry2);
        this.r = compactAttachmentStyle;
    }
}
