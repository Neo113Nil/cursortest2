package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c9;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: DivScaleTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class d9 implements JSONSerializable, JsonTemplate<b9> {
    public final Field<Expression<Long>> a;
    public final Field<Expression<DivAnimationInterpolator>> b;
    public final Field<Expression<Double>> c;
    public final Field<Expression<Double>> d;
    public final Field<Expression<Double>> e;
    public final Field<Expression<Long>> f;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public d9(Field<Expression<Long>> field, Field<Expression<DivAnimationInterpolator>> field2, Field<Expression<Double>> field3, Field<Expression<Double>> field4, Field<Expression<Double>> field5, Field<Expression<Long>> field6) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c9.c cVar = (c9.c) BuiltInParserKt.getBuiltInParserComponent().y6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return c9.c.b(builtInParsingContext, this);
    }
}
