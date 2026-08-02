package xsna;

/* compiled from: EpisodeCard.kt */
/* loaded from: classes2.dex */
public final class rsp {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final nwo0 h;
    public final boolean i;
    public final gzs<s3q0> j;

    public rsp(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, nwo0 nwo0Var, boolean z4, gzs gzsVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = nwo0Var;
        this.i = z4;
        this.j = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsp)) {
            return false;
        }
        rsp rspVar = (rsp) obj;
        return this.a.equals(rspVar.a) && epx.f(this.b, rspVar.b) && epx.f(this.c, rspVar.c) && this.d == rspVar.d && this.e == rspVar.e && this.f == rspVar.f && this.g == rspVar.g && epx.f(this.h, rspVar.h) && this.i == rspVar.i && epx.f(this.j, rspVar.j);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.d, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
        nwo0 nwo0Var = this.h;
        return this.j.hashCode() + qoy.b(qoy.b((b + (nwo0Var == null ? 0 : nwo0Var.hashCode())) * 31, 31, false), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeCardState(posterUrl=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", startTimeSec=");
        sb.append(this.d);
        sb.append(", isVisibleAnimation=");
        sb.append(this.e);
        sb.append(", isPlayingAnimation=");
        sb.append(this.f);
        sb.append(", isOffline=");
        sb.append(this.g);
        sb.append(", cropper=");
        sb.append(this.h);
        sb.append(", isTablet=false, isSystemAnimationsEnabled=");
        sb.append(this.i);
        sb.append(", onCardClick=");
        return uf3.d(sb, this.j, ')');
    }
}
