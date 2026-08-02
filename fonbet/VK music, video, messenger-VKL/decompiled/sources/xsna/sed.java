package xsna;

import com.vk.clips.uploader.api.task.ClipVideoFileUploadTask;

/* compiled from: ClipUploadUtils.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class sed {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ClipVideoFileUploadTask.Exception.Type.values().length];
        try {
            iArr[ClipVideoFileUploadTask.Exception.Type.UPLOAD_LIBRARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipVideoFileUploadTask.Exception.Type.TRANSCODER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClipVideoFileUploadTask.Exception.Type.MISSING_FILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClipVideoFileUploadTask.Exception.Type.SHORT_VIDEO_API.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
