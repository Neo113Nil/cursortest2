package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.q8;
import com.yandex.div2.r4;
import com.yandex.div2.v8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public final class r8 implements Serializer, Deserializer {
    public final fe a;

    public r8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, q8 q8Var) throws ParsingException {
        boolean z = q8Var instanceof q8.a;
        fe feVar = this.a;
        if (z) {
            r4.b bVar = (r4.b) feVar.w3.getValue();
            q4 q4Var = ((q8.a) q8Var).b;
            bVar.getClass();
            return r4.b.b(parsingContext, q4Var);
        }
        if (!(q8Var instanceof q8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        v8.b bVar2 = (v8.b) feVar.l6.getValue();
        DivRadialGradientRelativeRadius divRadialGradientRelativeRadius = ((q8.b) q8Var).b;
        bVar2.getClass();
        return v8.b.a(parsingContext, divRadialGradientRelativeRadius);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "fixed");
        fe feVar = this.a;
        if (f) {
            ((r4.b) feVar.w3.getValue()).getClass();
            return new q8.a(r4.b.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "relative")) {
            ((v8.b) feVar.l6.getValue()).getClass();
            return new q8.b(new DivRadialGradientRelativeRadius(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", v8.a, DivRadialGradientRelativeRadius.Value.FROM_STRING)));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        u8 u8Var = orThrow instanceof u8 ? (u8) orThrow : null;
        if (u8Var != null) {
            return ((t8) feVar.h6.getValue()).resolve(parsingContext, u8Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
