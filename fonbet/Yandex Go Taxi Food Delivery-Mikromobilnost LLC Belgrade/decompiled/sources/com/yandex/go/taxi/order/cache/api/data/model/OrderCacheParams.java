package com.yandex.go.taxi.order.cache.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kz60;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/cache/api/data/model/OrderCacheParams;", "", "Companion", "Service", "com/yandex/go/taxi/order/cache/api/data/model/a", "$serializer", "go-client-android.features.taxi_order.cache:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderCacheParams {
    public static final a Companion = new a();
    public static final OrderCacheParams c = new OrderCacheParams(0);
    public final long a;
    public final long b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/cache/api/data/model/OrderCacheParams$Service;", "", "Companion", "com/yandex/go/taxi/order/cache/api/data/model/b", "TAXI", "LINKED", "SCOOTERS", "DRIVE", "LOGISTICS", "EATS", "UNKNOWN", "go-client-android.features.taxi_order.cache:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes8.dex */
    public static final class Service {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Service[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Service DRIVE;
        public static final Service EATS;
        public static final Service LINKED;
        public static final Service LOGISTICS;
        public static final Service SCOOTERS;
        public static final Service TAXI;
        public static final Service UNKNOWN;

        static {
            Service service = new Service("TAXI", 0);
            TAXI = service;
            Service service2 = new Service("LINKED", 1);
            LINKED = service2;
            Service service3 = new Service("SCOOTERS", 2);
            SCOOTERS = service3;
            Service service4 = new Service("DRIVE", 3);
            DRIVE = service4;
            Service service5 = new Service("LOGISTICS", 4);
            LOGISTICS = service5;
            Service service6 = new Service("EATS", 5);
            EATS = service6;
            Service service7 = new Service("UNKNOWN", 6);
            UNKNOWN = service7;
            Service[] serviceArr = {service, service2, service3, service4, service5, service6, service7};
            $VALUES = serviceArr;
            $ENTRIES = kotlin.enums.a.a(serviceArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(13));
        }

        public static Service valueOf(String str) {
            return (Service) Enum.valueOf(Service.class, str);
        }

        public static Service[] values() {
            return (Service[]) $VALUES.clone();
        }
    }

    public /* synthetic */ OrderCacheParams(int i, long j, long j2) {
        this.a = (i & 1) == 0 ? 3600L : j;
        if ((i & 2) == 0) {
            this.b = 10000L;
        } else {
            this.b = j2;
        }
    }

    public static final /* synthetic */ void c(OrderCacheParams orderCacheParams, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || orderCacheParams.a != 3600) {
            yjdVar.s(serialDescriptor, 0, orderCacheParams.a);
        }
        if (!yjdVar.F() && orderCacheParams.b == 10000) {
            return;
        }
        yjdVar.s(serialDescriptor, 1, orderCacheParams.b);
    }

    /* renamed from: a, reason: from getter */
    public final long getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final long getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCacheParams)) {
            return false;
        }
        OrderCacheParams orderCacheParams = (OrderCacheParams) obj;
        return this.a == orderCacheParams.a && this.b == orderCacheParams.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "OrderCacheParams(ttlSec=", ", timeoutMs="));
    }

    public OrderCacheParams(int i) {
        this.a = 3600L;
        this.b = 10000L;
    }

    public OrderCacheParams() {
        this(0);
    }
}
