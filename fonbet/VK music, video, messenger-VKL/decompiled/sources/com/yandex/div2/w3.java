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
import org.json.JSONObject;
import xsna.izs;
import xsna.nq;
import xsna.oq;
import xsna.pkn;
import xsna.pq;
import xsna.tkn;

/* compiled from: DivDisappearActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class w3 {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final nq e;

    @Deprecated
    public static final oq f;

    @Deprecated
    public static final pq g;

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, v3 v3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "disappear_duration", v3Var.a);
            pkn pknVar = v3Var.b;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", pknVar, feVar.S2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", v3Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", v3Var.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", v3Var.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", v3Var.f);
            Expression<Uri> expression = v3Var.g;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expression, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", v3Var.h);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", v3Var.i, feVar.b1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", v3Var.j, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", v3Var.k);
            return jSONObject;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        public final java.lang.Object deserialize(com.yandex.div.serialization.ParsingContext r20, java.lang.Object r21) {
            /*
                r19 = this;
                r1 = r21
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                com.yandex.div2.v3 r7 = new com.yandex.div2.v3
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                xsna.izs<java.lang.Number, java.lang.Long> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                xsna.nq r5 = com.yandex.div2.w3.e
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.w3.a
                java.lang.String r2 = "disappear_duration"
                r0 = r20
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                r8 = r3
                r9 = r4
                if (r2 != 0) goto L1c
                r10 = r6
                goto L1d
            L1c:
                r10 = r2
            L1d:
                java.lang.String r2 = "download_callbacks"
                r14 = r19
                com.yandex.div2.fe r11 = r14.a
                xsna.bpn0 r3 = r11.S2
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r2, r3)
                r13 = r2
                xsna.pkn r13 = (xsna.pkn) r13
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                xsna.izs<java.lang.Object, java.lang.Boolean> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression<java.lang.Boolean> r5 = com.yandex.div2.w3.b
                java.lang.String r2 = "is_enabled"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                if (r2 != 0) goto L3c
                r12 = r5
                goto L3d
            L3c:
                r12 = r2
            L3d:
                java.lang.String r2 = "log_id"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r15 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r0, r1, r2, r3)
                xsna.oq r5 = com.yandex.div2.w3.f
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.w3.c
                java.lang.String r2 = "log_limit"
                r3 = r8
                r4 = r9
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L55
                r8 = r6
                goto L56
            L55:
                r8 = r2
            L56:
                java.lang.String r2 = "payload"
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r2)
                r9 = r2
                org.json.JSONObject r9 = (org.json.JSONObject) r9
                com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r2 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
                xsna.izs<java.lang.Object, android.net.Uri> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
                java.lang.String r6 = "referer"
                com.yandex.div.json.expressions.Expression r16 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
                java.lang.String r6 = "scope_id"
                java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6)
                r17 = r6
                java.lang.String r17 = (java.lang.String) r17
                java.lang.String r6 = "typed"
                xsna.bpn0 r11 = r11.b1
                java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6, r11)
                r11 = r6
                com.yandex.div2.k0 r11 = (com.yandex.div2.k0) r11
                java.lang.String r6 = "url"
                com.yandex.div.json.expressions.Expression r18 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
                xsna.pq r5 = com.yandex.div2.w3.g
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.w3.d
                java.lang.String r2 = "visibility_percentage"
                com.yandex.div.json.expressions.Expression r0 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                r4 = r12
                r12 = r9
                if (r0 != 0) goto L9f
                r9 = r6
                r2 = r7
                r3 = r10
                r10 = r11
                r5 = r15
                r7 = r16
                r11 = r17
                r6 = r8
            L9c:
                r8 = r18
                goto Laa
            L9f:
                r9 = r0
                r2 = r7
                r6 = r8
                r3 = r10
                r10 = r11
                r5 = r15
                r7 = r16
                r11 = r17
                goto L9c
            Laa:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.w3.a.deserialize(com.yandex.div.serialization.ParsingContext, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, x3 x3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "disappear_duration", x3Var.a);
            Field<tkn> field = x3Var.b;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", field, feVar.T2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", x3Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", x3Var.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", x3Var.e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", x3Var.f);
            Field<Expression<Uri>> field2 = x3Var.g;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field2, izsVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", x3Var.h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", x3Var.i, feVar.c1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", x3Var.j, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", x3Var.k);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            x3 x3Var = (x3) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = x3Var != null ? x3Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "disappear_duration", typeHelper, allowPropertyOverride, field, izsVar, w3.e);
            Field<tkn> field2 = x3Var != null ? x3Var.b : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, field2, feVar.T2);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, x3Var != null ? x3Var.c : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, x3Var != null ? x3Var.d : null);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, x3Var != null ? x3Var.e : null, izsVar, w3.f);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, x3Var != null ? x3Var.f : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field3 = x3Var != null ? x3Var.g : null;
            izs<Object, Uri> izsVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new x3(readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readFieldWithExpression, readOptionalFieldWithExpression3, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field3, izsVar2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, x3Var != null ? x3Var.h : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, x3Var != null ? x3Var.i : null, feVar.c1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, x3Var != null ? x3Var.j : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, x3Var != null ? x3Var.k : null, izsVar, w3.g));
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, x3, v3> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final v3 resolve(ParsingContext parsingContext, x3 x3Var, JSONObject jSONObject) {
            x3 x3Var2 = x3Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = x3Var2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            nq nqVar = w3.e;
            Expression<Long> expression = w3.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "disappear_duration", typeHelper, izsVar, nqVar, expression);
            Expression<Long> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<tkn> field2 = x3Var2.b;
            fe feVar = this.a;
            pkn pknVar = (pkn) JsonFieldResolver.resolveOptional(parsingContext, field2, jSONObject2, "download_callbacks", feVar.U2, feVar.S2);
            Field<Expression<Boolean>> field3 = x3Var2.c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = w3.b;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "is_enabled", typeHelper2, izsVar2, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, x3Var2.d, jSONObject2, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field4 = x3Var2.e;
            oq oqVar = w3.f;
            Expression<Long> expression5 = w3.c;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "log_limit", typeHelper, izsVar, oqVar, expression5);
            Expression<Long> expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            JSONObject jSONObject3 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, x3Var2.f, jSONObject2, "payload");
            Field<Expression<Uri>> field5 = x3Var2.g;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            izs<Object, Uri> izsVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "referer", typeHelper3, izsVar3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, x3Var2.h, jSONObject2, "scope_id");
            k0 k0Var = (k0) JsonFieldResolver.resolveOptional(parsingContext, x3Var2.i, jSONObject2, "typed", feVar.d1, feVar.b1);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x3Var2.j, jSONObject2, "url", typeHelper3, izsVar3);
            Field<Expression<Long>> field6 = x3Var2.k;
            pq pqVar = w3.g;
            Expression<Long> expression7 = w3.d;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject2, "visibility_percentage", typeHelper, izsVar, pqVar, expression7);
            return new v3(expression2, expression4, resolveExpression, expression6, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6, k0Var, str, jSONObject3, pknVar);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        b = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        c = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        e = new nq(9);
        f = new oq(10);
        g = new pq(6);
    }
}
