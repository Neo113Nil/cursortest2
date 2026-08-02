package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lco implements nco {
    public final String a;
    public final bdc b = new bdc(xng0.bgMain);
    public final bdc c = new bdc(xng0.textMinor);

    public lco(String str) {
        this.a = str;
    }

    @Override // defpackage.nco
    public final kdc a() {
        return this.c;
    }

    @Override // defpackage.nco
    public final int b() {
        return 0;
    }

    @Override // defpackage.nco
    public final int c() {
        return -4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lco) && this.a.equals(((lco) obj).a);
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
        return "Inactive(text=" + ((Object) this.a) + Extension.C_BRAKE;
    }
}
