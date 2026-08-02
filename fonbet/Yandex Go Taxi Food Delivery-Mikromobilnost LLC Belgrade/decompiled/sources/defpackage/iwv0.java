package defpackage;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class iwv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppDiscoveryMapOverlayState.values().length];
        try {
            iArr[SuperAppDiscoveryMapOverlayState.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppDiscoveryMapOverlayState.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppDiscoveryMapOverlayState.MINIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppDiscoveryMapOverlayState.HIDDEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
