package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o051 implements z051 {
    public final bze a;

    public o051(bze bzeVar) {
        this.a = bzeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o051) && jl40.l(this.a, ((o051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CounterArrowButton(button=" + this.a + Extension.C_BRAKE;
    }
}
