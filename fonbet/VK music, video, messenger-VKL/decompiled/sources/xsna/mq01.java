package xsna;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.zzap;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class mq01 extends w201 {
    public final /* synthetic */ lvf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq01(lvf0 lvf0Var) {
        super(lvf0Var, false);
        Objects.requireNonNull(lvf0Var);
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
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = zyz0Var.f;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.c);
            }
        } catch (JSONException unused) {
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.p.a(c, b);
    }
}
