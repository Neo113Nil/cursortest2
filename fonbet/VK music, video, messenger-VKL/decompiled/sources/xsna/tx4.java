package xsna;

import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AudioSnippetQueueFacade.kt */
/* loaded from: classes3.dex */
public final class tx4 {
    public final kt4 a;
    public final Object b;
    public final LinkedHashSet c;
    public final Object d;

    public tx4(lx4 lx4Var, mlf0 mlf0Var, kt4 kt4Var) {
        this.a = kt4Var;
        yb3 yb3Var = new yb3(lx4Var, mlf0Var, this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, yb3Var);
        this.c = new LinkedHashSet();
        this.d = msy.a(lazyThreadSafetyMode, new i21(2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final px4 a() {
        return (px4) this.b.getValue();
    }
}
