package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.ui.n;

/* loaded from: classes4.dex */
public final class lt8 implements mt8 {
    public final n a;
    public final qhb0 b;

    public lt8(n nVar, qhb0 qhb0Var) {
        this.a = nVar;
        this.b = qhb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lt8) {
            lt8 lt8Var = (lt8) obj;
            if (this.a == lt8Var.a && jl40.l(this.b, lt8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Visible(delegate=" + this.a + ", photoState=" + this.b + Extension.C_BRAKE;
    }
}
