package defpackage;

import java.util.List;

/* loaded from: classes8.dex */
public interface lmw0 {
    idj0 a();

    default boolean b() {
        if (this instanceof fmw0) {
            return !(((fmw0) this).h instanceof h1b0);
        }
        if (this instanceof gmw0) {
            return !(((gmw0) this).p instanceof h1b0);
        }
        if (this instanceof hmw0) {
            return !(((hmw0) this).p instanceof h1b0);
        }
        if (this instanceof kmw0) {
            return false;
        }
        w511.b();
        return false;
    }

    default String c() {
        if (this instanceof fmw0) {
            return ((fmw0) this).i;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).q;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).q;
        }
        if (this instanceof kmw0) {
            return ((kmw0) this).h.c;
        }
        w511.b();
        return null;
    }

    default tej0 d() {
        if (this instanceof kmw0) {
            return null;
        }
        if (this instanceof fmw0) {
            return ((fmw0) this).l;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).v;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).u;
        }
        w511.b();
        return null;
    }

    default String e() {
        if (this instanceof fmw0) {
            return ((fmw0) this).j;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).r;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).r;
        }
        if (this instanceof kmw0) {
            return null;
        }
        w511.b();
        return null;
    }

    default boolean f() {
        if ((this instanceof kmw0) || (this instanceof fmw0)) {
            return false;
        }
        if (this instanceof jmw0) {
            return ((jmw0) this).m();
        }
        w511.b();
        return false;
    }

    default String g() {
        if (this instanceof fmw0) {
            return ((fmw0) this).k;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).u;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).t;
        }
        if (this instanceof kmw0) {
            return null;
        }
        w511.b();
        return null;
    }

    String getDescription();

    String getLabel();

    String getName();

    List h();

    default k1b0 i() {
        if (this instanceof fmw0) {
            return ((fmw0) this).h;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).p;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).p;
        }
        if (this instanceof kmw0) {
            return h1b0.a;
        }
        w511.b();
        return null;
    }

    default gbj0 j() {
        if (this instanceof kmw0) {
            return null;
        }
        if (this instanceof fmw0) {
            return ((fmw0) this).o;
        }
        if (this instanceof gmw0) {
            return ((gmw0) this).y;
        }
        if (this instanceof hmw0) {
            return ((hmw0) this).x;
        }
        w511.b();
        return null;
    }

    default boolean k(String str) {
        if (h().isEmpty()) {
            return true;
        }
        return h().contains(str);
    }

    koj0 l();
}
