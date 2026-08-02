package xsna;

/* compiled from: CommunityCuratorInfoItemModel.kt */
/* loaded from: classes5.dex */
public final class o0h extends s4h {
    public final String b;

    public o0h(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0h) && epx.f(this.b, ((o0h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CommunityCuratorInfoItemModel(curatorId="), this.b, ')');
    }
}
