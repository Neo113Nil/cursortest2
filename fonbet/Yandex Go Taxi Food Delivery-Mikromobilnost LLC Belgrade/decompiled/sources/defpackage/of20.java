package defpackage;

/* loaded from: classes2.dex */
public final class of20 implements tf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final qf20 e;

    public of20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, qf20 qf20Var) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = qf20Var;
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof of20)) {
            return false;
        }
        of20 of20Var = (of20) eg20Var;
        return jl40.l(this.d, of20Var.d) && this.e.equals(of20Var.e);
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of20)) {
            return false;
        }
        of20 of20Var = (of20) obj;
        return jl40.l(this.a, of20Var.a) && jl40.l(this.b, of20Var.b) && jl40.l(this.c, of20Var.c) && jl40.l(this.d, of20Var.d) && this.e.equals(of20Var.e);
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
        return "IconMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", contentDescription=" + this.c + ", widgetDisplaySettings=" + this.d + ", icon=" + this.e + ')';
    }
}
