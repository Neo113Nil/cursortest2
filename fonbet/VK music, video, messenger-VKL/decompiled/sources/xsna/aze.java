package xsna;

/* compiled from: ClipsPublicationAgreementInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class aze implements izs<Boolean, s3q0> {
    public final /* synthetic */ cze b;
    public final /* synthetic */ gzg0 c;

    public aze(cze czeVar, gzg0 gzg0Var) {
        this.b = czeVar;
        this.c = gzg0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        wye wyeVar = this.b.a;
        this.c.resumeWith(booleanValue ? wyeVar.c() : wyeVar.b());
        return s3q0.a;
    }
}
