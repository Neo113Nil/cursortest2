package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.pon;

/* compiled from: DivRadialGradientCenter.kt */
/* loaded from: classes8.dex */
public abstract class g8 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivRadialGradientCenter.kt */
    public static final class a extends g8 {
        public final m8 b;

        public a(m8 m8Var) {
            this.b = m8Var;
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    public static final class b extends g8 {
        public final pon b;

        public b(pon ponVar) {
            this.b = ponVar;
        }
    }

    public final boolean a(g8 g8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        if (g8Var != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                if (g8Var instanceof a) {
                    hashable2 = ((a) g8Var).b;
                } else {
                    if (!(g8Var instanceof b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable2 = ((b) g8Var).b;
                }
                m8 m8Var = hashable2 instanceof m8 ? (m8) hashable2 : null;
                m8 m8Var2 = aVar.b;
                if (m8Var == null) {
                    m8Var2.getClass();
                    return false;
                }
                if (m8Var2.a.evaluate(expressionResolver) == m8Var.a.evaluate(expressionResolver2) && m8Var2.b.evaluate(expressionResolver).longValue() == m8Var.b.evaluate(expressionResolver2).longValue()) {
                    return true;
                }
            } else {
                if (!(this instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = (b) this;
                if (g8Var instanceof a) {
                    hashable = ((a) g8Var).b;
                } else {
                    if (!(g8Var instanceof b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable = ((b) g8Var).b;
                }
                pon ponVar = hashable instanceof pon ? (pon) hashable : null;
                pon ponVar2 = bVar.b;
                if (ponVar == null) {
                    ponVar2.getClass();
                    return false;
                }
                if (ponVar2.a.evaluate(expressionResolver).doubleValue() == ponVar.a.evaluate(expressionResolver2).doubleValue()) {
                    return true;
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
        return ((h8) BuiltInParserKt.getBuiltInParserComponent().Z5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
