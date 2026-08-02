package xsna;

import java.util.List;
import xsna.jlb0;

/* compiled from: AggregatorHandle.java */
/* loaded from: classes8.dex */
public abstract class sb1<T extends jlb0> {
    public final k6o a;
    public final h300 b;
    public final boolean c;
    public volatile boolean d = false;

    public sb1(e4q e4qVar, boolean z) {
        this.c = z;
        if (z) {
            this.a = e4qVar.g();
            this.b = null;
        } else {
            this.a = null;
            this.b = e4qVar.m();
        }
    }

    public final T a(long j, long j2, q94 q94Var, boolean z) {
        if (z) {
            this.d = false;
        }
        if (this.c) {
            k6o k6oVar = this.a;
            if (k6oVar != null) {
                return b(j, j2, q94Var, k6oVar.j(q94Var), z);
            }
            throw new UnsupportedOperationException("This aggregator does not support double values.");
        }
        h300 h300Var = this.b;
        if (h300Var != null) {
            return c(j, j2, q94Var, h300Var.f(q94Var), z);
        }
        throw new UnsupportedOperationException("This aggregator does not support long values.");
    }

    public T b(long j, long j2, q94 q94Var, List<j6o> list, boolean z) {
        throw new UnsupportedOperationException("This aggregator does not support double values.");
    }

    public T c(long j, long j2, q94 q94Var, List<g300> list, boolean z) {
        throw new UnsupportedOperationException("This aggregator does not support long values.");
    }

    public void d(double d) {
        throw new UnsupportedOperationException("This aggregator does not support double values.");
    }

    public void e(long j) {
        throw new UnsupportedOperationException("This aggregator does not support long values.");
    }

    public final void f(double d, q94 q94Var, wmj wmjVar) {
        k6o k6oVar = this.a;
        if (k6oVar == null) {
            throw new UnsupportedOperationException("This aggregator does not support double values.");
        }
        k6oVar.c(d, q94Var, wmjVar);
        d(d);
        this.d = true;
    }

    public void g(long j, q94 q94Var, wmj wmjVar) {
        h300 h300Var = this.b;
        if (h300Var == null) {
            throw new UnsupportedOperationException("This aggregator does not support long values.");
        }
        h300Var.a(j, q94Var, wmjVar);
        e(j);
        this.d = true;
    }
}
