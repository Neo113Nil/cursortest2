package defpackage;

import ru.yandex.taxi.masstransit.model.MtMasstransitOverlayOwner;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class bp30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtMasstransitOverlayOwner.values().length];
        try {
            iArr[MtMasstransitOverlayOwner.SUPER_APP_DISCOVERY_MAP_FEATURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtMasstransitOverlayOwner.MASSTRANSIT_FEATURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
