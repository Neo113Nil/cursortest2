package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.cjk;
import defpackage.djk;
import defpackage.ft6;
import defpackage.jl40;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.scc;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivCollectionItemBuilder implements c4x {
    public final Expression a;
    public final String b;
    public final List c;
    public Integer d;

    public DivCollectionItemBuilder(Expression expression, String str, List list) {
        this.a = expression;
        this.b = str;
        this.c = list;
    }

    public final boolean a(DivCollectionItemBuilder divCollectionItemBuilder, rvo rvoVar, rvo rvoVar2) {
        if (divCollectionItemBuilder != null && jl40.l(this.a.a(rvoVar), divCollectionItemBuilder.a.a(rvoVar2)) && this.b.equals(divCollectionItemBuilder.b)) {
            List list = divCollectionItemBuilder.c;
            List list2 = this.c;
            if (list2.size() == list.size()) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    if (((cjk) obj).a((cjk) list.get(i), rvoVar, rvoVar2)) {
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(DivCollectionItemBuilder.class).hashCode();
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cjk) it.next()).b();
        }
        int i2 = hashCode + i;
        this.d = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((djk) ft6.b.m2.getValue()).b(ft6.a, this);
    }
}
