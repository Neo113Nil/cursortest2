package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.surge.interactor.e;

/* loaded from: classes14.dex */
public final class mww0 {
    public final e a;

    public mww0(e eVar) {
        this.a = eVar;
    }

    public final void a(lww0 lww0Var, oiv0 oiv0Var) {
        if (lww0Var instanceof jww0) {
            oiv0Var.p(((jww0) lww0Var).a);
            return;
        }
        if (!jl40.l(lww0Var, kww0.a)) {
            w511.b();
            return;
        }
        hww0 hww0Var = this.a.c;
        qme0 qme0Var = hww0Var.e;
        kgx kgxVar = hww0.f[2];
        Boolean bool = Boolean.TRUE;
        qme0Var.setValue(hww0Var, kgxVar, bool);
        r0 r0Var = hww0Var.a;
        r0Var.getClass();
        r0Var.m(null, bool);
        oiv0Var.e("widget");
    }
}
