package ru.ok.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import java.io.IOException;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.util.OkAuthType;
import ru.ok.android.sdk.util.OkPayment;
import ru.ok.android.sdk.util.OkRequestUtil;
import ru.ok.android.sdk.util.Utils;
import xsna.drm0;
import xsna.fw3;
import xsna.ozl;
import xsna.zcl;

/* compiled from: Odnoklassniki.kt */
/* loaded from: classes9.dex */
public class Odnoklassniki {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Odnoklassniki sOdnoklassniki;
    private final boolean allowDebugOkSso;
    private boolean allowWidgetRetry;
    private final String appId;
    private final String appKey;
    private final Context context;
    private String mAccessToken;
    private String mSessionSecretKey;
    private final OkPayment okPayment;
    private String sdkToken;

    /* compiled from: Odnoklassniki.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Odnoklassniki createInstance(Context context, String str, String str2) {
            if (drm0.N(str) || drm0.N(str2)) {
                throw new IllegalArgumentException(context.getString(R.string.no_application_data));
            }
            return new Odnoklassniki(context.getApplicationContext(), str, str2);
        }

        public final Odnoklassniki getInstance() {
            Companion companion = Odnoklassniki.Companion;
            if (companion.getSOdnoklassniki() != null) {
                return companion.getSOdnoklassniki();
            }
            throw new IllegalStateException("No instance available. Odnoklassniki.createInstance() needs to be called before Odnoklassniki.of()");
        }

        public final Odnoklassniki getSOdnoklassniki() {
            return Odnoklassniki.sOdnoklassniki;
        }

        public final boolean hasInstance() {
            return getSOdnoklassniki() != null;
        }

        public final Odnoklassniki of(Context context) {
            Odnoklassniki sOdnoklassniki = getSOdnoklassniki();
            if (sOdnoklassniki != null) {
                return sOdnoklassniki;
            }
            return new Odnoklassniki(context, null, null, 6, null);
        }

        public final void setSOdnoklassniki(Odnoklassniki odnoklassniki) {
            Odnoklassniki.sOdnoklassniki = odnoklassniki;
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        @ozl
        public static /* synthetic */ void instance$annotations() {
        }

