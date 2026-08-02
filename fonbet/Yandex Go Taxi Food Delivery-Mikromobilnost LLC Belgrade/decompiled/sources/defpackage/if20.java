package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class if20 implements lf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final List e;

    public if20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, List list) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = list;
    }

    public static if20 d(if20 if20Var, ArrayList arrayList) {
        String str = if20Var.a;
        eic0 eic0Var = if20Var.b;
        pfe pfeVar = if20Var.c;
        p151 p151Var = if20Var.d;
        if20Var.getClass();
        return new if20(str, eic0Var, pfeVar, p151Var, arrayList);
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof if20)) {
            return false;
        }
        if20 if20Var = (if20) eg20Var;
        List list = if20Var.e;
        if (!jl40.l(this.d, if20Var.d)) {
            return false;
        }
        List list2 = this.e;
        if (list2.size() != list.size()) {
            return false;
        }
        Iterable e = scc.e(list2);
        if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
            return true;
        }
        c6w it = e.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (!((eg20) list2.get(nextInt)).a((eg20) list.get(nextInt))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lf20
    public final List b() {
        return this.e;
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if20)) {
            return false;
        }
        if20 if20Var = (if20) obj;
        return jl40.l(this.a, if20Var.a) && jl40.l(this.b, if20Var.b) && jl40.l(this.c, if20Var.c) && jl40.l(this.d, if20Var.d) && jl40.l(this.e, if20Var.e);
    }

    @Override // defpackage.eg20
    public final eic0 getAction() {
        return this.b;
    }

    @Override // defpackage.eg20
    public final pfe getContentDescription() {
        return this.c;
    }

    @Override // defpackage.eg20
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eic0 eic0Var = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eic0Var == null ? 0 : eic0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxGroupMicroWidgetModel(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", widgetDisplaySettings=");
        sb.append(this.d);
        sb.append(", microWidgetModels=");
        return unr0.t(sb, this.e, ')');
    }
}
