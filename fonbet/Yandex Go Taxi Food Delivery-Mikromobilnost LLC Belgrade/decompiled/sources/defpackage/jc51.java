package defpackage;

/* loaded from: classes4.dex */
public final class jc51 extends o2 implements y1 {
    public static final xc4 y = xc4.m;
    public boolean a;
    public int b;
    public ya c;
    public v4i0[] w;
    public jqf x;

    public jc51(ya yaVar, v4i0[] v4i0VarArr) {
        this.c = yaVar;
        v4i0[] v4i0VarArr2 = (v4i0[]) v4i0VarArr.clone();
        this.w = v4i0VarArr2;
        this.x = new jqf(v4i0VarArr2);
    }

    public static jc51 m(Object obj) {
        v4i0 v4i0Var;
        if (obj instanceof jc51) {
            return (jc51) obj;
        }
        if (obj == null) {
            return null;
        }
        i3 z = i3.z(obj);
        jc51 jc51Var = new jc51();
        int size = z.size();
        jc51Var.c = y;
        jc51Var.w = new v4i0[size];
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            a2 A = z.A(i);
            if (A instanceof v4i0) {
                v4i0Var = (v4i0) A;
            } else if (A != null) {
                m3 x = m3.x(A);
                v4i0Var = new v4i0();
                v4i0Var.a = x;
            } else {
                v4i0Var = null;
            }
            z2 &= v4i0Var == A;
            jc51Var.w[i] = v4i0Var;
        }
        jc51Var.x = z2 ? (jqf) z.s() : new jqf(jc51Var.w);
        return jc51Var;
    }

    @Override // defpackage.o2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc51) && !(obj instanceof i3)) {
            return false;
        }
        if (this.x.q(((a2) obj).toASN1Primitive())) {
            return true;
        }
        try {
            ya yaVar = this.c;
            jc51 m = m(obj);
            yaVar.getClass();
            return ya.a(this, m);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.o2
    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        this.c.getClass();
        v4i0[] n = n();
        int i = 0;
        for (int i2 = 0; i2 != n.length; i2++) {
            v4i0 v4i0Var = n[i2];
            if (v4i0Var.a.a.length > 1) {
                zc3[] n2 = v4i0Var.n();
                for (int i3 = 0; i3 != n2.length; i3++) {
                    i = (i ^ n2[i3].a.a.hashCode()) ^ x2v.c(n2[i3].b).hashCode();
                }
            } else {
                i = (i ^ v4i0Var.m().a.a.hashCode()) ^ x2v.c(n[i2].m().b).hashCode();
            }
        }
        this.b = i;
        return i;
    }

    public final v4i0[] n() {
        return (v4i0[]) this.w.clone();
    }

    public final v4i0[] o(u2 u2Var) {
        v4i0[] v4i0VarArr = this.w;
        int length = v4i0VarArr.length;
        v4i0[] v4i0VarArr2 = new v4i0[length];
        int i = 0;
        for (int i2 = 0; i2 != v4i0VarArr.length; i2++) {
            v4i0 v4i0Var = v4i0VarArr[i2];
            m3 m3Var = v4i0Var.a;
            int length2 = m3Var.a.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                if (zc3.m(m3Var.a[i3]).a.q(u2Var)) {
                    v4i0VarArr2[i] = v4i0Var;
                    i++;
                    break;
                }
                i3++;
            }
        }
        if (i >= length) {
            return v4i0VarArr2;
        }
        v4i0[] v4i0VarArr3 = new v4i0[i];
        System.arraycopy(v4i0VarArr2, 0, v4i0VarArr3, 0, i);
        return v4i0VarArr3;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.x;
    }

    public final String toString() {
        return this.c.d(this);
    }
}
