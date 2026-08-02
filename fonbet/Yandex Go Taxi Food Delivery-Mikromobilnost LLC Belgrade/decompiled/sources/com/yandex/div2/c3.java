package com.yandex.div2;

import defpackage.anl;
import defpackage.b96;
import defpackage.bnl;
import defpackage.c4x;
import defpackage.dnl;
import defpackage.ehj;
import defpackage.fnl;
import defpackage.ft6;
import defpackage.hi21;
import defpackage.inl;
import defpackage.jl40;
import defpackage.knl;
import defpackage.l7w;
import defpackage.ptf0;
import defpackage.qoi0;
import defpackage.qqu0;
import defpackage.rhc;
import defpackage.rvo;
import defpackage.tn60;
import defpackage.v63;
import defpackage.w511;
import defpackage.wls;
import defpackage.wml;
import defpackage.xml;
import defpackage.yml;
import defpackage.zml;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c3 implements c4x {
    public static final wls b = null;
    public Integer a;

    public final boolean a(c3 c3Var, rvo rvoVar, rvo rvoVar2) {
        if (c3Var != null) {
            if (this instanceof fnl) {
                fnl fnlVar = (fnl) this;
                Object c = c3Var.c();
                qqu0 qqu0Var = c instanceof qqu0 ? (qqu0) c : null;
                if (qqu0Var != null) {
                    qqu0 qqu0Var2 = fnlVar.c;
                    if (jl40.l(qqu0Var2.a, qqu0Var.a) && jl40.l(qqu0Var2.b.a(rvoVar), qqu0Var.b.a(rvoVar2))) {
                        return true;
                    }
                }
            } else {
                if (this instanceof bnl) {
                    bnl bnlVar = (bnl) this;
                    Object c2 = c3Var.c();
                    return bnlVar.c.a(c2 instanceof tn60 ? (tn60) c2 : null, rvoVar, rvoVar2);
                }
                if (this instanceof anl) {
                    anl anlVar = (anl) this;
                    Object c3 = c3Var.c();
                    l7w l7wVar = c3 instanceof l7w ? (l7w) c3 : null;
                    if (l7wVar != null) {
                        l7w l7wVar2 = anlVar.c;
                        if (jl40.l(l7wVar2.a, l7wVar.a) && ((Number) l7wVar2.b.a(rvoVar)).longValue() == ((Number) l7wVar.b.a(rvoVar2)).longValue()) {
                            return true;
                        }
                    }
                } else {
                    if (!(this instanceof xml)) {
                        if (this instanceof yml) {
                            rhc d = ((yml) this).d();
                            Object c4 = c3Var.c();
                            return d.a(c4 instanceof rhc ? (rhc) c4 : null, rvoVar, rvoVar2);
                        }
                        if (this instanceof inl) {
                            hi21 d2 = ((inl) this).d();
                            Object c5 = c3Var.c();
                            return d2.a(c5 instanceof hi21 ? (hi21) c5 : null, rvoVar, rvoVar2);
                        }
                        if (this instanceof zml) {
                            ehj d3 = ((zml) this).d();
                            Object c6 = c3Var.c();
                            return d3.a(c6 instanceof ehj ? (ehj) c6 : null, rvoVar, rvoVar2);
                        }
                        if (this instanceof wml) {
                            v63 d4 = ((wml) this).d();
                            Object c7 = c3Var.c();
                            return d4.a(c7 instanceof v63 ? (v63) c7 : null, rvoVar, rvoVar2);
                        }
                        if (!(this instanceof dnl)) {
                            w511.b();
                            return false;
                        }
                        dnl dnlVar = (dnl) this;
                        Object c8 = c3Var.c();
                        return dnlVar.c.a(c8 instanceof ptf0 ? (ptf0) c8 : null, rvoVar, rvoVar2);
                    }
                    xml xmlVar = (xml) this;
                    Object c9 = c3Var.c();
                    b96 b96Var = c9 instanceof b96 ? (b96) c9 : null;
                    if (b96Var != null) {
                        b96 b96Var2 = xmlVar.c;
                        if (jl40.l(b96Var2.a, b96Var.a) && ((Boolean) b96Var2.b.a(rvoVar)).booleanValue() == ((Boolean) b96Var.b.a(rvoVar2)).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int b2;
        int hashCode;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof fnl) {
            qqu0 qqu0Var = ((fnl) this).c;
            Integer num2 = qqu0Var.c;
            if (num2 != null) {
                b2 = num2.intValue();
            } else {
                hashCode = qqu0Var.b.hashCode() + qqu0Var.a.hashCode() + qoi0.a(qqu0.class).hashCode();
                qqu0Var.c = Integer.valueOf(hashCode);
                b2 = hashCode;
            }
        } else if (this instanceof bnl) {
            b2 = ((bnl) this).c.b();
        } else if (this instanceof anl) {
            l7w l7wVar = ((anl) this).c;
            Integer num3 = l7wVar.c;
            if (num3 != null) {
                b2 = num3.intValue();
            } else {
                hashCode = l7wVar.b.hashCode() + l7wVar.a.hashCode() + qoi0.a(l7w.class).hashCode();
                l7wVar.c = Integer.valueOf(hashCode);
                b2 = hashCode;
            }
        } else if (this instanceof xml) {
            b96 b96Var = ((xml) this).c;
            Integer num4 = b96Var.c;
            if (num4 != null) {
                b2 = num4.intValue();
            } else {
                hashCode = b96Var.b.hashCode() + b96Var.a.hashCode() + qoi0.a(b96.class).hashCode();
                b96Var.c = Integer.valueOf(hashCode);
                b2 = hashCode;
            }
        } else if (this instanceof yml) {
            b2 = ((yml) this).d().b();
        } else if (this instanceof inl) {
            b2 = ((inl) this).d().b();
        } else if (this instanceof zml) {
            b2 = ((zml) this).d().b();
        } else if (this instanceof wml) {
            b2 = ((wml) this).d().b();
        } else {
            if (!(this instanceof dnl)) {
                w511.b();
                return 0;
            }
            b2 = ((dnl) this).c.b();
        }
        int i = hashCode2 + b2;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof fnl) {
            return ((fnl) this).c;
        }
        if (this instanceof bnl) {
            return ((bnl) this).c;
        }
        if (this instanceof anl) {
            return ((anl) this).c;
        }
        if (this instanceof xml) {
            return ((xml) this).c;
        }
        if (this instanceof yml) {
            return ((yml) this).d();
        }
        if (this instanceof inl) {
            return ((inl) this).d();
        }
        if (this instanceof zml) {
            return ((zml) this).d();
        }
        if (this instanceof wml) {
            return ((wml) this).d();
        }
        if (this instanceof dnl) {
            return ((dnl) this).c;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((knl) ft6.b.F9.getValue()).b(ft6.a, this);
    }
}
