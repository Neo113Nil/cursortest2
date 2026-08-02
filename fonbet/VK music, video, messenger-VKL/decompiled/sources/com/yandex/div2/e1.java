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

/* compiled from: DivAppearanceTransition.kt */
/* loaded from: classes8.dex */
public abstract class e1 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivAppearanceTransition.kt */
    public static final class a extends e1 {
        public final b4 b;

        public a(b4 b4Var) {
            this.b = b4Var;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class b extends e1 {
        public final b9 b;

        public b(b9 b9Var) {
            this.b = b9Var;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class c extends e1 {
        public final b1 b;

        public c(b1 b1Var) {
            this.b = b1Var;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class d extends e1 {
        public final DivSlideTransition b;

        public d(DivSlideTransition divSlideTransition) {
            this.b = divSlideTransition;
        }
    }

    public final boolean a(e1 e1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (e1Var == null) {
            return false;
        }
        if (this instanceof c) {
            c cVar = (c) this;
            Object b2 = e1Var.b();
            b1 b1Var = b2 instanceof b1 ? (b1) b2 : null;
            b1 b1Var2 = cVar.b;
            if (b1Var == null) {
                b1Var2.getClass();
                return false;
            }
            List<e1> list = b1Var2.a;
            List<e1> list2 = b1Var.a;
            if (list.size() == list2.size()) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((e1) obj).a(list2.get(i), expressionResolver, expressionResolver2)) {
                        i = i2;
                    }
                }
                return true;
            }
            return false;
        }
        if (this instanceof a) {
            a aVar = (a) this;
            Object b3 = e1Var.b();
            return aVar.b.a(b3 instanceof b4 ? (b4) b3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            b bVar = (b) this;
            Object b4 = e1Var.b();
            b9 b9Var = b4 instanceof b9 ? (b9) b4 : null;
            b9 b9Var2 = bVar.b;
            if (b9Var != null) {
                return b9Var2.a.evaluate(expressionResolver).longValue() == b9Var.a.evaluate(expressionResolver2).longValue() && b9Var2.b.evaluate(expressionResolver) == b9Var.b.evaluate(expressionResolver2) && b9Var2.c.evaluate(expressionResolver).doubleValue() == b9Var.c.evaluate(expressionResolver2).doubleValue() && b9Var2.d.evaluate(expressionResolver).doubleValue() == b9Var.d.evaluate(expressionResolver2).doubleValue() && b9Var2.e.evaluate(expressionResolver).doubleValue() == b9Var.e.evaluate(expressionResolver2).doubleValue() && b9Var2.f.evaluate(expressionResolver).longValue() == b9Var.f.evaluate(expressionResolver2).longValue();
            }
            b9Var2.getClass();
            return false;
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        d dVar = (d) this;
        Object b5 = e1Var.b();
        DivSlideTransition divSlideTransition = b5 instanceof DivSlideTransition ? (DivSlideTransition) b5 : null;
        DivSlideTransition divSlideTransition2 = dVar.b;
        divSlideTransition2.getClass();
        if (divSlideTransition != null) {
            s3 s3Var = divSlideTransition.a;
            s3 s3Var2 = divSlideTransition2.a;
            if ((s3Var2 != null ? s3Var2.a(s3Var, expressionResolver, expressionResolver2) : s3Var == null) && divSlideTransition2.b.evaluate(expressionResolver).longValue() == divSlideTransition.b.evaluate(expressionResolver2).longValue() && divSlideTransition2.c.evaluate(expressionResolver) == divSlideTransition.c.evaluate(expressionResolver2) && divSlideTransition2.d.evaluate(expressionResolver) == divSlideTransition.d.evaluate(expressionResolver2) && divSlideTransition2.e.evaluate(expressionResolver).longValue() == divSlideTransition.e.evaluate(expressionResolver2).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof d) {
            return ((d) this).b;
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
        if (this instanceof c) {
            hash = ((c) this).b.hash();
        } else if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((d) this).b.hash();
        }
        int i = hashCode + hash;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((f1) BuiltInParserKt.getBuiltInParserComponent().z1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
