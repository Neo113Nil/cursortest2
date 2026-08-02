package defpackage;

import com.ybsdk.widgets.common.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pps extends qps {
    public final d a;

    public pps(d dVar) {
        this.a = dVar;
    }

    public final d a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pps) && this.a.equals(((pps) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(status=" + this.a + Extension.C_BRAKE;
    }
}
