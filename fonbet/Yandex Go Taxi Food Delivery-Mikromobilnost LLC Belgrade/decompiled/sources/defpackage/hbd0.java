package defpackage;

import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.feature.cache.a;
import com.yandex.plus.pay.internal.feature.user.d;
import com.yandex.plus.pay.internal.feature.user.e;
import com.yandex.plus.pay.internal.feature.user.listener.b;
import com.yandex.plus.pay.internal.feature.user.listener.c;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final /* synthetic */ class hbd0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ibd0 b;

    public /* synthetic */ hbd0(ibd0 ibd0Var, int i) {
        this.a = i;
        this.b = ibd0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ibd0 ibd0Var = this.b;
        switch (i) {
            case 0:
                Set<SyncType> all = SyncType.INSTANCE.all();
                ocd0 d = ibd0Var.b.d();
                gzu0 gzu0Var = (gzu0) ibd0Var.l.getValue();
                t1v0 t1v0Var = (t1v0) ibd0Var.i.getValue();
                a b = ibd0Var.b();
                fad0 fad0Var = ibd0Var.c;
                nq80 nq80Var = (nq80) fad0Var.k.getValue();
                ndd0 ndd0Var = fad0Var.e;
                ((wyj) ibd0Var.a.n).getClass();
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.a(d, gzu0Var, t1v0Var, b, nq80Var, ndd0Var, all, wyj.e);
            case 1:
                return new com.yandex.plus.pay.internal.feature.mailing.a((m300) ibd0Var.b.x.getValue(), ibd0Var.c.e);
            case 2:
                return new com.yandex.plus.pay.internal.feature.contacts.a((com.yandex.plus.pay.graphql.contacts.a) ibd0Var.b.y.getValue(), ibd0Var.c.e);
            case 3:
                return new kyz0((com.yandex.plus.pay.internal.feature.topup.a) ibd0Var.b.z.getValue());
            case 4:
                return new com.yandex.plus.pay.internal.feature.user.listener.a(new ol[]{new b(ibd0Var.b()), new c(new hbd0(ibd0Var, i2)), new l721(ibd0Var.a.q)});
            case 5:
                return new gl41((hl41) ibd0Var.b.A.getValue());
            case 6:
                return new com.yandex.plus.pay.internal.feature.presale.a((com.yandex.plus.pay.internal.feature.presale.b) ibd0Var.b.D.getValue(), ibd0Var.a(), (xfd0) ((i3y) ibd0Var.d.s).getValue());
            case 7:
                com.yandex.plus.pay.graphql.offers.a aVar = (com.yandex.plus.pay.graphql.offers.a) ibd0Var.b.r.getValue();
                List a = ibd0Var.a();
                fad0 fad0Var2 = ibd0Var.c;
                return new com.yandex.plus.pay.internal.feature.presale.c(aVar, a, fad0Var2.e, (qqx0) fad0Var2.m.getValue(), (wfd0) ((i3y) ibd0Var.d.g).getValue());
            case 8:
                return new com.yandex.plus.pay.internal.feature.closing.a((com.yandex.plus.pay.internal.feature.closing.b) ibd0Var.b.B.getValue(), ibd0Var.a(), (qfd0) ((i3y) ibd0Var.d.q).getValue());
            case 9:
                return new com.yandex.plus.pay.internal.feature.counter_offers.a((com.yandex.plus.pay.internal.feature.counter_offers.b) ibd0Var.b.C.getValue(), ibd0Var.a(), (sfd0) ((i3y) ibd0Var.d.r).getValue());
            case 10:
                return new com.yandex.plus.pay.internal.feature.experiments.listener.a(new ero[]{new m721(ibd0Var.a.q)});
            case 11:
                Set set = (Set) ((ccd0) ((ecd0) ibd0Var.e.invoke())).a().getValue();
                return set == null ? EmptySet.a : set;
            case 12:
                m1v0 m1v0Var = (m1v0) ibd0Var.b.p.getValue();
                fad0 fad0Var3 = ibd0Var.c;
                return new com.yandex.plus.pay.internal.feature.subscription.b(m1v0Var, fad0Var3.e, (y1v0) ((icj) fad0Var3.j.getValue()).c.getValue());
            case 13:
                ocd0 d2 = ibd0Var.b.d();
                ((wyj) ibd0Var.a.n).getClass();
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.a(d2, wyj.f, new hbd0(ibd0Var, 11));
            case 14:
                ndd0 ndd0Var2 = ibd0Var.c.e;
                dbd0 dbd0Var = ibd0Var.b;
                return new a(ndd0Var2, (d) dbd0Var.n.getValue(), (com.yandex.plus.pay.internal.feature.user.c) dbd0Var.o.getValue(), (com.yandex.plus.pay.graphql.offers.a) dbd0Var.r.getValue());
            case 15:
                return new gzu0((hwt) ibd0Var.b.E.getValue());
            case 16:
                dbd0 dbd0Var2 = ibd0Var.b;
                return new com.yandex.plus.pay.internal.feature.upsale.a((com.yandex.plus.pay.graphql.upsale.a) dbd0Var2.q.getValue(), (bgd0) ((i3y) ibd0Var.d.m).getValue(), dbd0Var2.d(), ibd0Var.c.e);
            case 17:
                return new e(ibd0Var.a.t.h, (com.yandex.plus.pay.graphql.avatar.a) ibd0Var.b.t.getValue(), ibd0Var.c.e);
            case 18:
                fad0 fad0Var4 = ibd0Var.c;
                return scc.g(new f5r(fad0Var4.e), new com.yandex.plus.pay.internal.feature.offers.post.a(ibd0Var.b.d(), fad0Var4.e, (yqx0) ((icj) fad0Var4.j.getValue()).a.getValue()));
            case 19:
                dbd0 dbd0Var3 = ibd0Var.b;
                com.yandex.plus.pay.graphql.offers.a aVar2 = (com.yandex.plus.pay.graphql.offers.a) dbd0Var3.r.getValue();
                List a2 = ibd0Var.a();
                com.yandex.plus.experiments.impl.providers.a b2 = dbd0Var3.b();
                fad0 fad0Var5 = ibd0Var.c;
                return new com.yandex.plus.pay.internal.feature.offers.b(aVar2, a2, b2, fad0Var5.e, (qqx0) fad0Var5.m.getValue(), (wfd0) ((i3y) ibd0Var.d.g).getValue());
            case 20:
                return new com.yandex.plus.pay.internal.feature.offers.smart.a((qzs0) ibd0Var.b.s.getValue(), ibd0Var.a(), (gfd0) ((i3y) ibd0Var.d.h).getValue());
            case 21:
                String str = ibd0Var.a.a;
                com.yandex.plus.pay.graphql.invoice.a aVar3 = (com.yandex.plus.pay.graphql.invoice.a) ibd0Var.b.u.getValue();
                fad0 fad0Var6 = ibd0Var.c;
                return new com.yandex.plus.pay.internal.feature.payment.common.a(str, aVar3, (nq80) fad0Var6.k.getValue(), (fdd0) ibd0Var.f.getValue(), fad0Var6.e);
            case 22:
                return new com.yandex.plus.pay.internal.feature.payment.common.b((com.yandex.plus.pay.graphql.invoice.a) ibd0Var.b.u.getValue(), (fdd0) ibd0Var.f.getValue(), ibd0Var.c.e);
            case 23:
                dbd0 dbd0Var4 = ibd0Var.b;
                return new com.yandex.plus.pay.internal.feature.payment.common.c((com.yandex.plus.pay.graphql.invoice.a) dbd0Var4.u.getValue(), (com.yandex.plus.pay.graphql.user.a) dbd0Var4.v.getValue(), (fdd0) ibd0Var.f.getValue(), ibd0Var.c.e);
            case 24:
                dbd0 dbd0Var5 = ibd0Var.b;
                return new com.yandex.plus.pay.internal.feature.offers.a((com.yandex.plus.pay.graphql.offers.a) dbd0Var5.r.getValue(), dbd0Var5.d(), ibd0Var.c.e);
            default:
                return new com.yandex.plus.pay.internal.feature.family.a((com.yandex.plus.pay.graphql.family.a) ibd0Var.b.w.getValue(), ibd0Var.c.e);
        }
    }
}
