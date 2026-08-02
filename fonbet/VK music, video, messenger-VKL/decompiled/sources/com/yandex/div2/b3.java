package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.wln;

/* compiled from: DivCount.kt */
/* loaded from: classes8.dex */
public abstract class b3 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivCount.kt */
    public static final class a extends b3 {
        public final j4 b;

        public a(j4 j4Var) {
            this.b = j4Var;
        }
    }

    /* compiled from: DivCount.kt */
    public static final class b extends b3 {
        public final wln b;

        public b(wln wlnVar) {
            this.b = wlnVar;
        }
    }

    public final boolean a(b3 b3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Hashable hashable;
        Hashable hashable2;
        if (b3Var != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                if (b3Var instanceof b) {
                    hashable2 = ((b) b3Var).b;
                } else {
                    if (!(b3Var instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable2 = ((a) b3Var).b;
                }
                wln wlnVar = hashable2 instanceof wln ? (wln) hashable2 : null;
                bVar.b.getClass();
                if (wlnVar != null) {
                    return true;
                }
            } else {
                if (!(this instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a aVar = (a) this;
                if (b3Var instanceof b) {
                    hashable = ((b) b3Var).b;
                } else {
                    if (!(b3Var instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashable = ((a) b3Var).b;
                }
                j4 j4Var = hashable instanceof j4 ? (j4) hashable : null;
                j4 j4Var2 = aVar.b;
                if (j4Var == null) {
                    j4Var2.getClass();
                    return false;
                }
                if (j4Var2.a.evaluate(expressionResolver).longValue() == j4Var.a.evaluate(expressionResolver2).longValue()) {
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
        return ((c3) BuiltInParserKt.getBuiltInParserComponent().v2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
