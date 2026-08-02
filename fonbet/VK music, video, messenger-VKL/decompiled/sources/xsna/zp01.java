package xsna;

import com.google.android.gms.cast.internal.zzap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zp01 extends w201 {
    public final /* synthetic */ lvf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp01(lvf0 lvf0Var) {
        super(lvf0Var, false);
        this.d = lvf0Var;
    }

    @Override // xsna.w201
    public final void a() throws zzap {
        zyz0 zyz0Var = this.d.c;
        nzz0 b = b();
        zyz0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        long c = zyz0Var.c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", zyz0Var.e());
        } catch (JSONException e) {
            o100 o100Var = zyz0Var.a;
            Locale locale = Locale.ROOT;
            o100Var.c(go9.b("Error creating SkipAd message: ", e.getMessage()), new Object[0]);
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.v.a(c, b);
    }
}
