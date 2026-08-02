package defpackage;

import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.superapp.payment.b;

/* loaded from: classes8.dex */
public final class ngo0 {
    public final b a;
    public dy90 b;

    public ngo0(b bVar) {
        this.a = bVar;
    }

    public final synchronized by90 a() {
        dy90 dy90Var;
        dy90Var = this.b;
        if (dy90Var == null) {
            b bVar = this.a;
            u32.a.getClass();
            dy90Var = bVar.a("scooters", t32.b, new l90(), uba0.g);
            this.b = dy90Var;
        }
        return dy90Var;
    }

    public final l0 b() {
        return ((dy90) a()).a.b();
    }
}
