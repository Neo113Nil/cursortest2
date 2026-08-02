package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.b;

/* loaded from: classes14.dex */
public final class dxu {
    public final x1v a;
    public final b b;

    public dxu(x1v x1vVar, b bVar) {
        this.a = x1vVar;
        this.b = bVar;
    }

    public final dx01 a() {
        zzs B;
        Address b = this.b.c().b();
        return (b == null || (B = b.B()) == null) ? new dx01(0.0d, 0.0d) : new dx01(B.a, B.b);
    }

    public final dx01 b() {
        zzs B;
        Address h = this.b.c().h();
        return (h == null || (B = h.B()) == null) ? new dx01(0.0d, 0.0d) : new dx01(B.a, B.b);
    }
}
