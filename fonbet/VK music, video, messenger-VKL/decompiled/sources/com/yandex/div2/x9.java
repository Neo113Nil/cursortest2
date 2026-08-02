package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.r4;
import com.yandex.div2.x6;
import com.yandex.div2.z9;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.mrn;
import xsna.orn;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class x9 implements Serializer, Deserializer {
    public final fe a;

    public x9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, z9 z9Var) throws ParsingException {
        boolean z = z9Var instanceof z9.a;
        fe feVar = this.a;
        if (z) {
            r4.c cVar = (r4.c) feVar.x3.getValue();
            s4 s4Var = ((z9.a) z9Var).a;
            cVar.getClass();
            return r4.c.b(parsingContext, s4Var);
        }
        if (z9Var instanceof z9.b) {
            return ((x6.b) feVar.W4.getValue()).serialize(parsingContext, ((z9.b) z9Var).a);
        }
        if (z9Var instanceof z9.c) {
            return ((mrn) feVar.x9.getValue()).serialize(parsingContext, ((z9.c) z9Var).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object aVar;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        z9 z9Var = entityTemplate instanceof z9 ? (z9) entityTemplate : null;
        if (z9Var != null) {
            if (z9Var instanceof z9.a) {
                readString = "fixed";
            } else if (z9Var instanceof z9.b) {
                readString = "match_parent";
            } else {
                if (!(z9Var instanceof z9.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "wrap_content";
            }
        }
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        if (hashCode == 97445748) {
            if (readString.equals("fixed")) {
                r4.c cVar = (r4.c) feVar.x3.getValue();
                Object a = z9Var != null ? z9Var.a() : null;
                cVar.getClass();
                aVar = new z9.a(r4.c.a(parsingContext, (s4) a, jSONObject));
                return aVar;
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (hashCode == 343327108) {
            if (readString.equals("wrap_content")) {
                aVar = new z9.c(((mrn) feVar.x9.getValue()).deserialize(parsingContext, (orn) (z9Var != null ? z9Var.a() : null), jSONObject));
                return aVar;
            }
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
        }
        if (hashCode == 1386124388 && readString.equals("match_parent")) {
            aVar = new z9.b(((x6.b) feVar.W4.getValue()).deserialize(parsingContext, (y6) (z9Var != null ? z9Var.a() : null), jSONObject));
            return aVar;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
