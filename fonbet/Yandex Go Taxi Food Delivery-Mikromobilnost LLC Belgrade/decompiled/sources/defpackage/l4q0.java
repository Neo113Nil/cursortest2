package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.model.SectionTypedHeaderModel$AppearanceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l4q0 implements e6v, eeu {
    public final String a;
    public final g9s b;
    public final da5 c;
    public final String d;
    public final SectionTypedHeaderModel$AppearanceType e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;

    public l4q0(String str, g9s g9sVar, da5 da5Var, String str2, SectionTypedHeaderModel$AppearanceType sectionTypedHeaderModel$AppearanceType, Integer num, String str3, int i) {
        sectionTypedHeaderModel$AppearanceType = (i & 16) != 0 ? SectionTypedHeaderModel$AppearanceType.DEFAULT : sectionTypedHeaderModel$AppearanceType;
        num = (i & 32) != 0 ? null : num;
        str3 = (i & 128) != 0 ? "" : str3;
        String a = g9sVar.b.a();
        String str4 = a != null ? a : "";
        this.a = str;
        this.b = g9sVar;
        this.c = da5Var;
        this.d = str2;
        this.e = sectionTypedHeaderModel$AppearanceType;
        this.f = num;
        this.g = str;
        this.h = str3;
        this.i = str4;
    }

    @Override // defpackage.hx31
    public final String c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4q0)) {
            return false;
        }
        l4q0 l4q0Var = (l4q0) obj;
        return jl40.l(this.a, l4q0Var.a) && jl40.l(this.b, l4q0Var.b) && jl40.l(this.c, l4q0Var.c) && jl40.l(this.d, l4q0Var.d) && this.e == l4q0Var.e && jl40.l(this.f, l4q0Var.f) && jl40.l(this.g, l4q0Var.g) && jl40.l(this.h, l4q0Var.h) && jl40.l(this.i, l4q0Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31;
        Integer num = this.f;
        return this.i.hashCode() + unr0.b(unr0.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h);
    }

    @Override // defpackage.eeu
    public final String m() {
        return this.h;
    }

    @Override // defpackage.eeu
    public final String n() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionTypedHeaderModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtilte=");
        sb.append(this.c);
        sb.append(", iconTag=");
        sb.append(this.d);
        sb.append(", appearanceType=");
        sb.append(this.e);
        sb.append(", fallbackImageRes=");
        sb.append(this.f);
        sb.append(", viewId=");
        g8e.D(sb, this.g, ", headerShortcutId=", this.h, ", headerText=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
