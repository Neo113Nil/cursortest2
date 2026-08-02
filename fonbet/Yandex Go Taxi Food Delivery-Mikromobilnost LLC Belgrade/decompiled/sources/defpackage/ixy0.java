package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class ixy0 {
    public final k7v a;
    public final k7v b;

    public ixy0(k7v k7vVar, k7v k7vVar2) {
        this.a = k7vVar;
        this.b = k7vVar2;
    }

    public final k7v a(ThemeType themeType) {
        int i = hxy0.a[themeType.ordinal()];
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.b;
        }
        w511.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixy0)) {
            return false;
        }
        ixy0 ixy0Var = (ixy0) obj;
        return jl40.l(this.a, ixy0Var.a) && jl40.l(this.b, ixy0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k7v k7vVar = this.b;
        return hashCode + (k7vVar == null ? 0 : k7vVar.hashCode());
    }

    public final String toString() {
        return "ThemedImage(light=" + this.a + ", dark=" + this.b + Extension.C_BRAKE;
    }
}
