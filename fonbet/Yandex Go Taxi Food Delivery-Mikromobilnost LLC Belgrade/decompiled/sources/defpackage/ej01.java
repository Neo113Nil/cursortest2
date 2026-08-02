package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ej01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj01 b;

    public /* synthetic */ ej01(tj01 tj01Var, int i) {
        this.a = i;
        this.b = tj01Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tj01 tj01Var = this.b;
        switch (i) {
            case 0:
                tj01Var.invoke((String) obj);
                break;
            default:
                n70 n70Var = (n70) obj;
                n70Var.W(new rmy0(25, n70Var, tj01Var));
                break;
        }
        return zy11Var;
    }
}
