package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class iqy extends keo {
    public final String c;

    public iqy(String str) {
        super("list_action_execution_error", g8e.z(Constants.KEY_MESSAGE, str));
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqy) && jl40.l(this.c, ((iqy) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("ListActionExecutionError(message=", this.c, Extension.C_BRAKE);
    }
}
