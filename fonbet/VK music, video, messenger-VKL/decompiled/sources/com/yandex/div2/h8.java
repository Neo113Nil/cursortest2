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
import com.yandex.div2.g8;
import com.yandex.div2.n8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.pon;
import xsna.qon;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes8.dex */
public final class h8 implements Serializer, Deserializer {
    public final fe a;

    public h8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, g8 g8Var) throws ParsingException {
        boolean z = g8Var instanceof g8.a;
        fe feVar = this.a;
        if (z) {
            n8.b bVar = (n8.b) feVar.c6.getValue();
            m8 m8Var = ((g8.a) g8Var).b;
            bVar.getClass();
            return n8.b.b(parsingContext, m8Var);
        }
        if (!(g8Var instanceof g8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        qon qonVar = (qon) feVar.i6.getValue();
        pon ponVar = ((g8.b) g8Var).b;
        qonVar.getClass();
        return qon.a(parsingContext, ponVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "fixed");
        fe feVar = this.a;
        if (f) {
            ((n8.b) feVar.c6.getValue()).getClass();
            return new g8.a(n8.b.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "relative")) {
            ((qon) feVar.i6.getValue()).getClass();
            return new g8.b(new pon(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        k8 k8Var = orThrow instanceof k8 ? (k8) orThrow : null;
        if (k8Var != null) {
            return ((j8) feVar.b6.getValue()).resolve(parsingContext, k8Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
