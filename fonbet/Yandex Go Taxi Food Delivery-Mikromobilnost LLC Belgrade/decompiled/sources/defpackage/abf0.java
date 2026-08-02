package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class abf0 {
    public final r0 a = bvf0.c(new zaf0(null));
    public zaf0 b;

    public final void a(qaf0 qaf0Var) {
        zaf0 zaf0Var;
        r0 r0Var = this.a;
        if (qaf0Var.equals(((zaf0) r0Var.getValue()).a)) {
            return;
        }
        zaf0 zaf0Var2 = this.b;
        if (zaf0Var2 == null || !qaf0Var.equals(zaf0Var2.a)) {
            zaf0Var = new zaf0(qaf0Var);
        } else {
            zaf0Var = this.b;
            this.b = null;
        }
        if (zaf0Var != null) {
            r0Var.getClass();
            r0Var.m(null, zaf0Var);
        }
    }

    public final void b(qaf0 qaf0Var, boolean z) {
        r0 r0Var = this.a;
        zaf0 zaf0Var = (zaf0) r0Var.getValue();
        if (qaf0Var.equals(zaf0Var.a)) {
            if (this.b == null && z) {
                this.b = zaf0Var;
            }
            zaf0 zaf0Var2 = new zaf0(null);
            r0Var.getClass();
            r0Var.m(null, zaf0Var2);
        }
    }

    public final zaf0 c(qaf0 qaf0Var) {
        zaf0 zaf0Var = (zaf0) this.a.getValue();
        if (jl40.l(qaf0Var, zaf0Var.a)) {
            return zaf0Var;
        }
        zaf0 zaf0Var2 = this.b;
        if (zaf0Var2 == null) {
            zaf0 zaf0Var3 = new zaf0(qaf0Var);
            this.b = zaf0Var3;
            return zaf0Var3;
        }
        if (jl40.l(qaf0Var, zaf0Var2.a)) {
            return this.b;
        }
        zaf0 zaf0Var4 = new zaf0(qaf0Var);
        this.b = zaf0Var4;
        return zaf0Var4;
    }
}
