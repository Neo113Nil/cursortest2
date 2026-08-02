package xsna;

import xsna.q8z;

/* compiled from: parseMarkdown.kt */
/* loaded from: classes17.dex */
public final class teq0 implements i9z {
    public final izs<String, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public teq0(izs<? super String, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.i9z
    public final void a(q8z q8zVar) {
        if (!(q8zVar instanceof q8z.b)) {
            throw new IllegalStateException("Check failed.");
        }
        this.b.invoke(((q8z.b) q8zVar).a);
    }
}
