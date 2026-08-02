package xsna;

import android.os.Bundle;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.geo.impl.presentation.GeoFragment;
import xsna.hyk0;
import xsna.tkt;

/* compiled from: InternalGeoFragmentFactory.kt */
/* loaded from: classes2.dex */
public final class wgx implements tkt {
    @Override // xsna.tkt
    public final tkt.b a(com.vk.search.communities.map.impl.ui.map.d dVar, hyk0.a aVar, gl00 gl00Var, yl00 yl00Var, pb00 pb00Var) {
        GeoFragmentOptions geoFragmentOptions = new GeoFragmentOptions();
        pb00Var.invoke(geoFragmentOptions);
        GeoFragment geoFragment = new GeoFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("geo_fragment:remove_feed", true);
        bundle.putParcelable("geo_fragment:options", geoFragmentOptions);
        geoFragment.setArguments(bundle);
        geoFragment.X = dVar;
        geoFragment.Y = aVar;
        geoFragment.a0.setValue(geoFragment, GeoFragment.c0[0], gl00Var);
        geoFragment.b0 = yl00Var;
        return geoFragment;
    }
}
