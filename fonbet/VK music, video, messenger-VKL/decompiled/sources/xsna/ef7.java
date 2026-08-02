package xsna;

import com.ironsource.Ad;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;

/* compiled from: BlockHeaderHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class ef7 implements gn60<NewsEntry, wm60> {
    public final b25 b;

    public ef7(b25 b25Var) {
        this.b = b25Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (xsna.epx.f(r10 != null ? r10.b : null, "button") != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    @Override // xsna.gn60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x(NewsEntry newsEntry, wm60 wm60Var) {
        String str;
        Integer valueOf;
        Integer num;
        VkGroupHeader.c cVar;
        String str2;
        iux0 iux0Var = newsEntry instanceof iux0 ? (iux0) newsEntry : null;
        String title = iux0Var != null ? iux0Var.getTitle() : null;
        if (title == null || title.length() == 0) {
            str = newsEntry instanceof RecommendedMiniAppEntry ? ((RecommendedMiniAppEntry) newsEntry).j : "";
        } else {
            str = title;
        }
        if (title == null || title.length() == 0) {
            if (newsEntry instanceof UxPollsEntry) {
                valueOf = Integer.valueOf(o25.b(this.b) ? R.string.ux_polls_sferum_title : R.string.ux_polls_title);
            } else if (newsEntry instanceof ChannelsRecommendations) {
                valueOf = Integer.valueOf(R.string.channels_block_default_title);
            }
            num = valueOf;
            if ((newsEntry instanceof RecommendedMiniAppEntry) && (str2 = ((RecommendedMiniAppEntry) newsEntry).l) != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    cVar = new VkGroupHeader.c(str2, null, null, 14);
                    boolean z = false;
                    if (newsEntry instanceof Digest) {
                        Digest digest = (Digest) newsEntry;
                        if (!epx.f(digest.i, Ad.d)) {
                            Digest.Footer footer = digest.l;
                        }
                        z = true;
                    }
                    return Collections.singletonList(new ff7(str, num, newsEntry, z, cVar));
                }
            }
            cVar = null;
            boolean z2 = false;
            if (newsEntry instanceof Digest) {
            }
            return Collections.singletonList(new ff7(str, num, newsEntry, z2, cVar));
        }
        num = null;
        if (newsEntry instanceof RecommendedMiniAppEntry) {
            if (str2.length() <= 0) {
            }
            if (str2 != null) {
            }
        }
        cVar = null;
        boolean z22 = false;
        if (newsEntry instanceof Digest) {
        }
        return Collections.singletonList(new ff7(str, num, newsEntry, z22, cVar));
    }
}
