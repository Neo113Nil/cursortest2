package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatch;
import com.yandex.div2.t7;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.eq;
import xsna.izs;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes8.dex */
public final class s7 {

    @Deprecated
    public static final Expression<DivPatch.Mode> a;

    @Deprecated
    public static final TypeHelper<DivPatch.Mode> b;

    @Deprecated
    public static final eq c;

    /* compiled from: DivPatchJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivPatch.Mode);
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivPatch divPatch) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            List<DivPatch.a> list = divPatch.a;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "changes", list, feVar.E5);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divPatch.b, DivPatch.Mode.TO_STRING);
            List<DivAction> list2 = divPatch.c;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_applied_actions", list2, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_failed_actions", divPatch.d, bpn0Var);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.E5;
            bpn0 bpn0Var2 = feVar.k1;
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "changes", bpn0Var, s7.c);
            TypeHelper<DivPatch.Mode> typeHelper = s7.b;
            izs<String, DivPatch.Mode> izsVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = s7.a;
            Expression<DivPatch.Mode> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivPatch(expression, readList, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_applied_actions", bpn0Var2), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_failed_actions", bpn0Var2));
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, t7 t7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<List<t7.a>> field = t7Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "changes", field, feVar.F5);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, t7Var.b, DivPatch.Mode.TO_STRING);
            Field<List<h0>> field2 = t7Var.c;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_applied_actions", field2, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_failed_actions", t7Var.d, bpn0Var);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            t7 t7Var = (t7) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<t7.a>> field = t7Var != null ? t7Var.a : null;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.F5;
            bpn0 bpn0Var2 = feVar.l1;
            return new t7(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "changes", allowPropertyOverride, field, bpn0Var, s7.c), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, s7.b, allowPropertyOverride, t7Var != null ? t7Var.b : null, DivPatch.Mode.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_applied_actions", allowPropertyOverride, t7Var != null ? t7Var.c : null, bpn0Var2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_failed_actions", allowPropertyOverride, t7Var != null ? t7Var.d : null, bpn0Var2));
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, t7, DivPatch> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivPatch resolve(ParsingContext parsingContext, t7 t7Var, JSONObject jSONObject) {
            t7 t7Var2 = t7Var;
            JSONObject jSONObject2 = jSONObject;
            Field<List<t7.a>> field = t7Var2.a;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.G5;
            bpn0 bpn0Var2 = feVar.k1;
            bpn0 bpn0Var3 = feVar.m1;
            List resolveList = JsonFieldResolver.resolveList(parsingContext, field, jSONObject2, "changes", bpn0Var, feVar.E5, s7.c);
            Field<Expression<DivPatch.Mode>> field2 = t7Var2.b;
            TypeHelper<DivPatch.Mode> typeHelper = s7.b;
            izs<String, DivPatch.Mode> izsVar = DivPatch.Mode.FROM_STRING;
            Expression<DivPatch.Mode> expression = s7.a;
            Expression<DivPatch.Mode> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, X3.a.t, typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivPatch(expression, resolveList, JsonFieldResolver.resolveOptionalList(parsingContext, t7Var2.c, jSONObject2, "on_applied_actions", bpn0Var3, bpn0Var2), JsonFieldResolver.resolveOptionalList(parsingContext, t7Var2.d, jSONObject2, "on_failed_actions", bpn0Var3, bpn0Var2));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivPatch.Mode mode = DivPatch.Mode.PARTIAL;
        a = Expression.Companion.constant$default(companion, mode, null, 2, null);
        b = TypeHelper.Companion.from(mode, a.i);
        c = new eq(10);
    }
}
