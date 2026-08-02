package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.account.user_verification.domain.i;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.domain.interactor.c;
import com.yandex.go.multimodal_route.ui.transport_tracking.f;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import com.yandex.go.payments.transport.navigation.e;
import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import com.yandex.go.trusted_contacts.ui.error.TrustedContactsErrorModalView;
import com.yandex.go.ui.d;
import com.yandex.go.user_profile.settings.main.UserInfoView;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.internal.authorized.h;
import com.yandex.payment.sdk.transportcards.nfc.a;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardSlideableView;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment;
import java.math.BigInteger;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final /* synthetic */ class pv01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pv01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 binding$lambda$2$lambda$1;
        zy11 zy11Var;
        String str;
        View insetsType$lambda$0;
        View insetsType$lambda$02;
        zy11 showPhoto$lambda$0;
        StatusAvailability findByType;
        int i = this.a;
        int i2 = 9;
        ts51 ts51Var = null;
        ts51Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                binding$lambda$2$lambda$1 = TransfersDashboardSlideableView.binding$lambda$2$lambda$1((TransfersDashboardSlideableView) obj);
                return binding$lambda$2$lambda$1;
            case 1:
                zy11Var = TransportCardsActivity.setupLoading$lambda$0((FrameLayout) obj);
                return zy11Var;
            case 2:
                return b.i(new Pair("type", "onCurrentRouteChanged"), new Pair(CRLReasonCodeExtension.REASON, ((RouteChangeReason) obj).name().toLowerCase(Locale.ROOT)));
            case 3:
                e eVar = (e) obj;
                tj30 tj30Var = eVar.J;
                t411 t411Var = (t411) eVar.x;
                if (t411Var != null && (str = t411Var.b) != null) {
                    ts51Var = new ts51(str);
                }
                mc mcVar = tj30Var.a;
                return new sj30((com.yandex.go.payments.superapp.payment.b) mcVar.a.get(), (n6a0) mcVar.b.get(), ts51Var);
            case 4:
                f fVar = (f) obj;
                z711 z711Var = fVar.b;
                ru.yandex.taxi.masstransit.detailedroute.ui.f fVar2 = fVar.a;
                a811 a811Var = z711Var.a;
                return new y711(fVar2, i5m.a(a811Var.a), a811Var.b);
            case 5:
                a aVar = (a) obj;
                rub1 rub1Var = aVar.h;
                if (rub1Var != null) {
                    if (rub1Var instanceof qf11) {
                        aVar.g(((qf11) rub1Var).a);
                    } else if (rub1Var instanceof pf11) {
                        aVar.f(((pf11) rub1Var).a);
                    } else {
                        if (!(rub1Var instanceof rf11)) {
                            w511.b();
                            return null;
                        }
                        aVar.i(((rf11) rub1Var).a);
                    }
                }
                return zy11.a;
            case 6:
                avj0 avj0Var = (avj0) ((zuj0) ((cjw0) obj).b);
                return new wg11(avj0Var.h(kyh0.error_occurred), avj0Var.h(kyh0.unknown_error_description), avj0Var.h(kyh0.try_again), ErrorScreenAction.TRY_AGAIN);
            case 7:
                insetsType$lambda$0 = TrustedContactsErrorModalView.insetsType$lambda$0((TrustedContactsErrorModalView) obj);
                return insetsType$lambda$0;
            case 8:
                return ((jbh) ((rqo) ((a201) obj).b)).f(SimplePersistentBooleanExperiment.TRUSTED_CONTACTS_V2);
            case 9:
                insetsType$lambda$02 = TrustedContactsModalView.insetsType$lambda$0((TrustedContactsModalView) obj);
                return insetsType$lambda$02;
            case 10:
                ((wyo0) obj).r(new qu(i2));
                return zy11.a;
            case 11:
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("manufacturer", Build.MANUFACTURER);
                mapBuilder.put("model", Build.MODEL);
                mapBuilder.put("android_version", Build.VERSION.RELEASE);
                mapBuilder.put("android_sdk", Integer.valueOf(Build.VERSION.SDK_INT));
                Object systemService = ((Context) ((hlx0) obj).b).getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                mapBuilder.put("ram_class", Integer.valueOf(activityManager != null ? activityManager.getMemoryClass() : 0));
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                String str2 = currentWebViewPackage != null ? currentWebViewPackage.versionName : null;
                if (str2 != null) {
                    mapBuilder.put("webview_version", str2);
                }
                return mapBuilder.j();
            case 12:
                lv11 lv11Var = ((com.yandex.go.ultima_mode.preferences.a) obj).b;
                return (Boolean) lv11Var.c.getValue(lv11Var, lv11.d[2]);
            case 13:
                GoFrameLayout goFrameLayout = new GoFrameLayout(((ListItemComponent) ((View) ((m0o) obj).R)).getContext(), null, 0, 0, 14, null);
                goFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(tje.u(56, goFrameLayout.getContext()), tje.u(56, goFrameLayout.getContext())));
                return goFrameLayout;
            case 14:
                return ru.yandex.taxi.camera.ml.a.b(((com.yandex.go.universal_qr_scanner.domain.camera.a) obj).a);
            case 15:
                return oyr.p("Failed to find config for point type `", ((k821) obj).z.b.a, "` in `change_source_point` experiment");
            case 16:
                return new z921(((UpgradeEditFragment.UpgradeEditScreenParams) obj).getField(), ja21.i, ob21.a);
            case 17:
                return WebSettings.getDefaultUserAgent(((com.yandex.urbanads.internal.network.b) obj).a.getApplicationContext());
            case 18:
                Context context = onp0.a;
                return onp0.a(((h) obj).a);
            case 19:
                showPhoto$lambda$0 = UserInfoView.showPhoto$lambda$0((UserInfoView) obj);
                return showPhoto$lambda$0;
            case 20:
                zq21 zq21Var = (zq21) obj;
                jr21 jr21Var = zq21Var.I;
                UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint = ((yq21) zq21Var.n()).a;
                com.yandex.go.navigation.a aVar2 = new com.yandex.go.navigation.a(zq21Var);
                fn6 fn6Var = jr21Var.a;
                return new d(aVar2, userPhotoUploadingEntryPoint, (com.yandex.go.domain.interactor.d) ((xvf0) fn6Var.a).get(), (com.yandex.go.repositories.e) ((xvf0) fn6Var.d).get(), (v7j0) ((xvf0) fn6Var.e).get(), (g) ((xvf0) fn6Var.f).get(), (hit) ((xvf0) fn6Var.b).get(), (rq21) ((xvf0) fn6Var.c).get(), (hcp0) ((xvf0) fn6Var.h).get(), (eq21) ((fq21) fn6Var.i).get(), (i) ((icg) fn6Var.j).get(), (fjb0) ((icg) fn6Var.k).get(), (gjb0) ((icg) fn6Var.g).get(), (c) ((sk21) fn6Var.l).get());
            case 21:
                ((or21) obj).r(new qu(i2));
                return zy11.a;
            case 22:
                ((et21) obj).c.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 23:
                yt21 yt21Var = (yt21) obj;
                r0 r0Var = yt21Var.j;
                String str3 = yt21Var.i;
                if (r0Var.getValue() != null) {
                    return (it21) yt21Var.j.getValue();
                }
                st21 a = yt21Var.h.a(str3);
                if (a == null || (findByType = StatusAvailability.INSTANCE.findByType(a.d)) == null) {
                    return null;
                }
                String str4 = a.h;
                String str5 = a.g;
                clf clfVar = (str4 == null || str5 == null) ? null : new clf(str4, str5, a.i, a.j);
                long j = a.c;
                boolean z = a.e == 1;
                o430 o430Var = e3n.b;
                return new it21(str3, j, findByType, z, kp50.U(a.f, DurationUnit.SECONDS), clfVar);
            case 24:
                ((az21) obj).e.a();
                return zy11.a;
            case 25:
                return ((com.yandex.go.vault.flexsdk.descriptors.widget.actions.b) obj).b;
            case 26:
                return (pys) ((com.yandex.go.vault.router.c) obj).E.get();
            case 27:
                return new wx11(17, new l2m(((k331) obj).b, (uyg) null));
            case 28:
                LottieAnimationView lottieAnimationView = ((a431) obj).O;
                (lottieAnimationView != null ? lottieAnimationView : null).setRepeatCount(0);
                return zy11.a;
            default:
                ca31 ca31Var = (ca31) obj;
                return BigInteger.valueOf(ca31Var.a).shiftLeft(32).or(BigInteger.valueOf(ca31Var.b)).shiftLeft(32).or(BigInteger.valueOf(ca31Var.c));
        }
    }
}
