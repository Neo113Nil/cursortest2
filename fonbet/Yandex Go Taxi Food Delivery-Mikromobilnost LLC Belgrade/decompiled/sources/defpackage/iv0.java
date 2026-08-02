package defpackage;

import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.m;
import com.yandex.go.summary.mapper.a;
import ru.yandex.taxi.hints.interactors.c;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes14.dex */
public final class iv0 implements v7p {
    public final /* synthetic */ int a;
    public final w0g b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ iv0(w0g w0gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = w0gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        w0g w0gVar = this.b;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        switch (i) {
            case 0:
                return new c((wiq0) w0gVar.get(), (mbi) xvf0Var4.get(), (tt2) xvf0Var3.get(), (jv0) xvf0Var2.get(), (jv0) xvf0Var.get());
            case 1:
                return new m((wiq0) w0gVar.get(), (o3i) xvf0Var4.get(), (viv0) xvf0Var3.get(), (vfx0) xvf0Var2.get(), (a) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.requirements.glued.interactor.c((wiq0) w0gVar.get(), (x) xvf0Var4.get(), (gvd) xvf0Var3.get(), (yfx0) xvf0Var2.get(), (vfx0) xvf0Var.get());
            case 3:
                return new ru.yandex.taxi.summary.promotions.analytics.c((smv0) xvf0Var4.get(), (SummaryStateTracker) xvf0Var3.get(), (wiq0) w0gVar.get(), (jas0) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new fcj0((rf5) xvf0Var4.get(), (z880) xvf0Var3.get(), (wiq0) w0gVar.get(), (com.yandex.go.route.interactor.c) xvf0Var2.get(), (c4r0) xvf0Var.get());
        }
    }

    public /* synthetic */ iv0(xvf0 xvf0Var, xvf0 xvf0Var2, w0g w0gVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = w0gVar;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
    }
}
