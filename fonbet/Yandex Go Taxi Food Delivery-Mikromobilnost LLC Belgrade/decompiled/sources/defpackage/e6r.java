package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.d6r;
import defpackage.did;
import defpackage.f5z;
import defpackage.f6r;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.m2i;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.q4g;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.u5r;
import defpackage.w8f;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class e6r implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4g b;
    public final /* synthetic */ w5r c;
    public final /* synthetic */ q9i w;

    public /* synthetic */ e6r(q4g q4gVar, w5r w5rVar, q9i q9iVar, int i) {
        this.a = i;
        this.b = q4gVar;
        this.c = w5rVar;
        this.w = q9iVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final q9i q9iVar = this.w;
        final w5r w5rVar = this.c;
        final q4g q4gVar = this.b;
        int i2 = 2;
        int i3 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    sb2.c(new vvf0[]{nnm.f((hwy0) q4gVar.c, btsVar, qti.e), ua3.a.a((dci) q4gVar.y)}, wwg.S(-599919718, true, new e6r(q4gVar, w5rVar, q9iVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a((hwy0) q4gVar.c, wwg.S(-2025930877, true, new e6r(q4gVar, w5rVar, q9iVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(502091372, true, new wls() { // from class: com.yandex.delivery.map_filters.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                q4g q4gVar2 = q4g.this;
                                m2i m2iVar = new m2i((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (f6r) q4gVar2.x, w5rVar, q9iVar, 1);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                com.yandex.delivery.map_filters.ui.a aVar = (com.yandex.delivery.map_filters.ui.a) ooc.G(qoi0.a(com.yandex.delivery.map_filters.ui.a.class), a, null, m2iVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                d6r d6rVar = (d6r) f.a(aVar.w, null, null, btsVar4, 48, 2).getValue();
                                if (d6rVar == null) {
                                    btsVar4.e0(-1566410637);
                                    btsVar4.t(false);
                                } else {
                                    btsVar4.e0(-1566410636);
                                    u5r u5rVar = (u5r) q4gVar2.w;
                                    boolean e = btsVar4.e(aVar);
                                    Object Q = btsVar4.Q();
                                    o430 o430Var = did.a;
                                    if (e || Q == o430Var) {
                                        FiltersScreen$getView$1$1$1$1$1$1$1$1 filtersScreen$getView$1$1$1$1$1$1$1$1 = new FiltersScreen$getView$1$1$1$1$1$1$1$1(1, aVar, com.yandex.delivery.map_filters.ui.a.class, "onItemClicked", "onItemClicked(Ljava/util/Map;)V", 0);
                                        btsVar4.o0(filtersScreen$getView$1$1$1$1$1$1$1$1);
                                        Q = filtersScreen$getView$1$1$1$1$1$1$1$1;
                                    }
                                    tls tlsVar = (tls) ((tfx) Q);
                                    boolean e2 = btsVar4.e(aVar);
                                    Object Q2 = btsVar4.Q();
                                    if (e2 || Q2 == o430Var) {
                                        FiltersScreen$getView$1$1$1$1$1$1$2$1 filtersScreen$getView$1$1$1$1$1$1$2$1 = new FiltersScreen$getView$1$1$1$1$1$1$2$1(0, aVar, com.yandex.delivery.map_filters.ui.a.class, "onAcceptButtonClicked", "onAcceptButtonClicked()V", 0);
                                        btsVar4.o0(filtersScreen$getView$1$1$1$1$1$1$2$1);
                                        Q2 = filtersScreen$getView$1$1$1$1$1$1$2$1;
                                    }
                                    u5rVar.a(d6rVar, tlsVar, (sls) ((tfx) Q2), btsVar4, 0);
                                    btsVar4.t(false);
                                }
                            } else {
                                btsVar4.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar3), btsVar3, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
