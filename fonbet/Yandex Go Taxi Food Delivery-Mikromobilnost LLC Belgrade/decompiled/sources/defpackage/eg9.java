package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class eg9 implements fg9 {
    public final xf9 a;

    public eg9(xf9 xf9Var) {
        this.a = xf9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg9) && this.a.equals(((eg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NeedShow(changeSourcePointEntryPinConfig=" + this.a + Extension.C_BRAKE;
    }
}
