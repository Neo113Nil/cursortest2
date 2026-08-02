package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.h;
import org.json.JSONObject;
import xsna.oqn;

/* compiled from: DivActionAnimatorStartTemplate.kt */
/* loaded from: classes8.dex */
public final class i implements JSONSerializable, JsonTemplate<g> {
    public final Field<String> a;
    public final Field<Expression<DivAnimationDirection>> b;
    public final Field<Expression<Long>> c;
    public final Field<oqn> d;
    public final Field<Expression<DivAnimationInterpolator>> e;
    public final Field<f3> f;
    public final Field<Expression<Long>> g;
    public final Field<oqn> h;

    public i(Field<String> field, Field<Expression<DivAnimationDirection>> field2, Field<Expression<Long>> field3, Field<oqn> field4, Field<Expression<DivAnimationInterpolator>> field5, Field<f3> field6, Field<Expression<Long>> field7, Field<oqn> field8) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
        this.h = field8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((h.d) BuiltInParserKt.getBuiltInParserComponent().L.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
