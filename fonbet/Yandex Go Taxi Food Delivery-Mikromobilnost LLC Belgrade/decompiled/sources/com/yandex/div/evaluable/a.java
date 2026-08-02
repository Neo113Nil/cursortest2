package com.yandex.div.evaluable;

import defpackage.cma1;
import defpackage.cmz0;
import defpackage.dmz0;
import defpackage.emz0;
import defpackage.fmz0;
import defpackage.jdo;
import defpackage.jl40;
import defpackage.jmz0;
import defpackage.kmz0;
import defpackage.mdo;
import defpackage.sls;
import defpackage.vlz0;
import defpackage.w511;
import defpackage.wlz0;
import defpackage.xlz0;
import defpackage.ylz0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class a extends jdo {
    public final kmz0 d;
    public final jdo e;
    public final jdo f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public a(kmz0 kmz0Var, jdo jdoVar, jdo jdoVar2, String str) {
        super(str);
        this.d = kmz0Var;
        this.e = jdoVar;
        this.f = jdoVar2;
        this.g = str;
        this.h = kotlin.collections.a.m0(jdoVar2.c(), jdoVar.c());
        this.i = kotlin.collections.a.m0(jdoVar2.b(), jdoVar.b());
    }

    @Override // defpackage.jdo
    public final Object a(final mdo mdoVar) {
        jdo jdoVar = this.e;
        Object b = mdoVar.b(jdoVar);
        d(jdoVar.b);
        kmz0 kmz0Var = this.d;
        boolean z = false;
        if (kmz0Var instanceof fmz0) {
            fmz0 fmz0Var = (fmz0) kmz0Var;
            sls slsVar = new sls() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Object b2 = mdo.this.b(this.f);
                    a aVar = this;
                    aVar.d(aVar.f.b);
                    return b2;
                }
            };
            if (!(b instanceof Boolean)) {
                b.d(b + HexString.CHAR_SPACE + fmz0Var + " ...", "'" + fmz0Var + "' must be called with boolean operands.");
                throw null;
            }
            boolean z2 = fmz0Var instanceof emz0;
            if ((z2 && ((Boolean) b).booleanValue()) || ((fmz0Var instanceof dmz0) && !((Boolean) b).booleanValue())) {
                return b;
            }
            Object invoke = slsVar.invoke();
            if (!(invoke instanceof Boolean)) {
                b.b(fmz0Var, b, invoke);
                throw null;
            }
            if (!z2 ? !(!((Boolean) b).booleanValue() || !((Boolean) invoke).booleanValue()) : !(!((Boolean) b).booleanValue() && !((Boolean) invoke).booleanValue())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        jdo jdoVar2 = this.f;
        Object b2 = mdoVar.b(jdoVar2);
        d(jdoVar2.b);
        Pair pair = b.getClass().equals(b2.getClass()) ? new Pair(b, b2) : ((b instanceof Long) && (b2 instanceof Double)) ? new Pair(Double.valueOf(((Number) b).longValue()), b2) : ((b instanceof Double) && (b2 instanceof Long)) ? new Pair(b, Double.valueOf(((Number) b2).longValue())) : new Pair(b, b2);
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        if (!first.getClass().equals(second.getClass())) {
            b.b(kmz0Var, first, second);
            throw null;
        }
        if (kmz0Var instanceof ylz0) {
            ylz0 ylz0Var = (ylz0) kmz0Var;
            if (ylz0Var instanceof wlz0) {
                z = first.equals(second);
            } else {
                if (!(ylz0Var instanceof xlz0)) {
                    w511.b();
                    return null;
                }
                if (!first.equals(second)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (kmz0Var instanceof jmz0) {
            return cma1.H((jmz0) kmz0Var, first, second);
        }
        if (kmz0Var instanceof cmz0) {
            return cma1.G((cmz0) kmz0Var, first, second);
        }
        if (!(kmz0Var instanceof vlz0)) {
            b.b(kmz0Var, first, second);
            throw null;
        }
        vlz0 vlz0Var = (vlz0) kmz0Var;
        if ((first instanceof Double) && (second instanceof Double)) {
            return mdo.c(vlz0Var, (Comparable) first, (Comparable) second);
        }
        if ((first instanceof Long) && (second instanceof Long)) {
            return mdo.c(vlz0Var, (Comparable) first, (Comparable) second);
        }
        if ((first instanceof com.yandex.div.evaluable.types.a) && (second instanceof com.yandex.div.evaluable.types.a)) {
            return mdo.c(vlz0Var, (Comparable) first, (Comparable) second);
        }
        b.b(vlz0Var, first, second);
        throw null;
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.i;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.d.equals(aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return Extension.O_BRAKE + this.e + HexString.CHAR_SPACE + this.d + HexString.CHAR_SPACE + this.f + ')';
    }
}
