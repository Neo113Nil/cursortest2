package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.q0;
import org.json.JSONObject;
import xsna.oqn;

/* compiled from: DivActionUpdateStructureTemplate.kt */
/* loaded from: classes8.dex */
public final class r0 implements JSONSerializable, JsonTemplate<p0> {
    public final Field<Expression<String>> a;
    public final Field<oqn> b;
    public final Field<Expression<String>> c;

    public r0(Field<Expression<String>> field, Field<oqn> field2, Field<Expression<String>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((q0.b) BuiltInParserKt.getBuiltInParserComponent().f1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
