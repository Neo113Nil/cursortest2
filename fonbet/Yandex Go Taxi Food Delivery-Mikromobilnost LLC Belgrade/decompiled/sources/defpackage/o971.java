package defpackage;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.f9;

/* loaded from: classes7.dex */
public abstract class o971 {
    public final String a;
    public nr41 c;
    public aj31 d;
    public long f = System.nanoTime();
    public int e = 1;
    public pj61 b = new pj61(null);

    public o971(String str) {
        this.a = str;
    }

    public void a() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, JSONObject jSONObject) {
        vj61.a.b((WebView) this.b.get(), "publishMediaEvent", str, jSONObject, this.a);
    }

    public void c(j681 j681Var, hlx0 hlx0Var) {
        d(j681Var, hlx0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4 A[LOOP:0: B:13:0x00de->B:15:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(j681 j681Var, hlx0 hlx0Var, JSONObject jSONObject) {
        char c;
        String str;
        String str2 = j681Var.h;
        JSONObject jSONObject2 = new JSONObject();
        y471.c(jSONObject2, WebViewActivity.KEY_ENVIRONMENT, "app");
        f9 f9Var = (f9) hlx0Var.y;
        a071 a071Var = (a071) hlx0Var.b;
        y471.c(jSONObject2, "adSessionType", f9Var);
        JSONObject jSONObject3 = new JSONObject();
        y471.c(jSONObject3, "deviceType", Build.MANUFACTURER + Extension.SEMICOLON_SPACE + Build.MODEL);
        y471.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        y471.c(jSONObject3, "os", "Android");
        y471.c(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = tga1.a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c = 2;
            } else if (currentModeType == 4) {
                c = 1;
            }
            if (c != 1) {
                str = "ctv";
            } else if (c == 2) {
                str = "mobile";
            } else {
                if (c != 3) {
                    throw null;
                }
                str = "other";
            }
            y471.c(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            y471.c(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            a071Var.getClass();
            y471.c(jSONObject4, "partnerName", "Yandex");
            y471.c(jSONObject4, "partnerVersion", "8.0.0-beta.1");
            y471.c(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            y471.c(jSONObject5, "libraryVersion", "1.5.6-Yandex");
            y471.c(jSONObject5, "appId", lt81.b.a.getApplicationContext().getPackageName());
            y471.c(jSONObject2, "app", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            for (s181 s181Var : Collections.unmodifiableList((ArrayList) hlx0Var.c)) {
                y471.c(jSONObject6, s181Var.a, s181Var.c);
            }
            vj61.a.b((WebView) this.b.get(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
        }
        c = 3;
        if (c != 1) {
        }
        y471.c(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        y471.c(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        a071Var.getClass();
        y471.c(jSONObject42, "partnerName", "Yandex");
        y471.c(jSONObject42, "partnerVersion", "8.0.0-beta.1");
        y471.c(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        y471.c(jSONObject52, "libraryVersion", "1.5.6-Yandex");
        y471.c(jSONObject52, "appId", lt81.b.a.getApplicationContext().getPackageName());
        y471.c(jSONObject2, "app", jSONObject52);
        JSONObject jSONObject62 = new JSONObject();
        while (r10.hasNext()) {
        }
        vj61.a.b((WebView) this.b.get(), "startSession", str2, jSONObject2, jSONObject62, jSONObject);
    }

    public void e() {
    }
}
