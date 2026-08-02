package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cvw;
import defpackage.ich;
import defpackage.nb51;
import defpackage.ny61;
import defpackage.sfu;
import defpackage.t59;
import defpackage.teu;
import defpackage.udq0;
import defpackage.zvf0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.common.network.Request;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes.dex */
public final class e {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final zvf0 b;
    public final t59 c = new t59();

    public e(Context context, zvf0 zvf0Var) {
        this.a = context;
        this.b = zvf0Var;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str2 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str2 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
    }

    public static long d(String str) {
        cvw.d("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        c cVar = new c();
        cVar.b = 0L;
        cVar.d = (byte) (cVar.d | 1);
        a aVar = new a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                aVar.a = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                aVar.b = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                aVar.c = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(AuthSdkActivity.RESPONSE_TYPE_TOKEN)) {
                        cVar.a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        cVar.b = d(jsonReader.nextString());
                        cVar.d = (byte) (cVar.d | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVar.d = cVar.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new b(aVar.a, aVar.b, aVar.c, aVar.d, InstallationResponse.ResponseCode.OK);
    }

    public static TokenResult f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        c cVar = new c();
        cVar.b = 0L;
        cVar.d = (byte) (cVar.d | 1);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AuthSdkActivity.RESPONSE_TYPE_TOKEN)) {
                cVar.a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                cVar.b = d(jsonReader.nextString());
                cVar.d = (byte) (cVar.d | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        cVar.c = TokenResult.ResponseCode.OK;
        return cVar.a();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            ny61.o(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            ny61.o(e2);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            ny61.v("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[Catch: NameNotFoundException -> 0x00ac, TryCatch #4 {NameNotFoundException -> 0x00ac, blocks: (B:7:0x005f, B:9:0x0071, B:16:0x007b, B:20:0x0088, B:22:0x0098, B:26:0x00ae, B:28:0x00b8, B:30:0x00d1), top: B:6:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[Catch: NameNotFoundException -> 0x00ac, TryCatch #4 {NameNotFoundException -> 0x00ac, blocks: (B:7:0x005f, B:9:0x0071, B:16:0x007b, B:20:0x0088, B:22:0x0098, B:26:0x00ae, B:28:0x00b8, B:30:0x00d1), top: B:6:0x005f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection c(URL url, String str) {
        PackageInfo c;
        Signature[] signatureArr;
        byte[] bArr;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", Request.PARAM_GZIP);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            teu teuVar = (teu) this.b.get();
            if (teuVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) udq0.f(((ich) teuVar).a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String str2 = null;
            try {
                c = nb51.a(context).c(64, context.getPackageName());
                signatureArr = c.signatures;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e2);
            }
            if (signatureArr != null && signatureArr.length == 1) {
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA1);
                    } catch (NoSuchAlgorithmException unused3) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i++;
                }
                if (messageDigest != null) {
                    bArr = messageDigest.digest(c.signatures[0].toByteArray());
                    if (bArr != null) {
                        Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    } else {
                        int length = bArr.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char[] cArr = sfu.a;
                            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
                            sb.append(cArr[bArr[i2] & PKIBody._CCP]);
                        }
                        str2 = sb.toString();
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            bArr = null;
            if (bArr != null) {
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused4) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }
}
