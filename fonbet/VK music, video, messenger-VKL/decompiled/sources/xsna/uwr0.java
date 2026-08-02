package xsna;

import java.util.List;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class uwr0 extends bwr0 {
    public final List<String> a;
    public final boolean b;

    public uwr0(List<String> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final List<String> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwr0)) {
            return false;
        }
        uwr0 uwr0Var = (uwr0) obj;
        return epx.f(this.a, uwr0Var.a) && this.b == uwr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoActionClipsShowLess(blockIdsToHide=");
        sb.append(this.a);
        sb.append(", isNotInterested=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
