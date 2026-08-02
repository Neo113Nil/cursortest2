package defpackage;

import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class dct0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SourceTrailMode.values().length];
        try {
            iArr[SourceTrailMode.PORCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourceTrailMode.CHEVRON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourceTrailMode.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DestinationTrailMode.values().length];
        try {
            iArr2[DestinationTrailMode.ADD_DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DestinationTrailMode.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
