package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.t6;
import com.yandex.div2.u6;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;
import xsna.fpf0;

/* compiled from: DivLinearGradient.kt */
/* loaded from: classes8.dex */
public final class s6 implements JSONSerializable, Hashable {
    public static final Expression<Long> e = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    public final Expression<Long> a;
    public final List<a> b;
    public final ExpressionList<Integer> c;
    public Integer d;

    /* compiled from: DivLinearGradient.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<Integer> a;
        public final Expression<Double> b;
        public Integer c;

        public a(Expression<Integer> expression, Expression<Double> expression2) {
            this.a = expression;
            this.b = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(a.class).hashCode();
            this.c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            t6.a aVar = (t6.a) BuiltInParserKt.getBuiltInParserComponent().S4.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, X3.i.L, this.b);
            return jSONObject;
        }
    }

    public s6(Expression<Long> expression, List<a> list, ExpressionList<Integer> expressionList) {
        this.a = expression;
        this.b = list;
        this.c = expressionList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0098, code lost:
    
        if (r2 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(s6 s6Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        List<Integer> evaluate;
        List<Integer> evaluate2;
        if (s6Var == null) {
            return false;
        }
        ExpressionList<Integer> expressionList = s6Var.c;
        List<a> list = s6Var.b;
        if (this.a.evaluate(expressionResolver).longValue() == s6Var.a.evaluate(expressionResolver2).longValue()) {
            List<a> list2 = this.b;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
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
                            break;
                        }
                        if (aVar2.a.evaluate(expressionResolver).intValue() != aVar.a.evaluate(expressionResolver2).intValue() || aVar2.b.evaluate(expressionResolver).doubleValue() != aVar.b.evaluate(expressionResolver2).doubleValue()) {
                            break;
                        }
                        i = i2;
                    }
                    ExpressionList<Integer> expressionList2 = this.c;
                    if (expressionList2 != null && (evaluate = expressionList2.evaluate(expressionResolver)) != null) {
                        if (expressionList != null && (evaluate2 = expressionList.evaluate(expressionResolver2)) != null && evaluate.size() == evaluate2.size()) {
                            int i3 = 0;
                            for (Object obj2 : evaluate) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((Number) obj2).intValue() == evaluate2.get(i3).intValue()) {
                                    i3 = i4;
                                }
                            }
                            return true;
                        }
                    } else if (expressionList == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(s6.class).hashCode();
        List<a> list = this.b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((a) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i2 = hashCode + i;
        ExpressionList<Integer> expressionList = this.c;
        int hashCode2 = i2 + (expressionList != null ? expressionList.hashCode() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u6.a) BuiltInParserKt.getBuiltInParserComponent().P4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public s6() {
        this(e, null, null);
    }
}
