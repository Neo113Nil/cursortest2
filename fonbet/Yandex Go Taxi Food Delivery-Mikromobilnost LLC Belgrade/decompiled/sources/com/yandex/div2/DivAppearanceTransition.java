package com.yandex.div2;

import defpackage.c4x;
import defpackage.ft6;
import defpackage.hpk;
import defpackage.jek;
import defpackage.jnk;
import defpackage.oek;
import defpackage.pek;
import defpackage.q7l;
import defpackage.qek;
import defpackage.qoi0;
import defpackage.rek;
import defpackage.rvo;
import defpackage.scc;
import defpackage.sek;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DivAppearanceTransition implements c4x {
    public Integer a;

    public final boolean a(DivAppearanceTransition divAppearanceTransition, rvo rvoVar, rvo rvoVar2) {
        if (divAppearanceTransition != null) {
            if (this instanceof qek) {
                qek qekVar = (qek) this;
                Object c = divAppearanceTransition.c();
                jek jekVar = c instanceof jek ? (jek) c : null;
                if (jekVar != null) {
                    List list = qekVar.b.a;
                    List list2 = jekVar.a;
                    if (list.size() == list2.size()) {
                        int i = 0;
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            if (((DivAppearanceTransition) obj).a((DivAppearanceTransition) list2.get(i), rvoVar, rvoVar2)) {
                                i = i2;
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (this instanceof oek) {
                    oek oekVar = (oek) this;
                    Object c2 = divAppearanceTransition.c();
                    return oekVar.b.a(c2 instanceof hpk ? (hpk) c2 : null, rvoVar, rvoVar2);
                }
                if (this instanceof pek) {
                    q7l d = ((pek) this).d();
                    Object c3 = divAppearanceTransition.c();
                    return d.a(c3 instanceof q7l ? (q7l) c3 : null, rvoVar, rvoVar2);
                }
                if (!(this instanceof rek)) {
                    w511.b();
                    return false;
                }
                rek rekVar = (rek) this;
                Object c4 = divAppearanceTransition.c();
                DivSlideTransition divSlideTransition = c4 instanceof DivSlideTransition ? (DivSlideTransition) c4 : null;
                if (divSlideTransition != null) {
                    DivSlideTransition divSlideTransition2 = rekVar.b;
                    jnk jnkVar = divSlideTransition2.a;
                    jnk jnkVar2 = divSlideTransition.a;
                    if ((jnkVar != null ? jnkVar.a(jnkVar2, rvoVar, rvoVar2) : jnkVar2 == null) && ((Number) divSlideTransition2.b.a(rvoVar)).longValue() == ((Number) divSlideTransition.b.a(rvoVar2)).longValue() && divSlideTransition2.c.a(rvoVar) == divSlideTransition.c.a(rvoVar2) && divSlideTransition2.d.a(rvoVar) == divSlideTransition.d.a(rvoVar2) && ((Number) divSlideTransition2.e.a(rvoVar)).longValue() == ((Number) divSlideTransition.e.a(rvoVar2)).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int hashCode;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof qek) {
            jek jekVar = ((qek) this).b;
            Integer num2 = jekVar.c;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                Integer num3 = jekVar.b;
                if (num3 != null) {
                    hashCode = num3.intValue();
                } else {
                    hashCode = qoi0.a(jek.class).hashCode();
                    jekVar.b = Integer.valueOf(hashCode);
                }
                Iterator it = jekVar.a.iterator();
                while (it.hasNext()) {
                    r2 += ((DivAppearanceTransition) it.next()).b();
                }
                int i2 = r2 + hashCode;
                jekVar.c = Integer.valueOf(i2);
                i = i2;
            }
        } else if (this instanceof oek) {
            i = ((oek) this).b.b();
        } else if (this instanceof pek) {
            i = ((pek) this).d().e();
        } else {
            if (!(this instanceof rek)) {
                w511.b();
                return 0;
            }
            DivSlideTransition divSlideTransition = ((rek) this).b;
            Integer num4 = divSlideTransition.f;
            if (num4 != null) {
                i = num4.intValue();
            } else {
                int hashCode3 = qoi0.a(DivSlideTransition.class).hashCode();
                jnk jnkVar = divSlideTransition.a;
                int hashCode4 = divSlideTransition.e.hashCode() + divSlideTransition.d.hashCode() + divSlideTransition.c.hashCode() + divSlideTransition.b.hashCode() + hashCode3 + (jnkVar != null ? jnkVar.b() : 0);
                divSlideTransition.f = Integer.valueOf(hashCode4);
                i = hashCode4;
            }
        }
        int i3 = hashCode2 + i;
        this.a = Integer.valueOf(i3);
        return i3;
    }

    public final Object c() {
        if (this instanceof qek) {
            return ((qek) this).b;
        }
        if (this instanceof oek) {
            return ((oek) this).b;
        }
        if (this instanceof pek) {
            return ((pek) this).d();
        }
        if (this instanceof rek) {
            return ((rek) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((sek) ft6.b.I1.getValue()).b(ft6.a, this);
    }
}
