package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dib implements b151 {
    public final boolean a;
    public final fib b;
    public final x2s c;

    public dib(boolean z, fib fibVar, x2s x2sVar) {
        this.a = z;
        this.b = fibVar;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dib)) {
            return false;
        }
        dib dibVar = (dib) obj;
        return this.a == dibVar.a && jl40.l(this.b, dibVar.b) && this.c.equals(dibVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "CheckWidgetAction(isChecked=" + this.a + ", model=" + this.b + ", analyticsData=" + this.c + Extension.C_BRAKE;
    }
}
