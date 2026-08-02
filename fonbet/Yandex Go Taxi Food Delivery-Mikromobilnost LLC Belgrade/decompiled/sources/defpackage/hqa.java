package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hqa implements kqa {
    public final b a;

    public hqa(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqa) && jl40.l(this.a, ((hqa) obj).a);
    }

    public final int hashCode() {
        b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "ReturnCharger(backendArgsAsIs=" + this.a + Extension.C_BRAKE;
    }

    public hqa() {
        this(null);
    }
}
