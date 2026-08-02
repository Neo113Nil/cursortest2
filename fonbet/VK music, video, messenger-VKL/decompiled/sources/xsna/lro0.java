package xsna;

/* compiled from: ThreadContext.kt */
/* loaded from: classes8.dex */
public final class lro0 {
    public final kotlin.coroutines.d a;
    public final Object[] b;
    public final kqo0<Object>[] c;
    public int d;

    public lro0(int i, kotlin.coroutines.d dVar) {
        this.a = dVar;
        this.b = new Object[i];
        this.c = new kqo0[i];
    }

    public final void a(kqo0<?> kqo0Var, Object obj) {
        int i = this.d;
        this.b[i] = obj;
        this.d = i + 1;
        this.c[i] = kqo0Var;
    }

    public final void b(kotlin.coroutines.d dVar) {
        kqo0<Object>[] kqo0VarArr = this.c;
        int length = kqo0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            kqo0VarArr[length].j(this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
