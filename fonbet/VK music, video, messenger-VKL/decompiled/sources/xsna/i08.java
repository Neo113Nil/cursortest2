package xsna;

import android.content.Context;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.attachments.MarketAttachment;

/* compiled from: BookmarkProcessor.kt */
/* loaded from: classes4.dex */
public final class i08 {
    public static void a(Context context, Post post, String str, String str2) {
        if (!post.lc()) {
            hd60.a().w1(context, post, str2, str, post.L.b);
            return;
        }
        Attachment Ib = post.Ib();
        MarketAttachment marketAttachment = Ib instanceof MarketAttachment ? (MarketAttachment) Ib : null;
        if (marketAttachment == null) {
            return;
        }
        Good good = marketAttachment.f;
        gd60.X0(hd60.a(), context, ao8.s(good), new pqq(null, null, null, null, 15), new h08(0, marketAttachment, good), new sa(marketAttachment, 11), 32);
    }
}
