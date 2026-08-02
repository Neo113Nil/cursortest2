package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class eig0 extends fig0 {
    public final String d;

    public eig0(String str) {
        super("web_command_ignored", g8e.z("command", str));
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eig0) && jl40.l(this.d, ((eig0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return oyr.p("WebCommandIgnoredEvent(command=", this.d, Extension.C_BRAKE);
    }
}
