package xsna;

import com.vk.newsfeed.common.views.fave.FaveAllEmptyState;

/* compiled from: FavePostsViewState.kt */
/* loaded from: classes4.dex */
public final class xnq {
    public final boolean a;
    public final boolean b;
    public final FaveAllEmptyState c;

    public xnq(boolean z, boolean z2, FaveAllEmptyState faveAllEmptyState) {
        this.a = z;
        this.b = z2;
        this.c = faveAllEmptyState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnq)) {
            return false;
        }
        xnq xnqVar = (xnq) obj;
        return this.a == xnqVar.a && this.b == xnqVar.b && this.c == xnqVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "FaveEmptyState(isEmptyViewVisible=" + this.a + ", isEmptyAllViewVisible=" + this.b + ", state=" + this.c + ')';
    }
}
