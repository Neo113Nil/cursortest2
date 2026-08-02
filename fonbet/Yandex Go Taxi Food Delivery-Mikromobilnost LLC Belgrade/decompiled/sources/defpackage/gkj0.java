package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gkj0 implements ikj0 {
    public final pvi0 a;
    public final Integer b;

    public gkj0(pvi0 pvi0Var, Integer num) {
        this.a = pvi0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkj0)) {
            return false;
        }
        gkj0 gkj0Var = (gkj0) obj;
        return this.a.equals(gkj0Var.a) && jl40.l(this.b, gkj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ImageUiState(image=" + this.a + ", fallbackImageRes=" + this.b + Extension.C_BRAKE;
    }
}
