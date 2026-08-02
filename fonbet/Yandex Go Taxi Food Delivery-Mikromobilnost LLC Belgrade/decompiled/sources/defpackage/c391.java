package defpackage;

/* loaded from: classes7.dex */
public final /* synthetic */ class c391 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d391 b;

    public /* synthetic */ c391(d391 d391Var, int i) {
        this.a = i;
        this.b = d391Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d391 d391Var = this.b;
        switch (i) {
            case 0:
                nr41 nr41Var = d391Var.b;
                if (nr41Var != null) {
                    nr41Var.e();
                    break;
                }
                break;
            case 1:
                nr41 nr41Var2 = d391Var.b;
                if (nr41Var2 != null) {
                    nr41Var2.k();
                }
                nr41 nr41Var3 = d391Var.b;
                if (nr41Var3 != null) {
                    nr41Var3.m();
                    break;
                }
                break;
            default:
                nr41 nr41Var4 = d391Var.b;
                if (nr41Var4 != null) {
                    nr41Var4.p();
                    break;
                }
                break;
        }
    }
}
