package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.f3;
import com.yandex.div2.k4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.amn;
import xsna.epx;
import xsna.yln;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes8.dex */
public final class d3 implements Serializer, Deserializer {
    public final fe a;

    public d3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, f3 f3Var) throws ParsingException {
        boolean z = f3Var instanceof f3.b;
        fe feVar = this.a;
        if (z) {
            yln ylnVar = (yln) feVar.h4.getValue();
            amn amnVar = ((f3.b) f3Var).a;
            ylnVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "infinity");
            return jSONObject;
        }
        if (!(f3Var instanceof f3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        k4.b bVar = (k4.b) feVar.o3.getValue();
        l4 l4Var = ((f3.a) f3Var).a;
        bVar.getClass();
        return k4.b.b(parsingContext, l4Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        Object obj4 = null;
        f3 f3Var = entityTemplate instanceof f3 ? (f3) entityTemplate : null;
        if (f3Var != null) {
            if (f3Var instanceof f3.b) {
                readString = "infinity";
            } else {
                if (!(f3Var instanceof f3.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "fixed";
            }
        }
        boolean f = epx.f(readString, "infinity");
        fe feVar = this.a;
        if (f) {
            yln ylnVar = (yln) feVar.h4.getValue();
            if (f3Var != null) {
                if (f3Var instanceof f3.b) {
                    obj3 = ((f3.b) f3Var).a;
                } else {
                    if (!(f3Var instanceof f3.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = ((f3.a) f3Var).a;
                }
                obj4 = obj3;
            }
            ylnVar.getClass();
            return new f3.b(new amn());
        }
        if (!epx.f(readString, "fixed")) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        k4.b bVar = (k4.b) feVar.o3.getValue();
        if (f3Var != null) {
            if (f3Var instanceof f3.b) {
                obj2 = ((f3.b) f3Var).a;
            } else {
                if (!(f3Var instanceof f3.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = ((f3.a) f3Var).a;
            }
            obj4 = obj2;
        }
        bVar.getClass();
        return new f3.a(k4.b.a(parsingContext, (l4) obj4, jSONObject));
    }
}
