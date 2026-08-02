package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.r2d;

/* compiled from: ClipItemRenderEventsHandler.kt */
/* loaded from: classes17.dex */
public final class s2d {
    public final o5s0 a;
    public final pb b;
    public final Object c;

    public s2d(j1d j1dVar, o5s0 o5s0Var, pb pbVar) {
        this.a = o5s0Var;
        this.b = pbVar;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.tools.controls.seekbar.g(3, this, j1dVar));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(r2d r2dVar) {
        if (r2dVar instanceof r2d.b) {
            this.a.c().o0(((r2d.b) r2dVar).a, null);
        } else {
            if (!(r2dVar instanceof r2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((w2d) this.c.getValue()).b(((r2d.a) r2dVar).a);
        }
    }
}
