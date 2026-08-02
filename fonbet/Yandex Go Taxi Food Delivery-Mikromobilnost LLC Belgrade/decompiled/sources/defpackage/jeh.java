package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class jeh {
    public static ieh a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ieh(httpURLConnection);
    }
}
