package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.g6;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivInputValidatorExpression.kt */
/* loaded from: classes8.dex */
public final class f6 implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public final Expression<Boolean> b;
    public final Expression<String> c;
    public final String d;
    public Integer e;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public f6(Expression<Boolean> expression, Expression<Boolean> expression2, Expression<String> expression3, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = str;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(f6.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        g6.a aVar = (g6.a) BuiltInParserKt.getBuiltInParserComponent().x4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return g6.a.b(builtInParsingContext, this);
    }
}
