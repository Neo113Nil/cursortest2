package defpackage;

import com.yandex.messaging.MessagingFlags$AttachmentsChooserMode;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class f1w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessagingFlags$AttachmentsChooserMode.values().length];
        try {
            iArr[MessagingFlags$AttachmentsChooserMode.MINI_CHOOSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagingFlags$AttachmentsChooserMode.CHOOSER_WITH_VIDEO_TRIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