        public static /* synthetic */ void sOdnoklassniki$annotations() {
        }
    }

    public Odnoklassniki(Context context, String str, String str2) {
        this.context = context;
        this.allowWidgetRetry = true;
        if (str == null || str2 == null) {
            Pair<String, String> appInfo = TokenStore.INSTANCE.getAppInfo(context);
            String d = appInfo.d();
            String g = appInfo.g();
            if (d == null || g == null) {
                throw new IllegalStateException("No instance available. Odnoklassniki.createInstance() needs to be called");
            }
            this.appId = d;
            this.appKey = g;
        } else {
            this.appId = str;
            this.appKey = str2;
            TokenStore.INSTANCE.setAppInfo(context, str, str2);
        }
        this.mAccessToken = TokenStore.getStoredAccessToken(context);
        this.mSessionSecretKey = TokenStore.getStoredSessionSecretKey(context);
        this.sdkToken = TokenStore.getSdkToken(context);
        this.okPayment = new OkPayment(context);
        sOdnoklassniki = this;
    }

    public static final Odnoklassniki createInstance(Context context, String str, String str2) {
        return Companion.createInstance(context, str, str2);
    }

    public static final Odnoklassniki getInstance() {
        return Companion.getInstance();
    }

    public static final Odnoklassniki getSOdnoklassniki() {
        return sOdnoklassniki;
    }

    public static final boolean hasInstance() {
        return Companion.hasInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onValidSessionAppeared() {
        this.okPayment.init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performAppInvite$default(Odnoklassniki odnoklassniki, Activity activity, HashMap hashMap, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performAppInvite");
        }
        if ((i & 2) != 0) {
            hashMap = null;
        }
        odnoklassniki.performAppInvite(activity, hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performAppSuggest$default(Odnoklassniki odnoklassniki, Activity activity, HashMap hashMap, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performAppSuggest");
        }
        if ((i & 2) != 0) {
            hashMap = null;
        }
        odnoklassniki.performAppSuggest(activity, hashMap);
    }

    private final void performAppSuggestInvite(Activity activity, Class<? extends AbstractWidgetActivity> cls, HashMap<String, String> hashMap, int i) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("appId", this.appId);
        intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, this.mAccessToken);
        intent.putExtra(SharedKt.PARAM_WIDGET_RETRY_ALLOWED, this.allowWidgetRetry);
        intent.putExtra("session_secret_key", this.mSessionSecretKey);
        intent.putExtra(SharedKt.PARAM_WIDGET_ARGS, hashMap);
        activity.startActivityForResult(intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performPosting$default(Odnoklassniki odnoklassniki, Activity activity, String str, boolean z, HashMap hashMap, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performPosting");
        }
        if ((i & 8) != 0) {
            hashMap = null;
        }
        odnoklassniki.performPosting(activity, str, z, hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String request$default(Odnoklassniki odnoklassniki, String str, Map map, Set set, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            set = OkRequestMode.Companion.getDEFAULT();
        }
        return odnoklassniki.request(str, map, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsyncTask requestAsync$default(Odnoklassniki odnoklassniki, String str, Map map, Set set, OkListener okListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAsync");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            set = OkRequestMode.Companion.getDEFAULT();
        }
        return odnoklassniki.requestAsync(str, map, set, okListener);
    }

    public static final void setSOdnoklassniki(Odnoklassniki odnoklassniki) {
        sOdnoklassniki = odnoklassniki;
    }

    private final void signParameters(Map<String, String> map) {
        StringBuilder sb = new StringBuilder(100);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(B5.U);
            sb.append(entry.getValue());
        }
        String sb2 = sb.toString();
        Utils utils = Utils.INSTANCE;
        StringBuilder e = fw3.e(sb2);
        e.append(this.mSessionSecretKey);
        map.put("sig", utils.toMD5(e.toString()));
    }

    private final JSONObject toJson(String str, String str2) {
        try {
            return new JSONObject().put(str, str2);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void checkValidTokens(final OkListener okListener) {
        if (this.mAccessToken == null || this.mSessionSecretKey == null) {
            notifyFailed(okListener, this.context.getString(R.string.no_valid_token));
        } else {
            new Thread(new Runnable() { // from class: ru.ok.android.sdk.Odnoklassniki$checkValidTokens$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String request$default = Odnoklassniki.request$default(Odnoklassniki.this, "users.getLoggedInUser", null, null, 6, null);
                        if (request$default == null || request$default.length() <= 2 || !TextUtils.isDigitsOnly(request$default.substring(1, request$default.length() - 1))) {
                            try {
                                JSONObject jSONObject = new JSONObject(request$default);
                                if (jSONObject.has(SharedKt.PARAM_ERROR_MSG)) {
                                    Odnoklassniki.this.notifyFailed(okListener, jSONObject.getString(SharedKt.PARAM_ERROR_MSG));
                                    return;
                                }
                            } catch (JSONException unused) {
                            }
                            Odnoklassniki.this.notifyFailed(okListener, request$default);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(SharedKt.PARAM_ACCESS_TOKEN, Odnoklassniki.this.getMAccessToken());
                            jSONObject2.put("session_secret_key", Odnoklassniki.this.getMSessionSecretKey());
                            jSONObject2.put(SharedKt.PARAM_LOGGED_IN_USER, request$default);
                        } catch (JSONException unused2) {
                        }
                        Odnoklassniki.this.onValidSessionAppeared();
                        Odnoklassniki.this.notifySuccess(okListener, jSONObject2);
                    } catch (IOException e) {
                        Odnoklassniki.this.notifyFailed(okListener, e.getMessage());
                    }
                }
            }).start();
        }
    }

    public final void clearTokens() {
        this.mAccessToken = null;
        this.mSessionSecretKey = null;
        this.sdkToken = null;
        TokenStore.removeStoredTokens(this.context);
        CookieManager.getInstance().removeAllCookies(null);
    }

    public boolean getAllowDebugOkSso() {
        return this.allowDebugOkSso;
    }

    public final boolean getAllowWidgetRetry() {
        return this.allowWidgetRetry;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getMAccessToken() {
        return this.mAccessToken;
    }

    public final String getMSessionSecretKey() {
        return this.mSessionSecretKey;
    }

    public final OkPayment getOkPayment() {
        return this.okPayment;
    }

    public final String getSdkToken() {
        return this.sdkToken;
    }

    public final boolean isActivityRequestInvite(int i) {
        return i == 22892;
    }

    public final boolean isActivityRequestOAuth(int i) {
        return i == 22890;
    }

    public final boolean isActivityRequestPost(int i) {
        return i == 22891;
    }

    public final boolean isActivityRequestSuggest(int i) {
        return i == 22893;
    }

    public final boolean isActivityRequestViral(int i) {
        return isActivityRequestPost(i) || isActivityRequestInvite(i) || isActivityRequestSuggest(i);
    }

    public final void notifyFailed(final OkListener okListener, final String str) {
        if (okListener != null) {
            Utils.INSTANCE.executeOnMain(new Runnable() { // from class: ru.ok.android.sdk.Odnoklassniki$notifyFailed$1
                @Override // java.lang.Runnable
                public final void run() {
                    OkListener.this.onError(str);
                }
            });
        }
    }

    public final void notifySuccess(final OkListener okListener, final JSONObject jSONObject) {
        if (okListener != null) {
            Utils.INSTANCE.executeOnMain(new Runnable() { // from class: ru.ok.android.sdk.Odnoklassniki$notifySuccess$1
                @Override // java.lang.Runnable
                public final void run() {
                    OkListener.this.onSuccess(jSONObject);
                }
            });
        }
    }

    public final boolean onActivityResultResult(int i, int i2, @Nullable Intent intent, OkListener okListener) {
        if (!isActivityRequestViral(i)) {
            return false;
        }
        if (intent == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SharedKt.PARAM_ACTIVITY_RESULT, i2);
            } catch (JSONException unused) {
            }
            okListener.onError(jSONObject.toString());
            return true;
        }
        if (intent.hasExtra("error")) {
            okListener.onError(intent.getStringExtra("error"));
            return true;
        }
        try {
            okListener.onSuccess(new JSONObject(intent.getStringExtra("result")));
            return true;
        } catch (JSONException unused2) {
            okListener.onError(intent.getStringExtra("result"));
            return true;
        }
    }

    public final boolean onAuthActivityResult(int i, int i2, @Nullable Intent intent, OkListener okListener) {
        if (!isActivityRequestOAuth(i)) {
            return false;
        }
        if (intent == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SharedKt.PARAM_ACTIVITY_RESULT, i2);
            } catch (JSONException unused) {
            }
            okListener.onError(jSONObject.toString());
            return true;
        }
        String stringExtra = intent.getStringExtra(SharedKt.PARAM_ACCESS_TOKEN);
        if (stringExtra == null) {
            String stringExtra2 = intent.getStringExtra("error");
            if (i2 == 3 && (okListener instanceof OkAuthListener)) {
                ((OkAuthListener) okListener).onCancel(stringExtra2);
                return true;
            }
            okListener.onError(stringExtra2);
            return true;
        }
        String stringExtra3 = intent.getStringExtra("session_secret_key");
        String stringExtra4 = intent.getStringExtra(SharedKt.PARAM_REFRESH_TOKEN);
        long longExtra = intent.getLongExtra(SharedKt.PARAM_EXPIRES_IN, 0L);
        this.mAccessToken = stringExtra;
        if (stringExtra3 == null) {
            stringExtra3 = stringExtra4;
        }
        this.mSessionSecretKey = stringExtra3;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(SharedKt.PARAM_ACCESS_TOKEN, this.mAccessToken);
            jSONObject2.put("session_secret_key", this.mSessionSecretKey);
            if (longExtra > 0) {
                jSONObject2.put(SharedKt.PARAM_EXPIRES_IN, longExtra);
            }
        } catch (JSONException unused2) {
        }
        onValidSessionAppeared();
        okListener.onSuccess(jSONObject2);
        return true;
    }

    public final void performAppInvite(Activity activity, HashMap<String, String> hashMap) {
        performAppSuggestInvite(activity, OkAppInviteActivity.class, hashMap, SharedKt.OK_INVITING_REQUEST_CODE);
    }

    public final void performAppSuggest(Activity activity, HashMap<String, String> hashMap) {
        performAppSuggestInvite(activity, OkAppSuggestActivity.class, hashMap, SharedKt.OK_SUGGESTING_REQUEST_CODE);
    }

    public final void performPosting(Activity activity, String str, boolean z, HashMap<String, String> hashMap) {
        Intent intent = new Intent(activity, (Class<?>) OkPostingActivity.class);
        intent.putExtra("appId", this.appId);
        intent.putExtra(SharedKt.PARAM_ATTACHMENT, str);
        intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, this.mAccessToken);
        intent.putExtra(SharedKt.PARAM_WIDGET_ARGS, hashMap);
        intent.putExtra(SharedKt.PARAM_WIDGET_RETRY_ALLOWED, this.allowWidgetRetry);
        intent.putExtra("session_secret_key", this.mSessionSecretKey);
        intent.putExtra(SharedKt.PARAM_USER_TEXT_ENABLE, z);
        activity.startActivityForResult(intent, SharedKt.OK_POSTING_REQUEST_CODE);
    }

    public final void reportPayment(String str, String str2, Currency currency) {
        this.okPayment.report(str, str2, currency);
    }

    public final String request(String str, Map<String, String> map, Set<? extends OkRequestMode> set) throws IOException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(this.context.getString(R.string.api_method_cant_be_empty));
        }
        TreeMap treeMap = new TreeMap();
        if (map != null && !map.isEmpty()) {
            treeMap.putAll(map);
        }
        treeMap.put("application_key", this.appKey);
        treeMap.put("method", str);
        if (!set.contains(OkRequestMode.NO_PLATFORM_REPORTING)) {
            treeMap.put("platform", "ANDROID");
        }
        if (set.contains(OkRequestMode.SDK_SESSION)) {
            String str3 = this.sdkToken;
            if (str3 == null) {
                throw new IllegalArgumentException("SDK token is required for method call, have not forget to call sdkInit?");
            }
            treeMap.put("sdkToken", str3);
        }
        if (set.contains(OkRequestMode.SIGNED) && (str2 = this.mAccessToken) != null && str2.length() != 0) {
            signParameters(treeMap);
            treeMap.put(SharedKt.PARAM_ACCESS_TOKEN, this.mAccessToken);
        }
        return OkRequestUtil.executeRequest(treeMap);
    }

    public final AsyncTask<Void, Void, Void> requestAsync(final String str, final Map<String, String> map, final Set<? extends OkRequestMode> set, final OkListener okListener) {
        return new AsyncTask<Void, Void, Void>() { // from class: ru.ok.android.sdk.Odnoklassniki$requestAsync$task$1
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                Odnoklassniki.this.request(str, map, set, okListener);
                return null;
            }
        }.execute(new Void[0]);
    }

    public final void requestAuthorization(Activity activity, @Nullable String str, OkAuthType okAuthType, String... strArr) {
        Intent intent = new Intent(activity, (Class<?>) OkAuthActivity.class);
        intent.putExtra("client_id", this.appId);
        intent.putExtra("application_key", this.appKey);
        intent.putExtra("redirect_uri", str);
        intent.putExtra(SharedKt.PARAM_AUTH_TYPE, okAuthType);
        intent.putExtra(SharedKt.PARAM_SCOPES, strArr);
        activity.startActivityForResult(intent, SharedKt.OK_AUTH_REQUEST_CODE);
    }

    public final void setAllowWidgetRetry(boolean z) {
        this.allowWidgetRetry = z;
    }

    public final void setMAccessToken(String str) {
        this.mAccessToken = str;
    }

    public final void setMSessionSecretKey(String str) {
        this.mSessionSecretKey = str;
    }

    public final void setSdkToken(String str) {
        this.sdkToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean request$default(Odnoklassniki odnoklassniki, String str, Map map, Set set, OkListener okListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            set = OkRequestMode.Companion.getDEFAULT();
        }
        return odnoklassniki.request(str, map, set, okListener);
    }

    public /* synthetic */ Odnoklassniki(Context context, String str, String str2, int i, zcl zclVar) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final boolean request(String str, Map<String, String> map, Set<? extends OkRequestMode> set, OkListener okListener) {
        try {
            String request = request(str, map, set);
            try {
                JSONObject jSONObject = new JSONObject(request);
                if (jSONObject.has(SharedKt.PARAM_ERROR_MSG)) {
                    notifyFailed(okListener, jSONObject.optString(SharedKt.PARAM_ERROR_MSG));
                    return false;
                }
                notifySuccess(okListener, jSONObject);
                return true;
            } catch (JSONException unused) {
                notifySuccess(okListener, toJson("result", request));
                return true;
            }
        } catch (IOException e) {
            notifyFailed(okListener, toJson(OkListenerKt.KEY_EXCEPTION, e.getMessage()).toString());
            return false;
        }
    }
}
