package xsna;

import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.xt0;

/* compiled from: AdsClicksTrackerImpl.kt */
/* loaded from: classes14.dex */
public final class qv0 implements pv0 {
    public final xt0 a;

    /* compiled from: AdsClicksTrackerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdClickContext.values().length];
            try {
                iArr[AdClickContext.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdClickContext.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdClickContext.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdClickContext.CTA_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdClickContext.BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdClickContext.FOOTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdClickContext.IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdClickContext.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdClickContext.DESCRIPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qv0(xt0 xt0Var) {
        this.a = xt0Var;
    }

    @Override // xsna.pv0
    public final void a(AdClickContext adClickContext, NewsEntry newsEntry, int i) {
        AdsintEventTypeDto adsintEventTypeDto;
        String str;
        String Eb;
        switch (a.$EnumSwitchMapping$0[adClickContext.ordinal()]) {
            case 1:
            case 2:
            case 3:
                adsintEventTypeDto = AdsintEventTypeDto.CLICK_HEADER;
                break;
            case 4:
            case 5:
                adsintEventTypeDto = AdsintEventTypeDto.CLICK_BUTTON;
                break;
            case 6:
                adsintEventTypeDto = AdsintEventTypeDto.CLICK_FOOTER;
                break;
            case 7:
                adsintEventTypeDto = AdsintEventTypeDto.CLICK_IMAGE;
                break;
            case 8:
            case 9:
                adsintEventTypeDto = AdsintEventTypeDto.CLICK_TEXT;
                break;
            default:
                return;
        }
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
                return;
            }
            Html5Entry html5Entry = (Html5Entry) newsEntry;
            str = html5Entry.x;
            Eb = html5Entry.Eb();
        }
        this.a.d(new xt0.a(adsintEventTypeDto, str, Eb, i < 0 ? xt0.c.b.a : new xt0.c.a(i)));
    }
}
