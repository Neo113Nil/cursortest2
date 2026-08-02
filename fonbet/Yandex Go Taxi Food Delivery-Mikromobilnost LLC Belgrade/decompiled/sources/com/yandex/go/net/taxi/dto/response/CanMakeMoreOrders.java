package com.yandex.go.net.taxi.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nu7;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/net/taxi/dto/response/CanMakeMoreOrders;", "", "Companion", "nu7", "ALLOWED", "DISALLOWED", "UNMODIFIED", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CanMakeMoreOrders {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CanMakeMoreOrders[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CanMakeMoreOrders ALLOWED;
    public static final nu7 Companion;
    public static final CanMakeMoreOrders DISALLOWED;
    public static final CanMakeMoreOrders UNMODIFIED;

    static {
        CanMakeMoreOrders canMakeMoreOrders = new CanMakeMoreOrders("ALLOWED", 0);
        ALLOWED = canMakeMoreOrders;
        CanMakeMoreOrders canMakeMoreOrders2 = new CanMakeMoreOrders("DISALLOWED", 1);
        DISALLOWED = canMakeMoreOrders2;
        CanMakeMoreOrders canMakeMoreOrders3 = new CanMakeMoreOrders("UNMODIFIED", 2);
        UNMODIFIED = canMakeMoreOrders3;
        CanMakeMoreOrders[] canMakeMoreOrdersArr = {canMakeMoreOrders, canMakeMoreOrders2, canMakeMoreOrders3};
        $VALUES = canMakeMoreOrdersArr;
        $ENTRIES = kotlin.enums.a.a(canMakeMoreOrdersArr);
        Companion = new nu7();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(15));
    }

    public static CanMakeMoreOrders valueOf(String str) {
        return (CanMakeMoreOrders) Enum.valueOf(CanMakeMoreOrders.class, str);
    }

    public static CanMakeMoreOrders[] values() {
        return (CanMakeMoreOrders[]) $VALUES.clone();
    }
}
