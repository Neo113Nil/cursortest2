package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.safety.center.safetycenter_web.b;
import com.yandex.go.scooters.qr.domain.ScootersQrDarknessInteractor$special$$inlined$simpleCallbackApiToFlow$1;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.payment.divkit.usecases.t;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.model.FavoritesCategoryModel$Category;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes13.dex */
public final class krl0 implements kvl0, ryj0, qur, j4u, ca20, o1s0, jg5, aor0 {
    public Object a;
    public final Object b;

    public krl0(djt0 djt0Var, a3v a3vVar, ShortcutsMainScreen shortcutsMainScreen) {
        this.a = shortcutsMainScreen;
        this.b = a3vVar;
        View a = ((ejt0) djt0Var).a();
        if (a == null) {
            jst.e.r("Cannot find a root view for BaseAddressSearchMainScreenHolder", new IllegalStateException());
            return;
        }
        ViewGroup viewGroup = (ViewGroup) a.findViewById(peh0.main_screen_container);
        viewGroup.removeAllViews();
        viewGroup.addView(shortcutsMainScreen);
    }

    public static void m(Context context, File file) {
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".PlusSdkFileProvider", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.setType("text/plain");
        intent.setFlags(1);
        Intent createChooser = Intent.createChooser(intent, null);
        createChooser.addFlags(SelfTester_JCP.IMITA);
        context.startActivity(createChooser);
    }

    @Override // defpackage.o1s0
    public yaf0 a() {
        return new vaf0((String) this.a, ((ghf) this.b).b(), null);
    }

    public void b(String str, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, Integer num, String str2) {
        int i = wkn0.a[feedbackSettingsParams$Screen.ordinal()];
        if (i == 1) {
            oso0 oso0Var = (oso0) this.a;
            String a = d2b1.a(str);
            String a2 = d2b1.a(str2);
            oso0Var.getClass();
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put("order_id", a);
            }
            if (num != null) {
                hashMap.put("newbie_progress", num);
            }
            if (a2 != null) {
                hashMap.put("help_item_id", a2);
            }
            oso0Var.a.a("ScootersRideFeedback.Shown", hashMap, 1, new HashMap());
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        y3n0 y3n0Var = (y3n0) this.b;
        String a3 = d2b1.a(str);
        String a4 = d2b1.a(str2);
        y3n0Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (a3 != null) {
            hashMap2.put("order_id", a3);
        }
        if (num != null) {
            hashMap2.put("newbie_progress", num);
        }
        if (a4 != null) {
            hashMap2.put("help_item_id", a4);
        }
        y3n0Var.a.a("ScootersCancelFeedback.Shown", hashMap2, 1, new HashMap());
    }

