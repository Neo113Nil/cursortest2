package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class pkk implements c4x {
    public Integer a;

    public final boolean a(pkk pkkVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (pkkVar != null) {
            if (!(this instanceof okk)) {
                if (!(this instanceof nkk)) {
                    w511.b();
                    return false;
                }
                cqk c = ((nkk) this).c();
                if (pkkVar instanceof okk) {
                    c4xVar = ((okk) pkkVar).b;
                } else {
                    if (!(pkkVar instanceof nkk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((nkk) pkkVar).c();
                }
                return c.a(c4xVar instanceof cqk ? (cqk) c4xVar : null, rvoVar, rvoVar2);
            }
            if (pkkVar instanceof okk) {
                c4xVar2 = ((okk) pkkVar).b;
            } else {
                if (!(pkkVar instanceof nkk)) {
                    w511.b();
                    return false;
                }
                c4xVar2 = ((nkk) pkkVar).c();
            }
            if ((c4xVar2 instanceof duk ? (duk) c4xVar2 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        int b;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof okk) {
            duk dukVar = ((okk) this).b;
            Integer num2 = dukVar.a;
            if (num2 != null) {
                b = num2.intValue();
            } else {
                int hashCode2 = qoi0.a(duk.class).hashCode();
                dukVar.a = Integer.valueOf(hashCode2);
                b = hashCode2;
            }
        } else {
            if (!(this instanceof nkk)) {
                w511.b();
                return 0;
            }
            b = ((nkk) this).c().b();
        }
        int i = hashCode + b;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((qkk) ft6.b.E2.getValue()).b(ft6.a, this);
    }
}
