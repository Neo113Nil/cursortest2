package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c7a implements g7a {
    public final b a;

    public c7a(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7a) && jl40.l(this.a, ((c7a) obj).a);
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

    public c7a() {
        this(null);
    }
}
