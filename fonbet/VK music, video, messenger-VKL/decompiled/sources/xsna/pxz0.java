package xsna;

import com.google.android.gms.cast.internal.zzap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class pxz0 extends w201 {
    public final /* synthetic */ int[] d;
    public final /* synthetic */ lvf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxz0(lvf0 lvf0Var, int[] iArr) {
        super(lvf0Var, true);
        this.d = iArr;
        Objects.requireNonNull(lvf0Var);
        this.e = lvf0Var;
    }

    @Override // xsna.w201
    public final void a() throws zzap {
        zyz0 zyz0Var = this.e.c;
        nzz0 b = b();
        int[] iArr = this.d;
        zyz0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        long c = zyz0Var.c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zyz0Var.e());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.t.a(c, b);
    }
}
