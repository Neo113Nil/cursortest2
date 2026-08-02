package com.yandex.go.search.address.model;

import defpackage.k4o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/search/address/model/Service;", "", "", "strName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DELIVERY", "UNDEFINED", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Service {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Service[] $VALUES;
    public static final Service DELIVERY;
    public static final Service UNDEFINED;
    private final String strName;

    static {
        Service service = new Service("DELIVERY", 0, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        DELIVERY = service;
        Service service2 = new Service("UNDEFINED", 1, StringUtils.UNDEFINED);
        UNDEFINED = service2;
        Service[] serviceArr = {service, service2};
        $VALUES = serviceArr;
        $ENTRIES = a.a(serviceArr);
    }

    public Service(String str, int i, String str2) {
        this.strName = str2;
    }

    public static Service valueOf(String str) {
        return (Service) Enum.valueOf(Service.class, str);
    }

    public static Service[] values() {
        return (Service[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getStrName() {
        return this.strName;
    }
}
