package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.izs;
import xsna.pkn;

/* compiled from: DivAction.kt */
/* loaded from: classes8.dex */
public final class DivAction implements JSONSerializable, Hashable {
    public final pkn a;
    public final Expression<Boolean> b;
    public final Expression<String> c;
    public final Expression<Uri> d;
    public final List<a> e;
    public final JSONObject f;
    public final Expression<Uri> g;
    public final String h;
    public final Expression<Target> i;
    public final k0 j;
    public final Expression<Uri> k;
    public Integer l;

    /* compiled from: DivAction.kt */
    public enum Target {
        SELF("_self"),
        BLANK("_blank");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Target, String> TO_STRING = b.i;
        public static final izs<String, Target> FROM_STRING = a.i;

        /* compiled from: DivAction.kt */
        public static final class a extends Lambda implements izs<String, Target> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Target invoke(String str) {
                String str2 = str;
                Target.Converter.getClass();
                Target target = Target.SELF;
                if (epx.f(str2, target.value)) {
                    return target;
                }
                Target target2 = Target.BLANK;
                if (epx.f(str2, target2.value)) {
                    return target2;
                }
                return null;
            }
        }

        /* compiled from: DivAction.kt */
        public static final class b extends Lambda implements izs<Target, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Target target) {
                Target.Converter.getClass();
                return target.value;
            }
        }

        /* compiled from: DivAction.kt */
        public static final class c {
        }

        Target(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivAction.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final DivAction a;
        public final List<DivAction> b;
        public final Expression<String> c;
        public Integer d;

        public a(DivAction divAction, List<DivAction> list, Expression<String> expression) {
            this.a = divAction;
            this.b = list;
            this.c = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            int i = 0;
            DivAction divAction = this.a;
            int hash = hashCode + (divAction != null ? divAction.hash() : 0);
            List<DivAction> list = this.b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            }
            int hashCode2 = this.c.hashCode() + hash + i;
            this.d = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((k) BuiltInParserKt.getBuiltInParserComponent().n1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public DivAction(pkn pknVar, Expression<Boolean> expression, Expression<String> expression2, Expression<Uri> expression3, List<a> list, JSONObject jSONObject, Expression<Uri> expression4, String str, Expression<Target> expression5, k0 k0Var, Expression<Uri> expression6) {
        this.a = pknVar;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = jSONObject;
        this.g = expression4;
        this.h = str;
        this.i = expression5;
        this.j = k0Var;
        this.k = expression6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00ff, code lost:
    
        if (r13 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
    
        if (r6 == null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122 A[LOOP:0: B:77:0x008a->B:85:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(DivAction divAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (divAction == null) {
            return false;
        }
        k0 k0Var = divAction.j;
        List<a> list = divAction.e;
        pkn pknVar = divAction.a;
        pkn pknVar2 = this.a;
        if ((pknVar2 != null ? pknVar2.a(pknVar, expressionResolver, expressionResolver2) : pknVar == null) && this.b.evaluate(expressionResolver).booleanValue() == divAction.b.evaluate(expressionResolver2).booleanValue() && epx.f(this.c.evaluate(expressionResolver), divAction.c.evaluate(expressionResolver2))) {
            Expression<Uri> expression = this.d;
            Uri evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Uri> expression2 = divAction.d;
            if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                List<a> list2 = this.e;
                if (list2 == null) {
                    z = false;
                } else {
                    if (list == null) {
                        return false;
                    }
                    if (list2.size() != list.size()) {
                        z = false;
                    } else {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            a aVar = list.get(i);
                            a aVar2 = (a) obj;
                            aVar2.getClass();
                            if (aVar != null) {
                                List<DivAction> list3 = aVar.b;
                                DivAction divAction2 = aVar.a;
                                DivAction divAction3 = aVar2.a;
                                if (divAction3 != null ? divAction3.a(divAction2, expressionResolver, expressionResolver2) : divAction2 == null ? true : z3) {
                                    List<DivAction> list4 = aVar2.b;
                                    if (list4 != null) {
                                        if (list3 != null) {
                                            z = z3;
                                            if (list4.size() == list3.size()) {
                                                ?? r14 = z;
                                                for (Object obj2 : list4) {
                                                    int i3 = r14 + 1;
                                                    if (r14 < 0) {
                                                        e43.t();
                                                        throw null;
                                                    }
                                                    if (((DivAction) obj2).a(list3.get(r14), expressionResolver, expressionResolver2)) {
                                                        r14 = i3;
                                                    }
                                                }
                                                z2 = true;
                                            }
                                            z2 = z;
                                            break;
                                        }
                                    } else {
                                        z = z3;
                                    }
                                    if (z2 && epx.f(aVar2.c.evaluate(expressionResolver), aVar.c.evaluate(expressionResolver2))) {
                                        z3 = true;
                                        if (!z3) {
                                            z3 = z;
                                            break;
                                        }
                                        i = i2;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3;
                                }
                                z3 = z;
                                if (!z3) {
                                }
                            }
                            z = z3;
                            if (!z3) {
                            }
                        }
                        z = z3;
                        z3 = true;
                    }
                }
                if (!z3 || !epx.f(this.f, divAction.f)) {
                    return z;
                }
                Expression<Uri> expression3 = this.g;
                Uri evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<Uri> expression4 = divAction.g;
                if (!epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || !epx.f(this.h, divAction.h)) {
                    return z;
                }
                Expression<Target> expression5 = this.i;
                Target evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                Expression<Target> expression6 = divAction.i;
                if (evaluate3 != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                    return z;
                }
                k0 k0Var2 = this.j;
                if (!(k0Var2 != null ? k0Var2.a(k0Var, expressionResolver, expressionResolver2) : k0Var == null ? true : z)) {
                    return z;
                }
                Expression<Uri> expression7 = this.k;
                Uri evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                Expression<Uri> expression8 = divAction.k;
                if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivAction.class).hashCode();
        pkn pknVar = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (pknVar != null ? pknVar.hash() : 0);
        Expression<Uri> expression = this.d;
        int hashCode3 = hashCode2 + (expression != null ? expression.hashCode() : 0);
        List<a> list = this.e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((a) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i2 = hashCode3 + i;
        JSONObject jSONObject = this.f;
        int hashCode4 = i2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<Uri> expression2 = this.g;
        int hashCode5 = hashCode4 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.h;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        Expression<Target> expression3 = this.i;
        int hashCode7 = hashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        k0 k0Var = this.j;
        int hash = hashCode7 + (k0Var != null ? k0Var.hash() : 0);
        Expression<Uri> expression4 = this.k;
        int hashCode8 = hash + (expression4 != null ? expression4.hashCode() : 0);
        this.l = Integer.valueOf(hashCode8);
        return hashCode8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((j.b) BuiltInParserKt.getBuiltInParserComponent().k1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
