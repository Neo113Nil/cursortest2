package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: OnStoriesEmptyEvent.kt */
/* loaded from: classes2.dex */
public final class yb80 extends sxp {
    public final UserId b;

    public yb80(UserId userId) {
        this.b = userId;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb80) && epx.f(this.b, ((yb80) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b) * 31;
    }

    public final String toString() {
        return "OnStoriesEmptyEvent(ownerId=" + this.b + ", changerTag=null)";
    }
}
