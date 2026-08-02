package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.b3;
import com.yandex.div2.k4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.wln;
import xsna.xln;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes8.dex */
public final class c3 implements Serializer, Deserializer {
    public final fe a;

    public c3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, b3 b3Var) throws ParsingException {
        boolean z = b3Var instanceof b3.b;
        fe feVar = this.a;
        if (z) {
            xln xlnVar = (xln) feVar.g4.getValue();
            wln wlnVar = ((b3.b) b3Var).b;
            xlnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "infinity");
            return jSONObject;
        }
        if (!(b3Var instanceof b3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        k4.a aVar = (k4.a) feVar.n3.getValue();
        j4 j4Var = ((b3.a) b3Var).b;
        aVar.getClass();
        return k4.a.b(parsingContext, j4Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "infinity");
        fe feVar = this.a;
        if (f) {
            ((xln) feVar.g4.getValue()).getClass();
            return new b3.b(new wln());
        }
        if (epx.f(readString, "fixed")) {
            ((k4.a) feVar.n3.getValue()).getClass();
            return new b3.a(k4.a.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        f3 f3Var = orThrow instanceof f3 ? (f3) orThrow : null;
        if (f3Var != null) {
            return ((e3) feVar.x2.getValue()).resolve(parsingContext, f3Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
