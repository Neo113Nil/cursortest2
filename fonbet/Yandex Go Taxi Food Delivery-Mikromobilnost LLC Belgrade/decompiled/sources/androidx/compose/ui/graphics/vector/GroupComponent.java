package androidx.compose.ui.graphics.vector;

import defpackage.a6t0;
import defpackage.b64;
import defpackage.c531;
import defpackage.cot;
import defpackage.jb2;
import defpackage.ldc;
import defpackage.ml6;
import defpackage.n810;
import defpackage.nb2;
import defpackage.nfh;
import defpackage.qam;
import defpackage.qy21;
import defpackage.r891;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class GroupComponent extends qy21 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = ldc.m;
    public List f;
    public boolean g;
    public jb2 h;
    public tls i;
    public final tls j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public GroupComponent() {
        int i = c531.a;
        this.f = EmptyList.a;
        this.g = true;
        this.j = new tls() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qy21 qy21Var = (qy21) obj;
                GroupComponent.this.g(qy21Var);
                tls tlsVar = GroupComponent.this.i;
                if (tlsVar != null) {
                    tlsVar.invoke(qy21Var);
                }
                return zy11.a;
            }
        };
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.qy21
    public final void a(qam qamVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = n810.a();
                this.b = fArr;
            } else {
                n810.d(fArr);
            }
            n810.g(fArr, this.q + this.m, this.r + this.n);
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
            n810.e(fArr, this.o, this.p);
            n810.g(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                jb2 jb2Var = this.h;
                if (jb2Var == null) {
                    jb2Var = nb2.a();
                    this.h = jb2Var;
                }
                r891.g(this.f, jb2Var);
            }
            this.g = false;
        }
        nfh N = qamVar.N();
        long v = N.v();
        N.q().save();
        try {
            cot cotVar = (cot) N.a;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ((nfh) cotVar.b).q().r(fArr2);
            }
            jb2 jb2Var2 = this.h;
            if (!this.f.isEmpty() && jb2Var2 != null) {
                cotVar.e(jb2Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((qy21) arrayList.get(i)).a(qamVar);
            }
            b64.C(N, v);
        } catch (Throwable th) {
            b64.C(N, v);
            throw th;
        }
    }

    @Override // defpackage.qy21
    public final tls b() {
        return this.i;
    }

    @Override // defpackage.qy21
    public final void d(tls tlsVar) {
        this.i = tlsVar;
    }

    public final void e(int i, qy21 qy21Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, qy21Var);
        } else {
            arrayList.add(qy21Var);
        }
        g(qy21Var);
        qy21Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = c531.a;
            if (ldc.h(j2) == ldc.h(j) && ldc.g(j2) == ldc.g(j) && ldc.e(j2) == ldc.e(j)) {
                return;
            }
            this.d = false;
            this.e = ldc.m;
        }
    }

    public final void g(qy21 qy21Var) {
        if (!(qy21Var instanceof PathComponent)) {
            if (qy21Var instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) qy21Var;
                if (groupComponent.d && this.d) {
                    f(groupComponent.e);
                    return;
                } else {
                    this.d = false;
                    this.e = ldc.m;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) qy21Var;
        ml6 ml6Var = pathComponent.b;
        if (this.d && ml6Var != null) {
            if (ml6Var instanceof a6t0) {
                f(((a6t0) ml6Var).a);
            } else {
                this.d = false;
                this.e = ldc.m;
            }
        }
        ml6 ml6Var2 = pathComponent.g;
        if (this.d && ml6Var2 != null) {
            if (ml6Var2 instanceof a6t0) {
                f(((a6t0) ml6Var2).a);
            } else {
                this.d = false;
                this.e = ldc.m;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qy21 qy21Var = (qy21) arrayList.get(i);
            sb.append("\t");
            sb.append(qy21Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
