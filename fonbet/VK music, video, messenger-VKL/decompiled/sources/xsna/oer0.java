package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: VKRequest.kt */
/* loaded from: classes.dex */
public class oer0<T> extends nx2<T> implements k7r0<T> {
    public String b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile VKApiConfig.EndpointPathName e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile String i;
    public final LinkedHashMap<String, String> j;

    public oer0(String str, String str2) {
        this.b = str;
        this.e = VKApiConfig.EndpointPathName.METHOD;
        this.j = new LinkedHashMap<>();
    }

    public per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) throws VKApiException, VKApiExecutionException, JSONException, Exception {
        return k7r0.a.a(this, qrj0Var2);
    }

    public final void g(int i, String str) {
        if (i != 0) {
            this.j.put(str, Integer.toString(i));
        }
    }

    public final void i(String str, ArrayList arrayList) {
        j(str.toString(), j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
    }

    public final void j(String str, String str2) {
        if (str2 != null) {
            this.j.put(str, str2);
        }
    }

    public /* synthetic */ oer0(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return jSONObject;
    }
}
