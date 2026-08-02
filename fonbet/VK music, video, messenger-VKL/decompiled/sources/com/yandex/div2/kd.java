package com.yandex.div2;

import com.ironsource.X3;
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
import com.yandex.div2.DivTrigger;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.gq;
import xsna.izs;

/* compiled from: DivTriggerJsonParser.kt */
/* loaded from: classes8.dex */
public final class kd {

    @Deprecated
    public static final Expression<DivTrigger.Mode> a;

    @Deprecated
    public static final TypeHelper<DivTrigger.Mode> b;

    @Deprecated
    public static final gq c;

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTrigger.Mode);
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivTrigger divTrigger) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divTrigger.a, this.a.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, divTrigger.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divTrigger.c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "actions", this.a.k1, kd.c);
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<DivTrigger.Mode> typeHelper = kd.b;
            izs<String, DivTrigger.Mode> izsVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression = kd.a;
            Expression<DivTrigger.Mode> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivTrigger(readList, readExpression, expression);
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ld ldVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", ldVar.a, this.a.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, ldVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, ldVar.c, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            ld ldVar = (ld) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new ld(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, ldVar != null ? ldVar.a : null, this.a.l1, kd.c), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, ldVar != null ? ldVar.b : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, kd.b, allowPropertyOverride, ldVar != null ? ldVar.c : null, DivTrigger.Mode.FROM_STRING));
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, ld, DivTrigger> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivTrigger resolve(ParsingContext parsingContext, ld ldVar, JSONObject jSONObject) {
            ld ldVar2 = ldVar;
            JSONObject jSONObject2 = jSONObject;
            Field<List<h0>> field = ldVar2.a;
            fe feVar = this.a;
            List resolveList = JsonFieldResolver.resolveList(parsingContext, field, jSONObject2, "actions", feVar.m1, feVar.k1, kd.c);
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, ldVar2.b, jSONObject2, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field<Expression<DivTrigger.Mode>> field2 = ldVar2.c;
            TypeHelper<DivTrigger.Mode> typeHelper = kd.b;
            izs<String, DivTrigger.Mode> izsVar = DivTrigger.Mode.FROM_STRING;
            Expression<DivTrigger.Mode> expression = kd.a;
            Expression<DivTrigger.Mode> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, X3.a.t, typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivTrigger(resolveList, resolveExpression, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
        a = Expression.Companion.constant$default(companion, mode, null, 2, null);
        b = TypeHelper.Companion.from(mode, a.i);
        c = new gq(13);
    }
}
