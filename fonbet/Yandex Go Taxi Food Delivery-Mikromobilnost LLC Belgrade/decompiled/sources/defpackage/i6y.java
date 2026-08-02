package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class i6y implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6y b;

    public /* synthetic */ i6y(j6y j6yVar, int i) {
        this.a = i;
        this.b = j6yVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        j6y j6yVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(j6yVar.b.c());
            case 1:
                return Float.valueOf(j6yVar.b.d());
            default:
                return Float.valueOf(j6yVar.b.f() - j6yVar.b.a());
        }
    }
}
