package xsna;

/* compiled from: CommunityLegoPromotionItemModel.kt */
/* loaded from: classes5.dex */
public final class u7h extends s4h {
    public final String b;

    public u7h(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7h) && epx.f(this.b, ((u7h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CommunityLegoPromotionItemModel(promoUrl="), this.b, ')');
    }
}
