package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class b831 implements ys11 {
    public final Exception a;

    public b831(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b831) && jl40.l(this.a, ((b831) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReturnEvent(error=" + this.a + Extension.C_BRAKE;
    }
}
