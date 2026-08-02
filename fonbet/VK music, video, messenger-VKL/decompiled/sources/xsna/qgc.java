package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: ClassifiedsGeoAdapter.kt */
/* loaded from: classes18.dex */
public final class qgc extends gf6<zif0> {
    public final rgc e;

    public qgc(rgc rgcVar) {
        super((com.vk.lists.a) null, 3);
        this.e = rgcVar;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.classifieds_geo_suggestion_item) {
            return new xgc(view, this.e);
        }
        if (i == R.layout.classifieds_geo_location_item) {
            return new tgc(view);
        }
        throw new IllegalArgumentException(lhg.a(i, "Unexpected view type: "));
    }
}
