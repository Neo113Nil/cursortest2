package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.m3e;
import defpackage.nzs;
import defpackage.unr0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/CorpAccount;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CorpAccount implements k2a0 {
    public static final b0 Companion = new b0();
    public static final i3y[] k = {null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(23)), null};
    public final String a;
    public final String b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final Availability j;

    public /* synthetic */ CorpAccount(int i, String str, String str2, double d, double d2, double d3, String str3, String str4, String str5, List list, Availability availability) {
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
            this.c = 0.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = 0.0d;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = availability;
        }
    }

    public static final void m(CorpAccount corpAccount, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(corpAccount.a, "")) {
            yjdVar.o(serialDescriptor, 0, corpAccount.a);
        }
        if (yjdVar.F() || !jl40.l(corpAccount.b, "")) {
            yjdVar.o(serialDescriptor, 1, corpAccount.b);
        }
        if (yjdVar.F() || Double.compare(corpAccount.c, 0.0d) != 0) {
            yjdVar.E(serialDescriptor, 2, corpAccount.c);
        }
        if (yjdVar.F() || Double.compare(corpAccount.d, 0.0d) != 0) {
            yjdVar.E(serialDescriptor, 3, corpAccount.d);
        }
        if (yjdVar.F() || Double.compare(corpAccount.e, 0.0d) != 0) {
            yjdVar.E(serialDescriptor, 4, corpAccount.e);
        }
        if (yjdVar.F() || corpAccount.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, corpAccount.f);
        }
        if (yjdVar.F() || corpAccount.g != null) {
            yjdVar.g(serialDescriptor, 6, auu0.a, corpAccount.g);
        }
        if (yjdVar.F() || corpAccount.h != null) {
            yjdVar.g(serialDescriptor, 7, auu0.a, corpAccount.h);
        }
        if (yjdVar.F() || !jl40.l(corpAccount.i, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 8, (KSerializer) k[8].getValue(), corpAccount.i);
        }
        if (!yjdVar.F() && corpAccount.j == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 9, Availability$$serializer.INSTANCE, corpAccount.j);
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getF() {
        return this.j;
    }

    /* renamed from: d, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: e, reason: from getter */
    public final List getI() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorpAccount)) {
            return false;
        }
        CorpAccount corpAccount = (CorpAccount) obj;
        return jl40.l(this.a, corpAccount.a) && jl40.l(this.b, corpAccount.b) && Double.compare(this.c, corpAccount.c) == 0 && Double.compare(this.d, corpAccount.d) == 0 && Double.compare(this.e, corpAccount.e) == 0 && jl40.l(this.f, corpAccount.f) && jl40.l(this.g, corpAccount.g) && jl40.l(this.h, corpAccount.h) && jl40.l(this.i, corpAccount.i) && jl40.l(this.j, corpAccount.j);
    }

    /* renamed from: f, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: g, reason: from getter */
    public final String getG() {
        return this.g;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int a = unr0.a(unr0.a(unr0.a(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int c = unr0.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i);
        Availability availability = this.j;
        return c + (availability != null ? availability.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final double getE() {
        return this.e;
    }

    /* renamed from: j, reason: from getter */
    public final double getD() {
        return this.d;
    }

    /* renamed from: k, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* renamed from: l, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final String toString() {
        StringBuilder v = b64.v("CorpAccount(id=", this.a, ", name=", this.b, ", moneySpent=");
        v.append(this.c);
        nzs.o(v, ", moneyLimit=", this.d, ", moneyLeft=");
        v.append(this.e);
        v.append(", currency=");
        v.append(this.f);
        g8e.D(v, ", description=", this.g, ", costCenter=", this.h);
        v.append(", costCenterFields=");
        v.append(this.i);
        v.append(", availability=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CorpAccount() {
        this.a = "";
        this.b = "";
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = EmptyList.a;
        this.j = null;
    }
}
