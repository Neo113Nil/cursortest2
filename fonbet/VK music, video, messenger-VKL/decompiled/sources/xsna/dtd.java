package xsna;

/* compiled from: ClipsDraftMusic.kt */
/* loaded from: classes17.dex */
public final class dtd {
    public final ftd a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final etd j;
    public final boolean k;

    public dtd(ftd ftdVar, String str, int i, int i2, int i3, String str2, int i4, boolean z, boolean z2, etd etdVar, boolean z3) {
        this.a = ftdVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str2;
        this.g = i4;
        this.h = z;
        this.i = z2;
        this.j = etdVar;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtd)) {
            return false;
        }
        dtd dtdVar = (dtd) obj;
        return epx.f(this.a, dtdVar.a) && epx.f(this.b, dtdVar.b) && this.c == dtdVar.c && this.d == dtdVar.d && this.e == dtdVar.e && epx.f(this.f, dtdVar.f) && this.g == dtdVar.g && this.h == dtdVar.h && this.i == dtdVar.i && epx.f(this.j, dtdVar.j) && this.k == dtdVar.k;
    }

    public final int hashCode() {
        int a = shy.a(this.e, shy.a(this.d, shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
        String str = this.f;
        int b = qoy.b(qoy.b(shy.a(this.g, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.h), 31, this.i);
        etd etdVar = this.j;
        return Boolean.hashCode(this.k) + ((b + (etdVar != null ? etdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftMusic(musicTrack=");
        sb.append(this.a);
        sb.append(", trackUrl=");
        sb.append(this.b);
        sb.append(", startMs=");
        sb.append(this.c);
        sb.append(", finishMs=");
        sb.append(this.d);
        sb.append(", delayMs=");
        sb.append(this.e);
        sb.append(", localFilePath=");
        sb.append(this.f);
        sb.append(", recommendedTime=");
        sb.append(this.g);
        sb.append(", fromDuet=");
        sb.append(this.h);
        sb.append(", fromLocalVideo=");
        sb.append(this.i);
        sb.append(", musicCatalogInfo=");
        sb.append(this.j);
        sb.append(", fromVoiceOver=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
