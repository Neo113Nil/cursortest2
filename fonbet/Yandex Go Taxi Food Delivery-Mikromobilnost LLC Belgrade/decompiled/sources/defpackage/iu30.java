package defpackage;

import android.net.Uri;
import androidx.compose.animation.g;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$EsiaApp2appResultResult;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.d;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

/* loaded from: classes6.dex */
public final /* synthetic */ class iu30 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu30(CharSequence charSequence, Ref$ObjectRef ref$ObjectRef) {
        this.a = 29;
        this.b = charSequence;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r23v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, ve30] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 4;
        int i3 = 8;
        o430 o430Var = did.a;
        int i4 = 2;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b((fu30) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                tls tlsVar = (tls) obj4;
                m3u0 m3u0Var = (m3u0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    int i5 = uv30.a[((MtFloatingButtonState) m3u0Var.getValue()).ordinal()];
                    if (i5 == 1) {
                        btsVar.e0(-1746059537);
                        boolean k = btsVar.k(tlsVar);
                        Object Q = btsVar.Q();
                        if (k || Q == o430Var) {
                            Q = new kiu(25, tlsVar);
                            btsVar.o0(Q);
                        }
                        yob1.c(0, btsVar, (sls) Q, null);
                        btsVar.t(false);
                    } else {
                        if (i5 != 2) {
                            throw unr0.y(220767746, btsVar, false);
                        }
                        btsVar.e0(-1745873444);
                        boolean k2 = btsVar.k(tlsVar);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new kiu(26, tlsVar);
                            btsVar.o0(Q2);
                        }
                        nob1.a(0, btsVar, (sls) Q2, null);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                f440 f440Var = (f440) obj4;
                tls tlsVar2 = (tls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    g.e(f440Var.b.a, null, null, null, null, wwg.S(-1199229965, true, new q140(f440Var, tlsVar2), btsVar2), btsVar2, ImageMetadata.EDGE_MODE, 30);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                g140 g140Var = (g140) obj4;
                tls tlsVar3 = (tls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                ?? r1 = (bts) fidVar3;
                if (r1.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    for (gd30 gd30Var : g140Var.c.a) {
                        boolean z = gd30Var.c;
                        ButtonStyle buttonStyle = gd30Var.f;
                        ButtonSize buttonSize = gd30Var.e;
                        ButtonForm buttonForm = gd30Var.g;
                        boolean k3 = r1.k(tlsVar3) | r1.e(gd30Var);
                        sls Q3 = r1.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new ve30(9, tlsVar3, gd30Var);
                            r1.o0(Q3);
                        }
                        d17.c(null, z, buttonSize, buttonStyle, buttonForm, Q3, wwg.S(542162054, true, new r140(gd30Var, r9 ? 1 : 0), r1), r1, 1572864, 1);
                    }
                } else {
                    r1.Y();
                }
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                bpb1.a((p440) obj4, (f530) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 5:
                k340 k340Var = (k340) obj4;
                tls tlsVar4 = (tls) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar4;
                if (!btsVar3.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar3.Y();
                } else if (k340Var.e == 0.0f) {
                    btsVar3.e0(889451823);
                    btsVar3.t(false);
                } else {
                    btsVar3.e0(889251935);
                    float f = k340Var.e;
                    boolean k4 = btsVar3.k(tlsVar4);
                    Object Q4 = btsVar3.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new s140(i4, tlsVar4);
                        btsVar3.o0(Q4);
                    }
                    vob1.a(f, null, (sls) Q4, btsVar3, 0);
                    btsVar3.t(false);
                }
                return zy11Var;
            case 6:
                u540 u540Var = (u540) obj4;
                tls tlsVar5 = (tls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar5;
                if (!btsVar4.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar4.Y();
                } else if (u540Var.b == 0.0f) {
                    btsVar4.e0(-2117350028);
                    btsVar4.t(false);
                } else {
                    btsVar4.e0(-2117475919);
                    float f2 = u540Var.b;
                    boolean k5 = btsVar4.k(tlsVar5);
                    Object Q5 = btsVar4.Q();
                    if (k5 || Q5 == o430Var) {
                        Q5 = new s140(3, tlsVar5);
                        btsVar4.o0(Q5);
                    }
                    vob1.a(f2, null, (sls) Q5, btsVar4, 0);
                    btsVar4.t(false);
                }
                return zy11Var;
            case 7:
                czy0 czy0Var = (czy0) obj4;
                tls tlsVar6 = (tls) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar6;
                if (!btsVar5.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar5.Y();
                } else if (czy0Var.b == 0.0f) {
                    btsVar5.e0(1870918342);
                    btsVar5.t(false);
                } else {
                    btsVar5.e0(1870794373);
                    float f3 = czy0Var.b;
                    boolean k6 = btsVar5.k(tlsVar6);
                    Object Q6 = btsVar5.Q();
                    if (k6 || Q6 == o430Var) {
                        Q6 = new s140(i3, tlsVar6);
                        btsVar5.o0(Q6);
                    }
                    vob1.a(f3, null, (sls) Q6, btsVar5, 0);
                    btsVar5.t(false);
                }
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                ed40.m((wd40) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                dqb1.a((xfv) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                dqb1.l((ziz0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                dqb1.c((mco) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                dqb1.j((b1f0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                dqb1.b((v49) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                dqb1.i((xq80) obj4, (f530) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                dqb1.k((w2v0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                hqb1.b((xo40) obj4, (f530) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                vqb1.a((fao) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                yqb1.a((sv40) obj4, (tls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                yqb1.d((tsq) obj4, (tls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 20:
                byk0 byk0Var = (byk0) obj4;
                f360 f360Var = (f360) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar7;
                if (btsVar6.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    s3b1.f(f360Var.a, an91.k(aab1.a(2.0f, ldc.f, ymb1.l(an91.k(c530.a, 8.0f), byk0Var), byk0Var), 2.0f), mhe.g, btsVar6, 384, 0);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 21:
                oz40 oz40Var = (oz40) obj3;
                hwo0.c(((d) obj4).b, (String) obj, (tky0) obj2, ((Boolean) oz40Var.getValue()).booleanValue(), null, 8);
                oz40Var.setValue(Boolean.TRUE);
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                com.yandex.messaging.core.ui.a.a((tpr) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                Uri uri = (Uri) obj4;
                f570 f570Var = (f570) obj3;
                ((Boolean) obj).getClass();
                String str = (String) obj2;
                ?? r9 = (uri != null ? sd90.l(uri, AuthSdkActivity.RESPONSE_TYPE_CODE) : null) != null ? 1 : 0;
                rt1 rt1Var = f570Var.E.s0;
                UpgradeEvents$EsiaApp2appResultResult upgradeEvents$EsiaApp2appResultResult = r9 != 0 ? UpgradeEvents$EsiaApp2appResultResult.OK : UpgradeEvents$EsiaApp2appResultResult.ERROR;
                String l = uri != null ? sd90.l(uri, "error") : null;
                String l2 = uri != null ? sd90.l(uri, "error_description") : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                if (str != null) {
                    linkedHashMap.put("action", str);
                }
                if (upgradeEvents$EsiaApp2appResultResult != null) {
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, upgradeEvents$EsiaApp2appResultResult.getOriginalValue());
                }
                if (l2 != null) {
                    linkedHashMap.put("error_description", l2);
                }
                if (l != null) {
                    linkedHashMap.put("error_code", l);
                }
                rt1Var.a.a("esia_app2app.result", linkedHashMap);
                return zy11Var;
            case 24:
                h870 h870Var = (h870) obj4;
                h1p h1pVar = (h1p) obj3;
                o8w0 o8w0Var = (o8w0) obj;
                gcn gcnVar = (gcn) obj2;
                dl40 dl40Var = h870Var.e;
                if (dl40Var.satisfiesClickDelay()) {
                    dl40Var.updateLastClickOnItemTimestamp();
                    hef0 hef0Var = (hef0) h870Var.b.get();
                    String str2 = o8w0Var.b;
                    if (str2 == null) {
                        str2 = h1pVar.getValue();
                    }
                    hef0Var.a(str2, h1pVar.getValue(), o8w0Var.a);
                    ((s2p) h870Var.c.get()).e(h1pVar, o8w0Var, gcnVar);
                }
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a.f((fk70) obj4, (wls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                TaxiOrder taxiOrder = (TaxiOrder) obj3;
                NotificationItemComponent notificationItemComponent = (NotificationItemComponent) obj;
                ((ListItemComponent) obj2).setTrailMode(2);
                c.z(new bm50(i3, (wrr) obj4, taxiOrder), notificationItemComponent);
                notificationItemComponent.setDetachListener(new lz70(i2, taxiOrder));
                return zy11Var;
            case 27:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ref$FloatRef.element += ((y6y) obj3).b.a(floatValue - ref$FloatRef.element);
                return zy11Var;
            case 28:
                ?? r23 = (String) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar8;
                if (btsVar7.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ymb1.e(r23, null, 0L, null, null, null, 0L, uh6.E(19), 0L, null, 0, false, 0, null, null, btsVar7, 12582912, 0, 65406);
                    ref$ObjectRef.element = r23;
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            default:
                CharSequence charSequence = (CharSequence) obj4;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj3;
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar9;
                if (btsVar8.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    zgb1.a(charSequence, null, 3, false, null, null, false, null, btsVar8, 384, 250);
                    ref$ObjectRef2.element = charSequence.toString();
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ iu30(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ iu30(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
