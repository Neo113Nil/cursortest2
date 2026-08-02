package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.a7;
import com.yandex.div2.t2;
import com.yandex.div2.w0;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class x0 implements Serializer, Deserializer {
    public final fe a;

    public x0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, w0 w0Var) throws ParsingException {
        boolean z = w0Var instanceof w0.a;
        fe feVar = this.a;
        if (z) {
            return ((t2.c) feVar.j2.getValue()).serialize(parsingContext, ((w0.a) w0Var).b);
        }
        if (w0Var instanceof w0.b) {
            return ((a7.c) feVar.e5.getValue()).serialize(parsingContext, ((w0.b) w0Var).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "color_animator");
        fe feVar = this.a;
        if (f) {
            return new w0.a(((t2.c) feVar.j2.getValue()).deserialize(parsingContext, jSONObject));
        }
        if (epx.f(readString, "number_animator")) {
            return new w0.b(((a7.c) feVar.e5.getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        a1 a1Var = orThrow instanceof a1 ? (a1) orThrow : null;
        if (a1Var != null) {
            return ((z0) feVar.v1.getValue()).resolve(parsingContext, a1Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
