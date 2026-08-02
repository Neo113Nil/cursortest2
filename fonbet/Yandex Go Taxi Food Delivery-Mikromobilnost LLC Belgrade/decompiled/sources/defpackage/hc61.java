package defpackage;

import android.content.Context;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.location.zerokm.datasource.a;
import ru.yandex.taxi.persuggest.repository.e;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes9.dex */
public final class hc61 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ hc61(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a((qie) xvf0Var4.get(), (Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (dxt0) xvf0Var.get());
            default:
                return new e((m) xvf0Var4.get(), (c) xvf0Var3.get(), (tse) xvf0Var2.get(), (com.yandex.go.address.search.perf.c) xvf0Var.get());
        }
    }
}
