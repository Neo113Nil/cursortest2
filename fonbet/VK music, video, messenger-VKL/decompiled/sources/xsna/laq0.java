package xsna;

import one.video.upload.impl.UploadMode;

/* compiled from: UploadConnection.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class laq0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[UploadMode.values().length];
        try {
            iArr[UploadMode.FIXED_FILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UploadMode.STREAMING_FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
