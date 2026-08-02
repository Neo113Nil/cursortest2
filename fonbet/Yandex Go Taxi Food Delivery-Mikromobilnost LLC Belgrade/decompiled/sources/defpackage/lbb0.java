package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.insurance.details.ScootersInsuranceDetailsModalView;
import com.yandex.go.scooters.passes.active.v3.c;
import com.yandex.go.scooters.requirements.SkipCheck;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import com.yandex.mapkit.map.ModelParams;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.messaging.internal.view.timeline.poll.options.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.a;
import com.yandex.runtime.model.ModelProvider;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import java.util.ArrayList;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.scooters.presentation.finish_info.e;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class lbb0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lbb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean adapter$lambda$2;
        boolean adapter$lambda$1;
        zy11 onCreate$lambda$2;
        zy11 accountsRecyclerHelper$lambda$3;
        zy11 adapter$lambda$0;
        zy11 labelsAdapter_delegate$lambda$0$0$0;
        zy11 itemsAdapter$lambda$0$0;
        zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                adapter$lambda$2 = PfmFragment.adapter$lambda$2((PfmFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter$lambda$2);
            case 1:
                k1c0 k1c0Var = (k1c0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    yn91.a(k1c0Var.a, AppColor$Palette.TextOnControl, AppColor$Palette.Control, btsVar, 432);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                ((PlacemarkMapObject) obj3).setModel((ModelProvider) obj, new ModelParams(ModelParams.CSOrientation.LEFT_HANDED), new ModelStyle(((Float) obj2).floatValue(), ModelStyle.UnitType.NORMALIZED, ModelStyle.RenderMode.USER_MODEL, null));
                return zy11Var;
            case 3:
                ((PlacemarkStyle) obj3).setModel((ModelProvider) obj, new ModelStyle(((Float) obj2).floatValue(), ModelStyle.UnitType.NORMALIZED, ModelStyle.RenderMode.USER_MODEL, null));
                return zy11Var;
            case 4:
                b bVar = (b) obj3;
                Integer num = (Integer) obj;
                int intValue2 = num.intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (!bVar.y && !bVar.z) {
                    boolean z = bVar.x;
                    ArrayList arrayList = bVar.w;
                    if (z) {
                        ((hxd0) arrayList.get(intValue2)).d = true;
                        bVar.a.invoke(num);
                    } else {
                        ((hxd0) arrayList.get(intValue2)).d = booleanValue;
                        bVar.b.invoke();
                    }
                }
                return zy11Var;
            case 5:
                ((a) obj3).z.k((String) obj2);
                return zy11Var;
            case 6:
                adapter$lambda$1 = ProductsFragment.adapter$lambda$1((ProductsFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter$lambda$1);
            case 7:
                ((Integer) obj2).getClass();
                u7a1.c((dif0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.a.a((d) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                p9y0 p9y0Var = (p9y0) obj3;
                wrs0 wrs0Var = (wrs0) obj2;
                ibk0 a = ijk0.a((nqs0) obj);
                if (a != null) {
                    p9y0Var.a(a, wrs0Var);
                }
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.order.details.v2.ui.compose.driver.a.i((mik0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                onCreate$lambda$2 = RoundingFragment.onCreate$lambda$2((RoundingFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$2;
            case 12:
                w2l0 w2l0Var = (w2l0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ut91.f(w2l0Var.a, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                ut91.f((i0l0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                ita1.a((d5l0) obj3, c530.a, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                nae naeVar = (nae) obj3;
                fid fidVar3 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ymb1.e(naeVar.a, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 0, 0, 65534);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 16:
                txq txqVar = (txq) obj3;
                fid fidVar4 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ymb1.e(txqVar.b, an91.o(c530.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((el51) btsVar4.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, 48, 0, 65528);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 17:
                accountsRecyclerHelper$lambda$3 = SavingsShelfView.accountsRecyclerHelper$lambda$3((SavingsShelfView) obj3, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return accountsRecyclerHelper$lambda$3;
            case 18:
                adapter$lambda$0 = SbpPartnersFragment.adapter$lambda$0((SbpPartnersFragment) obj3, (phm0) obj, ((Integer) obj2).intValue());
                return adapter$lambda$0;
            case 19:
                ((Integer) obj2).getClass();
                f0b1.c((fsm0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                f0b1.e((gsm0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                k0b1.d((ctm0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                c.g((fum0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                labelsAdapter_delegate$lambda$0$0$0 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0$0$0((ScootersCardHeaderComponent) obj3, (FrameLayout) obj, (t4n0) obj2);
                return labelsAdapter_delegate$lambda$0$0$0;
            case 24:
                m mVar = (m) obj3;
                mVar.R(SkipCheck.DEBT, new kqe0(22, mVar, (String) obj, (String) obj2));
                return zy11Var;
            case 25:
                String str = (String) obj;
                String str2 = (String) obj2;
                lbb0 lbb0Var = ((vin0) obj3).z;
                if (lbb0Var != null) {
                    lbb0Var.invoke(str, str2);
                }
                return zy11Var;
            case 26:
                e eVar = (e) obj3;
                eVar.A((m950) eVar.V.get(), new orr0((SharingPersonalGoalsServiceName) obj), sy60.Q2);
                return zy11Var;
            case 27:
                itemsAdapter$lambda$0$0 = ScootersInsuranceDetailsModalView.itemsAdapter$lambda$0$0((ScootersInsuranceDetailsModalView) obj3, (RobotoTextView) obj, (CharSequence) obj2);
                return itemsAdapter$lambda$0$0;
            case 28:
                ((Integer) obj2).getClass();
                n2b1.i((sun0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                remainingButtonsRvAdapter_delegate$lambda$0$0$0$2 = ScootersNewControlPanelView.remainingButtonsRvAdapter_delegate$lambda$0$0$0$2((ScootersNewControlPanelView) obj3, (kfn0) obj, ((Boolean) obj2).booleanValue());
                return remainingButtonsRvAdapter_delegate$lambda$0$0$0$2;
        }
    }

    public /* synthetic */ lbb0(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
