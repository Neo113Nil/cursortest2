package xsna;

/* compiled from: DialogsDeleteForAllFlagSetCmd.kt */
/* loaded from: classes2.dex */
public final class knm extends le6<Boolean> {
    public final boolean b;
    public final Object c;

    public knm(boolean z, Object obj) {
        this.b = z;
        this.c = obj;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        dnm d = w2wVar.I0().b().d();
        Boolean a = d.a();
        rey k = d.a.I0().k();
        boolean z = this.b;
        k.putBoolean("dialogs_delete_for_all_flag", z);
        if (!epx.f(a, Boolean.valueOf(z))) {
            w2wVar.e1(this, new u480(this.c, z));
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof knm) {
            return this.b == ((knm) obj).b;
        }
        return false;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return defpackage.q0.a(new StringBuilder("DialogsDeleteForAllFlagSetCmd(flag="), this.b, ')');
    }
}
