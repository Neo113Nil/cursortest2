package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.nhx;

/* compiled from: WebApiRequest.kt */
/* loaded from: classes11.dex */
public class rdx0<T> extends oer0<T> {
    public static final String[] t = {SharedKt.PARAM_ACCESS_TOKEN, "sig", "v", "method"};
    public final String k;
    public final String l;
    public final boolean m;
    public String n;
    public String o;
    public UserId p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* compiled from: WebApiRequest.kt */
    public static final class a {
        public static final void a(String str, LinkedHashMap linkedHashMap) {
            for (int i = 0; i < 4; i++) {
                String str2 = rdx0.t[i];
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rdx0(String str) {
        super(str, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        VKApiConfig b = dgn0.b();
        dgn0.c().i();
        mgn0 mgn0Var = dgn0.a;
        this.k = (mgn0Var != null ? mgn0Var : null).e.b.invoke();
        this.l = b.g;
        this.m = true;
        this.j.put("lang", b.b());
        this.j.put("device_id", b.f.getValue());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.i2 B(rdx0 rdx0Var) {
        if (rdx0Var.k()) {
            a.a(rdx0Var.b, rdx0Var.j);
        }
        return px2.a(rdx0Var.b, rdx0Var, dgn0.c(), rdx0Var, new sdx0()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).m0();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.i2 p(bx2 bx2Var) {
        if (bx2Var.m) {
            a.a(bx2Var.b, bx2Var.j);
        }
        return px2.a(bx2Var.b, bx2Var, dgn0.c(), bx2Var, null).m0();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 u(rdx0 rdx0Var) {
        if (rdx0Var.k()) {
            a.a(rdx0Var.b, rdx0Var.j);
        }
        return px2.a(rdx0Var.b, rdx0Var, dgn0.c(), rdx0Var, new sdx0()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.nx2
    public final T f(l7r0 l7r0Var) throws InterruptedException, IOException, VKApiException {
        String str = (String) l7r0Var.a.B.getValue();
        if (str != null) {
            this.j.put("external_device_id", str);
        }
        nhx.a aVar = new nhx.a();
        aVar.s = this.r;
        aVar.q = this.n;
        aVar.r = this.o;
        aVar.t = this.p;
        aVar.a = l();
        aVar.c = this.b;
        aVar.e = this.i;
        aVar.f.putAll(this.j);
        aVar.d = n();
        aVar.l = this.d;
        aVar.k = this.c || this.j.get(SharedKt.PARAM_CLIENT_SECRET) != null;
        aVar.b = this.e;
        aVar.m = this.f;
        aVar.n = this.g;
        aVar.f(this.h);
        aVar.h = this.s;
        aVar.p = this.q;
        return (T) l7r0Var.d(aVar.c(), this);
    }

    public boolean k() {
        return this.m;
    }

    public String l() {
        return this.k;
    }

    public String n() {
        return this.l;
    }

    public final void o(String str, String str2) {
        if (str2 != null) {
            this.j.put(str, str2);
        }
    }
}
