package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.DivActionVideo$Action;
import com.yandex.div2.n;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class gdk implements zsq0, nyi {
    public static fdk c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = n.a;
        tls tlsVar = DivActionVideo$Action.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new fdk(a.b(yf90Var, jSONObject, "action", qkjVar, tlsVar, kbsVar), a.b(yf90Var, jSONObject, "id", wm11.c, q5z.c, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, fdk fdkVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "action", fdkVar.a, DivActionVideo$Action.TO_STRING);
        a.g(yf90Var, jSONObject, "id", fdkVar.b);
        wwg.Z(yf90Var, jSONObject, "type", MediaStreamTrack.VIDEO_TRACK_KIND);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (fdk) obj);
    }
}
