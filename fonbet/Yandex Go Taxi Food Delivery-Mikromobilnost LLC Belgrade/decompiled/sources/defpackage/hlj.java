package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hlj {
    public final CharSequence a;
    public final nlj b;

    public hlj(CharSequence charSequence, nlj nljVar) {
        this.a = charSequence;
        this.b = nljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlj)) {
            return false;
        }
        hlj hljVar = (hlj) obj;
        return this.a.equals(hljVar.a) && this.b.equals(hljVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionItemUiState(title=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
