package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.g5;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundTemplate.kt */
/* loaded from: classes8.dex */
public final class h5 implements JSONSerializable, JsonTemplate<f5> {
    public final Field<Expression<Double>> a;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<List<i4>> d;
    public final Field<Expression<Uri>> e;
    public final Field<Expression<Boolean>> f;
    public final Field<Expression<DivImageScale>> g;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
    }

    public h5(Field<Expression<Double>> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<List<i4>> field4, Field<Expression<Uri>> field5, Field<Expression<Boolean>> field6, Field<Expression<DivImageScale>> field7) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((g5.e) BuiltInParserKt.getBuiltInParserComponent().V3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
