package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.v;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivActionScrollTo.kt */
/* loaded from: classes8.dex */
public final class u implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public final p b;
    public final Expression<String> c;
    public Integer d;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public u(Expression<Boolean> expression, p pVar, Expression<String> expression2) {
        this.a = expression;
        this.b = pVar;
        this.c = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hash() + this.a.hashCode() + fpf0.a(u.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v.a) BuiltInParserKt.getBuiltInParserComponent().A0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
