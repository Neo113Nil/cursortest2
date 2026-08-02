package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class b680 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b680(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return zy11Var;
    }
}
