package defpackage;

import com.yandex.delivery.libs.imageupload.api.UploadImageType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class kc21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UploadImageType.values().length];
        try {
            iArr[UploadImageType.PHOTOCOMMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
