package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bpn;
import xsna.e43;
import xsna.epx;
import xsna.fnn;
import xsna.fpf0;

/* compiled from: DivBackground.kt */
/* loaded from: classes8.dex */
public abstract class m1 implements JSONSerializable, Hashable {
    public Integer a;

    /* compiled from: DivBackground.kt */
    public static final class a extends m1 {
        public final f5 b;

        public a(f5 f5Var) {
            this.b = f5Var;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class b extends m1 {
        public final s6 b;

        public b(s6 s6Var) {
            this.b = s6Var;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class c extends m1 {
        public final fnn b;

        public c(fnn fnnVar) {
            this.b = fnnVar;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class d extends m1 {
        public final f8 b;

        public d(f8 f8Var) {
            this.b = f8Var;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class e extends m1 {
        public final bpn b;

        public e(bpn bpnVar) {
            this.b = bpnVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        if (r4 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(m1 m1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (m1Var != null) {
            if (this instanceof b) {
                b bVar = (b) this;
                Object b2 = m1Var.b();
                return bVar.b.a(b2 instanceof s6 ? (s6) b2 : null, expressionResolver, expressionResolver2);
            }
            if (this instanceof d) {
                d dVar = (d) this;
                Object b3 = m1Var.b();
                return dVar.b.a(b3 instanceof f8 ? (f8) b3 : null, expressionResolver, expressionResolver2);
            }
            if (this instanceof a) {
                a aVar = (a) this;
                Object b4 = m1Var.b();
                f5 f5Var = b4 instanceof f5 ? (f5) b4 : null;
                f5 f5Var2 = aVar.b;
                f5Var2.getClass();
                if (f5Var != null) {
                    List<e4> list = f5Var.d;
                    if (f5Var2.a.evaluate(expressionResolver).doubleValue() == f5Var.a.evaluate(expressionResolver2).doubleValue() && f5Var2.b.evaluate(expressionResolver) == f5Var.b.evaluate(expressionResolver2) && f5Var2.c.evaluate(expressionResolver) == f5Var.c.evaluate(expressionResolver2)) {
                        List<e4> list2 = f5Var2.d;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (!((e4) obj).a(list.get(i), expressionResolver, expressionResolver2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                if (!epx.f(f5Var2.e.evaluate(expressionResolver), f5Var.e.evaluate(expressionResolver2)) || f5Var2.f.evaluate(expressionResolver).booleanValue() != f5Var.f.evaluate(expressionResolver2).booleanValue() || f5Var2.g.evaluate(expressionResolver) != f5Var.g.evaluate(expressionResolver2)) {
                                    break;
                                }
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (this instanceof e) {
                    e eVar = (e) this;
                    Object b5 = m1Var.b();
                    bpn bpnVar = b5 instanceof bpn ? (bpn) b5 : null;
                    bpn bpnVar2 = eVar.b;
                    if (bpnVar != null) {
                        return bpnVar2.a.evaluate(expressionResolver).intValue() == bpnVar.a.evaluate(expressionResolver2).intValue();
                    }
                    bpnVar2.getClass();
                    return false;
                }
                if (!(this instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c cVar = (c) this;
                Object b6 = m1Var.b();
                fnn fnnVar = b6 instanceof fnn ? (fnn) b6 : null;
                fnn fnnVar2 = cVar.b;
                if (fnnVar == null) {
                    fnnVar2.getClass();
                    return false;
                }
                if (epx.f(fnnVar2.a.evaluate(expressionResolver), fnnVar.a.evaluate(expressionResolver2))) {
                    com.yandex.div2.b bVar2 = fnnVar2.b;
                    com.yandex.div2.b bVar3 = fnnVar.b;
                    if (bVar3 == null) {
                        bVar2.getClass();
                        return false;
                    }
                    if (bVar2.a.evaluate(expressionResolver).longValue() != bVar3.a.evaluate(expressionResolver2).longValue() || bVar2.b.evaluate(expressionResolver).longValue() != bVar3.b.evaluate(expressionResolver2).longValue() || bVar2.c.evaluate(expressionResolver).longValue() != bVar3.c.evaluate(expressionResolver2).longValue() || bVar2.d.evaluate(expressionResolver).longValue() != bVar3.d.evaluate(expressionResolver2).longValue()) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).b;
        }
        if (this instanceof d) {
            return ((d) this).b;
        }
        if (this instanceof a) {
            return ((a) this).b;
        }
        if (this instanceof e) {
            return ((e) this).b;
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
        if (this instanceof b) {
            hash = ((b) this).b.hash();
        } else if (this instanceof d) {
            hash = ((d) this).b.hash();
        } else if (this instanceof a) {
            hash = ((a) this).b.hash();
        } else if (this instanceof e) {
            hash = ((e) this).b.hash();
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
        return ((n1) BuiltInParserKt.getBuiltInParserComponent().F1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
