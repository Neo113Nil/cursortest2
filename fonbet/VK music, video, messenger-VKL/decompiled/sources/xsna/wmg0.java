package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: ThreadsSubstitution.kt */
/* loaded from: classes17.dex */
public final class wmg0 {
    public final wyn0 a;
    public int b;
    public final ArrayList c = new ArrayList();

    public wmg0(wyn0 wyn0Var) {
        this.a = wyn0Var;
    }

    public final l0n0 a() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = this.b;
        if (size == i) {
            arrayList.add(new l0n0(i, (ExecutorService) this.a.invoke(Integer.valueOf(i))));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        l0n0 l0n0Var = (l0n0) arrayList.get(i2);
        if (this.b == 5) {
            this.b = 0;
        }
        return l0n0Var;
    }
}
