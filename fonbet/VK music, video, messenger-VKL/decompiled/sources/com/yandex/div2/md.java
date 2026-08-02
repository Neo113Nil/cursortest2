package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bom0;
import xsna.cax;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ll3;
import xsna.pfq0;
import xsna.pn70;
import xsna.t8g;
import xsna.x08;
import xsna.ywm;

/* compiled from: DivVariable.kt */
/* loaded from: classes8.dex */
public abstract class md implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivVariable.kt */
    public static final class a extends md {
        public final ll3 b;

        public a(ll3 ll3Var) {
            this.b = ll3Var;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class b extends md {
        public final x08 b;

        public b(x08 x08Var) {
            this.b = x08Var;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class c extends md {
        public final t8g b;

        public c(t8g t8gVar) {
            this.b = t8gVar;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class d extends md {
        public final ywm b;

        public d(ywm ywmVar) {
            this.b = ywmVar;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class e extends md {
        public final cax b;

        public e(cax caxVar) {
            this.b = caxVar;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class f extends md {
        public final pn70 b;

        public f(pn70 pn70Var) {
            this.b = pn70Var;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class g extends md {
        public final je b;

        public g(je jeVar) {
            this.b = jeVar;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class h extends md {
        public final bom0 b;

        public h(bom0 bom0Var) {
            this.b = bom0Var;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class i extends md {
        public final pfq0 b;

        public i(pfq0 pfq0Var) {
            this.b = pfq0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x026a, code lost:
    
        if (r3 == null) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(md mdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (mdVar != null) {
            if (this instanceof h) {
                h hVar = (h) this;
                Object b2 = mdVar.b();
                bom0 bom0Var = b2 instanceof bom0 ? (bom0) b2 : null;
                bom0 bom0Var2 = hVar.b;
                if (bom0Var == null) {
                    bom0Var2.getClass();
                    return false;
                }
                if (epx.f(bom0Var2.a, bom0Var.a) && epx.f(bom0Var2.b.evaluate(expressionResolver), bom0Var.b.evaluate(expressionResolver2))) {
                    return true;
                }
            } else if (this instanceof f) {
                f fVar = (f) this;
                Object b3 = mdVar.b();
                pn70 pn70Var = b3 instanceof pn70 ? (pn70) b3 : null;
                pn70 pn70Var2 = fVar.b;
                if (pn70Var == null) {
                    pn70Var2.getClass();
                    return false;
                }
                if (epx.f(pn70Var2.a, pn70Var.a) && pn70Var2.b.evaluate(expressionResolver).doubleValue() == pn70Var.b.evaluate(expressionResolver2).doubleValue()) {
                    return true;
                }
            } else if (this instanceof e) {
                e eVar = (e) this;
                Object b4 = mdVar.b();
                cax caxVar = b4 instanceof cax ? (cax) b4 : null;
                cax caxVar2 = eVar.b;
                if (caxVar == null) {
                    caxVar2.getClass();
                    return false;
                }
                if (epx.f(caxVar2.a, caxVar.a) && caxVar2.b.evaluate(expressionResolver).longValue() == caxVar.b.evaluate(expressionResolver2).longValue()) {
                    return true;
                }
            } else if (this instanceof b) {
                b bVar = (b) this;
                Object b5 = mdVar.b();
                x08 x08Var = b5 instanceof x08 ? (x08) b5 : null;
                x08 x08Var2 = bVar.b;
                if (x08Var == null) {
                    x08Var2.getClass();
                    return false;
                }
                if (epx.f(x08Var2.a, x08Var.a) && x08Var2.b.evaluate(expressionResolver).booleanValue() == x08Var.b.evaluate(expressionResolver2).booleanValue()) {
                    return true;
                }
            } else if (this instanceof c) {
                c cVar = (c) this;
                Object b6 = mdVar.b();
                t8g t8gVar = b6 instanceof t8g ? (t8g) b6 : null;
                t8g t8gVar2 = cVar.b;
                if (t8gVar == null) {
                    t8gVar2.getClass();
                    return false;
                }
                if (epx.f(t8gVar2.a, t8gVar.a) && t8gVar2.b.evaluate(expressionResolver).intValue() == t8gVar.b.evaluate(expressionResolver2).intValue()) {
                    return true;
                }
            } else if (this instanceof i) {
                i iVar = (i) this;
                Object b7 = mdVar.b();
                pfq0 pfq0Var = b7 instanceof pfq0 ? (pfq0) b7 : null;
                pfq0 pfq0Var2 = iVar.b;
                if (pfq0Var == null) {
                    pfq0Var2.getClass();
                    return false;
                }
                if (epx.f(pfq0Var2.a, pfq0Var.a) && epx.f(pfq0Var2.b.evaluate(expressionResolver), pfq0Var.b.evaluate(expressionResolver2))) {
                    return true;
                }
            } else if (this instanceof d) {
                d dVar = (d) this;
                Object b8 = mdVar.b();
                ywm ywmVar = b8 instanceof ywm ? (ywm) b8 : null;
                ywm ywmVar2 = dVar.b;
                if (ywmVar == null) {
                    ywmVar2.getClass();
                    return false;
                }
                if (epx.f(ywmVar2.a, ywmVar.a) && epx.f(ywmVar2.b.evaluate(expressionResolver), ywmVar.b.evaluate(expressionResolver2))) {
                    return true;
                }
            } else if (this instanceof a) {
                a aVar = (a) this;
                Object b9 = mdVar.b();
                ll3 ll3Var = b9 instanceof ll3 ? (ll3) b9 : null;
                ll3 ll3Var2 = aVar.b;
                if (ll3Var == null) {
                    ll3Var2.getClass();
                    return false;
                }
                if (epx.f(ll3Var2.a, ll3Var.a) && epx.f(ll3Var2.b.evaluate(expressionResolver), ll3Var.b.evaluate(expressionResolver2))) {
                    return true;
                }
            } else {
                if (!(this instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                g gVar = (g) this;
                Object b10 = mdVar.b();
                je jeVar = b10 instanceof je ? (je) b10 : null;
                je jeVar2 = gVar.b;
                jeVar2.getClass();
                if (jeVar != null) {
                    List<DivAction> list = jeVar.d;
                    if (epx.f(jeVar2.a.evaluate(expressionResolver), jeVar.a.evaluate(expressionResolver2)) && epx.f(jeVar2.b, jeVar.b) && jeVar2.c.equals(jeVar.c)) {
                        List<DivAction> list2 = jeVar2.d;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i2 = 0;
                                for (Object obj : list2) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (!((DivAction) obj).a(list.get(i2), expressionResolver, expressionResolver2)) {
                                        break;
                                    }
                                    i2 = i3;
                                }
                                if (jeVar2.e.evaluate(expressionResolver) == jeVar.e.evaluate(expressionResolver2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final Object b() {
        if (this instanceof h) {
            return ((h) this).b;
        }
        if (this instanceof f) {
            return ((f) this).b;
        }
        if (this instanceof e) {
            return ((e) this).b;
        }
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof c) {
            return ((c) this).b;
        }
        if (this instanceof i) {
            return ((i) this).b;
        }
        if (this instanceof d) {
            return ((d) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof g) {
            return ((g) this).b;
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
        if (this instanceof h) {
            hash = ((h) this).b.hash();
        } else if (this instanceof f) {
            hash = ((f) this).b.hash();
        } else if (this instanceof e) {
            hash = ((e) this).b.hash();
        } else if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else if (this instanceof c) {
            hash = ((c) this).b.hash();
        } else if (this instanceof i) {
            hash = ((i) this).b.hash();
        } else if (this instanceof d) {
            hash = ((d) this).b.hash();
        } else if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else {
            if (!(this instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((g) this).b.hash();
        }
        int i2 = hashCode + hash;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((nd) BuiltInParserKt.getBuiltInParserComponent().h9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
