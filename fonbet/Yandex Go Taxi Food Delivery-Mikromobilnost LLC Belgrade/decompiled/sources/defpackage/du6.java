package defpackage;

import ru.yandex.taxi.summary.requirements.list.recycler.i;

/* loaded from: classes6.dex */
public final class du6 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final w0g c;

    public /* synthetic */ du6(w0g w0gVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = w0gVar;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        w0g w0gVar = this.c;
        switch (i) {
            case 0:
                return new md6(5, (wiq0) w0gVar.get(), (au6) xvf0Var.get());
            case 1:
                return new z100(i5m.a(xvf0Var), (wiq0) w0gVar.get());
            case 2:
                return new hhs0(11, (mx70) xvf0Var.get(), (wiq0) w0gVar.get());
            default:
                return new a201(13, (wiq0) w0gVar.get(), (i) xvf0Var.get());
        }
    }

    public /* synthetic */ du6(xvf0 xvf0Var, w0g w0gVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = w0gVar;
    }
}
