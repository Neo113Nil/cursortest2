package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;

/* compiled from: AdPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class ih0 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.a;
        ShitAttachment shitAttachment = newsEntry instanceof ShitAttachment ? (ShitAttachment) newsEntry : null;
        ArrayList<ShitAttachment.Card> arrayList = shitAttachment != null ? shitAttachment.K : null;
        if (arrayList != null) {
            return arrayList.size() + 1;
        }
        return 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        Image image;
        ImageSize Cb;
        PhotoAttachment photoAttachment;
        Image image2;
        ImageSize Cb2;
        NewsEntry newsEntry = u1c0Var.a;
        if (i == 0) {
            ShitAttachment shitAttachment = newsEntry instanceof ShitAttachment ? (ShitAttachment) newsEntry : null;
            if (shitAttachment == null || (image2 = shitAttachment.G) == null || (Cb2 = image2.Cb(iah0.a(48), true, false)) == null) {
                return null;
            }
            return Cb2.d.d;
        }
        ShitAttachment shitAttachment2 = newsEntry instanceof ShitAttachment ? (ShitAttachment) newsEntry : null;
        ArrayList<ShitAttachment.Card> arrayList = shitAttachment2 != null ? shitAttachment2.K : null;
        if (arrayList != null) {
            ShitAttachment.Card card = (ShitAttachment.Card) j5g.b0(i, arrayList);
            if (card == null || (photoAttachment = card.l) == null) {
                return null;
            }
            return photoAttachment.Ib();
        }
        if (shitAttachment2 == null || (image = shitAttachment2.G) == null || (Cb = image.Cb(iah0.a(48), true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }
}
