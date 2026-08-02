package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class dqe0 {
    public volatile Preorder a = new Preorder(0);

    public final Address a() {
        return this.a.G.b();
    }

    public final List b() {
        return this.a.G.b;
    }

    public final Zone c() {
        ZoneAddress f = f();
        if (f != null) {
            return f.b;
        }
        return null;
    }

    public final TimeZone d() {
        Zone c = c();
        if (c != null) {
            return c.f;
        }
        return null;
    }

    public final Address e() {
        return this.a.G.h();
    }

    public final ZoneAddress f() {
        return this.a.G.a;
    }
}
