package defpackage;

import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.summary.promotions.interactor.a;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes14.dex */
public final class gx8 implements v7p {
    public final /* synthetic */ int a;
    public final w0g b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public gx8(y0g y0gVar, w0g w0gVar, u0g u0gVar, v0g v0gVar, x0g x0gVar, a1g a1gVar) {
        this.a = 2;
        this.c = y0gVar;
        this.b = w0gVar;
        this.d = u0gVar;
        this.e = v0gVar;
        this.f = x0gVar;
        this.g = a1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        w0g w0gVar = this.b;
        xvf0 xvf0Var5 = this.c;
        switch (i) {
            case 0:
                return new v920((wiq0) w0gVar.get(), (f580) xvf0Var5.get(), (bxi0) xvf0Var4.get(), (h0) xvf0Var3.get(), (x) xvf0Var2.get(), (iev0) xvf0Var.get());
            case 1:
                return new igj((wiq0) w0gVar.get(), (p) xvf0Var5.get(), (a) xvf0Var4.get(), (com.yandex.go.summary.mapper.a) xvf0Var3.get(), (viv0) xvf0Var2.get(), (vfx0) xvf0Var.get());
            default:
                return new nkx0((ck31) xvf0Var5.get(), (wiq0) w0gVar.get(), (b8r) xvf0Var4.get(), (fva0) xvf0Var3.get(), (vex0) xvf0Var2.get(), (c4r0) xvf0Var.get());
        }
    }

    public /* synthetic */ gx8(w0g w0gVar, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = w0gVar;
        this.c = v7pVar;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
    }
}
