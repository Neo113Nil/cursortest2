package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class e081 implements xh71 {
    public final String a;

    public e081(String str) {
        this.a = str;
    }

    @Override // defpackage.xh71
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e081) && this.a.equals(((e081) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CloseAction(actionType=", this.a, Extension.C_BRAKE);
    }
}
