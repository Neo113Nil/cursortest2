package defpackage;

import androidx.compose.ui.layout.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class h2w implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ o c;
    public final /* synthetic */ int w;

    public /* synthetic */ h2w(int i, o oVar, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = oVar;
        this.w = i2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        int i3 = this.b;
        o oVar = this.c;
        o.a aVar = (o.a) obj;
        switch (i) {
            case 0:
                aVar.g(oVar, i3, i2, 0.0f);
                break;
            case 1:
                aVar.g(oVar, m810.b((i3 - oVar.a) / 2.0f), m810.b((i2 - oVar.b) / 2.0f), 0.0f);
                break;
            case 2:
                aVar.g(oVar, m810.b((i3 - oVar.a) / 2.0f), m810.b((i2 - oVar.b) / 2.0f), 0.0f);
                break;
            case 3:
                aVar.g(oVar, i3, i2, 0.0f);
                break;
            default:
                aVar.g(oVar, i3, i2, 0.0f);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ h2w(o oVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = oVar;
        this.b = i;
        this.w = i2;
    }
}
