package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eon;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivPivot.kt */
/* loaded from: classes8.dex */
public abstract class x7 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivPivot.kt */
    public static final class a extends x7 {
        public final y7 b;

        public a(y7 y7Var) {
            this.b = y7Var;
        }
    }

    /* compiled from: DivPivot.kt */
    public static final class b extends x7 {
        public final eon b;

        public b(eon eonVar) {
            this.b = eonVar;
        }
    }

    public final boolean a(x7 x7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (x7Var != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                Object b2 = x7Var.b();
                y7 y7Var = b2 instanceof y7 ? (y7) b2 : null;
                y7 y7Var2 = aVar.b;
                if (y7Var == null) {
                    y7Var2.getClass();
                    return false;
                }
                if (y7Var2.a.evaluate(expressionResolver) == y7Var.a.evaluate(expressionResolver2)) {
                    Expression<Long> expression = y7Var2.b;
                    Long evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                    Expression<Long> expression2 = y7Var.b;
                    if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = (b) this;
                Object b3 = x7Var.b();
                eon eonVar = b3 instanceof eon ? (eon) b3 : null;
                eon eonVar2 = bVar.b;
                if (eonVar == null) {
                    eonVar2.getClass();
                    return false;
                }
                if (eonVar2.a.evaluate(expressionResolver).doubleValue() == eonVar.a.evaluate(expressionResolver2).doubleValue()) {
                    return true;
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
        return ((b8) BuiltInParserKt.getBuiltInParserComponent().T5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
