package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iox implements qas0 {
    public final enx a;

    public iox(enx enxVar) {
        this.a = enxVar;
    }

    public final enx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iox) && this.a.equals(((iox) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomSheet(content=" + this.a + Extension.C_BRAKE;
    }
}
