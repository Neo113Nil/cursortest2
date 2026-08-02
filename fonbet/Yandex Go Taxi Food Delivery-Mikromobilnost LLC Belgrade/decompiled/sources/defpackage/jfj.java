package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jfj {
    public final CharSequence a;
    public final int b;

    public jfj(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj)) {
            return false;
        }
        jfj jfjVar = (jfj) obj;
        return jl40.l(this.a, jfjVar.a) && this.b == jfjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DialogueBodyUiState(title=" + ((Object) this.a) + ", titleAlign=" + sjy0.a(this.b) + Extension.C_BRAKE;
    }
}
