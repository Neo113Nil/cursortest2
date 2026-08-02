package defpackage;

import com.yandex.mapkit.geometry.Polyline;

/* loaded from: classes6.dex */
public final /* synthetic */ class pu8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Polyline b;

    public /* synthetic */ pu8(Polyline polyline, int i) {
        this.a = i;
        this.b = polyline;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Polyline polyline = this.b;
        li6 li6Var = (li6) obj;
        switch (i) {
            case 0:
                li6Var.b(polyline);
                break;
            case 1:
                kgx[] kgxVarArr = gh00.j;
                li6Var.b(polyline);
                break;
            default:
                li6Var.b(polyline);
                break;
        }
        return zy11Var;
    }
}
