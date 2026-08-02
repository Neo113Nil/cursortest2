package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class o5e {
    public final AtomicReference a;
    public final r0 b;
    public final gci0 c;

    public o5e() {
        k5e k5eVar = k5e.f;
        this.a = new AtomicReference(k5eVar);
        r0 c = bvf0.c(k5eVar);
        this.b = c;
        this.c = e.d(c);
    }

    public final k5e a() {
        return (k5e) this.a.get();
    }
}
