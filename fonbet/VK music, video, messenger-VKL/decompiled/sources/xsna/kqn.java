package xsna;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTypedValue.kt */
/* loaded from: classes8.dex */
public abstract class kqn implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivTypedValue.kt */
    public static final class a extends kqn {
        public final gl3 b;

        public a(gl3 gl3Var) {
            this.b = gl3Var;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class b extends kqn {
        public final s08 b;

        public b(s08 s08Var) {
            this.b = s08Var;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class c extends kqn {
        public final o8g b;

        public c(o8g o8gVar) {
            this.b = o8gVar;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class d extends kqn {
        public final twm b;

        public d(twm twmVar) {
            this.b = twmVar;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class e extends kqn {
        public final x9x b;

        public e(x9x x9xVar) {
            this.b = x9xVar;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class f extends kqn {
        public final kn70 b;

        public f(kn70 kn70Var) {
            this.b = kn70Var;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class g extends kqn {
        public final wnm0 b;

        public g(wnm0 wnm0Var) {
            this.b = wnm0Var;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class h extends kqn {
        public final kfq0 b;

        public h(kfq0 kfq0Var) {
            this.b = kfq0Var;
        }
    }

    public final boolean a(kqn kqnVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (kqnVar == null) {
            return false;
        }
        if (this instanceof g) {
            g gVar = (g) this;
            Object b2 = kqnVar.b();
            wnm0 wnm0Var = b2 instanceof wnm0 ? (wnm0) b2 : null;
            wnm0 wnm0Var2 = gVar.b;
            if (wnm0Var != null) {
                return epx.f(wnm0Var2.a.evaluate(expressionResolver), wnm0Var.a.evaluate(expressionResolver2));
            }
            wnm0Var2.getClass();
            return false;
        }
        if (this instanceof e) {
            e eVar = (e) this;
            Object b3 = kqnVar.b();
            x9x x9xVar = b3 instanceof x9x ? (x9x) b3 : null;
            x9x x9xVar2 = eVar.b;
            if (x9xVar != null) {
                return x9xVar2.a.evaluate(expressionResolver).longValue() == x9xVar.a.evaluate(expressionResolver2).longValue();
            }
            x9xVar2.getClass();
            return false;
        }
        if (this instanceof f) {
            f fVar = (f) this;
            Object b4 = kqnVar.b();
            kn70 kn70Var = b4 instanceof kn70 ? (kn70) b4 : null;
            kn70 kn70Var2 = fVar.b;
            if (kn70Var != null) {
                return kn70Var2.a.evaluate(expressionResolver).doubleValue() == kn70Var.a.evaluate(expressionResolver2).doubleValue();
            }
            kn70Var2.getClass();
            return false;
        }
        if (this instanceof c) {
            c cVar = (c) this;
            Object b5 = kqnVar.b();
            o8g o8gVar = b5 instanceof o8g ? (o8g) b5 : null;
            o8g o8gVar2 = cVar.b;
            if (o8gVar != null) {
                return o8gVar2.a.evaluate(expressionResolver).intValue() == o8gVar.a.evaluate(expressionResolver2).intValue();
            }
            o8gVar2.getClass();
            return false;
        }
        if (this instanceof b) {
            b bVar = (b) this;
            Object b6 = kqnVar.b();
            s08 s08Var = b6 instanceof s08 ? (s08) b6 : null;
            s08 s08Var2 = bVar.b;
            if (s08Var != null) {
                return s08Var2.a.evaluate(expressionResolver).booleanValue() == s08Var.a.evaluate(expressionResolver2).booleanValue();
            }
            s08Var2.getClass();
            return false;
        }
        if (this instanceof h) {
            h hVar = (h) this;
            Object b7 = kqnVar.b();
            kfq0 kfq0Var = b7 instanceof kfq0 ? (kfq0) b7 : null;
            kfq0 kfq0Var2 = hVar.b;
            if (kfq0Var != null) {
                return epx.f(kfq0Var2.a.evaluate(expressionResolver), kfq0Var.a.evaluate(expressionResolver2));
            }
            kfq0Var2.getClass();
            return false;
        }
        if (this instanceof d) {
            d dVar = (d) this;
            Object b8 = kqnVar.b();
            twm twmVar = b8 instanceof twm ? (twm) b8 : null;
            twm twmVar2 = dVar.b;
            if (twmVar != null) {
                return epx.f(twmVar2.a.evaluate(expressionResolver), twmVar.a.evaluate(expressionResolver2));
            }
            twmVar2.getClass();
            return false;
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar = (a) this;
        Object b9 = kqnVar.b();
        gl3 gl3Var = b9 instanceof gl3 ? (gl3) b9 : null;
        gl3 gl3Var2 = aVar.b;
        if (gl3Var != null) {
            return epx.f(gl3Var2.a.evaluate(expressionResolver), gl3Var.a.evaluate(expressionResolver2));
        }
        gl3Var2.getClass();
        return false;
    }

    public final Object b() {
        if (this instanceof g) {
            return ((g) this).b;
        }
        if (this instanceof e) {
            return ((e) this).b;
        }
        if (this instanceof f) {
            return ((f) this).b;
        }
        if (this instanceof c) {
            return ((c) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof h) {
            return ((h) this).b;
        }
        if (this instanceof d) {
            return ((d) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
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
        if (this instanceof g) {
            hash = ((g) this).b.hash();
        } else if (this instanceof e) {
            hash = ((e) this).b.hash();
        } else if (this instanceof f) {
            hash = ((f) this).b.hash();
        } else if (this instanceof c) {
            hash = ((c) this).b.hash();
        } else if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else if (this instanceof h) {
            hash = ((h) this).b.hash();
        } else if (this instanceof d) {
            hash = ((d) this).b.hash();
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
        return ((lqn) BuiltInParserKt.getBuiltInParserComponent().e9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
