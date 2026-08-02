package xsna;

/* compiled from: AvatarInfo.kt */
/* loaded from: classes18.dex */
public final class sr5 {
    public final String a;
    public final String b;
    public final boolean c;

    public sr5(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr5)) {
            return false;
        }
        sr5 sr5Var = (sr5) obj;
        return epx.f(this.a, sr5Var.a) && epx.f(this.b, sr5Var.b) && this.c == sr5Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarInfo(name=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", isAvatarNft=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
