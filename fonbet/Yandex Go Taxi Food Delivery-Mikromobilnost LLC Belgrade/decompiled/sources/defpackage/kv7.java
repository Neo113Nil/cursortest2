package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kv7 extends mv7 {
    public final jw7 a;

    public kv7(jw7 jw7Var) {
        this.a = jw7Var;
    }

    public final vv7 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv7) && this.a.equals(((kv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NeedUserDecision(cancelMessage=" + this.a + Extension.C_BRAKE;
    }
}
