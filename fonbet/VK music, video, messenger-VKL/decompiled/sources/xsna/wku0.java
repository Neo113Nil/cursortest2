package xsna;

/* compiled from: VkClientAccountChangedSnackBarInfo.kt */
/* loaded from: classes3.dex */
public final class wku0 {
    public final String a;
    public final String b;
    public final boolean c;

    public wku0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 1;
        if (this != obj) {
            if (!(obj instanceof wku0)) {
                return false;
            }
            wku0 wku0Var = (wku0) obj;
            if (!epx.f(this.a, wku0Var.a) || !epx.f(this.b, wku0Var.b) || this.c != wku0Var.c || !obj2.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 961, this.c);
        Integer num = 1;
        return num.hashCode() + b;
    }

    public final String toString() {
        return "VkClientAccountChangedSnackBarInfo(name=" + this.a + ", avatarUrl=" + this.b + ", isAvatarNft=" + this.c + ", bottomMargin=null, gravity=" + ((Object) 1) + ')';
    }
}
