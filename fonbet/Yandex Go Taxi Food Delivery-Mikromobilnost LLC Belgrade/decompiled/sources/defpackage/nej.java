package defpackage;

import com.yandex.go.rida.dialog_modal.DialogModalUiAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class nej implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pej b;

    public /* synthetic */ nej(pej pejVar, int i) {
        this.a = i;
        this.b = pejVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        pej pejVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                g92 g92Var = new g92(2, ((agd) yfdVar).a);
                agd agdVar = (agd) yfdVar;
                agdVar.c = g92Var;
                agdVar.e = new nej(pejVar, i2);
                q6d.a.getClass();
                agdVar.g = q6d.b;
                break;
            default:
                int i3 = oej.a[((DialogModalUiAction) obj).ordinal()];
                if (i3 == 1) {
                    pejVar.r(new nni(18));
                    break;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    pejVar.r(new nni(19));
                    break;
                }
        }
        return zy11Var;
    }
}
