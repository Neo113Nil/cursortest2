package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.unn;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class vnn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public vnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, unn unnVar) throws ParsingException {
        boolean z = unnVar instanceof unn.c;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            return ((qnn) feVar.k5.getValue()).serialize(parsingContext, ((unn.c) unnVar).b);
        }
        if (unnVar instanceof unn.a) {
            return ((bnn) feVar.Y4.getValue()).serialize(parsingContext, ((unn.a) unnVar).b);
        }
        if (!(unnVar instanceof unn.b)) {
            throw new NoWhenBranchMatchedException();
        }
        lnn lnnVar = (lnn) feVar.h5.getValue();
        knn knnVar = ((unn.b) unnVar).b;
        lnnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // com.yandex.div.serialization.Deserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        ynn ynnVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        com.yandex.div2.fe feVar = this.a;
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && readString.equals("wrap_content")) {
                    ((lnn) feVar.h5.getValue()).getClass();
                    return new unn.b(new knn());
                }
            } else if (readString.equals("fixed")) {
                cVar = new unn.a(((bnn) feVar.Y4.getValue()).deserialize(parsingContext, jSONObject));
                return cVar;
            }
            EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
            ynnVar = !(orThrow instanceof ynn) ? (ynn) orThrow : null;
            if (ynnVar == null) {
                return ((xnn) feVar.y5.getValue()).resolve(parsingContext, ynnVar, jSONObject);
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (readString.equals("percentage")) {
            cVar = new unn.c(((qnn) feVar.k5.getValue()).deserialize(parsingContext, jSONObject));
            return cVar;
        }
        EntityTemplate<?> orThrow2 = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        if (!(orThrow2 instanceof ynn)) {
        }
        if (ynnVar == null) {
        }
    }
}
