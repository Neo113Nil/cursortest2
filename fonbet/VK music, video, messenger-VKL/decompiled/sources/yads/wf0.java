package yads;

/* loaded from: classes10.dex */
public final class wf0 {
    public final String a;
    public final String b;
    public final String c;

    public wf0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf0.class == obj.getClass()) {
            wf0 wf0Var = (wf0) obj;
            if (mc3.a(this.a, wf0Var.a) && mc3.a(this.b, wf0Var.b) && mc3.a(this.c, wf0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
