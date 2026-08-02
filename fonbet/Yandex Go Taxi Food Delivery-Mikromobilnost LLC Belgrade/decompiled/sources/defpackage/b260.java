package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class b260 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ c260 c;

    public b260(c260 c260Var, u6h u6hVar, Executor executor) {
        this.c = c260Var;
        this.a = new WeakReference(u6hVar);
        this.b = executor;
    }
}
