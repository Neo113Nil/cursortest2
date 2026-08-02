package xsna;

import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;

/* compiled from: ClipsScreenInfo.kt */
/* loaded from: classes17.dex */
public final class h2f {
    public final ClipFeedScreenType a;
    public final boolean b;

    public h2f(ClipFeedScreenType clipFeedScreenType, boolean z) {
        this.a = clipFeedScreenType;
        this.b = z;
    }

    public final ClipFeedScreenType a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2f)) {
            return false;
        }
        h2f h2fVar = (h2f) obj;
        return this.a == h2fVar.a && this.b == h2fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsScreenInfo(screenType=");
        sb.append(this.a);
        sb.append(", isTablet=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
