package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.h7;
import com.yandex.div2.k7;
import com.yandex.div2.m7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes8.dex */
public final class e7 implements Serializer, Deserializer {
    public final fe a;

    public e7(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, m7 m7Var) throws ParsingException {
        boolean z = m7Var instanceof m7.b;
        fe feVar = this.a;
        if (z) {
            k7.c cVar = (k7.c) feVar.r5.getValue();
            l7 l7Var = ((m7.b) m7Var).a;
            cVar.getClass();
            return k7.c.b(parsingContext, l7Var);
        }
        if (!(m7Var instanceof m7.a)) {
            throw new NoWhenBranchMatchedException();
        }
        h7.c cVar2 = (h7.c) feVar.o5.getValue();
        i7 i7Var = ((m7.a) m7Var).a;
        cVar2.getClass();
        return h7.c.b(parsingContext, i7Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object aVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        Object obj4 = null;
        m7 m7Var = entityTemplate instanceof m7 ? (m7) entityTemplate : null;
        if (m7Var != null) {
            if (m7Var instanceof m7.b) {
                readString = "slide";
            } else {
                if (!(m7Var instanceof m7.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "overlap";
            }
        }
        boolean f = epx.f(readString, "slide");
        fe feVar = this.a;
        if (f) {
            k7.c cVar = (k7.c) feVar.r5.getValue();
            if (m7Var != null) {
                if (m7Var instanceof m7.b) {
                    obj3 = ((m7.b) m7Var).a;
                } else {
                    if (!(m7Var instanceof m7.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((m7.a) m7Var).a;
                }
                obj4 = obj3;
            }
            cVar.getClass();
            aVar = new m7.b(k7.c.a(parsingContext, (l7) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "overlap")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            h7.c cVar2 = (h7.c) feVar.o5.getValue();
            if (m7Var != null) {
                if (m7Var instanceof m7.b) {
                    obj2 = ((m7.b) m7Var).a;
                } else {
                    if (!(m7Var instanceof m7.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((m7.a) m7Var).a;
                }
                obj4 = obj2;
            }
            cVar2.getClass();
            aVar = new m7.a(h7.c.a(parsingContext, (i7) obj4, jSONObject));
        }
        return aVar;
    }
}
