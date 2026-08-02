package ru.ok.android.webrtc.signaling.api;

import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VideoTrackType.values().length];
        b = iArr;
        try {
            iArr[VideoTrackType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[VideoTrackType.SCREEN_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[VideoTrackType.MOVIE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[VideoTrackType.STREAM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[VideoTrackType.ANIMOJI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[MediaOptionState.values().length];
        a = iArr2;
        try {
            iArr2[MediaOptionState.UNMUTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
