package com.yandex.div2;

import android.net.Uri;
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
import com.yandex.div2.DivAction;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.pkn;
import xsna.rl3;
import xsna.tkn;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class j {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    @Deprecated
    public static final TypeHelper<DivAction.Target> b = TypeHelper.Companion.from(rl3.L(DivAction.Target.values()), a.i);

    /* compiled from: DivActionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAction.Target);
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivAction divAction) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            pkn pknVar = divAction.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", pknVar, feVar.S2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divAction.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divAction.c);
            Expression<Uri> expression = divAction.d;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_url", expression, izsVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "menu_items", divAction.e, feVar.n1);
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divAction.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", divAction.g, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divAction.h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "target", divAction.i, DivAction.Target.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divAction.j, feVar.b1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divAction.k, izsVar);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            pkn pknVar = (pkn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", feVar.S2);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = j.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            izs<Object, Uri> izsVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(pknVar, expression2, readExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_url", typeHelper2, izsVar2), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "menu_items", feVar.n1), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper2, izsVar2), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "target", j.b, DivAction.Target.FROM_STRING), (k0) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", feVar.b1), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper2, izsVar2));
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, h0 h0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<tkn> field = h0Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", field, feVar.T2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", h0Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", h0Var.c);
            Field<Expression<Uri>> field2 = h0Var.d;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_url", field2, izsVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "menu_items", h0Var.e, feVar.o1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", h0Var.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", h0Var.g, izsVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", h0Var.h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "target", h0Var.i, DivAction.Target.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", h0Var.j, feVar.c1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", h0Var.k, izsVar);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            h0 h0Var = (h0) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<tkn> field = h0Var != null ? h0Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, field, feVar.T2);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, h0Var != null ? h0Var.b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, h0Var != null ? h0Var.c : null);
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field2 = h0Var != null ? h0Var.d : null;
            izs<Object, Uri> izsVar = ParsingConvertersKt.ANY_TO_URI;
            return new h0(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field2, izsVar), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, h0Var != null ? h0Var.e : null, feVar.o1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, h0Var != null ? h0Var.f : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, h0Var != null ? h0Var.g : null, izsVar), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, h0Var != null ? h0Var.h : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "target", j.b, allowPropertyOverride, h0Var != null ? h0Var.i : null, DivAction.Target.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, h0Var != null ? h0Var.j : null, feVar.c1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, h0Var != null ? h0Var.k : null, izsVar));
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, h0, DivAction> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivAction resolve(ParsingContext parsingContext, h0 h0Var, JSONObject jSONObject) {
            h0 h0Var2 = h0Var;
            JSONObject jSONObject2 = jSONObject;
            Field<tkn> field = h0Var2.a;
            fe feVar = this.a;
            pkn pknVar = (pkn) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "download_callbacks", feVar.U2, feVar.S2);
            Field<Expression<Boolean>> field2 = h0Var2.b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = j.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "is_enabled", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, h0Var2.c, jSONObject2, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Uri>> field3 = h0Var2.d;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            izs<Object, Uri> izsVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(pknVar, expression, resolveExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "log_url", typeHelper2, izsVar2), JsonFieldResolver.resolveOptionalList(parsingContext, h0Var2.e, jSONObject2, "menu_items", feVar.p1, feVar.n1), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, h0Var2.f, jSONObject2, "payload"), JsonFieldResolver.resolveOptionalExpression(parsingContext, h0Var2.g, jSONObject2, "referer", typeHelper2, izsVar2), (String) JsonFieldResolver.resolveOptional(parsingContext, h0Var2.h, jSONObject2, "scope_id"), JsonFieldResolver.resolveOptionalExpression(parsingContext, h0Var2.i, jSONObject2, "target", j.b, DivAction.Target.FROM_STRING), (k0) JsonFieldResolver.resolveOptional(parsingContext, h0Var2.j, jSONObject2, "typed", feVar.d1, feVar.b1), JsonFieldResolver.resolveOptionalExpression(parsingContext, h0Var2.k, jSONObject2, "url", typeHelper2, izsVar2));
        }
    }
}
