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

/* compiled from: DivShape.kt */
/* loaded from: classes8.dex */
public abstract class q9 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivShape.kt */
    public static final class a extends q9 {
        public final i2 b;

        public a(i2 i2Var) {
            this.b = i2Var;
        }
    }

    /* compiled from: DivShape.kt */
    public static final class b extends q9 {
        public final y8 b;

        public b(y8 y8Var) {
            this.b = y8Var;
        }
    }

    public final boolean a(q9 q9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        if (q9Var != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                if (q9Var instanceof b) {
                    hashable2 = ((b) q9Var).b;
                } else {
                    if (!(q9Var instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable2 = ((a) q9Var).b;
                }
                return bVar.b.a(hashable2 instanceof y8 ? (y8) hashable2 : null, expressionResolver, expressionResolver2);
            }
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar = (a) this;
            if (q9Var instanceof b) {
                hashable = ((b) q9Var).b;
            } else {
                if (!(q9Var instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hashable = ((a) q9Var).b;
            }
            i2 i2Var = hashable instanceof i2 ? (i2) hashable : null;
            i2 i2Var2 = aVar.b;
            i2Var2.getClass();
            if (i2Var != null) {
                va vaVar = i2Var.c;
                Expression<Integer> expression = i2Var2.a;
                Integer evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                Expression<Integer> expression2 = i2Var.a;
                if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && i2Var2.b.a(i2Var.b, expressionResolver, expressionResolver2)) {
                    va vaVar2 = i2Var2.c;
                    if (vaVar2 != null ? vaVar2.a(vaVar, expressionResolver, expressionResolver2) : vaVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int hash;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((a) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((r9) BuiltInParserKt.getBuiltInParserComponent().S6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
