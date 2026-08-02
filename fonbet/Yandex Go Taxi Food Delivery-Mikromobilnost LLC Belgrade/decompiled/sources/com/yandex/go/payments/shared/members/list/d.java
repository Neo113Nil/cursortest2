package com.yandex.go.payments.shared.members.list;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class d {
    public static final d o = new d(0);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final boolean k;
    public final a l;
    public final String m;
    public final String n;

    public d(boolean z, boolean z2, String str, String str2, String str3, boolean z3, String str4, String str5, List list, String str6, boolean z4, a aVar, String str7, String str8) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z3;
        this.g = str4;
        this.h = str5;
        this.i = list;
        this.j = str6;
        this.k = z4;
        this.l = aVar;
        this.m = str7;
        this.n = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && jl40.l(this.c, dVar.c) && jl40.l(this.d, dVar.d) && jl40.l(this.e, dVar.e) && this.f == dVar.f && jl40.l(this.g, dVar.g) && jl40.l(this.h, dVar.h) && jl40.l(this.i, dVar.i) && jl40.l(this.j, dVar.j) && this.k == dVar.k && jl40.l(this.l, dVar.l) && jl40.l(this.m, dVar.m) && jl40.l(this.n, dVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + unr0.b((this.l.hashCode() + unr0.e(unr0.b(unr0.c(unr0.b(unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder u = qv10.u("MembersListViewModel(showBackButton=", ", showDeleteUsersButton=", ", title=", this.a, this.b);
        g8e.D(u, this.c, ", toolbarTrailButtonTitle=", this.d, ", toolbarTrailButtonAnalyticsName=");
        tse0.y(this.e, ", showCommonLimitsInput=", ", commonLimit=", u, this.f);
        g8e.D(u, this.g, ", commonLimitInputTitle=", this.h, ", listItems=");
        oyr.D(", commonLimitError=", this.j, ", showNoMembersView=", u, this.i);
        u.append(this.k);
        u.append(", bottomButtonStyle=");
        u.append(this.l);
        u.append(", noMembersViewTitle=");
        return g8e.r(u, this.m, ", noMembersViewSubtitle=", this.n, Extension.C_BRAKE);
    }

    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public final boolean d;
        public final Runnable e;
        public final String f;

        public /* synthetic */ a(int i, int i2, int i3, String str) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, false, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && jl40.l(this.c, aVar.c) && this.d == aVar.d && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f);
        }

        public final int hashCode() {
            int e = unr0.e(unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
            Runnable runnable = this.e;
            int hashCode = (e + (runnable == null ? 0 : runnable.hashCode())) * 31;
            String str = this.f;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder s = b64.s(this.a, this.b, "BottomButtonStyle(backgroundColor=", ", textColor=", ", text=");
            tse0.y(this.c, ", progressing=", ", onClick=", s, this.d);
            s.append(this.e);
            s.append(", analyticsName=");
            s.append(this.f);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        public a(int i, int i2, String str, boolean z, Runnable runnable, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = z;
            this.e = runnable;
            this.f = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            this(r2, r2, 63, null);
            int i = 0;
        }
    }

    public d() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ d(int i) {
        this(false, true, "", "", "", false, "", "", EmptyList.a, "", false, new a(r2, r2, 63, null), "", "");
        int i2 = 0;
    }
}