    public void c(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str, String str2, Integer num, String str3, ArrayList arrayList, List list, Integer num2) {
        int i = wkn0.a[feedbackSettingsParams$Screen.ordinal()];
        String str4 = null;
        if (i == 1) {
            oso0 oso0Var = (oso0) this.a;
            String a = d2b1.a(str);
            String a2 = d2b1.a(str2);
            String str5 = (str3 == null || evu0.J(str3)) ? null : str3;
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            String X = arrayList2 != null ? a.X(arrayList2, ",", null, null, null, 62) : null;
            if (list != null) {
                List list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    str4 = a.X(list2, ",", null, null, new v1n0(29), 30);
                }
            }
            oso0Var.getClass();
            HashMap hashMap = new HashMap();
            if (str5 != null) {
                hashMap.put("comment", str5);
            }
            if (a != null) {
                hashMap.put("order_id", a);
            }
            if (X != null) {
                hashMap.put("photo_ids", X);
            }
            if (num != null) {
                hashMap.put("rating", num);
            }
            if (str4 != null) {
                hashMap.put("tag_ids", str4);
            }
            if (a2 != null) {
                hashMap.put("vehicle_id", a2);
            }
            if (num2 != null) {
                hashMap.put("newbie_progress", num2);
            }
            oso0Var.a.a("ScootersRideFeedback.Completed", hashMap, 1, new HashMap());
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        y3n0 y3n0Var = (y3n0) this.b;
        String a3 = d2b1.a(str);
        String a4 = d2b1.a(str2);
        String str6 = (str3 == null || evu0.J(str3)) ? null : str3;
        ArrayList arrayList3 = !arrayList.isEmpty() ? arrayList : null;
        String X2 = arrayList3 != null ? a.X(arrayList3, ",", null, null, null, 62) : null;
        if (list != null) {
            List list3 = !list.isEmpty() ? list : null;
            if (list3 != null) {
                str4 = a.X(list3, ",", null, null, new vkn0(0), 30);
            }
        }
        y3n0Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (str6 != null) {
            hashMap2.put("comment", str6);
        }
        if (a3 != null) {
            hashMap2.put("order_id", a3);
        }
        if (X2 != null) {
            hashMap2.put("photo_ids", X2);
        }
        if (str4 != null) {
            hashMap2.put("tag_ids", str4);
        }
        if (a4 != null) {
            hashMap2.put("vehicle_id", a4);
        }
        if (num2 != null) {
            hashMap2.put("newbie_progress", num2);
        }
        y3n0Var.a.a("ScootersCancelFeedback.Completed", hashMap2, 1, new HashMap());
    }

