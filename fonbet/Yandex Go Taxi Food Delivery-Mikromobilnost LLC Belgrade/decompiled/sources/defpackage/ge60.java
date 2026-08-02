package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ge60 implements he60 {
    public final edb0 a;

    public ge60(edb0 edb0Var) {
        this.a = edb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge60) && this.a.equals(((ge60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Single(text=" + this.a + Extension.C_BRAKE;
    }
}
