package one.video.upload.exceptions;

import xsna.zcl;

/* compiled from: UploadUrlExpiredException.kt */
/* loaded from: classes8.dex */
public final class UploadUrlExpiredException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public UploadUrlExpiredException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UploadUrlExpiredException(String str) {
        super(str);
    }

    public /* synthetic */ UploadUrlExpiredException(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
