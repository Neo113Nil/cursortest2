package com.yandex.go.payments.data.model.response;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.b9h;
import defpackage.dii;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k2a0;
import defpackage.k4o;
import defpackage.unr0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod;", "Lk2a0;", "Companion", "Details", "Display", "ClientType", "Type", "DisableReason", "com/yandex/go/payments/data/model/response/d0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeliveryPaymentMethod implements k2a0 {
    public static final d0 Companion = new d0();
    public final String a;
    public final Display b;
    public final Details c;
    public final Availability d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod$ClientType;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "com/yandex/go/payments/data/model/response/c0", "CORPCARD", "CONTRACT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ClientType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ClientType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ClientType CONTRACT;
        public static final ClientType CORPCARD;
        public static final c0 Companion;
        public static final ClientType UNKNOWN;
        private final String code;

        static {
            ClientType clientType = new ClientType("CORPCARD", 0, "corpcard");
            CORPCARD = clientType;
            ClientType clientType2 = new ClientType("CONTRACT", 1, "contract");
            CONTRACT = clientType2;
            ClientType clientType3 = new ClientType("UNKNOWN", 2, "unknown");
            UNKNOWN = clientType3;
            ClientType[] clientTypeArr = {clientType, clientType2, clientType3};
            $VALUES = clientTypeArr;
            $ENTRIES = kotlin.enums.a.a(clientTypeArr);
            Companion = new c0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(27));
        }

        public ClientType(String str, int i, String str2) {
            this.code = str2;
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod$Type;", "", "Companion", "com/yandex/go/payments/data/model/response/h0", "CARGO_CORP", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type CARGO_CORP;
        public static final h0 Companion;
        public static final Type UNSUPPORTED;

        static {
            Type type = new Type("CARGO_CORP", 0);
            CARGO_CORP = type;
            Type type2 = new Type("UNSUPPORTED", 1);
            UNSUPPORTED = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new h0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(1));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DeliveryPaymentMethod(int i, String str, Display display, Details details, Availability availability) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new Display(0);
        } else {
            this.b = display;
        }
        if ((i & 4) == 0) {
            this.c = new Details(0);
        } else {
            this.c = details;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = availability;
        }
    }

    @Override // defpackage.k2a0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.k2a0
    /* renamed from: b, reason: from getter */
    public final Availability getE() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaymentMethod)) {
            return false;
        }
        DeliveryPaymentMethod deliveryPaymentMethod = (DeliveryPaymentMethod) obj;
        return jl40.l(this.a, deliveryPaymentMethod.a) && jl40.l(this.b, deliveryPaymentMethod.b) && jl40.l(this.c, deliveryPaymentMethod.c) && jl40.l(this.d, deliveryPaymentMethod.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Availability availability = this.d;
        return hashCode + (availability == null ? 0 : availability.hashCode());
    }

    public final String toString() {
        return "DeliveryPaymentMethod(id=" + this.a + ", display=" + this.b + ", details=" + this.c + ", availability=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod$Details;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/e0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Details {
        public static final e0 Companion = new e0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(28))};
        public final ClientType a;

        public /* synthetic */ Details(int i, ClientType clientType) {
            if ((i & 1) == 0) {
                this.a = ClientType.UNKNOWN;
            } else {
                this.a = clientType;
            }
        }

        /* renamed from: a, reason: from getter */
        public final ClientType getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Details) && this.a == ((Details) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Details(type=" + this.a + Extension.C_BRAKE;
        }

        public Details() {
            this(0);
        }

        public Details(int i) {
            this.a = ClientType.UNKNOWN;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod$DisableReason;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/f0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class DisableReason {
        public static final f0 Companion = new f0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(29))};
        public final String a;
        public final String b;
        public final Map c;

        public /* synthetic */ DisableReason(int i, String str, String str2, Map map) {
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
                this.c = kotlin.collections.b.f();
            } else {
                this.c = map;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisableReason)) {
                return false;
            }
            DisableReason disableReason = (DisableReason) obj;
            return jl40.l(this.a, disableReason.a) && jl40.l(this.b, disableReason.b) && jl40.l(this.c, disableReason.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return b64.r(b64.v("DisableReason(code=", this.a, ", message=", this.b, ", details="), this.c, Extension.C_BRAKE);
        }

        public DisableReason() {
            Map f = kotlin.collections.b.f();
            this.a = "";
            this.b = "";
            this.c = f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/DeliveryPaymentMethod$Display;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/g0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Display {
        public static final g0 Companion = new g0();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(0)), null, null, null};
        public final Type a;
        public final String b;
        public final String c;
        public final DisableReason d;

        public /* synthetic */ Display(int i, Type type, String str, String str2, DisableReason disableReason) {
            this.a = (i & 1) == 0 ? Type.UNSUPPORTED : type;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = disableReason;
            }
        }

        /* renamed from: a, reason: from getter */
        public final DisableReason getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final Type getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return false;
            }
            Display display = (Display) obj;
            return this.a == display.a && jl40.l(this.b, display.b) && jl40.l(this.c, display.c) && jl40.l(this.d, display.d);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            DisableReason disableReason = this.d;
            return b + (disableReason == null ? 0 : disableReason.hashCode());
        }

        public final String toString() {
            return "Display(type=" + this.a + ", imageTag=" + this.b + ", title=" + this.c + ", disableReason=" + this.d + Extension.C_BRAKE;
        }

        public Display() {
            this(0);
        }

        public Display(int i) {
            this.a = Type.UNSUPPORTED;
            this.b = "";
            this.c = "";
            this.d = null;
        }
    }

    public DeliveryPaymentMethod() {
        Display display = new Display(0);
        Details details = new Details(0);
        this.a = "";
        this.b = display;
        this.c = details;
        this.d = null;
    }
}
