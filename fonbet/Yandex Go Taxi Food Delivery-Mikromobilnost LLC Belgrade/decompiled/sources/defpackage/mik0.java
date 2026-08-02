package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mik0 {
    public final CharSequence a;
    public final long b;
    public final boolean c;

    public mik0(CharSequence charSequence, long j, boolean z) {
        this.a = charSequence;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mik0)) {
            return false;
        }
        mik0 mik0Var = (mik0) obj;
        return jl40.l(this.a, mik0Var.a) && this.b == mik0Var.b && this.c == mik0Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + qv10.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleUiState(text=");
        sb.append((Object) this.a);
        sb.append(", animationDuration=");
        sb.append(this.b);
        return xra1.a(sb, ", enableSlideAnimation=", this.c, Extension.C_BRAKE);
    }
}
