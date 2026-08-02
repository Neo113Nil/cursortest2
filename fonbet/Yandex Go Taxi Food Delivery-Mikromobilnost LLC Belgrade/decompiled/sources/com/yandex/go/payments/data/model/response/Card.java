package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yjd;
import defpackage.z96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Card;", "Lk2a0;", "Companion", "Family", "VerifyStrategy", "com/yandex/go/payments/data/model/response/s", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Card implements k2a0 {
    public static final s Companion = new s();
    public static final i3y[] p;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final VerifyStrategy j;
    public final Family k;
    public final String l;
    public final Boolean m;
    public final CardProfile n;
    public final Availability o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Card$VerifyStrategy;", "", "Companion", "com/yandex/go/payments/data/model/response/u", "ANTIFRAUD", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class VerifyStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VerifyStrategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final VerifyStrategy ANTIFRAUD;
        public static final u Companion;
        public static final VerifyStrategy UNKNOWN;

        static {
            VerifyStrategy verifyStrategy = new VerifyStrategy("ANTIFRAUD", 0);
            ANTIFRAUD = verifyStrategy;
            VerifyStrategy verifyStrategy2 = new VerifyStrategy("UNKNOWN", 1);
            UNKNOWN = verifyStrategy2;
            VerifyStrategy[] verifyStrategyArr = {verifyStrategy, verifyStrategy2};
            $VALUES = verifyStrategyArr;
            $ENTRIES = kotlin.enums.a.a(verifyStrategyArr);
            Companion = new u();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(25));
        }

        public static VerifyStrategy valueOf(String str) {
            return (VerifyStrategy) Enum.valueOf(VerifyStrategy.class, str);
        }

        public static VerifyStrategy[] values() {
            return (VerifyStrategy[]) $VALUES.clone();
        }
    }

    static {
        v vVar = CardProfile.Companion;
        p = new i3y[]{null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(24)), null, null, null, null, null};
    }

    public /* synthetic */ Card(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, VerifyStrategy verifyStrategy, Family family, String str9, Boolean bool, CardProfile cardProfile, Availability availability) {
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
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = VerifyStrategy.UNKNOWN;
        } else {
            this.j = verifyStrategy;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = family;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = cardProfile;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = availability;
        }
    }

    public static final void p(Card card, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(card.a, "")) {
            yjdVar.o(serialDescriptor, 0, card.a);
        }
        if (yjdVar.F() || !jl40.l(card.b, "")) {
            yjdVar.o(serialDescriptor, 1, card.b);
        }
        if (yjdVar.F() || !jl40.l(card.c, "")) {
            yjdVar.o(serialDescriptor, 2, card.c);
        }
        if (yjdVar.F() || !jl40.l(card.d, "")) {
            yjdVar.o(serialDescriptor, 3, card.d);
        }
        if (yjdVar.F() || card.e) {
            yjdVar.n(serialDescriptor, 4, card.e);
        }
        if (yjdVar.F() || !jl40.l(card.f, "")) {
            yjdVar.o(serialDescriptor, 5, card.f);
        }
        if (yjdVar.F() || !jl40.l(card.g, "")) {
            yjdVar.o(serialDescriptor, 6, card.g);
        }
        if (yjdVar.F() || card.h != null) {
            yjdVar.g(serialDescriptor, 7, auu0.a, card.h);
        }
        if (yjdVar.F() || card.i != null) {
            yjdVar.g(serialDescriptor, 8, auu0.a, card.i);
        }
        if (yjdVar.F() || card.j != VerifyStrategy.UNKNOWN) {
            yjdVar.e(serialDescriptor, 9, (KSerializer) p[9].getValue(), card.j);
        }
        if (yjdVar.F() || card.k != null) {
            yjdVar.g(serialDescriptor, 10, Card$Family$$serializer.INSTANCE, card.k);
        }
        if (yjdVar.F() || card.l != null) {
            yjdVar.g(serialDescriptor, 11, auu0.a, card.l);
        }
        if (yjdVar.F() || card.m != null) {
            yjdVar.g(serialDescriptor, 12, z96.a, card.m);
        }
        if (yjdVar.F() || card.n != null) {
            yjdVar.g(serialDescriptor, 13, CardProfile$$serializer.INSTANCE, card.n);
        }
        if (!yjdVar.F() && card.o == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 14, Availability$$serializer.INSTANCE, card.o);
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.b;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getI() {
        return this.o;
    }

    /* renamed from: d, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: e, reason: from getter */
    public final String getL() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return jl40.l(this.a, card.a) && jl40.l(this.b, card.b) && jl40.l(this.c, card.c) && jl40.l(this.d, card.d) && this.e == card.e && jl40.l(this.f, card.f) && jl40.l(this.g, card.g) && jl40.l(this.h, card.h) && jl40.l(this.i, card.i) && this.j == card.j && jl40.l(this.k, card.k) && jl40.l(this.l, card.l) && jl40.l(this.m, card.m) && jl40.l(this.n, card.n) && jl40.l(this.o, card.o);
    }

    /* renamed from: f, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: g, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: h, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode2 = (this.j.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Family family = this.k;
        int hashCode3 = (hashCode2 + (family == null ? 0 : family.hashCode())) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        CardProfile cardProfile = this.n;
        int hashCode6 = (hashCode5 + (cardProfile == null ? 0 : cardProfile.hashCode())) * 31;
        Availability availability = this.o;
        return hashCode6 + (availability != null ? availability.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Family getK() {
        return this.k;
    }

    /* renamed from: j, reason: from getter */
    public final Boolean getM() {
        return this.m;
    }

    public final String k() {
        return this.b;
    }

    /* renamed from: l, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: m, reason: from getter */
    public final CardProfile getN() {
        return this.n;
    }

    /* renamed from: n, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: o, reason: from getter */
    public final VerifyStrategy getJ() {
        return this.j;
    }

    public final String toString() {
        StringBuilder v = b64.v("Card(currency=", this.a, ", id=", this.b, ", number=");
        g8e.D(v, this.c, ", system=", this.d, ", isBusy=");
        unr0.A(", expYear=", this.f, ", expMonth=", v, this.e);
        g8e.D(v, this.g, ", expTime=", this.h, ", cardIcon=");
        v.append(this.i);
        v.append(", verifyStrategy=");
        v.append(this.j);
        v.append(", family=");
        v.append(this.k);
        v.append(", description=");
        v.append(this.l);
        v.append(", hasLimits=");
        v.append(this.m);
        v.append(", profile=");
        v.append(this.n);
        v.append(", availability=");
        v.append(this.o);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Card$Family;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Family {
        public static final t Companion = new t();
        public final boolean a;
        public final String b;

        public /* synthetic */ Family(int i, String str, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Family)) {
                return false;
            }
            Family family = (Family) obj;
            return this.a == family.a && jl40.l(this.b, family.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return xvz.m("Family(isOwner=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
        }

        public Family() {
            this.a = false;
            this.b = null;
        }
    }

    public Card() {
        VerifyStrategy verifyStrategy = VerifyStrategy.UNKNOWN;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = false;
        this.f = "";
        this.g = "";
        this.h = null;
        this.i = null;
        this.j = verifyStrategy;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
    }
}
