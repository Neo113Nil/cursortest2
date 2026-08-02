package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.domain.y;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class nrj0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final y2r0 i;

    public /* synthetic */ nrj0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, y2r0 y2r0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = v7pVar;
        this.e = v7pVar2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = xvf0Var5;
        this.i = y2r0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.i;
        xvf0 xvf0Var = this.h;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.f;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new mrj0((k) xvf0Var6.get(), (h) xvf0Var5.get(), i5m.a(xvf0Var4), (eky) this.e.get(), (ru.yandex.taxi.am.h) xvf0Var3.get(), i5m.a(xvf0Var2), (m) xvf0Var.get(), i5m.a(y2r0Var));
            default:
                return new y((Lifecycle) xvf0Var6.get(), (tse) xvf0Var5.get(), (oep0) xvf0Var4.get(), this.e, i5m.a(xvf0Var3), (pqm0) xvf0Var2.get(), i5m.a(xvf0Var), i5m.a(y2r0Var));
        }
    }
}
