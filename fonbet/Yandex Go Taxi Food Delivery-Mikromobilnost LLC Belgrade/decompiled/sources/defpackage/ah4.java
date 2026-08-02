package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ImageBackgroundDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ah4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageBackgroundDto.ScaleTypeDto.values().length];
        try {
            iArr[ImageBackgroundDto.ScaleTypeDto.ASPECT_FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageBackgroundDto.ScaleTypeDto.SCALE_TO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageBackgroundDto.ScaleTypeDto.ASPECT_FIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageBackgroundDto.ScaleTypeDto.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
