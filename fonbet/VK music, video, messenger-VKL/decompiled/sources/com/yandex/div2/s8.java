package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.r4;
import com.yandex.div2.u8;
import com.yandex.div2.v8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public final class s8 implements Serializer, Deserializer {
    public final fe a;

    public s8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, u8 u8Var) throws ParsingException {
        boolean z = u8Var instanceof u8.a;
        fe feVar = this.a;
        if (z) {
            r4.c cVar = (r4.c) feVar.x3.getValue();
            s4 s4Var = ((u8.a) u8Var).a;
            cVar.getClass();
            return r4.c.b(parsingContext, s4Var);
        }
        if (!(u8Var instanceof u8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        v8.c cVar2 = (v8.c) feVar.m6.getValue();
        w8 w8Var = ((u8.b) u8Var).a;
        cVar2.getClass();
        return v8.c.a(parsingContext, w8Var);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        Object bVar;
        JSONSerializable jSONSerializable;
        JSONSerializable jSONSerializable2;
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        JSONSerializable jSONSerializable3 = null;
        u8 u8Var = entityTemplate instanceof u8 ? (u8) entityTemplate : null;
        if (u8Var != null) {
            if (u8Var instanceof u8.a) {
                readString = "fixed";
            } else {
                if (!(u8Var instanceof u8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "relative";
            }
        }
        boolean f = epx.f(readString, "fixed");
        fe feVar = this.a;
        if (f) {
            r4.c cVar = (r4.c) feVar.x3.getValue();
            if (u8Var != null) {
                if (u8Var instanceof u8.a) {
                    jSONSerializable2 = ((u8.a) u8Var).a;
                } else {
                    if (!(u8Var instanceof u8.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONSerializable2 = ((u8.b) u8Var).a;
                }
                jSONSerializable3 = jSONSerializable2;
            }
            cVar.getClass();
            bVar = new u8.a(r4.c.a(parsingContext, (s4) jSONSerializable3, jSONObject));
        } else {
            if (!epx.f(readString, "relative")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            v8.c cVar2 = (v8.c) feVar.m6.getValue();
            if (u8Var == null) {
                jSONSerializable = null;
            } else if (u8Var instanceof u8.a) {
                jSONSerializable = ((u8.a) u8Var).a;
            } else {
                if (!(u8Var instanceof u8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((u8.b) u8Var).a;
            }
            w8 w8Var = (w8) jSONSerializable;
            cVar2.getClass();
            Field<Expression<DivRadialGradientRelativeRadius.Value>> field = null;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<DivRadialGradientRelativeRadius.Value> typeHelper = v8.a;
            if (w8Var != null) {
                field = w8Var.a;
            }
            bVar = new u8.b(new w8(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, DivRadialGradientRelativeRadius.Value.FROM_STRING)));
        }
        return bVar;
    }
}
