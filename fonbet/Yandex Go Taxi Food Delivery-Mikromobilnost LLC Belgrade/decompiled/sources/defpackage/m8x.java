package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m8x {
    public final Map a;

    public m8x() {
        this(b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8x) && jl40.l(this.a, ((m8x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("JobExecuteRequest(inputData=", Extension.C_BRAKE, this.a);
    }

    public m8x(Map map) {
        this.a = map;
    }
}
