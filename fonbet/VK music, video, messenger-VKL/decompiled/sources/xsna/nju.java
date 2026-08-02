package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: Vector.kt */
/* loaded from: classes11.dex */
public final class nju extends gir0 {
    public float[] b;
    public androidx.compose.ui.graphics.a h;
    public izs<? super gir0, s3q0> i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = l5g.k;
    public List<? extends qq90> f = jlr0.a;
    public boolean g = true;
    public final a j = new a();
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    /* compiled from: Vector.kt */
    public static final class a extends Lambda implements izs<gir0, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gir0 gir0Var) {
            gir0 gir0Var2 = gir0Var;
            nju.this.g(gir0Var2);
            izs<? super gir0, s3q0> izsVar = nju.this.i;
            if (izsVar != null) {
                izsVar.invoke(gir0Var2);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.gir0
    public final void a(oio oioVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = en10.a();
                this.b = fArr;
            } else {
                en10.e(fArr);
            }
            en10.i(this.q + this.m, this.r + this.n, fArr);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = fArr[1];
                float f7 = fArr[5];
                float f8 = (sin * f7) + (cos * f6);
                float f9 = fArr[2];
                float f10 = fArr[6];
                float f11 = (sin * f10) + (cos * f9);
                float f12 = fArr[3];
                float f13 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f8;
                fArr[2] = f11;
                fArr[3] = (sin * f13) + (cos * f12);
                fArr[4] = (f3 * cos) + (f2 * f5);
                fArr[5] = (f7 * cos) + (f6 * f5);
                fArr[6] = (f10 * cos) + (f9 * f5);
                fArr[7] = (cos * f13) + (f5 * f12);
            }
            en10.f(this.o, this.p, fArr);
            en10.i(-this.m, -this.n, fArr);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                androidx.compose.ui.graphics.a aVar = this.h;
                if (aVar == null) {
                    aVar = androidx.compose.ui.graphics.b.a();
                    this.h = aVar;
                }
                tq90.b(this.f, aVar);
            }
            this.g = false;
        }
        er9.b a0 = oioVar.a0();
        long d2 = a0.d();
        a0.a().e();
        try {
            fr9 fr9Var = a0.a;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ((er9.b) fr9Var.b).a().m(fArr2);
            }
            androidx.compose.ui.graphics.a aVar2 = this.h;
            if (!this.f.isEmpty() && aVar2 != null) {
                fr9Var.b(aVar2, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gir0) arrayList.get(i)).a(oioVar);
            }
            nq.b(a0, d2);
        } catch (Throwable th) {
            nq.b(a0, d2);
            throw th;
        }
    }

    @Override // xsna.gir0
    public final izs<gir0, s3q0> b() {
        return this.i;
    }

    @Override // xsna.gir0
    public final void d(a aVar) {
        this.i = aVar;
    }

    public final void e(int i, gir0 gir0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, gir0Var);
        } else {
            arrayList.add(gir0Var);
        }
        g(gir0Var);
        gir0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            EmptyList emptyList = jlr0.a;
            if (l5g.i(j2) == l5g.i(j) && l5g.h(j2) == l5g.h(j) && l5g.f(j2) == l5g.f(j)) {
                return;
            }
            this.d = false;
            this.e = l5g.k;
        }
    }

    public final void g(gir0 gir0Var) {
        if (!(gir0Var instanceof fq90)) {
            if (gir0Var instanceof nju) {
                nju njuVar = (nju) gir0Var;
                if (njuVar.d && this.d) {
                    f(njuVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = l5g.k;
                    return;
                }
            }
            return;
        }
        fq90 fq90Var = (fq90) gir0Var;
        yk8 yk8Var = fq90Var.b;
        if (this.d && yk8Var != null) {
            if (yk8Var instanceof rek0) {
                f(((rek0) yk8Var).b);
            } else {
                this.d = false;
                this.e = l5g.k;
            }
        }
        yk8 yk8Var2 = fq90Var.g;
        if (this.d && yk8Var2 != null) {
            if (yk8Var2 instanceof rek0) {
                f(((rek0) yk8Var2).b);
            } else {
                this.d = false;
                this.e = l5g.k;
            }
        }
    }

    public final void h(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((gir0) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gir0 gir0Var = (gir0) arrayList.get(i);
            sb.append("\t");
            sb.append(gir0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
