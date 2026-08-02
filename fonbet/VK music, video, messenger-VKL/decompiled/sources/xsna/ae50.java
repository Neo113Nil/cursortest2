package xsna;

import com.facebook.soloader.MinElf;
import com.vk.dto.music.Thumb;

/* compiled from: MusicTrackUiDto.kt */
/* loaded from: classes4.dex */
public final class ae50 {
    public final String a;
    public final us2 b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final Thumb h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final us2 m;
    public final String n;
    public final boolean o;
    public final boolean p;

    public ae50() {
        this(null, null, null, false, null, null, null, null, false, false, MinElf.PN_XNUM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae50)) {
            return false;
        }
        ae50 ae50Var = (ae50) obj;
        return epx.f(this.a, ae50Var.a) && epx.f(this.b, ae50Var.b) && epx.f(this.c, ae50Var.c) && this.d == ae50Var.d && epx.f(this.e, ae50Var.e) && epx.f(this.f, ae50Var.f) && epx.f(this.g, ae50Var.g) && epx.f(this.h, ae50Var.h) && this.i == ae50Var.i && this.j == ae50Var.j && this.k == ae50Var.k && this.l == ae50Var.l && epx.f(this.m, ae50Var.m) && epx.f(this.n, ae50Var.n) && this.o == ae50Var.o && this.p == ae50Var.p;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Thumb thumb = this.h;
        return Boolean.hashCode(this.p) + qoy.b(urd0.a((this.m.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (thumb != null ? thumb.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackUiDto(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", titleContentDescription=");
        sb.append(this.c);
        sb.append(", shouldShowErrorAfterTitle=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", imageUrl=");
        sb.append(this.f);
        sb.append(", imageContentDescription=");
        sb.append(this.g);
        sb.append(", image=");
        sb.append(this.h);
        sb.append(", shouldShowRemove=");
        sb.append(this.i);
        sb.append(", shouldShowCheck=");
        sb.append(this.j);
        sb.append(", shouldShowReorder=");
        sb.append(this.k);
        sb.append(", shouldShowTrackDuration=");
        sb.append(this.l);
        sb.append(", trackDurationText=");
        sb.append((Object) this.m);
        sb.append(", trackDurationContentDescription=");
        sb.append(this.n);
        sb.append(", isRestricted=");
        sb.append(this.o);
        sb.append(", isMultiselectEnabled=");
        return defpackage.q0.a(sb, this.p, ')');
    }

    public /* synthetic */ ae50(String str, us2 us2Var, String str2, boolean z, String str3, String str4, String str5, Thumb thumb, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new us2("") : us2Var, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? thumb : null, (i & 256) == 0, false, (i & 1024) != 0 ? false : z2, false, new us2(""), "", (i & 16384) != 0 ? false : z3, (i & 32768) == 0);
    }

    public ae50(String str, us2 us2Var, String str2, boolean z, String str3, String str4, String str5, Thumb thumb, boolean z2, boolean z3, boolean z4, boolean z5, us2 us2Var2, String str6, boolean z6, boolean z7) {
        this.a = str;
        this.b = us2Var;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = thumb;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = us2Var2;
        this.n = str6;
        this.o = z6;
        this.p = z7;
    }
}
