package com.yandex.messaging.attachments;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SystemAttachmentsController$ChooserType.values().length];
        try {
            iArr[SystemAttachmentsController$ChooserType.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SystemAttachmentsController$ChooserType.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SystemAttachmentsController$ChooserType.GALLERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SystemAttachmentsController$ChooserType.NOTHING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
