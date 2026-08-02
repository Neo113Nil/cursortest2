package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n5s {
    public final Object a;
    public final ArrayList b;

    public n5s(ArrayList arrayList, Object obj) {
        this.a = obj;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5s)) {
            return false;
        }
        n5s n5sVar = (n5s) obj;
        return jl40.l(this.a, n5sVar.a) && this.b.equals(n5sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormOverrideModifierDescriptor(match=" + this.a + ", modifiers=" + this.b + Extension.C_BRAKE;
    }
}
