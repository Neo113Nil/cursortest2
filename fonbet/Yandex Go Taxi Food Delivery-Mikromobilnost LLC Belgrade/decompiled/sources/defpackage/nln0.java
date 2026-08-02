package defpackage;

import android.content.Context;
import ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class nln0 implements v7p {
    public final /* synthetic */ int a;
    public final e7g b;
    public final xvf0 c;

    public nln0(j7g j7gVar, e7g e7gVar) {
        this.a = 2;
        this.c = j7gVar;
        this.b = e7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        e7g e7gVar = this.b;
        xvf0 xvf0Var = this.c;
        switch (i) {
            case 0:
                return new a((tt2) e7gVar.get(), (c) xvf0Var.get());
            case 1:
                return new vvo0((tt2) e7gVar.get(), (svo0) xvf0Var.get());
            default:
                return new t5p0((Context) xvf0Var.get(), (tt2) e7gVar.get());
        }
    }

    public /* synthetic */ nln0(e7g e7gVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = e7gVar;
        this.c = xvf0Var;
    }
}
