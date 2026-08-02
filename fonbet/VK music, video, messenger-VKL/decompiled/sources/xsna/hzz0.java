package xsna;

import com.google.android.gms.cast.internal.zzap;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class hzz0 extends w201 {
    public final /* synthetic */ ay10 d;
    public final /* synthetic */ lvf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzz0(lvf0 lvf0Var, ay10 ay10Var) {
        super(lvf0Var, false);
        this.d = ay10Var;
        this.e = lvf0Var;
    }

    @Override // xsna.w201
    public final void a() throws zzap {
        zyz0 zyz0Var = this.e.c;
        nzz0 b = b();
        zyz0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        long c = zyz0Var.c();
        ay10 ay10Var = this.d;
        long j = ay10Var.b ? 4294967296000L : ay10Var.a;
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", zyz0Var.e());
            Pattern pattern = o0a.a;
            jSONObject.put("currentTime", j / 1000.0d);
        } catch (JSONException unused) {
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.g = Long.valueOf(j);
        yzz0 yzz0Var = zyz0Var.m;
        jzi0 jzi0Var = new jzi0();
        jzi0Var.a = b;
        Objects.requireNonNull(zyz0Var);
        jzi0Var.b = zyz0Var;
        yzz0Var.a(c, jzi0Var);
    }
}
