package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jco implements nco {
    public final CharSequence a;
    public final bdc b = new bdc(xng0.bgMain);
    public final bdc c = new bdc(xng0.textMain);

    public jco(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.nco
    public final kdc a() {
        return this.c;
    }

    @Override // defpackage.nco
    public final int b() {
        return 3;
    }

    @Override // defpackage.nco
    public final int c() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jco) && this.a.equals(((jco) obj).a);
    }

    @Override // defpackage.nco
    public final kdc getBackgroundColor() {
        return this.b;
    }

    @Override // defpackage.nco
    public final CharSequence getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Active(text=", Extension.C_BRAKE);
    }
}
