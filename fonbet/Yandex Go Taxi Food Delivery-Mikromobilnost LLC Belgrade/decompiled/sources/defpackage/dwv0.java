package defpackage;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.ui.model.SuperAppDiscoveryMapSearchOpenedEntity;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class dwv0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SuperAppDiscoveryMapSearchOpenedEntity.values().length];
        try {
            iArr[SuperAppDiscoveryMapSearchOpenedEntity.TRANSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppDiscoveryMapSearchOpenedEntity.PLACES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppDiscoveryMapSearchOpenedEntity.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppDiscoveryMapSearchOpenedEntity.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SuperAppDiscoveryMapExperiment.CategoryFilterType.values().length];
        try {
            iArr2[SuperAppDiscoveryMapExperiment.CategoryFilterType.TRANSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SuperAppDiscoveryMapExperiment.CategoryFilterType.CHARGERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SuperAppDiscoveryMapExperiment.CategoryFilterType.SCOOTERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SuperAppDiscoveryMapExperiment.CategoryFilterType.FAVOURITES.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[SuperAppOpenServiceActionType.values().length];
        try {
            iArr3[SuperAppOpenServiceActionType.FAVORITES.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SuperAppOpenServiceActionType.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[SuperAppOpenServiceActionType.CHARGERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[SuperAppOpenServiceActionType.SCOOTERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[SuperAppOpenServiceActionType.TAXI.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[SuperAppOpenServiceActionType.PLACES.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
    }
}
