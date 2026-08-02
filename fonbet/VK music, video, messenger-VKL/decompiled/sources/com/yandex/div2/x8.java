package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.f8;
import com.yandex.div2.g8;
import com.yandex.div2.l8;
import com.yandex.div2.p8;
import com.yandex.div2.q8;
import java.util.List;
import org.json.JSONObject;
import xsna.pon;

/* compiled from: DivRadialGradientTemplate.kt */
/* loaded from: classes8.dex */
public final class x8 implements JSONSerializable, JsonTemplate<f8> {
    public final Field<k8> a;
    public final Field<k8> b;
    public final Field<List<a>> c;
    public final Field<ExpressionList<Integer>> d;
    public final Field<u8> e;

    /* compiled from: DivRadialGradientTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<f8.a> {
        public final Field<Expression<Integer>> a;
        public final Field<Expression<Double>> b;

        public a(Field<Expression<Integer>> field, Field<Expression<Double>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            l8.b bVar = (l8.b) BuiltInParserKt.getBuiltInParserComponent().s6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            bVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, X3.i.L, this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        new q8.b(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
    }

    public x8(Field<k8> field, Field<k8> field2, Field<List<a>> field3, Field<ExpressionList<Integer>> field4, Field<u8> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p8.b) BuiltInParserKt.getBuiltInParserComponent().p6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
