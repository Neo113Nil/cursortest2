package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.ij20;

/* compiled from: ApiRequest.kt */
/* loaded from: classes.dex */
public abstract class xz2<T> extends oer0<T> {
    public static final String[] r = {SharedKt.PARAM_ACCESS_TOKEN, "sig", "v", "method"};
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;

    public xz2(String str) {
        super(str, null, 2, null);
        this.q = 5;
    }

    public static final void o(String str, LinkedHashMap linkedHashMap) {
        for (int i = 0; i < 4; i++) {
            String str2 = r[i];
            if (linkedHashMap.containsKey(str2)) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                    sb.append(StringUtils.COMMA);
                }
                sb.deleteCharAt(sb.length() - 1);
                StringBuilder a = xe9.a("You shouldn't pass ", str2, " as a request parameter. Method: ", str, ". Params: ");
                a.append((Object) sb);
                throw new IllegalArgumentException(a.toString());
            }
        }
    }

    @Override // xsna.nx2
    public T f(l7r0 l7r0Var) throws InterruptedException, IOException, VKApiException {
        ij20.a aVar = new ij20.a();
        aVar.c = this.b;
        aVar.e = this.i;
        LinkedHashMap<String, String> linkedHashMap = this.j;
        linkedHashMap.put("lang", vx2.d.q());
        String str = this.j.get("device_id");
        if (str == null) {
            str = vx2.d.getDeviceId();
        }
        linkedHashMap.put("device_id", str);
        aVar.k(linkedHashMap);
        aVar.a = vx2.d.l();
        aVar.d = k();
        boolean z = this.n;
        aVar.i = z;
        aVar.g = this.q;
        aVar.h = this.p;
        aVar.v = new l8g0(null, Boolean.valueOf(z), this.o, 9);
        aVar.q = this.l;
        aVar.r = this.m;
        aVar.u = vx2.d.i();
        aVar.j = l();
        aVar.l = this.d;
        aVar.k = this.c || this.j.get(SharedKt.PARAM_CLIENT_SECRET) != null;
        aVar.m = this.f;
        aVar.n = this.g;
        aVar.o = this.h;
        aVar.b = this.e;
        return (T) l7r0Var.d(new ij20(aVar), this);
    }

    public String k() {
        return vx2.d.d();
    }

    public int[] l() {
        return null;
    }

    public void n() {
    }
}
