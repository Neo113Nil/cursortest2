package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a8h {
    public final CharSequence a;
    public final CharSequence b;

    public a8h(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8h)) {
            return false;
        }
        a8h a8hVar = (a8h) obj;
        return this.a.equals(a8hVar.a) && jl40.l(this.b, a8hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "DefaultCallTypeSettingsItemUiState(itemTitleText=", ", callTypeText=", Extension.C_BRAKE);
    }
}
