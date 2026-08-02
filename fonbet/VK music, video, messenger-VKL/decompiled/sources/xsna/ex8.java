package xsna;

import java.util.LinkedList;

/* compiled from: CachePrefetchController.kt */
/* loaded from: classes3.dex */
public final class ex8 implements by1 {
    public final /* synthetic */ fx8 b;

    public ex8(fx8 fx8Var) {
        this.b = fx8Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.by1
    public final void W(bpz bpzVar, pr10 pr10Var) {
        fx8 fx8Var = this.b;
        LinkedList linkedList = fx8Var.g;
        if (fx8Var.h) {
            fx8.f(fx8Var, pr10Var, ((Number) fx8Var.i.getValue()).intValue(), fx8Var.f, linkedList);
        } else {
            fx8.f(fx8Var, pr10Var, ((Number) fx8Var.j.getValue()).intValue(), linkedList, null);
        }
    }
}
