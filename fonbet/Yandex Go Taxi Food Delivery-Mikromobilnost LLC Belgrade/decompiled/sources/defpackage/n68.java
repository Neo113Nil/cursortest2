package defpackage;

import com.yandex.go.navigator.map_interactions.parkings.h;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.Feature;
import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.search.WorkingHours;
import com.yandex.runtime.Error;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class n68 implements Session.SearchListener {
    public final /* synthetic */ h a;

    public n68(h hVar) {
        this.a = hVar;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchError(Error error) {
        h hVar = this.a;
        hVar.i.g(null);
        hVar.h = null;
    }

    @Override // com.yandex.mapkit.search.Session.SearchListener
    public final void onSearchResponse(Response response) {
        GeoObject obj;
        BusinessObjectMetadata b;
        Object obj2;
        Feature.VariantValue value;
        List<String> textValue;
        h hVar = this.a;
        n0 n0Var = hVar.i;
        GeoObjectCollection.Item item = (GeoObjectCollection.Item) a.R(response.getCollection().getChildren());
        if (item == null || (obj = item.getObj()) == null || (b = jcb1.b(obj)) == null) {
            n0Var.g(null);
            return;
        }
        Iterator<T> it = b.getFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (jl40.l(((Feature) obj2).getId(), "parking_price")) {
                    break;
                }
            }
        }
        Feature feature = (Feature) obj2;
        String X = (feature == null || (value = feature.getValue()) == null || (textValue = value.getTextValue()) == null) ? null : a.X(textValue, Extension.FIX_SPACE, null, null, null, 62);
        String shortName = b.getShortName();
        if (shortName == null) {
            shortName = b.getName();
        }
        WorkingHours workingHours = b.getWorkingHours();
        n0Var.g(new d68(shortName, workingHours != null ? workingHours.getText() : null, X));
        hVar.h = null;
    }
}
