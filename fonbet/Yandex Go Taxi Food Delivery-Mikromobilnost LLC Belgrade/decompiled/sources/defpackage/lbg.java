package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;

/* loaded from: classes3.dex */
public final class lbg implements xvf0 {
    public final /* synthetic */ int a;
    public final kcz0 b;

    public /* synthetic */ lbg(kcz0 kcz0Var, int i) {
        this.a = i;
        this.b = kcz0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        kcz0 kcz0Var = this.b;
        switch (i) {
            case 0:
                d dVar = (d) kcz0Var.b;
                q5z.h(dVar);
                return dVar;
            default:
                z501 z501Var = (z501) kcz0Var.a;
                q5z.h(z501Var);
                return z501Var;
        }
    }
}
