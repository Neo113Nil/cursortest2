package xsna;

/* compiled from: LoadingMoreCommentsItem.kt */
/* loaded from: classes16.dex */
public final class itz implements hfz {
    public final Integer b;

    public itz(Integer num) {
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itz) && epx.f(this.b, ((itz) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        Integer num = this.b;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public final int hashCode() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("LoadingMoreCommentsItem(lastCommentId="), this.b, ')');
    }
}
