package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final class n971 {
    public final /* synthetic */ int a;
    public final List b;
    public final fb81[] c;

    public n971(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new fb81[list.size()];
                break;
            default:
                this.b = list;
                this.c = new fb81[list.size()];
                break;
        }
    }

    public final void a(yg71 yg71Var, xi11 xi11Var) {
        int i = this.a;
        List list = this.b;
        fb81[] fb81VarArr = this.c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < fb81VarArr.length; i2++) {
                    xi11Var.a();
                    xi11Var.b();
                    fb81 l = yg71Var.l(xi11Var.d, 3);
                    qd81 qd81Var = (qd81) list.get(i2);
                    String str = qd81Var.E;
                    cha1.c("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                    da81 da81Var = new da81();
                    xi11Var.b();
                    da81Var.a = xi11Var.e;
                    da81Var.k = str;
                    da81Var.d = qd81Var.w;
                    da81Var.c = qd81Var.c;
                    da81Var.C = qd81Var.W;
                    da81Var.m = qd81Var.G;
                    l.k(new qd81(da81Var));
                    fb81VarArr[i2] = l;
                }
                break;
            default:
                for (int i3 = 0; i3 < fb81VarArr.length; i3++) {
                    xi11Var.a();
                    xi11Var.b();
                    fb81 l2 = yg71Var.l(xi11Var.d, 3);
                    qd81 qd81Var2 = (qd81) list.get(i3);
                    String str2 = qd81Var2.E;
                    cha1.c("Invalid closed caption mime type provided: " + str2, "application/cea-608".equals(str2) || "application/cea-708".equals(str2));
                    String str3 = qd81Var2.a;
                    if (str3 == null) {
                        xi11Var.b();
                        str3 = xi11Var.e;
                    }
                    da81 da81Var2 = new da81();
                    da81Var2.a = str3;
                    da81Var2.k = str2;
                    da81Var2.d = qd81Var2.w;
                    da81Var2.c = qd81Var2.c;
                    da81Var2.C = qd81Var2.W;
                    da81Var2.m = qd81Var2.G;
                    l2.k(new qd81(da81Var2));
                    fb81VarArr[i3] = l2;
                }
                break;
        }
    }
}
