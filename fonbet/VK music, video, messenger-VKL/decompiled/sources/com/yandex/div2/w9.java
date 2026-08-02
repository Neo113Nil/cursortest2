package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.r4;
import com.yandex.div2.v9;
import com.yandex.div2.x6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.lrn;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class w9 implements Serializer, Deserializer {
    public final fe a;

    public w9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, v9 v9Var) throws ParsingException {
        boolean z = v9Var instanceof v9.a;
        fe feVar = this.a;
        if (z) {
            r4.b bVar = (r4.b) feVar.w3.getValue();
            q4 q4Var = ((v9.a) v9Var).b;
            bVar.getClass();
            return r4.b.b(parsingContext, q4Var);
        }
        if (v9Var instanceof v9.b) {
            return ((x6.a) feVar.V4.getValue()).serialize(parsingContext, ((v9.b) v9Var).b);
        }
        if (v9Var instanceof v9.c) {
            return ((lrn) feVar.w9.getValue()).serialize(parsingContext, ((v9.c) v9Var).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        fe feVar = this.a;
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && readString.equals("match_parent")) {
                    return new v9.b(((x6.a) feVar.V4.getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (readString.equals("wrap_content")) {
                return new v9.c(((lrn) feVar.w9.getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (readString.equals("fixed")) {
            ((r4.b) feVar.w3.getValue()).getClass();
            return new v9.a(r4.b.a(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        z9 z9Var = orThrow instanceof z9 ? (z9) orThrow : null;
        if (z9Var != null) {
            return ((y9) feVar.a7.getValue()).resolve(parsingContext, z9Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}
