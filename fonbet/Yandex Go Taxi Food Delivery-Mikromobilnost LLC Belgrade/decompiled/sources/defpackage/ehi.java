package defpackage;

import ru.yandex.taxi.delivery.impl.paid_insurance.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class ehi implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ ehi(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                return (zzh) eVar.D.get();
            case 1:
                return new tu8(eVar, 2);
            default:
                eVar.r(new wth(23));
                eVar.i();
                return zy11.a;
        }
    }
}
