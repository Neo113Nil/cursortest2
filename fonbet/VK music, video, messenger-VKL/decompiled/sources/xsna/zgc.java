package xsna;

import com.vk.api.generated.market.dto.MarketGeoSuggestTypesDto;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClassifiedsGeoSuggestionMode.kt */
/* loaded from: classes18.dex */
public abstract class zgc {
    public final int a;
    public final List<MarketGeoSuggestTypesDto> b;
    public final boolean c;
    public final int d;
    public final int e;

    /* compiled from: ClassifiedsGeoSuggestionMode.kt */
    public static final class a extends zgc {
        public static final a f = new a(0, R.string.classifieds_geo_suggestion_default, 0, EmptyList.b, false);
    }

    /* compiled from: ClassifiedsGeoSuggestionMode.kt */
    public static final class b extends zgc {
        public static final b f = new b(1, R.string.classifieds_geo_suggestion_default_title, R.string.classifieds_geo_suggestion_default_description, e43.l(MarketGeoSuggestTypesDto.CITY, MarketGeoSuggestTypesDto.TOWN, MarketGeoSuggestTypesDto.HAMLET), true);
    }

    public zgc(int i, int i2, int i3, List list, boolean z) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }
}
