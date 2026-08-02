package xsna;

/* compiled from: VkMultiAccountSelectorContract.kt */
/* loaded from: classes15.dex */
public final class o5v0 {
    public final com.vk.superapp.multiaccount.api.f a;

    public o5v0(com.vk.superapp.multiaccount.api.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5v0) && epx.f(this.a, ((o5v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "State(data=" + this.a + ')';
    }
}
