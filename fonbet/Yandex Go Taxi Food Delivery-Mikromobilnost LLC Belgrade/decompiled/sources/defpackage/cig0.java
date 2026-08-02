package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class cig0 extends fig0 {
    public final String d;

    public cig0(String str) {
        super("web_command_dropped", g8e.z("command", str));
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cig0) && jl40.l(this.d, ((cig0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return oyr.p("WebCommandDroppedEvent(command=", this.d, Extension.C_BRAKE);
    }
}
