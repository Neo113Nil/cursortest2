package defpackage;

import com.yandex.div2.DivActionVideo$Action;
import com.yandex.div2.n;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class hdk implements zsq0, yey0 {
    public static jdk c(yf90 yf90Var, jdk jdkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new jdk(wcx.e(Q, jSONObject, "action", n.a, i, jdkVar != null ? jdkVar.a : null, DivActionVideo$Action.FROM_STRING, q5z.b), wcx.d(Q, jSONObject, "id", wm11.c, i, jdkVar != null ? jdkVar.b : null));
    }

    public static JSONObject d(yf90 yf90Var, jdk jdkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(jdkVar.a, DivActionVideo$Action.TO_STRING, yf90Var, "action", jSONObject);
        wcx.q(yf90Var, jSONObject, "id", jdkVar.b);
        wwg.Z(yf90Var, jSONObject, "type", MediaStreamTrack.VIDEO_TRACK_KIND);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (jdk) obj);
    }
}
