package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.UploadedImagesPreviewSize;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nd21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UploadedImagesPreviewSize.values().length];
        try {
            iArr[UploadedImagesPreviewSize.M.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UploadedImagesPreviewSize.L.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
