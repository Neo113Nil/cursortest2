package xsna;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.passkey.PasskeySignUpDelegateImpl;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.bridges.MethodScope;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkExtraPaymentOptions;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkMerchantInfo;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.config.ProductionUserInfoProvider;
import com.vk.superapp.vkpay.checkout.config.SandboxUserInfoProvider;
import com.vk.superapp.vkpay.checkout.config.UserInfoProvider;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutParams;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bbv0;
import xsna.bex0;
import xsna.lvv0;
import xsna.t5y;

/* compiled from: JsVkBrowserCoreBridge.kt */
/* loaded from: classes6.dex */
public abstract class x6y extends v1y implements q2y {
    public static final Long[] C = {7058363L, 7787819L};
    public final bpn0 A;
    public final bpn0 B;
    public fvv0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public boolean u;
    public xc80 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public final class a {
        public C3977a a;

        /* compiled from: JsVkBrowserCoreBridge.kt */
        /* renamed from: xsna.x6y$a$a, reason: collision with other inner class name */
        public final class C3977a implements tb0 {
            public C3977a() {
            }

            @Override // xsna.tb0
            public final void onActivityResult(int i, int i2, Intent intent) {
                gvv0 view;
                Activity B0;
                a aVar = a.this;
                x6y x6yVar = x6y.this;
                fvv0 M = x6yVar.M();
                if (M == null || (view = M.getView()) == null || (B0 = view.B0()) == null) {
                    return;
                }
                new PasskeySignUpDelegateImpl(new y6y(x6yVar, aVar)).onActivityResult(B0, i, i2, intent);
            }
        }

        public a() {
        }

        public static final void a(a aVar) {
            fvv0 M;
            gvv0 view;
            ComponentCallbacks2 B0;
            if (aVar.a == null || (M = x6y.this.M()) == null || (view = M.getView()) == null || (B0 = view.B0()) == null) {
                return;
            }
            aeg0 aeg0Var = B0 instanceof aeg0 ? (aeg0) B0 : null;
            if (aeg0Var != null) {
                aeg0Var.yk(aVar.a);
            }
            aVar.a = null;
        }
    }

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((x6y) this.receiver).M();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((x6y) this.receiver).O((fvv0) obj);
        }
    }

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<VkAuthCredentials> {
        @Override // xsna.gzs
        public final VkAuthCredentials invoke() {
            return ((x6y) this.receiver).E();
        }
    }

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements wzs<AuthResult, Boolean, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(AuthResult authResult, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((x6y) this.receiver).N(authResult, booleanValue);
            return s3q0.a;
        }
    }

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<w25> {
        @Override // xsna.gzs
        public final w25 invoke() {
            return ((x6y) this.receiver).D();
        }
    }

    public x6y(fvv0 fvv0Var) {
        super((fvv0Var == null || !fvv0Var.o()) ? MethodScope.PUBLIC : MethodScope.INTERNAL);
        this.p = fvv0Var;
        this.q = new bpn0(new tbh(this, 27));
        this.r = new bpn0(new gbj(this, 21));
        this.s = new bpn0(new u3k(this, 23));
        this.t = new bpn0(new w8q(this, 16));
        this.w = new bpn0(new com.vk.movika.sdk.base.model.props.a(15));
        new bpn0(new f4(this));
        this.x = new bpn0(new z0h(this, 25));
        this.y = new bpn0(new drg(this, 24));
        this.z = new bpn0(new s6y(this, 0));
        this.A = new bpn0(new gzv(this, 2));
        this.B = new bpn0(new s1m(this, 19));
        new bpn0(new mxj(this, 24));
    }

    public static nmg0 H() {
        dgn0.d();
        return m7m.e();
    }

    public final g2y I() {
        return (g2y) this.z.getValue();
    }

    public final d3y J() {
        return (d3y) this.x.getValue();
    }

    public final s7y K() {
        return (s7y) this.y.getValue();
    }

    public j5y L() {
        return (j5y) this.w.getValue();
    }

    public fvv0 M() {
        return this.p;
    }

    public void N(AuthResult authResult, boolean z) {
        fvv0 M;
        gvv0 view;
        izs<lvv0, s3q0> ke;
        if (z || (M = M()) == null || (view = M.getView()) == null || (ke = view.ke()) == null) {
            return;
        }
        ke.invoke(new lvv0.a(authResult));
    }

    public void O(fvv0 fvv0Var) {
        this.p = fvv0Var;
    }

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppAccelerometerStart(String str) {
        J().VKWebAppAccelerometerStart(str);
    }

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppAccelerometerStop(String str) {
        J().VKWebAppAccelerometerStop(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddCard(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddToChat(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddToCommunity(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddToFavorites(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddToHomeScreen(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAddToHomeScreenInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAllowMessagesFromGroup(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAllowNotifications(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppAskWorkoutsPermissions(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppAuthByExchangeToken(String str) {
        I().VKWebAppAuthByExchangeToken(str);
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppAuthPauseRequests(String str) {
        I().VKWebAppAuthPauseRequests(str);
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppAuthRestore(String str) {
        I().VKWebAppAuthRestore(str);
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppAuthResumeRequests(String str) {
        I().VKWebAppAuthResumeRequests(str);
        ((wvs) this.t.getValue()).a();
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppBecameInteractive(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCanAddVirtualCard(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCanShowAltPayMethod(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCaptureProtection(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCheckAllowedScopes(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCheckBannerAd(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCheckNativeAds(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppClose(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppConfirmUserByService(String str) {
        I().VKWebAppConfirmUserByService(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppConversionHit(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCopyText(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppCreateHash(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppCustomMessage(String str) {
        J().VKWebAppCustomMessage(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppDenyNotifications(String str);

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStart(String str) {
        J().VKWebAppDeviceMotionStart(str);
    }

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppDeviceMotionStop(String str) {
        J().VKWebAppDeviceMotionStop(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppDownloadFile(String str) {
        if (u(JsApiMethodType.DOWNLOAD_FILE, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String optString = jSONObject.optString(CommonUrlParts.REQUEST_ID);
                final String string = jSONObject.getString("url");
                final String string2 = jSONObject.getString("filename");
                final Context context = this.l;
                if (context != null) {
                    qro0.c(new gzs() { // from class: xsna.u6y
                        @Override // xsna.gzs
                        public final Object invoke() {
                            final Context context2 = context;
                            Resources resources = context2.getResources();
                            final String str2 = string2;
                            String string3 = resources.getString(R.string.vk_apps_download_message, str2);
                            final x6y x6yVar = this;
                            AlertDialog.Builder message = new AlertDialog.Builder(x6yVar.l).setTitle(R.string.vk_apps_download).setMessage(string3);
                            final String str3 = string;
                            final String str4 = optString;
                            message.setPositiveButton(R.string.vk_apps_download_ok, new DialogInterface.OnClickListener() { // from class: xsna.w6y
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    final Context context3 = context2;
                                    final String str5 = str3;
                                    final String str6 = str2;
                                    final String str7 = str4;
                                    final x6y x6yVar2 = x6yVar;
                                    gzs<s3q0> gzsVar = new gzs() { // from class: xsna.t6y
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            io.reactivex.rxjava3.core.q d2;
                                            final String str8 = str5;
                                            boolean isValidUrl = URLUtil.isValidUrl(str8);
                                            int i2 = 1;
                                            final Context context4 = context3;
                                            final String str9 = str6;
                                            if (isValidUrl) {
                                                HashMap<Long, io.reactivex.rxjava3.subjects.f<Pair<Boolean, Integer>>> hashMap = y7n0.a;
                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str8));
                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str9);
                                                request.setNotificationVisibility(1);
                                                request.allowScanningByMediaScanner();
                                                d2 = new io.reactivex.rxjava3.subjects.f();
                                                Object systemService = context4.getSystemService("download");
                                                DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
                                                if (downloadManager != null) {
                                                    final long enqueue = downloadManager.enqueue(request);
                                                    y7n0.a.put(Long.valueOf(enqueue), d2);
                                                    new io.reactivex.rxjava3.internal.operators.observable.c0(d2, io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.x7n0
                                                        @Override // io.reactivex.rxjava3.functions.a
                                                        public final void run() {
                                                            y7n0.a.remove(Long.valueOf(enqueue));
                                                        }
                                                    });
                                                }
                                            } else {
                                                HashMap<Long, io.reactivex.rxjava3.subjects.f<Pair<Boolean, Integer>>> hashMap2 = y7n0.a;
                                                d2 = new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.w7n0
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        Uri fromFile;
                                                        Uri uri;
                                                        int i3 = Build.VERSION.SDK_INT;
                                                        Context context5 = context4;
                                                        String str10 = str9;
                                                        if (i3 >= 29) {
                                                            ContentResolver contentResolver = context5.getContentResolver();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put("_display_name", str10);
                                                            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                                                            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                                                            fromFile = contentResolver.insert(uri, contentValues);
                                                        } else {
                                                            fromFile = Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str10));
                                                        }
                                                        if (fromFile == null) {
                                                            throw new IllegalStateException("Can't create file");
                                                        }
                                                        OutputStream openOutputStream = context5.getContentResolver().openOutputStream(fromFile);
                                                        if (openOutputStream == null) {
                                                            throw new IllegalStateException("Can't open file");
                                                        }
                                                        openOutputStream.write(Base64.decode((String) j5g.i0(drm0.c0(str8, new String[]{StringUtils.COMMA}, 0, 6)), 0));
                                                        openOutputStream.close();
                                                        return s3q0.a;
                                                    }
                                                }).d(io.reactivex.rxjava3.core.q.T(new Pair(Boolean.TRUE, 100)));
                                            }
                                            x6y x6yVar3 = x6yVar2;
                                            io.reactivex.rxjava3.disposables.c subscribe = d2.subscribe(new m3y(new k82(13, x6yVar3, str7), i2), new f2u(new ire(x6yVar3, 22), 3));
                                            fvv0 M = x6yVar3.M();
                                            up2.j(subscribe, M != null ? M.getView() : null);
                                            return s3q0.a;
                                        }
                                    };
                                    if (gz80.a(34)) {
                                        gzsVar.invoke();
                                        return;
                                    }
                                    PermissionHelper permissionHelper = PermissionHelper.a;
                                    permissionHelper.getClass();
                                    permissionHelper.d(context3, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, gzsVar, new uoh(x6yVar2, 28));
                                }
                            }).setNegativeButton(R.string.vk_apps_download_cancel, new mop(x6yVar, 1)).setOnCancelListener(new nop(x6yVar, 1)).show();
                            return s3q0.a;
                        }
                    });
                }
            } catch (Exception unused) {
                bex0.a.a(this, JsApiMethodType.DOWNLOAD_FILE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppFlashGetInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppFlashSetLevel(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppForceHideHints(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppForceLogout(String str) {
        gvv0 view;
        izs<lvv0, s3q0> ke;
        if (u(JsApiMethodType.FORCE_LOGOUT, str)) {
            boolean optBoolean = str != null ? new JSONObject(str).optBoolean("show_login_password_screen") : false;
            fvv0 M = M();
            if (M == null || (view = M.getView()) == null || (ke = view.ke()) == null) {
                return;
            }
            ke.invoke(new lvv0.b(optBoolean, D().a, D().f, false));
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetCommunityAuthToken(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetCommunityToken(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetConfig(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetEmail(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetFriends(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetGeodata(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetGeodataPermission(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetGrantedPermissions(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetGroupInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetHealthConnectInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetLaunchParams(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetMyTrackerId(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetPermissions(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetPersonalCard(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetPhoneNumber(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppGetRestoreHash(String str) {
        I().VKWebAppGetRestoreHash(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetSteps(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetStepsPermissions(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetUserInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetWorkouts(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppGetWorkoutsPermissions(String str);

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGyroscopeStart(String str) {
        J().VKWebAppGyroscopeStart(str);
    }

    @Override // xsna.q2y, xsna.j4y
    @JavascriptInterface
    public void VKWebAppGyroscopeStop(String str) {
        J().VKWebAppGyroscopeStop(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppHideBannerAd(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppInit(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppIsMultiaccountAvailable(String str) {
        I().VKWebAppIsMultiaccountAvailable(str);
    }

    @Override // xsna.q2y, xsna.l5y
    @JavascriptInterface
    public void VKWebAppIsNativePaymentEnabled(String str) {
        n5y n5yVar = (n5y) this.r.getValue();
        x6y x6yVar = n5yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.IS_NATIVE_PAYMENT_ENABLED;
        if (x6yVar.u(jsApiMethodType, str)) {
            Context context = x6yVar.l;
            if (context == null) {
                x6yVar.y(jsApiMethodType);
                return;
            }
            sgn0 sgn0Var = e370.g;
            if (sgn0Var == null) {
                sgn0Var = null;
            }
            sgn0Var.b(context, true);
            sgn0 sgn0Var2 = e370.g;
            (sgn0Var2 != null ? sgn0Var2 : null).c().q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pv2(new j4x(n5yVar, 1), 23), new m5y(new r9k(n5yVar, 20), 0));
        }
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppIsPasskeyAvailable(String str) {
        J().VKWebAppIsPasskeyAvailable(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppJoinGroup(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppKeepScreenOn(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLeaveGroup(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppLibverifyCancel(String str) {
        ((q4y) this.A.getValue()).VKWebAppLibverifyCancel(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppLibverifyCheck(String str) {
        ((q4y) this.A.getValue()).VKWebAppLibverifyCheck(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppLibverifyResend(String str) {
        ((q4y) this.A.getValue()).VKWebAppLibverifyResend(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppLibverifyStart(String str) {
        ((q4y) this.A.getValue()).VKWebAppLibverifyStart(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppLibverifySupported(String str) {
        ((q4y) this.A.getValue()).VKWebAppLibverifySupported(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLocalStorageDelete(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLocalStorageGetMeta(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLocalStorageGetState(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLocalStorageRead(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppLocalStorageWrite(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppMakeInAppPurchase(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppNavigateToSettings(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppOpenApp(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppOpenCodeReader(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppOpenContacts(String str);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003f  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void VKWebAppOpenExternalLink(String str) {
        List list;
        fvv0 M;
        VkBridgeAnalytics E;
        JSONArray optJSONArray;
        if (!u(JsApiMethodType.OPEN_EXTERNAL_LINK, str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (e370.s != null) {
                b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_SUPERAPPKIT_OPEN_EXTERNAL_URL_MINIAPPS);
                JSONObject g = i != null ? i.g() : null;
                if (g != null && (optJSONArray = g.optJSONArray("app_ids")) != null) {
                    list = f370.J(optJSONArray);
                    M = M();
                    if (list.contains(Integer.valueOf(M == null ? (int) M.getAppId() : -1))) {
                        linkedHashMap.put("app_supported", Boolean.FALSE);
                        b7y.a(this, VkAppsErrors.Client.ACCESS_DENIED, linkedHashMap);
                        return;
                    }
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap.put("app_supported", bool);
                    try {
                        String str2 = (String) new eml(0).c().c;
                        linkedHashMap.put("csrf_created", bool);
                        String A = f370.A("url", new JSONObject(str));
                        if (A == null) {
                            linkedHashMap.put("url_component_created_initially", Boolean.FALSE);
                            b7y.a(this, VkAppsErrors.Client.INVALID_PARAMS, linkedHashMap);
                            return;
                        }
                        linkedHashMap.put("url_component_created_initially", bool);
                        Uri build = jeq0.g(A).buildUpon().appendQueryParameter("vk_state", str2).build();
                        linkedHashMap.put("url_created_with_csrf", bool);
                        Intent addFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, build).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
                        Context context = this.m;
                        if (context == null) {
                            context = null;
                        }
                        if (addFlags.resolveActivity(context.getPackageManager()) == null) {
                            linkedHashMap.put("return_by_deeplink", Boolean.FALSE);
                            b7y.a(this, VkAppsErrors.Client.UNKNOWN_ERROR, linkedHashMap);
                            return;
                        }
                        t5y.a aVar = t5y.e;
                        synchronized (aVar) {
                            t5y.f = null;
                        }
                        fvv0 M2 = M();
                        if (t5y.f == null) {
                            synchronized (aVar) {
                                try {
                                    if (t5y.f == null) {
                                        t5y.f = new t5y(this, M2, str2, linkedHashMap);
                                    }
                                    s3q0 s3q0Var = s3q0.a;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        fvv0 M3 = M();
                        if (M3 != null && (E = M3.E()) != null) {
                            E.g(VkBridgeAnalytics.RegistrationEvent.EXTERNAL_LINK_MINIAPP_OPEN);
                        }
                        Context context2 = this.l;
                        if (context2 != null) {
                            context2.startActivity(addFlags);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        linkedHashMap.put("csrf_created", Boolean.FALSE);
                        b7y.a(this, VkAppsErrors.Client.UNKNOWN_ERROR, linkedHashMap);
                        return;
                    }
                }
            }
            list = EmptyList.b;
            M = M();
            if (list.contains(Integer.valueOf(M == null ? (int) M.getAppId() : -1))) {
            }
        } catch (JSONException unused2) {
            b7y.a(this, VkAppsErrors.Client.UNKNOWN_ERROR, linkedHashMap);
        }
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppOpenMultiaccountSwitcher(String str) {
        I().VKWebAppOpenMultiaccountSwitcher(str);
    }

    @JavascriptInterface
    public void VKWebAppOpenPackage(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_PACKAGE;
        if (u(jsApiMethodType, str)) {
            String optString = str != null ? new JSONObject(str).optString("package") : null;
            if (optString != null && !drm0.N(optString)) {
                Context context = this.m;
                if (context == null) {
                    context = null;
                }
                if (fvr.v(context, optString, true)) {
                    bex0.a.b(this, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                    return;
                }
            }
            bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        }
    }

    @Override // xsna.q2y, xsna.m7y
    @JavascriptInterface
    public void VKWebAppOpenPayForm(String str) {
        nr90 nr90Var = new nr90(this);
        if (u(JsApiMethodType.OPEN_PAY_FORM, str)) {
            qro0.c(new oe5(13, nr90Var, str));
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppOpenReportForm(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppPrivacyEditSuccess(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppRecommend(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppRedirect(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppRegisterPasskey(String str) {
        gvv0 view;
        Activity B0;
        gvv0 view2;
        ComponentCallbacks2 B02;
        if (u(JsApiMethodType.REGISTER_PASSKEY, str)) {
            a aVar = (a) this.B.getValue();
            x6y x6yVar = x6y.this;
            x6y x6yVar2 = x6y.this;
            fvv0 M = x6yVar.M();
            if (M == null || (view = M.getView()) == null || (B0 = view.B0()) == null) {
                return;
            }
            try {
                String optString = new JSONObject(str).optString("passkey_data");
                PasskeySignUpDelegateImpl passkeySignUpDelegateImpl = new PasskeySignUpDelegateImpl(new y6y(x6yVar2, aVar));
                fvv0 M2 = x6yVar.M();
                if (M2 != null && (view2 = M2.getView()) != null && (B02 = view2.B0()) != null) {
                    a.C3977a c3977a = aVar.new C3977a();
                    aVar.a = c3977a;
                    aeg0 aeg0Var = B02 instanceof aeg0 ? (aeg0) B02 : null;
                    if (aeg0Var != null) {
                        aeg0Var.Li(c3977a);
                    }
                }
                passkeySignUpDelegateImpl.registerPasskey(B0, optString);
            } catch (JSONException unused) {
                bex0.a.a(x6yVar2, JsApiMethodType.REGISTER_PASSKEY, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppRelatedPinCodeChanged(String str) {
        I().VKWebAppRelatedPinCodeChanged(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppResizeWindow(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppRetargetingPixel(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppSaveCredentials(String str) {
        I().VKWebAppSaveCredentials(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSecureTokenGet(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSecureTokenGetInfo(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSecureTokenRemove(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSecureTokenRequestAccess(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSecureTokenSet(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSendCustomEvent(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSendPayload(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSetLocation(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppSetViewSettings(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShare(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowActionMenu(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_ACTION_MENU;
        if (u(jsApiMethodType, str)) {
            c6y c6yVar = (c6y) this.s.getValue();
            c6yVar.getClass();
            if (str == null) {
                str = "";
            }
            Object H = dz5.H(new JSONObject(str).optJSONArray("disabled_actions"));
            if (H == null) {
                H = EmptyList.b;
            }
            qro0.c(new xm6(6, c6yVar, H));
            bex0.a.b(c6yVar.b, jsApiMethodType, new JSONObject(), null, 12);
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowBannerAd(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowCommunityWidgetPreviewBox(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowGoodOrderBox(String str) {
        K().VKWebAppShowGoodOrderBox(str);
    }

    @JavascriptInterface
    public void VKWebAppShowImages(String str) {
        x6y x6yVar;
        JsApiMethodType jsApiMethodType = JsApiMethodType.SHOW_IMAGES;
        if (u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final ArrayList u = n34.u(jSONObject.optJSONArray("images"));
                if (u.isEmpty()) {
                    try {
                        bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                        return;
                    } catch (Throwable unused) {
                        x6yVar = this;
                    }
                } else {
                    x6yVar = this;
                    try {
                        final int optInt = jSONObject.optInt("start_index");
                        qro0.c(new gzs() { // from class: xsna.v6y
                            @Override // xsna.gzs
                            public final Object invoke() {
                                int i = optInt;
                                x6y x6yVar2 = this;
                                if (i >= 0) {
                                    ArrayList arrayList = u;
                                    if (i < arrayList.size()) {
                                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                                        if (superappUiRouterBridge == null) {
                                            superappUiRouterBridge = null;
                                        }
                                        if (superappUiRouterBridge.n0(i, arrayList)) {
                                            bex0.a.b(x6yVar2, JsApiMethodType.SHOW_IMAGES, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                                        } else {
                                            bex0.a.a(x6yVar2, JsApiMethodType.SHOW_IMAGES, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                                        }
                                        return s3q0.a;
                                    }
                                }
                                bex0.a.a(x6yVar2, JsApiMethodType.SHOW_IMAGES, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                                return s3q0.a;
                            }
                        });
                        return;
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
                x6yVar = this;
            }
            bex0.a.a(x6yVar, JsApiMethodType.SHOW_IMAGES, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowInAppReviewDialog(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowNativeAds(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowNewPostBox(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowOrderBox(String str) {
        K().VKWebAppShowOrderBox(str);
    }

    @Override // xsna.q2y, xsna.o5y
    @JavascriptInterface
    public void VKWebAppShowQR(String str) {
        if (u(JsApiMethodType.SHOW_QR, str)) {
            qro0.c(new d5(11, str, this));
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowSlidesSheet(String str);

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppShowSubscriptionBox(String str) {
        K().VKWebAppShowSubscriptionBox(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppShowWallPostBox(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppStopStepsPermissions(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppStorageGet(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppStorageGetKeys(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppStorageSet(String str);

    @JavascriptInterface
    public final void VKWebAppSwipeToClose(String str) {
        if (u(JsApiMethodType.SWIPE_TO_CLOSE, str)) {
            try {
                qro0.c(new hf4(this, new JSONObject(str).getBoolean("enabled"), 1));
            } catch (Throwable unused) {
                bex0.a.a(this, JsApiMethodType.SWIPE_TO_CLOSE, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppTapticImpactOccurred(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppTapticNotificationOccurred(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppTapticSelectionChanged(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppTrackEvent(String str);

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppTranslate(String str);

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppUserDeactivated(String str) {
        I().VKWebAppUserDeactivated(str);
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppUsersSearch(String str) {
        JsApiMethodType jsApiMethodType = JsApiMethodType.USERS_SEARCH;
        if (u(jsApiMethodType, str)) {
            String optString = new JSONObject(str).optString(SharedKt.PARAM_ACCESS_TOKEN);
            if (optString.length() == 0) {
                bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
            } else {
                qro0.c(new g4(14, optString, this));
            }
        }
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppVKPayCheckout(String str) {
        UserInfoProvider productionUserInfoProvider;
        n7y n7yVar = (n7y) this.q.getValue();
        x6y x6yVar = n7yVar.a;
        x6y x6yVar2 = n7yVar.a;
        JsApiMethodType jsApiMethodType = JsApiMethodType.VKPAY_CHECKOUT;
        if (x6yVar.u(jsApiMethodType, str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!n7y.b(jSONObject)) {
                    bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return;
                }
                VkPayCheckoutParams vkPayCheckoutParams = new VkPayCheckoutParams(jSONObject);
                Context context = x6yVar.l;
                Context h = context != null ? e3m.h(context) : null;
                FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
                if (fragmentActivity == null) {
                    return;
                }
                VkTransactionInfo vkTransactionInfo = new VkTransactionInfo(vkPayCheckoutParams.f, vkPayCheckoutParams.e, VkTransactionInfo.Currency.valueOf(vkPayCheckoutParams.g));
                VkMerchantInfo vkMerchantInfo = new VkMerchantInfo(vkPayCheckoutParams.b, vkPayCheckoutParams.c, vkPayCheckoutParams.d, null, 8, null);
                VkPayCheckoutConfig.Environment c2 = n7yVar.c(jsApiMethodType, vkPayCheckoutParams.k);
                if (c2 == null) {
                    return;
                }
                new VkPayCheckoutConfig.Environment.Production();
                new VkExtraPaymentOptions(false, null, null, null, 15, null);
                fvv0 M = x6yVar.M();
                Integer valueOf = Integer.valueOf(M != null ? (int) M.getAppId() : 0);
                VkExtraPaymentOptions a2 = n7y.a(vkPayCheckoutParams.h, vkPayCheckoutParams.m, vkPayCheckoutParams.n, vkPayCheckoutParams.i, vkPayCheckoutParams.o);
                boolean z = vkPayCheckoutParams.l;
                boolean z2 = vkPayCheckoutParams.j;
                if (c2 instanceof VkPayCheckoutConfig.Environment.Sandbox) {
                    productionUserInfoProvider = new SandboxUserInfoProvider(((VkPayCheckoutConfig.Environment.Sandbox) c2).b);
                } else {
                    if (!(c2 instanceof VkPayCheckoutConfig.Environment.Production)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productionUserInfoProvider = new ProductionUserInfoProvider();
                }
                VkPayCheckoutConfig vkPayCheckoutConfig = new VkPayCheckoutConfig(vkMerchantInfo, productionUserInfoProvider, c2, a2, valueOf, z, false, null, 0L, null, z2, 896, null);
                bbv0.a aVar = bbv0.g;
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                aVar.getClass();
                bbv0.a.g(supportFragmentManager, vkTransactionInfo, vkPayCheckoutConfig);
                n7yVar.b = bbv0.a.e(new kti(n7yVar, vkPayCheckoutParams, jsApiMethodType, 1));
            } catch (NoClassDefFoundError unused) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
            } catch (JSONException unused2) {
                bex0.a.a(x6yVar2, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        }
    }

    @Override // xsna.q2y, xsna.y1y
    @JavascriptInterface
    public void VKWebAppValidatePhone(String str) {
        if (u(JsApiMethodType.VALIDATE_PHONE, str)) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            wfn0 e2 = vdx0Var.e();
            fvv0 M = M();
            int i = 26;
            bug0.c(e2.l(M != null ? Long.valueOf(M.getAppId()) : null).subscribe(new v8(new k7f(this, 26), i), new x8(new frg(this, i), 29)));
        }
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppVerifyUserByService(String str) {
        I().VKWebAppVerifyUserByService(str);
    }

    @Override // xsna.q2y
    @JavascriptInterface
    public void VKWebAppVerifyUserServicesInfo(String str) {
        I().VKWebAppVerifyUserServicesInfo(str);
    }

    @JavascriptInterface
    public abstract /* synthetic */ void VKWebAppVmojiUploadPhoto(String str);

    /* compiled from: JsVkBrowserCoreBridge.kt */
    public static final class b implements s25 {
        public b() {
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
            q55 q55Var = q55.a;
            q55.e(this);
            JSONObject put = new JSONObject().put("phone_validated", true);
            String str = vkPhoneValidationCompleteResult.b;
            if (myc0.f(str)) {
                put.put("phone", str);
            }
            bex0.a.b(x6y.this, JsApiMethodType.VALIDATE_PHONE, put, null, 12);
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
            q55 q55Var = q55.a;
            q55.e(this);
            bex0.a.b(x6y.this, JsApiMethodType.VALIDATE_PHONE, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("phone_validated", false), null, 12);
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void m() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void b(String str) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }

    public void P(VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar) {
    }
}
