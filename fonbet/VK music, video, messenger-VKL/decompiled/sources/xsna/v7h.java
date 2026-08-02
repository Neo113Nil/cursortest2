package xsna;

/* compiled from: CommunityLegoRestrictedPlaceholderItemModel.kt */
/* loaded from: classes5.dex */
public final class v7h extends s4h {
    public final w7h b;

    public v7h(w7h w7hVar) {
        this.b = w7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7h) && epx.f(this.b, ((v7h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityLegoRestrictedPlaceholderItemModel(state=" + this.b + ')';
    }
}
