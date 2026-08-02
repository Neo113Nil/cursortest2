package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.Card;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.ojw;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/JazzcashWallet;", "Lcom/yandex/go/payments/data/model/response/r0;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JazzcashWallet extends r0 implements k2a0 {
    public static final m0 Companion = new m0();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(23)), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Card.VerifyStrategy e;
    public final Availability f;

    public JazzcashWallet(int i, String str, String str2, String str3, String str4, Card.VerifyStrategy verifyStrategy, Availability availability) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = verifyStrategy;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = availability;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a */
    public final String getA() {
        String str = this.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.f;
    }

    @Override // com.yandex.go.payments.data.model.response.r0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JazzcashWallet)) {
            return false;
        }
        JazzcashWallet jazzcashWallet = (JazzcashWallet) obj;
        return jl40.l(this.a, jazzcashWallet.a) && jl40.l(this.b, jazzcashWallet.b) && jl40.l(this.c, jazzcashWallet.c) && jl40.l(this.d, jazzcashWallet.d) && this.e == jazzcashWallet.e && jl40.l(this.f, jazzcashWallet.f);
    }

    /* renamed from: f, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final Card.VerifyStrategy getE() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Card.VerifyStrategy verifyStrategy = this.e;
        int hashCode3 = (hashCode2 + (verifyStrategy == null ? 0 : verifyStrategy.hashCode())) * 31;
        Availability availability = this.f;
        return hashCode3 + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("JazzcashWallet(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", verifyStrategy=");
        v.append(this.e);
        v.append(", availability=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public JazzcashWallet() {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
