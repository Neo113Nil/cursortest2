package one.video.player.manifest;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ManifestValidationErrorType.kt */
/* loaded from: classes8.dex */
public final class ManifestValidationErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ManifestValidationErrorType[] $VALUES;
    public static final ManifestValidationErrorType AUDIO_BITRATE_TO_MAPPING_PRIORITY_ERROR;
    public static final ManifestValidationErrorType MANIFEST_OK;
    public static final ManifestValidationErrorType OTHER_BITRATE_TO_MAPPING_PRIORITY_ERROR;
    public static final ManifestValidationErrorType UNKNOWN_ERROR;
    public static final ManifestValidationErrorType VIDEO_BITRATE_TO_MAPPING_PRIORITY_ERROR;

    static {
        ManifestValidationErrorType manifestValidationErrorType = new ManifestValidationErrorType("MANIFEST_OK", 0);
        MANIFEST_OK = manifestValidationErrorType;
        ManifestValidationErrorType manifestValidationErrorType2 = new ManifestValidationErrorType("VIDEO_BITRATE_TO_MAPPING_PRIORITY_ERROR", 1);
        VIDEO_BITRATE_TO_MAPPING_PRIORITY_ERROR = manifestValidationErrorType2;
        ManifestValidationErrorType manifestValidationErrorType3 = new ManifestValidationErrorType("AUDIO_BITRATE_TO_MAPPING_PRIORITY_ERROR", 2);
        AUDIO_BITRATE_TO_MAPPING_PRIORITY_ERROR = manifestValidationErrorType3;
        ManifestValidationErrorType manifestValidationErrorType4 = new ManifestValidationErrorType("OTHER_BITRATE_TO_MAPPING_PRIORITY_ERROR", 3);
        OTHER_BITRATE_TO_MAPPING_PRIORITY_ERROR = manifestValidationErrorType4;
        ManifestValidationErrorType manifestValidationErrorType5 = new ManifestValidationErrorType("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = manifestValidationErrorType5;
        ManifestValidationErrorType[] manifestValidationErrorTypeArr = {manifestValidationErrorType, manifestValidationErrorType2, manifestValidationErrorType3, manifestValidationErrorType4, manifestValidationErrorType5};
        $VALUES = manifestValidationErrorTypeArr;
        $ENTRIES = new asp(manifestValidationErrorTypeArr);
    }

    public ManifestValidationErrorType() {
        throw null;
    }

    public static ManifestValidationErrorType valueOf(String str) {
        return (ManifestValidationErrorType) Enum.valueOf(ManifestValidationErrorType.class, str);
    }

    public static ManifestValidationErrorType[] values() {
        return (ManifestValidationErrorType[]) $VALUES.clone();
    }
}
