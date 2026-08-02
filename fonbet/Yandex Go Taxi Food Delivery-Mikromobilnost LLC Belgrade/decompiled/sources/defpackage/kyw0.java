package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class kyw0 implements zb5 {
    public final String a;
    public final zn70 b;
    public final i501 c;

    public kyw0(String str, zn70 zn70Var, i501 i501Var) {
        this.a = str;
        this.b = zn70Var;
        this.c = i501Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyw0)) {
            return false;
        }
        kyw0 kyw0Var = (kyw0) obj;
        return jl40.l(this.a, kyw0Var.a) && jl40.l(this.b, kyw0Var.b) && jl40.l(this.c, kyw0Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.zb5
    public final zn70 l() {
        return this.b;
    }

    public final String toString() {
        return "SwipeableTrackingCardItemUiState(id=" + this.a + ", card=" + this.b + ", swipeBehaviour=" + this.c + Extension.C_BRAKE;
    }
}
