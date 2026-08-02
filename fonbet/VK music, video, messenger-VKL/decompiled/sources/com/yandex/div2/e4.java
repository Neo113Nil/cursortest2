package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eln;
import xsna.fpf0;

/* compiled from: DivFilter.kt */
/* loaded from: classes8.dex */
public abstract class e4 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivFilter.kt */
    public static final class a extends e4 {
        public final r1 b;

        public a(r1 r1Var) {
            this.b = r1Var;
        }
    }

    /* compiled from: DivFilter.kt */
    public static final class b extends e4 {
        public final eln b;

        public b(eln elnVar) {
            this.b = elnVar;
        }
    }

    public final boolean a(e4 e4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        if (e4Var != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                if (e4Var instanceof a) {
                    hashable2 = ((a) e4Var).b;
                } else {
                    if (!(e4Var instanceof b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable2 = ((b) e4Var).b;
                }
                r1 r1Var = hashable2 instanceof r1 ? (r1) hashable2 : null;
                r1 r1Var2 = aVar.b;
                if (r1Var == null) {
                    r1Var2.getClass();
                    return false;
                }
                if (r1Var2.a.evaluate(expressionResolver).longValue() == r1Var.a.evaluate(expressionResolver2).longValue()) {
                    return true;
                }
            } else {
                if (!(this instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = (b) this;
                if (e4Var instanceof a) {
                    hashable = ((a) e4Var).b;
                } else {
                    if (!(e4Var instanceof b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable = ((b) e4Var).b;
                }
                eln elnVar = hashable instanceof eln ? (eln) hashable : null;
                bVar.b.getClass();
                if (elnVar != null) {
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
        return ((f4) BuiltInParserKt.getBuiltInParserComponent().k3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
