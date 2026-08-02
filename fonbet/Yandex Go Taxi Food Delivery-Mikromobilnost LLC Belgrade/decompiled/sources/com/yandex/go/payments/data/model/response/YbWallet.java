package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.YbCardDto;
import defpackage.auu0;
import defpackage.b64;
import defpackage.dp51;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.oyr;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/YbWallet;", "Lk2a0;", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/c2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class YbWallet implements k2a0 {
    public static final c2 Companion = new c2();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final YbCardDto.YbCardType e;
    public final Availability f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new dp51(14)), null, kotlin.a.b(lazyThreadSafetyMode, new dp51(15)), null};
    }

    public /* synthetic */ YbWallet(int i, String str, String str2, List list, String str3, YbCardDto.YbCardType ybCardType, Availability availability) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = YbCardDto.YbCardType.UNKNOWN;
        } else {
            this.e = ybCardType;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = availability;
        }
    }

    public static final void h(YbWallet ybWallet, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(ybWallet.a, "")) {
            yjdVar.o(serialDescriptor, 0, ybWallet.a);
        }
        if (yjdVar.F() || !jl40.l(ybWallet.b, "")) {
            yjdVar.o(serialDescriptor, 1, ybWallet.b);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = g;
        if (F || !jl40.l(ybWallet.c, EmptyList.a)) {
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ybWallet.c);
        }
        if (yjdVar.F() || ybWallet.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, ybWallet.d);
        }
        if (yjdVar.F() || ybWallet.e != YbCardDto.YbCardType.UNKNOWN) {
            yjdVar.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), ybWallet.e);
        }
        if (!yjdVar.F() && ybWallet.f == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 5, Availability$$serializer.INSTANCE, ybWallet.f);
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

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YbWallet)) {
            return false;
        }
        YbWallet ybWallet = (YbWallet) obj;
        return jl40.l(this.a, ybWallet.a) && jl40.l(this.b, ybWallet.b) && jl40.l(this.c, ybWallet.c) && jl40.l(this.d, ybWallet.d) && this.e == ybWallet.e && jl40.l(this.f, ybWallet.f);
    }

    /* renamed from: f, reason: from getter */
    public final List getC() {
        return this.c;
    }

    /* renamed from: g, reason: from getter */
    public final YbCardDto.YbCardType getE() {
        return this.e;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Availability availability = this.f;
        return hashCode + (availability != null ? availability.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbWallet(cardId=", this.a, ", currencyCode=", this.b, ", labels=");
        oyr.D(", cardIcon=", this.d, ", ybCardType=", v, this.c);
        v.append(this.e);
        v.append(", availability=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public YbWallet() {
        YbCardDto.YbCardType ybCardType = YbCardDto.YbCardType.UNKNOWN;
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = null;
        this.e = ybCardType;
        this.f = null;
    }
}
