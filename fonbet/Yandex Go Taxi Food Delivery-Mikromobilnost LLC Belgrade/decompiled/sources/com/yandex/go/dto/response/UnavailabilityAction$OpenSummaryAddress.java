package com.yandex.go.dto.response;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/dto/response/UnavailabilityAction$OpenSummaryAddress", "Lcom/yandex/go/dto/response/d2;", "Companion", "FocusField", "$serializer", "com/yandex/go/dto/response/a2", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnavailabilityAction$OpenSummaryAddress extends d2 {
    public static final a2 Companion = new a2();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(11))};
    public final FocusField a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dto/response/UnavailabilityAction$OpenSummaryAddress$FocusField;", "", "Companion", "com/yandex/go/dto/response/b2", "SOURCE", "DESTINATION", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class FocusField {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FocusField[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b2 Companion;
        public static final FocusField DESTINATION;
        public static final FocusField SOURCE;
        public static final FocusField UNKNOWN;

        static {
            FocusField focusField = new FocusField("SOURCE", 0);
            SOURCE = focusField;
            FocusField focusField2 = new FocusField("DESTINATION", 1);
            DESTINATION = focusField2;
            FocusField focusField3 = new FocusField("UNKNOWN", 2);
            UNKNOWN = focusField3;
            FocusField[] focusFieldArr = {focusField, focusField2, focusField3};
            $VALUES = focusFieldArr;
            $ENTRIES = kotlin.enums.a.a(focusFieldArr);
            Companion = new b2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(14));
        }

        public static FocusField valueOf(String str) {
            return (FocusField) Enum.valueOf(FocusField.class, str);
        }

        public static FocusField[] values() {
            return (FocusField[]) $VALUES.clone();
        }
    }

    public UnavailabilityAction$OpenSummaryAddress(int i, FocusField focusField) {
        if ((i & 1) == 0) {
            this.a = FocusField.UNKNOWN;
        } else {
            this.a = focusField;
        }
    }

    @Override // com.yandex.go.dto.response.d2
    public final UnavailabilityActionType a() {
        return UnavailabilityActionType.OPEN_SUMMARY_ADDRESS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnavailabilityAction$OpenSummaryAddress) && this.a == ((UnavailabilityAction$OpenSummaryAddress) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSummaryAddress(focusField=" + this.a + Extension.C_BRAKE;
    }

    public UnavailabilityAction$OpenSummaryAddress() {
        this.a = FocusField.UNKNOWN;
    }
}
