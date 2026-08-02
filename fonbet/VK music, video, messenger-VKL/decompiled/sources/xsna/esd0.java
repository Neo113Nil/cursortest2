package xsna;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class esd0 extends vcr {
    public final int e;

    public esd0(int i) {
        super(13, null, null);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esd0) && this.e == ((esd0) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ProductSpacingFilterItem(heightDp="), this.e, ')');
    }
}
