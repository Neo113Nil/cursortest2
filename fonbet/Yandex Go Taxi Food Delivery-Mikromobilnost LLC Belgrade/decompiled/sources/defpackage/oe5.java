package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final /* synthetic */ class oe5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zkq0 b;

    public /* synthetic */ oe5(zkq0 zkq0Var, int i) {
        this.a = i;
        this.b = zkq0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zkq0 zkq0Var = this.b;
        switch (i) {
            case 0:
                AtomicLong atomicLong = zkq0Var.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = zkq0Var.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
