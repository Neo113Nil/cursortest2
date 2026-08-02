package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: CheckoutContent.kt */
/* loaded from: classes18.dex */
public final class l5c {
    public final wh50 a;
    public final wh50 b;

    public l5c(v8s v8sVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ArrayList arrayList = v8sVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k7r k7rVar = (k7r) arrayList.get(i);
            if (k7rVar instanceof x1x) {
                List<u1x> list = ((x1x) k7rVar).d;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    mapBuilder.put(list.get(i2).b, new rwr());
                }
            } else if (k7rVar instanceof u1x) {
                mapBuilder.put(((u1x) k7rVar).b, new rwr());
            }
        }
        this.a = androidx.compose.runtime.k.b(mapBuilder.h());
        this.b = androidx.compose.runtime.k.b(null);
    }

    public final void a(v8s v8sVar) {
        wh50 wh50Var;
        MapBuilder mapBuilder = new MapBuilder();
        ArrayList arrayList = v8sVar.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            wh50Var = this.a;
            if (i >= size) {
                break;
            }
            k7r k7rVar = (k7r) arrayList.get(i);
            if (k7rVar instanceof x1x) {
                List<u1x> list = ((x1x) k7rVar).d;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    u1x u1xVar = list.get(i2);
                    Map map = (Map) ((zak0) wh50Var).getValue();
                    FieldKey fieldKey = u1xVar.b;
                    rwr rwrVar = (rwr) map.get(fieldKey);
                    if (rwrVar == null || ((rwr) mapBuilder.put(fieldKey, rwrVar)) == null) {
                        mapBuilder.put(fieldKey, new rwr());
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            } else if (k7rVar instanceof u1x) {
                Map map2 = (Map) ((zak0) wh50Var).getValue();
                FieldKey fieldKey2 = ((u1x) k7rVar).b;
                rwr rwrVar2 = (rwr) map2.get(fieldKey2);
                if (rwrVar2 == null || ((rwr) mapBuilder.put(fieldKey2, rwrVar2)) == null) {
                    mapBuilder.put(fieldKey2, new rwr());
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
            i++;
        }
        ((zak0) wh50Var).setValue(mapBuilder.h());
        Map map3 = (Map) ((zak0) wh50Var).getValue();
        zak0 zak0Var = (zak0) this.b;
        if (map3.containsKey((FieldKey) zak0Var.getValue())) {
            return;
        }
        zak0Var.setValue(null);
    }
}
