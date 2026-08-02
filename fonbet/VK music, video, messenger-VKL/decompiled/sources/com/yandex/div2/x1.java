package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.y1;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivChangeBoundsTransition.kt */
/* loaded from: classes8.dex */
public final class x1 implements JSONSerializable, Hashable {
    public static final Expression<Long> e;
    public static final Expression<DivAnimationInterpolator> f;
    public static final Expression<Long> g;
    public final Expression<Long> a;
    public final Expression<DivAnimationInterpolator> b;
    public final Expression<Long> c;
    public Integer d;

    static {
        Expression.Companion companion = Expression.Companion;
        e = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public x1(Expression<Long> expression, Expression<DivAnimationInterpolator> expression2, Expression<Long> expression3) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(x1.class).hashCode();
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y1.b bVar = (y1.b) BuiltInParserKt.getBuiltInParserComponent().O1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return y1.b.b(builtInParsingContext, this);
    }

    public x1() {
        this(e, f, g);
    }
}
