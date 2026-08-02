package xsna;

import xsna.d0a0;
import xsna.gqp0;

/* compiled from: PersistentCompositionLocalMap.kt */
/* loaded from: classes11.dex */
public final class ry90 extends wy90<lvi<Object>, xjr0<Object>> implements sy90 {
    public static final ry90 e = new ry90(gqp0.e, 0);

    /* compiled from: PersistentCompositionLocalMap.kt */
    public static final class a extends az90<lvi<Object>, xjr0<Object>> {
        public ry90 h;

        @Override // xsna.az90, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof lvi) {
                return super.containsKey((lvi) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof xjr0) {
                return super.containsValue((xjr0) obj);
            }
            return false;
        }

        @Override // xsna.az90
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final ry90 build() {
            Object obj = this.d;
            ry90 ry90Var = this.h;
            if (obj != ry90Var.b) {
                this.c = new d02();
                ry90Var = new ry90(this.d, getSize());
            }
            this.h = ry90Var;
            return ry90Var;
        }

        @Override // xsna.az90, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof lvi) {
                return (xjr0) super.get((lvi) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof lvi) ? obj2 : (xjr0) super.getOrDefault((lvi) obj, (xjr0) obj2);
        }

        @Override // xsna.az90, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof lvi) {
                return (xjr0) super.remove((lvi) obj);
            }
            return null;
        }
    }

    @Override // xsna.svi
    public final <T> T a(lvi<T> lviVar) {
        return (T) tvi.a(this, lviVar);
    }

    @Override // xsna.wy90, xsna.d0a0
    public final a builder() {
        a aVar = new a(this);
        aVar.h = this;
        return aVar;
    }

    @Override // xsna.wy90, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof lvi) {
            return super.containsKey((lvi) obj);
        }
        return false;
    }

    @Override // xsna.jf, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof xjr0) {
            return super.containsValue((xjr0) obj);
        }
        return false;
    }

    @Override // xsna.wy90
    /* renamed from: e */
    public final az90<lvi<Object>, xjr0<Object>> builder() {
        a aVar = new a(this);
        aVar.h = this;
        return aVar;
    }

    @Override // xsna.sy90
    public final ry90 f3(lvi lviVar, xjr0 xjr0Var) {
        gqp0.a u = this.b.u(lviVar, lviVar.hashCode(), 0, xjr0Var);
        return u == null ? this : new ry90(u.a, this.c + u.b);
    }

    @Override // xsna.wy90, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof lvi) {
            return (xjr0) super.get((lvi) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof lvi) ? obj2 : (xjr0) super.getOrDefault((lvi) obj, (xjr0) obj2);
    }

    @Override // xsna.wy90, xsna.d0a0
    public final d0a0.a builder() {
        a aVar = new a(this);
        aVar.h = this;
        return aVar;
    }
}
