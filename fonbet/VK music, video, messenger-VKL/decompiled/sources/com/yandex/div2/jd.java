package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.id;
import com.yandex.div2.x7;
import org.json.JSONObject;
import xsna.eon;

/* compiled from: DivTransformTemplate.kt */
/* loaded from: classes8.dex */
public final class jd implements JSONSerializable, JsonTemplate<hd> {
    public final Field<e8> a;
    public final Field<e8> b;
    public final Field<Expression<Double>> c;

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
    }

    public jd(Field<e8> field, Field<e8> field2, Field<Expression<Double>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((id.b) BuiltInParserKt.getBuiltInParserComponent().Z8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
