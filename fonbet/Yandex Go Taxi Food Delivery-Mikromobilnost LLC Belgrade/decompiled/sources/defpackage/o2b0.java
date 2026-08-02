package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o2b0 extends na implements siv, Collection, xfx {
    public static final o2b0 w;
    public final Object a;
    public final Object b;
    public final b2b0 c;

    static {
        kl40 kl40Var = kl40.y;
        w = new o2b0(kl40Var, kl40Var, b2b0.c);
    }

    public o2b0(Object obj, Object obj2, b2b0 b2b0Var) {
        this.a = obj;
        this.b = obj2;
        this.c = b2b0Var;
    }

    public final o2b0 a(Object obj) {
        b2b0 b2b0Var = this.c;
        if (b2b0Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new o2b0(obj, obj, b2b0Var.c(obj, new bqy()));
        }
        Object obj2 = this.b;
        return new o2b0(this.a, obj, b2b0Var.c(obj2, new bqy(((bqy) b2b0Var.get(obj2)).a, obj)).c(obj, new bqy(obj2)));
    }

    public final o2b0 b(Object obj) {
        b2b0 b2b0Var = this.c;
        bqy bqyVar = (bqy) b2b0Var.get(obj);
        if (bqyVar == null) {
            return this;
        }
        Object obj2 = bqyVar.a;
        Object obj3 = bqyVar.b;
        ce11 ce11Var = b2b0Var.a;
        ce11 v = ce11Var.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (ce11Var != v) {
            b2b0Var = v == null ? b2b0.c : new b2b0(v, b2b0Var.b - 1);
        }
        kl40 kl40Var = kl40.y;
        if (obj2 != kl40Var) {
            b2b0Var = b2b0Var.c(obj2, new bqy(((bqy) b2b0Var.get(obj2)).a, obj3));
        }
        if (obj3 != kl40Var) {
            b2b0Var = b2b0Var.c(obj3, new bqy(obj2, ((bqy) b2b0Var.get(obj3)).b));
        }
        Object obj4 = obj2 != kl40Var ? this.a : obj3;
        if (obj3 != kl40Var) {
            obj2 = this.b;
        }
        return new o2b0(obj4, obj2, b2b0Var);
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.z6
    public final int getSize() {
        b2b0 b2b0Var = this.c;
        b2b0Var.getClass();
        return b2b0Var.b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new q2b0(this.a, this.c);
    }
}
