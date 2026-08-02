package xsna;

import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.pg30;
import xsna.xt0;

/* compiled from: MrcEventsHandler.kt */
/* loaded from: classes14.dex */
public final class hg30 {
    public final xt0 a;
    public final lg30 b;

    public hg30(xt0 xt0Var, lg30 lg30Var) {
        this.a = xt0Var;
        this.b = lg30Var;
    }

    public final <T extends pg30> void a(T t) {
        if (t instanceof pg30.e) {
            this.b.d();
            return;
        }
        boolean z = t instanceof pg30.a;
        xt0 xt0Var = this.a;
        if (!z) {
            if (t instanceof pg30.d) {
                pg30.d dVar = (pg30.d) t;
                xt0Var.a(new xt0.b(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h));
                return;
            } else if (t instanceof pg30.c) {
                xt0Var.b(((pg30.c) t).a);
                return;
            } else {
                if (t instanceof pg30.b) {
                    xt0Var.c(((pg30.b) t).a);
                    return;
                }
                return;
            }
        }
        pg30.a aVar = (pg30.a) t;
        AdsintEventTypeDto adsintEventTypeDto = aVar.b;
        NewsEntry newsEntry = aVar.a;
        int i = aVar.c;
        boolean z2 = newsEntry instanceof PromoPost;
        xt0.c cVar = xt0.c.b.a;
        if (z2) {
            PromoPost promoPost = (PromoPost) newsEntry;
            String Gb = promoPost.Gb();
            String str = promoPost.l;
            if (i >= 0) {
                cVar = new xt0.c.a(i);
            }
            xt0Var.d(new xt0.a(adsintEventTypeDto, str, Gb, cVar));
            return;
        }
        if (newsEntry instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            String Eb = shitAttachment.Eb();
            String str2 = shitAttachment.v;
            if (i >= 0) {
                cVar = new xt0.c.a(i);
            }
            xt0Var.d(new xt0.a(adsintEventTypeDto, str2, Eb, cVar));
            return;
        }
        if (newsEntry instanceof Html5Entry) {
            Html5Entry html5Entry = (Html5Entry) newsEntry;
            String Eb2 = html5Entry.Eb();
            String str3 = html5Entry.x;
            if (i >= 0) {
                cVar = new xt0.c.a(i);
            }
            xt0Var.d(new xt0.a(adsintEventTypeDto, str3, Eb2, cVar));
        }
    }
}
