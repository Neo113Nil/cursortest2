package androidx.compose.ui.graphics.vector;

import defpackage.c531;
import defpackage.i3y;
import defpackage.jb2;
import defpackage.jl40;
import defpackage.jvu0;
import defpackage.ml6;
import defpackage.nb2;
import defpackage.qam;
import defpackage.qy21;
import defpackage.r891;
import defpackage.zq90;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class PathComponent extends qy21 {
    public ml6 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public ml6 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public jvu0 q;
    public final jb2 r;
    public jb2 s;
    public jb2 t;
    public final i3y u;

    public PathComponent() {
        int i = c531.a;
        this.d = EmptyList.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        jb2 a = nb2.a();
        this.r = a;
        this.s = a;
        this.u = kotlin.a.b(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.w);
    }

    @Override // defpackage.qy21
    public final void a(qam qamVar) {
        qam qamVar2;
        jvu0 jvu0Var;
        if (this.n) {
            r891.g(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ml6 ml6Var = this.b;
        if (ml6Var != null) {
            qamVar2 = qamVar;
            qam.p(qamVar2, this.s, ml6Var, this.c, null, 56);
        } else {
            qamVar2 = qamVar;
        }
        ml6 ml6Var2 = this.g;
        if (ml6Var2 != null) {
            jvu0 jvu0Var2 = this.q;
            if (this.o || jvu0Var2 == null) {
                jvu0 jvu0Var3 = new jvu0(this.h, this.i, 16, this.f, this.j);
                this.q = jvu0Var3;
                this.o = false;
                jvu0Var = jvu0Var3;
            } else {
                jvu0Var = jvu0Var2;
            }
            qam.p(qamVar2, this.s, ml6Var2, this.e, jvu0Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        jb2 jb2Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = jb2Var;
            return;
        }
        if (jl40.l(this.s, jb2Var)) {
            this.s = nb2.a();
        } else {
            int j = this.s.j();
            this.s.p();
            this.s.q(j);
        }
        i3y i3yVar = this.u;
        ((zq90) i3yVar.getValue()).b(jb2Var);
        float length = ((zq90) i3yVar.getValue()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((zq90) i3yVar.getValue()).a(f4, f5, this.s);
            return;
        }
        jb2 jb2Var2 = this.t;
        if (jb2Var2 == null) {
            jb2Var2 = nb2.a();
            this.t = jb2Var2;
        }
        jb2Var2.o();
        ((zq90) i3yVar.getValue()).a(f4, length, jb2Var2);
        this.s.d(jb2Var2);
        jb2Var2.o();
        ((zq90) i3yVar.getValue()).a(0.0f, f5, jb2Var2);
        this.s.d(jb2Var2);
    }

    public final String toString() {
        return this.r.toString();
    }
}
