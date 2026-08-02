package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.v1;
import org.json.JSONObject;

/* compiled from: DivBorderTemplate.kt */
/* loaded from: classes8.dex */
public final class w1 implements JSONSerializable, JsonTemplate<u1> {
    public final Field<Expression<Long>> a;
    public final Field<a3> b;
    public final Field<Expression<Boolean>> c;
    public final Field<p9> d;
    public final Field<cb> e;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public w1(Field<Expression<Long>> field, Field<a3> field2, Field<Expression<Boolean>> field3, Field<p9> field4, Field<cb> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v1.b) BuiltInParserKt.getBuiltInParserComponent().M1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
