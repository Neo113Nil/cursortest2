package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes6.dex */
public final class hvo0 implements q {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ q a;

    public hvo0(rqo rqoVar) {
        fvo0.Companion.getClass();
        this.a = ((jbh) rqoVar).d(fvo0.g);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (fvo0) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
