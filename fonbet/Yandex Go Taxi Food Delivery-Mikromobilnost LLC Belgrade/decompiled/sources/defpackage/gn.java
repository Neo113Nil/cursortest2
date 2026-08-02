package defpackage;

import android.content.Context;
import androidx.compose.foundation.gestures.e;
import com.yandex.plus.acquisition.adapter.api.PlusAcquisitionSdkPaymentAnalyticsParams;
import com.yandex.plus.acquisition.adapter.internal.controller.b;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.resources.core.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.delivery.ui.requirement.DeliverySelectRequirementDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class gn implements sls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                y17 y17Var = (y17) obj8;
                hn hnVar = (hn) obj7;
                break;
            case 1:
                b bVar = (b) obj7;
                Map map = (Map) obj3;
                ButtonSectionView buttonSectionView = (ButtonSectionView) bVar.c.getValue();
                yzc0 yzc0Var = (yzc0) ((am2) obj8).a;
                oo2 oo2Var = yzc0Var.a;
                ru2 ru2Var = (ru2) oo2Var.a;
                PlusSdkBrandType plusSdkBrandType = (PlusSdkBrandType) ru2Var.h;
                w040 w040Var = new w040(new qhd0(oo2Var, yzc0Var.b));
                a aVar = new a((Context) ru2Var.g, plusSdkBrandType);
                x17 x17Var = new x17(buttonSectionView, (v17) ((i3y) w040Var.a).getValue(), yzc0Var.b, new j9f0(), new i9f0(plusSdkBrandType), new e6i0(), new c6i0(), new b6i0(aVar, plusSdkBrandType), new m501(14, new qrd()), new vkd(plusSdkBrandType), aVar, plusSdkBrandType);
                PlusAcquisitionPaymentAnalytics$Params a = ((v42) ((u42) obj2)).a((PlusAcquisitionSdkPaymentAnalyticsParams) obj6);
                bb1.L(buttonSectionView.getPurchaseButton().getView(), new nl(3, x17Var, a, new com.yandex.plus.acquisition.adapter.internal.controller.a((com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers.a) obj5, (c0d0) obj4, a, map, bVar)));
                break;
            case 2:
                vu8 vu8Var = (vu8) obj7;
                String str = (String) obj2;
                ArrayList arrayList = (ArrayList) obj6;
                List list = (List) obj5;
                DeliverySelectRequirementDialog deliverySelectRequirementDialog = (DeliverySelectRequirementDialog) obj4;
                String str2 = (String) obj3;
                Iterator it = ((api) obj8).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((b580) next).a, str2)) {
                            obj = next;
                        }
                    }
                }
                b580 b580Var = (b580) obj;
                if (b580Var != null) {
                    yzh yzhVar = (yzh) vu8Var.J;
                    rf70 b = b580Var.b();
                    pj pjVar = (pj) yzhVar.a;
                    Map m = yzh.m(arrayList, b);
                    pjVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                    hashMap.putAll(m);
                    pjVar.a.a("DeliverySelectorDialog.BackButton.Tapped", hashMap, 1, new HashMap());
                }
                ((x8) ((g580) vu8Var.H)).e(list);
                deliverySelectRequirementDialog.dismiss();
                vu8Var.r(new qu(9));
                break;
            case 3:
                e eVar = new e((tls) obj3, obj8);
                eVar.m.setValue((lah) obj7);
                eVar.j(obj8);
                eVar.b = (tls) obj2;
                eVar.c = (sls) obj6;
                eVar.d = (ck11) obj5;
                eVar.e = (gxg) obj4;
                break;
            case 4:
                gec0 gec0Var = (gec0) obj8;
                gec0Var.i = null;
                gec0Var.d((fec0) obj7, this.w, (tls) obj6, (tls) obj5, (sls) obj4, (sls) obj3);
                break;
            case 5:
                n70 n70Var = (n70) obj8;
                ((v561) n70Var.N).a.setCallbacks((sls) obj7, (sls) obj2, (sls) obj6, (sls) obj5);
                ((v561) n70Var.N).a.setProgressTouchedListener((tls) obj4);
                ((tls) obj3).invoke(((b9m0) n70Var.Z()).c);
                break;
            default:
                edw0 edw0Var = (edw0) obj8;
                edw0Var.i = null;
                edw0Var.d((ddw0) obj7, this.w, (tls) obj6, (tls) obj5, (sls) obj4, (sls) obj3);
                break;
        }
        return zy11Var;
    }
}
