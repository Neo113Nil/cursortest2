package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.b3;
import com.yandex.div2.u0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;
import xsna.wln;

/* compiled from: DivAnimation.kt */
/* loaded from: classes8.dex */
public final class DivAnimation implements JSONSerializable, Hashable {
    public static final Expression<DivAnimationInterpolator> k;
    public static final b3.b l;
    public static final Expression<Long> m;
    public final Expression<Long> a;
    public final Expression<Double> b;
    public final Expression<DivAnimationInterpolator> c;
    public final List<DivAnimation> d;
    public final Expression<Name> e;
    public final b3 f;
    public final Expression<Long> g;
    public final Expression<Double> h;
    public Integer i;
    public Integer j;

    /* compiled from: DivAnimation.kt */
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Name, String> TO_STRING = b.i;
        public static final izs<String, Name> FROM_STRING = a.i;

        /* compiled from: DivAnimation.kt */
        public static final class a extends Lambda implements izs<String, Name> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Name invoke(String str) {
                String str2 = str;
                Name.Converter.getClass();
                Name name = Name.FADE;
                if (epx.f(str2, name.value)) {
                    return name;
                }
                Name name2 = Name.TRANSLATE;
                if (epx.f(str2, name2.value)) {
                    return name2;
                }
                Name name3 = Name.SCALE;
                if (epx.f(str2, name3.value)) {
                    return name3;
                }
                Name name4 = Name.NATIVE;
                if (epx.f(str2, name4.value)) {
                    return name4;
                }
                Name name5 = Name.SET;
                if (epx.f(str2, name5.value)) {
                    return name5;
                }
                Name name6 = Name.NO_ANIMATION;
                if (epx.f(str2, name6.value)) {
                    return name6;
                }
                return null;
            }
        }

        /* compiled from: DivAnimation.kt */
        public static final class b extends Lambda implements izs<Name, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Name name) {
                Name.Converter.getClass();
                return name.value;
            }
        }

        /* compiled from: DivAnimation.kt */
        public static final class c {
        }

        Name(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 300L, null, 2, null);
        k = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        l = new b3.b(new wln());
        m = Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public DivAnimation(Expression<Long> expression, Expression<Double> expression2, Expression<DivAnimationInterpolator> expression3, List<DivAnimation> list, Expression<Name> expression4, b3 b3Var, Expression<Long> expression5, Expression<Double> expression6) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = list;
        this.e = expression4;
        this.f = b3Var;
        this.g = expression5;
        this.h = expression6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        if (r1 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(DivAnimation divAnimation, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAnimation == null) {
            return false;
        }
        List<DivAnimation> list = divAnimation.d;
        if (this.a.evaluate(expressionResolver).longValue() == divAnimation.a.evaluate(expressionResolver2).longValue()) {
            Expression<Double> expression = this.b;
            Double evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Double> expression2 = divAnimation.b;
            if (epx.c(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.c.evaluate(expressionResolver) == divAnimation.c.evaluate(expressionResolver2)) {
                List<DivAnimation> list2 = this.d;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!((DivAnimation) obj).a(list.get(i), expressionResolver, expressionResolver2)) {
                                break;
                            }
                            i = i2;
                        }
                        if (this.e.evaluate(expressionResolver) == divAnimation.e.evaluate(expressionResolver2) && this.f.a(divAnimation.f, expressionResolver, expressionResolver2) && this.g.evaluate(expressionResolver).longValue() == divAnimation.g.evaluate(expressionResolver2).longValue()) {
                            Expression<Double> expression3 = this.h;
                            Double evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                            Expression<Double> expression4 = divAnimation.h;
                            if (epx.c(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<DivAnimation> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((DivAnimation) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this.j = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int propertiesHash() {
        Integer num = this.i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(DivAnimation.class).hashCode();
        Expression<Double> expression = this.b;
        int hashCode2 = this.g.hashCode() + this.f.hash() + this.e.hashCode() + this.c.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Double> expression2 = this.h;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.i = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u0.c) BuiltInParserKt.getBuiltInParserComponent().q1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivAnimation(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this(expression, expression2, k, null, expression3, l, m, expression4);
    }
}
