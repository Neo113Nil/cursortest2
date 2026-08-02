package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class orn0 implements rrn0 {
    public final String a;

    public /* synthetic */ orn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof orn0) {
            return jl40.l(this.a, ((orn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ClickOnStartEntryPoint(promotionId=", this.a, Extension.C_BRAKE);
    }
}
