package defpackage;

import com.squareup.wire.Message;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class oc41 implements pc41 {
    public final Message a;

    public oc41(Message message) {
        this.a = message;
    }

    public final Message a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc41) && jl40.l(this.a, ((oc41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ready(value=" + this.a + Extension.C_BRAKE;
    }
}
