package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/CashLikeAccount;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CashLikeAccount implements k2a0 {
    public static final w Companion = new w();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Availability e;

    public /* synthetic */ CashLikeAccount(int i, String str, String str2, String str3, String str4, Availability availability) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = availability;
        }
    }

    public static final void g(CashLikeAccount cashLikeAccount, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(cashLikeAccount.a, "")) {
            yjdVar.o(serialDescriptor, 0, cashLikeAccount.a);
        }
        if (yjdVar.F() || !jl40.l(cashLikeAccount.b, "")) {
            yjdVar.o(serialDescriptor, 1, cashLikeAccount.b);
        }
        if (yjdVar.F() || !jl40.l(cashLikeAccount.c, "")) {
            yjdVar.o(serialDescriptor, 2, cashLikeAccount.c);
        }
        if (yjdVar.F() || !jl40.l(cashLikeAccount.d, "")) {
            yjdVar.o(serialDescriptor, 3, cashLikeAccount.d);
        }
        if (!yjdVar.F() && cashLikeAccount.e == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 4, Availability$$serializer.INSTANCE, cashLikeAccount.e);
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashLikeAccount)) {
            return false;
        }
        CashLikeAccount cashLikeAccount = (CashLikeAccount) obj;
        return jl40.l(this.a, cashLikeAccount.a) && jl40.l(this.b, cashLikeAccount.b) && jl40.l(this.c, cashLikeAccount.c) && jl40.l(this.d, cashLikeAccount.d) && jl40.l(this.e, cashLikeAccount.e);
    }

    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Availability availability = this.e;
        return b + (availability == null ? 0 : availability.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("CashLikeAccount(id=", this.a, ", name=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", availability=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CashLikeAccount() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
    }
}
