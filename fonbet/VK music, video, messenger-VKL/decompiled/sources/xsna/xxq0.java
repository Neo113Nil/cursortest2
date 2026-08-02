package xsna;

import com.vk.dto.newsfeed.WallGetMode;
import xsna.is60;

/* compiled from: UserProfileWallViewState.kt */
/* loaded from: classes4.dex */
public final class xxq0 implements lm50 {
    public final WallGetMode b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final is60.a g;
    public final boolean h;
    public final boolean i;

    public xxq0(WallGetMode wallGetMode, int i, boolean z, int i2, int i3, is60.a aVar, boolean z2, boolean z3) {
        this.b = wallGetMode;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = aVar;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxq0)) {
            return false;
        }
        xxq0 xxq0Var = (xxq0) obj;
        return this.b == xxq0Var.b && this.c == xxq0Var.c && this.d == xxq0Var.d && this.e == xxq0Var.e && this.f == xxq0Var.f && epx.f(this.g, xxq0Var.g) && this.h == xxq0Var.h && this.i == xxq0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + shy.a(this.f, shy.a(this.e, qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31), 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileWallViewState(wallMode=");
        sb.append(this.b);
        sb.append(", totalPostsCount=");
        sb.append(this.c);
        sb.append(", countPostsIsKnown=");
        sb.append(this.d);
        sb.append(", postponedCount=");
        sb.append(this.e);
        sb.append(", draftsCount=");
        sb.append(this.f);
        sb.append(", listViewState=");
        sb.append(this.g);
        sb.append(", isEmptyErrorVisible=");
        sb.append(this.h);
        sb.append(", isLoadingWall=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
