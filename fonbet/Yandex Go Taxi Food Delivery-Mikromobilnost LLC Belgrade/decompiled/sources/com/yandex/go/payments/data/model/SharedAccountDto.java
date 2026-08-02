package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mkr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/SharedAccountDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "Details", "MemberRole", "$serializer", "com/yandex/go/payments/data/model/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharedAccountDto extends u {
    public static final k0 Companion = new k0();
    public static final i3y[] k;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final ListPaymentMethodDtoType c;
    public final Details d;
    public final String e;
    public final String f;
    public final boolean g;
    public final MemberRole h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/SharedAccountDto$MemberRole;", "", "Companion", "com/yandex/go/payments/data/model/m0", "OWNER", "USER", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MemberRole {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MemberRole[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final m0 Companion;
        public static final MemberRole OWNER;
        public static final MemberRole UNKNOWN;
        public static final MemberRole USER;

        static {
            MemberRole memberRole = new MemberRole("OWNER", 0);
            OWNER = memberRole;
            MemberRole memberRole2 = new MemberRole("USER", 1);
            USER = memberRole2;
            MemberRole memberRole3 = new MemberRole("UNKNOWN", 2);
            UNKNOWN = memberRole3;
            MemberRole[] memberRoleArr = {memberRole, memberRole2, memberRole3};
            $VALUES = memberRoleArr;
            $ENTRIES = kotlin.enums.a.a(memberRoleArr);
            Companion = new m0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(9));
        }

        public static MemberRole valueOf(String str) {
            return (MemberRole) Enum.valueOf(MemberRole.class, str);
        }

        public static MemberRole[] values() {
            return (MemberRole[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new mkr0(7)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new mkr0(8)), null, null};
    }

    public SharedAccountDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, ListPaymentMethodDtoType listPaymentMethodDtoType, Details details, String str2, String str3, boolean z, MemberRole memberRole, boolean z2, boolean z3) {
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
            this.c = ListPaymentMethodDtoType.FAMILY_ACCOUNT;
        } else {
            this.c = listPaymentMethodDtoType;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = details;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = MemberRole.UNKNOWN;
        } else {
            this.h = memberRole;
        }
        if ((i & 256) == 0) {
            this.i = true;
        } else {
            this.i = z2;
        }
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z3;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/SharedAccountDto$Details;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Details {
        public static final l0 Companion = new l0();
        public final String a;
        public final String b;

        public /* synthetic */ Details(int i, String str, String str2) {
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
        }

        public Details() {
            this.a = null;
            this.b = null;
        }
    }

    public SharedAccountDto() {
        ListPaymentMethodDtoType listPaymentMethodDtoType = ListPaymentMethodDtoType.FAMILY_ACCOUNT;
        MemberRole memberRole = MemberRole.UNKNOWN;
        this.a = null;
        this.b = null;
        this.c = listPaymentMethodDtoType;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = memberRole;
        this.i = true;
        this.j = true;
    }
}
