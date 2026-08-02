package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.LatestNewsItem;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: LatestNewsEntryPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class jmy extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        Image image;
        ImageSize Cb;
        NewsEntry newsEntry = u1c0Var.a;
        LatestNewsItem latestNewsItem = newsEntry instanceof LatestNewsItem ? (LatestNewsItem) newsEntry : null;
        if (latestNewsItem == null || (image = latestNewsItem.i) == null || (Cb = image.Cb(iah0.a(64.0f), true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }
}
