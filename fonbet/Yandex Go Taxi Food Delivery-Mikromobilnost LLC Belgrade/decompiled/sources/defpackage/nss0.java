package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes13.dex */
public final class nss0 implements tss0 {
    public final UiStateDrawableWrapper a;
    public final String b;
    public final nqs0 c;

    public nss0(UiStateDrawableWrapper uiStateDrawableWrapper, String str, nqs0 nqs0Var) {
        this.a = uiStateDrawableWrapper;
        this.b = str;
        this.c = nqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nss0)) {
            return false;
        }
        nss0 nss0Var = (nss0) obj;
        return this.a.equals(nss0Var.a) && jl40.l(this.b, nss0Var.b) && jl40.l(this.c, nss0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Icon(drawable=" + this.a + ", description=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }
}
