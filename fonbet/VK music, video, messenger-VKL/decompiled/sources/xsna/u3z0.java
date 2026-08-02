package xsna;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class u3z0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class a {
        public final int a;
        public final String b;
        public final int c;
        public final String d;

        public a(int i, String str, int i2, String str2) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }

        public final boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(String str, int i, qjz0 qjz0Var) {
        HttpURLConnection httpURLConnection;
        a aVar;
        a aVar2;
        a aVar3 = new a(0, str, -10, null);
        int i2 = 0;
        while (str != null && i2 <= i) {
            gu8.c(null, "tryResolveUrl: ".concat(str));
            try {
                TrafficStats.setThreadStatsTag(98543098);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (SocketTimeoutException e) {
                e = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                fqa.b(httpURLConnection);
                if (qjz0Var != null) {
                    qjz0Var.c(httpURLConnection);
                }
                httpURLConnection.connect();
                aVar = null;
            } catch (SocketTimeoutException e2) {
                e = e2;
                aVar = new a(4, null, -2, e.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                aVar2 = aVar;
                String str2 = aVar2.b;
                String str3 = aVar2.d;
                int i3 = aVar2.c;
                int i4 = aVar2.a;
                if (aVar2.a()) {
                }
                i2++;
            } catch (Throwable th2) {
                th = th2;
                aVar = new a(2, null, -2, th.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                aVar2 = aVar;
                String str22 = aVar2.b;
                String str32 = aVar2.d;
                int i32 = aVar2.c;
                int i42 = aVar2.a;
                if (aVar2.a()) {
                }
                i2++;
            }
            if (aVar == null) {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                    if (responseCode == 200 || responseCode == 204 || responseCode == 404 || responseCode == 403) {
                        if (qjz0Var != null) {
                            qjz0Var.a(httpURLConnection);
                        }
                        aVar = new a(0, str, responseCode, null);
                    } else {
                        aVar = (responseCode == 302 || responseCode == 301 || responseCode == 303) ? b(str, httpURLConnection, responseCode) : new a(2, null, responseCode, "Unsupported response code");
                    }
                } catch (SocketTimeoutException e3) {
                    aVar2 = new a(4, null, -2, e3.getMessage());
                } catch (Throwable th3) {
                    aVar2 = new a(2, null, -2, th3.getMessage());
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            aVar2 = aVar;
            String str222 = aVar2.b;
            String str322 = aVar2.d;
            int i322 = aVar2.c;
            int i422 = aVar2.a;
            if (aVar2.a()) {
                str = (i422 != 1 || s770.j(str222)) ? null : str222;
                aVar3 = aVar2;
            } else {
                StringBuilder a2 = odj.a(i422, i322, "tryResolveUrl error: result=", ", code=", ", error=");
                a2.append(str322);
                gu8.c(null, a2.toString());
                aVar3 = new a(0, str, i322, str322);
                str = null;
            }
            i2++;
        }
        return (!aVar3.a() || i2 <= 1) ? aVar3 : new a(1, aVar3.b, aVar3.c, null);
    }

    public static a b(String str, HttpURLConnection httpURLConnection, int i) {
        try {
            String uri = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField("Location"))).toString();
            if (TextUtils.isEmpty(uri)) {
                return new a(2, null, i, "empty redirection");
            }
            boolean i2 = s770.i(uri);
            boolean j = s770.j(uri);
            if (j || i2) {
                return new a(1, uri, i, null);
            }
            StringBuilder c = gp.c("im=", ", ar=", ", rt=", j, i2);
            c.append(uri);
            return new a(2, null, i, c.toString());
        } catch (Throwable unused) {
            return new a(0, str, i, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(String str, int i, qjz0 qjz0Var) {
        HttpURLConnection httpURLConnection;
        a aVar;
        a aVar2 = new a(0, str, -10, null);
        int i2 = 0;
        while (str != null && i2 <= i) {
            gu8.c(null, "tryResolveUrl: ".concat(str));
            try {
                TrafficStats.setThreadStatsTag(98543098);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (SocketTimeoutException e) {
                e = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty(SignalingProtocol.NOTIFY_CONNECTION, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                fqa.b(httpURLConnection);
                if (qjz0Var != null) {
                    qjz0Var.c(httpURLConnection);
                }
                httpURLConnection.connect();
                aVar = null;
            } catch (SocketTimeoutException e2) {
                e = e2;
                aVar = new a(4, null, -2, e.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                aVar2 = aVar;
                str = aVar2.b;
                if (aVar2.a == 1) {
                }
                str = null;
                i2++;
            } catch (Throwable th2) {
                th = th2;
                aVar = new a(2, null, -2, th.getMessage());
                if (aVar == null) {
                }
                if (httpURLConnection != null) {
                }
                aVar2 = aVar;
                str = aVar2.b;
                if (aVar2.a == 1) {
                }
                str = null;
                i2++;
            }
            if (aVar == null) {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        if (qjz0Var != null) {
                            qjz0Var.a(httpURLConnection);
                        }
                        aVar = new a(0, str, responseCode, null);
                    } else {
                        aVar = (responseCode == 302 || responseCode == 301 || responseCode == 303) ? b(str, httpURLConnection, responseCode) : new a(2, null, responseCode, "Unsupported response code");
                    }
                } catch (SocketTimeoutException e3) {
                    aVar2 = new a(4, null, -2, e3.getMessage());
                } catch (Throwable th3) {
                    aVar2 = new a(2, null, -2, th3.getMessage());
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            aVar2 = aVar;
            str = aVar2.b;
            if (aVar2.a == 1 || s770.j(str)) {
                str = null;
            }
            i2++;
        }
        return (!aVar2.a() || i2 <= 1) ? aVar2 : new a(1, aVar2.b, aVar2.c, null);
    }
}
