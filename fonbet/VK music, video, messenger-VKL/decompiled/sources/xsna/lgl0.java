package xsna;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.core.preference.Preference;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class lgl0 {
    public static final ReentrantLock c = new ReentrantLock();

    @Nullable
    public static lgl0 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public lgl0(Context context) {
        this.b = Preference.h(context, 0, "com.google.android.gms.signin");
    }

    @NonNull
    public static lgl0 a(@NonNull Context context) {
        exc0.i(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new lgl0(context.getApplicationContext());
            }
            lgl0 lgl0Var = d;
            reentrantLock.unlock();
            return lgl0Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return tdj.a(new StringBuilder(String.valueOf(str2).length() + 20), str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
    }

    @Nullable
    public final GoogleSignInAccount b() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = e(f("googleSignInAccount", e2))) != null) {
            try {
                return GoogleSignInAccount.k(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        exc0.i(googleSignInAccount);
        exc0.i(googleSignInOptions);
        String str = googleSignInAccount.i;
        d("defaultGoogleSignInAccount", str);
        String f = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put(CommonConstant.KEY_DISPLAY_NAME, str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put(CommonConstant.KEY_GIVEN_NAME, str6);
            }
            String str7 = googleSignInAccount.l;
            if (str7 != null) {
                jSONObject.put(CommonConstant.KEY_FAMILY_NAME, str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.g;
            if (str8 != null) {
                jSONObject.put(CommonConstant.KEY_SERVER_AUTH_CODE, str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, daa.c);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.c);
            }
            jSONObject.put(CommonConstant.KEY_GRANTED_SCOPES, jSONArray);
            jSONObject.remove(CommonConstant.KEY_SERVER_AUTH_CODE);
            d(f, jSONObject.toString());
            String f2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.i;
            String str10 = googleSignInOptions.h;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.c;
                Collections.sort(arrayList, GoogleSignInOptions.q);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).c);
                }
                jSONObject2.put(SharedKt.PARAM_SCOPES, jSONArray2);
                Account account = googleSignInOptions.d;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.e);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.g);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(f2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void d(@NonNull String str, @NonNull String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Nullable
    public final String e(@NonNull String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
