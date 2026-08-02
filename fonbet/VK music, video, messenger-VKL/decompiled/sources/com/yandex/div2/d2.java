package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.e43;
import xsna.fpf0;

/* compiled from: DivChangeTransition.kt */
/* loaded from: classes8.dex */
public abstract class d2 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivChangeTransition.kt */
    public static final class a extends d2 {
        public final x1 b;

        public a(x1 x1Var) {
            this.b = x1Var;
        }
    }

    /* compiled from: DivChangeTransition.kt */
    public static final class b extends d2 {
        public final a2 b;

        public b(a2 a2Var) {
            this.b = a2Var;
        }
    }

    public final boolean a(d2 d2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        if (d2Var != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                if (d2Var instanceof b) {
                    hashable2 = ((b) d2Var).b;
                } else {
                    if (!(d2Var instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable2 = ((a) d2Var).b;
                }
                a2 a2Var = hashable2 instanceof a2 ? (a2) hashable2 : null;
                a2 a2Var2 = bVar.b;
                if (a2Var == null) {
                    a2Var2.getClass();
                    return false;
                }
                List<d2> list = a2Var2.a;
                List<d2> list2 = a2Var.a;
                if (list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((d2) obj).a(list2.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                        }
                    }
                    return true;
                }
            } else {
                if (!(this instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a aVar = (a) this;
                if (d2Var instanceof b) {
                    hashable = ((b) d2Var).b;
                } else {
                    if (!(d2Var instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable = ((a) d2Var).b;
                }
                x1 x1Var = hashable instanceof x1 ? (x1) hashable : null;
                x1 x1Var2 = aVar.b;
                if (x1Var == null) {
                    x1Var2.getClass();
                    return false;
                }
                if (x1Var2.a.evaluate(expressionResolver).longValue() == x1Var.a.evaluate(expressionResolver2).longValue() && x1Var2.b.evaluate(expressionResolver) == x1Var.b.evaluate(expressionResolver2) && x1Var2.c.evaluate(expressionResolver).longValue() == x1Var.c.evaluate(expressionResolver2).longValue()) {
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
        return ((e2) BuiltInParserKt.getBuiltInParserComponent().U1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
