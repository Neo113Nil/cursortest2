package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

/* compiled from: FixedSizeExemplarReservoir.java */
/* loaded from: classes8.dex */
public class hnr implements k6o, h300 {
    public final b9g0 c;
    public final int d;
    public volatile boolean e = false;
    public a9g0[] b = null;

    public hnr(int i, b9g0 b9g0Var) {
        this.d = i;
        this.c = b9g0Var;
    }

    @Override // xsna.h300
    public void a(long j, q94 q94Var, wmj wmjVar) {
        if (this.b == null) {
            int i = this.d;
            a9g0[] a9g0VarArr = new a9g0[i];
            for (int i2 = 0; i2 < i; i2++) {
                a9g0VarArr[i2] = new a9g0();
            }
            this.b = a9g0VarArr;
        }
        int b = this.c.b(this.b, j);
        if (b != -1) {
            a9g0 a9g0Var = this.b[b];
            synchronized (a9g0Var) {
                a9g0Var.e = j;
                a9g0Var.b(q94Var, wmjVar);
            }
            this.e = true;
        }
    }

    public final <T extends c4q> List<T> b(q94 q94Var, BiFunction<a9g0, q94, T> biFunction) {
        if (!this.e || this.b == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (a9g0 a9g0Var : this.b) {
            T apply = biFunction.apply(a9g0Var, q94Var);
            if (apply != null) {
                arrayList.add(apply);
            }
        }
        this.c.reset();
        this.e = false;
        return Collections.unmodifiableList(arrayList);
    }

    @Override // xsna.k6o
    public final void c(double d, q94 q94Var, wmj wmjVar) {
        if (this.b == null) {
            int i = this.d;
            a9g0[] a9g0VarArr = new a9g0[i];
            for (int i2 = 0; i2 < i; i2++) {
                a9g0VarArr[i2] = new a9g0();
            }
            this.b = a9g0VarArr;
        }
        int a = this.c.a(this.b, d);
        if (a != -1) {
            a9g0 a9g0Var = this.b[a];
            synchronized (a9g0Var) {
                a9g0Var.f = d;
                a9g0Var.b(q94Var, wmjVar);
            }
            this.e = true;
        }
    }

    @Override // xsna.h300
    public final List<g300> f(q94 q94Var) {
        return b(q94Var, new gnr());
    }

    @Override // xsna.k6o
    public final List<j6o> j(q94 q94Var) {
        return b(q94Var, new fnr());
    }
}
