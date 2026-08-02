package xsna;

/* compiled from: CallableImEngineCmd.kt */
/* loaded from: classes2.dex */
public final class kb9<T> extends xl6<T> {
    public final ksj b;
    public final String c = "im-file-convert";

    public kb9(ksj ksjVar) {
        this.b = ksjVar;
    }

    @Override // xsna.m2w
    public final String a() {
        return this.c;
    }

    @Override // xsna.le6
    public final T e(w2w w2wVar) {
        vua0.c("CallableImEngineCmd");
        return (T) this.b.call();
    }

    public final boolean equals(Object obj) {
        kb9 kb9Var = obj instanceof kb9 ? (kb9) obj : null;
        return this.b.equals(kb9Var != null ? kb9Var.b : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "CallableImEngineCmd";
    }
}
