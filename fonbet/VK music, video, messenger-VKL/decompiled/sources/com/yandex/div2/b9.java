package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c9;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fpf0;

/* compiled from: DivScaleTransition.kt */
/* loaded from: classes8.dex */
public final class b9 implements JSONSerializable, Hashable {
    public static final Expression<Long> h;
    public static final Expression<DivAnimationInterpolator> i;
    public static final Expression<Double> j;
    public static final Expression<Double> k;
    public static final Expression<Double> l;
    public static final Expression<Long> m;
    public final Expression<Long> a;
    public final Expression<DivAnimationInterpolator> b;
    public final Expression<Double> c;
    public final Expression<Double> d;
    public final Expression<Double> e;
    public final Expression<Long> f;
    public Integer g;

    static {
        Expression.Companion companion = Expression.Companion;
        h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        i = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        j = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        k = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        l = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public b9(Expression<Long> expression, Expression<DivAnimationInterpolator> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5, Expression<Long> expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.g;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(b9.class).hashCode();
        this.g = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c9.b bVar = (c9.b) BuiltInParserKt.getBuiltInParserComponent().x6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return c9.b.b(builtInParsingContext, this);
    }

    public b9() {
        this(h, i, j, k, l, m);
    }
}
