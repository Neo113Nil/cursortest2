package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class ao31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a201 b;
    public final /* synthetic */ kyg c;

    public /* synthetic */ ao31(a201 a201Var, kyg kygVar, int i) {
        this.a = i;
        this.b = a201Var;
        this.c = kygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a201 a201Var = this.b;
                kyg kygVar = this.c;
                co31 co31Var = (co31) a201Var.c;
                int i = tw21.a;
                co31Var.onVideoEnabled(kygVar);
                break;
            default:
                a201 a201Var2 = this.b;
                kyg kygVar2 = this.c;
                synchronized (kygVar2) {
                }
                co31 co31Var2 = (co31) a201Var2.c;
                int i2 = tw21.a;
                co31Var2.onVideoDisabled(kygVar2);
                break;
        }
    }
}
