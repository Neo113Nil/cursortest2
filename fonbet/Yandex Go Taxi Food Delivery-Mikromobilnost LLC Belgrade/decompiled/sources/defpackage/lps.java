package defpackage;

import com.ybsdk.widgets.common.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lps extends nps {
    public final c a;

    public lps(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lps) && this.a.equals(((lps) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FullScreen(state=" + this.a + Extension.C_BRAKE;
    }
}
