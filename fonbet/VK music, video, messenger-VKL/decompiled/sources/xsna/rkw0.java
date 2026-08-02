package xsna;

/* compiled from: VoipCallsGetContactsInfoBarVisibilityCmd.kt */
/* loaded from: classes2.dex */
public final class rkw0 extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        if (!w2wVar.getConfig().l().H0()) {
            return Boolean.valueOf(avz.a(w2wVar, "voip_calls_import_contacts_banner"));
        }
        avz.f(w2wVar, "voip_calls_import_contacts_banner");
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return obj instanceof rkw0;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "VoipCallsGetContactsInfoBarVisibilityCmd";
    }
}
