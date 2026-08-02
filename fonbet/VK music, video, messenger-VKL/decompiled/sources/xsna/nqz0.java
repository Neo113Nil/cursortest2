package xsna;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import ru.ok.android.commons.http.Http;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class nqz0 implements Runnable {
    public static final p100 d = new p100("RevokeAccessOperation", new String[0]);
    public final String b;
    public final vzk0 c;

    public nqz0(String str) {
        exc0.f(str);
        this.b = str;
        this.c = new vzk0(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p100 p100Var = d;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f;
            } else {
                Log.e(p100Var.a, p100Var.b("Unable to revoke access!", new Object[0]));
            }
            p100Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(p100Var.a, p100Var.b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]));
        } catch (Exception e2) {
            Log.e(p100Var.a, p100Var.b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]));
        }
        this.c.setResult(status);
    }
}
