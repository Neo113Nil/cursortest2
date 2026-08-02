package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class lmk implements d4x {
    public final n15 a;
    public final String b;

    public lmk(JSONObject jSONObject) {
        String j;
        j = b4x.j("type", jSONObject);
        switch (j) {
            case "div-separator-block":
                this.a = new h8l(jSONObject);
                this.b = "div-separator-block";
                return;
            case "div-footer-block":
                this.a = new hrk(jSONObject);
                this.b = "div-footer-block";
                return;
            case "div-container-block":
                this.a = new zjk(jSONObject);
                this.b = "div-container-block";
                return;
            case "div-table-block":
                this.a = new idl(jSONObject);
                this.b = "div-table-block";
                return;
            case "div-traffic-block":
                this.a = new ljl(jSONObject);
                this.b = "div-traffic-block";
                return;
            case "div-title-block":
                this.a = new eil(jSONObject);
                this.b = "div-title-block";
                return;
            case "div-gallery-block":
                this.a = new rrk(jSONObject);
                this.b = "div-gallery-block";
                return;
            case "div-buttons-block":
                this.a = new shk(jSONObject);
                this.b = "div-buttons-block";
                return;
            case "div-image-block":
                this.a = new ysk(jSONObject);
                this.b = "div-image-block";
                return;
            case "div-universal-block":
                this.a = new rml(jSONObject);
                this.b = "div-universal-block";
                return;
            case "div-tabs-block":
                this.a = new tdl(jSONObject);
                this.b = "div-tabs-block";
                return;
            default:
                throw new JSONException(oyr.p("Unknown object type ", j, " passed to Block"));
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.b, "type");
        tjz0Var.a(this.a, "value");
        return tjz0Var.a.toString();
    }
}
