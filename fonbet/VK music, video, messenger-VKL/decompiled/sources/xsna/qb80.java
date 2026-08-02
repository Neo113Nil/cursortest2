package xsna;

/* compiled from: OnSendSnippetFailedEvent.kt */
/* loaded from: classes2.dex */
public final class qb80 extends sxp {
    public final String b = "MsgSendUncheckedJob";
    public final Throwable c;

    public qb80(Throwable th) {
        this.c = th;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }
}
