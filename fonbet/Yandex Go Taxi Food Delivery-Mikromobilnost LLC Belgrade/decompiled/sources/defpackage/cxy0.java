package defpackage;

import flex.theme.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class cxy0 extends ia {
    public final asq0 a = d6z.g("ThemedColorParser", new SerialDescriptor[0]);

    @Override // defpackage.ia
    public final Object b(Throwable th) {
        h5z0.a.d(g8e.o("An error has occurred at color parsing: ", th.getMessage()), new Object[0]);
        return a.a;
    }

    @Override // defpackage.ia
    public final Object c(sbx sbxVar, b bVar) {
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                return new his0(dVar.a());
            }
            yci0.m("Color value should be string literal");
            return null;
        }
        if (!(bVar instanceof c)) {
            yci0.v(bVar, "Unable to deserialize dynamic color: ");
            return null;
        }
        Map map = ((c) bVar).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            d dVar2 = (d) ((b) entry.getValue());
            if (!dVar2.b()) {
                yci0.m("Color value should be string literal");
                return null;
            }
            linkedHashMap.put(key, dVar2.a());
        }
        return new ex40(linkedHashMap);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
