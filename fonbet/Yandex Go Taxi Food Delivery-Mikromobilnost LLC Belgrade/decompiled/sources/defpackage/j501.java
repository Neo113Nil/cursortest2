package defpackage;

import com.yandex.go.mainscreen.superapp.orders.presentation.ui.g;

/* loaded from: classes12.dex */
public final /* synthetic */ class j501 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ String c;

    public /* synthetic */ j501(g gVar, String str, int i) {
        this.a = i;
        this.b = gVar;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.f.remove(str);
                break;
            case 1:
                gVar.g.remove(str);
                break;
            default:
                gVar.g.remove(str);
                break;
        }
        return zy11Var;
    }
}
