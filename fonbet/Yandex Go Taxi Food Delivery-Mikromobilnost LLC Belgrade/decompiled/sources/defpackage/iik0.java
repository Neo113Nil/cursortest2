package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoritesInputParams$Intention;
import com.yandex.go.analytics.rythm.sender.RythmApi;
import com.yandex.go.navigator.route_stops.RouteStopsModalView;
import com.yandex.go.navigator.route_stops.a;
import com.yandex.go.safety.center.help.e;
import com.yandex.go.safety.center.instructions.web.SafetyCenterWebInstructionsView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import com.yandex.messaging.ui.statuses.save.SavePresetActionDialog;
import com.ybsdk.feature.savings.internal.screens.close.SavingsAccountCloseParams;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationFragment;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.favorites.rides.save_modal.domain.c;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.panorama.ridecard.d;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.utils.h;

/* loaded from: classes12.dex */
public final /* synthetic */ class iik0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iik0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 updateDriverSubtitle$lambda$0$1;
        h listDelegate_delegate$lambda$0;
        a routeStopsListAdapter_delegate$lambda$0;
        View view;
        zy11 viewBinding$lambda$1$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                updateDriverSubtitle$lambda$0$1 = RideCardDriverSectionView.updateDriverSubtitle$lambda$0$1((yzx) obj);
                return updateDriverSubtitle$lambda$0$1;
            case 1:
                xkk0 xkk0Var = (xkk0) obj;
                xkk0Var.r(new ohk0(3, xkk0Var));
                return zy11Var;
            case 2:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new ohk0(4, zsaVar));
                return zy11Var;
            case 3:
                return (a9y0) ((d) obj).f.get();
            case 4:
                listDelegate_delegate$lambda$0 = RideCardTimelineBannerView.listDelegate_delegate$lambda$0((RideCardTimelineBannerView) obj);
                return listDelegate_delegate$lambda$0;
            case 5:
                return (ViewGroup) LayoutInflater.from(((tqk0) obj).a).inflate(fph0.component_source_destination_route_time_layout, (ViewGroup) null, false);
            case 6:
                RoadEvent roadEvent = (RoadEvent) obj;
                Pair pair = new Pair("id", roadEvent.getId());
                Pair pair2 = new Pair("caption", roadEvent.getCaption());
                Pair pair3 = new Pair("isInFuture", Boolean.valueOf(roadEvent.getIsInFuture()));
                Point position = roadEvent.getPosition();
                Pair pair4 = new Pair("position", b.i(new Pair("lat", Double.valueOf(position.getLatitude())), new Pair("lon", Double.valueOf(position.getLongitude()))));
                List<EventTag> tags = roadEvent.getTags();
                ArrayList arrayList = new ArrayList(tcc.n(tags, 10));
                Iterator<T> it = tags.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EventTag) it.next()).name().toLowerCase(Locale.ROOT));
                }
                return b.i(pair, pair2, pair3, pair4, new Pair("tags", arrayList));
            case 7:
                return ((gh00) ((ktk0) obj).b).i.p();
            case 8:
                ((t) obj).r(new qu(9));
                return zy11Var;
            case 9:
                lft0 lft0Var = ((ru.yandex.taxi.preorder.source.routeoverlay.a) obj).c0;
                if (lft0Var != null) {
                    lft0Var.I(r0.V.size() - 2);
                }
                return zy11Var;
            case 10:
                List list = ((q6l0) obj).a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(cwa1.d((zzs) it2.next()));
                }
                return k.i(arrayList2);
            case 11:
                return gwk0.h(((yal0) obj).c);
            case 12:
                routeStopsListAdapter_delegate$lambda$0 = RouteStopsModalView.routeStopsListAdapter_delegate$lambda$0((RouteStopsModalView) obj);
                return routeStopsListAdapter_delegate$lambda$0;
            case 13:
                idl0 idl0Var = (idl0) obj;
                o8g0 o8g0Var = idl0Var.K;
                if (o8g0Var == null) {
                    Address h = idl0Var.x.h();
                    if (h != null) {
                        ((adl0) idl0Var.Dg()).askAdd(h);
                    }
                } else {
                    ((m020) o8g0Var.b).invoke();
                }
                return zy11Var;
            case 14:
                com.yandex.fintechsdk.core.navigation.impl.api.router.a aVar = (com.yandex.fintechsdk.core.navigation.impl.api.router.a) obj;
                aVar.d.clear();
                aVar.c = null;
                return zy11Var;
            case 15:
                return (vlr) obj;
            case 16:
                return Integer.valueOf(xw31.b(wug0.ride_card_done_footer_margin, ((com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.d) obj).a.getContext()) / 2);
            case 17:
                on2 on2Var = ((com.yandex.go.analytics.rythm.sender.a) obj).b;
                on2Var.getClass();
                return (RythmApi) on2Var.a(GoApiName.TaxiV4, RythmApi.class);
            case 18:
                ClassLoader classLoader = (ClassLoader) ((ndl0) obj).b;
                Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
                return Boolean.valueOf(declaredMethod.getReturnType().equals(classLoader.loadClass("androidx.window.extensions.WindowExtensions")) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 19:
                ((com.yandex.go.safety.center.contacts.b) obj).r(new qu(9));
                return zy11Var;
            case 20:
                ((e) obj).z.z.m(null, Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return zy11Var;
            case 21:
                view = ((SafetyCenterWebInstructionsView) obj).webViewWrapper;
                return view;
            case 22:
                on2 on2Var2 = ((c) obj).a;
                on2Var2.getClass();
                return (FavoritesApi) on2Var2.a(GoApiName.TaxiV4, FavoritesApi.class);
            case 23:
                ((ru.yandex.taxi.favorites.rides.save_modal.routers.c) obj).I.b(MainMenuProcessor$MenuEntry.MY_ADDRESSES, new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.FALSE));
                return zy11Var;
            case 24:
                SavePresetActionDialog.savePresetActionComponent_delegate$lambda$0(null, (SavePresetActionDialog) obj);
                return null;
            case 25:
                h2m0 h2m0Var = ((o1m0) obj).c;
                if (h2m0Var == null) {
                    return null;
                }
                Bundle g = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                h2m0Var.b(g);
                if (g.isEmpty()) {
                    return null;
                }
                return g;
            case 26:
                ((tj60) ((s6k0) obj).b).c("SavedToFavoriteNotification");
                return zy11Var;
            case 27:
                return new g3m0((SavingsAccountCloseDepositParams) obj, false);
            case 28:
                SavingsAccountCloseParams savingsAccountCloseParams = (SavingsAccountCloseParams) obj;
                return new y3m0(savingsAccountCloseParams.getTitle(), savingsAccountCloseParams.getSubtitle(), false, savingsAccountCloseParams.getImageUrl(), savingsAccountCloseParams.getActionButtonTitle(), savingsAccountCloseParams.getSecondaryButtonTitle(), savingsAccountCloseParams.getShowSecondary());
            default:
                viewBinding$lambda$1$lambda$0 = SavingsAccountCreationFragment.getViewBinding$lambda$1$lambda$0((SavingsAccountCreationFragment) obj);
                return viewBinding$lambda$1$lambda$0;
        }
    }
}
