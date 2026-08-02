package defpackage;

/* loaded from: classes8.dex */
public final /* synthetic */ class b0d implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qlp b;
    public final /* synthetic */ String c;

    public /* synthetic */ b0d(qlp qlpVar, String str, int i) {
        this.a = i;
        this.b = qlpVar;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        qlp qlpVar = this.b;
        switch (i) {
            case 0:
                return new llp(qlpVar, str);
            case 1:
                return new olp(qlpVar, str);
            case 2:
                return new plp(qlpVar, str);
            case 3:
                return new nlp(qlpVar, str);
            case 4:
                return new mlp(qlpVar, str);
            case 5:
                return new llp(qlpVar, str);
            case 6:
                return new olp(qlpVar, str);
            case 7:
                return new plp(qlpVar, str);
            case 8:
                return new nlp(qlpVar, str);
            default:
                return new mlp(qlpVar, str);
        }
    }
}
