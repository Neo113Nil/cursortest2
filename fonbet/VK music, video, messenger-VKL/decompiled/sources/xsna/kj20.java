package xsna;

import java.util.Locale;
import ru.ok.android.commons.http.Http;
import xsna.gy70;

/* compiled from: MethodChainCall.kt */
/* loaded from: classes.dex */
public class kj20<T> extends ara<T> {
    public final vx70 b;
    public final gy70.a c;
    public final String d;
    public final String e;
    public final k7r0<T> f;
    public zqa g;

    public kj20(l7r0 l7r0Var, vx70 vx70Var, gy70.a aVar, String str, String str2, k7r0<T> k7r0Var) {
        super(l7r0Var);
        this.b = vx70Var;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = k7r0Var;
    }

    @Override // xsna.ara
    public T a(zqa zqaVar) throws Exception {
        this.g = zqaVar;
        boolean a = zqaVar.a();
        gy70.a aVar = this.c;
        if (a) {
            aVar.a("captcha_sid", zqaVar.a);
            if (zqaVar.c.length() > 0) {
                aVar.a("success_token", zqaVar.c);
            } else {
                aVar.a("captcha_key", zqaVar.b);
            }
            Integer num = zqaVar.i;
            if (num != null) {
                aVar.a("captcha_attempt", String.valueOf(num.intValue()));
            }
            Double d = zqaVar.j;
            if (d != null) {
                aVar.a("captcha_ts", String.valueOf(d.doubleValue()));
            }
            Boolean bool = zqaVar.h;
            if (bool != null) {
                aVar.a("is_sound_captcha", bool.booleanValue() ? "1" : "0");
            }
        }
        String str = zqaVar.g;
        if (str != null) {
            aVar.g.put(Http.Header.X_CHALLENGE_SOLUTION, str);
        }
        if (zqaVar.k) {
            aVar.a("confirm", "1");
        }
        String str2 = (String) aVar.f.get("device_id");
        if (str2 == null) {
            str2 = "";
        }
        if (drm0.N(str2)) {
            str2 = this.d;
        }
        aVar.a("device_id", str2.toLowerCase(Locale.getDefault()));
        String str3 = (String) aVar.f.get("lang");
        String str4 = str3 != null ? str3 : "";
        if (drm0.N(str4)) {
            str4 = this.e;
        }
        aVar.a("lang", str4.toLowerCase(Locale.getDefault()));
        return d(aVar.b());
    }

    public final void c(okhttp3.k kVar, gy70 gy70Var) {
        a9v.b(this.g, kVar, gy70Var.o);
    }

    public T d(gy70 gy70Var) {
        return (T) lom0.a(this.f, new fk(10, this, gy70Var), new com.vk.catalog2.common.ui.holders.a(18, this, gy70Var), gy70Var.d, null);
    }
}
