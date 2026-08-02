package xsna;

/* compiled from: VoipCallsHideContactsInfoBarCmd.kt */
/* loaded from: classes2.dex */
public final class skw0 extends le6<s3q0> {
    public final String b;

    public skw0(String str) {
        this.b = str;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        avz.g(w2wVar.f1(), "voip_calls_import_contacts_banner", w2wVar);
        if (epx.f(this.b, "action")) {
            avz.f(w2wVar, "voip_calls_import_contacts_banner");
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skw0) && epx.f(this.b, ((skw0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ho8.a(new StringBuilder("VoipCallsHideContactsInfoBarCmd(source="), this.b, ')');
    }
}
