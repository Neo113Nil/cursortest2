package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.hkn;

/* compiled from: DivAnimator.kt */
/* loaded from: classes8.dex */
public abstract class w0 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivAnimator.kt */
    public static final class a extends w0 {
        public final s2 b;

        public a(s2 s2Var) {
            this.b = s2Var;
        }
    }

    /* compiled from: DivAnimator.kt */
    public static final class b extends w0 {
        public final z6 b;

        public b(z6 z6Var) {
            this.b = z6Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x021d, code lost:
    
        if (r3 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b2, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d0, code lost:
    
        if (r3 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0065, code lost:
    
        if (r4 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(w0 w0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (w0Var != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                hkn b2 = w0Var.b();
                s2 s2Var = b2 instanceof s2 ? (s2) b2 : null;
                s2 s2Var2 = aVar.b;
                s2Var2.getClass();
                if (s2Var != null) {
                    List<DivAction> list = s2Var.d;
                    List<DivAction> list2 = s2Var.a;
                    List<DivAction> list3 = s2Var2.a;
                    if (list3 != null) {
                        if (list2 != null && list3.size() == list2.size()) {
                            int i = 0;
                            for (Object obj : list3) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (!((DivAction) obj).a(list2.get(i), expressionResolver, expressionResolver2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (s2Var2.b.evaluate(expressionResolver) == s2Var.b.evaluate(expressionResolver2) && s2Var2.c.evaluate(expressionResolver).longValue() == s2Var.c.evaluate(expressionResolver2).longValue()) {
                                List<DivAction> list4 = s2Var2.d;
                                if (list4 != null) {
                                    if (list != null && list4.size() == list.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            if (!((DivAction) obj2).a(list.get(i3), expressionResolver, expressionResolver2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        if (s2Var2.e.evaluate(expressionResolver).intValue() == s2Var.e.evaluate(expressionResolver2).intValue() && epx.f(s2Var2.f, s2Var.f) && s2Var2.g.evaluate(expressionResolver) == s2Var.g.evaluate(expressionResolver2) && s2Var2.h.a(s2Var.h, expressionResolver, expressionResolver2) && s2Var2.i.evaluate(expressionResolver).longValue() == s2Var.i.evaluate(expressionResolver2).longValue()) {
                                            Expression<Integer> expression = s2Var2.j;
                                            Integer evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                                            Expression<Integer> expression2 = s2Var.j;
                                            if (!epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !epx.f(s2Var2.k, s2Var.k)) {
                                                break;
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(this instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = (b) this;
                hkn b3 = w0Var.b();
                z6 z6Var = b3 instanceof z6 ? (z6) b3 : null;
                z6 z6Var2 = bVar.b;
                z6Var2.getClass();
                if (z6Var != null) {
                    List<DivAction> list5 = z6Var.d;
                    List<DivAction> list6 = z6Var.a;
                    List<DivAction> list7 = z6Var2.a;
                    if (list7 != null) {
                        if (list6 != null && list7.size() == list6.size()) {
                            int i5 = 0;
                            for (Object obj3 : list7) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (!((DivAction) obj3).a(list6.get(i5), expressionResolver, expressionResolver2)) {
                                    break;
                                }
                                i5 = i6;
                            }
                            if (z6Var2.b.evaluate(expressionResolver) == z6Var.b.evaluate(expressionResolver2) && z6Var2.c.evaluate(expressionResolver).longValue() == z6Var.c.evaluate(expressionResolver2).longValue()) {
                                List<DivAction> list8 = z6Var2.d;
                                if (list8 != null) {
                                    if (list5 != null && list8.size() == list5.size()) {
                                        int i7 = 0;
                                        for (Object obj4 : list8) {
                                            int i8 = i7 + 1;
                                            if (i7 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            if (!((DivAction) obj4).a(list5.get(i7), expressionResolver, expressionResolver2)) {
                                                break;
                                            }
                                            i7 = i8;
                                        }
                                        if (z6Var2.e.evaluate(expressionResolver).doubleValue() == z6Var.e.evaluate(expressionResolver2).doubleValue() && epx.f(z6Var2.f, z6Var.f) && z6Var2.g.evaluate(expressionResolver) == z6Var.g.evaluate(expressionResolver2) && z6Var2.h.a(z6Var.h, expressionResolver, expressionResolver2) && z6Var2.i.evaluate(expressionResolver).longValue() == z6Var.i.evaluate(expressionResolver2).longValue()) {
                                            Expression<Double> expression3 = z6Var2.j;
                                            Double evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                                            Expression<Double> expression4 = z6Var.j;
                                            if (!epx.c(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || !epx.f(z6Var2.k, z6Var.k)) {
                                                break;
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final hkn b() {
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int hash;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((b) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((x0) BuiltInParserKt.getBuiltInParserComponent().t1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
