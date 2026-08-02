package defpackage;

import com.yandex.go.places.impl.ui.notifications.favorites.ShowFavoritesNotification;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;

/* loaded from: classes3.dex */
public final /* synthetic */ class n7l0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ n7l0(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onLeftToolbarImageClickListener$lambda$8;
        zy11 buildTrailButton$lambda$0$1;
        zy11 primaryButtonClickListener$lambda$2;
        zy11 secondaryButtonClickListener$lambda$3;
        zy11 bind$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                slsVar.invoke();
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                slsVar.invoke();
                break;
            case 5:
                onLeftToolbarImageClickListener$lambda$8 = SelectPaymentMethodView.setOnLeftToolbarImageClickListener$lambda$8(slsVar);
                break;
            case 6:
                slsVar.invoke();
                break;
            case 7:
                buildTrailButton$lambda$0$1 = ShowFavoritesNotification.buildTrailButton$lambda$0$1(slsVar);
                break;
            case 8:
                slsVar.invoke();
                break;
            case 9:
                slsVar.invoke();
                break;
            case 10:
                slsVar.invoke();
                break;
            case 11:
                slsVar.invoke();
                break;
            case 12:
                primaryButtonClickListener$lambda$2 = StoriesComponentView.setPrimaryButtonClickListener$lambda$2(slsVar);
                break;
            case 13:
                secondaryButtonClickListener$lambda$3 = StoriesComponentView.setSecondaryButtonClickListener$lambda$3(slsVar);
                break;
            case 14:
                break;
            case 15:
                bind$lambda$0 = SuperappSearchbarButtonView.bind$lambda$0(slsVar);
                break;
            case 16:
                slsVar.invoke();
                break;
            case 17:
                slsVar.invoke();
                break;
            case 18:
                slsVar.invoke();
                break;
            case 19:
                slsVar.invoke();
                break;
            case 20:
                slsVar.invoke();
                break;
            case 21:
                slsVar.invoke();
                break;
            case 22:
                slsVar.invoke();
                break;
            case 23:
                slsVar.invoke();
                break;
            case 24:
                slsVar.invoke();
                break;
            default:
                slsVar.invoke();
                break;
        }
        return zy11Var;
    }
}
