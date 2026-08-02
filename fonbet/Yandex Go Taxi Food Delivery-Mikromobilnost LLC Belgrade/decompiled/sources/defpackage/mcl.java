package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class mcl implements zsq0, nyi {
    public final JsonParserComponent a;

    public mcl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("solid");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((qcl) jsonParserComponent.S7.getValue()).getClass();
            return new fcl(new pcl());
        }
        if (R.equals("dashed")) {
            ((icl) jsonParserComponent.P7.getValue()).getClass();
            return new ecl(new hcl());
        }
        hex b = yf90Var.b().b(R, jSONObject);
        wcl wclVar = b instanceof wcl ? (wcl) b : null;
        if (wclVar != null) {
            return ((ocl) jsonParserComponent.X7.getValue()).b(wclVar);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, gcl gclVar) {
        boolean z = gclVar instanceof fcl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((qcl) jsonParserComponent.S7.getValue()).getClass();
            return qcl.c(yf90Var);
        }
        if (!(gclVar instanceof ecl)) {
            w511.b();
            return null;
        }
        ((icl) jsonParserComponent.P7.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "type", "dashed");
        return jSONObject;
    }
}
