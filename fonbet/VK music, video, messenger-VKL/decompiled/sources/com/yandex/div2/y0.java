package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.a1;
import com.yandex.div2.a7;
import com.yandex.div2.t2;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class y0 implements Serializer, Deserializer {
    public final fe a;

    public y0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, a1 a1Var) throws ParsingException {
        boolean z = a1Var instanceof a1.a;
        fe feVar = this.a;
        if (z) {
            return ((t2.d) feVar.k2.getValue()).serialize(parsingContext, ((a1.a) a1Var).a);
        }
        if (a1Var instanceof a1.b) {
            return ((a7.d) feVar.f5.getValue()).serialize(parsingContext, ((a1.b) a1Var).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        Object obj4 = null;
        a1 a1Var = entityTemplate instanceof a1 ? (a1) entityTemplate : null;
        if (a1Var != null) {
            if (a1Var instanceof a1.a) {
                readString = "color_animator";
            } else {
                if (!(a1Var instanceof a1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "number_animator";
            }
        }
        boolean f = epx.f(readString, "color_animator");
        fe feVar = this.a;
        if (f) {
            t2.d dVar = (t2.d) feVar.k2.getValue();
            if (a1Var != null) {
                if (a1Var instanceof a1.a) {
                    obj3 = ((a1.a) a1Var).a;
                } else {
                    if (!(a1Var instanceof a1.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((a1.b) a1Var).a;
                }
                obj4 = obj3;
            }
            bVar = new a1.a(dVar.deserialize(parsingContext, (u2) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "number_animator")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            a7.d dVar2 = (a7.d) feVar.f5.getValue();
            if (a1Var != null) {
                if (a1Var instanceof a1.a) {
                    obj2 = ((a1.a) a1Var).a;
                } else {
                    if (!(a1Var instanceof a1.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((a1.b) a1Var).a;
                }
                obj4 = obj2;
            }
            bVar = new a1.b(dVar2.deserialize(parsingContext, (b7) obj4, jSONObject));
        }
        return bVar;
    }
}
