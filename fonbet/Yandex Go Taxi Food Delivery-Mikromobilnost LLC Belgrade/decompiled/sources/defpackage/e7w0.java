package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.Address;
import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.ToponymObjectMetadata;
import com.yandex.runtime.Error;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class e7w0 implements Session.SearchListener {
    public final /* synthetic */ d a;
    public final /* synthetic */ Point b;
    public final /* synthetic */ Double c;
    public final /* synthetic */ j18 d;

    public e7w0(d dVar, Point point, Double d, j18 j18Var) {
        this.a = dVar;
        this.b = point;
        this.c = d;
        this.d = j18Var;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchError(Error error) {
        this.d.resumeWith(null);
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchResponse(Response response) {
        BoundingBox boundingBox;
        Double d;
        Object obj;
        BoundingBox boundingBox2;
        Address.Component component;
        List<Address.Component.Kind> kinds;
        d dVar = this.a;
        dVar.getClass();
        List<GeoObjectCollection.Item> children = response.getCollection().getChildren();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            GeoObject obj2 = ((GeoObjectCollection.Item) it.next()).getObj();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boundingBox = null;
            r5 = null;
            r5 = null;
            r5 = null;
            d7w0 d7w0Var = null;
            if (!it2.hasNext()) {
                break;
            }
            GeoObject geoObject = (GeoObject) it2.next();
            ToponymObjectMetadata toponymObjectMetadata = (ToponymObjectMetadata) geoObject.getMetadataContainer().getItem(ToponymObjectMetadata.class);
            if (toponymObjectMetadata != null && (boundingBox2 = geoObject.getBoundingBox()) != null && (component = (Address.Component) a.b0(toponymObjectMetadata.getAddress().getComponents())) != null && (kinds = component.getKinds()) != null) {
                d7w0Var = new d7w0(boundingBox2, kinds);
            }
            if (d7w0Var != null) {
                arrayList2.add(d7w0Var);
            }
        }
        Iterator it3 = d.e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Address.Component.Kind kind = (Address.Component.Kind) it3.next();
            Iterator it4 = arrayList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                d7w0 d7w0Var2 = (d7w0) obj;
                if (d7w0Var2.b.contains(kind) && d.b(d7w0Var2.a, this.b)) {
                    break;
                }
            }
            d7w0 d7w0Var3 = (d7w0) obj;
            if (d7w0Var3 != null) {
                boundingBox = d7w0Var3.a;
                break;
            }
        }
        dVar.d.getClass();
        if (boundingBox != null && (d = this.c) != null && d.doubleValue() > 0.0d) {
            double latitude = boundingBox.getSouthWest().getLatitude();
            double longitude = boundingBox.getSouthWest().getLongitude();
            double latitude2 = boundingBox.getNorthEast().getLatitude();
            double d2 = latitude2 - latitude;
            double longitude2 = boundingBox.getNorthEast().getLongitude() - longitude;
            if (longitude2 < 0.0d) {
                longitude2 += 360.0d;
            }
            if (d2 > 0.0d && longitude2 > 0.0d) {
                double d3 = (latitude + latitude2) / 2.0d;
                double a = dtv0.a((longitude2 / 2.0d) + longitude);
                double doubleValue = (d.doubleValue() * d2) / 2.0d;
                double doubleValue2 = (d.doubleValue() * longitude2) / 2.0d;
                boundingBox = new BoundingBox(new Point(Math.max(d3 - doubleValue, -90.0d), dtv0.a(a - doubleValue2)), new Point(Math.min(d3 + doubleValue, 90.0d), dtv0.a(a + doubleValue2)));
            }
        }
        this.d.resumeWith(boundingBox);
    }
}
