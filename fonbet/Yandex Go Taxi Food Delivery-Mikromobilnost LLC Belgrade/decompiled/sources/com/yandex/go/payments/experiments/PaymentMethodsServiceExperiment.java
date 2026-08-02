package com.yandex.go.payments.experiments;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/experiments/PaymentMethodsServiceExperiment;", "Lw96;", "Companion", "PaymentMethodsService", "LpmEntryPoint", "ServiceEndpoint", "com/yandex/go/payments/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsServiceExperiment extends w96 {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(12))};
    public static final PaymentMethodsServiceExperiment e = new PaymentMethodsServiceExperiment(0);
    public final boolean b;
    public final List c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/experiments/PaymentMethodsServiceExperiment$LpmEntryPoint;", "", "Companion", "com/yandex/go/payments/experiments/d", "DEBTS", "DRIVE", "PROFILE", "RIDE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LpmEntryPoint {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LpmEntryPoint[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final LpmEntryPoint DEBTS;
        public static final LpmEntryPoint DRIVE;
        public static final LpmEntryPoint PROFILE;
        public static final LpmEntryPoint RIDE;
        public static final LpmEntryPoint UNKNOWN;

        static {
            LpmEntryPoint lpmEntryPoint = new LpmEntryPoint("DEBTS", 0);
            DEBTS = lpmEntryPoint;
            LpmEntryPoint lpmEntryPoint2 = new LpmEntryPoint("DRIVE", 1);
            DRIVE = lpmEntryPoint2;
            LpmEntryPoint lpmEntryPoint3 = new LpmEntryPoint("PROFILE", 2);
            PROFILE = lpmEntryPoint3;
            LpmEntryPoint lpmEntryPoint4 = new LpmEntryPoint("RIDE", 3);
            RIDE = lpmEntryPoint4;
            LpmEntryPoint lpmEntryPoint5 = new LpmEntryPoint("UNKNOWN", 4);
            UNKNOWN = lpmEntryPoint5;
            LpmEntryPoint[] lpmEntryPointArr = {lpmEntryPoint, lpmEntryPoint2, lpmEntryPoint3, lpmEntryPoint4, lpmEntryPoint5};
            $VALUES = lpmEntryPointArr;
            $ENTRIES = kotlin.enums.a.a(lpmEntryPointArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(13));
        }

        public static LpmEntryPoint valueOf(String str) {
            return (LpmEntryPoint) Enum.valueOf(LpmEntryPoint.class, str);
        }

        public static LpmEntryPoint[] values() {
            return (LpmEntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/experiments/PaymentMethodsServiceExperiment$ServiceEndpoint;", "", "Companion", "com/yandex/go/payments/experiments/f", "LIST_PAYMENT_METHODS", "PAYMENT_METHODS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ServiceEndpoint {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ServiceEndpoint[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final ServiceEndpoint LIST_PAYMENT_METHODS;
        public static final ServiceEndpoint PAYMENT_METHODS;
        public static final ServiceEndpoint UNKNOWN;

        static {
            ServiceEndpoint serviceEndpoint = new ServiceEndpoint("LIST_PAYMENT_METHODS", 0);
            LIST_PAYMENT_METHODS = serviceEndpoint;
            ServiceEndpoint serviceEndpoint2 = new ServiceEndpoint("PAYMENT_METHODS", 1);
            PAYMENT_METHODS = serviceEndpoint2;
            ServiceEndpoint serviceEndpoint3 = new ServiceEndpoint("UNKNOWN", 2);
            UNKNOWN = serviceEndpoint3;
            ServiceEndpoint[] serviceEndpointArr = {serviceEndpoint, serviceEndpoint2, serviceEndpoint3};
            $VALUES = serviceEndpointArr;
            $ENTRIES = kotlin.enums.a.a(serviceEndpointArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(16));
        }

        public static ServiceEndpoint valueOf(String str) {
            return (ServiceEndpoint) Enum.valueOf(ServiceEndpoint.class, str);
        }

        public static ServiceEndpoint[] values() {
            return (ServiceEndpoint[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentMethodsServiceExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/experiments/PaymentMethodsServiceExperiment$PaymentMethodsService;", "", "Companion", "$serializer", "com/yandex/go/payments/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodsService {
        public static final e Companion = new e();
        public static final i3y[] c;
        public final LpmEntryPoint a;
        public final ServiceEndpoint b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new f9a0(14)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(15))};
        }

        public /* synthetic */ PaymentMethodsService(int i, LpmEntryPoint lpmEntryPoint, ServiceEndpoint serviceEndpoint) {
            this.a = (i & 1) == 0 ? LpmEntryPoint.UNKNOWN : lpmEntryPoint;
            if ((i & 2) == 0) {
                this.b = ServiceEndpoint.UNKNOWN;
            } else {
                this.b = serviceEndpoint;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodsService)) {
                return false;
            }
            PaymentMethodsService paymentMethodsService = (PaymentMethodsService) obj;
            return this.a == paymentMethodsService.a && this.b == paymentMethodsService.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PaymentMethodsService(entryPoint=" + this.a + ", serviceEndpoint=" + this.b + Extension.C_BRAKE;
        }

        public PaymentMethodsService(LpmEntryPoint lpmEntryPoint, ServiceEndpoint serviceEndpoint) {
            this.a = lpmEntryPoint;
            this.b = serviceEndpoint;
        }

        public PaymentMethodsService() {
            this(LpmEntryPoint.UNKNOWN, ServiceEndpoint.UNKNOWN);
        }
    }

    public PaymentMethodsServiceExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public PaymentMethodsServiceExperiment() {
        this(0);
    }
}
