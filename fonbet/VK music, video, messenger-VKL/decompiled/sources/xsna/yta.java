package xsna;

/* compiled from: ChannelApiModel.kt */
/* loaded from: classes2.dex */
public final class yta {
    public final long a;
    public final String b;
    public final String c;
    public final vcb d;
    public final mzq0 e;
    public final String f;
    public final Long g;
    public final Long h;
    public final int i;
    public final Integer j;
    public final Boolean k;
    public final String l;
    public final boolean m;
    public final q2o n;

    public yta(long j, String str, String str2, vcb vcbVar, mzq0 mzq0Var, String str3, Long l, Long l2, int i, Integer num, Boolean bool, String str4, boolean z, q2o q2oVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = vcbVar;
        this.e = mzq0Var;
        this.f = str3;
        this.g = l;
        this.h = l2;
        this.i = i;
        this.j = num;
        this.k = bool;
        this.l = str4;
        this.m = z;
        this.n = q2oVar;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yta)) {
            return false;
        }
        yta ytaVar = (yta) obj;
        return this.a == ytaVar.a && epx.f(this.b, ytaVar.b) && epx.f(this.c, ytaVar.c) && epx.f(this.d, ytaVar.d) && epx.f(this.e, ytaVar.e) && epx.f(this.f, ytaVar.f) && epx.f(this.g, ytaVar.g) && epx.f(this.h, ytaVar.h) && this.i == ytaVar.i && epx.f(this.j, ytaVar.j) && epx.f(this.k, ytaVar.k) && epx.f(this.l, ytaVar.l) && this.m == ytaVar.m && epx.f(this.n, ytaVar.n);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.g;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int a = shy.a(this.i, (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        Integer num = this.j;
        int hashCode4 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.k;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.l;
        int b = qoy.b((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.m);
        q2o q2oVar = this.n;
        return b + (q2oVar != null ? q2oVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelApiModel(channelId=" + this.a + ", avatar=" + this.b + ", title=" + this.c + ", sortId=" + this.d + ", userSpecific=" + this.e + ", type=" + this.f + ", parentId=" + this.g + ", version=" + this.h + ", postponedCount=" + this.i + ", membersCount=" + this.j + ", canComment=" + this.k + ", trackCode=" + this.l + ", isAdult=" + this.m + ", donutSettings=" + this.n + ')';
    }
}
