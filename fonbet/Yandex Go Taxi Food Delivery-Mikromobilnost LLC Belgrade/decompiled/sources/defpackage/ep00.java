package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.analytics.SourceScreenAnalytics$TappedObject;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes6.dex */
public final class ep00 implements MapObjectTapListener {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public ep00(fp00 fp00Var, String str) {
        this.b = fp00Var;
        this.c = str;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        n6l0 n6l0Var;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fp00 fp00Var = (fp00) obj;
                IdentityHashMap identityHashMap = (IdentityHashMap) fp00Var.b.b.get(ReferenceType.MAP_OBJECT);
                String str = identityHashMap != null ? (String) identityHashMap.get(mapObject) : null;
                if (str != null) {
                    Map i2 = b.i(new Pair("type", "object_tap"), new Pair("collectionId", (String) obj2), new Pair("id", str), new Pair(IssuingDistributionPointExtension.POINT, b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())))));
                    yeo yeoVar = fp00Var.y.a;
                    if (yeoVar != null) {
                        yeoVar.success(i2);
                        break;
                    }
                }
                break;
            default:
                p190 p190Var = (p190) obj2;
                ylm ylmVar = p190Var.n;
                if (ylmVar != null && !ylmVar.a && (n6l0Var = p190Var.d) != null) {
                    n6l0Var.me(ylmVar, (SourceScreenAnalytics$TappedObject) obj);
                    break;
                }
                break;
        }
        return true;
    }

    public ep00(p190 p190Var, SourceScreenAnalytics$TappedObject sourceScreenAnalytics$TappedObject) {
        this.c = p190Var;
        this.b = sourceScreenAnalytics$TappedObject;
    }
}
