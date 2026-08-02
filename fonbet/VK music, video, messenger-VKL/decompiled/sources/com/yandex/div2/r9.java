package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.j2;
import com.yandex.div2.q9;
import com.yandex.div2.z8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes8.dex */
public final class r9 implements Serializer, Deserializer {
    public final fe a;

    public r9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, q9 q9Var) throws ParsingException {
        boolean z = q9Var instanceof q9.b;
        fe feVar = this.a;
        if (z) {
            return ((z8.a) feVar.u6.getValue()).serialize(parsingContext, ((q9.b) q9Var).b);
        }
        if (q9Var instanceof q9.a) {
            return ((j2.a) feVar.X1.getValue()).serialize(parsingContext, ((q9.a) q9Var).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "rounded_rectangle");
        fe feVar = this.a;
        if (f) {
            return new q9.b(((z8.a) feVar.u6.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "circle")) {
            return new q9.a(((j2.a) feVar.X1.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        u9 u9Var = orThrow instanceof u9 ? (u9) orThrow : null;
        if (u9Var != null) {
            return ((t9) feVar.U6.getValue()).resolve(parsingContext, u9Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
