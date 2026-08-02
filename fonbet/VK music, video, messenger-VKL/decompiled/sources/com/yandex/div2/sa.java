package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ta;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivStretchIndicatorItemPlacement.kt */
/* loaded from: classes8.dex */
public final class sa implements JSONSerializable, Hashable {
    public static final q4 d;
    public static final Expression<Long> e;
    public final q4 a;
    public final Expression<Long> b;
    public Integer c;

    static {
        Expression.Companion companion = Expression.Companion;
        d = new q4(Expression.Companion.constant$default(companion, 5L, null, 2, null));
        e = Expression.Companion.constant$default(companion, 10L, null, 2, null);
    }

    public sa(q4 q4Var, Expression<Long> expression) {
        this.a = q4Var;
        this.b = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hash() + fpf0.a(sa.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ta.a) BuiltInParserKt.getBuiltInParserComponent().w7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public sa() {
        this(d, e);
    }
}
