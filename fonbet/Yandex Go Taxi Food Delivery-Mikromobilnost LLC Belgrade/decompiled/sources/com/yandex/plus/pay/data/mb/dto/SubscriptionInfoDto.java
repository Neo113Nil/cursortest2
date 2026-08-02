package com.yandex.plus.pay.data.mb.dto;

import defpackage.bmu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.v0v0;
import defpackage.w0v0;
import defpackage.z0v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/SubscriptionInfoDto;", "", "Companion", "SubscriptionStatusDto", "a", "z0v0", "com/yandex/plus/pay/data/mb/dto/b", "v0v0", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubscriptionInfoDto {
    public static final v0v0 Companion = new v0v0();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(29)), null, null, null};
    public final SubscriptionStatusDto a;
    public final String b;
    public final a c;
    public final z0v0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/SubscriptionInfoDto$SubscriptionStatusDto;", "", "Companion", "com/yandex/plus/pay/data/mb/dto/c", "FAIL_3DS", "HOLD", "PAYMENT_FAILED", "REFUND", "WAIT_FOR_PAYMENT", "UNKNOWN", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @gsq0
    public static final class SubscriptionStatusDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SubscriptionStatusDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final SubscriptionStatusDto FAIL_3DS;
        public static final SubscriptionStatusDto HOLD;
        public static final SubscriptionStatusDto PAYMENT_FAILED;
        public static final SubscriptionStatusDto REFUND;
        public static final SubscriptionStatusDto UNKNOWN;
        public static final SubscriptionStatusDto WAIT_FOR_PAYMENT;

        static {
            SubscriptionStatusDto subscriptionStatusDto = new SubscriptionStatusDto("FAIL_3DS", 0);
            FAIL_3DS = subscriptionStatusDto;
            SubscriptionStatusDto subscriptionStatusDto2 = new SubscriptionStatusDto("HOLD", 1);
            HOLD = subscriptionStatusDto2;
            SubscriptionStatusDto subscriptionStatusDto3 = new SubscriptionStatusDto("PAYMENT_FAILED", 2);
            PAYMENT_FAILED = subscriptionStatusDto3;
            SubscriptionStatusDto subscriptionStatusDto4 = new SubscriptionStatusDto("REFUND", 3);
            REFUND = subscriptionStatusDto4;
            SubscriptionStatusDto subscriptionStatusDto5 = new SubscriptionStatusDto("WAIT_FOR_PAYMENT", 4);
            WAIT_FOR_PAYMENT = subscriptionStatusDto5;
            SubscriptionStatusDto subscriptionStatusDto6 = new SubscriptionStatusDto("UNKNOWN", 5);
            UNKNOWN = subscriptionStatusDto6;
            SubscriptionStatusDto[] subscriptionStatusDtoArr = {subscriptionStatusDto, subscriptionStatusDto2, subscriptionStatusDto3, subscriptionStatusDto4, subscriptionStatusDto5, subscriptionStatusDto6};
            $VALUES = subscriptionStatusDtoArr;
            $ENTRIES = kotlin.enums.a.a(subscriptionStatusDtoArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(0));
        }

        public static SubscriptionStatusDto valueOf(String str) {
            return (SubscriptionStatusDto) Enum.valueOf(SubscriptionStatusDto.class, str);
        }

        public static SubscriptionStatusDto[] values() {
            return (SubscriptionStatusDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SubscriptionInfoDto(int i, SubscriptionStatusDto subscriptionStatusDto, String str, a aVar, z0v0 z0v0Var) {
        this.a = (i & 1) == 0 ? SubscriptionStatusDto.UNKNOWN : subscriptionStatusDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = z0v0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfoDto)) {
            return false;
        }
        SubscriptionInfoDto subscriptionInfoDto = (SubscriptionInfoDto) obj;
        return this.a == subscriptionInfoDto.a && jl40.l(this.b, subscriptionInfoDto.b) && jl40.l(this.c, subscriptionInfoDto.c) && jl40.l(this.d, subscriptionInfoDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        z0v0 z0v0Var = this.d;
        return hashCode3 + (z0v0Var != null ? z0v0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionInfoDto(status=" + this.a + ", statusCode=" + this.b + ", synchronizationState=" + this.c + ", trust3dsInfo=" + this.d + ')';
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/SubscriptionInfoDto$a;", "", "Companion", "com/yandex/plus/pay/data/mb/dto/d", "com/yandex/plus/pay/data/mb/dto/e", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {
        public static final e Companion = new e();
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public /* synthetic */ a(int i, boolean z, boolean z2, boolean z3, boolean z4) {
            if ((i & 1) == 0) {
                this.a = true;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = true;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = true;
            } else {
                this.c = z3;
            }
            if ((i & 8) == 0) {
                this.d = true;
            } else {
                this.d = z4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SynchronizationStateDto(ottSubscriptionSync=");
            sb.append(this.a);
            sb.append(", featuresSync=");
            sb.append(this.b);
            sb.append(", familyRoleSync=");
            sb.append(this.c);
            sb.append(", totalSync=");
            return unr0.u(sb, this.d, ')');
        }

        public a() {
            this.a = true;
            this.b = true;
            this.c = true;
            this.d = true;
        }
    }

    public SubscriptionInfoDto() {
        this.a = SubscriptionStatusDto.UNKNOWN;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
