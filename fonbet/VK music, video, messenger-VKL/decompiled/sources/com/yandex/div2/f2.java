package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.b2;
import com.yandex.div2.h2;
import com.yandex.div2.y1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class f2 implements Serializer, Deserializer {
    public final fe a;

    public f2(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, h2 h2Var) throws ParsingException {
        boolean z = h2Var instanceof h2.b;
        fe feVar = this.a;
        if (z) {
            return ((b2.b) feVar.S1.getValue()).serialize(parsingContext, ((h2.b) h2Var).a);
        }
        if (!(h2Var instanceof h2.a)) {
            throw new NoWhenBranchMatchedException();
        }
        y1.c cVar = (y1.c) feVar.P1.getValue();
        z1 z1Var = ((h2.a) h2Var).a;
        cVar.getClass();
        return y1.c.b(parsingContext, z1Var);
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
        h2 h2Var = entityTemplate instanceof h2 ? (h2) entityTemplate : null;
        if (h2Var != null) {
            if (h2Var instanceof h2.b) {
                readString = "set";
            } else {
                if (!(h2Var instanceof h2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "change_bounds";
            }
        }
        boolean f = epx.f(readString, "set");
        fe feVar = this.a;
        if (f) {
            b2.b bVar = (b2.b) feVar.S1.getValue();
            if (h2Var != null) {
                if (h2Var instanceof h2.b) {
                    obj3 = ((h2.b) h2Var).a;
                } else {
                    if (!(h2Var instanceof h2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((h2.a) h2Var).a;
                }
                obj4 = obj3;
            }
            aVar = new h2.b(bVar.deserialize(parsingContext, (c2) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "change_bounds")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            y1.c cVar = (y1.c) feVar.P1.getValue();
            if (h2Var != null) {
                if (h2Var instanceof h2.b) {
                    obj2 = ((h2.b) h2Var).a;
                } else {
                    if (!(h2Var instanceof h2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((h2.a) h2Var).a;
                }
                obj4 = obj2;
            }
            cVar.getClass();
            aVar = new h2.a(y1.c.a(parsingContext, (z1) obj4, jSONObject));
        }
        return aVar;
    }
}
