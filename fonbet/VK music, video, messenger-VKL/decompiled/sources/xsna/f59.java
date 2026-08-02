package xsna;

import android.content.Context;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import java.text.SimpleDateFormat;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f59 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f59(Context context, int i, i59 i59Var) {
        this.d = context;
        this.c = i;
        this.e = i59Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        String Eb;
        switch (this.b) {
            case 0:
                return new SimpleDateFormat(((Context) this.d).getString(this.c), ((i59) this.e).d);
            default:
                NewsEntry newsEntry = (NewsEntry) this.d;
                AdsintEventTypeDto adsintEventTypeDto = (AdsintEventTypeDto) this.e;
                if (newsEntry instanceof PromoPost) {
                    PromoPost promoPost = (PromoPost) newsEntry;
                    str = promoPost.l;
                    Eb = promoPost.Gb();
                } else if (newsEntry instanceof ShitAttachment) {
                    ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                    str = shitAttachment.v;
                    Eb = shitAttachment.Eb();
                } else {
                    if (!(newsEntry instanceof Html5Entry)) {
                        return null;
                    }
                    Html5Entry html5Entry = (Html5Entry) newsEntry;
                    str = html5Entry.x;
                    Eb = html5Entry.Eb();
                }
                int i = this.c;
                return new xt0.a(adsintEventTypeDto, str, Eb, i < 0 ? xt0.c.b.a : new xt0.c.a(i));
        }
    }

    public /* synthetic */ f59(NewsEntry newsEntry, AdsintEventTypeDto adsintEventTypeDto, int i) {
        this.d = newsEntry;
        this.e = adsintEventTypeDto;
        this.c = i;
    }
}
