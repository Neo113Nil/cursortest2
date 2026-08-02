package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nib implements wib {
    public final nnb a;

    public nib(nnb nnbVar) {
        this.a = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nib) && this.a.equals(((nib) obj).a);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BackClicked(analytics=" + this.a + Extension.C_BRAKE;
    }
}
