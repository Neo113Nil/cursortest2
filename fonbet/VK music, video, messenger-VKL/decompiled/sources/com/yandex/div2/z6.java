package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.a7;
import com.yandex.div2.b3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.hkn;

/* compiled from: DivNumberAnimator.kt */
/* loaded from: classes8.dex */
public final class z6 implements JSONSerializable, Hashable, hkn {
    public final List<DivAction> a;
    public final Expression<DivAnimationDirection> b;
    public final Expression<Long> c;
    public final List<DivAction> d;
    public final Expression<Double> e;
    public final String f;
    public final Expression<DivAnimationInterpolator> g;
    public final b3 h;
    public final Expression<Long> i;
    public final Expression<Double> j;
    public final String k;
    public Integer l;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        new b3.a(new j4(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public z6(List<DivAction> list, Expression<DivAnimationDirection> expression, Expression<Long> expression2, List<DivAction> list2, Expression<Double> expression3, String str, Expression<DivAnimationInterpolator> expression4, b3 b3Var, Expression<Long> expression5, Expression<Double> expression6, String str2) {
        this.a = list;
        this.b = expression;
        this.c = expression2;
        this.d = list2;
        this.e = expression3;
        this.f = str;
        this.g = expression4;
        this.h = b3Var;
        this.i = expression5;
        this.j = expression6;
        this.k = str2;
    }

    @Override // xsna.hkn
    public final Expression<DivAnimationDirection> b() {
        return this.b;
    }

    @Override // xsna.hkn
    public final List<DivAction> c() {
        return this.a;
    }

    @Override // xsna.hkn
    public final b3 d() {
        return this.h;
    }

    @Override // xsna.hkn
    public final Expression<DivAnimationInterpolator> e() {
        return this.g;
    }

    @Override // xsna.hkn
    public final List<DivAction> f() {
        return this.d;
    }

    @Override // xsna.hkn
    public final Expression<Long> g() {
        return this.i;
    }

    @Override // xsna.hkn
    public final Expression<Long> getDuration() {
        return this.c;
    }

    @Override // xsna.hkn
    public final String getId() {
        return this.f;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(z6.class).hashCode();
        List<DivAction> list = this.a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + i;
        List<DivAction> list2 = this.d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((DivAction) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int hashCode3 = this.i.hashCode() + this.h.hash() + this.g.hashCode() + this.f.hashCode() + this.e.hashCode() + hashCode2 + i2;
        Expression<Double> expression = this.j;
        int hashCode4 = this.k.hashCode() + hashCode3 + (expression != null ? expression.hashCode() : 0);
        this.l = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((a7.c) BuiltInParserKt.getBuiltInParserComponent().e5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
