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
import xsna.ykn;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class wkn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public wkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ykn yknVar) throws ParsingException {
        if (yknVar instanceof ykn.a) {
            return ((xon) this.a.Q6.getValue()).serialize(parsingContext, ((ykn.a) yknVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        zon zonVar = null;
        ykn yknVar = entityTemplate instanceof ykn ? (ykn) entityTemplate : null;
        if (yknVar != null) {
            if (!(yknVar instanceof ykn.a)) {
                throw new NoWhenBranchMatchedException();
            }
            readString = "shape_drawable";
        }
        if (!epx.f(readString, "shape_drawable")) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        xon xonVar = (xon) this.a.Q6.getValue();
        if (yknVar != null) {
            if (!(yknVar instanceof ykn.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zonVar = ((ykn.a) yknVar).a;
        }
        return new ykn.a(xonVar.deserialize(parsingContext, zonVar, jSONObject));
    }
}
