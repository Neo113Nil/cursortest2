package com.yandex.go.morphlex.action.route_address;

import com.yandex.go.morphlex.action.route_address.SetRouteAddressAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SetRouteAddressAction.PointType.values().length];
        try {
            iArr[SetRouteAddressAction.PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SetRouteAddressAction.PointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
