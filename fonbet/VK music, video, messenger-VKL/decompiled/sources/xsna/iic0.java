package xsna;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class iic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final boolean b;

    public iic0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iic0) && this.b == ((iic0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("EnableAuthorSign(isEnabled="), this.b, ')');
    }
}
