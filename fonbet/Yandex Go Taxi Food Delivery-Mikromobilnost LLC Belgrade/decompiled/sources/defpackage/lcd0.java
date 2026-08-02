package defpackage;

import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.internal.di.d;
import com.yandex.plus.pay.internal.feature.user.a;
import com.yandex.plus.pay.internal.feature.user.e;

/* loaded from: classes8.dex */
public final /* synthetic */ class lcd0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ lcd0(String str, b bVar) {
        this.a = 8;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return bVar.b.d.b();
            case 1:
                d dVar = bVar.b;
                com.yandex.plus.pay.internal.feature.user.d dVar2 = (com.yandex.plus.pay.internal.feature.user.d) dVar.d.n.getValue();
                return new a(dVar2, bVar.b());
            case 2:
                return new pwt((com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.a) bVar.b.e.j.getValue());
            case 3:
                return new epd0(bVar.b, bVar.b());
            case 4:
                return new com.yandex.plus.pay.internal.feature.payment.a(bVar.b, bVar.b());
            case 5:
                return new com.yandex.plus.pay.internal.feature.user.b((e) bVar.b.e.n.getValue(), bVar.b());
            case 6:
                return new com.yandex.plus.pay.internal.feature.family.b((com.yandex.plus.pay.internal.feature.family.a) bVar.b.e.v.getValue(), bVar.b());
            case 7:
                return new com.yandex.plus.pay.internal.feature.contacts.b((com.yandex.plus.pay.internal.feature.contacts.a) bVar.b.e.x.getValue(), bVar.b());
            case 8:
                d dVar3 = bVar.b;
                vfd0 vfd0Var = (vfd0) ((i3y) dVar3.c.i).getValue();
                pfd0 pfd0Var = (pfd0) ((i3y) dVar3.c.j).getValue();
                hhw hhwVar = dVar3.c;
                return new rqx0(vfd0Var, pfd0Var, (ofd0) ((i3y) hhwVar.k).getValue(), (nfd0) ((i3y) hhwVar.l).getValue(), (agd0) ((i3y) hhwVar.n).getValue(), (zfd0) ((i3y) hhwVar.o).getValue(), (ufd0) ((i3y) hhwVar.p).getValue());
            case 9:
                return new com.yandex.plus.pay.internal.feature.mailing.b((v200) bVar.b.e.w.getValue(), bVar.b());
            default:
                return new com.yandex.plus.pay.internal.feature.upsale.b((zsd) bVar.b.e.m.getValue(), bVar.b());
        }
    }

    public /* synthetic */ lcd0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }
}
