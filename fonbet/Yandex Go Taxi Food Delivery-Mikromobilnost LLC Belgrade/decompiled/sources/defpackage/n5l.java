package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class n5l implements c4x {
    public Integer a;

    public final boolean a(n5l n5lVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (n5lVar != null) {
            if (this instanceof l5l) {
                l5l l5lVar = (l5l) this;
                if (n5lVar instanceof l5l) {
                    c4xVar2 = ((l5l) n5lVar).b;
                } else {
                    if (!(n5lVar instanceof m5l)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((m5l) n5lVar).b;
                }
                w5l w5lVar = c4xVar2 instanceof w5l ? (w5l) c4xVar2 : null;
                if (w5lVar != null) {
                    w5l w5lVar2 = l5lVar.b;
                    if (w5lVar2.a.a(rvoVar) == w5lVar.a.a(rvoVar2) && ((Number) w5lVar2.b.a(rvoVar)).longValue() == ((Number) w5lVar.b.a(rvoVar2)).longValue()) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof m5l)) {
                    w511.b();
                    return false;
                }
                m5l m5lVar = (m5l) this;
                if (n5lVar instanceof l5l) {
                    c4xVar = ((l5l) n5lVar).b;
                } else {
                    if (!(n5lVar instanceof m5l)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((m5l) n5lVar).b;
                }
                o6l o6lVar = c4xVar instanceof o6l ? (o6l) c4xVar : null;
                if (o6lVar != null && ((Number) m5lVar.b.a.a(rvoVar)).doubleValue() == ((Number) o6lVar.a.a(rvoVar2)).doubleValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof l5l) {
            w5l w5lVar = ((l5l) this).b;
            Integer num2 = w5lVar.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = w5lVar.b.hashCode() + w5lVar.a.hashCode() + qoi0.a(w5l.class).hashCode();
                w5lVar.c = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof m5l)) {
                w511.b();
                return 0;
            }
            o6l o6lVar = ((m5l) this).b;
            Integer num3 = o6lVar.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = o6lVar.a.hashCode() + qoi0.a(o6l.class).hashCode();
                o6lVar.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((o5l) ft6.b.m6.getValue()).b(ft6.a, this);
    }
}
