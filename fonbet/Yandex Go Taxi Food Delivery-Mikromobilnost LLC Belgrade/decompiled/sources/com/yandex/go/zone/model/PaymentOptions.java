package com.yandex.go.zone.model;

import defpackage.gsq0;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/model/PaymentOptions;", "", "Companion", "$serializer", "com/yandex/go/zone/model/b", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentOptions {
    public static final b Companion = new b();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public /* synthetic */ PaymentOptions(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z6;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z7;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z8;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z9;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z10;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z11;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z12;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z13;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z14;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z15;
        }
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z16;
        }
        if ((65536 & i) == 0) {
            this.q = false;
        } else {
            this.q = z17;
        }
        if ((131072 & i) == 0) {
            this.r = false;
        } else {
            this.r = z18;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z19;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z20;
        }
        if ((1048576 & i) == 0) {
            this.u = false;
        } else {
            this.u = z21;
        }
        if ((2097152 & i) == 0) {
            this.v = false;
        } else {
            this.v = z22;
        }
        if ((4194304 & i) == 0) {
            this.w = false;
        } else {
            this.w = z23;
        }
        if ((i & SelfTester_JCP.ENCRYPT_CNT) == 0) {
            this.x = false;
        } else {
            this.x = z24;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOptions)) {
            return false;
        }
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        return this.a == paymentOptions.a && this.b == paymentOptions.b && this.c == paymentOptions.c && this.d == paymentOptions.d && this.e == paymentOptions.e && this.f == paymentOptions.f && this.g == paymentOptions.g && this.h == paymentOptions.h && this.i == paymentOptions.i && this.j == paymentOptions.j && this.k == paymentOptions.k && this.l == paymentOptions.l && this.m == paymentOptions.m && this.n == paymentOptions.n && this.o == paymentOptions.o && this.p == paymentOptions.p && this.q == paymentOptions.q && this.r == paymentOptions.r && this.s == paymentOptions.s && this.t == paymentOptions.t && this.u == paymentOptions.u && this.v == paymentOptions.v && this.w == paymentOptions.w && this.x == paymentOptions.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder u = qv10.u("PaymentOptions(isSupportsPromoCode=", ", isSupportsCreditCard=", ", isSupportsCorp=", this.a, this.b);
        nnm.v(", isSupportsCargoCorp=", ", isSupportsGooglePay=", u, this.c, this.d);
        nnm.v(", isSupportsPersonalWallet=", ", isSupportsSharedPayment=", u, this.e, this.f);
        nnm.v(", isSupportsYbWallet=", ", isSupportsSbpToken=", u, this.g, this.h);
        nnm.v(", isYangoWalletEnabled=", ", isSupportsCash=", u, this.i, this.j);
        nnm.v(", isSupportsCashLike=", ", isSupportsMBankAccount=", u, this.k, this.l);
        nnm.v(", isSupportsYapeToken=", ", isSupportsNequiToken=", u, this.m, this.n);
        nnm.v(", isSupportsSbpBindToken=", ", isSupportsTransportCard=", u, this.o, this.p);
        nnm.v(", isSupportsBirbonusWallet=", ", isSupportsTransportExternal=", u, this.q, this.r);
        nnm.v(", isSupportsKaspi=", ", isSupportsClickWallet=", u, this.s, this.t);
        nnm.v(", isSupportsEasypaisaWallet=", ", isSupportsJazzcashWallet=", u, this.u, this.v);
        return smw0.k(", isSupportsFastshiftAccount=", Extension.C_BRAKE, u, this.w, this.x);
    }

    public PaymentOptions(int i) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
    }

    public PaymentOptions() {
        this(0);
    }
}
