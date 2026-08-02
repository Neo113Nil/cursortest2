package xsna;

/* compiled from: CommunityChecklistViewState.kt */
/* loaded from: classes17.dex */
public final class dxg {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;

    public dxg(int i, int i2, String str, String str2, gzs gzsVar, gzs gzsVar2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = gzsVar;
        this.f = gzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxg)) {
            return false;
        }
        dxg dxgVar = (dxg) obj;
        dxgVar.getClass();
        return this.a == dxgVar.a && this.b == dxgVar.b && epx.f(this.c, dxgVar.c) && epx.f(this.d, dxgVar.d) && epx.f(this.e, dxgVar.e) && epx.f(this.f, dxgVar.f);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + sf3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChecklistViewState(title=null, caption=null, progressTitle=null, progress=");
        sb.append(this.a);
        sb.append(", progressMax=");
        sb.append(this.b);
        sb.append(", imageOnLightUrl=");
        sb.append(this.c);
        sb.append(", imageOnDarkUrl=");
        sb.append(this.d);
        sb.append(", onButtonClicked=");
        sb.append(this.e);
        sb.append(", onCloseButtonClicked=");
        return uf3.d(sb, this.f, ')');
    }
}
