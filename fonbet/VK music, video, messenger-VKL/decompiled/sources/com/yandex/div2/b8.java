package com.yandex.div2;

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
import com.yandex.div2.x7;
import com.yandex.div2.z7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eon;
import xsna.fon;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes8.dex */
public final class b8 implements Serializer, Deserializer {
    public final fe a;

    public b8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, x7 x7Var) throws ParsingException {
        boolean z = x7Var instanceof x7.a;
        fe feVar = this.a;
        if (z) {
            z7.b bVar = (z7.b) feVar.N5.getValue();
            y7 y7Var = ((x7.a) x7Var).b;
            bVar.getClass();
            return z7.b.b(parsingContext, y7Var);
        }
        if (!(x7Var instanceof x7.b)) {
            throw new NoWhenBranchMatchedException();
        }
        fon fonVar = (fon) feVar.Q5.getValue();
        eon eonVar = ((x7.b) x7Var).b;
        fonVar.getClass();
        return fon.a(parsingContext, eonVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readOptionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        boolean equals = readOptionalString.equals("pivot-fixed");
        fe feVar = this.a;
        if (equals) {
            ((z7.b) feVar.N5.getValue()).getClass();
            return new x7.a(z7.b.a(parsingContext, jSONObject));
        }
        if (readOptionalString.equals("pivot-percentage")) {
            ((fon) feVar.Q5.getValue()).getClass();
            return new x7.b(new eon(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readOptionalString, jSONObject);
        e8 e8Var = orThrow instanceof e8 ? (e8) orThrow : null;
        if (e8Var != null) {
            return ((d8) feVar.V5.getValue()).resolve(parsingContext, e8Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readOptionalString);
    }
}
