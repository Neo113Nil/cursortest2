package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fsf0 implements izs {
    public final /* synthetic */ gsf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fsf0(gsf0 gsf0Var, int i) {
        this.b = gsf0Var;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gsf0 gsf0Var = this.b;
        gsf0Var.b(this.c, true);
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = gsf0Var.d;
        s3q0 s3q0Var = s3q0.a;
        fVar.onNext(s3q0Var);
        return s3q0Var;
    }
}
