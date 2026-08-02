package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;
import xsna.krn;

/* compiled from: DivSize.kt */
/* loaded from: classes8.dex */
public abstract class v9 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivSize.kt */
    public static final class a extends v9 {
        public final q4 b;

        public a(q4 q4Var) {
            this.b = q4Var;
        }
    }

    /* compiled from: DivSize.kt */
    public static final class b extends v9 {
        public final w6 b;

        public b(w6 w6Var) {
            this.b = w6Var;
        }
    }

    /* compiled from: DivSize.kt */
    public static final class c extends v9 {
        public final krn b;

        public c(krn krnVar) {
            this.b = krnVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(v9 v9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (v9Var != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                Object b2 = v9Var.b();
                return aVar.b.a(b2 instanceof q4 ? (q4) b2 : null, expressionResolver, expressionResolver2);
            }
            if (this instanceof b) {
                b bVar = (b) this;
                Object b3 = v9Var.b();
                w6 w6Var = b3 instanceof w6 ? (w6) b3 : null;
                w6 w6Var2 = bVar.b;
                w6Var2.getClass();
                if (w6Var != null) {
                    aa aaVar = w6Var.b;
                    aa aaVar2 = w6Var.a;
                    aa aaVar3 = w6Var2.a;
                    if (aaVar3 != null ? aaVar3.a(aaVar2, expressionResolver, expressionResolver2) : aaVar2 == null) {
                        aa aaVar4 = w6Var2.b;
                        if (aaVar4 != null ? aaVar4.a(aaVar, expressionResolver, expressionResolver2) : aaVar == null) {
                            Expression<Double> expression = w6Var2.c;
                            Double evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                            Expression<Double> expression2 = w6Var.c;
                            if (epx.c(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                if (!(this instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c cVar = (c) this;
                Object b4 = v9Var.b();
                krn krnVar = b4 instanceof krn ? (krn) b4 : null;
                krn krnVar2 = cVar.b;
                krnVar2.getClass();
                if (krnVar != null) {
                    aa aaVar5 = krnVar.c;
                    aa aaVar6 = krnVar.b;
                    Expression<Boolean> expression3 = krnVar2.a;
                    Boolean evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                    Expression<Boolean> expression4 = krnVar.a;
                    if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                        aa aaVar7 = krnVar2.b;
                        if (aaVar7 != null ? aaVar7.a(aaVar6, expressionResolver, expressionResolver2) : aaVar6 == null) {
                            aa aaVar8 = krnVar2.c;
                            if (aaVar8 != null ? aaVar8.a(aaVar5, expressionResolver, expressionResolver2) : aaVar5 == null) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof c) {
            return ((c) this).b;
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
        } else if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((c) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((w9) BuiltInParserKt.getBuiltInParserComponent().Y6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
