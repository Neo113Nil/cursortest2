package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.g0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class f0 {

    @Deprecated
    public static final Expression<DivActionSubmit.Request.Method> a;

    @Deprecated
    public static final TypeHelper<DivActionSubmit.Request.Method> b;

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionSubmit.Request.Method);
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivActionSubmit.Request request) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "headers", request.a, this.a.V0);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "method", request.b, DivActionSubmit.Request.Method.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", request.c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "headers", this.a.V0);
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = f0.b;
            izs<String, DivActionSubmit.Request.Method> izsVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = f0.a;
            Expression<DivActionSubmit.Request.Method> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "method", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivActionSubmit.Request(readOptionalList, expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, g0.a aVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "headers", aVar.a, this.a.W0);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "method", aVar.b, DivActionSubmit.Request.Method.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", aVar.c, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            g0.a aVar = (g0.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new g0.a(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "headers", allowPropertyOverride, aVar != null ? aVar.a : null, this.a.W0), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "method", f0.b, allowPropertyOverride, aVar != null ? aVar.b : null, DivActionSubmit.Request.Method.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, aVar != null ? aVar.c : null, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, g0.a, DivActionSubmit.Request> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivActionSubmit.Request resolve(ParsingContext parsingContext, g0.a aVar, JSONObject jSONObject) {
            g0.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<List<g0.a.C2113a>> field = aVar2.a;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "headers", feVar.X0, feVar.V0);
            Field<Expression<DivActionSubmit.Request.Method>> field2 = aVar2.b;
            TypeHelper<DivActionSubmit.Request.Method> typeHelper = f0.b;
            izs<String, DivActionSubmit.Request.Method> izsVar = DivActionSubmit.Request.Method.FROM_STRING;
            Expression<DivActionSubmit.Request.Method> expression = f0.a;
            Expression<DivActionSubmit.Request.Method> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "method", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivActionSubmit.Request(resolveOptionalList, expression, JsonFieldResolver.resolveExpression(parsingContext, aVar2.c, jSONObject2, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivActionSubmit.Request.Method method = DivActionSubmit.Request.Method.POST;
        a = Expression.Companion.constant$default(companion, method, null, 2, null);
        b = TypeHelper.Companion.from(method, a.i);
    }
}
