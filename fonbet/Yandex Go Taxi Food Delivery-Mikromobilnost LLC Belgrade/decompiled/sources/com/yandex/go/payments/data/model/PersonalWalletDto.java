package com.yandex.go.payments.data.model;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.k4o;
import defpackage.z4b0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/data/model/PersonalWalletDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "Payment", "Discount", "PaymentOrder", "$serializer", "com/yandex/go/payments/data/model/d0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalWalletDto extends u {
    public static final d0 Companion = new d0();
    public static final i3y[] q;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final String d;
    public final String e;
    public final ief f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final List k;
    public final List l;
    public final boolean m;
    public final PersonalAccount.ComplementAttributes n;
    public final String o;
    public final String p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new i3y[]{null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z4b0(2)), kotlin.a.b(lazyThreadSafetyMode, new z4b0(3)), kotlin.a.b(lazyThreadSafetyMode, new z4b0(4)), null, null, null, null};
    }

    public PersonalWalletDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, String str3, String str4, ief iefVar, boolean z, boolean z2, boolean z3, List list, List list2, List list3, boolean z4, PersonalAccount.ComplementAttributes complementAttributes, String str5, String str6) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = true;
        } else {
            this.i = z3;
        }
        int i2 = i & 512;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.j = emptyList;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = emptyList;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = emptyList;
        } else {
            this.l = list3;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = complementAttributes;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str5;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = str6;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/PersonalWalletDto$Payment;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Payment {
        public static final f0 Companion = new f0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(5)), null};
        public final ListPaymentMethodDtoType a;
        public final String b;

        public /* synthetic */ Payment(int i, ListPaymentMethodDtoType listPaymentMethodDtoType, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = listPaymentMethodDtoType;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public Payment() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/PersonalWalletDto$Discount;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Discount {
        public static final e0 Companion = new e0();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Discount(int i, String str, String str2, String str3, String str4) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public Discount() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/PersonalWalletDto$PaymentOrder;", "", "Companion", "Status", "$serializer", "com/yandex/go/payments/data/model/g0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PaymentOrder {
        public static final g0 Companion = new g0();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(6)), null};
        public final String a;
        public final String b;
        public final Status c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/data/model/PersonalWalletDto$PaymentOrder$Status;", "", "Companion", "com/yandex/go/payments/data/model/h0", "NOT_FOUND", Card.EXPIRED, "PROCESSING", "FAILED", "SUCCEEDED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Status {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final h0 Companion;
            public static final Status EXPIRED;
            public static final Status FAILED;
            public static final Status NOT_FOUND;
            public static final Status PROCESSING;
            public static final Status SUCCEEDED;

            static {
                Status status = new Status("NOT_FOUND", 0);
                NOT_FOUND = status;
                Status status2 = new Status(Card.EXPIRED, 1);
                EXPIRED = status2;
                Status status3 = new Status("PROCESSING", 2);
                PROCESSING = status3;
                Status status4 = new Status("FAILED", 3);
                FAILED = status4;
                Status status5 = new Status("SUCCEEDED", 4);
                SUCCEEDED = status5;
                Status[] statusArr = {status, status2, status3, status4, status5};
                $VALUES = statusArr;
                $ENTRIES = kotlin.enums.a.a(statusArr);
                Companion = new h0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(7));
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public /* synthetic */ PaymentOrder(int i, String str, String str2, Status status, String str3) {
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
                this.c = null;
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
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public PersonalWalletDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = true;
        EmptyList emptyList = EmptyList.a;
        this.j = emptyList;
        this.k = emptyList;
        this.l = emptyList;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
