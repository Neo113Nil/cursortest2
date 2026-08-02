package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.q0;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.kqn;

/* compiled from: DivActionUpdateStructure.kt */
/* loaded from: classes8.dex */
public final class p0 implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final kqn b;
    public final Expression<String> c;
    public Integer d;

    public p0(Expression expression, Expression expression2, kqn kqnVar) {
        this.a = expression;
        this.b = kqnVar;
        this.c = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hash() + this.a.hashCode() + fpf0.a(p0.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((q0.a) BuiltInParserKt.getBuiltInParserComponent().e1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
