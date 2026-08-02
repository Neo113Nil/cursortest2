package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.z7;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivPivotFixed.kt */
/* loaded from: classes8.dex */
public final class y7 implements JSONSerializable, Hashable {
    public static final Expression<DivSizeUnit> d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    public final Expression<DivSizeUnit> a;
    public final Expression<Long> b;
    public Integer c;

    public y7(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(y7.class).hashCode();
        Expression<Long> expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z7.b bVar = (z7.b) BuiltInParserKt.getBuiltInParserComponent().N5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return z7.b.b(builtInParsingContext, this);
    }

    public y7() {
        this(d, null);
    }
}
