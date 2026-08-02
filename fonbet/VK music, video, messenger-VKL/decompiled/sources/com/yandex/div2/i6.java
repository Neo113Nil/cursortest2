package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.b6;
import com.yandex.div2.g6;
import com.yandex.div2.m6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class i6 implements Serializer, Deserializer {
    public final fe a;

    public i6(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, b6 b6Var) throws ParsingException {
        boolean z = b6Var instanceof b6.b;
        fe feVar = this.a;
        if (z) {
            m6.a aVar = (m6.a) feVar.A4.getValue();
            l6 l6Var = ((b6.b) b6Var).b;
            aVar.getClass();
            return m6.a.b(parsingContext, l6Var);
        }
        if (!(b6Var instanceof b6.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g6.a aVar2 = (g6.a) feVar.x4.getValue();
        f6 f6Var = ((b6.a) b6Var).b;
        aVar2.getClass();
        return g6.a.b(parsingContext, f6Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "regex");
        fe feVar = this.a;
        if (f) {
            ((m6.a) feVar.A4.getValue()).getClass();
            return new b6.b(m6.a.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "expression")) {
            ((g6.a) feVar.x4.getValue()).getClass();
            return new b6.a(g6.a.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        o6 o6Var = orThrow instanceof o6 ? (o6) orThrow : null;
        if (o6Var != null) {
            return ((k6) feVar.F4.getValue()).resolve(parsingContext, o6Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
