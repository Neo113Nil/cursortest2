package defpackage;

import ru.yandex.taxi.maas.impl.ride.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class f200 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ f200(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.r(new iez(7));
                break;
            default:
                bVar.r(new iez(8));
                break;
        }
        return zy11Var;
    }
}
