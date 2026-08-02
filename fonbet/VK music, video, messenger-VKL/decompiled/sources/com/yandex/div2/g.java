package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.h;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.kqn;

/* compiled from: DivActionAnimatorStart.kt */
/* loaded from: classes8.dex */
public final class g implements JSONSerializable, Hashable {
    public final String a;
    public final Expression<DivAnimationDirection> b;
    public final Expression<Long> c;
    public final kqn d;
    public final Expression<DivAnimationInterpolator> e;
    public final b3 f;
    public final Expression<Long> g;
    public final kqn h;
    public Integer i;

    public g(String str, Expression<DivAnimationDirection> expression, Expression<Long> expression2, kqn kqnVar, Expression<DivAnimationInterpolator> expression3, b3 b3Var, Expression<Long> expression4, kqn kqnVar2) {
        this.a = str;
        this.b = expression;
        this.c = expression2;
        this.d = kqnVar;
        this.e = expression3;
        this.f = b3Var;
        this.g = expression4;
        this.h = kqnVar2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(g.class).hashCode();
        Expression<DivAnimationDirection> expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.c;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        kqn kqnVar = this.d;
        int hash = hashCode3 + (kqnVar != null ? kqnVar.hash() : 0);
        Expression<DivAnimationInterpolator> expression3 = this.e;
        int hashCode4 = hash + (expression3 != null ? expression3.hashCode() : 0);
        b3 b3Var = this.f;
        int hash2 = hashCode4 + (b3Var != null ? b3Var.hash() : 0);
        Expression<Long> expression4 = this.g;
        int hashCode5 = hash2 + (expression4 != null ? expression4.hashCode() : 0);
        kqn kqnVar2 = this.h;
        int hash3 = hashCode5 + (kqnVar2 != null ? kqnVar2.hash() : 0);
        this.i = Integer.valueOf(hash3);
        return hash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((h.c) BuiltInParserKt.getBuiltInParserComponent().K.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
