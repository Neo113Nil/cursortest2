package xsna;

import java.util.concurrent.ExecutorService;
import xsna.mgn0;

/* compiled from: SDKDependencyGraphInitialization.kt */
/* loaded from: classes6.dex */
public final class wxg0 implements gzs<ExecutorService> {
    public static final wxg0 b = new wxg0();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final ExecutorService invoke() {
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        if (mgn0Var2 == null) {
            mgn0Var2 = null;
        }
        return mgn0.h.a.a((mgn0.h) mgn0Var2.j.getValue(), "vk-multiacc-thread", 5, 4);
    }
}
