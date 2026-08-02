package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.a1;
import com.yandex.div2.q0;
import com.yandex.div2.u1;
import com.yandex.div2.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gxk implements qfy0 {
    public final JsonParserComponent a;

    public gxk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m3k a(yf90 yf90Var, xel xelVar, JSONObject jSONObject) {
        boolean z = xelVar instanceof lel;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new n2k(((ftk) jsonParserComponent.k4.getValue()).a(yf90Var, ((lel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof jel) {
            return new l2k(((csk) jsonParserComponent.b4.getValue()).a(yf90Var, ((jel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof vel) {
            return new x2k(((xfl) jsonParserComponent.M8.getValue()).a(yf90Var, ((vel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof qel) {
            return new s2k(((u1) jsonParserComponent.Y6.getValue()).a(yf90Var, ((qel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof gel) {
            return new i2k(((v) jsonParserComponent.x2.getValue()).a(yf90Var, ((gel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof kel) {
            return new m2k(((ksk) jsonParserComponent.e4.getValue()).a(yf90Var, ((kel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof iel) {
            return new k2k(((q0) jsonParserComponent.Y3.getValue()).a(yf90Var, ((iel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof oel) {
            return new q2k(((z1l) jsonParserComponent.M5.getValue()).a(yf90Var, ((oel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof uel) {
            return new w2k(((zdl) jsonParserComponent.g8.getValue()).a(yf90Var, ((uel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof sel) {
            return new u2k(((hbl) jsonParserComponent.I7.getValue()).a(yf90Var, ((sel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof hel) {
            return new j2k(((wlk) jsonParserComponent.M2.getValue()).a(yf90Var, ((hel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof mel) {
            return new o2k(((a1) jsonParserComponent.q4.getValue()).a(yf90Var, ((mel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof rel) {
            return new t2k(((oal) jsonParserComponent.w7.getValue()).a(yf90Var, ((rel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof tel) {
            return new v2k(((bdl) jsonParserComponent.d8.getValue()).a(yf90Var, ((tel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof nel) {
            return new p2k(((lvk) jsonParserComponent.T4.getValue()).a(yf90Var, ((nel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof pel) {
            return new r2k(((b8l) jsonParserComponent.S6.getValue()).a(yf90Var, ((pel) xelVar).a, jSONObject));
        }
        if (xelVar instanceof wel) {
            return new y2k(((eol) jsonParserComponent.Q9.getValue()).a(yf90Var, ((wel) xelVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
