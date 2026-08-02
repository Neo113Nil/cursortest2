package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bts;
import defpackage.dha1;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.kwo;
import defpackage.lwo;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pd5;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w511;
import defpackage.w8f;
import defpackage.yt0;
import defpackage.zvo;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class iwo implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwo b;

    public /* synthetic */ iwo(kwo kwoVar, int i) {
        this.a = i;
        this.b = kwoVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final kwo kwoVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hwy0 hwy0Var = kwoVar.c;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.c(hwy0Var.c(btsVar), hwy0Var.a, false, wwg.S(293099454, true, new iwo(kwoVar, i2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 4);
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
                    xi91.a(wwg.S(-597546059, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            pd5 pd5Var;
                            c cVar = kwo.this.b;
                            fid fidVar3 = (fid) obj3;
                            int intValue3 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String obj5 = cVar.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), cVar, 14);
                                rs31 a = f5z.a(btsVar3);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                c cVar2 = (c) ooc.G(qoi0.a(c.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                                oz40 b = f.b(cVar2.D, btsVar3);
                                lwo lwoVar = (lwo) b.getValue();
                                zvo zvoVar = lwoVar != null ? lwoVar.a : null;
                                if (zvoVar instanceof zvo) {
                                    pd5Var = zvoVar.a;
                                } else {
                                    if (zvoVar != null) {
                                        w511.b();
                                        return null;
                                    }
                                    pd5Var = null;
                                }
                                oz40 b2 = f.b(cVar2.F, btsVar3);
                                lwo lwoVar2 = (lwo) b.getValue();
                                List list = lwoVar2 != null ? lwoVar2.b : null;
                                boolean booleanValue = ((Boolean) b2.getValue()).booleanValue();
                                boolean e = btsVar3.e(cVar2);
                                Object Q = btsVar3.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    ExtendExpirationDateScreen$getView$1$1$1$1$1$1 extendExpirationDateScreen$getView$1$1$1$1$1$1 = new ExtendExpirationDateScreen$getView$1$1$1$1$1$1(1, cVar2, c.class, "onConfirmButtonClick", "onConfirmButtonClick(Ljava/lang/String;)V", 0);
                                    btsVar3.o0(extendExpirationDateScreen$getView$1$1$1$1$1$1);
                                    Q = extendExpirationDateScreen$getView$1$1$1$1$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                boolean e2 = btsVar3.e(cVar2);
                                Object Q2 = btsVar3.Q();
                                if (e2 || Q2 == o430Var) {
                                    ExtendExpirationDateScreen$getView$1$1$1$1$2$1 extendExpirationDateScreen$getView$1$1$1$1$2$1 = new ExtendExpirationDateScreen$getView$1$1$1$1$2$1(0, cVar2, c.class, "onDismissButtonClick", "onDismissButtonClick()V", 0);
                                    btsVar3.o0(extendExpirationDateScreen$getView$1$1$1$1$2$1);
                                    Q2 = extendExpirationDateScreen$getView$1$1$1$1$2$1;
                                }
                                sls slsVar = (sls) ((tfx) Q2);
                                boolean e3 = btsVar3.e(cVar2);
                                Object Q3 = btsVar3.Q();
                                if (e3 || Q3 == o430Var) {
                                    ExtendExpirationDateScreen$getView$1$1$1$1$3$1 extendExpirationDateScreen$getView$1$1$1$1$3$1 = new ExtendExpirationDateScreen$getView$1$1$1$1$3$1(0, cVar2, c.class, "onShown", "onShown()V", 0);
                                    btsVar3.o0(extendExpirationDateScreen$getView$1$1$1$1$3$1);
                                    Q3 = extendExpirationDateScreen$getView$1$1$1$1$3$1;
                                }
                                sls slsVar2 = (sls) ((tfx) Q3);
                                boolean e4 = btsVar3.e(cVar2);
                                Object Q4 = btsVar3.Q();
                                if (e4 || Q4 == o430Var) {
                                    ExtendExpirationDateScreen$getView$1$1$1$1$4$1 extendExpirationDateScreen$getView$1$1$1$1$4$1 = new ExtendExpirationDateScreen$getView$1$1$1$1$4$1(0, cVar2, c.class, "onClosed", "onClosed()V", 0);
                                    btsVar3.o0(extendExpirationDateScreen$getView$1$1$1$1$4$1);
                                    Q4 = extendExpirationDateScreen$getView$1$1$1$1$4$1;
                                }
                                dha1.a(pd5Var, list, booleanValue, tlsVar, slsVar, slsVar2, (sls) ((tfx) Q4), btsVar3, 0);
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
