package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q0f implements pre, pru {
    public final String a;
    public final yye b;
    public final o690 c;

    public q0f(String str, yye yyeVar, o690 o690Var) {
        this.a = str;
        this.b = yyeVar;
        this.c = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0f)) {
            return false;
        }
        q0f q0fVar = (q0f) obj;
        return jl40.l(this.a, q0fVar.a) && this.b.equals(q0fVar.b) && jl40.l(this.c, q0fVar.c);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "counter";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        o690 o690Var = this.c;
        return hashCode + (o690Var == null ? 0 : o690Var.hashCode());
    }

    public final String toString() {
        return "CounterRemoteCoreWidget(id=" + this.a + ", action=" + this.b + ", horizontalPaddings=" + this.c + Extension.C_BRAKE;
    }
}
