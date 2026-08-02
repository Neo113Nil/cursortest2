package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r70(int i, gzs gzsVar, izs izsVar) {
        this.d = gzsVar;
        this.e = izsVar;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.d;
                izs izsVar = (izs) this.e;
                gzsVar.invoke();
                izsVar.invoke(new f9o0(this.c));
                return s3q0.a;
            default:
                vm30 vm30Var = (vm30) this.d;
                String str = (String) this.e;
                StringBuilder a = vq.a("ChatScrollIssue: instantScrollToPosition position=", this.c, '/');
                a.append(vm30Var.H.f.size() - 1);
                a.append(", scrollTo=");
                a.append(vm30Var.V);
                a.append(", stop=true, chain=");
                a.append(str);
                return a.toString();
        }
    }

    public /* synthetic */ r70(int i, vm30 vm30Var, String str) {
        this.c = i;
        this.d = vm30Var;
        this.e = str;
    }
}
