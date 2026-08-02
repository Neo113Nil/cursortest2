package xsna;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import xsna.uwf;

/* compiled from: StaticCluster.java */
/* loaded from: classes13.dex */
public final class vxk0<T extends uwf> implements kwf<T> {
    public final LatLng a;
    public final ArrayList b = new ArrayList();

    public vxk0(LatLng latLng) {
        this.a = latLng;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vxk0)) {
            return false;
        }
        vxk0 vxk0Var = (vxk0) obj;
        return vxk0Var.a.equals(this.a) && vxk0Var.b.equals(this.b);
    }

    @Override // xsna.kwf
    public final Collection<T> getItems() {
        return this.b;
    }

    @Override // xsna.kwf
    public final LatLng getPosition() {
        return this.a;
    }

    @Override // xsna.kwf
    public final int getSize() {
        return this.b.size();
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    public final String toString() {
        return "StaticCluster{mCenter=" + this.a + ", mItems.size=" + this.b.size() + '}';
    }
}
