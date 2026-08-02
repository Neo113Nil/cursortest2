package xsna;

/* compiled from: CommunityChecklistItemModel.kt */
/* loaded from: classes5.dex */
public final class bxg extends s4h {
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public bxg(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxg)) {
            return false;
        }
        bxg bxgVar = (bxg) obj;
        bxgVar.getClass();
        return this.b == bxgVar.b && this.c == bxgVar.c && epx.f(this.d, bxgVar.d) && epx.f(this.e, bxgVar.e);
    }

    public final int hashCode() {
        int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChecklistItemModel(title=null, caption=null, progressTitle=null, progress=");
        sb.append(this.b);
        sb.append(", progressMax=");
        sb.append(this.c);
        sb.append(", imageOnLightUrl=");
        sb.append(this.d);
        sb.append(", imageOnDarkUrl=");
        return ho8.a(sb, this.e, ')');
    }
}
