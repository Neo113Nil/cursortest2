package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class dzb0 {
    public final k8c a;
    public final m8c b;

    public dzb0(k8c k8cVar, m8c m8cVar) {
        this.a = k8cVar;
        this.b = m8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dzb0) {
            dzb0 dzb0Var = (dzb0) obj;
            if (this.a == dzb0Var.a && this.b.equals(dzb0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FrameSnapshot(camera=" + this.a + ", mapWindow=" + this.b + Extension.C_BRAKE;
    }
}
