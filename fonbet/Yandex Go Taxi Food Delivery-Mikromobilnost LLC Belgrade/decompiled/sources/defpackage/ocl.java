package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ocl implements qfy0 {
    public final JsonParserComponent a;

    public ocl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b((wcl) hexVar);
    }

    public final gcl b(wcl wclVar) {
        boolean z = wclVar instanceof vcl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((scl) jsonParserComponent.U7.getValue()).getClass();
            return new fcl(new pcl());
        }
        if (wclVar instanceof ucl) {
            ((kcl) jsonParserComponent.R7.getValue()).getClass();
            return new ecl(new hcl());
        }
        w511.b();
        return null;
    }
}
