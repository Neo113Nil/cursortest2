package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.j3;
import com.yandex.div2.k3;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class mi0 {
    public final jp2 a;
    public final ih0 b;
    public final kh0 c;
    public final ji0 d;
    public final hn e;

    public /* synthetic */ mi0(jp2 jp2Var) {
        this(jp2Var, new ih0(jp2Var), new kh0(), new ji0(), new hn());
    }

    public final hi0 a(xf0 xf0Var, boolean z) {
        j3 j3Var;
        eg0[] eg0VarArr = eg0.b;
        if ("divkit".equals(xf0Var.a)) {
            try {
                String str = xf0Var.b;
                String str2 = xf0Var.c;
                if (z) {
                    this.e.getClass();
                    str2 = hn.a(str2);
                }
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                List list = xf0Var.d;
                ih0 ih0Var = this.b;
                ih0Var.getClass();
                try {
                    ti0 ti0Var = ih0Var.b;
                    ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
                    ti0Var.getClass();
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(parsingErrorLogger, null, 2, null);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    ih0Var.c.getClass();
                    j3.a aVar = j3.j;
                    j3Var = ((k3.b) BuiltInParserKt.getBuiltInParserComponent().E2.getValue()).deserialize(divParsingEnvironment, jSONObject2);
                } catch (Throwable th) {
                    ih0Var.a.reportError("Failed to create DivData", th);
                    j3Var = null;
                }
                this.c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set a = this.d.a(jSONObject2);
                if (j3Var != null) {
                    return new hi0(str, jSONObject2, jSONObject3, list, j3Var, divDataTag, a, new yf0(xf0Var.e));
                }
            } catch (Throwable th2) {
                this.a.reportError("Failed to parse DivKit design", th2);
            }
        }
        return null;
    }

    public mi0(jp2 jp2Var, ih0 ih0Var, kh0 kh0Var, ji0 ji0Var, hn hnVar) {
        this.a = jp2Var;
        this.b = ih0Var;
        this.c = kh0Var;
        this.d = ji0Var;
        this.e = hnVar;
    }
}
