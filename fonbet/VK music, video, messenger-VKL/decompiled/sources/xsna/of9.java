package xsna;

import com.vk.dto.stories.entities.StoryCameraMode;

/* compiled from: CameraAnalyticsUtils.kt */
/* loaded from: classes16.dex */
public final class of9 {

    /* compiled from: CameraAnalyticsUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraMode.values().length];
            try {
                iArr[StoryCameraMode.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraMode.PING_PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraMode.STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryCameraMode.STORY_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryCameraMode.PHOTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryCameraMode.VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryCameraMode.QR_SCANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoryCameraMode.VMOJI_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoryCameraMode.CLIPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String a(StoryCameraMode storyCameraMode) {
        switch (a.$EnumSwitchMapping$0[storyCameraMode.ordinal()]) {
            case 1:
                return "live";
            case 2:
                return "ping_pong";
            case 3:
            default:
                return "usual";
            case 4:
                return "story_video";
            case 5:
                return "photo";
            case 6:
                return "video";
            case 7:
                return "qr_scanner";
            case 8:
                return "vmoji_capture";
            case 9:
                return "clips";
        }
    }
}
