package xsna;

/* compiled from: ClipsInterestsPatch.kt */
/* loaded from: classes16.dex */
public final class lhe implements com.vk.clips.interests.impl.feature.b {
    public final Throwable b;

    public lhe(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhe) && epx.f(this.b, ((lhe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("InterestsError(th="), this.b, ')');
    }
}
