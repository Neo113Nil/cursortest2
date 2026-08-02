package xsna;

/* compiled from: UploadServer.kt */
/* loaded from: classes2.dex */
public final class ocq0 {
    public final String a;
    public final String b;

    public ocq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocq0)) {
            return false;
        }
        ocq0 ocq0Var = (ocq0) obj;
        return epx.f(this.a, ocq0Var.a) && epx.f(this.b, ocq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadServer(uploadUrl=");
        sb.append(this.a);
        sb.append(", fallbackUploadUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
