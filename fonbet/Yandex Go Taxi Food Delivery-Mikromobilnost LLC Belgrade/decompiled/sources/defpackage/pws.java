package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pws implements rws {
    public final w6v a;

    public pws(w6v w6vVar) {
        this.a = w6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pws) && this.a.equals(((pws) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Idle(reason=" + this.a + Extension.C_BRAKE;
    }
}
