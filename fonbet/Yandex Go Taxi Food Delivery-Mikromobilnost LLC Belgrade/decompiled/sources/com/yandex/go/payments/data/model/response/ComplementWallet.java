package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.juc;
import defpackage.k2a0;
import defpackage.oyr;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ComplementWallet;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ComplementWallet implements k2a0 {
    public static final y Companion = new y();
    public static final i3y[] f;
    public final String a;
    public final PaymentMethod$Type b;
    public final PersonalAccount.ComplementAttributes c;
    public final Availability d;
    public final String e;

    static {
        l1 l1Var = PersonalAccount.ComplementAttributes.Companion;
        f = new i3y[]{null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(6)), null, null, null};
    }

    public /* synthetic */ ComplementWallet(int i, String str, PaymentMethod$Type paymentMethod$Type, PersonalAccount.ComplementAttributes complementAttributes, Availability availability, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = paymentMethod$Type;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = complementAttributes;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = availability;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public static final void h(ComplementWallet complementWallet, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(complementWallet.a, "")) {
            yjdVar.o(serialDescriptor, 0, complementWallet.a);
        }
        if (yjdVar.F() || complementWallet.b != null) {
            yjdVar.g(serialDescriptor, 1, (KSerializer) f[1].getValue(), complementWallet.b);
        }
        if (yjdVar.F() || complementWallet.c != null) {
            yjdVar.g(serialDescriptor, 2, PersonalAccount$ComplementAttributes$$serializer.INSTANCE, complementWallet.c);
        }
        if (yjdVar.F() || complementWallet.d != null) {
            yjdVar.g(serialDescriptor, 3, Availability$$serializer.INSTANCE, complementWallet.d);
        }
        if (!yjdVar.F() && jl40.l(complementWallet.e, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 4, complementWallet.e);
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getF() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final PersonalAccount.ComplementAttributes getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplementWallet)) {
            return false;
        }
        ComplementWallet complementWallet = (ComplementWallet) obj;
        return jl40.l(this.a, complementWallet.a) && this.b == complementWallet.b && jl40.l(this.c, complementWallet.c) && jl40.l(this.d, complementWallet.d) && jl40.l(this.e, complementWallet.e);
    }

    public final String f() {
        return this.a;
    }

    /* renamed from: g, reason: from getter */
    public final PaymentMethod$Type getB() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PaymentMethod$Type paymentMethod$Type = this.b;
        int hashCode2 = (hashCode + (paymentMethod$Type == null ? 0 : paymentMethod$Type.hashCode())) * 31;
        PersonalAccount.ComplementAttributes complementAttributes = this.c;
        int hashCode3 = (hashCode2 + (complementAttributes == null ? 0 : complementAttributes.hashCode())) * 31;
        Availability availability = this.d;
        return this.e.hashCode() + ((hashCode3 + (availability != null ? availability.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplementWallet(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", complementAttributes=");
        sb.append(this.c);
        sb.append(", availability=");
        sb.append(this.d);
        sb.append(", iconTag=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public ComplementWallet() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = "";
    }
}
