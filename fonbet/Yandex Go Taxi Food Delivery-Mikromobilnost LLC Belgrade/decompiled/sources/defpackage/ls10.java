package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ls10 {
    public final Map a;

    public /* synthetic */ ls10(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ls10) {
            return this.a.equals(((ls10) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("MessageCallbackData(data=", Extension.C_BRAKE, this.a);
    }
}
