package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.b50;

/* loaded from: classes7.dex */
public final class jo61 {
    public final String a;
    public final String b;
    public final b50 c;

    public jo61(String str, String str2, b50 b50Var) {
        this.a = str;
        this.b = str2;
        this.c = b50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo61)) {
            return false;
        }
        jo61 jo61Var = (jo61) obj;
        return jl40.l(this.a, jo61Var.a) && jl40.l(this.b, jo61Var.b) && this.c == jo61Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAlertData(title=", this.a, ", message=", this.b, ", type=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
