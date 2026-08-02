package xsna;

/* compiled from: PostingHashTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class bvu implements hfz {
    public final String b;

    public bvu(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvu) && epx.f(this.b, ((bvu) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("HashTagPostingItem(hashTagText="), this.b, ')');
    }
}
