package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h9u0 implements a05 {
    public final Throwable a;
    public final v7l b;
    public final lur0 c;
    public final boolean d;

    public h9u0(Throwable th, v7l v7lVar, lur0 lur0Var, boolean z) {
        this.a = th;
        this.b = v7lVar;
        this.c = lur0Var;
        this.d = z;
    }

    public static h9u0 b(h9u0 h9u0Var, Throwable th, v7l v7lVar, lur0 lur0Var, int i) {
        if ((i & 1) != 0) {
            th = h9u0Var.a;
        }
        if ((i & 2) != 0) {
            v7lVar = h9u0Var.b;
        }
        if ((i & 4) != 0) {
            lur0Var = h9u0Var.c;
        }
        boolean z = (i & 8) != 0 ? h9u0Var.d : false;
        h9u0Var.getClass();
        return new h9u0(th, v7lVar, lur0Var, z);
    }

    @Override // defpackage.a05
    public final lur0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9u0)) {
            return false;
        }
        h9u0 h9u0Var = (h9u0) obj;
        return jl40.l(this.a, h9u0Var.a) && jl40.l(this.b, h9u0Var.b) && this.c.equals(h9u0Var.c) && this.d == h9u0Var.d;
    }

    @Override // defpackage.a05
    public final v7l getEntity() {
        return this.b;
    }

    @Override // defpackage.a05
    public final Throwable getError() {
        return this.a;
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        v7l v7lVar = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (v7lVar != null ? v7lVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusScreenState(error=" + this.a + ", entity=" + this.b + ", shimmerTimerStatus=" + this.c + ", isFirstLoad=" + this.d + Extension.C_BRAKE;
    }
}
