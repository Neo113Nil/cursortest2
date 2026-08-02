package defpackage;

import com.yandex.go.scooters.debt.data.a;
import com.yandex.go.scooters.debt.domain.c;
import com.yandex.go.scooters.payments.domain.b;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class adn0 implements v7p {
    public final /* synthetic */ int a;
    public final e7g b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ adn0(e7g e7gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = e7gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        e7g e7gVar = this.b;
        switch (i) {
            case 0:
                return new c((tt2) e7gVar.get(), (r) xvf0Var5.get(), (b) xvf0Var4.get(), (a) xvf0Var3.get(), (h) xvf0Var2.get(), (hdn0) xvf0Var.get());
            case 1:
                return new com.yandex.go.scooters.offer_on_camera.domain.a((tt2) e7gVar.get(), (qoo0) xvf0Var5.get(), (uoo0) xvf0Var4.get(), (w2o0) xvf0Var3.get(), (p4o0) xvf0Var2.get(), (mxm0) xvf0Var.get());
            default:
                return new com.yandex.go.scooters.qr.preview.domain.a((tt2) e7gVar.get(), (com.yandex.go.scooters.qr.preview.data.mapper.a) xvf0Var5.get(), (qoo0) xvf0Var4.get(), (com.yandex.go.scooters.qr.domain.c) xvf0Var3.get(), (usn0) xvf0Var2.get(), (q) xvf0Var.get());
        }
    }
}
