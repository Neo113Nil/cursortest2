package xsna;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j9y0;

/* compiled from: VKCaptchaJSInterface.kt */
/* loaded from: classes2.dex */
public final class osy0 {
    public final Handler a;
    public final VKCaptchaWebViewActivity.g b;
    public final VKCaptchaWebViewActivity.k c;
    public final yty0 d;
    public final String e;
    public boolean f = true;

    /* compiled from: VKCaptchaJSInterface.kt */
    public static final class a extends Lambda implements izs<List<? extends o9y0>, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(List<? extends o9y0> list) {
            osy0.this.c.invoke(list);
            return s3q0.a;
        }
    }

    public osy0(Handler handler, VKCaptchaWebViewActivity.g gVar, VKCaptchaWebViewActivity.k kVar, yty0 yty0Var, String str) {
        this.a = handler;
        this.b = gVar;
        this.c = kVar;
        this.d = yty0Var;
        this.e = str;
    }

    @JavascriptInterface
    public final void VKCaptchaCloseCaptcha(String str) {
        if (this.f) {
            var0.a.getClass();
            var0.a(j9y0.a.a);
        }
        this.b.invoke();
    }

    @JavascriptInterface
    public final void VKCaptchaGetResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f = false;
            this.a.post(new ieg(3, jSONObject, this));
            this.d.a();
        } catch (JSONException e) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[Catch: JSONException -> 0x004c, TryCatch #0 {JSONException -> 0x004c, blocks: (B:3:0x0002, B:5:0x0016, B:7:0x0024, B:14:0x0062, B:16:0x0079, B:18:0x007c, B:20:0x0040, B:23:0x0049, B:24:0x004e, B:27:0x0057, B:28:0x005a, B:30:0x0075, B:32:0x007f, B:35:0x0088, B:36:0x008f), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void VKCaptchaListenSensorsStart(String str) {
        com.vk.id.captcha.c.a.b bVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("period", -1);
            JSONArray jSONArray = jSONObject.getJSONArray("bridge_sensors_list");
            if (optInt == -1) {
                throw new IllegalStateException("No period value was provided from WebView");
            }
            yty0 yty0Var = this.d;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String obj = jSONArray.get(i).toString();
                int hashCode = obj.hashCode();
                if (hashCode == -1068318794) {
                    if (obj.equals("motion")) {
                        bVar = com.vk.id.captcha.c.a.b.c;
                        if (bVar == null) {
                        }
                    }
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                } else if (hashCode != 325741829) {
                    if (hashCode == 697872463 && obj.equals("accelerometer")) {
                        bVar = com.vk.id.captcha.c.a.b.a;
                        if (bVar == null) {
                            arrayList.add(bVar);
                        }
                    }
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                } else if (obj.equals("gyroscope")) {
                    bVar = com.vk.id.captcha.c.a.b.b;
                    if (bVar == null) {
                    }
                } else {
                    Log.e("VKCaptchaWebView", "Incorrect or unsupported sensor type\n Sensor: " + obj);
                    bVar = null;
                    if (bVar == null) {
                    }
                }
            }
            yty0Var.a(arrayList, optInt, new a());
        } catch (JSONException e) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e);
        }
    }

    @JavascriptInterface
    public final void VKCaptchaListenSensorsStop(String str) {
        this.d.a();
    }
}
