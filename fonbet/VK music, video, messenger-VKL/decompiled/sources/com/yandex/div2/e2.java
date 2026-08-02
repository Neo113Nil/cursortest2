package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.b2;
import com.yandex.div2.d2;
import com.yandex.div2.y1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class e2 implements Serializer, Deserializer {
    public final fe a;

    public e2(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, d2 d2Var) throws ParsingException {
        boolean z = d2Var instanceof d2.b;
        fe feVar = this.a;
        if (z) {
            return ((b2.a) feVar.R1.getValue()).serialize(parsingContext, ((d2.b) d2Var).b);
        }
        if (!(d2Var instanceof d2.a)) {
            throw new NoWhenBranchMatchedException();
        }
        y1.b bVar = (y1.b) feVar.O1.getValue();
        x1 x1Var = ((d2.a) d2Var).b;
        bVar.getClass();
        return y1.b.b(parsingContext, x1Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "set");
        fe feVar = this.a;
        if (f) {
            return new d2.b(((b2.a) feVar.R1.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "change_bounds")) {
            ((y1.b) feVar.O1.getValue()).getClass();
            return new d2.a(y1.b.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        h2 h2Var = orThrow instanceof h2 ? (h2) orThrow : null;
        if (h2Var != null) {
            return ((g2) feVar.W1.getValue()).resolve(parsingContext, h2Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
