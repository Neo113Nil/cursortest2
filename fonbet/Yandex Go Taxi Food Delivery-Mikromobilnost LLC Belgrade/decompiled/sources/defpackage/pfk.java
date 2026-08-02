package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pfk implements qfy0 {
    public final JsonParserComponent a;

    public pfk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kfk a(yf90 yf90Var, dgk dgkVar, JSONObject jSONObject) {
        boolean z = dgkVar instanceof zfk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new gfk(((azk) jsonParserComponent.c5.getValue()).a(yf90Var, ((zfk) dgkVar).a, jSONObject));
        }
        if (dgkVar instanceof bgk) {
            return new ifk(((d6l) jsonParserComponent.D6.getValue()).a(yf90Var, ((bgk) dgkVar).a, jSONObject));
        }
        if (dgkVar instanceof yfk) {
            return new ffk(((vsk) jsonParserComponent.h4.getValue()).a(yf90Var, ((yfk) dgkVar).a, jSONObject));
        }
        if (dgkVar instanceof cgk) {
            abl ablVar = (abl) jsonParserComponent.F7.getValue();
            bbl bblVar = ((cgk) dgkVar).a;
            ablVar.getClass();
            return new jfk(abl.b(yf90Var, bblVar, jSONObject));
        }
        if (dgkVar instanceof agk) {
            return new hfk(((g0l) jsonParserComponent.o5.getValue()).a(yf90Var, ((agk) dgkVar).b(), jSONObject));
        }
        w511.b();
        return null;
    }
}
