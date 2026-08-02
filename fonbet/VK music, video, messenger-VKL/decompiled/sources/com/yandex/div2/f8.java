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
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.g8;
import com.yandex.div2.l8;
import com.yandex.div2.p8;
import com.yandex.div2.q8;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.e43;
import xsna.fpf0;
import xsna.pon;

/* compiled from: DivRadialGradient.kt */
/* loaded from: classes8.dex */
public final class f8 implements JSONSerializable, Hashable {
    public static final g8.b g;
    public static final g8.b h;
    public static final q8.b i;
    public final g8 a;
    public final g8 b;
    public final List<a> c;
    public final ExpressionList<Integer> d;
    public final q8 e;
    public Integer f;

    /* compiled from: DivRadialGradient.kt */
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
            l8.a aVar = (l8.a) BuiltInParserKt.getBuiltInParserComponent().r6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, X3.i.L, this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        g = new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        h = new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        i = new q8.b(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
    }

    public f8(g8 g8Var, g8 g8Var2, List<a> list, ExpressionList<Integer> expressionList, q8 q8Var) {
        this.a = g8Var;
        this.b = g8Var2;
        this.c = list;
        this.d = expressionList;
        this.e = q8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e0, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0091, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(f8 f8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        boolean z;
        Hashable hashable2;
        List<Integer> evaluate;
        List<Integer> evaluate2;
        if (f8Var != null) {
            ExpressionList<Integer> expressionList = f8Var.d;
            List<a> list = f8Var.c;
            if (this.a.a(f8Var.a, expressionResolver, expressionResolver2) && this.b.a(f8Var.b, expressionResolver, expressionResolver2)) {
                List<a> list2 = this.c;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i2 = 0;
                        for (Object obj : list2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                e43.t();
                                throw null;
                            }
                            a aVar = list.get(i2);
                            a aVar2 = (a) obj;
                            if (aVar == null) {
                                aVar2.getClass();
                                return false;
                            }
                            if (aVar2.a.evaluate(expressionResolver).intValue() != aVar.a.evaluate(expressionResolver2).intValue() || aVar2.b.evaluate(expressionResolver).doubleValue() != aVar.b.evaluate(expressionResolver2).doubleValue()) {
                                break;
                            }
                            i2 = i3;
                        }
                        ExpressionList<Integer> expressionList2 = this.d;
                        if (expressionList2 != null && (evaluate = expressionList2.evaluate(expressionResolver)) != null) {
                            if (expressionList != null && (evaluate2 = expressionList.evaluate(expressionResolver2)) != null && evaluate.size() == evaluate2.size()) {
                                int i4 = 0;
                                for (Object obj2 : evaluate) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (((Number) obj2).intValue() != evaluate2.get(i4).intValue()) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                                q8 q8Var = f8Var.e;
                                q8 q8Var2 = this.e;
                                q8Var2.getClass();
                                if (q8Var != null) {
                                    if (q8Var2 instanceof q8.a) {
                                        q4 q4Var = ((q8.a) q8Var2).b;
                                        if (q8Var instanceof q8.a) {
                                            hashable2 = ((q8.a) q8Var).b;
                                        } else {
                                            if (!(q8Var instanceof q8.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hashable2 = ((q8.b) q8Var).b;
                                        }
                                        z = q4Var.a(hashable2 instanceof q4 ? (q4) hashable2 : null, expressionResolver, expressionResolver2);
                                    } else {
                                        if (!(q8Var2 instanceof q8.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        DivRadialGradientRelativeRadius divRadialGradientRelativeRadius = ((q8.b) q8Var2).b;
                                        if (q8Var instanceof q8.a) {
                                            hashable = ((q8.a) q8Var).b;
                                        } else {
                                            if (!(q8Var instanceof q8.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            hashable = ((q8.b) q8Var).b;
                                        }
                                        DivRadialGradientRelativeRadius divRadialGradientRelativeRadius2 = hashable instanceof DivRadialGradientRelativeRadius ? (DivRadialGradientRelativeRadius) hashable : null;
                                        if (divRadialGradientRelativeRadius2 == null) {
                                            divRadialGradientRelativeRadius.getClass();
                                        } else if (divRadialGradientRelativeRadius.a.evaluate(expressionResolver) == divRadialGradientRelativeRadius2.a.evaluate(expressionResolver2)) {
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        return true;
                                    }
                                }
                                z = false;
                                if (!z) {
                                    break;
                                }
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
        int i2;
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.b.hash() + this.a.hash() + fpf0.a(f8.class).hashCode();
        List<a> list = this.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                i2 += ((a) it.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i3 = hash + i2;
        ExpressionList<Integer> expressionList = this.d;
        int hash2 = this.e.hash() + i3 + (expressionList != null ? expressionList.hashCode() : 0);
        this.f = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p8.a) BuiltInParserKt.getBuiltInParserComponent().o6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public f8() {
        this(g, h, null, null, i);
    }
}
