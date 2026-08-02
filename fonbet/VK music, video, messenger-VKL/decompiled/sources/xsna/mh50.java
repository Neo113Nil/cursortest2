package xsna;

import android.graphics.Rect;
import java.util.SortedSet;

/* compiled from: MutablePostsSnapshot.kt */
/* loaded from: classes14.dex */
public final class mh50 implements pwc0 {
    public final Rect a;
    public final lh50 b = new lh50();
    public final bpn0 c = new bpn0(new vv20(this, 5));

    public mh50(Rect rect) {
        this.a = rect;
    }

    @Override // xsna.pwc0
    public final Rect b() {
        return this.a;
    }

    @Override // xsna.pwc0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SortedSet<kh50> a() {
        return (SortedSet) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh50) && epx.f(this.a, ((mh50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return yq.c(new StringBuilder("MutablePostsSnapshot(globalVisibilityRect="), this.a, ')');
    }
}
