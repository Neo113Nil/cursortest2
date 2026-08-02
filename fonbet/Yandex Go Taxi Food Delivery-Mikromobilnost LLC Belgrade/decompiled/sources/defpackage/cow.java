package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.LinkedHashMap;
import java.util.Locale;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes9.dex */
public final class cow implements a {
    public final lx4 a;
    public final dyx b;

    public cow(lx4 lx4Var, dyx dyxVar) {
        this.a = lx4Var;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        String str2;
        if (event == LayersAnalyticEventEmmiter.Event.AVAILABLE) {
            return;
        }
        MapObjectComponentType mapObjectComponentType2 = MapObjectComponentType.BUBBLE;
        if (mapObjectComponentType == mapObjectComponentType2 && event == LayersAnalyticEventEmmiter.Event.SHOWN) {
            str2 = "Map.IntercityDestinationBubble.Shown";
        } else if (mapObjectComponentType == mapObjectComponentType2 && event == LayersAnalyticEventEmmiter.Event.TAP) {
            str2 = "Map.IntercityDestinationBubble.Tapped";
        } else {
            MapObjectComponentType mapObjectComponentType3 = MapObjectComponentType.BODY;
            if (mapObjectComponentType != mapObjectComponentType3 || event != LayersAnalyticEventEmmiter.Event.SHOWN) {
                if (mapObjectComponentType != mapObjectComponentType3 || event != LayersAnalyticEventEmmiter.Event.TAP) {
                    MapObjectComponentType mapObjectComponentType4 = MapObjectComponentType.OVERLAY;
                    if (mapObjectComponentType != mapObjectComponentType4 || event != LayersAnalyticEventEmmiter.Event.SHOWN) {
                        if (mapObjectComponentType != mapObjectComponentType4 || event != LayersAnalyticEventEmmiter.Event.TAP) {
                            return;
                        }
                    }
                }
                str2 = "Map.IntercityCluster.Tapped";
            }
            str2 = "Map.IntercityCluster.Shown";
        }
        i d = ((j) this.a).d(str2);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("id", str);
        dyx dyxVar = this.b;
        String name = dyxVar.a().a.name();
        Locale locale = Locale.ROOT;
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, name.toLowerCase(locale));
        linkedHashMap.put("mode", dyxVar.a().b.a.name().toLowerCase(locale));
        d.m();
    }
}
