package com.yandex.div2;

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
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes8.dex */
public final class k3 {

    @Deprecated
    public static final Expression<DivTransitionSelector> a;

    @Deprecated
    public static final TypeHelper<DivTransitionSelector> b;

    @Deprecated
    public static final xsna.l4 c;

    /* compiled from: DivDataJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTransitionSelector);
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            ParsingContext collectingErrors = ParsingContextKt.collectingErrors(parsingContext);
            fe feVar = this.a;
            List readOptionalList = JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "functions", feVar.I3);
            String str = (String) JsonPropertyParser.read(collectingErrors, jSONObject, "log_id");
            List readList = JsonPropertyParser.readList(collectingErrors, jSONObject, "states", feVar.G2, k3.c);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "timers", feVar.J8);
            TypeHelper<DivTransitionSelector> typeHelper = k3.b;
            izs<String, DivTransitionSelector> izsVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression = k3.a;
            Expression<DivTransitionSelector> readOptionalExpression = JsonExpressionParser.readOptionalExpression(collectingErrors, jSONObject, "transition_animation_selector", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new j3(readOptionalList, str, readList, readOptionalList2, expression, JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "variable_triggers", feVar.b9), JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "variables", feVar.h9), ParsingContextKt.getCollectedErrors(collectingErrors));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, j3 j3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            List<t4> list = j3Var.a;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", list, feVar.I3);
            JsonPropertyParser.write(parsingContext, jSONObject, "log_id", j3Var.b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", j3Var.c, feVar.G2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "timers", j3Var.d, feVar.J8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", j3Var.e, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", j3Var.f, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", j3Var.g, feVar.h9);
            return jSONObject;
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, o3 o3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<List<v4>> field = o3Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", field, feVar.J3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "log_id", o3Var.b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", o3Var.c, feVar.H2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "timers", o3Var.d, feVar.K8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", o3Var.e, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", o3Var.f, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", o3Var.g, feVar.i9);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            o3 o3Var = (o3) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<v4>> field = o3Var != null ? o3Var.a : null;
            fe feVar = this.a;
            return new o3(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, field, feVar.J3), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "log_id", allowPropertyOverride, o3Var != null ? o3Var.b : null), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "states", allowPropertyOverride, o3Var != null ? o3Var.c : null, feVar.H2, k3.c), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "timers", allowPropertyOverride, o3Var != null ? o3Var.d : null, feVar.K8), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "transition_animation_selector", k3.b, allowPropertyOverride, o3Var != null ? o3Var.e : null, DivTransitionSelector.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, o3Var != null ? o3Var.f : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, o3Var != null ? o3Var.g : null, feVar.i9));
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, o3, j3> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final j3 resolve(ParsingContext parsingContext, o3 o3Var, JSONObject jSONObject) {
            o3 o3Var2 = o3Var;
            JSONObject jSONObject2 = jSONObject;
            Field<List<v4>> field = o3Var2.a;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "functions", feVar.K3, feVar.I3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, o3Var2.b, jSONObject2, "log_id");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, o3Var2.c, jSONObject2, "states", feVar.I2, feVar.G2, k3.c);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, o3Var2.d, jSONObject2, "timers", feVar.L8, feVar.J8);
            Field<Expression<DivTransitionSelector>> field2 = o3Var2.e;
            TypeHelper<DivTransitionSelector> typeHelper = k3.b;
            izs<String, DivTransitionSelector> izsVar = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression = k3.a;
            Expression<DivTransitionSelector> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "transition_animation_selector", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new j3(resolveOptionalList, str, resolveList, resolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(parsingContext, o3Var2.f, jSONObject2, "variable_triggers", feVar.d9, feVar.b9), JsonFieldResolver.resolveOptionalList(parsingContext, o3Var2.g, jSONObject2, "variables", feVar.j9, feVar.h9), null);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        a = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        b = TypeHelper.Companion.from(divTransitionSelector, a.i);
        c = new xsna.l4(14);
    }
}
