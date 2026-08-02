package xsna;

/* compiled from: UserProfileState.kt */
/* loaded from: classes5.dex */
public final class sdx {
    public final boolean a;
    public final kkq0 b;

    public sdx(boolean z, kkq0 kkq0Var) {
        this.a = z;
        this.b = kkq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdx)) {
            return false;
        }
        sdx sdxVar = (sdx) obj;
        return this.a == sdxVar.a && epx.f(this.b, sdxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InterestingStoriesBlock(show=" + this.a + ", interestingStories=" + this.b + ')';
    }
}
