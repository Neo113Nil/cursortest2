package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class esc {
    public final boolean a;

    public esc(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esc) && this.a == ((esc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("CommunicationInteractionInfo(isUserTriggered=", Extension.C_BRAKE, this.a);
    }

    public /* synthetic */ esc(int i) {
        this(false);
    }

    public esc() {
        this(false);
    }
}
