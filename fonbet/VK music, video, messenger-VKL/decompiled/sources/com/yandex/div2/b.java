package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivAbsoluteEdgeInsets.kt */
/* loaded from: classes8.dex */
public final class b implements JSONSerializable, Hashable {
    public static final Expression<Long> f;
    public static final Expression<Long> g;
    public static final Expression<Long> h;
    public static final Expression<Long> i;
    public final Expression<Long> a;
    public final Expression<Long> b;
    public final Expression<Long> c;
    public final Expression<Long> d;
    public Integer e;

    static {
        Expression.Companion companion = Expression.Companion;
        f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public b(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(b.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c.a aVar = (c.a) BuiltInParserKt.getBuiltInParserComponent().E.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return c.a.a(builtInParsingContext, this);
    }

    public b() {
        this(f, g, h, i);
    }
}
