package defpackage;

import androidx.compose.ui.layout.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class l4p implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ int c;

    public /* synthetic */ l4p(o oVar, int i, int i2) {
        this.a = i2;
        this.b = oVar;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        o oVar = this.b;
        o.a aVar = (o.a) obj;
        switch (i) {
            case 0:
                o.a.o(aVar, oVar, 0, i2);
                break;
            case 1:
                aVar.g(oVar, 0, -i2, 0.0f);
                break;
            case 2:
                o.a.o(aVar, oVar, 0, i2);
                break;
            default:
                o.a.o(aVar, oVar, 0, (oVar.b / 2) - i2);
                break;
        }
        return zy11Var;
    }
}
