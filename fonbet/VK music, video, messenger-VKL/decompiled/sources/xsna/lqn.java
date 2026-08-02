package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.kqn;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class lqn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public lqn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, kqn kqnVar) throws ParsingException {
        boolean z = kqnVar instanceof kqn.g;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            xnm0 xnm0Var = (xnm0) feVar.da.getValue();
            wnm0 wnm0Var = ((kqn.g) kqnVar).b;
            xnm0Var.getClass();
            return xnm0.a(parsingContext, wnm0Var);
        }
        if (kqnVar instanceof kqn.e) {
            y9x y9xVar = (y9x) feVar.I9.getValue();
            x9x x9xVar = ((kqn.e) kqnVar).b;
            y9xVar.getClass();
            return y9x.a(parsingContext, x9xVar);
        }
        if (kqnVar instanceof kqn.f) {
            ln70 ln70Var = (ln70) feVar.O9.getValue();
            kn70 kn70Var = ((kqn.f) kqnVar).b;
            ln70Var.getClass();
            return ln70.a(parsingContext, kn70Var);
        }
        if (kqnVar instanceof kqn.c) {
            p8g p8gVar = (p8g) feVar.m.getValue();
            o8g o8gVar = ((kqn.c) kqnVar).b;
            p8gVar.getClass();
            return p8g.a(parsingContext, o8gVar);
        }
        if (kqnVar instanceof kqn.b) {
            t08 t08Var = (t08) feVar.g.getValue();
            s08 s08Var = ((kqn.b) kqnVar).b;
            t08Var.getClass();
            return t08.a(parsingContext, s08Var);
        }
        if (kqnVar instanceof kqn.h) {
            lfq0 lfq0Var = (lfq0) feVar.ja.getValue();
            kfq0 kfq0Var = ((kqn.h) kqnVar).b;
            lfq0Var.getClass();
            return lfq0.a(parsingContext, kfq0Var);
        }
        if (kqnVar instanceof kqn.d) {
            uwm uwmVar = (uwm) feVar.y.getValue();
            twm twmVar = ((kqn.d) kqnVar).b;
            uwmVar.getClass();
            return uwm.a(parsingContext, twmVar);
        }
        if (!(kqnVar instanceof kqn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        hl3 hl3Var = (hl3) feVar.a.getValue();
        gl3 gl3Var = ((kqn.a) kqnVar).b;
        hl3Var.getClass();
        return hl3.a(parsingContext, gl3Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        com.yandex.div2.fe feVar = this.a;
        switch (hashCode) {
            case -1034364087:
                if (readString.equals("number")) {
                    ((ln70) feVar.O9.getValue()).getClass();
                    return new kqn.f(new kn70(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    ((xnm0) feVar.da.getValue()).getClass();
                    return new kqn.g(new wnm0(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING)));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    ((lfq0) feVar.ja.getValue()).getClass();
                    return new kqn.h(new kfq0(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI)));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    ((uwm) feVar.y.getValue()).getClass();
                    return new kqn.d(new twm(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT)));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    ((t08) feVar.g.getValue()).getClass();
                    return new kqn.b(new s08(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN)));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    ((hl3) feVar.a.getValue()).getClass();
                    return new kqn.a(new gl3(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY)));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    ((p8g) feVar.m.getValue()).getClass();
                    return new kqn.c(new o8g(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT)));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    ((y9x) feVar.I9.getValue()).getClass();
                    return new kqn.e(new x9x(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT)));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        oqn oqnVar = orThrow instanceof oqn ? (oqn) orThrow : null;
        if (oqnVar != null) {
            return ((nqn) feVar.g9.getValue()).resolve(parsingContext, oqnVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
