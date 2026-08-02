package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.h701;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qkg;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zvz0;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.k;

/* loaded from: classes5.dex */
public final /* synthetic */ class e701 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h701 b;

    public /* synthetic */ e701(h701 h701Var, int i) {
        this.a = i;
        this.b = h701Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final h701 h701Var = this.b;
        Object[] objArr = 0;
        int i2 = 2;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1189721978, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                h701 h701Var2 = h701.this;
                                String str = h701Var2.A;
                                yt0 yt0Var = new yt0((j2m0) btsVar2.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), h701Var2.b, 25);
                                rs31 a = f5z.a(btsVar2);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                k kVar = (k) ooc.G(qoi0.a(k.class), a, str, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
                                oz40 b = f.b(kVar.N, btsVar2);
                                oz40 b2 = f.b(kVar.O, btsVar2);
                                oz40 b3 = f.b(kVar.P, btsVar2);
                                qkg qkgVar = (qkg) b.getValue();
                                qkg qkgVar2 = (qkg) b2.getValue();
                                zvz0 zvz0Var = (zvz0) b3.getValue();
                                Object Q = btsVar2.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    TrackingRoot$getView$1$1$1$1$1$1$1 trackingRoot$getView$1$1$1$1$1$1$1 = new TrackingRoot$getView$1$1$1$1$1$1$1(1, kVar, k.class, "onTopAccentBarClicked", "onTopAccentBarClicked(Lcom/yandex/delivery/mapper/model/Action;)V", 0);
                                    btsVar2.o0(trackingRoot$getView$1$1$1$1$1$1$1);
                                    Q = trackingRoot$getView$1$1$1$1$1$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                Object Q2 = btsVar2.Q();
                                if (Q2 == o430Var) {
                                    TrackingRoot$getView$1$1$1$1$1$2$1 trackingRoot$getView$1$1$1$1$1$2$1 = new TrackingRoot$getView$1$1$1$1$1$2$1(1, kVar, k.class, "onTopAccentBarShown", "onTopAccentBarShown(Ljava/lang/String;)V", 0);
                                    btsVar2.o0(trackingRoot$getView$1$1$1$1$1$2$1);
                                    Q2 = trackingRoot$getView$1$1$1$1$1$2$1;
                                }
                                h701Var2.a(qkgVar, qkgVar2, zvz0Var, tlsVar, (tls) ((tfx) Q2), btsVar2, 27648);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 6);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    h701Var.w.c(new Permission[]{Permission.CALL, Permission.LOCATION}, btsVar2, 0);
                    sb2.c(new vvf0[]{nnm.f(h701Var.x, btsVar2, qti.e), ua3.a.a(h701Var.z)}, wwg.S(1267618828, true, new e701(h701Var, i2), btsVar2), btsVar2, 56);
                    h701Var.y.a(btsVar2, 0);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    qti.a(h701Var.x, wwg.S(-1750878397, true, new e701(h701Var, objArr == true ? 1 : 0), btsVar3), btsVar3, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
