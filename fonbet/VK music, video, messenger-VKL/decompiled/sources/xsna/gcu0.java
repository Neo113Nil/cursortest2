package xsna;

/* compiled from: VkAuthHashes.kt */
/* loaded from: classes6.dex */
public final class gcu0 {
    public final String a;

    public gcu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcu0) && epx.f(this.a, ((gcu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VkAuthHashes(nonce="), this.a, ')');
    }
}
