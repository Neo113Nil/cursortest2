package com.yandex.go.taxi.order.models.api.feedback;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.z2y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderSelectedTipsChoiceState;", "", "Companion", "TaxiOrderTipsChoiceType", "TaxiOrderTipsValueType", "$serializer", "com/yandex/go/taxi/order/models/api/feedback/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderSelectedTipsChoiceState {
    public static final b Companion = new b();
    public static final i3y[] d;
    public final TaxiOrderTipsChoiceType a;
    public final TaxiOrderTipsValueType b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderSelectedTipsChoiceState$TaxiOrderTipsChoiceType;", "", "Companion", "com/yandex/go/taxi/order/models/api/feedback/c", "VALUE_CHOICE", "CUSTOM_CHOICE", "PREFERRED_CHOICE", "ZERO_CHOICE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TaxiOrderTipsChoiceType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TaxiOrderTipsChoiceType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TaxiOrderTipsChoiceType CUSTOM_CHOICE;
        public static final c Companion;
        public static final TaxiOrderTipsChoiceType PREFERRED_CHOICE;
        public static final TaxiOrderTipsChoiceType VALUE_CHOICE;
        public static final TaxiOrderTipsChoiceType ZERO_CHOICE;

        static {
            TaxiOrderTipsChoiceType taxiOrderTipsChoiceType = new TaxiOrderTipsChoiceType("VALUE_CHOICE", 0);
            VALUE_CHOICE = taxiOrderTipsChoiceType;
            TaxiOrderTipsChoiceType taxiOrderTipsChoiceType2 = new TaxiOrderTipsChoiceType("CUSTOM_CHOICE", 1);
            CUSTOM_CHOICE = taxiOrderTipsChoiceType2;
            TaxiOrderTipsChoiceType taxiOrderTipsChoiceType3 = new TaxiOrderTipsChoiceType("PREFERRED_CHOICE", 2);
            PREFERRED_CHOICE = taxiOrderTipsChoiceType3;
            TaxiOrderTipsChoiceType taxiOrderTipsChoiceType4 = new TaxiOrderTipsChoiceType("ZERO_CHOICE", 3);
            ZERO_CHOICE = taxiOrderTipsChoiceType4;
            TaxiOrderTipsChoiceType[] taxiOrderTipsChoiceTypeArr = {taxiOrderTipsChoiceType, taxiOrderTipsChoiceType2, taxiOrderTipsChoiceType3, taxiOrderTipsChoiceType4};
            $VALUES = taxiOrderTipsChoiceTypeArr;
            $ENTRIES = kotlin.enums.a.a(taxiOrderTipsChoiceTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(26));
        }

        public static TaxiOrderTipsChoiceType valueOf(String str) {
            return (TaxiOrderTipsChoiceType) Enum.valueOf(TaxiOrderTipsChoiceType.class, str);
        }

        public static TaxiOrderTipsChoiceType[] values() {
            return (TaxiOrderTipsChoiceType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderSelectedTipsChoiceState$TaxiOrderTipsValueType;", "", "Companion", "com/yandex/go/taxi/order/models/api/feedback/d", "FLAT", "PERCENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TaxiOrderTipsValueType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TaxiOrderTipsValueType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final TaxiOrderTipsValueType FLAT;
        public static final TaxiOrderTipsValueType PERCENT;

        static {
            TaxiOrderTipsValueType taxiOrderTipsValueType = new TaxiOrderTipsValueType("FLAT", 0);
            FLAT = taxiOrderTipsValueType;
            TaxiOrderTipsValueType taxiOrderTipsValueType2 = new TaxiOrderTipsValueType("PERCENT", 1);
            PERCENT = taxiOrderTipsValueType2;
            TaxiOrderTipsValueType[] taxiOrderTipsValueTypeArr = {taxiOrderTipsValueType, taxiOrderTipsValueType2};
            $VALUES = taxiOrderTipsValueTypeArr;
            $ENTRIES = kotlin.enums.a.a(taxiOrderTipsValueTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(27));
        }

        public static TaxiOrderTipsValueType valueOf(String str) {
            return (TaxiOrderTipsValueType) Enum.valueOf(TaxiOrderTipsValueType.class, str);
        }

        public static TaxiOrderTipsValueType[] values() {
            return (TaxiOrderTipsValueType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z2y0(24)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(25)), null};
    }

    public /* synthetic */ TaxiOrderSelectedTipsChoiceState(int i, TaxiOrderTipsChoiceType taxiOrderTipsChoiceType, TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = taxiOrderTipsChoiceType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = taxiOrderTipsValueType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public static TaxiOrderSelectedTipsChoiceState a(TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState, TaxiOrderTipsValueType taxiOrderTipsValueType, String str, int i) {
        TaxiOrderTipsChoiceType taxiOrderTipsChoiceType = taxiOrderSelectedTipsChoiceState.a;
        if ((i & 2) != 0) {
            taxiOrderTipsValueType = taxiOrderSelectedTipsChoiceState.b;
        }
        if ((i & 4) != 0) {
            str = taxiOrderSelectedTipsChoiceState.c;
        }
        taxiOrderSelectedTipsChoiceState.getClass();
        return new TaxiOrderSelectedTipsChoiceState(taxiOrderTipsChoiceType, taxiOrderTipsValueType, str);
    }

    /* renamed from: b, reason: from getter */
    public final TaxiOrderTipsValueType getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderSelectedTipsChoiceState)) {
            return false;
        }
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = (TaxiOrderSelectedTipsChoiceState) obj;
        return this.a == taxiOrderSelectedTipsChoiceState.a && this.b == taxiOrderSelectedTipsChoiceState.b && jl40.l(this.c, taxiOrderSelectedTipsChoiceState.c);
    }

    public final int hashCode() {
        TaxiOrderTipsChoiceType taxiOrderTipsChoiceType = this.a;
        int hashCode = (taxiOrderTipsChoiceType == null ? 0 : taxiOrderTipsChoiceType.hashCode()) * 31;
        TaxiOrderTipsValueType taxiOrderTipsValueType = this.b;
        int hashCode2 = (hashCode + (taxiOrderTipsValueType == null ? 0 : taxiOrderTipsValueType.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderSelectedTipsChoiceState(selectedChoiceType=");
        sb.append(this.a);
        sb.append(", selectedTipsType=");
        sb.append(this.b);
        sb.append(", selectedTipsValue=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxiOrderSelectedTipsChoiceState() {
        this(7, (TaxiOrderTipsValueType) null, (String) (0 == true ? 1 : 0));
    }

    public TaxiOrderSelectedTipsChoiceState(TaxiOrderTipsChoiceType taxiOrderTipsChoiceType, TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        this.a = taxiOrderTipsChoiceType;
        this.b = taxiOrderTipsValueType;
        this.c = str;
    }

    public /* synthetic */ TaxiOrderSelectedTipsChoiceState(int i, TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        this((TaxiOrderTipsChoiceType) null, (i & 2) != 0 ? null : taxiOrderTipsValueType, (i & 4) != 0 ? null : str);
    }
}
