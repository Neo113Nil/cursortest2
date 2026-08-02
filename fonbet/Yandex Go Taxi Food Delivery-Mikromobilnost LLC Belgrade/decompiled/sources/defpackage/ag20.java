package defpackage;

/* loaded from: classes2.dex */
public final class ag20 implements tf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final cg20 e;
    public final tkj f;

    public ag20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, cg20 cg20Var, skj skjVar) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = cg20Var;
        this.f = skjVar;
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof ag20)) {
            return false;
        }
        ag20 ag20Var = (ag20) eg20Var;
        return jl40.l(this.d, ag20Var.d) && jl40.l(this.e, ag20Var.e) && jl40.l(this.f, ag20Var.f);
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final cg20 d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag20)) {
            return false;
        }
        ag20 ag20Var = (ag20) obj;
        return jl40.l(this.a, ag20Var.a) && jl40.l(this.b, ag20Var.b) && jl40.l(this.c, ag20Var.c) && jl40.l(this.d, ag20Var.d) && jl40.l(this.e, ag20Var.e) && jl40.l(this.f, ag20Var.f);
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
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eic0Var == null ? 0 : eic0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        tkj tkjVar = this.f;
        return hashCode2 + (tkjVar != null ? tkjVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", contentDescription=" + this.c + ", widgetDisplaySettings=" + this.d + ", text=" + this.e + ", lineHeight=" + this.f + ')';
    }
}
