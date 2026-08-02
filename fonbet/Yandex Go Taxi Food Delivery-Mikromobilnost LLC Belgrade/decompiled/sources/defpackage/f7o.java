package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final /* synthetic */ class f7o implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7o b;

    public /* synthetic */ f7o(g7o g7oVar, int i) {
        this.a = i;
        this.b = g7oVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g7o g7oVar = this.b;
        switch (i) {
            case 0:
                c7o c7oVar = g7oVar.b;
                ((ekb0) c7oVar.a.c).b(c7oVar.b);
                ArrayList<hkb0> arrayList = c7oVar.c.a;
                wls wlsVar = c7oVar.x;
                for (hkb0 hkb0Var : arrayList) {
                    wlsVar.invoke(hkb0Var.a, hkb0Var.b);
                }
                g7oVar.b.y.dismiss();
                break;
            default:
                c7o c7oVar2 = g7oVar.b;
                ((ekb0) c7oVar2.a.c).i(c7oVar2.b);
                ArrayList<hkb0> arrayList2 = c7oVar2.c.a;
                wls wlsVar2 = c7oVar2.w;
                for (hkb0 hkb0Var2 : arrayList2) {
                    wlsVar2.invoke(hkb0Var2.a, hkb0Var2.b);
                }
                g7oVar.b.y.dismiss();
                break;
        }
        return zy11Var;
    }
}
