package defpackage;

import androidx.compose.ui.layout.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class m4p implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o b;
    public final /* synthetic */ o c;
    public final /* synthetic */ int w;

    public /* synthetic */ m4p(int i, o oVar, o oVar2) {
        this.w = i;
        this.b = oVar;
        this.c = oVar2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        o oVar = this.c;
        o oVar2 = this.b;
        o.a aVar = (o.a) obj;
        switch (i) {
            case 0:
                if (i2 != 0) {
                    o.a.o(aVar, oVar2, 0, 0);
                }
                o.a.o(aVar, oVar, 0, i2);
                break;
            default:
                o.a.o(aVar, oVar2, 0, 0);
                o.a.o(aVar, oVar, 0, oVar2.b + i2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ m4p(o oVar, o oVar2, int i) {
        this.b = oVar;
        this.c = oVar2;
        this.w = i;
    }
}
