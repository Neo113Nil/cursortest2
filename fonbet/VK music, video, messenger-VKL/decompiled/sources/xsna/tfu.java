package xsna;

/* compiled from: LazyGridSpan.kt */
@vby
/* loaded from: classes11.dex */
public final class tfu {
    public final long a;

    public /* synthetic */ tfu(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tfu) {
            return this.a == ((tfu) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return q9k.d("GridItemSpan(packedValue=", this.a, ')');
    }
}
