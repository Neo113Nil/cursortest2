package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class ph1 {
    public static final Object d = new Object();
    public static volatile ph1 e;
    public final fz1 a;
    public final ArrayList b = new ArrayList();
    public int c;

    public ph1(fz1 fz1Var) {
        this.a = fz1Var;
    }

    public final Executor a() {
        Executor executor;
        synchronized (d) {
            try {
                if (this.b.size() < 4) {
                    executor = Executors.newSingleThreadExecutor(this.a);
                    this.b.add(executor);
                } else {
                    ArrayList arrayList = this.b;
                    int i = this.c;
                    this.c = i + 1;
                    executor = (Executor) arrayList.get(i);
                    if (this.c == 4) {
                        this.c = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
