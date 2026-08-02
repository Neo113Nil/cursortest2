package one.video.player.error;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;
import one.video.exo.error.OneVideoExoUnexpectedException;
import xsna.asp;
import xsna.zrp;

/* compiled from: OneVideoPlaybackException.kt */
/* loaded from: classes8.dex */
public class OneVideoPlaybackException extends Exception {
    private ErrorCode errorCode;
    private String errorCodeName;
    private OneVideoRendererException rendererException;
    private OneVideoSourceException sourceException;
    private Type type;
    private OneVideoUnexpectedException unexpectedException;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlaybackException.kt */
    public static final class ErrorCode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorCode[] $VALUES;
        public static final ErrorCode AUDIO_TRACK_INIT_FAILED;
        public static final ErrorCode AUDIO_TRACK_OFFLOAD_INIT_FAILED;
        public static final ErrorCode AUDIO_TRACK_OFFLOAD_WRITE_FAILED;
        public static final ErrorCode AUDIO_TRACK_WRITE_FAILED;
        public static final ErrorCode AUTHENTICATION_EXPIRED;
        public static final ErrorCode BAD_VALUE;
        public static final ErrorCode BEHIND_LIVE_WINDOW;
        public static final ErrorCode CONCURRENT_STREAM_LIMIT;
        public static final ErrorCode CONTENT_ALREADY_PLAYING;
        public static final ErrorCode DECODER_INIT_FAILED;
        public static final ErrorCode DECODER_QUERY_FAILED;
        public static final ErrorCode DECODING_FAILED;
        public static final ErrorCode DECODING_FORMAT_EXCEEDS_CAPABILITIES;
        public static final ErrorCode DECODING_FORMAT_UNSUPPORTED;
        public static final ErrorCode DECODING_RESOURCES_RECLAIMED;
        public static final ErrorCode DISCONNECTED;
        public static final ErrorCode DRM_CONTENT_ERROR;
        public static final ErrorCode DRM_DEVICE_REVOKED;
        public static final ErrorCode DRM_DISALLOWED_OPERATION;
        public static final ErrorCode DRM_LICENSE_ACQUISITION_FAILED;
        public static final ErrorCode DRM_LICENSE_EXPIRED;
        public static final ErrorCode DRM_PROVISIONING_FAILED;
        public static final ErrorCode DRM_SCHEME_UNSUPPORTED;
        public static final ErrorCode DRM_SYSTEM_ERROR;
        public static final ErrorCode DRM_UNSPECIFIED;
        public static final ErrorCode END_OF_PLAYLIST;
        public static final ErrorCode FAILED_RUNTIME_CHECK;
        public static final ErrorCode INVALID_STATE;
        public static final ErrorCode IO_BAD_HTTP_STATUS;
        public static final ErrorCode IO_CLEARTEXT_NOT_PERMITTED;
        public static final ErrorCode IO_FILE_NOT_FOUND;
        public static final ErrorCode IO_INVALID_HTTP_CONTENT_TYPE;
        public static final ErrorCode IO_NETWORK_CONNECTION_FAILED;
        public static final ErrorCode IO_NETWORK_CONNECTION_TIMEOUT;
        public static final ErrorCode IO_NO_PERMISSION;
        public static final ErrorCode IO_READ_POSITION_OUT_OF_RANGE;
        public static final ErrorCode IO_UNSPECIFIED;
        public static final ErrorCode NOT_AVAILABLE_IN_REGION;
        public static final ErrorCode NOT_SUPPORTED;
        public static final ErrorCode NO_ERROR;
        public static final ErrorCode PARENTAL_CONTROL_RESTRICTED;
        public static final ErrorCode PARSING_CONTAINER_MALFORMED;
        public static final ErrorCode PARSING_CONTAINER_UNSUPPORTED;
        public static final ErrorCode PARSING_MANIFEST_MALFORMED;
        public static final ErrorCode PARSING_MANIFEST_UNSUPPORTED;
        public static final ErrorCode PERMISSION_DENIED;
        public static final ErrorCode PREMIUM_ACCOUNT_REQUIRED;
        public static final ErrorCode REMOTE_ERROR;
        public static final ErrorCode SETUP_REQUIRED;
        public static final ErrorCode SKIP_LIMIT_REACHED;
        public static final ErrorCode TIMEOUT;
        public static final ErrorCode UNSPECIFIED;
        public static final ErrorCode VIDEO_FRAME_PROCESSING_FAILED;
        public static final ErrorCode VIDEO_FRAME_PROCESSOR_INIT_FAILED;

