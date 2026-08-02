package defpackage;

/* loaded from: classes2.dex */
public final class kf20 implements tf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final cg20 e;

    public kf20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, cg20 cg20Var) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = cg20Var;
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof kf20)) {
            return false;
        }
        kf20 kf20Var = (kf20) eg20Var;
        return jl40.l(this.d, kf20Var.d) && jl40.l(this.e, kf20Var.e);
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf20)) {
            return false;
        }
        kf20 kf20Var = (kf20) obj;
        return jl40.l(this.a, kf20Var.a) && jl40.l(this.b, kf20Var.b) && jl40.l(this.c, kf20Var.c) && jl40.l(this.d, kf20Var.d) && jl40.l(this.e, kf20Var.e);
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
        return "ButtonMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", contentDescription=" + this.c + ", widgetDisplaySettings=" + this.d + ", text=" + this.e + ')';
    }
}
