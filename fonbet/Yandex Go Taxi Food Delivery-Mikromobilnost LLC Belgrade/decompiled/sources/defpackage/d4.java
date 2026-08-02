package defpackage;

import android.os.Build;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.FavoritesInputParams$Intention;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.payments.addmethod.navigation.c;
import com.yandex.go.payments.addmethod.navigation.e;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;
import com.yandex.go.payments.shared.details.f;
import com.yandex.mobile.drive.view.AlertButtonView;
import com.yandex.mobile.drive.view.AlertView;
import com.yandex.mobile.drive.view.Loader;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.MenuAboutConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.a;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.model.AbandonedCartDeliveredNotificationDto;
import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.sharedpayments.AccountLinkingInfoFullscreenModalView;
import ru.yandex.taxi.surge.dialog.accept_paid.AcceptPaidOptionDialog;
import ru.yandex.taxi.view.AddFavoritesModalView;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final /* synthetic */ class d4 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View view;
        zy11 _init_$lambda$2;
        View insetsType$lambda$0;
        zy11 updateAddFavoritesModalViewState$lambda$0$0;
        v69 smoothScroller_delegate$lambda$0;
        zy11 renderPickupFromPhotoButton$lambda$0;
        Loader loader_delegate$lambda$1;
        zy11 show$lambda$5;
        lv1 adapter_delegate$lambda$0;
        int i = this.a;
        int i2 = 10;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((a) obj).b.adapter(AbandonedCartDeliveredNotificationDto.class);
            case 1:
                return b.i(new Pair("App Version", ((rz10) obj).i.a), new Pair("Build Number", "190"), new Pair("Device Model", Build.MODEL), new Pair("Device Manufacturer", Build.MANUFACTURER), new Pair("Android Version", Build.VERSION.RELEASE), new Pair("Android SDK", String.valueOf(Build.VERSION.SDK_INT)));
            case 2:
                e5 e5Var = (e5) obj;
                com.ybsdk.rconfig.b bVar = ((h5) e5Var).a;
                List<MenuAboutConfig.AboutItem> menuItems = ((MenuAboutConfig) bVar.d(bVar.i.g).getData()).getMenuItems();
                ArrayList arrayList = new ArrayList(tcc.n(menuItems, 10));
                for (MenuAboutConfig.AboutItem aboutItem : menuItems) {
                    arrayList.add(new f5(aboutItem.getTitle(), aboutItem.getAction()));
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f5 f5Var = (f5) it.next();
                    arrayList2.add(new m5(f5Var.a, f5Var.b));
                }
                return new h6(arrayList2, new Text.Join(scc.g(unr0.h(Text.Companion, dzh0.ybsdk_about_version_title), new Text.Join(scc.g(new Text.Constant("0.233.1"), new Text.Constant("11302")), Extension.DOT_CHAR)), " "), ((h5) e5Var).b.getCoinImage());
            case 3:
                return ((qa) obj).a().b();
            case 4:
                view = ((AcceptPaidOptionDialog) obj).buttonsHolder;
                return view;
            case 5:
                f fVar = (f) obj;
                fVar.P.setImageDrawable(vng.t(y2h0.placeholder_picture, fVar.c));
                return zy11.a;
            case 6:
                _init_$lambda$2 = AccountLinkingInfoFullscreenModalView._init_$lambda$2((PlaceholderView) obj);
                return _init_$lambda$2;
            case 7:
                return new qs90(((hn) obj).a);
            case 8:
                return ((qx) obj).a.a(new l0o(27)).a;
            case 9:
                return ((ux) obj).a.a(new p0(i2));
            case 10:
                insetsType$lambda$0 = AddCardModalView.insetsType$lambda$0((AddCardModalView) obj);
                return insetsType$lambda$0;
            case 11:
                return ((c) obj).I.a();
            case 12:
                updateAddFavoritesModalViewState$lambda$0$0 = AddFavoritesModalView.updateAddFavoritesModalViewState$lambda$0$0((de0) obj);
                return updateAddFavoritesModalViewState$lambda$0$0;
            case 13:
                ru.yandex.taxi.view.c cVar = (ru.yandex.taxi.view.c) obj;
                if (cVar.C.a()) {
                    cVar.G.b(MainMenuProcessor$MenuEntry.MY_ADDRESSES, new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.FALSE));
                }
                return zy11.a;
            case 14:
                return ((com.yandex.go.places.impl.ui.main.actions.video_queue.a) obj).a;
            case 15:
                return ((gf41) ((e) obj).D.f).a();
            case 16:
                return ((com.yandex.go.payments.yape.navigation.c) obj).G.a();
            case 17:
                smoothScroller_delegate$lambda$0 = AddressAdjustmentModalView.smoothScroller_delegate$lambda$0((AddressAdjustmentModalView) obj);
                return smoothScroller_delegate$lambda$0;
            case 18:
                ((gt0) obj).b.b.x.dismiss();
                return zy11.a;
            case 19:
                renderPickupFromPhotoButton$lambda$0 = AddressMapPickerFragment.renderPickupFromPhotoButton$lambda$0((m11) obj);
                return renderPickupFromPhotoButton$lambda$0;
            case 20:
                ((iy0) ((ru.yandex.taxi.address.c) obj).Dg()).addressConfirmed();
                return zy11.a;
            case 21:
                sls slsVar = (sls) ((ru.yandex.taxi.search.address.view.a) obj).j.b.get();
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return zy11.a;
            case 22:
                com.yandex.go.quark.ai_assistant.impl.router.c cVar2 = (com.yandex.go.quark.ai_assistant.impl.router.c) obj;
                if (cVar2.getLifecycle().w == Lifecycle.State.DESTROYED) {
                    cVar2.M.a(null);
                }
                return zy11.a;
            case 23:
                return ((po1) obj).a.getSharedPreferences("ai_widget_evaluation_prefs", 0);
            case 24:
                loader_delegate$lambda$1 = AlertButtonView.loader_delegate$lambda$1((AlertButtonView) obj);
                return loader_delegate$lambda$1;
            case 25:
                show$lambda$5 = AlertView.show$lambda$5((AlertView) obj);
                return show$lambda$5;
            case 26:
                adapter_delegate$lambda$0 = AltSelectModalView.adapter_delegate$lambda$0((AltSelectModalView) obj);
                return adapter_delegate$lambda$0;
            case 27:
                qw1 qw1Var = (qw1) obj;
                ((iw1) qw1Var.c).c.a = true;
                ((z880) qw1Var.b).a();
                return zy11.a;
            case 28:
                return u8b1.h(c0h0.ic_order_map_destination_pin, ((ru.yandex.taxi.altpins.map.a) obj).a);
            default:
                ((ru.yandex.taxi.altpins.router.a) obj).r(new j01(26));
                return zy11.a;
        }
    }
}