    public File d(File file, List list) {
        ((xkz) this.b).getClass();
        byte[] bytes = a.X(list, "\n", null, null, new iez(1), 30).getBytes(uza.a);
        File file2 = new File(file, "plus_pay_sdk.log");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2;
        } finally {
        }
    }

    public void e(ba20 ba20Var) {
        f69 f69Var = xi7.a;
        f69.k("handleDisableScreenSecurity", Collections.singletonList("ScreenSecurityHandler"));
        try {
            iep0 iep0Var = (iep0) this.a;
            if (iep0Var != null) {
                iep0Var.a();
            }
        } catch (Exception e) {
            f69 f69Var2 = xi7.a;
            xi7.a.m(g8e.o("Failed to disable screen security: ", e.getMessage()), null, Collections.singletonList("ScreenSecurityHandler"));
        }
        ba20Var.success(null);
    }

    public void f(ba20 ba20Var) {
        f69 f69Var = xi7.a;
        f69.k("handleEnableScreenSecurity", Collections.singletonList("ScreenSecurityHandler"));
        try {
            iep0 iep0Var = (iep0) this.a;
            if (iep0Var != null) {
                iep0Var.b();
            }
        } catch (Exception e) {
            f69 f69Var2 = xi7.a;
            xi7.a.m(g8e.o("Failed to enable screen security: ", e.getMessage()), null, Collections.singletonList("ScreenSecurityHandler"));
        }
        ba20Var.success(null);
    }

    public void g(Throwable th) {
        LinkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult linkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult = th == null ? LinkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult.OK : LinkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult.ERROR;
        z94 z94Var = ((AppAnalyticsReporter) this.a).G;
        String message = th != null ? th.getMessage() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, linkingAccountEvents$LinkingAccountListOfBanksScreenLoadedResult.getOriginalValue());
        if (message != null) {
            linkedHashMap.put("error", message);
        }
        com.ybsdk.core.analytics.a aVar = z94Var.a;
        byte[] bArr = y5e.J;
        byte[] bArr2 = new byte[43];
        for (int i = 0; i < 43; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        aVar.a(new String(bArr2, uza.a), linkedHashMap);
    }

    @Override // defpackage.j4u
    public GuidanceOwnerId getId() {
        return (GuidanceOwnerId) this.a;
    }

    public Serializable h(String str, eip eipVar, Address address, Continuation continuation) {
        Serializable j;
        FavoritesCategoryModel$Category favoritesCategoryModel$Category = eipVar.a;
        String str2 = eipVar.b;
        int i = i0m0.a[favoritesCategoryModel$Category.ordinal()];
        if (i == 1) {
            j = j(str2, PlaceType.HOME, address, continuation);
        } else if (i == 2) {
            j = j(str2, PlaceType.WORK, address, continuation);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            ((ul51) ((qmp) this.b)).getClass();
            j = ((ru.yandex.taxi.favorites.data.repo.a) this.a).b(z81.j(address.getAddress(), str, null, address.getDatumType(), 6), (ContinuationImpl) continuation);
        }
        return j;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        tem0 tem0Var = ((t) this.a).d;
        int i = 27;
        o8k0 o8k0Var = new o8k0(i, (luf) this.b, (PaymentKitError) obj);
        if (tem0Var.a) {
            o8k0Var.invoke();
        }
    }

    public Serializable j(String str, PlaceType placeType, Address address, Continuation continuation) {
        ((ul51) ((qmp) this.b)).getClass();
        return ((ru.yandex.taxi.favorites.data.repo.a) this.a).b(z81.j(address.getAddress(), str, placeType, address.getDatumType(), 2), (ContinuationImpl) continuation);
    }

    @Override // defpackage.qur
    public void k(ArrayList arrayList) {
        r0 r0Var = ((obn0) this.b).b;
        r0Var.getClass();
        r0Var.m(null, arrayList);
    }

    public void l(k52 k52Var) {
        eul0 eul0Var = ((b) this.b).N;
        sul0 sul0Var = (sul0) this.a;
        sh41 sh41Var = eul0Var.c;
        Object obj = k52Var.b;
        if (!(obj instanceof c)) {
            jst.e.d("SafetyCenterWebAnalyticsInteractor", "Could not parse web event data: " + (obj != null ? obj.toString() : null));
            ((j) sh41Var).u(k52Var);
            return;
        }
        String eventValue = eul0.e(sul0Var.d).getEventValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
        linkedHashMap.put("source", qcx.c(eventValue));
        linkedHashMap.put("source_order_id", qcx.c(sul0Var.a));
        linkedHashMap.put("country", qcx.c(eul0Var.b()));
        linkedHashMap.put("zone_name", qcx.c(eul0Var.d()));
        ((j) sh41Var).u(new k52(k52Var.a, new c(linkedHashMap)));
    }

    public void n(Activity activity) {
        f69 f69Var = xi7.a;
        f69.k("updateActivity: " + (activity != null), Collections.singletonList("ScreenSecurityHandler"));
        iep0 iep0Var = (iep0) this.a;
        if (activity == null) {
            if (iep0Var != null) {
                f69.k("onActivityDestroyed", Collections.singletonList("ScreenSecurityManager"));
                iep0Var.b = null;
                return;
            }
            return;
        }
        if (iep0Var == null) {
            iep0 iep0Var2 = new iep0();
            iep0Var2.b = activity;
            this.a = iep0Var2;
            return;
        }
        f69.k("updateActivity: true", Collections.singletonList("ScreenSecurityManager"));
        if (iep0Var.c) {
            try {
                Window window = activity.getWindow();
                if (window != null) {
                    window.addFlags(8192);
                }
                f69.k("Screen security applied to new activity", Collections.singletonList("ScreenSecurityManager"));
            } catch (Exception e) {
                f69 f69Var2 = xi7.a;
                xi7.a.m(g8e.o("Failed to apply screen security to new activity: ", e.getMessage()), null, Collections.singletonList("ScreenSecurityManager"));
            }
        }
        iep0Var.b = activity;
    }

    @Override // defpackage.aor0
    public void onDismiss() {
        ((uor0) this.a).a.d();
        ((f600) this.b).g();
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        try {
            String str = x920Var.a;
            if (jl40.l(str, "enableScreenSecurity")) {
                f((ba20) da20Var);
            } else if (jl40.l(str, "disableScreenSecurity")) {
                e((ba20) da20Var);
            } else {
                ((ba20) da20Var).notImplemented();
            }
        } catch (Exception e) {
            f69 f69Var = xi7.a;
            xi7.a.m(g8e.o("onMethodCall error: ", e.getMessage()), null, Collections.singletonList("ScreenSecurityHandler"));
            ((ba20) da20Var).error("UNKNOWN_ERROR", e.getMessage(), e);
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        sm0 sm0Var = (sm0) obj;
        tem0 tem0Var = ((t) this.a).d;
        luf lufVar = (luf) this.b;
        if (tem0Var.a) {
            lufVar.invoke(new kyj0(sm0Var));
        }
    }

    @Override // defpackage.j4u
    public void stopGuidance() {
        ru.yandex.taxi.scooters.presentation.route_navigation.a aVar = (ru.yandex.taxi.scooters.presentation.route_navigation.a) this.b;
        r0 r0Var = aVar.I.a;
        r0Var.getClass();
        r0Var.m(null, wnj.a);
        qto0 qto0Var = aVar.F;
        Navigation navigation = qto0Var.a;
        if (navigation != null) {
            navigation.stopGuidance();
        }
        qto0Var.a = null;
        ehs0 ehs0Var = aVar.E;
        GuidanceOwnerId guidanceOwnerId = GuidanceOwnerId.SCOOTERS_NAVIGATION;
        j4u j4uVar = ehs0Var.a;
        if (guidanceOwnerId != (j4uVar != null ? j4uVar.getId() : null)) {
            return;
        }
        ehs0Var.a = null;
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        FragmentActivity fragmentActivity;
        ybp0 ybp0Var = (ybp0) this.b;
        if ((ig5Var instanceof b2r0) && (fragmentActivity = (FragmentActivity) ((rbs) this.a).a()) != null) {
            Float f = ((b2r0) ig5Var).a;
            if (f != null) {
                float floatValue = f.floatValue();
                Window window = fragmentActivity.getWindow();
                if (window == null) {
                    return;
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                float f2 = attributes.screenBrightness;
                if (ybp0Var.a == null) {
                    ybp0Var.a = Float.valueOf(f2);
                }
                attributes.screenBrightness = y6i0.c(floatValue, 0.0f, 1.0f);
                window.setAttributes(attributes);
                return;
            }
            Float f3 = ybp0Var.a;
            if (f3 != null) {
                float floatValue2 = f3.floatValue();
                Window window2 = fragmentActivity.getWindow();
                if (window2 == null) {
                    return;
                }
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.screenBrightness = floatValue2;
                window2.setAttributes(attributes2);
                ybp0Var.a = null;
            }
        }
    }

    public /* synthetic */ krl0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public krl0(tt5 tt5Var) {
        ea20 ea20Var = new ea20(tt5Var, "in-app-calls/screen-security");
        this.b = ea20Var;
        f69 f69Var = xi7.a;
        f69.k("init", Collections.singletonList("ScreenSecurityHandler"));
        ea20Var.b(this);
    }

    public krl0(Activity activity) {
        this.b = kotlin.a.b(LazyThreadSafetyMode.NONE, new r4b(activity, 2));
    }

    public krl0(kg51 kg51Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
        this.b = pvn.a;
    }

    public /* synthetic */ krl0(h55 h55Var, Object obj) {
        this.b = h55Var;
        this.a = obj;
    }

    public krl0(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
        this.b = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    public krl0(SensorManager sensorManager, tse tseVar) {
        this.a = sensorManager;
        this.b = e.O(e.t(e.g(new ScootersQrDarknessInteractor$special$$inlined$simpleCallbackApiToFlow$1(new iin0(23, this), null))), tseVar, wsr0.a(xsr0.a, 3), 0);
    }

    public krl0(ru.yandex.taxi.scooters.presentation.route_navigation.a aVar) {
        this.b = aVar;
        this.a = GuidanceOwnerId.SCOOTERS_NAVIGATION;
    }
}
