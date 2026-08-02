package xsna;

import android.app.Application;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.geo.impl.model.BoundingBox;
import xsna.tkt;

/* compiled from: GeoFeatureDeps.kt */
/* loaded from: classes2.dex */
public final class okt {
    public static final BoundingBox j = new BoundingBox(0, 0, 0, 0);
    public final Application a;
    public final GeoComponentImpl b;
    public final GeoFragmentOptions c;
    public final ont d;
    public final tkt.a e;
    public final BoundingBox f;
    public final bpn0 g = new bpn0(new xis(this, 2));
    public final bpn0 h = new bpn0(new cwg(this, 24));
    public final bpn0 i = new bpn0(new z3i(this, 16));

    public okt(Application application, GeoComponentImpl geoComponentImpl, GeoFragmentOptions geoFragmentOptions, ont ontVar, tkt.a aVar, BoundingBox boundingBox) {
        this.a = application;
        this.b = geoComponentImpl;
        this.c = geoFragmentOptions;
        this.d = ontVar;
        this.e = aVar;
        this.f = boundingBox;
    }
}
