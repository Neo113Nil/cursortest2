package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.y;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivActionSetState.kt */
/* loaded from: classes8.dex */
public final class x implements JSONSerializable, Hashable {
    public final Expression<String> a;
    public final Expression<Boolean> b;
    public Integer c;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public x(Expression<String> expression, Expression<Boolean> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(x.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y.a aVar = (y.a) BuiltInParserKt.getBuiltInParserComponent().D0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return y.a.b(builtInParsingContext, this);
    }
}
