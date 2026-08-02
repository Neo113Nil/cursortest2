package defpackage;

import com.yandex.plus.analytics.dwh.a;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import java.util.Map;

/* loaded from: classes8.dex */
public final /* synthetic */ class ead0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fad0 b;

    public /* synthetic */ ead0(fad0 fad0Var, int i) {
        this.a = i;
        this.b = fad0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        fad0 fad0Var = this.b;
        switch (i) {
            case 0:
                return fad0Var.e.a.toString();
            case 1:
                return new s4n((a) fad0Var.c.getValue(), fad0Var.a.s, new ead0(fad0Var, 13));
            case 2:
                PlusPayPlatform b = ned0.b(PlusPayPlatform.Companion, fad0Var.a.g);
                ct90 ct90Var = (ct90) fad0Var.f.getValue();
                ped0 ped0Var = (ped0) fad0Var.d.getValue();
                hzk hzkVar = new hzk();
                hzkVar.a = b;
                hzkVar.b = ped0Var;
                return new bt90(new cot(22, hzkVar), ct90Var, new vit(hzkVar));
            case 3:
                return new jdj(18, ned0.b(PlusPayPlatform.Companion, fad0Var.a.g), (at90) fad0Var.g.getValue(), (ped0) fad0Var.d.getValue()).f();
            case 4:
                return new icj((bt90) fad0Var.h.getValue());
            case 5:
                return new pq80((dit) fad0Var.n.getValue());
            case 6:
                return new ubd0((dit) fad0Var.n.getValue(), (zs90) fad0Var.i.getValue());
            case 7:
                return new zio((dit) fad0Var.n.getValue(), (zs90) fad0Var.i.getValue());
            case 8:
                return fad0Var.a.k.a();
            case 9:
                return fad0Var.a.b().getLocale();
            case 10:
                return fad0Var.a.j.getLocale();
            case 11:
                return fad0Var.e.a.toString();
            case 12:
                return fad0Var.a.b().getLocale();
            case 13:
                return Boolean.valueOf(ffx.K(((ccd0) ((ecd0) fad0Var.b.invoke())).c()));
            default:
                return (Map) ((at90) fad0Var.g.getValue()).a().a;
        }
    }
}
