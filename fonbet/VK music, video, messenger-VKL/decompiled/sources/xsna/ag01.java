package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.preference.Preference;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ag01 implements Runnable {
    public final URL b;
    public final /* synthetic */ bg01 c;
    public final m3a d;

    public ag01(bg01 bg01Var, String str, URL url, m3a m3aVar) {
        this.c = bg01Var;
        exc0.f(str);
        this.b = url;
        this.d = m3aVar;
    }

    public final void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        kb01 kb01Var = ((mb01) this.c.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new Runnable() { // from class: xsna.df01
            @Override // java.lang.Runnable
            public final void run() {
                mb01 mb01Var = (mb01) ag01.this.d.b;
                sk01 sk01Var = mb01Var.m;
                k901 k901Var = mb01Var.j;
                int i2 = i;
                Exception exc = iOException;
                if (i2 != 200 && i2 != 204) {
                    if (i2 == 304) {
                        i2 = 304;
                    }
                    mb01.k(k901Var);
                    k901Var.l.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
                }
                if (exc == null) {
                    x901 x901Var = mb01Var.i;
                    mb01.i(x901Var);
                    x901Var.u.a(true);
                    byte[] bArr2 = bArr;
                    if (bArr2 == null || bArr2.length == 0) {
                        mb01.k(k901Var);
                        k901Var.p.a("Deferred Deep Link response empty.");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr2));
                        String optString = jSONObject.optString("deeplink", "");
                        String optString2 = jSONObject.optString("gclid", "");
                        double optDouble = jSONObject.optDouble("timestamp", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        if (TextUtils.isEmpty(optString)) {
                            mb01.k(k901Var);
                            k901Var.p.a("Deferred Deep Link is empty.");
                            return;
                        }
                        mb01.i(sk01Var);
                        mb01 mb01Var2 = (mb01) sk01Var.b;
                        if (!TextUtils.isEmpty(optString)) {
                            Context context = mb01Var2.b;
                            Context context2 = mb01Var2.b;
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                Bundle bundle = new Bundle();
                                bundle.putString("gclid", optString2);
                                bundle.putString("_cis", "ddp");
                                mb01Var.q.r("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(optString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor edit = Preference.h(context2, 0, "google.analytics.deferred.deeplink.prefs").edit();
                                    edit.putString("deeplink", optString);
                                    edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                    if (edit.commit()) {
                                        context2.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                        return;
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    k901 k901Var2 = ((mb01) sk01Var.b).j;
                                    mb01.k(k901Var2);
                                    k901Var2.i.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        }
                        mb01.k(k901Var);
                        k901Var.l.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    } catch (JSONException e2) {
                        mb01.k(k901Var);
                        k901Var.i.b(e2, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                mb01.k(k901Var);
                k901Var.l.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [xsna.ag01] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        ?? r4;
        IOException e;
        ?? r42;
        InputStream inputStream;
        bg01 bg01Var = this.c;
        mb01 mb01Var = (mb01) bg01Var.b;
        mb01 mb01Var2 = (mb01) bg01Var.b;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.o();
        try {
            URLConnection openConnection = this.b.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            mb01Var2.getClass();
            r4 = 60000;
            r42 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            mb01Var2.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
            } catch (IOException e2) {
                e = e2;
                i = 0;
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    a(i, null, byteArray, headerFields);
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r42 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    a(i, e, null, r42);
                } catch (Throwable th5) {
                    th = th5;
                    r4 = 0;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    a(i, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                if (httpURLConnection != null) {
                }
                a(i, e, null, r42);
            } catch (Throwable th6) {
                th = th6;
                if (httpURLConnection != null) {
                }
                a(i, null, null, r4);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            i = 0;
            httpURLConnection = null;
            r42 = 0;
        } catch (Throwable th7) {
            th = th7;
            i = 0;
            httpURLConnection = null;
            r4 = 0;
        }
    }
}
