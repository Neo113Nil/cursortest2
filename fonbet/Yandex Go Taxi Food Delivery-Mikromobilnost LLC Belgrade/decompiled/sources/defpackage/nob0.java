package defpackage;

import android.content.Context;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalCloseReason;
import com.yandex.go.pickup_from_photo.data.a;
import com.yandex.go.pickup_from_photo.data.b;
import com.yandex.go.pickup_from_photo.domain.i;
import com.yandex.go.pickup_from_photo.domain.j;
import com.yandex.go.pickup_from_photo.domain.s;
import com.yandex.go.pickup_from_photo.domain.t;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.pickup_from_photo.navigation.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class nob0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ nob0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                i6r i6rVar = cVar.I;
                i6rVar.getClass();
                return new o5g(i6rVar);
            case 1:
                cVar.T().i();
                cVar.G.d(PhotoPickUpAnalytics$FoundModalCloseReason.Map);
                sls slsVar = cVar.Z;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return zy11Var;
            case 2:
                return (b) cVar.S().w.get();
            case 3:
                o5g S = cVar.S();
                c0g c0gVar = (c0g) S.a;
                w030 C2 = c0gVar.C2();
                q5z.h(C2);
                ynb0 ynb0Var = (ynb0) S.e.a;
                lob0 lob0Var = (lob0) S.y.a;
                ph70 ph70Var = S.z;
                tse tseVar = (tse) c0gVar.B.get();
                q5z.h(tseVar);
                y50 y0 = c0gVar.y0();
                q5z.h(y0);
                epb0 epb0Var = (epb0) S.i.get();
                a aVar = (a) S.o.get();
                Context e2 = c0gVar.e2();
                q5z.h(e2);
                tt2 Z1 = c0gVar.Z1();
                q5z.h(Z1);
                return new cnb0(C2, ynb0Var, lob0Var, ph70Var, new com.yandex.go.pickup_from_photo.domain.c(tseVar, y0, epb0Var, aVar, new i(new t(new sgb0(e2, Z1, S.b()), (com.yandex.go.pickup_from_photo.data.c) S.u.get(), (bjb0) S.n.get()), (b) S.w.get()), (bjb0) S.n.get(), S.a()));
            case 4:
                o5g S2 = cVar.S();
                c0g c0gVar2 = (c0g) S2.a;
                Context e22 = c0gVar2.e2();
                q5z.h(e22);
                w030 C22 = c0gVar2.C2();
                q5z.h(C22);
                epb0 epb0Var2 = (epb0) S2.i.get();
                p b = S2.b();
                zuj0 N2 = c0gVar2.N2();
                q5z.h(N2);
                s sVar = new s(epb0Var2, b, N2, S2.a());
                b bVar = (b) S2.w.get();
                ru.yandex.taxi.address.clarification.impl.repo.a aVar2 = (ru.yandex.taxi.address.clarification.impl.repo.a) c0gVar2.Cc.get();
                q5z.h(aVar2);
                kr0 kr0Var = (kr0) c0gVar2.Ec.get();
                q5z.h(kr0Var);
                xv10 xv10Var = new xv10(bVar, aVar2, kr0Var, S2.a(), (epb0) S2.i.get());
                zuj0 N22 = c0gVar2.N2();
                q5z.h(N22);
                n5g n5gVar = S2.A;
                n5g n5gVar2 = S2.B;
                c0g c0gVar3 = (c0g) S2.a;
                ru.yandex.taxi.search.suggest.i X1 = c0gVar3.X1();
                q5z.h(X1);
                atd0 H2 = c0gVar3.H2();
                q5z.h(H2);
                j jVar = new j(X1, H2);
                ah00 z2 = c0gVar2.z2();
                q5z.h(z2);
                ru.yandex.taxi.search.suggest.i X12 = c0gVar2.X1();
                q5z.h(X12);
                return new d(e22, C22, sVar, xv10Var, N22, n5gVar, n5gVar2, jVar, z2, X12, (epb0) S2.i.get(), (tnb0) S2.C.get());
            case 5:
                o5g S3 = cVar.S();
                c0g c0gVar4 = (c0g) S3.a;
                Context e23 = c0gVar4.e2();
                q5z.h(e23);
                w030 C23 = c0gVar4.C2();
                q5z.h(C23);
                epb0 epb0Var3 = (epb0) S3.i.get();
                zuj0 N23 = c0gVar4.N2();
                q5z.h(N23);
                ru.yandex.taxi.search.suggest.i X13 = c0gVar4.X1();
                q5z.h(X13);
                zxb zxbVar = new zxb(epb0Var3, N23, X13, S3.b());
                b bVar2 = (b) S3.w.get();
                ru.yandex.taxi.address.clarification.impl.repo.a aVar3 = (ru.yandex.taxi.address.clarification.impl.repo.a) c0gVar4.Cc.get();
                q5z.h(aVar3);
                kr0 kr0Var2 = (kr0) c0gVar4.Ec.get();
                q5z.h(kr0Var2);
                an8 an8Var = new an8(bVar2, aVar3, kr0Var2, S3.a(), 17);
                zuj0 N24 = c0gVar4.N2();
                q5z.h(N24);
                n5g n5gVar3 = S3.A;
                n5g n5gVar4 = S3.B;
                c0g c0gVar5 = (c0g) S3.a;
                ru.yandex.taxi.search.suggest.i X14 = c0gVar5.X1();
                q5z.h(X14);
                atd0 H22 = c0gVar5.H2();
                q5z.h(H22);
                j jVar2 = new j(X14, H22);
                ah00 z22 = c0gVar4.z2();
                q5z.h(z22);
                ru.yandex.taxi.search.suggest.i X15 = c0gVar4.X1();
                q5z.h(X15);
                return new com.yandex.go.pickup_from_photo.navigation.b(e23, C23, zxbVar, an8Var, N24, n5gVar3, n5gVar4, jVar2, z22, X15, (epb0) S3.i.get(), S3.a(), (tnb0) S3.C.get());
            case 6:
                return (tnb0) cVar.S().C.get();
            default:
                sls slsVar2 = cVar.Z;
                if (slsVar2 != null) {
                    slsVar2.invoke();
                }
                return zy11Var;
        }
    }
}
