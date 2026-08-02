package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.payments.shared.members.invitation.InvitationView;
import com.yandex.go.payments.shared.v;
import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.PromoState;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.button.DiscountsButtonAction;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.cache.DashboardSingleProductCacheSchema;
import flex.feature.flexoverlaycontroller.decorviewprovider.DecorViewLifecycle;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.a;
import retrofit2.Call;
import retrofit2.Response;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.eatskit.dto.ErrorType;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.perf.b;
import ru.yandex.taxi.sharedpayments.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class j0g implements dlg, j7w0, xyg, rt41, yk7, xfi0, rdq0, t52, qty, c7l {
    public final Object a;
    public final Object b;

    public j0g(FragmentActivity fragmentActivity, Lifecycle lifecycle) {
        this.a = new LinkedHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        if (!fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            this.b = fragmentActivity;
            handler.post(new zvg(2, this, lifecycle));
            return;
        }
        h5z0.a.d(fragmentActivity + " is destroyed", new Object[0]);
    }

    public static String g(List list) {
        return list.size() == 1 ? q5z.F((Address) list.get(0)) : !list.isEmpty() ? q5z.l(list) : "";
    }

    public static Pair h(Fragment fragment, Fragment fragment2, ViewGroup viewGroup) {
        FragmentManager childFragmentManager;
        List f;
        Fragment fragment3;
        Dialog dialog;
        Window window;
        try {
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            KeyEvent.Callback decorView = (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            Pair pair = viewGroup2 != null ? new Pair(dialogFragment, viewGroup2) : new Pair(fragment2, viewGroup);
            Fragment fragment4 = (Fragment) pair.getFirst();
            ViewGroup viewGroup3 = (ViewGroup) pair.getSecond();
            return (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null || (f = childFragmentManager.c.f()) == null || (fragment3 = (Fragment) a.b0(f)) == null) ? new Pair(fragment4, viewGroup3) : h(fragment3, fragment4, viewGroup3);
        } catch (IllegalStateException unused) {
            return new Pair(fragment2, viewGroup);
        }
    }

    public static void y(j0g j0gVar, String str, Throwable th, int i) {
        if ((i & 4) != 0) {
            th = null;
        }
        rje.l(dzh0.ybsdk_webview_documents_download_failed, (Context) j0gVar.a);
        nl91.g(null, null, "Download failed", null, th, str, null, null, null, null, 1992);
    }

    public void A(String str, wlf0 wlf0Var, String str2) {
        b1 b1Var = (b1) this.b;
        boolean z = wlf0Var.j;
        String str3 = wlf0Var.e;
        String str4 = wlf0Var.f;
        String value = (z ? PromoState.ACTIVE : PromoState.NO_ACTIVE).getValue();
        int hashCode = str.hashCode();
        if (hashCode != -958641558) {
            if (hashCode != 79860977) {
                if (hashCode == 1125016702 && str.equals("ButtonTapped")) {
                    b1Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (str4 != null) {
                        hashMap.put("promocode", str4);
                    }
                    if (str3 != null) {
                        hashMap.put(Constants.KEY_SERVICE, str3);
                    }
                    if (value != null) {
                        hashMap.put(ClidProvider.STATE, value);
                    }
                    if (str2 != null) {
                        hashMap.put("type_button", str2);
                    }
                    b1Var.a.a("DiscountDescriptionCard.ButtonTapped", hashMap, 1, new HashMap());
                }
            } else if (str.equals("Shown")) {
                b1Var.getClass();
                HashMap hashMap2 = new HashMap();
                if (str4 != null) {
                    hashMap2.put("promocode", str4);
                }
                if (str3 != null) {
                    hashMap2.put(Constants.KEY_SERVICE, str3);
                }
                if (value != null) {
                    hashMap2.put(ClidProvider.STATE, value);
                }
                b1Var.a.a("DiscountDescriptionCard.Shown", hashMap2, 1, new HashMap());
            }
        } else if (str.equals("Dismiss")) {
            b1Var.getClass();
            HashMap hashMap3 = new HashMap();
            if (str4 != null) {
                hashMap3.put("promocode", str4);
            }
            if (str3 != null) {
                hashMap3.put(Constants.KEY_SERVICE, str3);
            }
            if (value != null) {
                hashMap3.put(ClidProvider.STATE, value);
            }
            b1Var.a.a("DiscountDescriptionCard.Dismiss", hashMap3, 1, new HashMap());
        }
        if (str.equals("ButtonTapped") && jl40.l(str2, "activate_promocode")) {
            b1Var.getClass();
            HashMap hashMap4 = new HashMap();
            if (str4 != null) {
                hashMap4.put("promocode", str4);
            }
            if (str3 != null) {
                hashMap4.put(Constants.KEY_SERVICE, str3);
            }
            if (value != null) {
                hashMap4.put(ClidProvider.STATE, value);
            }
            b1Var.a.a("DiscountDescriptionCard.PromoCodeTapped", hashMap4, 1, new HashMap());
        }
    }

    public void B(f4c0 f4c0Var) {
        wyi wyiVar = (wyi) this.a;
        Point point = (Point) f4c0Var.h;
        TaxiMapView taxiMapView = wyiVar.b;
        if (taxiMapView == null || f4c0Var.r == null) {
            return;
        }
        f4c0Var.F(taxiMapView.worldToScreen(point));
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        int i = cvh.a[bgq0Var.c.ordinal()];
        dvh dvhVar = (dvh) this.a;
        if (i == 1) {
            pj pjVar = (pj) dvhVar.c.b;
            pjVar.getClass();
            pjVar.a.a("CopypastApprovalCard.Contacts.DoneButtonTapped", new HashMap(), 1, new HashMap());
        } else {
            pj pjVar2 = (pj) dvhVar.c.b;
            pjVar2.getClass();
            pjVar2.a.a("CopypastApprovalCard.Contacts.UserSelected", new HashMap(), 1, new HashMap());
        }
        ((bhh) this.b).invoke(bgq0Var);
    }

    @Override // defpackage.j7w0
    public void a(d6j0 d6j0Var) {
        ErrorType errorType;
        yy80 yy80Var = (yy80) ((wwf) this.a).c;
        String str = null;
        String obj = (d6j0Var == null || (errorType = d6j0Var.e) == null) ? null : errorType.toString();
        String str2 = d6j0Var != null ? d6j0Var.b : null;
        b bVar = yy80Var.j;
        String c = bVar.c();
        zf zfVar = yy80Var.e;
        String analyticsName = bVar.b().getAnalyticsName();
        if (obj != null && obj.length() > 0) {
            str = obj;
        }
        zfVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("error_type", str);
        }
        if (str2 != null) {
            hashMap.put("error_message", str2);
        }
        hashMap.put("app_launch_type", analyticsName);
        zfVar.a.a("DebtsOrderHistory.Error", hashMap, 1, x4e.q(hashMap, "time_since_app_launch_sec", c, "timeSinceAppLaunch", c));
    }

    public void b(tls tlsVar) {
        ViewGroup m = m();
        if (m != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
            Integer valueOf = Integer.valueOf(m.getId());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(tlsVar);
        }
    }

    public void c(TaxiMapView taxiMapView) {
        if (((azi) ((bzi) this.b).a.b()).b) {
            wyi wyiVar = (wyi) this.a;
            if (tje.J(wyiVar.a)) {
                wyiVar.b = taxiMapView;
            }
        }
    }

    @Override // defpackage.t52
    public void d(int i, boolean z) {
    }

    public boolean e(String str) {
        return s().a.contains(str);
    }

    @Override // defpackage.t52
    public void i(float f, boolean z, View view) {
        DeliveryCommonCameraModalViewKt$provideCameraModalView$1 deliveryCommonCameraModalViewKt$provideCameraModalView$1 = (DeliveryCommonCameraModalViewKt$provideCameraModalView$1) this.a;
        deliveryCommonCameraModalViewKt$provideCameraModalView$1.lastSlideOffset = f;
        FrameLayout frameLayout = (FrameLayout) this.b;
        boolean z2 = false;
        int height = frameLayout != null ? frameLayout.getHeight() : 0;
        if (f < 0.95f && height > 0) {
            z2 = true;
        }
        deliveryCommonCameraModalViewKt$provideCameraModalView$1.updateBottomSectionShadowAnimated(z2);
    }

    @Override // defpackage.j7w0
    public void j() {
        yy80 yy80Var = (yy80) ((wwf) this.a).c;
        lug lugVar = (lug) this.b;
        String str = lugVar.a;
        OverdraftContext overdraftContext = lugVar.b;
        zf zfVar = yy80Var.e;
        zfVar.getClass();
        zfVar.a.a("DebtsOrderHistory.Shown", new HashMap(), 1, new HashMap());
        if (str.length() > 0) {
            t61 t61Var = yy80Var.g;
            String b = yy80.b(overdraftContext);
            boolean z = yy80Var.d().c;
            boolean e = yy80Var.e();
            boolean f = yy80Var.f();
            t61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(MetaDataField.SCREEN_FIELD, b);
            oo31.q(z, hashMap, "has_overdraft", e, "is_card_available");
            hashMap.put("is_cash_available", Boolean.valueOf(f));
            hashMap.put("order_id", str);
            t61Var.a.a("DebtOrderInfo.Shown", hashMap, 1, new HashMap());
        }
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        ((q7h) this.b).a.execute(new p7h(0, this, (yk7) this.a, th));
    }

    @Override // defpackage.rt41
    public void l() {
        ((SslErrorHandler) this.a).proceed();
    }

    public ViewGroup m() {
        Window window;
        FragmentManager supportFragmentManager;
        List f;
        Object obj = this.b;
        FragmentActivity fragmentActivity = (FragmentActivity) obj;
        View view = null;
        Pair h = h((fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) ? null : (Fragment) a.b0(f), null, null);
        Fragment fragment = (Fragment) h.getFirst();
        ViewGroup viewGroup = (ViewGroup) h.getSecond();
        if (fragment != null && viewGroup != null) {
            fragment.getLifecycle().a(new yyg(this, viewGroup.getId()));
        }
        if (viewGroup != null) {
            return viewGroup;
        }
        FragmentActivity fragmentActivity2 = (FragmentActivity) obj;
        if (fragmentActivity2 != null && (window = fragmentActivity2.getWindow()) != null) {
            view = window.getDecorView();
        }
        return (ViewGroup) view;
    }

    public olg n() {
        com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) this.a;
        return new olg(bVar.b().getAction(), bVar.b().getProducts(), bVar.b().getEnabled(), bVar.b().getVisitsBetweenOnboardingAnimation());
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        ((q7h) this.b).a.execute(new d1(29, this, (yk7) this.a, response));
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        boolean z;
        z = ((Default3DSWebView) this.b).isDebug;
        SslErrorHandler sslErrorHandler = (SslErrorHandler) this.a;
        if (z) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        int i3 = i + i2;
        ArrayList arrayList = (ArrayList) this.a;
        int size = i3 > arrayList.size() ? arrayList.size() - i2 : i;
        ((zik) this.b).f(i, arrayList.subList(size, i2 + size));
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        onRemoved(i, 1);
        onInserted(i2, 1);
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ((zik) this.b).h(i);
        }
    }

    public InvitationView p() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        xnr0 xnr0Var = (xnr0) this.b;
        zzf zzfVar = c0gVar.A.a.a;
        hdu hduVar = new hdu((oz01) zzfVar.la.get(), (zuj0) zzfVar.W.get());
        v W2 = c0gVar.W2();
        ycq0 R2 = c0gVar.R2();
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        g V1 = c0gVar.V1();
        q5z.h(V1);
        c cVar = (c) c0gVar.A.a.J3.get();
        q5z.h(cVar);
        return new InvitationView(e2, new cww(xnr0Var, hduVar, W2, R2, l2, V1, cVar));
    }

    public bgq0 q(String str) {
        gsi gsiVar = (gsi) this.b;
        if (str == null || !gsiVar.g(str)) {
            return bgq0.f;
        }
        return new bgq0(gsiVar.e(str).h, ((h) ((vp21) this.a)).Og(), SelectedFrom.STANDALONE, UUID.randomUUID().toString());
    }

    public boolean r() {
        return ((CommonFeatureFlag) ((com.ybsdk.rconfig.b) this.a).d(wlp.j0).getData()).isEnabled();
    }

    public shg s() {
        DashboardSingleProductCacheSchema dashboardSingleProductCacheSchema = (DashboardSingleProductCacheSchema) ((com.ybsdk.rconfig.b) this.a).d(nlg.a).getData();
        int version = dashboardSingleProductCacheSchema.getVersion();
        List<String> enabledFor = dashboardSingleProductCacheSchema.getEnabledFor();
        long slowUpdateNoticeDelayMs = dashboardSingleProductCacheSchema.getSlowUpdateNoticeDelayMs();
        Boolean postponeScreenAnimationEnabled = dashboardSingleProductCacheSchema.getPostponeScreenAnimationEnabled();
        return new shg(version, slowUpdateNoticeDelayMs, enabledFor, postponeScreenAnimationEnabled != null ? postponeScreenAnimationEnabled.booleanValue() : false);
    }

    public String t() {
        dwb dwbVar = (dwb) ((cwb) this.b);
        List a = dwbVar.a();
        pex0 m = ((k) ((wiq0) this.a)).m();
        boolean z = m != null ? m.B0.a : false;
        if (!z || !v() || !dwbVar.c()) {
            return (z && v()) ? a.size() > 1 ? q5z.k(a) : a.size() == 1 ? q5z.x((Address) a.get(0)) : "" : g(a);
        }
        List A0 = a.A0(a, 1);
        return A0.size() > 1 ? q5z.k(A0) : A0.size() == 1 ? q5z.x((Address) A0.get(0)) : "";
    }

    public boolean u() {
        return ((CommonFeatureFlag) ((com.ybsdk.rconfig.b) this.b).d(wlp.T0).getData()).isEnabled();
    }

    public boolean v() {
        return ((dwb) ((cwb) this.b)).e();
    }

    public String w(DrivingRoute drivingRoute) {
        if (drivingRoute == null) {
            return "";
        }
        return g8e.p(((mg50) this.b).a((long) drivingRoute.getMetadata().getWeight().getTimeWithTraffic().getValue()), " · ", hua1.d((zuj0) this.a, drivingRoute.getMetadata().getWeight().getDistance().getValue()));
    }

    public void x(int i) {
        List list = (List) ((LinkedHashMap) this.a).get(Integer.valueOf(i));
        if (list != null) {
            Iterator it = a.J0(list).iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(DecorViewLifecycle.DETACH);
            }
        }
    }

    public void z(String str, wlf0 wlf0Var, DiscountsButtonAction discountsButtonAction) {
        String str2;
        ((q501) this.a).getClass();
        if (discountsButtonAction == null) {
            str2 = null;
        } else {
            int i = wpj.a[discountsButtonAction.ordinal()];
            if (i == 1) {
                str2 = "show_summary";
            } else if (i == 2) {
                str2 = "remove_promocode";
            } else if (i == 3) {
                str2 = "add_card";
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                str2 = "select_payment_type";
            }
        }
        A(str, wlf0Var, str2);
    }

    public /* synthetic */ j0g(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ j0g(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public j0g(Context context) {
        ArrayList arrayList;
        List W;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("pref_key_recent_emoji", null);
        if (string != null) {
            W = evu0.W(string, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            arrayList = new ArrayList(W);
        } else {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
    }
}
