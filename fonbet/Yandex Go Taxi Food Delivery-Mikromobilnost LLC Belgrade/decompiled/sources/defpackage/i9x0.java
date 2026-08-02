package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i9x0 implements r9x0 {
    public final Integer a;

    public i9x0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9x0) && jl40.l(this.a, ((i9x0) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "OpenRouteDetailsAction(pointIndex=" + this.a + Extension.C_BRAKE;
    }
}
