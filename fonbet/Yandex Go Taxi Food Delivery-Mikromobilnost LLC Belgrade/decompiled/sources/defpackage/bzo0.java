package defpackage;

import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.i;

/* loaded from: classes13.dex */
public final class bzo0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;
    public final /* synthetic */ i c;

    public /* synthetic */ bzo0(j18 j18Var, i iVar, int i) {
        this.a = i;
        this.b = j18Var;
        this.c = iVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i iVar = this.c;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                j18Var.resumeWith(i.c(iVar, (cyo0) obj));
                break;
            default:
                j18Var.resumeWith(i.c(iVar, (cyo0) obj));
                break;
        }
        return zy11Var;
    }
}
