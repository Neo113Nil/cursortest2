package xsna;

import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;

/* compiled from: StoryGeoPlaceItem.kt */
/* loaded from: classes6.dex */
public final class v3m0 extends zif0 {
    public final GeoLocation a;
    public final String b;

    public v3m0(GeoLocation geoLocation) {
        String str = geoLocation.k;
        this.a = geoLocation;
        String str2 = geoLocation.n;
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            str = str2 + " · " + str;
        } else if (str2 != null && str2.length() != 0) {
            str = str2;
        } else if (str == null || str.length() == 0) {
            str = "";
        }
        this.b = str;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_story_geo_place;
    }
}
