package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAction;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivFocus.kt */
/* loaded from: classes8.dex */
public final class jln implements JSONSerializable, Hashable {
    public final List<com.yandex.div2.m1> a;
    public final com.yandex.div2.u1 b;
    public final a c;
    public final List<DivAction> d;
    public final List<DivAction> e;
    public Integer f;

    /* compiled from: DivFocus.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<String> a;
        public final Expression<String> b;
        public final Expression<String> c;
        public final Expression<String> d;
        public final Expression<String> e;
        public Integer f;

        public a() {
            this(null, null, null, null, null);
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            Expression<String> expression = this.a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression<String> expression2 = this.b;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.c;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.d;
            int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<String> expression5 = this.e;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this.f = Integer.valueOf(hashCode6);
            return hashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            nln nlnVar = (nln) BuiltInParserKt.getBuiltInParserComponent().C3.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            nlnVar.getClass();
            return nln.a(builtInParsingContext, this);
        }

        public a(Expression<String> expression, Expression<String> expression2, Expression<String> expression3, Expression<String> expression4, Expression<String> expression5) {
            this.a = expression;
            this.b = expression2;
            this.c = expression3;
            this.d = expression4;
            this.e = expression5;
        }
    }

    public jln() {
        this(null, null, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0185, code lost:
    
        if (r1 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0142, code lost:
    
        if (r2 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00ff, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x004d, code lost:
    
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
    
        if (xsna.epx.f(r4, r3 != null ? r3.evaluate(r13) : null) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(jln jlnVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (jlnVar == null) {
            return false;
        }
        List<DivAction> list = jlnVar.e;
        List<DivAction> list2 = jlnVar.d;
        a aVar = jlnVar.c;
        com.yandex.div2.u1 u1Var = jlnVar.b;
        List<com.yandex.div2.m1> list3 = jlnVar.a;
        List<com.yandex.div2.m1> list4 = this.a;
        if (list4 != null) {
            if (list3 != null && list4.size() == list3.size()) {
                int i = 0;
                for (Object obj : list4) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!((com.yandex.div2.m1) obj).a(list3.get(i), expressionResolver, expressionResolver2)) {
                        break;
                    }
                    i = i2;
                }
                com.yandex.div2.u1 u1Var2 = this.b;
                if (u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) {
                    a aVar2 = this.c;
                    if (aVar2 != null) {
                        if (aVar != null) {
                            Expression<String> expression = aVar2.a;
                            String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                            Expression<String> expression2 = aVar.a;
                            if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                                Expression<String> expression3 = aVar2.b;
                                String evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                                Expression<String> expression4 = aVar.b;
                                if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                                    Expression<String> expression5 = aVar2.c;
                                    String evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                                    Expression<String> expression6 = aVar.c;
                                    if (epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                                        Expression<String> expression7 = aVar2.d;
                                        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                                        Expression<String> expression8 = aVar.d;
                                        if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                                            Expression<String> expression9 = aVar2.e;
                                            String evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
                                            Expression<String> expression10 = aVar.e;
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        List<DivAction> list5 = this.d;
                        if (list5 != null) {
                            if (list2 != null) {
                                if (list5.size() == list2.size()) {
                                    int i3 = 0;
                                    for (Object obj2 : list5) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        if (((DivAction) obj2).a(list2.get(i3), expressionResolver, expressionResolver2)) {
                                            i3 = i4;
                                        }
                                    }
                                    z2 = true;
                                }
                                z2 = false;
                                break;
                            }
                            return false;
                        }
                        if (z2) {
                            List<DivAction> list6 = this.e;
                            if (list6 != null) {
                                if (list != null) {
                                    if (list6.size() == list.size()) {
                                        int i5 = 0;
                                        for (Object obj3 : list6) {
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            if (((DivAction) obj3).a(list.get(i5), expressionResolver, expressionResolver2)) {
                                                i5 = i6;
                                            }
                                        }
                                        z3 = true;
                                    }
                                    z3 = false;
                                    break;
                                }
                                return false;
                            }
                            if (z3) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(jln.class).hashCode();
        int i3 = 0;
        List<com.yandex.div2.m1> list = this.a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((com.yandex.div2.m1) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i4 = hashCode + i;
        com.yandex.div2.u1 u1Var = this.b;
        int hash = i4 + (u1Var != null ? u1Var.hash() : 0);
        a aVar = this.c;
        int hash2 = hash + (aVar != null ? aVar.hash() : 0);
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
        int i5 = hash2 + i2;
        List<DivAction> list3 = this.e;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                i3 += ((DivAction) it3.next()).hash();
            }
        }
        int i6 = i5 + i3;
        this.f = Integer.valueOf(i6);
        return i6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((kln) BuiltInParserKt.getBuiltInParserComponent().z3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jln(List<? extends com.yandex.div2.m1> list, com.yandex.div2.u1 u1Var, a aVar, List<DivAction> list2, List<DivAction> list3) {
        this.a = list;
        this.b = u1Var;
        this.c = aVar;
        this.d = list2;
        this.e = list3;
    }
}
