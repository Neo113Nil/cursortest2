package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class aig0 extends fig0 {
    public final long d;

    public aig0(long j) {
        super("quark_js_script_loaded", gw00.e(new Pair("loading_time", Long.valueOf(j))));
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aig0) && this.d == ((aig0) obj).d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }

    public final String toString() {
        return qv10.k(this.d, "QuarkJsScriptLoadedEvent(loadingTime=", Extension.C_BRAKE);
    }
}
