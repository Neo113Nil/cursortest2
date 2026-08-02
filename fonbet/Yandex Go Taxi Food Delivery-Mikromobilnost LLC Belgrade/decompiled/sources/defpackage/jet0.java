package defpackage;

import com.yandex.go.communications.actionrouter.a;
import java.util.HashMap;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;
import ru.yandex.taxi.common_models.net.map_object.c0;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.common_models.net.map_object.e0;
import ru.yandex.taxi.common_models.net.map_object.o;
import ru.yandex.taxi.common_models.net.map_object.p0;
import ru.yandex.taxi.common_models.net.map_object.q0;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.common_models.net.map_object.v0;
import ru.yandex.taxi.layers.actionrouter.b;

/* loaded from: classes5.dex */
public final class jet0 {
    public final ysd0 a;
    public final HashMap b;

    public jet0(uli0 uli0Var, y8s0 y8s0Var, a aVar, p9s0 p9s0Var, b bVar, nh9 nh9Var, qy41 qy41Var, ru.yandex.taxi.address.base.a aVar2, AddressResolveRepository addressResolveRepository, ysd0 ysd0Var, sn0 sn0Var, f7r f7rVar) {
        this.a = ysd0Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(d0.class, uli0Var);
        hashMap.put(p0.class, y8s0Var);
        hashMap.put(q0.class, aVar);
        hashMap.put(r0.class, p9s0Var);
        hashMap.put(o.class, nh9Var);
        hashMap.put(c0.class, bVar);
        hashMap.put(v0.class, qy41Var);
        hashMap.put(e0.class, aVar2);
        hashMap.put(AdditionalRequestAction.class, sn0Var);
        hashMap.put(s.class, ((i7r) f7rVar).a(addressResolveRepository));
    }
}
