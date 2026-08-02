package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class c870 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppOpenServiceActionType.values().length];
        try {
            iArr[SuperAppOpenServiceActionType.FAVORITES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppOpenServiceActionType.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppOpenServiceActionType.CHARGERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppOpenServiceActionType.SCOOTERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuperAppOpenServiceActionType.TAXI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SuperAppOpenServiceActionType.PLACES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
