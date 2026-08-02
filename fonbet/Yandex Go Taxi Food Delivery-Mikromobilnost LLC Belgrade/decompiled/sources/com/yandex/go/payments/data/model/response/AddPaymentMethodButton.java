package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import defpackage.ar;
import defpackage.b64;
import defpackage.c20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton;", "", "Companion", "AddButtonType", "AddButtonFlow", "$serializer", "com/yandex/go/payments/data/model/response/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AddPaymentMethodButton {
    public static final f Companion = new f();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final AddButtonType c;
    public final String d;
    public final AddButtonFlow e;
    public final AddSbpTokenButtonDto.StateType f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton$AddButtonType;", "", "Companion", "com/yandex/go/payments/data/model/response/e", "MBANK_ACCOUNT", "SBP_TOKEN", "YAPE_TOKEN", "TRANSPORT_CARD", "TRANSPORT_EXTERNAL", "NEQUI_TOKEN", "FASTSHIFT_ACCOUNT", "JAZZCASH_WALLET", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AddButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final e Companion;
        public static final AddButtonType FASTSHIFT_ACCOUNT;
        public static final AddButtonType JAZZCASH_WALLET;
        public static final AddButtonType MBANK_ACCOUNT;
        public static final AddButtonType NEQUI_TOKEN;
        public static final AddButtonType SBP_TOKEN;
        public static final AddButtonType TRANSPORT_CARD;
        public static final AddButtonType TRANSPORT_EXTERNAL;
        public static final AddButtonType UNKNOWN;
        public static final AddButtonType YAPE_TOKEN;

        static {
            AddButtonType addButtonType = new AddButtonType("MBANK_ACCOUNT", 0);
            MBANK_ACCOUNT = addButtonType;
            AddButtonType addButtonType2 = new AddButtonType("SBP_TOKEN", 1);
            SBP_TOKEN = addButtonType2;
            AddButtonType addButtonType3 = new AddButtonType("YAPE_TOKEN", 2);
            YAPE_TOKEN = addButtonType3;
            AddButtonType addButtonType4 = new AddButtonType("TRANSPORT_CARD", 3);
            TRANSPORT_CARD = addButtonType4;
            AddButtonType addButtonType5 = new AddButtonType("TRANSPORT_EXTERNAL", 4);
            TRANSPORT_EXTERNAL = addButtonType5;
            AddButtonType addButtonType6 = new AddButtonType("NEQUI_TOKEN", 5);
            NEQUI_TOKEN = addButtonType6;
            AddButtonType addButtonType7 = new AddButtonType("FASTSHIFT_ACCOUNT", 6);
            FASTSHIFT_ACCOUNT = addButtonType7;
            AddButtonType addButtonType8 = new AddButtonType("JAZZCASH_WALLET", 7);
            JAZZCASH_WALLET = addButtonType8;
            AddButtonType addButtonType9 = new AddButtonType("UNKNOWN", 8);
            UNKNOWN = addButtonType9;
            AddButtonType[] addButtonTypeArr = {addButtonType, addButtonType2, addButtonType3, addButtonType4, addButtonType5, addButtonType6, addButtonType7, addButtonType8, addButtonType9};
            $VALUES = addButtonTypeArr;
            $ENTRIES = kotlin.enums.a.a(addButtonTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(18));
        }

        public static AddButtonType valueOf(String str) {
            return (AddButtonType) Enum.valueOf(AddButtonType.class, str);
        }

        public static AddButtonType[] values() {
            return (AddButtonType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new c20(19)), null, null, kotlin.a.b(lazyThreadSafetyMode, new c20(20))};
    }

    public /* synthetic */ AddPaymentMethodButton(int i, String str, String str2, AddButtonType addButtonType, String str3, AddButtonFlow addButtonFlow, AddSbpTokenButtonDto.StateType stateType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = AddButtonType.UNKNOWN;
        } else {
            this.c = addButtonType;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = new AddButtonFlow(0);
        } else {
            this.e = addButtonFlow;
        }
        if ((i & 32) == 0) {
            this.f = AddSbpTokenButtonDto.StateType.DISABLED;
        } else {
            this.f = stateType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPaymentMethodButton)) {
            return false;
        }
        AddPaymentMethodButton addPaymentMethodButton = (AddPaymentMethodButton) obj;
        return jl40.l(this.a, addPaymentMethodButton.a) && jl40.l(this.b, addPaymentMethodButton.b) && this.c == addPaymentMethodButton.c && jl40.l(this.d, addPaymentMethodButton.d) && jl40.l(this.e, addPaymentMethodButton.e) && this.f == addPaymentMethodButton.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddPaymentMethodButton(title=", this.a, ", subtitle=", this.b, ", type=");
        v.append(this.c);
        v.append(", iconTag=");
        v.append(this.d);
        v.append(", flow=");
        v.append(this.e);
        v.append(", stateType=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton$AddButtonFlow;", "", "Companion", "AddButtonFlowType", "$serializer", "com/yandex/go/payments/data/model/response/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class AddButtonFlow {
        public static final d Companion = new d();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(21)), null, null};
        public final AddButtonFlowType a;
        public final String b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton$AddButtonFlow$AddButtonFlowType;", "", "Companion", "com/yandex/go/payments/data/model/response/c", "DEEPLINK", "TRANSPORT_EXTERNAL", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AddButtonFlowType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ AddButtonFlowType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
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
                $ENTRIES = kotlin.enums.a.a(addButtonFlowTypeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(22));
            }

            public static AddButtonFlowType valueOf(String str) {
                return (AddButtonFlowType) Enum.valueOf(AddButtonFlowType.class, str);
            }

            public static AddButtonFlowType[] values() {
                return (AddButtonFlowType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AddButtonFlow(int i, AddButtonFlowType addButtonFlowType, String str, String str2) {
            this.a = (i & 1) == 0 ? AddButtonFlowType.UNKNOWN : addButtonFlowType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
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
            this(0);
        }

        public AddButtonFlow(int i) {
            this.a = AddButtonFlowType.UNKNOWN;
            this.b = null;
            this.c = null;
        }
    }

    public AddPaymentMethodButton() {
        AddButtonType addButtonType = AddButtonType.UNKNOWN;
        AddButtonFlow addButtonFlow = new AddButtonFlow(0);
        AddSbpTokenButtonDto.StateType stateType = AddSbpTokenButtonDto.StateType.DISABLED;
        this.a = "";
        this.b = null;
        this.c = addButtonType;
        this.d = null;
        this.e = addButtonFlow;
        this.f = stateType;
    }
}
