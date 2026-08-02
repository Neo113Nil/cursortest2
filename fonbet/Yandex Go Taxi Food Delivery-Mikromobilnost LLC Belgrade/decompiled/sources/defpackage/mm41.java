package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mm41 {
    public final String a;
    public final String b;
    public final String c;

    public mm41(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = vuu0.c("\n            window.__quarkCommandExecutor.executeCommand(\n                " + JSONObject.quote(str) + ",\n                " + JSONObject.quote(str2) + "\n            );\n        ");
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm41)) {
            return false;
        }
        mm41 mm41Var = (mm41) obj;
        return jl40.l(this.a, mm41Var.a) && jl40.l(this.b, mm41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("RawCommand(type=", this.a, ", payload=", this.b, Extension.C_BRAKE);
    }
}
