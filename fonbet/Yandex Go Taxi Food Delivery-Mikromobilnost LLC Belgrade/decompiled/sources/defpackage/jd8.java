package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenDetailsCopyField;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultProductId;
import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class jd8 {
    public final AppAnalyticsReporter a;

    public jd8(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    public static CardMainScreenEvents$CardMainScreenFreezeResultProductId c(bq51 bq51Var) {
        CardCarouselProductType cardCarouselProductType = bq51Var.p;
        int i = cardCarouselProductType == null ? -1 : id8.b[cardCarouselProductType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return CardMainScreenEvents$CardMainScreenFreezeResultProductId.WALLET;
            }
            if (i == 2) {
                return CardMainScreenEvents$CardMainScreenFreezeResultProductId.PRO;
            }
            if (i == 3) {
                return CardMainScreenEvents$CardMainScreenFreezeResultProductId.CREDLIM;
            }
            if (i == 4) {
                return CardMainScreenEvents$CardMainScreenFreezeResultProductId.SPLIT;
            }
            if (i != 5) {
                w511.b();
                return null;
            }
        }
        return CardMainScreenEvents$CardMainScreenFreezeResultProductId.UNKNOWN;
    }

    public static CardMainScreenEvents$CardMainScreenUnfreezeResultProductId d(bq51 bq51Var) {
        CardCarouselProductType cardCarouselProductType = bq51Var.p;
        int i = cardCarouselProductType == null ? -1 : id8.b[cardCarouselProductType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.WALLET;
            }
            if (i == 2) {
                return CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.PRO;
            }
            if (i == 3) {
                return CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.CREDLIM;
            }
            if (i == 4) {
                return CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.SPLIT;
            }
            if (i != 5) {
                w511.b();
                return null;
            }
        }
        return CardMainScreenEvents$CardMainScreenUnfreezeResultProductId.UNKNOWN;
    }

    public final void a(boolean z) {
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        if (z) {
            appAnalyticsReporter.l.a.a("card.main_screen.details.show", null);
        } else if (z) {
            w511.b();
        } else {
            appAnalyticsReporter.l.a.a("card.main_screen.details.hide", null);
        }
    }

    public final void b(CardMainScreenEvents$CardMainScreenDetailsCopyField cardMainScreenEvents$CardMainScreenDetailsCopyField) {
        qq7 qq7Var = this.a.l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("field", cardMainScreenEvents$CardMainScreenDetailsCopyField.getOriginalValue());
        qq7Var.a.a("card.main_screen.details.copy", linkedHashMap);
    }
}
