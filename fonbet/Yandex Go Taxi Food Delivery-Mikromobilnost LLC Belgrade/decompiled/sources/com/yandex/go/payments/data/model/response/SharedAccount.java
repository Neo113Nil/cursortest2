package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.mkr0;
import defpackage.qmr0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/SharedAccount;", "Lk2a0;", "Companion", "Details", "$serializer", "com/yandex/go/payments/data/model/response/u1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SharedAccount implements k2a0 {
    public static final u1 Companion = new u1();
    public static final i3y[] j = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(6)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final MemberRole f;
    public final boolean g;
    public final Details h;
    public final Availability i;

    public /* synthetic */ SharedAccount(int i, String str, String str2, String str3, String str4, boolean z, MemberRole memberRole, boolean z2, Details details, Availability availability) {
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
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = memberRole;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z2;
        }
        if ((i & 128) == 0) {
            this.h = new Details(0);
        } else {
            this.h = details;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = availability;
        }
    }

    public static final void p(SharedAccount sharedAccount, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(sharedAccount.a, "")) {
            yjdVar.o(serialDescriptor, 0, sharedAccount.a);
        }
        if (yjdVar.F() || !jl40.l(sharedAccount.b, "")) {
            yjdVar.o(serialDescriptor, 1, sharedAccount.b);
        }
        if (yjdVar.F() || !jl40.l(sharedAccount.c, "")) {
            yjdVar.o(serialDescriptor, 2, sharedAccount.c);
        }
        if (yjdVar.F() || !jl40.l(sharedAccount.d, "")) {
            yjdVar.o(serialDescriptor, 3, sharedAccount.d);
        }
        if (yjdVar.F() || sharedAccount.e) {
            yjdVar.n(serialDescriptor, 4, sharedAccount.e);
        }
        if (yjdVar.F() || sharedAccount.f != null) {
            yjdVar.g(serialDescriptor, 5, (KSerializer) j[5].getValue(), sharedAccount.f);
        }
        if (yjdVar.F() || !sharedAccount.g) {
            yjdVar.n(serialDescriptor, 6, sharedAccount.g);
        }
        if (yjdVar.F() || !jl40.l(sharedAccount.h, new Details(0))) {
            yjdVar.e(serialDescriptor, 7, SharedAccount$Details$$serializer.INSTANCE, sharedAccount.h);
        }
        if (!yjdVar.F() && sharedAccount.i == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 8, Availability$$serializer.INSTANCE, sharedAccount.i);
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getD() {
        return this.i;
    }

    public final String d() {
        return this.h.b;
    }

    public final boolean e(SharedAccount sharedAccount) {
        return jl40.l(this.a, sharedAccount != null ? sharedAccount.a : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedAccount)) {
            return false;
        }
        SharedAccount sharedAccount = (SharedAccount) obj;
        return jl40.l(this.a, sharedAccount.a) && jl40.l(this.b, sharedAccount.b) && jl40.l(this.c, sharedAccount.c) && jl40.l(this.d, sharedAccount.d) && this.e == sharedAccount.e && this.f == sharedAccount.f && this.g == sharedAccount.g && jl40.l(this.h, sharedAccount.h) && jl40.l(this.i, sharedAccount.i);
    }

    /* renamed from: f, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: g, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean h() {
        return this.h.c;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        MemberRole memberRole = this.f;
        int hashCode = (this.h.hashCode() + unr0.e((e + (memberRole == null ? 0 : memberRole.hashCode())) * 31, 31, this.g)) * 31;
        Availability availability = this.i;
        return hashCode + (availability != null ? availability.hashCode() : 0);
    }

    public final String i() {
        return this.a;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    public final boolean l() {
        return this.f == MemberRole.OWNER;
    }

    public final String m() {
        return this.h.a;
    }

    public final SharedAccountType n() {
        SharedAccountType.Companion.getClass();
        return qmr0.a(this.b);
    }

    /* renamed from: o, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final String toString() {
        StringBuilder v = b64.v("SharedAccount(id=", this.a, ", typeId=", this.b, ", description=");
        g8e.D(v, this.c, ", errorDescription=", this.d, ", isActive=");
        v.append(this.e);
        v.append(", memberRole=");
        v.append(this.f);
        v.append(", isInvitationRead=");
        v.append(this.g);
        v.append(", details=");
        v.append(this.h);
        v.append(", availability=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/SharedAccount$Details;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/v1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Details {
        public static final v1 Companion = new v1();
        public final String a;
        public final String b;
        public final boolean c;

        public /* synthetic */ Details(String str, int i, String str2, boolean z) {
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
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return jl40.l(this.a, details.a) && jl40.l(this.b, details.b) && this.c == details.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return x4e.i(b64.v("Details(name=", this.a, ", color=", this.b, ", hasPassportAccount="), this.c, Extension.C_BRAKE);
        }

        public Details(int i) {
            this.a = "";
            this.b = "";
            this.c = false;
        }

        public Details() {
            this(0);
        }
    }

    public SharedAccount() {
        Details details = new Details(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = null;
        this.g = true;
        this.h = details;
        this.i = null;
    }
}
