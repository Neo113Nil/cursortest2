package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.yandex.browser.rtm.RTMUploadResult$Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class caj {
    public final String a;
    public final String b;

    public caj(lb7 lb7Var) {
        Context context = (Context) lb7Var.b;
        int e = CommonUtils.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.a = "Unity";
            this.b = context.getResources().getString(e);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.a = "Flutter";
                this.b = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.a = null;
        this.b = null;
    }

    public j5i0 a() {
        hvj0 hvj0Var;
        String str = this.b;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(str.getBytes(uza.a));
                outputStream.close();
                outputStream.close();
                hvj0Var = new hvj0(null, httpURLConnection.getResponseCode(), 2);
            } finally {
            }
        } catch (Throwable th) {
            try {
                hvj0 hvj0Var2 = new hvj0(th, 0, 1);
                httpURLConnection.disconnect();
                hvj0Var = hvj0Var2;
            } finally {
                httpURLConnection.disconnect();
            }
        }
        Object obj = hvj0Var.b;
        if (obj != null && (obj instanceof Throwable)) {
            return ybb1.b((Throwable) obj);
        }
        int i = hvj0Var.a;
        if (i == 200) {
            RTMUploadResult$Status rTMUploadResult$Status = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 301) {
            RTMUploadResult$Status rTMUploadResult$Status2 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 302) {
            RTMUploadResult$Status rTMUploadResult$Status3 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 403) {
            RTMUploadResult$Status rTMUploadResult$Status4 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 404) {
            RTMUploadResult$Status rTMUploadResult$Status5 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 408) {
            RTMUploadResult$Status rTMUploadResult$Status6 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 413) {
            RTMUploadResult$Status rTMUploadResult$Status7 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 500) {
            RTMUploadResult$Status rTMUploadResult$Status8 = RTMUploadResult$Status.UNKNOWN;
        } else if (i == 503) {
            RTMUploadResult$Status rTMUploadResult$Status9 = RTMUploadResult$Status.UNKNOWN;
        } else if (200 <= i && i < 300) {
            RTMUploadResult$Status rTMUploadResult$Status10 = RTMUploadResult$Status.UNKNOWN;
        } else if (300 <= i && i < 400) {
            RTMUploadResult$Status rTMUploadResult$Status11 = RTMUploadResult$Status.UNKNOWN;
        } else if (400 <= i && i < 500) {
            RTMUploadResult$Status rTMUploadResult$Status12 = RTMUploadResult$Status.UNKNOWN;
        } else if (500 > i || i >= 600) {
            RTMUploadResult$Status rTMUploadResult$Status13 = RTMUploadResult$Status.UNKNOWN;
        } else {
            RTMUploadResult$Status rTMUploadResult$Status14 = RTMUploadResult$Status.UNKNOWN;
        }
        return new j5i0(i);
    }

    public caj(String str, String str2, ums umsVar) {
        this.a = str;
        this.b = str2;
    }

    public caj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
