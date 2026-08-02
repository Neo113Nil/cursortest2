package com.yandex.div2;

import defpackage.bik;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.gik;
import defpackage.hik;
import defpackage.iik;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.w511;
import defpackage.whk;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DivChangeTransition implements c4x {
    public Integer a;

    public final boolean a(DivChangeTransition divChangeTransition, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (divChangeTransition == null) {
            return false;
        }
        if (this instanceof hik) {
            bik c = ((hik) this).c();
            if (divChangeTransition instanceof hik) {
                c4xVar2 = ((hik) divChangeTransition).c();
            } else {
                if (!(divChangeTransition instanceof gik)) {
                    w511.b();
                    return false;
                }
                c4xVar2 = ((gik) divChangeTransition).c();
            }
            return c.a(c4xVar2 instanceof bik ? (bik) c4xVar2 : null, rvoVar, rvoVar2);
        }
        if (!(this instanceof gik)) {
            w511.b();
            return false;
        }
        whk c2 = ((gik) this).c();
        if (divChangeTransition instanceof hik) {
            c4xVar = ((hik) divChangeTransition).c();
        } else {
            if (!(divChangeTransition instanceof gik)) {
                w511.b();
                return false;
            }
            c4xVar = ((gik) divChangeTransition).c();
        }
        return c2.a(c4xVar instanceof whk ? (whk) c4xVar : null, rvoVar, rvoVar2);
    }

    public final int b() {
        int e;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof hik) {
            e = ((hik) this).c().b();
        } else {
            if (!(this instanceof gik)) {
                w511.b();
                return 0;
            }
            e = ((gik) this).c().e();
        }
        int i = hashCode + e;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((iik) ft6.b.d2.getValue()).b(ft6.a, this);
    }
}
