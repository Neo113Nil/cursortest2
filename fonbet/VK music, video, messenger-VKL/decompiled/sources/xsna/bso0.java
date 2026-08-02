package xsna;

/* compiled from: CauseProducer.kt */
/* loaded from: classes2.dex */
public final class bso0 implements isx0 {
    public final mla a;

    public bso0(mla mlaVar) {
        this.a = mlaVar;
    }

    @Override // xsna.isx0
    public final mla b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThrowableWrapper(");
        mla mlaVar = this.a;
        sb.append(mlaVar.b());
        sb.append("\n\tcaused by ");
        sb.append(mlaVar);
        sb.append(')');
        return sb.toString();
    }
}
