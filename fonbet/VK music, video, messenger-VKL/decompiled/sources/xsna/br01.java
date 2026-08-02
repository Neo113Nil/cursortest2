package xsna;

import com.google.android.gms.cast.internal.zzap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class br01 extends w201 {
    public final /* synthetic */ long[] d;
    public final /* synthetic */ lvf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br01(lvf0 lvf0Var, long[] jArr) {
        super(lvf0Var, false);
        this.d = jArr;
        Objects.requireNonNull(lvf0Var);
        this.e = lvf0Var;
    }

    @Override // xsna.w201
    public final void a() throws zzap {
        zyz0 zyz0Var = this.e.c;
        nzz0 b = b();
        long[] jArr = this.d;
        zyz0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        long c = zyz0Var.c();
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zyz0Var.e());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        zyz0Var.b(c, jSONObject.toString());
        zyz0Var.q.a(c, b);
    }
}
