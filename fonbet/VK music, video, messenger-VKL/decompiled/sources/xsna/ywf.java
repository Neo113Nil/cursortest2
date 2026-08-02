package xsna;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ClusterMapper.kt */
/* loaded from: classes3.dex */
public final class ywf implements kwf<jbr0<Object>> {
    public final ArrayList a;
    public final /* synthetic */ jwf<Object> b;

    public ywf(jwf<Object> jwfVar) {
        this.b = jwfVar;
        Collection<Object> items = jwfVar.getItems();
        ArrayList arrayList = new ArrayList(c5g.u(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new jbr0((twf) it.next()));
        }
        this.a = arrayList;
    }

    @Override // xsna.kwf
    public final Collection<jbr0<Object>> getItems() {
        return this.a;
    }

    @Override // xsna.kwf
    public final LatLng getPosition() {
        return edi.B(this.b.getPosition());
    }

    @Override // xsna.kwf
    public final int getSize() {
        return this.b.getSize();
    }
}
