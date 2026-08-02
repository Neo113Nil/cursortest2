package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class ieh implements Closeable {
    public final HttpURLConnection a;

    public ieh(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public static String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[Catch: IOException | NullPointerException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException | NullPointerException -> 0x003d, blocks: (B:3:0x0004, B:10:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        boolean z;
        HttpURLConnection httpURLConnection = this.a;
        try {
            try {
            } catch (IOException | NullPointerException e) {
                lgz.c("get error failed ");
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            z = true;
            if (!z) {
                return null;
            }
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + c(httpURLConnection);
        }
        z = false;
        if (!z) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }
}
