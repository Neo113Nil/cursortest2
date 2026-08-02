package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h5a {
    public final String a;
    public final String b;
    public final b c;

    public h5a(String str, String str2, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5a)) {
            return false;
        }
        h5a h5aVar = (h5a) obj;
        return jl40.l(this.a, h5aVar.a) && jl40.l(this.b, h5aVar.b) && jl40.l(this.c, h5aVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return b + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Mode(id=", this.a, ", title=", this.b, ", layersAdditionalState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
