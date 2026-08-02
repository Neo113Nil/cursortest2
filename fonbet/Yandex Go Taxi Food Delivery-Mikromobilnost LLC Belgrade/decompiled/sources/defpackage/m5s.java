package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m5s {
    public final l5s a;
    public final ArrayList b;

    public m5s(l5s l5sVar, ArrayList arrayList) {
        this.a = l5sVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5s)) {
            return false;
        }
        m5s m5sVar = (m5s) obj;
        return this.a.equals(m5sVar.a) && this.b.equals(m5sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormOverrideInternalModel(model=" + this.a + ", matchedModifiers=" + this.b + Extension.C_BRAKE;
    }
}
