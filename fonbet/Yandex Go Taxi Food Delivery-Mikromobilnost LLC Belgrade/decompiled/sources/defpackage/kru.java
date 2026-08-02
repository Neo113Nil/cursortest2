package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kru {
    public final t1y a;
    public final pru b;

    public kru(t1y t1yVar, pru pruVar) {
        this.a = t1yVar;
        this.b = pruVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kru)) {
            return false;
        }
        kru kruVar = (kru) obj;
        return this.a.equals(kruVar.a) && this.b.equals(kruVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HorizontalStackItemModel(distributionPolicy=" + this.a + ", widget=" + this.b + Extension.C_BRAKE;
    }
}
