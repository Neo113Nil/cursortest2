package xsna;

/* compiled from: ProfileServices.kt */
/* loaded from: classes5.dex */
public final class lzd0 {
    public final es a;
    public final ots b;
    public final u1r0 c;
    public final dz60 d;
    public final jgz e;
    public final avl0 f;
    public final max0 g;
    public final uft0 h;
    public final wlb0 i;
    public final wlb0 j;
    public final yf3 k;
    public final k15 l;

    public lzd0(es esVar, ots otsVar, u1r0 u1r0Var, dz60 dz60Var, jgz jgzVar, avl0 avl0Var, max0 max0Var, uft0 uft0Var, wlb0 wlb0Var, wlb0 wlb0Var2, yf3 yf3Var, k15 k15Var) {
        this.a = esVar;
        this.b = otsVar;
        this.c = u1r0Var;
        this.d = dz60Var;
        this.e = jgzVar;
        this.f = avl0Var;
        this.g = max0Var;
        this.h = uft0Var;
        this.i = wlb0Var;
        this.j = wlb0Var2;
        this.k = yf3Var;
        this.l = k15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd0)) {
            return false;
        }
        lzd0 lzd0Var = (lzd0) obj;
        return this.a.equals(lzd0Var.a) && this.b.equals(lzd0Var.b) && this.c.equals(lzd0Var.c) && this.d.equals(lzd0Var.d) && this.e.equals(lzd0Var.e) && this.f.equals(lzd0Var.f) && this.g.equals(lzd0Var.g) && this.h.equals(lzd0Var.h) && this.i.equals(lzd0Var.i) && this.j.equals(lzd0Var.j) && this.k.equals(lzd0Var.k) && this.l.equals(lzd0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileServices(accountService=" + this.a + ", friendsService=" + this.b + ", usersService=" + this.c + ", newsfeedService=" + this.d + ", bestFriendsService=" + this.e + ", storyService=" + this.f + ", wallService=" + this.g + ", videoService=" + this.h + ", giftsService=" + this.i + ", onboardingService=" + this.j + ", appsService=" + this.k + ", storiesProfileDiscoverService=" + this.l + ')';
    }
}
