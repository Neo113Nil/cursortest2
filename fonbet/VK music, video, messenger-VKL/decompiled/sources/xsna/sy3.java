package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Prefetchers.kt */
/* loaded from: classes12.dex */
public final class sy3 extends m0d0 {
    public final hg00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy3() {
        super(nz3.a);
        hg00 hg00Var = hg00.a;
        this.e = hg00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    @Override // xsna.m0d0
    public final long d(PriorityBlockingQueue priorityBlockingQueue) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = priorityBlockingQueue.poll();
        while (true) {
            T t = ref$ObjectRef.element;
            if (t == 0) {
                return 0L;
            }
            j0d0 j0d0Var = (j0d0) t;
            RecyclerView.e0 b = j0d0Var.b.b(j0d0Var.c);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ry3 ry3Var = new ry3(ref$ObjectRef, b, ref$BooleanRef, 0);
            this.e.getClass();
            hg00.a(ry3Var);
            if (ref$BooleanRef.element) {
                return 0L;
            }
            ref$ObjectRef.element = priorityBlockingQueue.poll();
        }
    }
}
