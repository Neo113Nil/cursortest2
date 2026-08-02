package xsna;

import android.net.Uri;
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
import xsna.sin;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes8.dex */
public final class qin implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public qin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, sin sinVar) throws ParsingException {
        boolean z = sinVar instanceof sin.a;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            glj gljVar = (glj) feVar.t.getValue();
            ilj iljVar = ((sin.a) sinVar).a;
            gljVar.getClass();
            return glj.a(parsingContext, iljVar);
        }
        if (!(sinVar instanceof sin.b)) {
            throw new NoWhenBranchMatchedException();
        }
        qlj qljVar = (qlj) feVar.w.getValue();
        slj sljVar = ((sin.b) sinVar).a;
        qljVar.getClass();
        return qlj.a(parsingContext, sljVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        JSONSerializable jSONSerializable;
        JSONSerializable jSONSerializable2;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        sin sinVar = entityTemplate instanceof sin ? (sin) entityTemplate : null;
        if (sinVar != null) {
            if (sinVar instanceof sin.a) {
                readString = "text";
            } else {
                if (!(sinVar instanceof sin.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "url";
            }
        }
        boolean f = epx.f(readString, "text");
        com.yandex.div2.fe feVar = this.a;
        if (f) {
            glj gljVar = (glj) feVar.t.getValue();
            if (sinVar == null) {
                jSONSerializable2 = null;
            } else if (sinVar instanceof sin.a) {
                jSONSerializable2 = ((sin.a) sinVar).a;
            } else {
                if (!(sinVar instanceof sin.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable2 = ((sin.b) sinVar).a;
            }
            ilj iljVar = (ilj) jSONSerializable2;
            gljVar.getClass();
            Field<Expression<String>> field = null;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            if (iljVar != null) {
                field = iljVar.a;
            }
            bVar = new sin.a(new ilj(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field)));
        } else {
            Field<Expression<Uri>> field2 = null;
            if (!epx.f(readString, "url")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            qlj qljVar = (qlj) feVar.w.getValue();
            if (sinVar == null) {
                jSONSerializable = null;
            } else if (sinVar instanceof sin.a) {
                jSONSerializable = ((sin.a) sinVar).a;
            } else {
                if (!(sinVar instanceof sin.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((sin.b) sinVar).a;
            }
            slj sljVar = (slj) jSONSerializable;
            qljVar.getClass();
            boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            if (sljVar != null) {
                field2 = sljVar.a;
            }
            bVar = new sin.b(new slj(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride2, jSONObject, "value", typeHelper2, allowPropertyOverride2, field2, ParsingConvertersKt.ANY_TO_URI)));
        }
        return bVar;
    }
}
