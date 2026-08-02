package defpackage;

import com.monetization.ads.network.core.Header;
import com.monetization.ads.network.core.Request;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public final class b481 extends c681 {
    public final SSLSocketFactory a;

    public b481(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Header((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void b(HttpURLConnection httpURLConnection, Request request) {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    c(httpURLConnection, request, postBody);
                    break;
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] body = request.getBody();
                if (body != null) {
                    c(httpURLConnection, request, body);
                    break;
                }
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] body2 = request.getBody();
                if (body2 != null) {
                    c(httpURLConnection, request, body2);
                    break;
                }
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] body3 = request.getBody();
                if (body3 != null) {
                    c(httpURLConnection, request, body3);
                    break;
                }
                break;
            default:
                ny61.r("Unknown method type.");
                break;
        }
    }

    public static void c(HttpURLConnection httpURLConnection, Request request, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
