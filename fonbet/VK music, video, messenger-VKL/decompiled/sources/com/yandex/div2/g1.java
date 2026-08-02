package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.c1;
import com.yandex.div2.c4;
import com.yandex.div2.c9;
import com.yandex.div2.da;
import com.yandex.div2.i1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class g1 implements Serializer, Deserializer {
    public final fe a;

    public g1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, i1 i1Var) throws ParsingException {
        boolean z = i1Var instanceof i1.c;
        fe feVar = this.a;
        if (z) {
            return ((c1.b) feVar.x1.getValue()).serialize(parsingContext, ((i1.c) i1Var).a);
        }
        if (i1Var instanceof i1.a) {
            c4.c cVar = (c4.c) feVar.f3.getValue();
            d4 d4Var = ((i1.a) i1Var).a;
            cVar.getClass();
            return c4.c.b(parsingContext, d4Var);
        }
        if (!(i1Var instanceof i1.b)) {
            if (i1Var instanceof i1.d) {
                return ((da.d) feVar.c7.getValue()).serialize(parsingContext, ((i1.d) i1Var).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        c9.c cVar2 = (c9.c) feVar.y6.getValue();
        d9 d9Var = ((i1.b) i1Var).a;
        cVar2.getClass();
        return c9.c.b(parsingContext, d9Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object cVar;
        Object a;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        i1 i1Var = entityTemplate instanceof i1 ? (i1) entityTemplate : null;
        if (i1Var != null) {
            if (i1Var instanceof i1.c) {
                readString = "set";
            } else if (i1Var instanceof i1.a) {
                readString = "fade";
            } else if (i1Var instanceof i1.b) {
                readString = "scale";
            } else {
                if (!(i1Var instanceof i1.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "slide";
            }
        }
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        switch (hashCode) {
            case 113762:
                if (readString.equals("set")) {
                    cVar = new i1.c(((c1.b) feVar.x1.getValue()).deserialize(parsingContext, (d1) (i1Var != null ? i1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 3135100:
                if (readString.equals("fade")) {
                    c4.c cVar2 = (c4.c) feVar.f3.getValue();
                    a = i1Var != null ? i1Var.a() : null;
                    cVar2.getClass();
                    cVar = new i1.a(c4.c.a(parsingContext, (d4) a, jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 109250890:
                if (readString.equals("scale")) {
                    c9.c cVar3 = (c9.c) feVar.y6.getValue();
                    a = i1Var != null ? i1Var.a() : null;
                    cVar3.getClass();
                    cVar = new i1.b(c9.c.a(parsingContext, (d9) a, jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            case 109526449:
                if (readString.equals("slide")) {
                    cVar = new i1.d(((da.d) feVar.c7.getValue()).deserialize(parsingContext, (ea) (i1Var != null ? i1Var.a() : null), jSONObject));
                    return cVar;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
    }
}
