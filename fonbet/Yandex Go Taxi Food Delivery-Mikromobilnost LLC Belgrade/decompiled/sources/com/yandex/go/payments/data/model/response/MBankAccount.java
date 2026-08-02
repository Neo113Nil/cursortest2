package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.Card;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.qxz;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/MBankAccount;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MBankAccount implements k2a0 {
    public static final p0 Companion = new p0();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(2)), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Card.VerifyStrategy e;
    public final Availability f;

    public /* synthetic */ MBankAccount(int i, String str, String str2, String str3, String str4, Card.VerifyStrategy verifyStrategy, Availability availability) {
        if ((i & 1) == 0) {
            this.a = "";
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
            this.e = Card.VerifyStrategy.UNKNOWN;
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
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MBankAccount)) {
            return false;
        }
        MBankAccount mBankAccount = (MBankAccount) obj;
        return jl40.l(this.a, mBankAccount.a) && jl40.l(this.b, mBankAccount.b) && jl40.l(this.c, mBankAccount.c) && jl40.l(this.d, mBankAccount.d) && this.e == mBankAccount.e && jl40.l(this.f, mBankAccount.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Availability availability = this.f;
        return hashCode2 + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MBankAccount(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", verifyStrategy=");
        v.append(this.e);
        v.append(", availability=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public MBankAccount() {
        Card.VerifyStrategy verifyStrategy = Card.VerifyStrategy.UNKNOWN;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = verifyStrategy;
        this.f = null;
    }
}
