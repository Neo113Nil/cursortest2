package xsna;

import android.view.View;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import xsna.hf6;

/* compiled from: StoryGeoPickAdapter.kt */
/* loaded from: classes6.dex */
public final class n3m0 extends gf6<zif0> {
    public final t3m0 e;
    public x3m0 f;

    public n3m0(ListDataSet listDataSet, t3m0 t3m0Var) {
        super((hg6) listDataSet, false);
        this.e = t3m0Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        t3m0 t3m0Var = this.e;
        if (i == R.layout.item_story_geo_place) {
            return new u3m0(view, t3m0Var);
        }
        if (i == R.layout.item_geo_search) {
            x3m0 x3m0Var = new x3m0(view, t3m0Var);
            this.f = x3m0Var;
            return x3m0Var;
        }
        if (i == R.layout.item_story_geo_location_restrictions) {
            return new l3m0(view, t3m0Var);
        }
        if (i == R.layout.item_geo_sticker_empty) {
            return new hf6.a(view);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType in StoryArchiveAdapter = "));
    }
}