        static {
            ErrorCode errorCode = new ErrorCode("INVALID_STATE", 0);
            INVALID_STATE = errorCode;
            ErrorCode errorCode2 = new ErrorCode("BAD_VALUE", 1);
            BAD_VALUE = errorCode2;
            ErrorCode errorCode3 = new ErrorCode("PERMISSION_DENIED", 2);
            PERMISSION_DENIED = errorCode3;
            ErrorCode errorCode4 = new ErrorCode("NOT_SUPPORTED", 3);
            NOT_SUPPORTED = errorCode4;
            ErrorCode errorCode5 = new ErrorCode("DISCONNECTED", 4);
            DISCONNECTED = errorCode5;
            ErrorCode errorCode6 = new ErrorCode("AUTHENTICATION_EXPIRED", 5);
            AUTHENTICATION_EXPIRED = errorCode6;
            ErrorCode errorCode7 = new ErrorCode("PREMIUM_ACCOUNT_REQUIRED", 6);
            PREMIUM_ACCOUNT_REQUIRED = errorCode7;
            ErrorCode errorCode8 = new ErrorCode("CONCURRENT_STREAM_LIMIT", 7);
            CONCURRENT_STREAM_LIMIT = errorCode8;
            ErrorCode errorCode9 = new ErrorCode("PARENTAL_CONTROL_RESTRICTED", 8);
            PARENTAL_CONTROL_RESTRICTED = errorCode9;
            ErrorCode errorCode10 = new ErrorCode("NOT_AVAILABLE_IN_REGION", 9);
            NOT_AVAILABLE_IN_REGION = errorCode10;
            ErrorCode errorCode11 = new ErrorCode("SKIP_LIMIT_REACHED", 10);
            SKIP_LIMIT_REACHED = errorCode11;
            ErrorCode errorCode12 = new ErrorCode("SETUP_REQUIRED", 11);
            SETUP_REQUIRED = errorCode12;
            ErrorCode errorCode13 = new ErrorCode("END_OF_PLAYLIST", 12);
            END_OF_PLAYLIST = errorCode13;
            ErrorCode errorCode14 = new ErrorCode("CONTENT_ALREADY_PLAYING", 13);
            CONTENT_ALREADY_PLAYING = errorCode14;
            ErrorCode errorCode15 = new ErrorCode("UNSPECIFIED", 14);
            UNSPECIFIED = errorCode15;
            ErrorCode errorCode16 = new ErrorCode("REMOTE_ERROR", 15);
            REMOTE_ERROR = errorCode16;
            ErrorCode errorCode17 = new ErrorCode("BEHIND_LIVE_WINDOW", 16);
            BEHIND_LIVE_WINDOW = errorCode17;
            ErrorCode errorCode18 = new ErrorCode("TIMEOUT", 17);
            TIMEOUT = errorCode18;
            ErrorCode errorCode19 = new ErrorCode("FAILED_RUNTIME_CHECK", 18);
            FAILED_RUNTIME_CHECK = errorCode19;
            ErrorCode errorCode20 = new ErrorCode("IO_UNSPECIFIED", 19);
            IO_UNSPECIFIED = errorCode20;
            ErrorCode errorCode21 = new ErrorCode("IO_NETWORK_CONNECTION_FAILED", 20);
            IO_NETWORK_CONNECTION_FAILED = errorCode21;
            ErrorCode errorCode22 = new ErrorCode("IO_NETWORK_CONNECTION_TIMEOUT", 21);
            IO_NETWORK_CONNECTION_TIMEOUT = errorCode22;
            ErrorCode errorCode23 = new ErrorCode("IO_INVALID_HTTP_CONTENT_TYPE", 22);
            IO_INVALID_HTTP_CONTENT_TYPE = errorCode23;
            ErrorCode errorCode24 = new ErrorCode("IO_BAD_HTTP_STATUS", 23);
            IO_BAD_HTTP_STATUS = errorCode24;
            ErrorCode errorCode25 = new ErrorCode("IO_FILE_NOT_FOUND", 24);
            IO_FILE_NOT_FOUND = errorCode25;
            ErrorCode errorCode26 = new ErrorCode("IO_NO_PERMISSION", 25);
            IO_NO_PERMISSION = errorCode26;
            ErrorCode errorCode27 = new ErrorCode("IO_CLEARTEXT_NOT_PERMITTED", 26);
            IO_CLEARTEXT_NOT_PERMITTED = errorCode27;
            ErrorCode errorCode28 = new ErrorCode("IO_READ_POSITION_OUT_OF_RANGE", 27);
            IO_READ_POSITION_OUT_OF_RANGE = errorCode28;
            ErrorCode errorCode29 = new ErrorCode("PARSING_CONTAINER_MALFORMED", 28);
            PARSING_CONTAINER_MALFORMED = errorCode29;
            ErrorCode errorCode30 = new ErrorCode("PARSING_MANIFEST_MALFORMED", 29);
            PARSING_MANIFEST_MALFORMED = errorCode30;
            ErrorCode errorCode31 = new ErrorCode("PARSING_CONTAINER_UNSUPPORTED", 30);
            PARSING_CONTAINER_UNSUPPORTED = errorCode31;
            ErrorCode errorCode32 = new ErrorCode("PARSING_MANIFEST_UNSUPPORTED", 31);
            PARSING_MANIFEST_UNSUPPORTED = errorCode32;
            ErrorCode errorCode33 = new ErrorCode("DECODER_INIT_FAILED", 32);
            DECODER_INIT_FAILED = errorCode33;
            ErrorCode errorCode34 = new ErrorCode("DECODER_QUERY_FAILED", 33);
            DECODER_QUERY_FAILED = errorCode34;
            ErrorCode errorCode35 = new ErrorCode("DECODING_FAILED", 34);
            DECODING_FAILED = errorCode35;
            ErrorCode errorCode36 = new ErrorCode("DECODING_FORMAT_EXCEEDS_CAPABILITIES", 35);
            DECODING_FORMAT_EXCEEDS_CAPABILITIES = errorCode36;
            ErrorCode errorCode37 = new ErrorCode("DECODING_FORMAT_UNSUPPORTED", 36);
            DECODING_FORMAT_UNSUPPORTED = errorCode37;
            ErrorCode errorCode38 = new ErrorCode("DECODING_RESOURCES_RECLAIMED", 37);
            DECODING_RESOURCES_RECLAIMED = errorCode38;
            ErrorCode errorCode39 = new ErrorCode("AUDIO_TRACK_INIT_FAILED", 38);
            AUDIO_TRACK_INIT_FAILED = errorCode39;
            ErrorCode errorCode40 = new ErrorCode("AUDIO_TRACK_WRITE_FAILED", 39);
            AUDIO_TRACK_WRITE_FAILED = errorCode40;
            ErrorCode errorCode41 = new ErrorCode("AUDIO_TRACK_OFFLOAD_WRITE_FAILED", 40);
            AUDIO_TRACK_OFFLOAD_WRITE_FAILED = errorCode41;
            ErrorCode errorCode42 = new ErrorCode("AUDIO_TRACK_OFFLOAD_INIT_FAILED", 41);
            AUDIO_TRACK_OFFLOAD_INIT_FAILED = errorCode42;
            ErrorCode errorCode43 = new ErrorCode("DRM_UNSPECIFIED", 42);
            DRM_UNSPECIFIED = errorCode43;
            ErrorCode errorCode44 = new ErrorCode("DRM_SCHEME_UNSUPPORTED", 43);
            DRM_SCHEME_UNSUPPORTED = errorCode44;
            ErrorCode errorCode45 = new ErrorCode("DRM_PROVISIONING_FAILED", 44);
            DRM_PROVISIONING_FAILED = errorCode45;
            ErrorCode errorCode46 = new ErrorCode("DRM_CONTENT_ERROR", 45);
            DRM_CONTENT_ERROR = errorCode46;
            ErrorCode errorCode47 = new ErrorCode("DRM_LICENSE_ACQUISITION_FAILED", 46);
            DRM_LICENSE_ACQUISITION_FAILED = errorCode47;
            ErrorCode errorCode48 = new ErrorCode("DRM_DISALLOWED_OPERATION", 47);
            DRM_DISALLOWED_OPERATION = errorCode48;
            ErrorCode errorCode49 = new ErrorCode("DRM_SYSTEM_ERROR", 48);
            DRM_SYSTEM_ERROR = errorCode49;
            ErrorCode errorCode50 = new ErrorCode("DRM_DEVICE_REVOKED", 49);
            DRM_DEVICE_REVOKED = errorCode50;
            ErrorCode errorCode51 = new ErrorCode("DRM_LICENSE_EXPIRED", 50);
            DRM_LICENSE_EXPIRED = errorCode51;
            ErrorCode errorCode52 = new ErrorCode("VIDEO_FRAME_PROCESSOR_INIT_FAILED", 51);
            VIDEO_FRAME_PROCESSOR_INIT_FAILED = errorCode52;
            ErrorCode errorCode53 = new ErrorCode("VIDEO_FRAME_PROCESSING_FAILED", 52);
            VIDEO_FRAME_PROCESSING_FAILED = errorCode53;
            ErrorCode errorCode54 = new ErrorCode("NO_ERROR", 53);
            NO_ERROR = errorCode54;
            ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, errorCode10, errorCode11, errorCode12, errorCode13, errorCode14, errorCode15, errorCode16, errorCode17, errorCode18, errorCode19, errorCode20, errorCode21, errorCode22, errorCode23, errorCode24, errorCode25, errorCode26, errorCode27, errorCode28, errorCode29, errorCode30, errorCode31, errorCode32, errorCode33, errorCode34, errorCode35, errorCode36, errorCode37, errorCode38, errorCode39, errorCode40, errorCode41, errorCode42, errorCode43, errorCode44, errorCode45, errorCode46, errorCode47, errorCode48, errorCode49, errorCode50, errorCode51, errorCode52, errorCode53, errorCode54};
            $VALUES = errorCodeArr;
            $ENTRIES = new asp(errorCodeArr);
        }

        public ErrorCode() {
            throw null;
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlaybackException.kt */
    public static final class StuckType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StuckType[] $VALUES;
        public static final StuckType BUFFERING_NOT_LOADING;
        public static final StuckType BUFFERING_NO_PROGRESS;
        public static final StuckType PLAYING_NOT_ENDING;
        public static final StuckType PLAYING_NO_PROGRESS;
        public static final StuckType SUPPRESSED;
        public static final StuckType UNKNOWN;

        static {
            StuckType stuckType = new StuckType("BUFFERING_NOT_LOADING", 0);
            BUFFERING_NOT_LOADING = stuckType;
            StuckType stuckType2 = new StuckType("BUFFERING_NO_PROGRESS", 1);
            BUFFERING_NO_PROGRESS = stuckType2;
            StuckType stuckType3 = new StuckType("PLAYING_NO_PROGRESS", 2);
            PLAYING_NO_PROGRESS = stuckType3;
            StuckType stuckType4 = new StuckType("PLAYING_NOT_ENDING", 3);
            PLAYING_NOT_ENDING = stuckType4;
            StuckType stuckType5 = new StuckType("SUPPRESSED", 4);
            SUPPRESSED = stuckType5;
            StuckType stuckType6 = new StuckType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
            UNKNOWN = stuckType6;
            StuckType[] stuckTypeArr = {stuckType, stuckType2, stuckType3, stuckType4, stuckType5, stuckType6};
            $VALUES = stuckTypeArr;
            $ENTRIES = new asp(stuckTypeArr);
        }

        public StuckType() {
            throw null;
        }

        public static StuckType valueOf(String str) {
            return (StuckType) Enum.valueOf(StuckType.class, str);
        }

        public static StuckType[] values() {
            return (StuckType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlaybackException.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type REMOTE;
        public static final Type RENDERER;
        public static final Type SOURCE;
        public static final Type UNEXPECTED;
        public static final Type UNRESOLVED;

        static {
            Type type = new Type("SOURCE", 0);
            SOURCE = type;
            Type type2 = new Type("RENDERER", 1);
            RENDERER = type2;
            Type type3 = new Type("UNEXPECTED", 2);
            UNEXPECTED = type3;
            Type type4 = new Type("REMOTE", 3);
            REMOTE = type4;
            Type type5 = new Type("UNRESOLVED", 4);
            UNRESOLVED = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public OneVideoPlaybackException(String str) {
        super(str);
        this.errorCode = ErrorCode.NO_ERROR;
        this.errorCodeName = "";
        this.type = Type.UNRESOLVED;
    }

    public final ErrorCode d() {
        return this.errorCode;
    }

    public final String g() {
        return this.errorCodeName;
    }

    public final OneVideoRendererException h() {
        return this.rendererException;
    }

    public final OneVideoSourceException i() {
        return this.sourceException;
    }

    public final Type j() {
        return this.type;
    }

    public final OneVideoUnexpectedException k() {
        return this.unexpectedException;
    }

    public final void l(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void m(String str) {
        this.errorCodeName = str;
    }

    public final void n(OneVideoExoRendererException oneVideoExoRendererException) {
        this.rendererException = oneVideoExoRendererException;
    }

    public final void o(OneVideoExoSourceException oneVideoExoSourceException) {
        this.sourceException = oneVideoExoSourceException;
    }

    public final void p(Type type) {
        this.type = type;
    }

    public final void q(OneVideoExoUnexpectedException oneVideoExoUnexpectedException) {
        this.unexpectedException = oneVideoExoUnexpectedException;
    }

    public OneVideoPlaybackException(String str, Throwable th) {
        super(str, th);
        this.errorCode = ErrorCode.NO_ERROR;
        this.errorCodeName = "";
        this.type = Type.UNRESOLVED;
    }
}
