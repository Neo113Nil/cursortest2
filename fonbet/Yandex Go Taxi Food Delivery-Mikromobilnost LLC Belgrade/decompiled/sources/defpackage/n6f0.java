package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class n6f0 implements tt11 {
    public final int a;

    public n6f0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6f0) && this.a == ((n6f0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ProcessingState(titleRes=", Extension.C_BRAKE);
    }

    public n6f0() {
        this((Object) null);
    }

    public /* synthetic */ n6f0(Object obj) {
        this(kzh0.ebssdk_processing_tv_text);
    }
}
