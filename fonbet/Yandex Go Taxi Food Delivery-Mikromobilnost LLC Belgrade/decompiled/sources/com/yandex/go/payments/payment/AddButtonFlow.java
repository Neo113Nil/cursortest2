package com.yandex.go.payments.payment;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class AddButtonFlow {
    public final AddButtonFlowType a;
    public final String b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/payment/AddButtonFlow$AddButtonFlowType;", "", "DEEPLINK", "TRANSPORT_EXTERNAL", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AddButtonFlowType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddButtonFlowType[] $VALUES;
        public static final AddButtonFlowType DEEPLINK;
        public static final AddButtonFlowType TRANSPORT_EXTERNAL;
        public static final AddButtonFlowType UNKNOWN;

        static {
            AddButtonFlowType addButtonFlowType = new AddButtonFlowType("DEEPLINK", 0);
            DEEPLINK = addButtonFlowType;
            AddButtonFlowType addButtonFlowType2 = new AddButtonFlowType("TRANSPORT_EXTERNAL", 1);
            TRANSPORT_EXTERNAL = addButtonFlowType2;
            AddButtonFlowType addButtonFlowType3 = new AddButtonFlowType("UNKNOWN", 2);
            UNKNOWN = addButtonFlowType3;
            AddButtonFlowType[] addButtonFlowTypeArr = {addButtonFlowType, addButtonFlowType2, addButtonFlowType3};
            $VALUES = addButtonFlowTypeArr;
            $ENTRIES = a.a(addButtonFlowTypeArr);
        }

        public static AddButtonFlowType valueOf(String str) {
            return (AddButtonFlowType) Enum.valueOf(AddButtonFlowType.class, str);
        }

        public static AddButtonFlowType[] values() {
            return (AddButtonFlowType[]) $VALUES.clone();
        }
    }

    public AddButtonFlow(AddButtonFlowType addButtonFlowType, String str, String str2) {
        this.a = addButtonFlowType;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final AddButtonFlowType c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddButtonFlow)) {
            return false;
        }
        AddButtonFlow addButtonFlow = (AddButtonFlow) obj;
        return this.a == addButtonFlow.a && jl40.l(this.b, addButtonFlow.b) && jl40.l(this.c, addButtonFlow.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddButtonFlow(type=");
        sb.append(this.a);
        sb.append(", deeplink=");
        sb.append(this.b);
        sb.append(", provider=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public AddButtonFlow() {
        this(AddButtonFlowType.UNKNOWN, null, null);
    }
}
