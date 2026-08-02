package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.due_timetable.presentation.DueTimetableModalView;
import com.yandex.go.navigator.alt_select.AddressStateView;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.gas_stations.filters.SearchOnlyAlongRouteFilter;
import com.yandex.go.navigator.incidents.dashboard.DashboardEventsModalView;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView;
import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;
import com.yandex.go.taxi.order.bottom_modal.ui.mvp.BottomModalView;
import com.yandex.messaging.internal.gif.GifDrawable;
import com.yandex.payment.sdk.flex.impl.customview.views.webview.CustomWebView;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import java.io.File;
import java.util.List;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ChipsComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes13.dex */
public final /* synthetic */ class n5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ n5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        IconCircleButton addStopsView_delegate$lambda$0;
        int expandedTopScrimController_delegate$lambda$0$1;
        ControlButtonView backButton_delegate$lambda$0;
        int expandedTopScrimController_delegate$lambda$0$12;
        ControlButtonView backButton_delegate$lambda$02;
        BackButtonIconComponent backButton_delegate$lambda$03;
        CloseButtonIconComponent closeButton_delegate$lambda$0;
        Drawable infoDrawable_delegate$lambda$0;
        Drawable warningDrawable_delegate$lambda$0;
        st41 externalWebViewSslErrorHandler_delegate$lambda$0;
        ButtonComponent adapter$lambda$0$0;
        st41 externalWebViewSslErrorHandler_delegate$lambda$02;
        d9y leftSideButtonsContainer_delegate$lambda$0;
        FrameLayout notificationStackComponent_delegate$lambda$0;
        int selectableItemBackgroundResourceId_delegate$lambda$0;
        ListItemComponent adapter$lambda$0$02;
        SearchOnlyAlongRouteFilter searchOnlyOnTheRouteFilters_delegate$lambda$0;
        Paint progressPaint_delegate$lambda$1;
        FrameLayout loadingView_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Context context = this.b;
        switch (i) {
            case 0:
                File[] listFiles = new File(context.getCacheDir(), "telemost/Reports").listFiles(new o5());
                List d0 = listFiles != null ? j73.d0(listFiles) : null;
                if (d0 == null) {
                    break;
                }
                break;
            case 1:
                addStopsView_delegate$lambda$0 = AddressStateView.addStopsView_delegate$lambda$0(context);
                break;
            case 2:
                expandedTopScrimController_delegate$lambda$0$1 = BaseOrganizationCardModalView.expandedTopScrimController_delegate$lambda$0$1(context);
                break;
            case 3:
                backButton_delegate$lambda$0 = BaseOrganizationCardModalView.backButton_delegate$lambda$0(context);
                break;
            case 4:
                expandedTopScrimController_delegate$lambda$0$12 = BaseOrganizationsModalView.expandedTopScrimController_delegate$lambda$0$1(context);
                break;
            case 5:
                backButton_delegate$lambda$02 = BasePlacesMapAwareModalView.backButton_delegate$lambda$0(context);
                break;
            case 6:
                backButton_delegate$lambda$03 = BottomModalView.backButton_delegate$lambda$0(context);
                break;
            case 7:
                closeButton_delegate$lambda$0 = BottomModalView.closeButton_delegate$lambda$0(context);
                break;
            case 8:
                break;
            case 9:
                infoDrawable_delegate$lambda$0 = ChargersTariffsView.infoDrawable_delegate$lambda$0(context);
                break;
            case 10:
                warningDrawable_delegate$lambda$0 = ChipsComponent.warningDrawable_delegate$lambda$0(context);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                externalWebViewSslErrorHandler_delegate$lambda$0 = CustomWebView.externalWebViewSslErrorHandler_delegate$lambda$0(context);
                break;
            case 14:
                adapter$lambda$0$0 = DashboardEventsModalView.adapter$lambda$0$0(context);
                break;
            case 15:
                externalWebViewSslErrorHandler_delegate$lambda$02 = Default3DSWebView.externalWebViewSslErrorHandler_delegate$lambda$0(context);
                break;
            case 16:
                break;
            case 17:
                leftSideButtonsContainer_delegate$lambda$0 = DrivingModalView.leftSideButtonsContainer_delegate$lambda$0(context);
                break;
            case 18:
                notificationStackComponent_delegate$lambda$0 = DrivingModalView.notificationStackComponent_delegate$lambda$0(context);
                break;
            case 19:
                selectableItemBackgroundResourceId_delegate$lambda$0 = DueTimetableModalView.selectableItemBackgroundResourceId_delegate$lambda$0(context);
                break;
            case 20:
                break;
            case 21:
                adapter$lambda$0$02 = GasStationsFiltersListModalView.adapter$lambda$0$0(context);
                break;
            case 22:
                searchOnlyOnTheRouteFilters_delegate$lambda$0 = GasStationsFiltersModalView.searchOnlyOnTheRouteFilters_delegate$lambda$0(context);
                break;
            case 23:
                progressPaint_delegate$lambda$1 = GifDrawable.progressPaint_delegate$lambda$1(context);
                break;
            case 24:
                loadingView_delegate$lambda$0 = MaasMetroPickModalView.loadingView_delegate$lambda$0(context);
                break;
            case 25:
                context.startActivity(new Intent("android.settings.SETTINGS"));
                break;
            case 26:
                d6z.Q(context);
                break;
            case 27:
                context.startActivity(new Intent("android.settings.SETTINGS"));
                break;
            case 28:
                d6z.Q(context);
                break;
            default:
                d6z.Q(context);
                break;
        }
        return zy11Var;
    }
}
