package xsna;

/* compiled from: VoipGetAllowIncomingCallInfoBarVisibilityCmd.kt */
/* loaded from: classes2.dex */
public final class iow0 extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return Boolean.valueOf(avz.a(w2wVar, "allow_incoming_call_push_setting_banner"));
    }

    public final boolean equals(Object obj) {
        return obj instanceof iow0;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "VoipGetAllowIncomingCallInfoBarVisibilityCmd";
    }
}
