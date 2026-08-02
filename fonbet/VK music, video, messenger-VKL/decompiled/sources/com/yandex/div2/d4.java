package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.c4;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: DivFadeTransitionTemplate.kt */
/* loaded from: classes8.dex */
public final class d4 implements JSONSerializable, JsonTemplate<b4> {
    public final Field<Expression<Double>> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<DivAnimationInterpolator>> c;
    public final Field<Expression<Long>> d;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public d4(Field<Expression<Double>> field, Field<Expression<Long>> field2, Field<Expression<DivAnimationInterpolator>> field3, Field<Expression<Long>> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        c4.c cVar = (c4.c) BuiltInParserKt.getBuiltInParserComponent().f3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        return c4.c.b(builtInParsingContext, this);
    }
}
