package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.oqn;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class mqn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public mqn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, oqn oqnVar) throws ParsingException {
        boolean z = oqnVar instanceof oqn.g;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            ynm0 ynm0Var = (ynm0) feVar.ea.getValue();
            aom0 aom0Var = ((oqn.g) oqnVar).a;
            ynm0Var.getClass();
            return ynm0.a(parsingContext, aom0Var);
        }
        if (oqnVar instanceof oqn.e) {
            z9x z9xVar = (z9x) feVar.J9.getValue();
            bax baxVar = ((oqn.e) oqnVar).a;
            z9xVar.getClass();
            return z9x.a(parsingContext, baxVar);
        }
        if (oqnVar instanceof oqn.f) {
            mn70 mn70Var = (mn70) feVar.P9.getValue();
            on70 on70Var = ((oqn.f) oqnVar).a;
            mn70Var.getClass();
            return mn70.a(parsingContext, on70Var);
        }
        if (oqnVar instanceof oqn.c) {
            q8g q8gVar = (q8g) feVar.n.getValue();
            s8g s8gVar = ((oqn.c) oqnVar).a;
            q8gVar.getClass();
            return q8g.a(parsingContext, s8gVar);
        }
        if (oqnVar instanceof oqn.b) {
            u08 u08Var = (u08) feVar.h.getValue();
            w08 w08Var = ((oqn.b) oqnVar).a;
            u08Var.getClass();
            return u08.a(parsingContext, w08Var);
        }
        if (oqnVar instanceof oqn.h) {
            mfq0 mfq0Var = (mfq0) feVar.ka.getValue();
            ofq0 ofq0Var = ((oqn.h) oqnVar).a;
            mfq0Var.getClass();
            return mfq0.a(parsingContext, ofq0Var);
        }
        if (oqnVar instanceof oqn.d) {
            vwm vwmVar = (vwm) feVar.z.getValue();
            xwm xwmVar = ((oqn.d) oqnVar).a;
            vwmVar.getClass();
            return vwm.a(parsingContext, xwmVar);
        }
        if (!(oqnVar instanceof oqn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        il3 il3Var = (il3) feVar.b.getValue();
        kl3 kl3Var = ((oqn.a) oqnVar).a;
        il3Var.getClass();
        return il3.a(parsingContext, kl3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object fVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        oqn oqnVar = entityTemplate instanceof oqn ? (oqn) entityTemplate : null;
        if (oqnVar != null) {
            if (oqnVar instanceof oqn.g) {
                readString = "string";
            } else if (oqnVar instanceof oqn.e) {
                readString = "integer";
            } else if (oqnVar instanceof oqn.f) {
                readString = "number";
            } else if (oqnVar instanceof oqn.c) {
                readString = "color";
            } else if (oqnVar instanceof oqn.b) {
                readString = "boolean";
            } else if (oqnVar instanceof oqn.h) {
                readString = "url";
            } else if (oqnVar instanceof oqn.d) {
                readString = "dict";
            } else {
                if (!(oqnVar instanceof oqn.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "array";
            }
        }
        int hashCode = readString.hashCode();
        com.yandex.div2.fe feVar = this.a;
        switch (hashCode) {
            case -1034364087:
                if (readString.equals("number")) {
                    mn70 mn70Var = (mn70) feVar.P9.getValue();
                    on70 on70Var = (on70) (oqnVar != null ? oqnVar.a() : null);
                    mn70Var.getClass();
                    fVar = new oqn.f(new on70(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), on70Var != null ? on70Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case -891985903:
                if (readString.equals("string")) {
                    ynm0 ynm0Var = (ynm0) feVar.ea.getValue();
                    aom0 aom0Var = (aom0) (oqnVar != null ? oqnVar.a() : null);
                    ynm0Var.getClass();
                    fVar = new oqn.g(new aom0(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), aom0Var != null ? aom0Var.a : null)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 116079:
                if (readString.equals("url")) {
                    mfq0 mfq0Var = (mfq0) feVar.ka.getValue();
                    ofq0 ofq0Var = (ofq0) (oqnVar != null ? oqnVar.a() : null);
                    mfq0Var.getClass();
                    fVar = new oqn.h(new ofq0(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, parsingContext.getAllowPropertyOverride(), ofq0Var != null ? ofq0Var.a : null, ParsingConvertersKt.ANY_TO_URI)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 3083190:
                if (readString.equals("dict")) {
                    vwm vwmVar = (vwm) feVar.z.getValue();
                    xwm xwmVar = (xwm) (oqnVar != null ? oqnVar.a() : null);
                    vwmVar.getClass();
                    fVar = new oqn.d(new xwm(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT, parsingContext.getAllowPropertyOverride(), xwmVar != null ? xwmVar.a : null)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 64711720:
                if (readString.equals("boolean")) {
                    u08 u08Var = (u08) feVar.h.getValue();
                    w08 w08Var = (w08) (oqnVar != null ? oqnVar.a() : null);
                    u08Var.getClass();
                    fVar = new oqn.b(new w08(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), w08Var != null ? w08Var.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 93090393:
                if (readString.equals("array")) {
                    il3 il3Var = (il3) feVar.b.getValue();
                    kl3 kl3Var = (kl3) (oqnVar != null ? oqnVar.a() : null);
                    il3Var.getClass();
                    fVar = new oqn.a(new kl3(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, parsingContext.getAllowPropertyOverride(), kl3Var != null ? kl3Var.a : null)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 94842723:
                if (readString.equals("color")) {
                    q8g q8gVar = (q8g) feVar.n.getValue();
                    s8g s8gVar = (s8g) (oqnVar != null ? oqnVar.a() : null);
                    q8gVar.getClass();
                    fVar = new oqn.c(new s8g(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), s8gVar != null ? s8gVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 1958052158:
                if (readString.equals("integer")) {
                    z9x z9xVar = (z9x) feVar.J9.getValue();
                    bax baxVar = (bax) (oqnVar != null ? oqnVar.a() : null);
                    z9xVar.getClass();
                    fVar = new oqn.e(new bax(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), baxVar != null ? baxVar.a : null, ParsingConvertersKt.NUMBER_TO_INT)));
                    return fVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
    }
}
