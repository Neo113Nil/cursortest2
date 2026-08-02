package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class poz {
    public final int a;
    public final p5k0 b;
    public final p5k0 c;

    public poz(int i, p5k0 p5k0Var, p5k0 p5k0Var2) {
        this.a = i;
        this.b = p5k0Var;
        this.c = p5k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poz)) {
            return false;
        }
        poz pozVar = (poz) obj;
        return this.a == pozVar.a && this.b.equals(pozVar.b) && this.c.equals(pozVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "LookupData(iteration=" + this.a + ", currentHeaderData=" + this.b + ", newHeaderData=" + this.c + Extension.C_BRAKE;
    }
}
