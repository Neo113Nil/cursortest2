package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class cvy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ evy b;

    public /* synthetic */ cvy(evy evyVar, int i) {
        this.a = i;
        this.b = evyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        evy evyVar = this.b;
        switch (i) {
            case 0:
                hs7 hs7Var = evyVar.c;
                if (hs7Var != null) {
                    evyVar.a.j(hs7Var);
                    break;
                }
                break;
            default:
                if (evyVar.c == null) {
                    evyVar.c = new hs7(3, evyVar);
                }
                evyVar.a.g(evyVar.c);
                break;
        }
    }
}
