package xsna;

/* compiled from: StoryMarketItemInfo.kt */
/* loaded from: classes5.dex */
public final class vfv {
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    public final boolean e;

    /* compiled from: StoryMarketItemInfo.kt */
    public static final class a {
        public final float a;
        public final String b;

        public a(float f, String str) {
            this.a = f;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rating(rating=");
            sb.append(this.a);
            sb.append(", reviewCountText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public vfv(String str, String str2, String str3, a aVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfv)) {
            return false;
        }
        vfv vfvVar = (vfv) obj;
        return epx.f(this.a, vfvVar.a) && epx.f(this.b, vfvVar.b) && epx.f(this.c, vfvVar.c) && epx.f(this.d, vfvVar.d) && this.e == vfvVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalSticker(title=");
        sb.append(this.a);
        sb.append(", ownerTitle=");
        sb.append(this.b);
        sb.append(", thumbUrl=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", isRestricted=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
