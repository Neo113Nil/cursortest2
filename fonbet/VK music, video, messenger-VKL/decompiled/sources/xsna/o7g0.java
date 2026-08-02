package xsna;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes11.dex */
public final class o7g0 implements izs<Boolean, s3q0> {
    public emb0 b;

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        emb0 emb0Var = this.b;
        if (emb0Var != null) {
            emb0Var.c = booleanValue;
        }
        return s3q0.a;
    }
}
