package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class bux0 {
    public final k a;
    public final h b;
    public final a c;

    public bux0(k kVar, h hVar, a aVar) {
        this.a = kVar;
        this.b = hVar;
        this.c = aVar;
    }

    public final Map a() {
        if (this.a.Ig() == null) {
            return b.f();
        }
        MapBuilder mapBuilder = new MapBuilder();
        String Hg = this.b.Hg();
        if (Hg != null && !evu0.J(Hg)) {
            mapBuilder.put("X-YaTaxi-UserId", Hg);
        }
        String c = this.c.c();
        if (c != null && !evu0.J(c)) {
            mapBuilder.put("X-YaTaxi-Authorization", "Bearer ".concat(c));
        }
        return mapBuilder.j();
    }
}
