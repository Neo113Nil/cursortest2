package xsna;

/* compiled from: PostRequestParams.kt */
/* loaded from: classes4.dex */
public final class z6c0 {
    public final boolean a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z6c0() {
        this(false, r0, r0, 7);
        String str = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c0)) {
            return false;
        }
        z6c0 z6c0Var = (z6c0) obj;
        return this.a == z6c0Var.a && epx.f(this.b, z6c0Var.b) && epx.f(this.c, z6c0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostRequestParams(isProfileWallOrCommunityWall=");
        sb.append(this.a);
        sb.append(", creationEntryPoint=");
        sb.append(this.b);
        sb.append(", navScreen=");
        return ho8.a(sb, this.c, ')');
    }

    public z6c0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ z6c0(boolean z, String str, String str2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
