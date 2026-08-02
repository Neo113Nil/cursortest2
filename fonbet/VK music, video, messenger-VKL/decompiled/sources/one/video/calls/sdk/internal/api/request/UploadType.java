package one.video.calls.sdk.internal.api.request;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetLogUploadUrl.kt */
/* loaded from: classes8.dex */
public final class UploadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadType[] $VALUES;
    public static final UploadType LOGS;
    public static final UploadType STATS;

    static {
        UploadType uploadType = new UploadType("LOGS", 0);
        LOGS = uploadType;
        UploadType uploadType2 = new UploadType("STATS", 1);
        STATS = uploadType2;
        UploadType[] uploadTypeArr = {uploadType, uploadType2};
        $VALUES = uploadTypeArr;
        $ENTRIES = new asp(uploadTypeArr);
    }

    public UploadType() {
        throw null;
    }

    public static UploadType valueOf(String str) {
        return (UploadType) Enum.valueOf(UploadType.class, str);
    }

    public static UploadType[] values() {
        return (UploadType[]) $VALUES.clone();
    }
}
