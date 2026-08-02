package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.m6;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivInputValidatorRegex.kt */
/* loaded from: classes8.dex */
public final class l6 implements JSONSerializable, Hashable {
    public final Expression<Boolean> a;
    public final Expression<String> b;
    public final Expression<String> c;
    public final String d;
    public Integer e;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public l6(Expression<Boolean> expression, Expression<String> expression2, Expression<String> expression3, String str) {
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
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(l6.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        m6.a aVar = (m6.a) BuiltInParserKt.getBuiltInParserComponent().A4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return m6.a.b(builtInParsingContext, this);
    }
}
