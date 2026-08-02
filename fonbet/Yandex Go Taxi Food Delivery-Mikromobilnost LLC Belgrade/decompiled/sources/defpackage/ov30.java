package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ov30 implements pv30 {
    public final ne61 a;

    public ov30(ne61 ne61Var) {
        this.a = ne61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov30) && jl40.l(this.a, ((ov30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ZoomAction(zoomAction=" + this.a + Extension.C_BRAKE;
    }
}
