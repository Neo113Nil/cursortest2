package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ncl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ncl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object uclVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        wcl wclVar = hexVar instanceof wcl ? (wcl) hexVar : null;
        if (wclVar != null) {
            if (wclVar instanceof vcl) {
                R = "solid";
            } else {
                if (!(wclVar instanceof ucl)) {
                    w511.b();
                    return null;
                }
                R = "dashed";
            }
        }
        boolean equals = R.equals("solid");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            rcl rclVar = (rcl) jsonParserComponent.T7.getValue();
            if (wclVar != null) {
                if (wclVar instanceof vcl) {
                    obj2 = ((vcl) wclVar).a;
                } else {
                    if (!(wclVar instanceof ucl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((ucl) wclVar).a;
                }
                obj3 = obj2;
            }
            rclVar.getClass();
            uclVar = new vcl(new tcl());
        } else {
            if (!R.equals("dashed")) {
                throw fg90.m(jSONObject, "type", R);
            }
            jcl jclVar = (jcl) jsonParserComponent.Q7.getValue();
            if (wclVar != null) {
                if (wclVar instanceof vcl) {
                    obj = ((vcl) wclVar).a;
                } else {
                    if (!(wclVar instanceof ucl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((ucl) wclVar).a;
                }
                obj3 = obj;
            }
            jclVar.getClass();
            uclVar = new ucl(new lcl());
        }
        return uclVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, wcl wclVar) {
        boolean z = wclVar instanceof vcl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((rcl) jsonParserComponent.T7.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "solid");
            return jSONObject;
        }
        if (!(wclVar instanceof ucl)) {
            w511.b();
            return null;
        }
        ((jcl) jsonParserComponent.Q7.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        wwg.Z(yf90Var, jSONObject2, "type", "dashed");
        return jSONObject2;
    }
}
