package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.k8;
import com.yandex.div2.n8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.ron;
import xsna.ton;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes8.dex */
public final class i8 implements Serializer, Deserializer {
    public final fe a;

    public i8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, k8 k8Var) throws ParsingException {
        boolean z = k8Var instanceof k8.a;
        fe feVar = this.a;
        if (z) {
            n8.c cVar = (n8.c) feVar.d6.getValue();
            o8 o8Var = ((k8.a) k8Var).a;
            cVar.getClass();
            return n8.c.b(parsingContext, o8Var);
        }
        if (!(k8Var instanceof k8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ron ronVar = (ron) feVar.j6.getValue();
        ton tonVar = ((k8.b) k8Var).a;
        ronVar.getClass();
        return ron.a(parsingContext, tonVar);
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
        k8 k8Var = entityTemplate instanceof k8 ? (k8) entityTemplate : null;
        if (k8Var != null) {
            if (k8Var instanceof k8.a) {
                readString = "fixed";
            } else {
                if (!(k8Var instanceof k8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                readString = "relative";
            }
        }
        boolean f = epx.f(readString, "fixed");
        fe feVar = this.a;
        if (f) {
            n8.c cVar = (n8.c) feVar.d6.getValue();
            if (k8Var != null) {
                if (k8Var instanceof k8.a) {
                    jSONSerializable2 = ((k8.a) k8Var).a;
                } else {
                    if (!(k8Var instanceof k8.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONSerializable2 = ((k8.b) k8Var).a;
                }
                jSONSerializable3 = jSONSerializable2;
            }
            cVar.getClass();
            bVar = new k8.a(n8.c.a(parsingContext, (o8) jSONSerializable3, jSONObject));
        } else {
            if (!epx.f(readString, "relative")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
            }
            ron ronVar = (ron) feVar.j6.getValue();
            if (k8Var == null) {
                jSONSerializable = null;
            } else if (k8Var instanceof k8.a) {
                jSONSerializable = ((k8.a) k8Var).a;
            } else {
                if (!(k8Var instanceof k8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((k8.b) k8Var).a;
            }
            ton tonVar = (ton) jSONSerializable;
            ronVar.getClass();
            Field<Expression<Double>> field = null;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            if (tonVar != null) {
                field = tonVar.a;
            }
            bVar = new k8.b(new ton(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, field, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        return bVar;
    }
}
