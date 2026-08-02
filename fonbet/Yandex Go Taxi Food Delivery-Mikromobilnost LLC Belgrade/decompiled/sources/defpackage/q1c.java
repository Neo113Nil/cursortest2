package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class q1c {
    public final CharSequence a;
    public final Runnable b;

    public q1c(CharSequence charSequence, Runnable runnable) {
        this.a = charSequence;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1c)) {
            return false;
        }
        q1c q1cVar = (q1c) obj;
        return jl40.l(this.a, q1cVar.a) && this.b.equals(q1cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Clickable(title=" + ((Object) this.a) + ", listener=" + this.b + Extension.C_BRAKE;
    }
}
