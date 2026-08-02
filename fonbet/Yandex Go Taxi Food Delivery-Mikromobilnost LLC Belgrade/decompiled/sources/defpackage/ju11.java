package defpackage;

import com.yandex.go.profile.domain.divkit.variables.f;

/* loaded from: classes8.dex */
public final class ju11 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final i5g c;

    public ju11(i5g i5gVar, u5g u5gVar) {
        this.c = i5gVar;
        this.b = u5gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i5g i5gVar = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new f(i5m.a(i5gVar), i5m.a(xvf0Var));
            default:
                return new yv11(i5m.a(xvf0Var), i5m.a(i5gVar));
        }
    }

    public ju11(u5g u5gVar, i5g i5gVar) {
        this.b = u5gVar;
        this.c = i5gVar;
    }
}
