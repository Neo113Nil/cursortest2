package com.yandex.go.yb.experiments;

import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n96;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.y99;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/yb/experiments/ChangeToYbWalletExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/yb/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ChangeToYbWalletExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] p;
    public static final ChangeToYbWalletExperiment q;
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final List n;
    public final long o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y99(3)), null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new y99(4)), null};
        q = new ChangeToYbWalletExperiment(0);
    }

    public /* synthetic */ ChangeToYbWalletExperiment(int i, boolean z, Map map, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, List list, long j2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str5;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str6;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str7;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str8;
        }
        this.m = (i & 2048) == 0 ? 0L : j;
        this.n = (i & 4096) == 0 ? EmptyList.a : list;
        this.o = (i & 8192) == 0 ? 2000L : j2;
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && this.m >= 0 && this.o >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeToYbWalletExperiment)) {
            return false;
        }
        ChangeToYbWalletExperiment changeToYbWalletExperiment = (ChangeToYbWalletExperiment) obj;
        return this.b == changeToYbWalletExperiment.b && jl40.l(this.c, changeToYbWalletExperiment.c) && this.d == changeToYbWalletExperiment.d && jl40.l(this.e, changeToYbWalletExperiment.e) && jl40.l(this.f, changeToYbWalletExperiment.f) && jl40.l(this.g, changeToYbWalletExperiment.g) && jl40.l(this.h, changeToYbWalletExperiment.h) && jl40.l(this.i, changeToYbWalletExperiment.i) && jl40.l(this.j, changeToYbWalletExperiment.j) && jl40.l(this.k, changeToYbWalletExperiment.k) && jl40.l(this.l, changeToYbWalletExperiment.l) && this.m == changeToYbWalletExperiment.m && jl40.l(this.n, changeToYbWalletExperiment.n) && this.o == changeToYbWalletExperiment.o;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.o) + unr0.c(qv10.c(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.e(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder l = nnm.l("ChangeToYbWalletExperiment(enabled=", ", l10n=", ", selectWithoutModal=", this.c, this.b);
        unr0.A(", titleKey=", this.e, ", titlePayCardProcessKey=", l, this.d);
        g8e.D(l, this.f, ", descriptionPayCardProcessKey=", this.g, ", titlePayCardOpenedKey=");
        g8e.D(l, this.h, ", descriptionPayCardOpenedKey=", this.i, ", descriptionKey=");
        g8e.D(l, this.j, ", changeButtonKey=", this.k, ", closeButtonKey=");
        ly3.y(this.m, this.l, ", showDelay=", l);
        l.append(", openReasons=");
        l.append(this.n);
        l.append(", paymentMethodsFetchTimeout=");
        return oyr.n(this.o, Extension.C_BRAKE, l);
    }

    public ChangeToYbWalletExperiment() {
        this(0);
    }

    public ChangeToYbWalletExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = 0L;
        this.n = EmptyList.a;
        this.o = 2000L;
    }
}
