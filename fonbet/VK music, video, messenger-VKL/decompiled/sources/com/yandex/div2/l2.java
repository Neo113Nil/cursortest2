package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.m2;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivCloudBackground.kt */
/* loaded from: classes8.dex */
public final class l2 implements JSONSerializable, Hashable {
    public final Expression<Integer> a;
    public final Expression<Long> b;
    public final y3 c;
    public Integer d;

    public l2(Expression<Integer> expression, Expression<Long> expression2, y3 y3Var) {
        this.a = expression;
        this.b = expression2;
        this.c = y3Var;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(l2.class).hashCode();
        y3 y3Var = this.c;
        int hash = hashCode + (y3Var != null ? y3Var.hash() : 0);
        this.d = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((m2.a) BuiltInParserKt.getBuiltInParserComponent().a2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
