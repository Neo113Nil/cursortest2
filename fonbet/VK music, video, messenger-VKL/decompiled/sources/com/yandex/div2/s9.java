package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.j2;
import com.yandex.div2.u9;
import com.yandex.div2.z8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes8.dex */
public final class s9 implements Serializer, Deserializer {
    public final fe a;

    public s9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, u9 u9Var) throws ParsingException {
        boolean z = u9Var instanceof u9.b;
        fe feVar = this.a;
        if (z) {
            return ((z8.b) feVar.v6.getValue()).serialize(parsingContext, ((u9.b) u9Var).a);
        }
        if (u9Var instanceof u9.a) {
            return ((j2.b) feVar.Y1.getValue()).serialize(parsingContext, ((u9.a) u9Var).a);
        }
        throw new NoWhenBranchMatchedException();
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
        u9 u9Var = entityTemplate instanceof u9 ? (u9) entityTemplate : null;
        if (u9Var != null) {
            if (u9Var instanceof u9.b) {
                readString = "rounded_rectangle";
            } else {
                if (!(u9Var instanceof u9.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "circle";
            }
        }
        boolean f = epx.f(readString, "rounded_rectangle");
        fe feVar = this.a;
        if (f) {
            z8.b bVar = (z8.b) feVar.v6.getValue();
            if (u9Var != null) {
                if (u9Var instanceof u9.b) {
                    obj3 = ((u9.b) u9Var).a;
                } else {
                    if (!(u9Var instanceof u9.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((u9.a) u9Var).a;
                }
                obj4 = obj3;
            }
            aVar = new u9.b(bVar.deserialize(parsingContext, (a9) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "circle")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            j2.b bVar2 = (j2.b) feVar.Y1.getValue();
            if (u9Var != null) {
                if (u9Var instanceof u9.b) {
                    obj2 = ((u9.b) u9Var).a;
                } else {
                    if (!(u9Var instanceof u9.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((u9.a) u9Var).a;
                }
                obj4 = obj2;
            }
            aVar = new u9.a(bVar2.deserialize(parsingContext, (k2) obj4, jSONObject));
        }
        return aVar;
    }
}
