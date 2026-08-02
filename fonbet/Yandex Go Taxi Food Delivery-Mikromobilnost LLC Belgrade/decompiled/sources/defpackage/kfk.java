package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class kfk implements c4x {
    public Integer a;

    public final boolean a(kfk kfkVar, rvo rvoVar, rvo rvoVar2) {
        if (kfkVar == null) {
            return false;
        }
        if (this instanceof gfk) {
            gfk gfkVar = (gfk) this;
            Object c = kfkVar.c();
            return gfkVar.b.a(c instanceof vyk ? (vyk) c : null, rvoVar, rvoVar2);
        }
        if (this instanceof ifk) {
            ifk ifkVar = (ifk) this;
            Object c2 = kfkVar.c();
            return ifkVar.b.a(c2 instanceof k5l ? (k5l) c2 : null, rvoVar, rvoVar2);
        }
        if (this instanceof ffk) {
            ffk ffkVar = (ffk) this;
            Object c3 = kfkVar.c();
            return ffkVar.b.a(c3 instanceof rsk ? (rsk) c3 : null, rvoVar, rvoVar2);
        }
        if (this instanceof jfk) {
            jfk jfkVar = (jfk) this;
            Object c4 = kfkVar.c();
            wal walVar = c4 instanceof wal ? (wal) c4 : null;
            return walVar != null && ((Number) jfkVar.b.a.a(rvoVar)).intValue() == ((Number) walVar.a.a(rvoVar2)).intValue();
        }
        if (!(this instanceof hfk)) {
            w511.b();
            return false;
        }
        d0l d = ((hfk) this).d();
        Object c5 = kfkVar.c();
        return d.a(c5 instanceof d0l ? (d0l) c5 : null, rvoVar, rvoVar2);
    }

    public final int b() {
        int b;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof gfk) {
            b = ((gfk) this).b.b();
        } else if (this instanceof ifk) {
            b = ((ifk) this).b.b();
        } else if (this instanceof ffk) {
            b = ((ffk) this).b.b();
        } else if (this instanceof jfk) {
            b = ((jfk) this).b.a();
        } else {
            if (!(this instanceof hfk)) {
                w511.b();
                return 0;
            }
            b = ((hfk) this).d().b();
        }
        int i = hashCode + b;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof gfk) {
            return ((gfk) this).b;
        }
        if (this instanceof ifk) {
            return ((ifk) this).b;
        }
        if (this instanceof ffk) {
            return ((ffk) this).b;
        }
        if (this instanceof jfk) {
            return ((jfk) this).b;
        }
        if (this instanceof hfk) {
            return ((hfk) this).d();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((nfk) ft6.b.O1.getValue()).b(ft6.a, this);
    }
}
