package xsna;

/* compiled from: ChannelRecommendationStorageModel.kt */
/* loaded from: classes2.dex */
public final class gbb implements htx0 {
    public final long b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;

    public gbb(long j, long j2, Long l, String str, String str2, String str3) {
        this.b = j;
        this.c = j2;
        this.d = l;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbb)) {
            return false;
        }
        gbb gbbVar = (gbb) obj;
        return this.b == gbbVar.b && this.c == gbbVar.c && epx.f(this.d, gbbVar.d) && epx.f(this.e, gbbVar.e) && epx.f(this.f, gbbVar.f) && epx.f(this.g, gbbVar.g);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
        Long l = this.d;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        return this.g.hashCode() + urd0.a((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelRecommendationStorageModel(id=");
        sb.append(this.b);
        sb.append(", lastUpdatedMillis=");
        sb.append(this.c);
        sb.append(", parentId=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", avatar=");
        sb.append(this.f);
        sb.append(", name=");
        return ho8.a(sb, this.g, ')');
    }
}
