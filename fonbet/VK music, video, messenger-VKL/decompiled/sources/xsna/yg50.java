package xsna;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MutableLongPointData.java */
/* loaded from: classes8.dex */
public final class yg50 implements v300 {
    public long a;
    public long b;
    public long c;
    public q94 d = jk3.e;
    public List<g300> e = Collections.EMPTY_LIST;

    @Override // xsna.jlb0
    public final long b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v300)) {
            return false;
        }
        v300 v300Var = (v300) obj;
        return this.a == v300Var.getValue() && this.b == v300Var.g() && this.c == v300Var.b() && Objects.equals(this.d, v300Var.getAttributes()) && Objects.equals(this.e, v300Var.o());
    }

    @Override // xsna.jlb0
    public final long g() {
        return this.b;
    }

    @Override // xsna.jlb0
    public final q94 getAttributes() {
        return this.d;
    }

    @Override // xsna.v300
    public final long getValue() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j3 = this.a;
        return ((hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.e.hashCode();
    }

    @Override // xsna.jlb0
    public final List<g300> o() {
        return this.e;
    }

    public final void p(v300 v300Var) {
        long g = v300Var.g();
        long b = v300Var.b();
        q94 attributes = v300Var.getAttributes();
        long value = v300Var.getValue();
        List o = v300Var.o();
        this.b = g;
        this.c = b;
        this.d = attributes;
        this.a = value;
        this.e = o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableLongPointData{value=");
        sb.append(this.a);
        sb.append(", startEpochNanos=");
        sb.append(this.b);
        sb.append(", epochNanos=");
        sb.append(this.c);
        sb.append(", attributes=");
        sb.append(this.d);
        sb.append(", exemplars=");
        return ms9.a('}', sb, this.e);
    }
}
