package xsna;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ClusterMapper.kt */
/* loaded from: classes3.dex */
public final class xwf implements jwf<Object> {
    public final edr0 a;
    public final ArrayList b;
    public final int c;

    public xwf(kwf<jbr0<Object>> kwfVar) {
        LatLng position = kwfVar.getPosition();
        this.a = new edr0(position.b, position.c);
        Collection<jbr0<Object>> items = kwfVar.getItems();
        ArrayList arrayList = new ArrayList(c5g.u(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((jbr0) it.next()).a);
        }
        this.b = arrayList;
        this.c = kwfVar.getSize();
    }

    @Override // xsna.jwf
    public final Collection<Object> getItems() {
        return this.b;
    }

    @Override // xsna.jwf
    public final edr0 getPosition() {
        return this.a;
    }

    @Override // xsna.jwf
    public final int getSize() {
        return this.c;
    }
}
