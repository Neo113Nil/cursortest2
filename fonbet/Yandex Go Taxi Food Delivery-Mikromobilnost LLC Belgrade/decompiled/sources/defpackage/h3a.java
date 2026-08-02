package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.HashMap;
import java.util.Locale;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes.dex */
public final class h3a implements a {
    public final em9 a;
    public final dyx b;

    public h3a(em9 em9Var, dyx dyxVar) {
        this.a = em9Var;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        dyx dyxVar = this.b;
        String name = dyxVar.a().a.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        String lowerCase2 = dyxVar.a().b.a.name().toLowerCase(locale);
        if (event != LayersAnalyticEventEmmiter.Event.AVAILABLE && mapObjectComponentType == MapObjectComponentType.BODY && g3a.a[event.ordinal()] == 1) {
            em9 em9Var = this.a;
            em9Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("charger_id", str);
            hashMap.put("mode", lowerCase2);
            em9Var.a.a("Chargers.Map.Tapped", hashMap, 1, tse0.r(MetaDataField.SCREEN_FIELD, hashMap, lowerCase));
        }
    }
}
