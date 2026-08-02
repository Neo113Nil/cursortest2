package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.h9l;
import defpackage.i9l;
import defpackage.j9l;
import defpackage.jl40;
import defpackage.k9l;
import defpackage.lql;
import defpackage.nzk;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.sqk;
import defpackage.t9l;
import defpackage.w511;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DivSize implements c4x {
    public Integer a;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(DivSize divSize, rvo rvoVar, rvo rvoVar2) {
        if (divSize != null) {
            if (this instanceof h9l) {
                h9l h9lVar = (h9l) this;
                Object c = divSize.c();
                return h9lVar.b.a(c instanceof sqk ? (sqk) c : null, rvoVar, rvoVar2);
            }
            if (this instanceof i9l) {
                i9l i9lVar = (i9l) this;
                Object c2 = divSize.c();
                nzk nzkVar = c2 instanceof nzk ? (nzk) c2 : null;
                if (nzkVar != null) {
                    nzk nzkVar2 = i9lVar.b;
                    t9l t9lVar = nzkVar2.a;
                    t9l t9lVar2 = nzkVar.a;
                    if (t9lVar != null ? t9lVar.a(t9lVar2, rvoVar, rvoVar2) : t9lVar2 == null) {
                        t9l t9lVar3 = nzkVar2.b;
                        t9l t9lVar4 = nzkVar.b;
                        if (t9lVar3 != null ? t9lVar3.a(t9lVar4, rvoVar, rvoVar2) : t9lVar4 == null) {
                            Expression expression = nzkVar2.c;
                            Double d = expression != null ? (Double) expression.a(rvoVar) : null;
                            Expression expression2 = nzkVar.c;
                            if (jl40.i(d, expression2 != null ? (Double) expression2.a(rvoVar2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                if (!(this instanceof j9l)) {
                    w511.b();
                    return false;
                }
                j9l j9lVar = (j9l) this;
                Object c3 = divSize.c();
                lql lqlVar = c3 instanceof lql ? (lql) c3 : null;
                if (lqlVar != null) {
                    lql lqlVar2 = j9lVar.b;
                    Expression expression3 = lqlVar2.a;
                    Boolean bool = expression3 != null ? (Boolean) expression3.a(rvoVar) : null;
                    Expression expression4 = lqlVar.a;
                    if (jl40.l(bool, expression4 != null ? (Boolean) expression4.a(rvoVar2) : null)) {
                        t9l t9lVar5 = lqlVar2.b;
                        t9l t9lVar6 = lqlVar.b;
                        if (t9lVar5 != null ? t9lVar5.a(t9lVar6, rvoVar, rvoVar2) : t9lVar6 == null) {
                            t9l t9lVar7 = lqlVar2.c;
                            t9l t9lVar8 = lqlVar.c;
                            if (t9lVar7 != null ? t9lVar7.a(t9lVar8, rvoVar, rvoVar2) : t9lVar8 == null) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int b;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof h9l) {
            intValue = ((h9l) this).b.b();
        } else {
            if (this instanceof i9l) {
                nzk nzkVar = ((i9l) this).b;
                Integer num2 = nzkVar.d;
                if (num2 != null) {
                    intValue = num2.intValue();
                } else {
                    int hashCode2 = qoi0.a(nzk.class).hashCode();
                    t9l t9lVar = nzkVar.a;
                    int b2 = hashCode2 + (t9lVar != null ? t9lVar.b() : 0);
                    t9l t9lVar2 = nzkVar.b;
                    int b3 = b2 + (t9lVar2 != null ? t9lVar2.b() : 0);
                    Expression expression = nzkVar.c;
                    b = b3 + (expression != null ? expression.hashCode() : 0);
                    nzkVar.d = Integer.valueOf(b);
                    intValue = b;
                }
            } else {
                if (!(this instanceof j9l)) {
                    w511.b();
                    return 0;
                }
                lql lqlVar = ((j9l) this).b;
                Integer num3 = lqlVar.d;
                if (num3 != null) {
                    intValue = num3.intValue();
                } else {
                    int hashCode3 = qoi0.a(lql.class).hashCode();
                    Expression expression2 = lqlVar.a;
                    int hashCode4 = hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
                    t9l t9lVar3 = lqlVar.b;
                    int b4 = hashCode4 + (t9lVar3 != null ? t9lVar3.b() : 0);
                    t9l t9lVar4 = lqlVar.c;
                    b = b4 + (t9lVar4 != null ? t9lVar4.b() : 0);
                    lqlVar.d = Integer.valueOf(b);
                    intValue = b;
                }
            }
        }
        int i = hashCode + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof h9l) {
            return ((h9l) this).b;
        }
        if (this instanceof i9l) {
            return ((i9l) this).b;
        }
        if (this instanceof j9l) {
            return ((j9l) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((k9l) ft6.b.o7.getValue()).b(ft6.a, this);
    }
}
