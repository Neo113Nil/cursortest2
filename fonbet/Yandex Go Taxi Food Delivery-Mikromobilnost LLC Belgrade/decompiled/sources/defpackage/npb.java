package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.ybsdk.feature.pfm.internal.ui.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.explicit_comment_courier.analytics.DeliveryExplicitCommentAnalytics$PopupButton;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.DeliveryExplicitCommentCourierFlowType;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.utils.CustomImagePositionedSpan;

/* loaded from: classes13.dex */
public final /* synthetic */ class npb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ npb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        noh executeRequest$lambda$2;
        Address g;
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        Boolean bool4 = null;
        switch (this.a) {
            case 0:
                break;
            case 1:
                j4n j4nVar = (j4n) this.b;
                akl0 akl0Var = (akl0) this.c;
                ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger = (ShowAlertInteractor$AnalyticsTrigger) this.w;
                sls slsVar = (sls) this.x;
                pex0 pex0Var = (pex0) this.y;
                ((zch) j4nVar.w).m(akl0Var, showAlertInteractor$AnalyticsTrigger);
                slsVar.invoke();
                c4r0.g((c4r0) j4nVar.y, SelectionOrigin.INVALIDATE, pex0Var.J0, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, 8);
                break;
            case 2:
                executeRequest$lambda$2 = MapiClientImpl.executeRequest$lambda$2((MapiClientImpl) this.b, (vu00) this.c, (yu00) this.w, (ku00) this.x, (v5j0) this.y);
                break;
            case 3:
                ((b) this.b).x0(((vcb0) this.c).a(), (Set) this.w, (Set) this.x, (String) this.y);
                break;
            case 4:
                ((pep0) ((oep0) this.b)).f((m950) ((com.yandex.go.promocodes.b) this.c).d.get(), new zn5((String) this.w, (pn5) this.x, (String) this.y), hxx.a);
                break;
            case 5:
                w040 w040Var = (w040) this.b;
                akl0 akl0Var2 = (akl0) this.c;
                ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger2 = (ShowAlertInteractor$AnalyticsTrigger) this.w;
                sls slsVar2 = (sls) this.x;
                String str = (String) this.y;
                ((zch) w040Var.f).m(akl0Var2, showAlertInteractor$AnalyticsTrigger2);
                slsVar2.invoke();
                c4r0.e((c4r0) w040Var.g, SelectionOrigin.REDIRECT, str, null, 12);
                break;
            case 6:
                w040 w040Var2 = (w040) this.b;
                akl0 akl0Var3 = (akl0) this.c;
                ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger3 = (ShowAlertInteractor$AnalyticsTrigger) this.w;
                String str2 = (String) this.x;
                String str3 = (String) this.y;
                zch zchVar = (zch) w040Var2.f;
                zchVar.getClass();
                LinkedHashMap i = zch.i(akl0Var3, showAlertInteractor$AnalyticsTrigger3);
                i.put("button", DeliveryExplicitCommentAnalytics$PopupButton.CANCEL.getValue());
                zchVar.l("PersonalStatePopupSuggest.Tapped", i);
                z8i z8iVar = (z8i) ((a9i) w040Var2.c).get();
                ((pep0) z8iVar.E.l).f(new wyo0(1, z8iVar), new r8i(str2, DeliveryExplicitCommentCourierFlowType.REGULAR, str3), hxx.a);
                break;
            case 7:
                e eVar = (e) this.b;
                lmp0 lmp0Var = (lmp0) this.c;
                lmp0 lmp0Var2 = (lmp0) this.w;
                ynv0 ynv0Var = (ynv0) this.x;
                String str4 = (String) this.y;
                c cVar = eVar.e;
                if (cVar.d() == null && (g = cVar.g()) != null) {
                    eVar.f.a(g);
                }
                n0 n0Var = eVar.n;
                String str5 = lmp0Var2.b;
                String str6 = lmp0Var2.c;
                rg7 rg7Var = lmp0Var2.d;
                n0Var.g(new plp0(str5, str6, rg7Var.a, eVar.a(rg7Var), str4, new mmp0(r2, eVar), new te5(eVar, lmp0Var, lmp0Var2, ynv0Var, str4)));
                break;
            case 8:
                tls tlsVar = (tls) this.b;
                egs0 egs0Var = (egs0) this.c;
                oz40 oz40Var = (oz40) this.w;
                oz40 oz40Var2 = (oz40) this.x;
                oz40 oz40Var3 = (oz40) this.y;
                Double i2 = !jl40.h(avu0.i((String) oz40Var.getValue()), egs0Var.a) ? avu0.i((String) oz40Var.getValue()) : Double.valueOf(egs0Var.a);
                if (((Boolean) oz40Var2.getValue()).booleanValue() != egs0Var.b) {
                    bool = (Boolean) oz40Var2.getValue();
                    bool.getClass();
                } else {
                    bool = null;
                }
                if (((Boolean) oz40Var3.getValue()).booleanValue() != egs0Var.c) {
                    bool3 = (Boolean) oz40Var3.getValue();
                    bool3.getClass();
                }
                tlsVar.invoke(new bgs0(i2, bool, bool3));
                break;
            case 9:
                ((sts0) this.b).e0((CustomImagePositionedSpan) this.c, (Drawable) this.w, ((ListItemComponent) this.x).title(), (String) this.y);
                break;
            case 10:
                tls tlsVar2 = (tls) this.b;
                oz40 oz40Var4 = (oz40) this.c;
                oz40 oz40Var5 = (oz40) this.w;
                tx40 tx40Var = (tx40) this.x;
                oz40 oz40Var6 = (oz40) this.y;
                int i3 = (int) (((k6w) oz40Var4.getValue()).a >> 32);
                int i4 = (int) (((k6w) oz40Var4.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                zii0 zii0Var = (zii0) oz40Var5.getValue();
                float floatValue = tx40Var.getFloatValue();
                long j = ((wu60) oz40Var6.getValue()).a;
                tlsVar2.invoke(new gys0(new wbf(i3, i4, fia1.f(zii0Var), floatValue, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), true)));
                break;
            case 11:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                FeedbackDto feedbackDto = (FeedbackDto) this.c;
                List list = (List) this.w;
                List list2 = (List) this.x;
                FeedbackChoices feedbackChoices = (FeedbackChoices) this.y;
                TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                Integer num = feedbackDto.a;
                TaxiOrderLocalData D = taxiOrderLocalData.R(num != null ? num.intValue() : 0).S(list).D(list2);
                Map map = feedbackChoices != null ? feedbackChoices.c : null;
                TaxiOrderFeedback taxiOrderFeedback = D.W;
                taxiOrderFeedback.getClass();
                TaxiOrderLocalData b = TaxiOrderLocalData.b(D, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, map, null, null, null, 239), false, null, false, null, null, null, -1, 16711679);
                List list3 = feedbackChoices != null ? feedbackChoices.b : null;
                TaxiOrderFeedback taxiOrderFeedback2 = b.W;
                taxiOrderFeedback2.getClass();
                break;
            case 12:
                tls tlsVar3 = (tls) this.b;
                b441 b441Var = (b441) this.c;
                oz40 oz40Var7 = (oz40) this.w;
                oz40 oz40Var8 = (oz40) this.x;
                oz40 oz40Var9 = (oz40) this.y;
                Double i5 = !jl40.h(avu0.i((String) oz40Var7.getValue()), b441Var.a) ? avu0.i((String) oz40Var7.getValue()) : Double.valueOf(b441Var.a);
                if (((Boolean) oz40Var8.getValue()).booleanValue() != b441Var.b) {
                    bool2 = (Boolean) oz40Var8.getValue();
                    bool2.getClass();
                } else {
                    bool2 = null;
                }
                if (((Boolean) oz40Var9.getValue()).booleanValue() != b441Var.c) {
                    bool4 = (Boolean) oz40Var9.getValue();
                    bool4.getClass();
                }
                tlsVar3.invoke(new y341(i5, bool2, bool4));
                break;
            default:
                tls tlsVar4 = (tls) this.b;
                String str7 = (String) this.c;
                String str8 = (String) this.w;
                String str9 = (String) this.x;
                String str10 = (String) this.y;
                StringBuilder v = oyr.v(str7, "\n");
                if (str8 != null) {
                    v.append(str8);
                    v.append("\n");
                }
                v.append(str9);
                v.append("\n");
                v.append(str10);
                tlsVar4.invoke(v.toString());
                break;
        }
        return zy11.a;
    }
}
