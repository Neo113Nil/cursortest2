package xsna;

import com.vk.api.generated.market.dto.MarketSuggestionDto;
import com.vkontakte.android.R;

/* compiled from: ClassifiedsGeoSuggestionItem.kt */
/* loaded from: classes18.dex */
public final class ygc extends zif0 {
    public final MarketSuggestionDto a;
    public final boolean b;
    public final String c;

    public ygc(MarketSuggestionDto marketSuggestionDto, boolean z, String str, int i) {
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? null : str;
        this.a = marketSuggestionDto;
        this.b = z;
        this.c = str;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.classifieds_geo_suggestion_item;
    }
}
