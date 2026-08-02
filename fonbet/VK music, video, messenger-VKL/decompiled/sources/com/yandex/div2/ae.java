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
import xsna.ar;
import xsna.br;
import xsna.cr;
import xsna.izs;
import xsna.pkn;
import xsna.tkn;

/* compiled from: DivVisibilityActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class ae {

    @Deprecated
    public static final Expression<Boolean> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final ar e;

    @Deprecated
    public static final br f;

    @Deprecated
    public static final cr g;

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, zd zdVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            pkn pknVar = zdVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", pknVar, feVar.S2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", zdVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", zdVar.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", zdVar.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", zdVar.e);
            Expression<Uri> expression = zdVar.f;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", expression, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", zdVar.g);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", zdVar.h, feVar.b1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", zdVar.i, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_duration", zdVar.j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", zdVar.k);
            return jSONObject;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        public final java.lang.Object deserialize(com.yandex.div.serialization.ParsingContext r20, java.lang.Object r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                com.yandex.div2.zd r7 = new com.yandex.div2.zd
                r14 = r19
                com.yandex.div2.fe r8 = r14.a
                xsna.bpn0 r2 = r8.S2
                java.lang.String r3 = "download_callbacks"
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r3, r2)
                r13 = r2
                xsna.pkn r13 = (xsna.pkn) r13
                com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
                xsna.izs<java.lang.Object, java.lang.Boolean> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
                com.yandex.div.json.expressions.Expression<java.lang.Boolean> r5 = com.yandex.div2.ae.a
                java.lang.String r2 = "is_enabled"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                if (r2 != 0) goto L27
                r9 = r5
                goto L28
            L27:
                r9 = r2
            L28:
                java.lang.String r2 = "log_id"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r10 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r0, r1, r2, r3)
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                xsna.izs<java.lang.Number, java.lang.Long> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                xsna.ar r5 = com.yandex.div2.ae.e
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.ae.b
                java.lang.String r2 = "log_limit"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L42
                r11 = r6
                goto L43
            L42:
                r11 = r2
            L43:
                java.lang.String r2 = "payload"
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r2)
                r12 = r2
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r2 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
                xsna.izs<java.lang.Object, android.net.Uri> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
                java.lang.String r6 = "referer"
                com.yandex.div.json.expressions.Expression r15 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
                java.lang.String r6 = "scope_id"
                java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6)
                r16 = r6
                java.lang.String r16 = (java.lang.String) r16
                java.lang.String r6 = "typed"
                xsna.bpn0 r8 = r8.b1
                java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6, r8)
                r8 = r6
                com.yandex.div2.k0 r8 = (com.yandex.div2.k0) r8
                java.lang.String r6 = "url"
                com.yandex.div.json.expressions.Expression r17 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
                xsna.br r5 = com.yandex.div2.ae.f
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.ae.c
                java.lang.String r2 = "visibility_duration"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L80
                r18 = r6
                goto L82
            L80:
                r18 = r2
            L82:
                xsna.cr r5 = com.yandex.div2.ae.g
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.ae.d
                java.lang.String r2 = "visibility_percentage"
                r0 = r20
                com.yandex.div.json.expressions.Expression r0 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                r3 = r9
                if (r0 != 0) goto L9e
                r9 = r6
                r2 = r7
                r4 = r10
                r5 = r11
                r11 = r16
                r7 = r17
                r10 = r8
                r6 = r15
            L9b:
                r8 = r18
                goto La9
            L9e:
                r9 = r0
                r2 = r7
                r4 = r10
                r5 = r11
                r6 = r15
                r11 = r16
                r7 = r17
                r10 = r8
                goto L9b
            La9:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.ae.a.deserialize(com.yandex.div.serialization.ParsingContext, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, be beVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<tkn> field = beVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", field, feVar.T2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", beVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", beVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", beVar.d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", beVar.e);
            Field<Expression<Uri>> field2 = beVar.f;
            izs<Uri, String> izsVar = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field2, izsVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", beVar.g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", beVar.h, feVar.c1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", beVar.i, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_duration", beVar.j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", beVar.k);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            be beVar = (be) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<tkn> field = beVar != null ? beVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, field, feVar.T2);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, beVar != null ? beVar.b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, beVar != null ? beVar.c : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = beVar != null ? beVar.d : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, field2, izsVar, ae.e);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, beVar != null ? beVar.e : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field<Expression<Uri>> field3 = beVar != null ? beVar.f : null;
            izs<Object, Uri> izsVar2 = ParsingConvertersKt.ANY_TO_URI;
            return new be(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field3, izsVar2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, beVar != null ? beVar.g : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, beVar != null ? beVar.h : null, feVar.c1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, beVar != null ? beVar.i : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_duration", typeHelper, allowPropertyOverride, beVar != null ? beVar.j : null, izsVar, ae.f), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, beVar != null ? beVar.k : null, izsVar, ae.g));
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, be, zd> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final zd resolve(ParsingContext parsingContext, be beVar, JSONObject jSONObject) {
            be beVar2 = beVar;
            JSONObject jSONObject2 = jSONObject;
            Field<tkn> field = beVar2.a;
            fe feVar = this.a;
            pkn pknVar = (pkn) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "download_callbacks", feVar.U2, feVar.S2);
            Field<Expression<Boolean>> field2 = beVar2.b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = ae.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "is_enabled", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, beVar2.c, jSONObject2, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field3 = beVar2.d;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            ar arVar = ae.e;
            Expression<Long> expression3 = ae.b;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "log_limit", typeHelper2, izsVar2, arVar, expression3);
            Expression<Long> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            JSONObject jSONObject3 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, beVar2.e, jSONObject2, "payload");
            Field<Expression<Uri>> field4 = beVar2.f;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            izs<Object, Uri> izsVar3 = ParsingConvertersKt.ANY_TO_URI;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "referer", typeHelper3, izsVar3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, beVar2.g, jSONObject2, "scope_id");
            k0 k0Var = (k0) JsonFieldResolver.resolveOptional(parsingContext, beVar2.h, jSONObject2, "typed", feVar.d1, feVar.b1);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, beVar2.i, jSONObject2, "url", typeHelper3, izsVar3);
            Field<Expression<Long>> field5 = beVar2.j;
            br brVar = ae.f;
            Expression<Long> expression5 = ae.c;
            Expression<Long> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "visibility_duration", typeHelper2, izsVar2, brVar, expression5);
            Expression<Long> expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field<Expression<Long>> field6 = beVar2.k;
            cr crVar = ae.g;
            Expression<Long> expression7 = ae.d;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject2, "visibility_percentage", typeHelper2, izsVar2, crVar, expression7);
            return new zd(expression2, resolveExpression, expression4, resolveOptionalExpression3, resolveOptionalExpression4, expression6, resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6, k0Var, str, jSONObject3, pknVar);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        b = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        c = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        d = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        e = new ar(11);
        f = new br(14);
        g = new cr(11);
    }
}
