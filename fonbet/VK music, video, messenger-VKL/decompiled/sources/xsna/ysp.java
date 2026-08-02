package xsna;

/* compiled from: EpisodeFullCardState.kt */
/* loaded from: classes2.dex */
public final class ysp {
    public final String a;
    public final String b;
    public final String c;
    public final wkj d;
    public final dt1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final gzs<s3q0> j;
    public final gzs<s3q0> k;

    public ysp(String str, String str2, String str3, wkj wkjVar, dt1 dt1Var, boolean z, boolean z2, boolean z3, boolean z4, gzs gzsVar, gzs gzsVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wkjVar;
        this.e = dt1Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = gzsVar;
        this.k = gzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysp)) {
            return false;
        }
        ysp yspVar = (ysp) obj;
        return this.a.equals(yspVar.a) && epx.f(this.b, yspVar.b) && epx.f(this.c, yspVar.c) && this.d.equals(yspVar.d) && epx.f(this.e, yspVar.e) && this.f == yspVar.f && this.g == yspVar.g && this.h == yspVar.h && this.i == yspVar.i && epx.f(this.j, yspVar.j) && epx.f(this.k, yspVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + sf3.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, true), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeFullCardState(spriteUrl=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", contentScale=");
        sb.append(this.d);
        sb.append(", alignment=");
        sb.append(this.e);
        sb.append(", isVisibleAnimation=");
        sb.append(this.f);
        sb.append(", isPlayingAnimation=");
        sb.append(this.g);
        sb.append(", isOffline=");
        sb.append(this.h);
        sb.append(", showShareButton=true, isSystemAnimationsEnabled=");
        sb.append(this.i);
        sb.append(", onCardClick=");
        sb.append(this.j);
        sb.append(", onShareClick=");
        return uf3.d(sb, this.k, ')');
    }
}
