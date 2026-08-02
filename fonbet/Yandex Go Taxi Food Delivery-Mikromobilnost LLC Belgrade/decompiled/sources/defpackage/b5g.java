package defpackage;

import ru.yandex.taxi.parks.api.ParksApi;

/* loaded from: classes5.dex */
public final class b5g implements xvf0 {
    public final /* synthetic */ int a;
    public final we90 b;

    public /* synthetic */ b5g(we90 we90Var, int i) {
        this.a = i;
        this.b = we90Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        we90 we90Var = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = we90Var.c;
                q5z.h(tt2Var);
                return tt2Var;
            case 1:
                pho phoVar = we90Var.d;
                q5z.h(phoVar);
                return phoVar;
            case 2:
                bko bkoVar = we90Var.a;
                q5z.h(bkoVar);
                return bkoVar;
            default:
                ParksApi parksApi = we90Var.b;
                q5z.h(parksApi);
                return parksApi;
        }
    }
}
