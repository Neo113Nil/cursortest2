package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/dto/response/Action$ChargersDiscounts", "Lcom/yandex/go/dto/response/q1;", "Companion", "ChargersDiscountIdentifierDto", "ChargersDiscountType", "$serializer", "com/yandex/go/dto/response/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$ChargersDiscounts extends q1 {
    public static final d Companion = new d();
    public final ChargersDiscountIdentifierDto a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dto/response/Action$ChargersDiscounts$ChargersDiscountType;", "", "Companion", "com/yandex/go/dto/response/c", "PROMOCODE", "DISCOUNT", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ChargersDiscountType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChargersDiscountType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final ChargersDiscountType DISCOUNT;
        public static final ChargersDiscountType PROMOCODE;
        public static final ChargersDiscountType UNKNOWN;

        static {
            ChargersDiscountType chargersDiscountType = new ChargersDiscountType("PROMOCODE", 0);
            PROMOCODE = chargersDiscountType;
            ChargersDiscountType chargersDiscountType2 = new ChargersDiscountType("DISCOUNT", 1);
            DISCOUNT = chargersDiscountType2;
            ChargersDiscountType chargersDiscountType3 = new ChargersDiscountType("UNKNOWN", 2);
            UNKNOWN = chargersDiscountType3;
            ChargersDiscountType[] chargersDiscountTypeArr = {chargersDiscountType, chargersDiscountType2, chargersDiscountType3};
            $VALUES = chargersDiscountTypeArr;
            $ENTRIES = kotlin.enums.a.a(chargersDiscountTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(21));
        }

        public static ChargersDiscountType valueOf(String str) {
            return (ChargersDiscountType) Enum.valueOf(ChargersDiscountType.class, str);
        }

        public static ChargersDiscountType[] values() {
            return (ChargersDiscountType[]) $VALUES.clone();
        }
    }

    public Action$ChargersDiscounts(int i, ChargersDiscountIdentifierDto chargersDiscountIdentifierDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersDiscountIdentifierDto;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CHARGERS_DISCOUNTS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$ChargersDiscounts) && jl40.l(this.a, ((Action$ChargersDiscounts) obj).a);
    }

    public final int hashCode() {
        ChargersDiscountIdentifierDto chargersDiscountIdentifierDto = this.a;
        if (chargersDiscountIdentifierDto == null) {
            return 0;
        }
        return chargersDiscountIdentifierDto.hashCode();
    }

    public final String toString() {
        return "ChargersDiscounts(discount=" + this.a + Extension.C_BRAKE;
    }

    public Action$ChargersDiscounts() {
        this.a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$ChargersDiscounts$ChargersDiscountIdentifierDto;", "", "Companion", "$serializer", "com/yandex/go/dto/response/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class ChargersDiscountIdentifierDto {
        public static final b Companion = new b();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(20)), null};
        public final ChargersDiscountType a;
        public final String b;

        public /* synthetic */ ChargersDiscountIdentifierDto(int i, ChargersDiscountType chargersDiscountType, String str) {
            this.a = (i & 1) == 0 ? ChargersDiscountType.UNKNOWN : chargersDiscountType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final ChargersDiscountType getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChargersDiscountIdentifierDto)) {
                return false;
            }
            ChargersDiscountIdentifierDto chargersDiscountIdentifierDto = (ChargersDiscountIdentifierDto) obj;
            return this.a == chargersDiscountIdentifierDto.a && jl40.l(this.b, chargersDiscountIdentifierDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChargersDiscountIdentifierDto(type=" + this.a + ", id=" + this.b + Extension.C_BRAKE;
        }

        public ChargersDiscountIdentifierDto() {
            this.a = ChargersDiscountType.UNKNOWN;
            this.b = "";
        }
    }
}
