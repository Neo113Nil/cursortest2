package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.geb1;
import defpackage.j2m0;
import defpackage.ldc;
import defpackage.lxo0;
import defpackage.n;
import defpackage.n3z;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pey;
import defpackage.pys0;
import defpackage.q7u;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tys0;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.yys0;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class oys0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pys0 b;
    public final /* synthetic */ ComposeView c;

    public /* synthetic */ oys0(pys0 pys0Var, ComposeView composeView, int i) {
        this.a = i;
        this.b = pys0Var;
        this.c = composeView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final ComposeView composeView = this.c;
        final pys0 pys0Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hwy0 hwy0Var = pys0Var.c;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar), hwy0Var.a, false, wwg.S(-1316035800, true, new oys0(pys0Var, composeView, i2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1256751201, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            pys0 pys0Var2 = pys0.this;
                            yys0 yys0Var = pys0Var2.b;
                            fid fidVar3 = (fid) obj3;
                            int intValue3 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String obj5 = yys0Var.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), yys0Var, 23);
                                rs31 a = f5z.a(btsVar3);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                yys0 yys0Var2 = (yys0) ooc.G(qoi0.a(yys0.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                                oz40 b = f.b(yys0Var2.w, btsVar3);
                                Object Q = btsVar3.Q();
                                ComposeView composeView2 = composeView;
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = n.f(qke.h(composeView2.getContext(), "android.permission.CAMERA") == 0, btsVar3);
                                }
                                oz40 oz40Var = (oz40) Q;
                                pey peyVar = (pey) btsVar3.m(n3z.a);
                                boolean e = btsVar3.e(composeView2) | btsVar3.e(peyVar);
                                Object Q2 = btsVar3.Q();
                                if (e || Q2 == o430Var) {
                                    Q2 = new lxo0(18, peyVar, composeView2, oz40Var);
                                    btsVar3.o0(Q2);
                                }
                                zpn.a(peyVar, (tls) Q2, btsVar3);
                                tys0 tys0Var = (tys0) b.getValue();
                                ldc ldcVar = (ldc) pys0Var2.w.a;
                                boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                                boolean e2 = btsVar3.e(yys0Var2);
                                Object Q3 = btsVar3.Q();
                                if (e2 || Q3 == o430Var) {
                                    SmartCameraScreen$getView$1$1$1$1$2$1 smartCameraScreen$getView$1$1$1$1$2$1 = new SmartCameraScreen$getView$1$1$1$1$2$1(0, yys0Var2, yys0.class, "onOpenSettingsClick", "onOpenSettingsClick()V", 0);
                                    btsVar3.o0(smartCameraScreen$getView$1$1$1$1$2$1);
                                    Q3 = smartCameraScreen$getView$1$1$1$1$2$1;
                                }
                                sls slsVar = (sls) ((tfx) Q3);
                                boolean e3 = btsVar3.e(yys0Var2);
                                Object Q4 = btsVar3.Q();
                                if (e3 || Q4 == o430Var) {
                                    SmartCameraScreen$getView$1$1$1$1$3$1 smartCameraScreen$getView$1$1$1$1$3$1 = new SmartCameraScreen$getView$1$1$1$1$3$1(1, yys0Var2, yys0.class, "onClick", "onClick(Lru/yandex/taxi/logistics/sdk/delivery_screen_smart_camera/impl/data/SmartCameraInnerAction;)V", 0);
                                    btsVar3.o0(smartCameraScreen$getView$1$1$1$1$3$1);
                                    Q4 = smartCameraScreen$getView$1$1$1$1$3$1;
                                }
                                geb1.a(tys0Var, ldcVar, booleanValue, slsVar, (tls) ((tfx) Q4), btsVar3, 0);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 6);
                    break;
                }
        }
        return zy11Var;
    }
}
