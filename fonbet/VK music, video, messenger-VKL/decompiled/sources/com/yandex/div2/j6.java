package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.g6;
import com.yandex.div2.m6;
import com.yandex.div2.o6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class j6 implements Serializer, Deserializer {
    public final fe a;

    public j6(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, o6 o6Var) throws ParsingException {
        boolean z = o6Var instanceof o6.b;
        fe feVar = this.a;
        if (z) {
            m6.b bVar = (m6.b) feVar.B4.getValue();
            n6 n6Var = ((o6.b) o6Var).a;
            bVar.getClass();
            return m6.b.b(parsingContext, n6Var);
        }
        if (!(o6Var instanceof o6.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g6.b bVar2 = (g6.b) feVar.y4.getValue();
        h6 h6Var = ((o6.a) o6Var).a;
        bVar2.getClass();
        return g6.b.b(parsingContext, h6Var);
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
        o6 o6Var = entityTemplate instanceof o6 ? (o6) entityTemplate : null;
        if (o6Var != null) {
            if (o6Var instanceof o6.b) {
                readString = "regex";
            } else {
                if (!(o6Var instanceof o6.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "expression";
            }
        }
        boolean f = epx.f(readString, "regex");
        fe feVar = this.a;
        if (f) {
            m6.b bVar = (m6.b) feVar.B4.getValue();
            if (o6Var != null) {
                if (o6Var instanceof o6.b) {
                    obj3 = ((o6.b) o6Var).a;
                } else {
                    if (!(o6Var instanceof o6.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((o6.a) o6Var).a;
                }
                obj4 = obj3;
            }
            bVar.getClass();
            aVar = new o6.b(m6.b.a(parsingContext, (n6) obj4, jSONObject));
        } else {
            if (!epx.f(readString, "expression")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            g6.b bVar2 = (g6.b) feVar.y4.getValue();
            if (o6Var != null) {
                if (o6Var instanceof o6.b) {
                    obj2 = ((o6.b) o6Var).a;
                } else {
                    if (!(o6Var instanceof o6.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((o6.a) o6Var).a;
                }
                obj4 = obj2;
            }
            bVar2.getClass();
            aVar = new o6.a(g6.b.a(parsingContext, (h6) obj4, jSONObject));
        }
        return aVar;
    }
}
