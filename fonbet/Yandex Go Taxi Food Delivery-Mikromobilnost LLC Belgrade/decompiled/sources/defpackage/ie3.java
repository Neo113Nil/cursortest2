package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ie3 {
    public final sls a;

    public ie3(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie3) && this.a.equals(((ie3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonClicked(clickCallback=" + this.a + Extension.C_BRAKE;
    }
}
