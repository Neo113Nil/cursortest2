package com.yandex.go.masstransit.sdk.checkout.impl.stop.ui.components;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/masstransit/sdk/checkout/impl/stop/ui/components/RouteLineIndicatorSize;", "", "Ly7m;", "size", "F", "a", "()F", "M", "S", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RouteLineIndicatorSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteLineIndicatorSize[] $VALUES;
    public static final RouteLineIndicatorSize M;
    public static final RouteLineIndicatorSize S;
    private final float size;

    static {
        RouteLineIndicatorSize routeLineIndicatorSize = new RouteLineIndicatorSize("M", 0, 8.0f);
        M = routeLineIndicatorSize;
        RouteLineIndicatorSize routeLineIndicatorSize2 = new RouteLineIndicatorSize("S", 1, 3.0f);
        S = routeLineIndicatorSize2;
        RouteLineIndicatorSize[] routeLineIndicatorSizeArr = {routeLineIndicatorSize, routeLineIndicatorSize2};
        $VALUES = routeLineIndicatorSizeArr;
        $ENTRIES = a.a(routeLineIndicatorSizeArr);
    }

    public RouteLineIndicatorSize(String str, int i, float f) {
        this.size = f;
    }

    public static RouteLineIndicatorSize valueOf(String str) {
        return (RouteLineIndicatorSize) Enum.valueOf(RouteLineIndicatorSize.class, str);
    }

    public static RouteLineIndicatorSize[] values() {
        return (RouteLineIndicatorSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }
}
