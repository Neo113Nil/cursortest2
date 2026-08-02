package xsna;

/* compiled from: StaticAdsUIEventExternal.kt */
/* loaded from: classes17.dex */
public final class oxk0 {
    public final String a;

    public oxk0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxk0) && epx.f(this.a, ((oxk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NotInterestedClicked(adUniqueKey="), this.a, ')');
    }
}
