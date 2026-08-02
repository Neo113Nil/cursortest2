package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class e1h implements f1h {
    public final String a;
    public final Throwable b;

    public e1h(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1h)) {
            return false;
        }
        e1h e1hVar = (e1h) obj;
        return jl40.l(this.a, e1hVar.a) && jl40.l(this.b, e1hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "FailedToHandleDeeplink(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ e1h(String str) {
        this(str, null);
    }
}
