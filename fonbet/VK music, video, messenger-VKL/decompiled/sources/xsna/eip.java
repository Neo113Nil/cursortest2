package xsna;

import com.vk.dto.newsfeed.WallGetMode;

/* compiled from: UserProfileWallViewMvi.kt */
/* loaded from: classes4.dex */
public final class eip {
    public final int a;
    public final boolean b;
    public final WallGetMode c;
    public final boolean d;
    public final boolean e;

    public eip(int i, boolean z, WallGetMode wallGetMode, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = wallGetMode;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eip)) {
            return false;
        }
        eip eipVar = (eip) obj;
        return this.a == eipVar.a && this.b == eipVar.b && this.c == eipVar.c && this.d == eipVar.d && this.e == eipVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyWallState(totalPostsCount=");
        sb.append(this.a);
        sb.append(", countPostsIsKnown=");
        sb.append(this.b);
        sb.append(", wallMode=");
        sb.append(this.c);
        sb.append(", isLoadingWall=");
        sb.append(this.d);
        sb.append(", isEmptyErrorVisible=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
