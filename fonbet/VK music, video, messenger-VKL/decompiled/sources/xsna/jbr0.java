package xsna;

import com.google.android.gms.maps.model.LatLng;
import xsna.twf;

/* compiled from: VKClusterItem.kt */
/* loaded from: classes3.dex */
public final class jbr0<T extends twf> extends aq70<T> implements uwf, twf {
    public final T a;

    public jbr0(T t) {
        this.a = t;
    }

    @Override // xsna.twf
    public final String a() {
        return this.a.a();
    }

    @Override // xsna.twf
    public final String b() {
        return this.a.b();
    }

    @Override // xsna.twf
    public final edr0 c() {
        return this.a.c();
    }

    @Override // xsna.uwf
    public final String d() {
        return this.a.a();
    }

    @Override // xsna.aq70
    public final twf e() {
        return this.a;
    }

    @Override // xsna.uwf
    public final LatLng getPosition() {
        return edi.B(this.a.c());
    }

    @Override // xsna.uwf
    public final String getTitle() {
        return this.a.b();
    }
}
