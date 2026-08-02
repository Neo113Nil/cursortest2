package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.did;
import defpackage.e7o;
import defpackage.f5z;
import defpackage.fid;
import defpackage.g7o;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o9a1;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final /* synthetic */ class d7o implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7o b;

    public /* synthetic */ d7o(e7o e7oVar, int i) {
        this.a = i;
        this.b = e7oVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final e7o e7oVar = this.b;
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
                    sb2.b(ua3.a.a(e7oVar.c), wwg.S(772945987, true, new d7o(e7oVar, i3), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    qti.a(e7oVar.b, wwg.S(-2083752774, true, new d7o(e7oVar, i2), btsVar2), btsVar2, 56);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    xi91.a(wwg.S(1476202033, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.photocomments.dialog.error.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            if (btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                yt0 yt0Var = new yt0((j2m0) btsVar4.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), e7o.this.w, 13);
                                rs31 a = f5z.a(btsVar4);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                g7o g7oVar = (g7o) ooc.G(qoi0.a(g7o.class), a, null, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar4);
                                ArrayList arrayList = g7oVar.w;
                                boolean e = btsVar4.e(g7oVar);
                                Object Q = btsVar4.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    ErrorDialogScreen$getView$1$1$1$1$1$1$1 errorDialogScreen$getView$1$1$1$1$1$1$1 = new ErrorDialogScreen$getView$1$1$1$1$1$1$1(0, g7oVar, g7o.class, "retry", "retry()V", 0);
                                    btsVar4.o0(errorDialogScreen$getView$1$1$1$1$1$1$1);
                                    Q = errorDialogScreen$getView$1$1$1$1$1$1$1;
                                }
                                sls slsVar = (sls) ((tfx) Q);
                                boolean e2 = btsVar4.e(g7oVar);
                                Object Q2 = btsVar4.Q();
                                if (e2 || Q2 == o430Var) {
                                    ErrorDialogScreen$getView$1$1$1$1$1$2$1 errorDialogScreen$getView$1$1$1$1$1$2$1 = new ErrorDialogScreen$getView$1$1$1$1$1$2$1(0, g7oVar, g7o.class, "discard", "discard()V", 0);
                                    btsVar4.o0(errorDialogScreen$getView$1$1$1$1$1$2$1);
                                    Q2 = errorDialogScreen$getView$1$1$1$1$1$2$1;
                                }
                                o9a1.a(arrayList, slsVar, (sls) ((tfx) Q2), btsVar4, 0);
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
