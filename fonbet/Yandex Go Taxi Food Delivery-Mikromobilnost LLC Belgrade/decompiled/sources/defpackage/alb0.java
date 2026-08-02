package defpackage;

import android.graphics.Typeface;
import android.view.View;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.compose.spinner.SpinnerState;
import com.yandex.go.masstransit.sdk.order.impl.tickets.g;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.pickup_from_photo.navigation.d;
import com.yandex.go.rida.bids.router.e;
import com.yandex.go.user_profile.ui.am.u;
import com.yandex.go.zone.model.Zone;
import com.yandex.quark.webchat.filechooser.FileChooserDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.favorites.address.impl.b;
import ru.yandex.taxi.logistics.sdk.photocomments.data.PhotoModel$Type;
import ru.yandex.taxi.masstransit.tickets.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.notification.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class alb0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ alb0(yfd yfdVar, b bVar) {
        this.a = 9;
        this.b = yfdVar;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g gVar = (g) this.b;
        xfd xfdVar = (xfd) obj;
        m940 m940Var = (m940) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(m940Var) ? 32 : 16;
        }
        int i2 = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            c cVar = gVar.L;
            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
            boolean e = btsVar.e(gVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new a840(gVar, i2);
                btsVar.o0(Q);
            }
            lpb1.a(m940Var, cVar, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) Q, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ut40 ut40Var = (ut40) this.b;
        xfd xfdVar = (xfd) obj;
        eu40 eu40Var = (eu40) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((bts) fidVar).k(eu40Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(i & 1, (i & 147) != 146)) {
            btsVar.Y();
        } else if (eu40Var instanceof du40) {
            btsVar.e0(-1593954370);
            btsVar.t(false);
            ut40Var.r(new qu(9));
        } else {
            if (!(eu40Var instanceof cu40)) {
                throw unr0.y(-1593956337, btsVar, false);
            }
            btsVar.e0(-1593952284);
            jm91.b((cu40) eu40Var, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        com.yandex.go.pickup_from_photo.navigation.b bVar = (com.yandex.go.pickup_from_photo.navigation.b) this.b;
        xfd xfdVar = (xfd) obj;
        yxb yxbVar = (yxb) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(yxbVar) : fidVar.e(yxbVar) ? 32 : 16;
        }
        int i2 = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            bVar.Q.a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
            boolean e = btsVar.e(bVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new enb0(bVar, i2);
                btsVar.o0(Q);
            }
            gmb1.a(yxbVar, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) Q, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        d dVar = (d) this.b;
        xfd xfdVar = (xfd) obj;
        shi0 shi0Var = (shi0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(shi0Var) : fidVar.e(shi0Var) ? 32 : 16;
        }
        int i2 = 1;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
            boolean e = btsVar.e(dVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new uhi0(dVar, i2);
                btsVar.o0(Q);
            }
            wha1.b(shi0Var, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) Q, btsVar, ((i >> 3) & 14) | 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        t tVar = (t) this.b;
        r2l0 r2l0Var = (r2l0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(r2l0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            boolean e = btsVar.e(tVar);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new iik0(8, tVar);
                btsVar.o0(Q);
            }
            xsa1.a(r2l0Var, (sls) Q, btsVar, (intValue >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        com.yandex.go.scooters.parking.b bVar = (com.yandex.go.scooters.parking.b) this.b;
        xfd xfdVar = (xfd) obj;
        eco0 eco0Var = (eco0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(eco0Var) : fidVar.e(eco0Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            com.yandex.go.scooters.parking.d.f(eco0Var, bVar.H, ((bgd) xfdVar).a, btsVar, (i >> 3) & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        a aVar = (a) this.b;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & HProv.PP_SECURITY_LEVEL) != 128)) {
            vza1.b(((avj0) aVar.G).h(kyh0.scooters_mobility_hub_scooter_rerouting_notification), btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        dkq0 dkq0Var;
        long a;
        i iVar = (i) this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        rzx rzxVar = (rzx) obj2;
        wu60 wu60Var = (wu60) obj3;
        dkq0 dkq0Var2 = (dkq0) obj4;
        long e = rzxVar.e();
        float f = (int) (e >> 32);
        float f2 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long j = wu60Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (0.0f <= intBitsToFloat && intBitsToFloat <= f) {
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            if (0.0f <= intBitsToFloat2 && intBitsToFloat2 <= f2) {
                z = true;
                long j2 = wu60Var.a;
                if (z) {
                    dkq0Var = dkq0Var2;
                    int i = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i) < 0.0f) {
                        f = 0.0f;
                    } else if (Float.intBitsToFloat(i) <= f) {
                        f = Float.intBitsToFloat(i);
                    }
                    int i2 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    if (Float.intBitsToFloat(i2) < 0.0f) {
                        f2 = 0.0f;
                    } else if (Float.intBitsToFloat(i2) <= f2) {
                        f2 = Float.intBitsToFloat(i2);
                    }
                    j2 = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                } else {
                    dkq0Var = dkq0Var2;
                }
                a = iVar.a(rzxVar, j2);
                if ((9223372034707292159L & a) != 9205357640488583168L) {
                    iVar.l(booleanValue);
                    iVar.t = null;
                    iVar.n(a, 9205357640488583168L, false, dkq0Var);
                    yur.b(iVar.h);
                    iVar.x = false;
                    iVar.o();
                    iVar.u = true;
                }
                return zy11.a;
            }
        }
        z = false;
        long j22 = wu60Var.a;
        if (z) {
        }
        a = iVar.a(rzxVar, j22);
        if ((9223372034707292159L & a) != 9205357640488583168L) {
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        jps0 jps0Var = (jps0) this.b;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ((Integer) obj4).getClass();
        v4v v4vVar = jps0Var.a;
        v4v v4vVar2 = jps0Var.b;
        bts btsVar = (bts) ((fid) obj3);
        boolean k = btsVar.k(v4vVar);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            v4v v4vVar3 = jps0Var.a;
            Q = v4vVar3 == null ? new cuj0(wzg0.ic_right, null, null, null, 30) : v4vVar3;
            btsVar.o0(Q);
        }
        v4v v4vVar4 = (v4v) Q;
        boolean k2 = btsVar.k(v4vVar2);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            if (v4vVar2 == null) {
                v4vVar2 = new cuj0(wzg0.ic_checkmark, null, null, null, 30);
            }
            btsVar.o0(v4vVar2);
            Q2 = v4vVar2;
        }
        s3b1.f(booleanValue ? (v4v) Q2 : v4vVar4, ljs0.m(c530.a, 32.0f), null, btsVar, 48, 4);
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        SpinnerSize spinnerSize = (SpinnerSize) this.b;
        SpinnerState spinnerState = (SpinnerState) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= fidVar.c(spinnerState.ordinal()) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            int i = xpt0.a[spinnerState.ordinal()];
            if (i == 1) {
                btsVar.e0(-1029360535);
                ffb1.c(spinnerSize, null, null, null, btsVar, 0, 14);
                btsVar.t(false);
            } else if (i == 2) {
                btsVar.e0(-1029359002);
                ffb1.a(spinnerSize, null, null, btsVar, 0);
                btsVar.t(false);
            } else {
                if (i != 3) {
                    throw unr0.y(-1029361863, btsVar, false);
                }
                btsVar.e0(-1029357529);
                ffb1.b(spinnerSize, null, null, btsVar, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        vcx0 vcx0Var = (vcx0) this.b;
        String str = (String) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(str) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            boolean z = vcx0Var.b;
            PlusNewType plusNewType = z ? PlusNewType.Gradient : PlusNewType.Disabled;
            o6d0.a(str, an91.o(cj6.a.a(c530.a, x4c.w), 0.0f, 2.5f, 0.0f, 0.0f, 13), BadgeSize.S, z ? o6d0.a : ucx0.a, plusNewType, false, btsVar, ((intValue >> 3) & 14) | 384, 32);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) this.b;
        qm4 qm4Var = (qm4) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= (intValue & 64) == 0 ? ((bts) fidVar).k(qm4Var) : fidVar.e(qm4Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            btsVar.Y();
        } else {
            if (!(qm4Var instanceof qm4)) {
                throw unr0.y(2004395152, btsVar, false);
            }
            btsVar.e0(2006924570);
            boolean k = btsVar.k(str);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = str + "cashback";
                btsVar.o0(Q);
            }
            com.yandex.go.summary.ui.compose.common.tooltip.a.a((String) Q, qm4Var.d, null, wwg.S(733062381, true, new w7o0(29, qm4Var), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(false);
        }
        return zy11.a;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        pa90 e;
        zy11 zy11Var;
        c530 c530Var;
        float f;
        zy11 onCreate$lambda$3;
        h840 h840Var;
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var2 = c530.a;
        o430 o430Var = did.a;
        int i2 = 8;
        zy11 zy11Var2 = zy11.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                fid fidVar = (fid) obj3;
                ((Integer) obj4).getClass();
                mhb0 mhb0Var = (mhb0) ((ArrayList) obj5).get(intValue);
                k3r k3rVar = ljs0.c;
                PhotoModel$Type photoModel$Type = mhb0Var.c;
                String str = mhb0Var.a;
                int i3 = clb0.a[photoModel$Type.ordinal()];
                if (i3 == 1) {
                    bts btsVar = (bts) fidVar;
                    btsVar.e0(986486670);
                    e = coil.compose.b.e(str, btsVar, 0);
                    btsVar.t(false);
                } else {
                    if (i3 != 2) {
                        throw unr0.y(986484997, (bts) fidVar, false);
                    }
                    bts btsVar2 = (bts) fidVar;
                    btsVar2.e0(986489238);
                    e = ua3.b(str, mt71.m(t0h0.photocomment_placeholder, 0, btsVar2), null, btsVar2, 10);
                    btsVar2.t(false);
                }
                o4b1.b(e, mhb0Var.b, k3rVar, null, mhe.b, 0.0f, null, fidVar, 24960, 104);
                return zy11Var2;
            case 1:
                u uVar = (u) obj5;
                xfd xfdVar = (xfd) obj;
                f12 f12Var = (f12) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                int i4 = (intValue2 & 6) == 0 ? intValue2 | ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar) : fidVar2.e(xfdVar) ? 4 : 2) : intValue2;
                if ((intValue2 & 48) == 0) {
                    i4 |= ((bts) fidVar2).k(f12Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(i4 & 1, (i4 & 147) != 146)) {
                    uVar.d(f12Var, ((bgd) xfdVar).a, btsVar3, ((i4 >> 3) & 14) | 512);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 2:
                ib2 ib2Var = (ib2) obj5;
                rp11 b = ((gyr) ib2Var.x).b((eyr) obj, (lzr) obj2, ((hzr) obj3).a, ((izr) obj4).a);
                if (b instanceof qp11) {
                    return (Typeface) ((qp11) b).a;
                }
                cjw0 cjw0Var = new cjw0(b, ib2Var.C);
                ib2Var.C = cjw0Var;
                return (Typeface) cjw0Var.c;
            case 3:
                e eVar = (e) obj5;
                xfd xfdVar2 = (xfd) obj;
                as5 as5Var = (as5) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                int i5 = (intValue3 & 6) == 0 ? intValue3 | ((intValue3 & 8) == 0 ? ((bts) fidVar3).k(xfdVar2) : fidVar3.e(xfdVar2) ? 4 : 2) : intValue3;
                if ((intValue3 & 48) == 0) {
                    i5 |= ((bts) fidVar3).k(as5Var) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(i5 & 1, (i5 & 147) != 146)) {
                    fva0 a = f4z.a();
                    View view = (View) btsVar4.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar4.k(view);
                    Object Q = btsVar4.Q();
                    Object obj6 = Q;
                    if (k || Q == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        xva0 xva0Var = (xva0) tag;
                        btsVar4.o0(xva0Var);
                        obj6 = xva0Var;
                    }
                    xva0 xva0Var2 = (xva0) obj6;
                    Object Q2 = btsVar4.Q();
                    if (Q2 == o430Var) {
                        fva0.f(a, "RidaBids", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var2.a;
                        if (yuf0Var != null) {
                            yuf0Var.I("RidaBids");
                            zy11Var = zy11Var2;
                        } else {
                            zy11Var = null;
                        }
                        btsVar4.o0(zy11Var);
                        Q2 = zy11Var;
                    }
                    com.yandex.go.rida.bids.ui.c.d(as5Var, eVar.K.b, ((bgd) xfdVar2).a, btsVar4, (i5 >> 3) & 14);
                    boolean z = (i5 & 14) == 4 || ((i5 & 8) != 0 && btsVar4.e(xfdVar2));
                    Object Q3 = btsVar4.Q();
                    Object obj7 = Q3;
                    if (z || Q3 == o430Var) {
                        zq5 zq5Var = new zq5(xfdVar2, r11 ? 1 : 0);
                        btsVar4.o0(zq5Var);
                        obj7 = zq5Var;
                    }
                    gya1.d(false, (sls) obj7, btsVar4, 0, 1);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 4:
                wp2 wp2Var = (wp2) obj5;
                ibp0 ibp0Var = (ibp0) obj;
                InputState inputState = (InputState) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                int i6 = (intValue4 & 6) == 0 ? intValue4 | (((bts) fidVar4).k(ibp0Var) ? 4 : 2) : intValue4;
                if ((intValue4 & 48) == 0) {
                    i6 |= fidVar4.c(inputState.ordinal()) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(i6 & 1, (i6 & 147) != 146)) {
                    boolean e2 = k7b1.e(inputState);
                    c530 c530Var3 = c530.a;
                    if (e2) {
                        btsVar5.e0(492956956);
                        zrb1.a(ibp0Var, tea1.f(), c530Var3, wp2Var, btsVar5, i6 & 14, 4);
                        btsVar5.t(false);
                    } else {
                        btsVar5.e0(493009842);
                        nnm.s(c530Var3, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar5, false);
                    }
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 5:
                iga igaVar = (iga) obj5;
                j690 j690Var = (j690) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= ((bts) fidVar5).k(j690Var) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar5;
                if (btsVar6.V(intValue5 & 1, (intValue5 & 145) != 144)) {
                    f530 u = pw91.u(an91.j(ljs0.c(c530Var2, 1.0f), j690Var), pw91.o(btsVar6), 14);
                    sic a2 = qic.a(g43Var, x4c.G, btsVar6, 0);
                    int hashCode = Long.hashCode(btsVar6.T);
                    r1b0 o = btsVar6.o();
                    f530 d = androidx.compose.ui.b.d(btsVar6, u);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar6, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar6, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar6, androidx.compose.ui.node.d.h);
                    qje.W(btsVar6, androidx.compose.ui.node.d.d, d);
                    f530 n = an91.n(ljs0.c(c530Var2, 1.0f), 16.0f, 20.0f, 16.0f, 16.0f);
                    CharSequence charSequence = igaVar.a;
                    List list = igaVar.b;
                    qgy.b(charSequence, null, n, null, 0L, 0L, null, 0L, 2, 2, 0, xya1.b(btsVar6).e, null, btsVar6, 805306752, 6, 10746);
                    if (list.isEmpty()) {
                        btsVar6.e0(1875693078);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(1875571031);
                        qib1.a(list, btsVar6, 8);
                        ly3.B(c530Var2, 16.0f, btsVar6, false);
                    }
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 6:
                com.yandex.go.masstransit.sdk.checkout.impl.checkout.a aVar = (com.yandex.go.masstransit.sdk.checkout.impl.checkout.a) obj5;
                xfd xfdVar3 = (xfd) obj;
                xnb xnbVar = (xnb) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                int i7 = (intValue6 & 6) == 0 ? intValue6 | ((intValue6 & 8) == 0 ? ((bts) fidVar6).k(xfdVar3) : fidVar6.e(xfdVar3) ? 4 : 2) : intValue6;
                if ((intValue6 & 48) == 0) {
                    i7 |= (intValue6 & 64) == 0 ? ((bts) fidVar6).k(xnbVar) : fidVar6.e(xnbVar) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(i7 & 1, (i7 & 147) != 146)) {
                    boolean e3 = btsVar7.e(aVar);
                    Object Q4 = btsVar7.Q();
                    if (e3 || Q4 == o430Var) {
                        Q4 = new l7b(10, aVar);
                        btsVar7.o0(Q4);
                    }
                    m5b1.d((sls) Q4, wwg.S(-1543199661, true, new j9a(i2, aVar, xnbVar, xfdVar3), btsVar7), btsVar7, 392);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 7:
                bzd bzdVar = (bzd) obj5;
                j690 j690Var2 = (j690) obj2;
                fid fidVar7 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((bts) fidVar7).k(j690Var2) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(intValue7 & 1, (intValue7 & 145) != 144)) {
                    f530 o2 = an91.o(an91.j(c530Var2, j690Var2), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar8, 0);
                    int hashCode2 = Long.hashCode(btsVar8.T);
                    r1b0 o3 = btsVar8.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar8, o2);
                    ohd.G1.getClass();
                    sls slsVar2 = androidx.compose.ui.node.d.b;
                    if (btsVar8.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar2);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, androidx.compose.ui.node.d.f, a3);
                    qje.W(btsVar8, androidx.compose.ui.node.d.e, o3);
                    qje.W(btsVar8, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar8, androidx.compose.ui.node.d.h);
                    qje.W(btsVar8, androidx.compose.ui.node.d.d, d2);
                    bzdVar.getClass();
                    btsVar8.e0(1159788467);
                    btsVar8.t(false);
                    spb1.d(bzdVar.a, btsVar8, 0);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 8:
                yte yteVar = (yte) obj5;
                j690 j690Var3 = (j690) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                so5 so5Var = x4c.G;
                if ((intValue8 & 48) == 0) {
                    intValue8 |= ((bts) fidVar8).k(j690Var3) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar8;
                boolean V = btsVar9.V(intValue8 & 1, (intValue8 & 145) != 144);
                dmw0 dmw0Var = btsVar9.a;
                if (V) {
                    c530 c530Var4 = c530.a;
                    f530 u2 = pw91.u(ljs0.c(an91.m(an91.j(c530Var4, j690Var3), 16.0f, 0.0f, 2), 1.0f), pw91.o(btsVar9), 14);
                    sic a4 = qic.a(g43Var, so5Var, btsVar9, 0);
                    int hashCode3 = Long.hashCode(btsVar9.T);
                    r1b0 o4 = btsVar9.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar9, u2);
                    ohd.G1.getClass();
                    sls slsVar3 = androidx.compose.ui.node.d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar3);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, androidx.compose.ui.node.d.f, a4);
                    qje.W(btsVar9, androidx.compose.ui.node.d.e, o4);
                    qje.W(btsVar9, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar9, androidx.compose.ui.node.d.h);
                    qje.W(btsVar9, androidx.compose.ui.node.d.d, d3);
                    String str2 = yteVar.a;
                    String str3 = yteVar.d;
                    List<CharSequence> list2 = yteVar.c;
                    String str4 = yteVar.b;
                    if (str2 == null) {
                        btsVar9.e0(-373717337);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-373717336);
                        jeb1.f(str2, an91.o(c530Var4, 0.0f, 20.0f, 0.0f, 0.0f, 13), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).e.d, btsVar9, 48, 0, 16380);
                        btsVar9.t(false);
                    }
                    boolean k2 = btsVar9.k(str4) | btsVar9.k(list2) | btsVar9.k(str3);
                    Object Q5 = btsVar9.Q();
                    Object obj8 = Q5;
                    if (k2 || Q5 == o430Var) {
                        Iterator it = list2.iterator();
                        if (!it.hasNext()) {
                            w511.x("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it.next();
                        while (it.hasNext()) {
                            CharSequence charSequence2 = (CharSequence) it.next();
                            StringBuilder sb = new StringBuilder();
                            sb.append(next);
                            sb.append(" ");
                            sb.append((Object) charSequence2);
                            next = sb.toString();
                        }
                        String str5 = str4 + " " + next + " " + str3;
                        btsVar9.o0(str5);
                        obj8 = str5;
                    }
                    String str6 = (String) obj8;
                    boolean k3 = btsVar9.k(str6);
                    Object Q6 = btsVar9.Q();
                    Object obj9 = Q6;
                    if (k3 || Q6 == o430Var) {
                        wwb wwbVar = new wwb(str6, r13);
                        btsVar9.o0(wwbVar);
                        obj9 = wwbVar;
                    }
                    f530 a5 = fnq0.a(c530Var4, (tls) obj9);
                    sic a6 = qic.a(g43Var, so5Var, btsVar9, 0);
                    int hashCode4 = Long.hashCode(btsVar9.T);
                    r1b0 o5 = btsVar9.o();
                    f530 d4 = androidx.compose.ui.b.d(btsVar9, a5);
                    ohd.G1.getClass();
                    sls slsVar4 = androidx.compose.ui.node.d.b;
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar4);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, androidx.compose.ui.node.d.f, a6);
                    qje.W(btsVar9, androidx.compose.ui.node.d.e, o5);
                    qje.W(btsVar9, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar9, androidx.compose.ui.node.d.h);
                    qje.W(btsVar9, androidx.compose.ui.node.d.d, d4);
                    if (str4 == null) {
                        btsVar9.e0(-195913392);
                        btsVar9.t(false);
                        c530Var = c530Var4;
                        f = 16.0f;
                    } else {
                        btsVar9.e0(-195913391);
                        c530Var = c530Var4;
                        f = 16.0f;
                        jeb1.f(str4, ljs0.c(an91.o(c530Var4, 0.0f, 16.0f, 0.0f, 12.0f, 5), 1.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).g.a, btsVar9, 48, 0, 16380);
                        btsVar9.t(false);
                    }
                    btsVar9.e0(-144857614);
                    for (CharSequence charSequence3 : list2) {
                        c530 c530Var5 = c530Var;
                        f530 o6 = an91.o(c530Var5, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                        lhl0 a7 = khl0.a(lr20.a, x4c.D, btsVar9, 0);
                        int hashCode5 = Long.hashCode(btsVar9.T);
                        r1b0 o7 = btsVar9.o();
                        f530 d5 = androidx.compose.ui.b.d(btsVar9, o6);
                        ohd.G1.getClass();
                        sls slsVar5 = androidx.compose.ui.node.d.b;
                        btsVar9.i0();
                        if (btsVar9.S) {
                            btsVar9.n(slsVar5);
                        } else {
                            btsVar9.r0();
                        }
                        qje.W(btsVar9, androidx.compose.ui.node.d.f, a7);
                        qje.W(btsVar9, androidx.compose.ui.node.d.e, o7);
                        qje.W(btsVar9, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode5));
                        qje.M(btsVar9, androidx.compose.ui.node.d.h);
                        qje.W(btsVar9, androidx.compose.ui.node.d.d, d5);
                        btsVar9.e0(315343776);
                        jeb1.f("• ", null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).g.a, btsVar9, 0, 0, 16382);
                        btsVar9.t(false);
                        qgy.b(charSequence3, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar9).g.a, null, btsVar9, 0, 0, 12286);
                        btsVar9.t(true);
                        c530Var = c530Var5;
                    }
                    c530 c530Var6 = c530Var;
                    btsVar9.t(false);
                    if (str3 == null) {
                        btsVar9.e0(-195093070);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-195093069);
                        jeb1.f(str3, an91.o(c530Var6, 0.0f, 12.0f, 0.0f, f, 5), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar9).g.a, btsVar9, 48, 0, 16380);
                        btsVar9.t(false);
                    }
                    btsVar9.t(true);
                    btsVar9.t(true);
                } else {
                    btsVar9.Y();
                }
                return zy11Var2;
            case 9:
                yfd yfdVar = (yfd) obj5;
                xfd xfdVar4 = (xfd) obj;
                uep uepVar = (uep) obj2;
                fid fidVar9 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                int i8 = (intValue9 & 6) == 0 ? intValue9 | ((intValue9 & 8) == 0 ? ((bts) fidVar9).k(xfdVar4) : fidVar9.e(xfdVar4) ? 4 : 2) : intValue9;
                if ((intValue9 & 48) == 0) {
                    i8 |= ((bts) fidVar9).k(uepVar) ? 32 : 16;
                }
                bts btsVar10 = (bts) fidVar9;
                if (btsVar10.V(i8 & 1, (i8 & 147) != 146)) {
                    xj50 xj50Var = uepVar.i;
                    if (xj50Var != null) {
                        btsVar10.e0(-2009969547);
                        mka1.a(((ydp) ((agd) yfdVar).a).c, xj50Var, ((bgd) xfdVar4).a, btsVar10, 0);
                        btsVar10.t(false);
                    } else {
                        ydp ydpVar = (ydp) ((agd) yfdVar).a;
                        if (uepVar.e.getDatumType() == FavoriteAddressDatumType.GEO_POINT && ydpVar.b) {
                            btsVar10.e0(-2009965816);
                            ru.yandex.taxi.favorites.address.impl.ui.a.d(((ydp) ((agd) yfdVar).a).c, uepVar, ((bgd) xfdVar4).a, btsVar10, i8 & 112);
                            btsVar10.t(false);
                        } else {
                            btsVar10.e0(-2009963409);
                            ika1.a(uepVar, btsVar10, (i8 >> 3) & 14);
                            btsVar10.t(false);
                        }
                    }
                } else {
                    btsVar10.Y();
                }
                return zy11Var2;
            case 10:
                onCreate$lambda$3 = FileChooserDialog.onCreate$lambda$3((FileChooserDialog) obj5, (View) obj, (n751) obj2, (u1w) obj3, (u1w) obj4);
                return onCreate$lambda$3;
            case 11:
                zls zlsVar = (zls) obj5;
                u4y u4yVar = (u4y) obj;
                ((Integer) obj2).intValue();
                fid fidVar10 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar10).k(u4yVar) ? 4 : 2;
                }
                bts btsVar11 = (bts) fidVar10;
                if (btsVar11.V(intValue10 & 1, (intValue10 & HProv.PP_FAST_CODE) != 130)) {
                    zlsVar.invoke(u4yVar, btsVar11, Integer.valueOf(intValue10 & 14));
                } else {
                    btsVar11.Y();
                }
                return zy11Var2;
            case 12:
                ohy ohyVar = (ohy) obj5;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar11 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((bts) fidVar11).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar12 = (bts) fidVar11;
                if (btsVar12.V(intValue11 & 1, (intValue11 & HProv.PP_FAST_CODE) != 130)) {
                    float f2 = ohyVar.a;
                    if (Float.isNaN(f2)) {
                        f2 = deb1.a(ibp0Var2.c());
                    }
                    oeb1.c(btsVar12, ljs0.q(c530Var2, f2));
                } else {
                    btsVar12.Y();
                }
                return zy11Var2;
            case 13:
                final t tVar = (t) obj5;
                fid fidVar12 = (fid) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                bts btsVar13 = (bts) fidVar12;
                if (btsVar13.V(intValue12 & 1, (intValue12 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    boolean e4 = btsVar13.e(tVar);
                    Object Q7 = btsVar13.Q();
                    if (e4 || Q7 == o430Var) {
                        final int i9 = r11 ? 1 : 0;
                        Q7 = new sls() { // from class: id30
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i10 = i9;
                                zy11 zy11Var3 = zy11.a;
                                t tVar2 = tVar;
                                switch (i10) {
                                    case 0:
                                        tVar2.r(new ps20(24));
                                        break;
                                    default:
                                        tVar2.r(new ps20(23));
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        btsVar13.o0(Q7);
                    }
                    sls slsVar6 = (sls) Q7;
                    boolean e5 = btsVar13.e(tVar);
                    Object Q8 = btsVar13.Q();
                    if (e5 || Q8 == o430Var) {
                        final int i10 = r15 ? 1 : 0;
                        Q8 = new sls() { // from class: id30
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i102 = i10;
                                zy11 zy11Var3 = zy11.a;
                                t tVar2 = tVar;
                                switch (i102) {
                                    case 0:
                                        tVar2.r(new ps20(24));
                                        break;
                                    default:
                                        tVar2.r(new ps20(23));
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        btsVar13.o0(Q8);
                    }
                    kob1.a(slsVar6, (sls) Q8, btsVar13, 0);
                } else {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 14:
                ((ru.yandex.taxi.masstransit.geopayment.modal.e) obj5).J.invoke((nl30) obj2, ((bgd) ((xfd) obj)).a, (fid) obj3, Integer.valueOf((((Integer) obj4).intValue() >> 3) & 14));
                return zy11Var2;
            case 15:
                t130 t130Var = (t130) obj5;
                xfd xfdVar5 = (xfd) obj;
                u540 u540Var = (u540) obj2;
                fid fidVar13 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                int i11 = (intValue13 & 6) == 0 ? intValue13 | ((intValue13 & 8) == 0 ? ((bts) fidVar13).k(xfdVar5) : fidVar13.e(xfdVar5) ? 4 : 2) : intValue13;
                if ((intValue13 & 48) == 0) {
                    i11 |= (intValue13 & 64) == 0 ? ((bts) fidVar13).k(u540Var) : fidVar13.e(u540Var) ? 32 : 16;
                }
                bts btsVar14 = (bts) fidVar13;
                if (btsVar14.V(i11 & 1, (i11 & 147) != 146)) {
                    ru.yandex.taxi.masstransit.ui.schedule.a.a(u540Var, null, ((bgd) xfdVar5).a, t130Var, btsVar14, (i11 >> 3) & 14);
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 16:
                return b(obj, obj2, obj3, obj4);
            case 17:
                ru.yandex.taxi.masstransit.trains.checkout.i iVar = (ru.yandex.taxi.masstransit.trains.checkout.i) obj5;
                xfd xfdVar6 = (xfd) obj;
                xd40 xd40Var = (xd40) obj2;
                fid fidVar14 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                int i12 = (intValue14 & 6) == 0 ? intValue14 | ((intValue14 & 8) == 0 ? ((bts) fidVar14).k(xfdVar6) : fidVar14.e(xfdVar6) ? 4 : 2) : intValue14;
                if ((intValue14 & 48) == 0) {
                    i12 |= ((bts) fidVar14).k(xd40Var) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar14;
                if (btsVar15.V(i12 & 1, (i12 & 147) != 146)) {
                    ed40.k(xd40Var, iVar.W, ((bgd) xfdVar6).a, btsVar15, (i12 >> 3) & 14);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
            case 18:
                return d(obj, obj2, obj3, obj4);
            case 19:
                return e(obj, obj2, obj3, obj4);
            case 20:
                return f(obj, obj2, obj3, obj4);
            case 21:
                return g(obj, obj2, obj3, obj4);
            case 22:
                return i(obj, obj2, obj3, obj4);
            case 23:
                return j(obj, obj2, obj3, obj4);
            case 24:
                return k(obj, obj2, obj3, obj4);
            case 25:
                return l(obj, obj2, obj3, obj4);
            case 26:
                return m(obj, obj2, obj3, obj4);
            case 27:
                return n(obj, obj2, obj3, obj4);
            case 28:
                return o(obj, obj2, obj3, obj4);
            default:
                com.yandex.go.masstransit.sdk.order.impl.activation.b bVar = (com.yandex.go.masstransit.sdk.order.impl.activation.b) obj5;
                xfd xfdVar7 = (xfd) obj;
                v1z0 v1z0Var = (v1z0) obj2;
                fid fidVar15 = (fid) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                int i13 = (intValue15 & 6) == 0 ? intValue15 | ((intValue15 & 8) == 0 ? ((bts) fidVar15).k(xfdVar7) : fidVar15.e(xfdVar7) ? 4 : 2) : intValue15;
                if ((intValue15 & 48) == 0) {
                    i13 |= (intValue15 & 64) == 0 ? ((bts) fidVar15).k(v1z0Var) : fidVar15.e(v1z0Var) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar15;
                if (btsVar16.V(i13 & 1, (i13 & 147) != 146)) {
                    com.yandex.go.masstransit.sdk.order.impl.activation.d dVar = bVar.H;
                    Zone g = ((hhd) dVar.b.a).a.g();
                    com.yandex.go.masstransit.sdk.order.impl.activation.c.k(v1z0Var, ((g == null || (h840Var = (h840) g.z.a(h840.class)) == null) ? false : h840Var.b) && jl40.l(dVar.j, Boolean.TRUE), ((bgd) xfdVar7).a, btsVar16, (i13 >> 3) & 14);
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ alb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
