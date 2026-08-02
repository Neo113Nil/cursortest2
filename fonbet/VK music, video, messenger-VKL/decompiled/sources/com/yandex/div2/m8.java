package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.n8;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivRadialGradientFixedCenter.kt */
/* loaded from: classes8.dex */
public final class m8 implements JSONSerializable, Hashable {
    public final Expression<DivSizeUnit> a;
    public final Expression<Long> b;
    public Integer c;

    static {
        Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    }

    public m8(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(m8.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        n8.b bVar = (n8.b) BuiltInParserKt.getBuiltInParserComponent().c6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return n8.b.b(builtInParsingContext, this);
    }
}
