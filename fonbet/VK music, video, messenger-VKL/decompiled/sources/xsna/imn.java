package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.pmn;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class imn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public imn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, pmn pmnVar) throws ParsingException {
        boolean z = pmnVar instanceof pmn.b;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            mmn mmnVar = (mmn) feVar.n4.getValue();
            omn omnVar = ((pmn.b) pmnVar).a;
            mmnVar.getClass();
            return mmn.a(parsingContext, omnVar);
        }
        if (!(pmnVar instanceof pmn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        emn emnVar = (emn) feVar.k4.getValue();
        gmn gmnVar = ((pmn.a) pmnVar).a;
        emnVar.getClass();
        return emn.a(parsingContext, gmnVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object aVar;
        JSONSerializable jSONSerializable;
        JSONSerializable jSONSerializable2;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        pmn pmnVar = entityTemplate instanceof pmn ? (pmn) entityTemplate : null;
        if (pmnVar != null) {
            if (pmnVar instanceof pmn.b) {
                readString = "regex";
            } else {
                if (!(pmnVar instanceof pmn.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "expression";
            }
        }
        boolean f = epx.f(readString, "regex");
        com.yandex.div2.fe feVar = this.a;
        if (f) {
            mmn mmnVar = (mmn) feVar.n4.getValue();
            if (pmnVar == null) {
                jSONSerializable2 = null;
            } else if (pmnVar instanceof pmn.b) {
                jSONSerializable2 = ((pmn.b) pmnVar).a;
            } else {
                if (!(pmnVar instanceof pmn.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable2 = ((pmn.a) pmnVar).a;
            }
            omn omnVar = (omn) jSONSerializable2;
            mmnVar.getClass();
            Field<Expression<String>> field = null;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (omnVar != null) {
                field = omnVar.a;
            }
            aVar = new pmn.b(new omn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, field)));
        } else {
            Field<Expression<Boolean>> field2 = null;
            if (!epx.f(readString, "expression")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            emn emnVar = (emn) feVar.k4.getValue();
            if (pmnVar == null) {
                jSONSerializable = null;
            } else if (pmnVar instanceof pmn.b) {
                jSONSerializable = ((pmn.b) pmnVar).a;
            } else {
                if (!(pmnVar instanceof pmn.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((pmn.a) pmnVar).a;
            }
            gmn gmnVar = (gmn) jSONSerializable;
            emnVar.getClass();
            boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            if (gmnVar != null) {
                field2 = gmnVar.a;
            }
            aVar = new pmn.a(new gmn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride2, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, typeHelper2, allowPropertyOverride2, field2, ParsingConvertersKt.ANY_TO_BOOLEAN)));
        }
        return aVar;
    }
}
