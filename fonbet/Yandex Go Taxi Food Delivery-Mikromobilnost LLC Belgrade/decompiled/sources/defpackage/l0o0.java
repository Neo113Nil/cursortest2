package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public abstract class l0o0 implements yuo0 {
    public final Object a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public l0o0(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.yuo0
    public final void a(String str) {
        this.b.remove(str);
    }

    public final Object b(String str) {
        return ((r0) c(str)).getValue();
    }

    public final pz40 c(String str) {
        return (pz40) this.b.computeIfAbsent(str, new yu0(21, new iin0(8, this)));
    }

    public final void d(Object obj, String str) {
        ((r0) c(str)).l(obj);
    }
}
