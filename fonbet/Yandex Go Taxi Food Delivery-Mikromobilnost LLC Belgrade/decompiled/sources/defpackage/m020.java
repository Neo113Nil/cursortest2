package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.appcompat.view.menu.MenuBuilder;
import com.squareup.moshi.Moshi;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.layouts.ToolbarBuilder;
import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.MobileAdsNativeBannerView;
import com.yandex.go.masstransit.sdk.ble.impl.network.PaymentBleApi;
import com.yandex.messaging.activity.MessengerNotificationActivity;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackActivity;
import com.yandex.messaging.isolated.MessengerChatListFragment;
import com.yandex.messaging.ui.timeline.TimelineToolbarUi$customLayout$$inlined$brickSlot$default$1;
import com.yandex.plus.pay.ui.tarifficator.mobile.internal.b;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.MoneyInputView;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.masstransit.geopayment.checkout.l;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;
import ru.yandex.taxi.masstransit.geopayment.checkout.t;
import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;
import ru.yandex.taxi.masstransit.router.d;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.search.address.view.ModalSourceSearchView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes15.dex */
public final /* synthetic */ class m020 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m020(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v52, types: [uy20] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.yandex.dsl.views.a, fdz0, o720] */
    @Override // defpackage.sls
    public final Object invoke() {
        pvq ui_delegate$lambda$0;
        xzw ui_delegate$lambda$02;
        enp0 a;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        ThemeType themeType;
        View bottomShadowView_delegate$lambda$0;
        zy11 initialize$lambda$3;
        zy11 initialize$lambda$1$lambda$0;
        Object value;
        zy11 Content$lambda$0$0$0;
        zy11 _init_$lambda$1;
        int i2 = this.a;
        int i3 = 0;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ui_delegate$lambda$0 = MessengerCallFeedbackActivity.ui_delegate$lambda$0((MessengerCallFeedbackActivity) obj);
                return ui_delegate$lambda$0;
            case 1:
                ui_delegate$lambda$02 = MessengerChatListFragment.ui_delegate$lambda$0((MessengerChatListFragment) obj);
                return ui_delegate$lambda$02;
            case 2:
                a = onp0.a((MessengerNotificationActivity) obj);
                return a;
            case 3:
                ?? r12 = (fdz0) obj;
                int i4 = e9h0.chat_toolbar;
                int i5 = w0i0.MessagingToolbar;
                Context context = r12.a;
                n720 n720Var = r12.c;
                ToolbarBuilder toolbarBuilder = new ToolbarBuilder(jh91.e(i5, context), 0, 0);
                if (i4 != -1) {
                    toolbarBuilder.setId(i4);
                }
                if (r12 instanceof kzx) {
                    ((kzx) r12).addToParent(toolbarBuilder);
                }
                toolbarBuilder.setMinimumHeight(o720.y);
                toolbarBuilder.setBackgroundResource(wwg0.msg_bg_toolbar);
                toolbarBuilder.setPopupTheme(w0i0.MessagingToolbar_PopupMenu);
                toolbarBuilder.setContentInsetsAbsolute(0, 0);
                toolbarBuilder.setContentInsetStartWithNavigation(0);
                Menu menu = toolbarBuilder.getMenu();
                MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
                if (menuBuilder != null) {
                    menuBuilder.setOptionalIconsVisible(true);
                }
                n720Var.getClass();
                int i6 = n720.a;
                int i7 = e9h0.dialog_toolbar_content_slot;
                View view = (View) TimelineToolbarUi$customLayout$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, toolbarBuilder.getCtx()), 0, 0);
                if (i7 != -1) {
                    view.setId(i7);
                }
                toolbarBuilder.addToParent(view);
                c cVar = new c((BrickSlotView) view);
                if (r12.z.a()) {
                    cVar.a((Brick) r12.A.get());
                }
                return toolbarBuilder;
            case 4:
                return (rgo) ((PropertyReference0) ((dc20) obj).a).get();
            case 5:
                ph20 ph20Var = (ph20) obj;
                if (Build.VERSION.SDK_INT >= 30) {
                    Context context2 = nya1.a;
                    if (context2 == null) {
                        Pair pair = !evu0.z(Application.getProcessName(), ':') ? new Pair("App Startup didn't run", scc.g("If App Startup has been disabled, enable it back in the AndroidManifest.xml file of the app.", "For other cases, call injectAsAppCtx() in the app's Application subclass in its initializer or in its onCreate function.")) : new Pair("App Startup is not enabled for non default processes", Collections.singletonList("Call injectAsAppCtx() in the app's Application subclass in its initializer or in its onCreate function."));
                        String str = (String) pair.getFirst();
                        List list = (List) pair.getSecond();
                        StringBuilder sb = new StringBuilder("appCtx has not been initialized!\n");
                        if (list.size() != 1) {
                            sb.append(jl40.M(". Possible solutions:", str));
                            sb.append('\n');
                            for (Object obj2 : list) {
                                int i8 = i3 + 1;
                                if (i3 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                sb.append(i8);
                                sb.append(". ");
                                sb.append((String) obj2);
                                i3 = i8;
                            }
                        } else {
                            sb.append(jl40.M(a.s0(list), "Possible solution: "));
                            sb.append('\n');
                        }
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    currentWindowMetrics = ((WindowManager) context2.getSystemService("window")).getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i = bounds.height();
                } else {
                    i = ph20Var.c.getDisplayMetrics().heightPixels;
                }
                return Integer.valueOf(i);
            case 6:
                themeType = ((MobileAdsNativeBannerView) obj).currentThemeType;
                return themeType;
            case 7:
                return zmx.b(new ctq(27, (vr) obj));
            case 8:
                return new b(((tt20) obj).a, com.yandex.plus.core.activity.result.internal.c.d);
            case 9:
                ((com.yandex.go.taxi.summary.mobilityhub.router.a) obj).r(new ps20(12));
                return zy11Var;
            case 10:
                ty20 ty20Var = new ty20(0.5f);
                ?? r122 = ((ez20) obj).b;
                if (r122 != 0) {
                    ty20Var = r122;
                }
                return Integer.valueOf(ty20Var.a());
            case 11:
                bottomShadowView_delegate$lambda$0 = ModalSourceSearchView.bottomShadowView_delegate$lambda$0((ModalSourceSearchView) obj);
                return bottomShadowView_delegate$lambda$0;
            case 12:
                initialize$lambda$3 = MoneyInputEditView.initialize$lambda$3((MoneyInputEditView) obj);
                return initialize$lambda$3;
            case 13:
                y530 y530Var = (y530) obj;
                return new Regex(b64.d(y530Var.a, y530Var.b, "^0?\\d{0,", "}([.,]\\d{0,", "})?$"));
            case 14:
                initialize$lambda$1$lambda$0 = MoneyInputView.initialize$lambda$1$lambda$0((MoneyInputView) obj);
                return initialize$lambda$1$lambda$0;
            case 15:
                n15 n15Var = (n15) obj;
                return ((Moshi) n15Var.b).adapter((Type) n15Var.c);
            case 16:
                return qje.r(((zc30) obj).a);
            case 17:
                com.yandex.go.payments.superapp.payment.b bVar = ((l) obj).b;
                u32.a.getClass();
                return bVar.a("transport_external", t32.b, new l90(), uba0.g);
            case 18:
                ge30 ge30Var = ((t) obj).G.b;
                r6f r6fVar = new r6f(null, CreatePaymentDto$ErrorType.FAILURE_PAYMENT_ERROR, null, null, Constants.VPN_TRAFFIC);
                r0 r0Var = ((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) ge30Var).b;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, r6fVar));
                return zy11Var;
            case 19:
                Object c = ((hi30) obj).a.c();
                if (!((gi30) c).b) {
                    c = null;
                }
                gi30 gi30Var = (gi30) c;
                if (gi30Var != null) {
                    return new bi30(gi30Var.c, gi30Var.d);
                }
                return null;
            case 20:
                ((si30) obj).r(new ps20(29));
                return zy11Var;
            case 21:
                m020 m020Var = ((ti30) obj).d;
                if (m020Var != null) {
                    m020Var.invoke();
                }
                return zy11Var;
            case 22:
                return (d) ((bpw) obj).b;
            case 23:
                sj30 sj30Var = (sj30) obj;
                com.yandex.go.payments.superapp.payment.b bVar2 = sj30Var.a;
                u32.a.getClass();
                return bVar2.a("transport_external", t32.b, new l90(), new uba0((cz51) null, new uk10(sj30Var), (nsd0) null, (com.yandex.go.payments.paymentlist.domain.subtitles.replacement.b) null, (w9a0) null, 61));
            case 24:
                on2 on2Var = ((com.yandex.go.masstransit.sdk.ble.impl.repository.b) obj).b;
                on2Var.getClass();
                return (PaymentBleApi) on2Var.a(GoApiName.TaxiV4, PaymentBleApi.class);
            case 25:
                Content$lambda$0$0$0 = MtHeader.Content$lambda$0$0$0((MtHeader) obj);
                return Content$lambda$0$0$0;
            case 26:
                com.yandex.go.payments.superapp.payment.b bVar3 = ((qr30) obj).a;
                u32.a.getClass();
                return bVar3.a("transport", t32.b, new l90(), uba0.g);
            case 27:
                _init_$lambda$1 = MtRoutesModalView._init_$lambda$1((MtRoutesModalView) obj);
                return _init_$lambda$1;
            case 28:
                vx30 vx30Var = (vx30) ((fl10) obj).a;
                vx30Var.z((m950) vx30Var.O.get(), new rx30(vx30Var));
                return zy11Var;
            default:
                sy30 sy30Var = (sy30) obj;
                List list2 = sy30Var.d;
                return a.m0(a.J(sy30Var.c, list2.size()), list2);
        }
    }
}
