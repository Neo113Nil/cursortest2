package defpackage;

import java.util.Objects;

/* loaded from: classes9.dex */
public final class oc90 extends d6z {
    public final /* synthetic */ int f;
    public final String g;
    public final zme h;
    public final boolean i;

    public oc90(String str, zme zmeVar, boolean z, int i) {
        this.f = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = zmeVar;
                this.i = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = zmeVar;
                this.i = z;
                break;
        }
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        String str;
        String str2;
        int i = this.f;
        boolean z = this.i;
        String str3 = this.g;
        zme zmeVar = this.h;
        switch (i) {
            case 0:
                if (obj != null && (str = (String) zmeVar.l(obj)) != null) {
                    q5j0Var.a(str3, str, z);
                    break;
                }
                break;
            default:
                if (obj != null && (str2 = (String) zmeVar.l(obj)) != null) {
                    q5j0Var.b(str3, str2, z);
                    break;
                }
                break;
        }
    }
}
