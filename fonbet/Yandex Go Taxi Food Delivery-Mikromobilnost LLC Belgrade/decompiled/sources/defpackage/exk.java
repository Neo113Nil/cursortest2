package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.o0;
import com.yandex.div2.t;
import com.yandex.div2.t1;
import com.yandex.div2.y0;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class exk implements zsq0, nyi {
    public final JsonParserComponent a;

    public exk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1349088399:
                if (R.equals("custom")) {
                    return new j2k(((ulk) jsonParserComponent.K2.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -906021636:
                if (R.equals("select")) {
                    return new r2k(((z7l) jsonParserComponent.Q6.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -899647263:
                if (R.equals("slider")) {
                    return new t2k(((mal) jsonParserComponent.u7.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -889473228:
                if (R.equals("switch")) {
                    return new v2k(((zcl) jsonParserComponent.b8.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -711999985:
                if (R.equals("indicator")) {
                    return new o2k(((y0) jsonParserComponent.o4.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -410956671:
                if (R.equals("container")) {
                    return new i2k(((t) jsonParserComponent.v2.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -196315310:
                if (R.equals("gallery")) {
                    return new k2k(((o0) jsonParserComponent.W3.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 102340:
                if (R.equals("gif")) {
                    return new l2k(((ask) jsonParserComponent.Z3.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 3181382:
                if (R.equals("grid")) {
                    return new m2k(((isk) jsonParserComponent.c4.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 3552126:
                if (R.equals("tabs")) {
                    return new w2k(((xdl) jsonParserComponent.e8.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 3556653:
                if (R.equals("text")) {
                    return new x2k(((vfl) jsonParserComponent.K8.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 100313435:
                if (R.equals("image")) {
                    return new n2k(((dtk) jsonParserComponent.i4.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 100358090:
                if (R.equals("input")) {
                    return new p2k(((jvk) jsonParserComponent.R4.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 106426307:
                if (R.equals("pager")) {
                    return new q2k(((x1l) jsonParserComponent.K5.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 109757585:
                if (R.equals(ClidProvider.STATE)) {
                    return new u2k(((fbl) jsonParserComponent.G7.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 112202875:
                if (R.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    return new y2k(((col) jsonParserComponent.O9.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 1732829925:
                if (R.equals("separator")) {
                    return new s2k(((t1) jsonParserComponent.W6.getValue()).a(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        xel xelVar = b instanceof xel ? (xel) b : null;
        if (xelVar != null) {
            return ((gxk) jsonParserComponent.Z9.getValue()).a(yf90Var, xelVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, m3k m3kVar) {
        boolean z = m3kVar instanceof n2k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((dtk) jsonParserComponent.i4.getValue()).b(yf90Var, ((n2k) m3kVar).c);
        }
        if (m3kVar instanceof l2k) {
            return ((ask) jsonParserComponent.Z3.getValue()).b(yf90Var, ((l2k) m3kVar).c);
        }
        if (m3kVar instanceof x2k) {
            return ((vfl) jsonParserComponent.K8.getValue()).b(yf90Var, ((x2k) m3kVar).c);
        }
        if (m3kVar instanceof s2k) {
            return ((t1) jsonParserComponent.W6.getValue()).b(yf90Var, ((s2k) m3kVar).c);
        }
        if (m3kVar instanceof i2k) {
            return ((t) jsonParserComponent.v2.getValue()).b(yf90Var, ((i2k) m3kVar).c);
        }
        if (m3kVar instanceof m2k) {
            return ((isk) jsonParserComponent.c4.getValue()).b(yf90Var, ((m2k) m3kVar).c);
        }
        if (m3kVar instanceof k2k) {
            return ((o0) jsonParserComponent.W3.getValue()).b(yf90Var, ((k2k) m3kVar).c);
        }
        if (m3kVar instanceof q2k) {
            return ((x1l) jsonParserComponent.K5.getValue()).b(yf90Var, ((q2k) m3kVar).c);
        }
        if (m3kVar instanceof w2k) {
            return ((xdl) jsonParserComponent.e8.getValue()).b(yf90Var, ((w2k) m3kVar).c);
        }
        if (m3kVar instanceof u2k) {
            return ((fbl) jsonParserComponent.G7.getValue()).b(yf90Var, ((u2k) m3kVar).c);
        }
        if (m3kVar instanceof j2k) {
            return ((ulk) jsonParserComponent.K2.getValue()).b(yf90Var, ((j2k) m3kVar).c);
        }
        if (m3kVar instanceof o2k) {
            return ((y0) jsonParserComponent.o4.getValue()).b(yf90Var, ((o2k) m3kVar).c);
        }
        if (m3kVar instanceof t2k) {
            return ((mal) jsonParserComponent.u7.getValue()).b(yf90Var, ((t2k) m3kVar).c);
        }
        if (m3kVar instanceof v2k) {
            return ((zcl) jsonParserComponent.b8.getValue()).b(yf90Var, ((v2k) m3kVar).c);
        }
        if (m3kVar instanceof p2k) {
            return ((jvk) jsonParserComponent.R4.getValue()).b(yf90Var, ((p2k) m3kVar).c);
        }
        if (m3kVar instanceof r2k) {
            return ((z7l) jsonParserComponent.Q6.getValue()).b(yf90Var, ((r2k) m3kVar).c);
        }
        if (m3kVar instanceof y2k) {
            return ((col) jsonParserComponent.O9.getValue()).b(yf90Var, ((y2k) m3kVar).c);
        }
        w511.b();
        return null;
    }
}
