package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class dig0 extends fig0 {
    public final String d;

    public dig0(String str) {
        super("web_command_executed", g8e.z("command", str));
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dig0) && jl40.l(this.d, ((dig0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return oyr.p("WebCommandExecutedEvent(command=", this.d, Extension.C_BRAKE);
    }
}
