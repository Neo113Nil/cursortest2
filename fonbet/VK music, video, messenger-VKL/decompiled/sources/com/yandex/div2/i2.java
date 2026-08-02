package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.j2;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivCircleShape.kt */
/* loaded from: classes8.dex */
public final class i2 implements JSONSerializable, Hashable {
    public static final q4 e = new q4(Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null));
    public final Expression<Integer> a;
    public final q4 b;
    public final va c;
    public Integer d;

    public i2(Expression<Integer> expression, q4 q4Var, va vaVar) {
        this.a = expression;
        this.b = q4Var;
        this.c = vaVar;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(i2.class).hashCode();
        Expression<Integer> expression = this.a;
        int hash = this.b.hash() + hashCode + (expression != null ? expression.hashCode() : 0);
        va vaVar = this.c;
        int hash2 = hash + (vaVar != null ? vaVar.hash() : 0);
        this.d = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((j2.a) BuiltInParserKt.getBuiltInParserComponent().X1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public i2() {
        this(null, e, null);
    }
}
