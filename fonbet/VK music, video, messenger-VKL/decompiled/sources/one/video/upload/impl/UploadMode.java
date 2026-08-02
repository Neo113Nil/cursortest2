package one.video.upload.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadMode.kt */
/* loaded from: classes8.dex */
public final class UploadMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadMode[] $VALUES;
    public static final UploadMode FIXED_FILE;
    public static final UploadMode STREAMING_FILE;

    static {
        UploadMode uploadMode = new UploadMode("FIXED_FILE", 0);
        FIXED_FILE = uploadMode;
        UploadMode uploadMode2 = new UploadMode("STREAMING_FILE", 1);
        STREAMING_FILE = uploadMode2;
        UploadMode[] uploadModeArr = {uploadMode, uploadMode2};
        $VALUES = uploadModeArr;
        $ENTRIES = new asp(uploadModeArr);
    }

    public UploadMode() {
        throw null;
    }

    public static UploadMode valueOf(String str) {
        return (UploadMode) Enum.valueOf(UploadMode.class, str);
    }

    public static UploadMode[] values() {
        return (UploadMode[]) $VALUES.clone();
    }
}
