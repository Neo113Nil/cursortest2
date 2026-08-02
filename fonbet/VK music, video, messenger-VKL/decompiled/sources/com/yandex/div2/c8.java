package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.e8;
import com.yandex.div2.z7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.gon;
import xsna.ion;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes8.dex */
public final class c8 implements Serializer, Deserializer {
    public final fe a;

    public c8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, e8 e8Var) throws ParsingException {
        boolean z = e8Var instanceof e8.a;
        fe feVar = this.a;
        if (z) {
            z7.c cVar = (z7.c) feVar.O5.getValue();
            a8 a8Var = ((e8.a) e8Var).a;
            cVar.getClass();
            return z7.c.b(parsingContext, a8Var);
        }
        if (!(e8Var instanceof e8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        gon gonVar = (gon) feVar.R5.getValue();
        ion ionVar = ((e8.b) e8Var).a;
        gonVar.getClass();
        return gon.a(parsingContext, ionVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        JSONSerializable jSONSerializable;
        JSONSerializable jSONSerializable2;
        JSONObject jSONObject = (JSONObject) obj;
        String readOptionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readOptionalString);
        JSONSerializable jSONSerializable3 = null;
        e8 e8Var = entityTemplate instanceof e8 ? (e8) entityTemplate : null;
        if (e8Var != null) {
            if (e8Var instanceof e8.a) {
                readOptionalString = "pivot-fixed";
            } else {
                if (!(e8Var instanceof e8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readOptionalString = "pivot-percentage";
            }
        }
        boolean equals = readOptionalString.equals("pivot-fixed");
        fe feVar = this.a;
        if (equals) {
            z7.c cVar = (z7.c) feVar.O5.getValue();
            if (e8Var != null) {
                if (e8Var instanceof e8.a) {
                    jSONSerializable2 = ((e8.a) e8Var).a;
                } else {
                    if (!(e8Var instanceof e8.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONSerializable2 = ((e8.b) e8Var).a;
                }
                jSONSerializable3 = jSONSerializable2;
            }
            cVar.getClass();
            bVar = new e8.a(z7.c.a(parsingContext, (a8) jSONSerializable3, jSONObject));
        } else {
            if (!readOptionalString.equals("pivot-percentage")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readOptionalString);
            }
            gon gonVar = (gon) feVar.R5.getValue();
            if (e8Var == null) {
                jSONSerializable = null;
            } else if (e8Var instanceof e8.a) {
                jSONSerializable = ((e8.a) e8Var).a;
            } else {
                if (!(e8Var instanceof e8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((e8.b) e8Var).a;
            }
            ion ionVar = (ion) jSONSerializable;
            gonVar.getClass();
            bVar = new e8.b(new ion(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), ionVar != null ? ionVar.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        return bVar;
    }
}
