package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.c7;
import com.yandex.div2.h7;
import com.yandex.div2.k7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes8.dex */
public final class d7 implements Serializer, Deserializer {
    public final fe a;

    public d7(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, c7 c7Var) throws ParsingException {
        boolean z = c7Var instanceof c7.b;
        fe feVar = this.a;
        if (z) {
            k7.b bVar = (k7.b) feVar.q5.getValue();
            j7 j7Var = ((c7.b) c7Var).b;
            bVar.getClass();
            return k7.b.b(parsingContext, j7Var);
        }
        if (!(c7Var instanceof c7.a)) {
            throw new NoWhenBranchMatchedException();
        }
        h7.b bVar2 = (h7.b) feVar.n5.getValue();
        g7 g7Var = ((c7.a) c7Var).b;
        bVar2.getClass();
        return h7.b.b(parsingContext, g7Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "slide");
        fe feVar = this.a;
        if (f) {
            ((k7.b) feVar.q5.getValue()).getClass();
            return new c7.b(k7.b.a(parsingContext, jSONObject));
        }
        if (epx.f(readString, "overlap")) {
            ((h7.b) feVar.n5.getValue()).getClass();
            return new c7.a(h7.b.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        m7 m7Var = orThrow instanceof m7 ? (m7) orThrow : null;
        if (m7Var != null) {
            return ((f7) feVar.v5.getValue()).resolve(parsingContext, m7Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
