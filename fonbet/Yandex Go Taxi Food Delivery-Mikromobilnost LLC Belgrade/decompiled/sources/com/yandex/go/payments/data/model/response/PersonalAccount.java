package com.yandex.go.payments.data.model.response;

import defpackage.ak80;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k2a0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.l1b0;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.t7a0;
import defpackage.t9a0;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount;", "Lk2a0;", "Companion", "com/yandex/go/payments/data/model/response/k1", "Discount", "PaymentOrder", "ComplementAttributes", "ScreenDetails", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PersonalAccount implements k2a0 {
    public static final k1 Companion = new k1();
    public static final PersonalAccount l = new PersonalAccount(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ief f;
    public final boolean g;
    public final boolean h;
    public final ComplementAttributes i;
    public final Availability j;
    public final String k;

    public /* synthetic */ PersonalAccount(int i, String str, String str2, String str3, String str4, String str5, ief iefVar, boolean z, boolean z2, ComplementAttributes complementAttributes, Availability availability, String str6) {
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
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = complementAttributes;
        }
        if ((i & 512) == 0) {
            this.j = Availability.d;
        } else {
            this.j = availability;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getO() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalAccount)) {
            return false;
        }
        PersonalAccount personalAccount = (PersonalAccount) obj;
        return jl40.l(this.a, personalAccount.a) && jl40.l(this.b, personalAccount.b) && jl40.l(this.c, personalAccount.c) && jl40.l(this.d, personalAccount.d) && jl40.l(this.e, personalAccount.e) && jl40.l(this.f, personalAccount.f) && this.g == personalAccount.g && this.h == personalAccount.h && jl40.l(this.i, personalAccount.i) && jl40.l(this.j, personalAccount.j) && jl40.l(this.k, personalAccount.k);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ief iefVar = this.f;
        int e = unr0.e(unr0.e((hashCode + (iefVar == null ? 0 : iefVar.hashCode())) * 31, 31, this.g), 31, this.h);
        ComplementAttributes complementAttributes = this.i;
        int hashCode2 = (this.j.hashCode() + ((e + (complementAttributes == null ? 0 : complementAttributes.hashCode())) * 31)) * 31;
        String str2 = this.k;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalAccount(id=", this.a, ", name=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", moneyLeftAsStr=", this.d, ", moneyLeftAsDecimal=");
        v.append(this.e);
        v.append(", currencyRulesDto=");
        v.append(this.f);
        v.append(", paymentAvailable=");
        nnm.v(", isComplement=", ", complementAttributes=", v, this.g, this.h);
        v.append(this.i);
        v.append(", availability=");
        v.append(this.j);
        v.append(", nameMenu=");
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$ScreenDetails;", "", "Companion", "GlyphType", "$serializer", "com/yandex/go/payments/data/model/response/p1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ScreenDetails {
        public static final p1 Companion = new p1();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(28))};
        public final String a;
        public final String b;
        public final GlyphType c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$ScreenDetails$GlyphType;", "", "Companion", "com/yandex/go/payments/data/model/response/q1", "DEFAULT_PLUS", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes5.dex */
        public static final class GlyphType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ GlyphType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final q1 Companion;
            public static final GlyphType DEFAULT_PLUS;
            public static final GlyphType NONE;

            static {
                GlyphType glyphType = new GlyphType("DEFAULT_PLUS", 0);
                DEFAULT_PLUS = glyphType;
                GlyphType glyphType2 = new GlyphType(JCP.RAW_PREFIX, 1);
                NONE = glyphType2;
                GlyphType[] glyphTypeArr = {glyphType, glyphType2};
                $VALUES = glyphTypeArr;
                $ENTRIES = kotlin.enums.a.a(glyphTypeArr);
                Companion = new q1();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(29));
            }

            public static GlyphType valueOf(String str) {
                return (GlyphType) Enum.valueOf(GlyphType.class, str);
            }

            public static GlyphType[] values() {
                return (GlyphType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ ScreenDetails(int i, String str, String str2, GlyphType glyphType) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = GlyphType.NONE;
            } else {
                this.c = glyphType;
            }
        }

        public ScreenDetails() {
            GlyphType glyphType = GlyphType.NONE;
            this.a = null;
            this.b = null;
            this.c = glyphType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$Discount;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/m1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Discount {
        public static final m1 Companion = new m1();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Discount(int i, String str, String str2, String str3, String str4) {
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
        }

        public Discount() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$PaymentOrder;", "", "Companion", "Status", "$serializer", "com/yandex/go/payments/data/model/response/n1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class PaymentOrder {
        public static final n1 Companion = new n1();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(26)), null};
        public final String a;
        public final String b;
        public final Status c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$PaymentOrder$Status;", "", "Companion", "com/yandex/go/payments/data/model/response/o1", "NOT_FOUND", com.samsung.android.sdk.samsungpay.v2.card.Card.EXPIRED, "PROCESSING", "FAILED", "SUCCEEDED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Status {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final o1 Companion;
            public static final Status EXPIRED;
            public static final Status FAILED;
            public static final Status NOT_FOUND;
            public static final Status PROCESSING;
            public static final Status SUCCEEDED;
            public static final Status UNKNOWN;

            static {
                Status status = new Status("NOT_FOUND", 0);
                NOT_FOUND = status;
                Status status2 = new Status(com.samsung.android.sdk.samsungpay.v2.card.Card.EXPIRED, 1);
                EXPIRED = status2;
                Status status3 = new Status("PROCESSING", 2);
                PROCESSING = status3;
                Status status4 = new Status("FAILED", 3);
                FAILED = status4;
                Status status5 = new Status("SUCCEEDED", 4);
                SUCCEEDED = status5;
                Status status6 = new Status("UNKNOWN", 5);
                UNKNOWN = status6;
                Status[] statusArr = {status, status2, status3, status4, status5, status6};
                $VALUES = statusArr;
                $ENTRIES = kotlin.enums.a.a(statusArr);
                Companion = new o1();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(27));
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public /* synthetic */ PaymentOrder(int i, String str, String str2, Status status, String str3) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = Status.UNKNOWN;
            } else {
                this.c = status;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
        }

        public PaymentOrder() {
            Status status = Status.UNKNOWN;
            this.a = "";
            this.b = null;
            this.c = status;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PersonalAccount$ComplementAttributes;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/l1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ComplementAttributes {
        public static final l1 Companion = new l1();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(1))};
        public final String a;
        public final String b;
        public final jsq0 c;
        public final i3y d;

        public /* synthetic */ ComplementAttributes(int i, String str, String str2, jsq0 jsq0Var) {
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
                this.c = ksq0.a;
            } else {
                this.c = jsq0Var;
            }
            this.d = kotlin.a.a(new t9a0(7, this));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComplementAttributes)) {
                return false;
            }
            ComplementAttributes complementAttributes = (ComplementAttributes) obj;
            return jl40.l(this.a, complementAttributes.a) && jl40.l(this.b, complementAttributes.b) && jl40.l(this.c, complementAttributes.c);
        }

        public final int hashCode() {
            String str = this.a;
            return this.c.a.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder v = b64.v("ComplementAttributes(name=", this.a, ", description=", this.b, ", nullablePaymentTypes=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public ComplementAttributes() {
            jsq0 jsq0Var = ksq0.a;
            this.a = "";
            this.b = "";
            this.c = jsq0Var;
            this.d = kotlin.a.a(new ak80(27, this));
        }
    }

    public PersonalAccount(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = true;
        this.h = false;
        this.i = null;
        this.j = Availability.d;
        this.k = null;
    }

    public PersonalAccount() {
        this(0);
    }
}
