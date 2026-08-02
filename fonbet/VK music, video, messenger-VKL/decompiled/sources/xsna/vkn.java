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
import xsna.ukn;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class vkn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public vkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ukn uknVar) throws ParsingException {
        if (uknVar instanceof ukn.a) {
            return ((won) this.a.P6.getValue()).serialize(parsingContext, ((ukn.a) uknVar).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "shape_drawable");
        com.yandex.div2.fe feVar = this.a;
        if (f) {
            return new ukn.a(((won) feVar.P6.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        ykn yknVar = orThrow instanceof ykn ? (ykn) orThrow : null;
        if (yknVar != null) {
            return ((xkn) feVar.X2.getValue()).resolve(parsingContext, yknVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
