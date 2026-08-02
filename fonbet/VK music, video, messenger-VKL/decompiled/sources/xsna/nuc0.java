package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PostsFromNotificationsDependencies.kt */
/* loaded from: classes4.dex */
public final class nuc0 {
    public final mo60 a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final fh9 e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new f540(this, 17));

    public nuc0(bin0<Context> bin0Var, mo60 mo60Var) {
        this.a = mo60Var;
        this.b = mo60Var.i;
        this.c = mo60Var.j;
        this.d = mo60Var.m;
        this.e = mo60Var.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final ho60 a() {
        return (ho60) this.a.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final bs60 b() {
        return (bs60) this.a.d0.getValue();
    }
}
