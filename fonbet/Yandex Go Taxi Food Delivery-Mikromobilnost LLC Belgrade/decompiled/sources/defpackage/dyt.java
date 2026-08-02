package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dyt {
    public final ArrayList a;
    public final int b;

    public dyt(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyt)) {
            return false;
        }
        dyt dytVar = (dyt) obj;
        return this.a.equals(dytVar.a) && this.b == dytVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientEntity(colors=" + this.a + ", angle=" + this.b + Extension.C_BRAKE;
    }
}
