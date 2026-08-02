package xsna;

import java.util.List;

/* compiled from: ClipsDraftSdkData.kt */
/* loaded from: classes17.dex */
public final class ptd {
    public final String a;
    public final int b;
    public final List<cud> c;
    public final String d;
    public final long e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final String j;
    public final List<List<vrd>> k;
    public final float l;
    public final gtd m;
    public final Long n;

    public ptd(String str, int i, List list, String str2, long j, boolean z, int i2, boolean z2, String str3, String str4, List list2, float f, gtd gtdVar, Long l) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = str2;
        this.e = j;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = str3;
        this.j = str4;
        this.k = list2;
        this.l = f;
        this.m = gtdVar;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptd)) {
            return false;
        }
        ptd ptdVar = (ptd) obj;
        return epx.f(this.a, ptdVar.a) && this.b == ptdVar.b && epx.f(this.c, ptdVar.c) && epx.f(this.d, ptdVar.d) && this.e == ptdVar.e && this.f == ptdVar.f && this.g == ptdVar.g && this.h == ptdVar.h && epx.f(this.i, ptdVar.i) && epx.f(this.j, ptdVar.j) && epx.f(this.k, ptdVar.k) && Float.compare(this.l, ptdVar.l) == 0 && epx.f(this.m, ptdVar.m) && epx.f(this.n, ptdVar.n);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int b = qoy.b(shy.a(this.g, qoy.b(bh10.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
        String str2 = this.i;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<List<vrd>> list = this.k;
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.l, (hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        gtd gtdVar = this.m;
        int hashCode3 = (a2 + (gtdVar == null ? 0 : gtdVar.hashCode())) * 31;
        Long l = this.n;
        return (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "ClipsDraftSdkData(id=" + this.a + ", maxClipDurationMs=" + this.b + ", files=" + this.c + ", description=" + this.d + ", previewTimestamp=" + this.e + ", autosaved=" + this.f + ", dateSeconds=" + this.g + ", isPreviewFromGallery=" + this.h + ", previewUri=" + this.i + ", entryPoint=" + this.j + ", audios=" + this.k + ", aspectRatio=" + this.l + ", ordInfo=" + this.m + ", delayedPublicationDate=" + this.n + ", deletedAt=null)";
    }
}
