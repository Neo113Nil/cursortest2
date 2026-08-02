package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.yc;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTimerTemplate.kt */
/* loaded from: classes8.dex */
public final class zc implements JSONSerializable, JsonTemplate<xc> {
    public final Field<Expression<Long>> a;
    public final Field<List<h0>> b;
    public final Field<String> c;
    public final Field<List<h0>> d;
    public final Field<Expression<Long>> e;
    public final Field<String> f;

    static {
        Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    }

    public zc(Field<Expression<Long>> field, Field<List<h0>> field2, Field<String> field3, Field<List<h0>> field4, Field<Expression<Long>> field5, Field<String> field6) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yc.b) BuiltInParserKt.getBuiltInParserComponent().K8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
