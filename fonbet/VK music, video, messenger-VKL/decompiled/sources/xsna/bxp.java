package xsna;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ErrorUtils.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class bxp {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[OneVideoPlaybackException.ErrorCode.values().length];
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_EXCEEDS_CAPABILITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_SCHEME_UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_CONTENT_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_LICENSE_ACQUISITION_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_DISALLOWED_OPERATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_SYSTEM_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_DEVICE_REVOKED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DRM_LICENSE_EXPIRED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_UNSUPPORTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DECODER_INIT_FAILED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DECODER_QUERY_FAILED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.DECODING_FAILED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_INIT_FAILED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.REMOTE_ERROR.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.BEHIND_LIVE_WINDOW.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.TIMEOUT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.FAILED_RUNTIME_CHECK.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_UNSPECIFIED.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_FAILED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_INVALID_HTTP_CONTENT_TYPE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_BAD_HTTP_STATUS.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.IO_FILE_NOT_FOUND.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_UNSUPPORTED.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_UNSUPPORTED.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
