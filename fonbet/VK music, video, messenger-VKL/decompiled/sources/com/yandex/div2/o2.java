package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.p2;
import com.yandex.div2.q2;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivCollectionItemBuilder.kt */
/* loaded from: classes8.dex */
public final class o2 implements JSONSerializable, Hashable {
    public final Expression<JSONArray> a;
    public final String b;
    public final List<a> c;
    public Integer d;

    /* compiled from: DivCollectionItemBuilder.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final com.yandex.div2.a a;
        public final Expression<String> b;
        public final Expression<Boolean> c;
        public Integer d;

        static {
            Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
        }

        public a(com.yandex.div2.a aVar, Expression<String> expression, Expression<Boolean> expression2) {
            this.a = aVar;
            this.b = expression;
            this.c = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hash = this.a.hash() + fpf0.a(a.class).hashCode();
            Expression<String> expression = this.b;
            int hashCode = this.c.hashCode() + hash + (expression != null ? expression.hashCode() : 0);
            this.d = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((q2.a) BuiltInParserKt.getBuiltInParserComponent().g2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public o2(Expression<JSONArray> expression, String str, List<a> list) {
        this.a = expression;
        this.b = str;
        this.c = list;
    }

    public final boolean a(o2 o2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        int i;
        if (o2Var != null && epx.f(this.a.evaluate(expressionResolver), o2Var.a.evaluate(expressionResolver2)) && epx.f(this.b, o2Var.b)) {
            List<a> list = o2Var.c;
            List<a> list2 = this.c;
            if (list2.size() == list.size()) {
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    a aVar = list.get(i);
                    a aVar2 = (a) obj;
                    if (aVar == null) {
                        aVar2.getClass();
                    } else if (aVar2.a.a(aVar.a, expressionResolver, expressionResolver2)) {
                        Expression<String> expression = aVar2.b;
                        String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                        Expression<String> expression2 = aVar.b;
                        i = (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && aVar2.c.evaluate(expressionResolver).booleanValue() == aVar.c.evaluate(expressionResolver2).booleanValue()) ? i2 : 0;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(o2.class).hashCode();
        Iterator<T> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a) it.next()).hash();
        }
        int i2 = hashCode + i;
        this.d = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p2.a) BuiltInParserKt.getBuiltInParserComponent().d2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
