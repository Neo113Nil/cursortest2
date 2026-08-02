package xsna;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.p;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.qr6;

/* compiled from: ResumableUploadChainCall.kt */
/* loaded from: classes15.dex */
public final class geg0 extends ara<ieg0> {
    public final mkx b;
    public final long c;
    public final eeg0 d;
    public final qr6.a e;

    public geg0(wy2 wy2Var, mkx mkxVar, long j, eeg0 eeg0Var, qr6.a aVar) {
        super(wy2Var);
        this.b = mkxVar;
        this.c = j;
        this.d = eeg0Var;
        this.e = aVar;
    }

    @Override // xsna.ara
    public final ieg0 a(zqa zqaVar) {
        String str;
        ieg0 ieg0Var;
        eeg0 eeg0Var = this.d;
        String str2 = eeg0Var.a;
        String str3 = eeg0Var.c;
        String str4 = eeg0Var.d;
        String str5 = eeg0Var.e;
        Uri uri = eeg0Var.f;
        long j = eeg0Var.g;
        long j2 = eeg0Var.h;
        long j3 = eeg0Var.i;
        mkx mkxVar = this.b;
        f3e0 f3e0Var = new f3e0(new p9r(j2, j3, ((VKApiConfig) mkxVar.a.b).a, uri, str4), this.e);
        String encode = URLEncoder.encode(brm0.y(str3, "\"", "\\\""), C.UTF8_NAME);
        Locale locale = Locale.US;
        String format = String.format(locale, "bytes %d-%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j)}, 3));
        p.a aVar = new p.a();
        aVar.f("POST", f3e0Var);
        aVar.i(str2);
        aVar.c.h(Http.Header.CONTENT_DISPOSITION, air.b('\"', "attachment, filename=\"", encode));
        aVar.c.h("Content-Type", str4);
        aVar.c.h("Session-ID", str5);
        aVar.c.h(Http.Header.CONTENT_RANGE, format);
        m8g0.a(aVar, this.c);
        aVar.c(okhttp3.c.n);
        okhttp3.u g = mkxVar.g(aVar.b());
        int i = g.e;
        if (i == 200) {
            okhttp3.v vVar = g.h;
            if (vVar == null || (str = vVar.string()) == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error")) {
                String string = jSONObject.getString("error");
                String optString = jSONObject.optString("error_descr");
                String str6 = optString != null ? optString : "";
                if (!drm0.N(str6)) {
                    string = pzl.b(string, ": ", str6);
                }
                throw new VKApiIllegalResponseException(string);
            }
            ieg0Var = new ieg0(true, jSONObject.optString("direct_link", ""));
        } else {
            if (i != 201) {
                JSONObject o = mkxVar.o(g);
                String optString2 = o != null ? o.optString("root_response") : null;
                String a = g.g.a("X-Reason");
                if (optString2 == null || optString2.length() == 0) {
                    optString2 = "<none>";
                }
                throw new VKApiIllegalResponseException(String.format(locale, "HTTP '%d (%s)'. Body: %s. Reason: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), rkv.a.get(i), optString2, a}, 4)));
            }
            ieg0Var = new ieg0();
        }
        g.close();
        return ieg0Var;
    }
}
