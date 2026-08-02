package defpackage;

import flex.engine.model.DocumentErrorIssueType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class azl {
    public final String a;
    public final String b;
    public final DocumentErrorIssueType c;

    public azl(String str, String str2, DocumentErrorIssueType documentErrorIssueType) {
        this.a = str;
        this.b = str2;
        this.c = documentErrorIssueType;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!azl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        azl azlVar = (azl) obj;
        return this.a.equals(azlVar.a) && jl40.l(this.b, azlVar.b) && this.c == azlVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DocumentError(type='", this.a, "', message='", this.b, "', issueType=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
