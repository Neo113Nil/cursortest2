package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes9.dex */
public final class hbh implements q {
    public final /* synthetic */ v1b0 a;
    public final /* synthetic */ w96 b;

    public hbh(v1b0 v1b0Var, w96 w96Var) {
        this.a = v1b0Var;
        this.b = w96Var;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.h(this.b);
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.i(this.b, continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (w96) this.a.a(this.b);
    }
}
