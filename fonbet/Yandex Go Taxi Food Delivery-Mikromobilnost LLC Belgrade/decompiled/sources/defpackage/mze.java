package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mze extends n351 {
    public final String c;
    public final w0f d;
    public final l690 e;

    public mze(String str, w0f w0fVar, l690 l690Var) {
        super("counter", false, 14);
        this.c = str;
        this.d = w0fVar;
        this.e = l690Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mze)) {
            return false;
        }
        mze mzeVar = (mze) obj;
        return jl40.l(this.c, mzeVar.c) && this.d.equals(mzeVar.d) && this.e.equals(mzeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CounterModel(id=" + this.c + ", state=" + this.d + ", paddings=" + this.e + Extension.C_BRAKE;
    }
}
