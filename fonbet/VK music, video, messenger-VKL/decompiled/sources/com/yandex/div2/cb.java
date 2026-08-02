package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.wa;
import com.yandex.div2.xa;
import org.json.JSONObject;
import xsna.qpn;

/* compiled from: DivStrokeTemplate.kt */
/* loaded from: classes8.dex */
public final class cb implements JSONSerializable, JsonTemplate<va> {
    public final Field<Expression<Integer>> a;
    public final Field<bb> b;
    public final Field<Expression<DivSizeUnit>> c;
    public final Field<Expression<Double>> d;

    static {
        new xa.b(new qpn());
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
    }

    public cb(Field<Expression<Integer>> field, Field<bb> field2, Field<Expression<DivSizeUnit>> field3, Field<Expression<Double>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((wa.c) BuiltInParserKt.getBuiltInParserComponent().J7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
