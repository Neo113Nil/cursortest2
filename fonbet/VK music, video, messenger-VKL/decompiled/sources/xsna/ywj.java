package xsna;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

/* compiled from: CountFlushTrigger.kt */
/* loaded from: classes5.dex */
public final class ywj implements pur {
    public final int a;
    public final AtomicInteger b;
    public dp0 c;

    public ywj(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Threshold must be positive, got: ").toString());
        }
        this.b = new AtomicInteger(0);
    }

    @Override // xsna.pur
    public final void a(int i) {
        dp0 dp0Var = this.c;
        if (dp0Var == null) {
            return;
        }
        if (this.b.getAndAccumulate(i, new IntBinaryOperator() { // from class: xsna.xwj
            @Override // java.util.function.IntBinaryOperator
            public final int applyAsInt(int i2, int i3) {
                int i4 = i2 + i3;
                if (i4 >= ywj.this.a) {
                    return 0;
                }
                return i4;
            }
        }) + i >= this.a) {
            dp0Var.invoke();
        }
    }

    @Override // xsna.pur
    public final void b(dp0 dp0Var) {
        this.c = dp0Var;
    }

    @Override // xsna.pur
    public final void c(pur purVar) {
        if (epx.f(purVar, this)) {
            return;
        }
        this.b.set(0);
    }
}
