package xsna;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: VideoDescriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class n2m {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Spanned f;
    public final long g;
    public final boolean h;
    public final String i;
    public final String j;
    public final Long k;
    public final ArrayList l;
    public final LinkedHashMap m;
    public final boolean n;

    public n2m(String str, String str2, boolean z, boolean z2, int i, Spanned spanned, long j, boolean z3, String str3, String str4, Long l, ArrayList arrayList, LinkedHashMap linkedHashMap, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = spanned;
        this.g = j;
        this.h = z3;
        this.i = str3;
        this.j = str4;
        this.k = l;
        this.l = arrayList;
        this.m = linkedHashMap;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2m)) {
            return false;
        }
        n2m n2mVar = (n2m) obj;
        return epx.f(this.a, n2mVar.a) && epx.f(this.b, n2mVar.b) && this.c == n2mVar.c && this.d == n2mVar.d && this.e == n2mVar.e && epx.f(this.f, n2mVar.f) && l5g.d(this.g, n2mVar.g) && this.h == n2mVar.h && epx.f(this.i, n2mVar.i) && epx.f(this.j, n2mVar.j) && epx.f(this.k, n2mVar.k) && this.l.equals(n2mVar.l) && this.m.equals(n2mVar.m) && this.n == n2mVar.n;
    }

    public final int hashCode() {
        int a = shy.a(this.e, qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        Spanned spanned = this.f;
        int hashCode = (a + (spanned == null ? 0 : spanned.hashCode())) * 31;
        int i = l5g.l;
        int a2 = urd0.a(qoy.b(bh10.a(hashCode, 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.k;
        return Boolean.hashCode(this.n) + uf3.b(this.m, qr.a(this.l, (hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", subtitleVisible=");
        sb.append(this.c);
        sb.append(", isLive=");
        sb.append(this.d);
        sb.append(", liveStartTimeSec=");
        sb.append(this.e);
        sb.append(", trendingRaw=");
        sb.append((Object) this.f);
        sb.append(", trendingLinkColor=");
        dn.h(this.g, ", isArchivalContent=", sb);
        sb.append(this.h);
        sb.append(", archivalContentText=");
        sb.append(this.i);
        sb.append(", archivalEndText=");
        sb.append(this.j);
        sb.append(", archivalContentPublishedDate=");
        sb.append(this.k);
        sb.append(", goods=");
        kr.d(this.l, sb, ", goodsByAttach=");
        sb.append(this.m);
        sb.append(", isTablet=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
