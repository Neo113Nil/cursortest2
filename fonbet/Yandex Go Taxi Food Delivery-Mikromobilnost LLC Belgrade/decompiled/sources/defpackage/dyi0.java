package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class dyi0 implements n1m {
    public final xzl a;
    public final u1m b;
    public final zwl c;
    public final zwl d;

    public dyi0(xzl xzlVar, u1m u1mVar, zwl zwlVar, zwl zwlVar2) {
        this.a = xzlVar;
        this.b = u1mVar;
        this.c = zwlVar;
        this.d = zwlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyi0)) {
            return false;
        }
        dyi0 dyi0Var = (dyi0) obj;
        return jl40.l(this.a, dyi0Var.a) && jl40.l(this.b, dyi0Var.b) && jl40.l(this.c, dyi0Var.c) && jl40.l(this.d, dyi0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u1m u1mVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (u1mVar == null ? 0 : u1mVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "RenderedDocumentOrigin(render=" + this.a + ", targetQuery=" + this.b + ", documentLifecycleCallbacksConfig=" + this.c + ", previousDocumentActionsCallbacksConfig=" + this.d + Extension.C_BRAKE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ dyi0(xzl xzlVar, u1m u1mVar) {
        this(xzlVar, u1mVar, r0, r0);
        zwl zwlVar = zwl.d;
    }
}
