package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.kd;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTriggerTemplate.kt */
/* loaded from: classes8.dex */
public final class ld implements JSONSerializable, JsonTemplate<DivTrigger> {
    public final Field<List<h0>> a;
    public final Field<Expression<Boolean>> b;
    public final Field<Expression<DivTrigger.Mode>> c;

    static {
        Expression.Companion.constant$default(Expression.Companion, DivTrigger.Mode.ON_CONDITION, null, 2, null);
    }

    public ld(Field<List<h0>> field, Field<Expression<Boolean>> field2, Field<Expression<DivTrigger.Mode>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((kd.c) BuiltInParserKt.getBuiltInParserComponent().c9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
