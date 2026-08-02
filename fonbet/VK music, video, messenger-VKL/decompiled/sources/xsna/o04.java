package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4504q2;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.commons.http.Http;

/* compiled from: Actual.jvm.kt */
/* loaded from: classes.dex */
public final class o04 {
    public final Object a;

    public o04(Context context) {
        this.a = Preference.h(context, 0, "metrics_sdk_sp");
    }

    public static void a(ljv ljvVar, k3j0 k3j0Var) {
        String str = k3j0Var.a;
        if (str != null) {
            ljvVar.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        ljvVar.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        ljvVar.c("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        ljvVar.c(Http.Header.ACCEPT, "application/json");
        String str2 = k3j0Var.b;
        if (str2 != null) {
            ljvVar.c("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = k3j0Var.c;
        if (str3 != null) {
            ljvVar.c("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = k3j0Var.d;
        if (str4 != null) {
            ljvVar.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((wm5) k3j0Var.e.c()).a;
        if (str5 != null) {
            ljvVar.c("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(k3j0 k3j0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", k3j0Var.h);
        hashMap.put("display_version", k3j0Var.g);
        hashMap.put("source", Integer.toString(k3j0Var.i));
        String str = k3j0Var.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(C4504q2.p, str);
        }
        return hashMap;
    }

    public o04(boolean z) {
        this.a = new AtomicBoolean(z);
    }

    public o04(String str, m63 m63Var) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
