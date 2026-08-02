package xsna;

import kotlin.Pair;
import kotlin.coroutines.c;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes11.dex */
public final class z2q0<T> extends z9h0<T> {
    public final ThreadLocal<Pair<kotlin.coroutines.d, Object>> f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z2q0(spj spjVar, kotlin.coroutines.d dVar) {
        super(spjVar, dVar.get(r0) == null ? dVar.plus(r0) : dVar);
        a3q0 a3q0Var = a3q0.b;
        this.f = new ThreadLocal<>();
        if (spjVar.getContext().get(c.a.b) instanceof ovj) {
            return;
        }
        Object b = mqo0.b(dVar, null);
        mqo0.a(dVar, b);
        A0(dVar, b);
    }

    public final void A0(kotlin.coroutines.d dVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new Pair<>(dVar, obj));
    }

    @Override // xsna.z9h0, xsna.pyx
    public final void G(Object obj) {
        z0();
        Object d = s7s0.d(obj);
        spj<T> spjVar = this.e;
        kotlin.coroutines.d context = spjVar.getContext();
        Object b = mqo0.b(context, null);
        z2q0<?> c = b != mqo0.a ? mvj.c(spjVar, context, b) : null;
        try {
            spjVar.resumeWith(d);
            s3q0 s3q0Var = s3q0.a;
            if (c == null || c.y0()) {
                mqo0.a(context, b);
            }
        } catch (Throwable th) {
            if (c == null || c.y0()) {
                mqo0.a(context, b);
            }
            throw th;
        }
    }

    @Override // xsna.z9h0
    public final void x0() {
        z0();
    }

    public final boolean y0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void z0() {
        if (this.threadLocalIsSet) {
            Pair<kotlin.coroutines.d, Object> pair = this.f.get();
            if (pair != null) {
                mqo0.a(pair.d(), pair.g());
            }
            this.f.remove();
        }
    }
}
