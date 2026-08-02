package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class d0l implements c4x {
    public final Expression a;
    public final n3k b;
    public Integer c;

    public d0l(Expression expression, n3k n3kVar) {
        this.a = expression;
        this.b = n3kVar;
    }

    public final boolean a(d0l d0lVar, rvo rvoVar, rvo rvoVar2) {
        if (d0lVar != null && jl40.l(this.a.a(rvoVar), d0lVar.a.a(rvoVar2))) {
            n3k n3kVar = d0lVar.b;
            n3k n3kVar2 = this.b;
            if (n3kVar == null) {
                n3kVar2.getClass();
            } else if (((Number) n3kVar2.a.a(rvoVar)).longValue() == ((Number) n3kVar.a.a(rvoVar2)).longValue() && ((Number) n3kVar2.b.a(rvoVar)).longValue() == ((Number) n3kVar.b.a(rvoVar2)).longValue() && ((Number) n3kVar2.c.a(rvoVar)).longValue() == ((Number) n3kVar.c.a(rvoVar2)).longValue() && ((Number) n3kVar2.d.a(rvoVar)).longValue() == ((Number) n3kVar.d.a(rvoVar2)).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(d0l.class).hashCode();
        n3k n3kVar = this.b;
        Integer num2 = n3kVar.e;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode2 = n3kVar.d.hashCode() + n3kVar.c.hashCode() + n3kVar.b.hashCode() + n3kVar.a.hashCode() + qoi0.a(n3k.class).hashCode();
            n3kVar.e = Integer.valueOf(hashCode2);
            i = hashCode2;
        }
        int i2 = i + hashCode;
        this.c = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((e0l) ft6.b.m5.getValue()).b(ft6.a, this);
    }
}
