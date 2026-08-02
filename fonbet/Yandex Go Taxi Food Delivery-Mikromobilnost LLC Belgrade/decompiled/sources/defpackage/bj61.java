package defpackage;

/* loaded from: classes11.dex */
public final class bj61 extends r7w {
    public final String a;
    public final Long b;

    public /* synthetic */ bj61(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // defpackage.r7w
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.r7w
    public final String c() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj != this) {
            if (obj instanceof r7w) {
                r7w r7wVar = (r7w) obj;
                if (this.a.equals(r7wVar.c()) && ((l = this.b) != null ? l.equals(r7wVar.b()) : r7wVar.b() == null)) {
                    z = true;
                    if (obj instanceof bj61) {
                        return z;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            if (obj instanceof bj61) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return ((l == null ? 0 : l.hashCode()) ^ (hashCode * 1000003)) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b).concat(", network=null").concat("}");
    }
}
