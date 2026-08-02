package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes12.dex */
public final class ail implements Closeable {

    @NonNull
    public final HttpURLConnection b;

    public ail(@NonNull HttpURLConnection httpURLConnection) {
        this.b = httpURLConnection;
    }

    public static String n(HttpURLConnection httpURLConnection) throws IOException {
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.disconnect();
    }

    @Nullable
    public final String m() {
        HttpURLConnection httpURLConnection = this.b;
        boolean z = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z = true;
                }
            } catch (NullPointerException e) {
                e = e;
                n100.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + n(httpURLConnection);
        } catch (IOException e2) {
            e = e2;
            n100.c("get error failed ", e);
            return e.getMessage();
        }
    }
}
