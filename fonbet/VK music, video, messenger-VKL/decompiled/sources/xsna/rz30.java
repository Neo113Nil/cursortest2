package xsna;

/* compiled from: MsgSetActiveMessengerPushesCmd.kt */
/* loaded from: classes2.dex */
public final class rz30 extends le6<Boolean> {
    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) bz2.c(new wg20(), "MessagesSetActiveMessengerPushesApiCmd");
    }

    public final boolean equals(Object obj) {
        return obj instanceof rz30;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgSetActiveMessengerPushesCmd()";
    }
}
