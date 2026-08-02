package defpackage;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class mc90 extends d6z {
    public final String f;
    public final zme g;
    public final boolean h;

    public mc90(String str, zme zmeVar, boolean z) {
        Objects.requireNonNull(str, "name == null");
        this.f = str;
        this.g = zmeVar;
        this.h = z;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        String str;
        if (obj == null || (str = (String) this.g.l(obj)) == null) {
            return;
        }
        l3s l3sVar = q5j0Var.j;
        String str2 = this.f;
        if (this.h) {
            l3sVar.b(str2, str);
        } else {
            l3sVar.a(str2, str);
        }
    }
}
