package defpackage;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b94 extends v111 {
    public final String a;
    public final byte[] b;
    public final Priority c;

    public b94(String str, byte[] bArr, Priority priority) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }

    @Override // defpackage.v111
    public final String b() {
        return this.a;
    }

    @Override // defpackage.v111
    public final byte[] c() {
        return this.b;
    }

    @Override // defpackage.v111
    public final Priority d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v111)) {
            return false;
        }
        v111 v111Var = (v111) obj;
        if (this.a.equals(v111Var.b())) {
            return Arrays.equals(this.b, v111Var instanceof b94 ? ((b94) v111Var).b : v111Var.c()) && this.c.equals(v111Var.d());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
