package ru.ok.gleffects;

import com.ironsource.InterfaceC4413l1;
import com.ironsource.Z3;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.commons.http.Http;

/* loaded from: classes9.dex */
public final class EffectRegistry {
    public static final int UNKNOWN_MIN_RES_VERSION = -1;
    private final HashMap<String, Long> effectHandles;
    private final long nativeInstance;
    public boolean wasReleased = false;

    public enum EffectId {
        PAINTING_GESTURE(1),
        PAINTING_TOUCHES(2),
        TRIPLE_HEART(3),
        LUT_FILTER(4),
        SPEEDRUN(5),
        BEFORE(6),
        STRIPS(7),
        CANDLE(8),
        TILES(9),
        DISCO(10),
        DANCE(11),
        TOBE(12),
        QUIZ(13),
        NEWS(14),
        STAR(15),
        BLUR(16),
        DIRECTED_BY(17),
        CHIROMANCY(18),
        PROFESSION(19),
        COLLAGE(20),
        YOUR_HAND(21),
        ZOOM_LOVE(22),
        ZOOM_FIRE(23),
        ZOOM_SADNESS(24),
        ZOOM_KISS_CAM(25),
        ZOOM_DRAMA(26),
        EARTHSHAKING(27),
        REALITY(28),
        PHOTO_BOOTH(29),
        CLOUD(30),
        HEART(31),
        FIREBALL(32),
        ZOOM_ASHES(33),
        SEAM_CARVING(34),
        BACKGROUND(35),
        FILTER_NEGATIVE(36),
        ZOOM_DISCO(37),
        LOVE(38),
        FACE_CHASING(39),
        DOUBLE_SEGMENTATION(40),
        SPHERE_IMAGE0(41),
        WHO_IS(42),
        CITIES(43),
        SPHERE_VIDEO0(44),
        WIDE_PUTIN(45),
        EGG(46),
        SKY_BACKGROUND(48),
        RAIN_DROPS(49),
        PICTURE_BACKGROUND(50),
        PAUSEBW(51),
        WHISKAS_PROMO(53),
        PROMO_HEAD_TAILS(54),
        DEAF_QUIZ(55),
        RUSH_PROMO(56),
        SBER_PROMO(57),
        ALI_PROMO(58),
        CYBER_QUIZ(59),
        GROUP_SPHERE(60),
        GROUP_SPHERE_VIDEO(61),
        GROUP_VIDEO(62),
        IRI_PROMO(63),
        FANK_QUIZ(64),
        AR_MERCH_WHITE(65),
        AR_MERCH_BLACK(66),
        FACE_MASK(67),
        BEAUTY_FILTER(68),
        CATS_MASK(69),
        COCA_COLA(70),
        DEBUG_MASK(71),
        DUETS(72),
        MAGNET_PROMO(73),
        MAGNET_DUETS(74),
        GB_QUIZ(75),
        CANDY_SPHERE(76),
        MEGAFON_QUIZ(77),
        DIROL(78),
        HAND_SPHERE(79),
        CATS_DEBUG(80),
        TRIPLE_LOGOS(81),
        MAY_HOLIDAYS(83),
        TEST_LIGHT(84),
        SCANNER(85),
        COLA_DUET(89),
        FOOTBAll_EGG(90),
        ATLAS_TEST(91),
        PULPY(92),
        UGC_BACKGROUND(93),
        EGG_FABERGE(94),
        KITE(95),
        BEAUTY_ROMA(96),
        WEBIUM_QUIZ(97),
        CALL_PROGRAM(98),
        KFC_PROGRAM(99),
        SBERCAT_PROMO(100),
        FACE_ANGLES_TEST(VersionConstants.PRODUCT_MAJOR_VERSION),
        MORPHING(141),
        CATS_HERMITAGE(142),
        CATS_CHRISTMAS(143),
        STROKE_SEGMENTATION(144),
        SINCERELY_YOURS(145),
        DEBUG_FACEMODEL(146),
        EPICA(147),
        NEW_YEAR_HEART(148),
        SKY_BACKGROUND_STATIC_DISCO(149),
        REVERSE_SKY_SEGMENTATION(150),
        RANDOM_MUSIC(151),
        ROMA_ZOMBIE(152),
        SVG_RENDERER(153),
        UGC_SKY_BACKGROUND(154),
        SVG_RENDERER_NEW(155),
        BACKGROUND1(101),
        BACKGROUND2(102),
        BACKGROUND3(103),
        BACKGROUND4(104),
        BACKGROUND5(105),
        SPHERE_IMAGE1(110),
        SPHERE_IMAGE2(111),
        SPHERE_IMAGE3(112),
        SPHERE_IMAGE4(113),
        SPHERE_IMAGE5(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE),
        SPHERE_VIDEO1(120),
        SPHERE_VIDEO2(Sdk.SDKError.Reason.TPAT_ERROR_VALUE),
        SPHERE_VIDEO3(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE),
        SPHERE_VIDEO4(123),
        SPHERE_VIDEO5(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE),
        SKY_BACKGROUND1(130),
        SKY_BACKGROUND2(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE),
        SKY_BACKGROUND3(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE),
        SKY_BACKGROUND4(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE),
        SKY_BACKGROUND5(134),
        SKY_BACKGROUND_VIDEO1(135),
        SKY_BACKGROUND_VIDEO2(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE),
        SKY_BACKGROUND_VIDEO3(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE),
        SKY_BACKGROUND_VIDEO4(138),
        SKY_BACKGROUND_VIDEO5(139),
        SPHERE_IMAGE_0(200),
        SPHERE_IMAGE_1(201),
        SPHERE_IMAGE_2(202),
        SPHERE_IMAGE_3(203),
        SPHERE_IMAGE_4(204),
        SPHERE_IMAGE_5(205),
        SPHERE_IMAGE_6(206),
        SPHERE_IMAGE_7(207),
        SPHERE_IMAGE_8(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE),
        SPHERE_IMAGE_9(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE),
        SPHERE_VIDEO_0(300),
        SPHERE_VIDEO_1(301),
        SPHERE_VIDEO_2(302),
        SPHERE_VIDEO_3(Http.StatusCode.SEE_OTHER),
        SPHERE_VIDEO_4(Sdk.SDKError.Reason.AD_EXPIRED_VALUE),
        SPHERE_VIDEO_5(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE),
        SPHERE_VIDEO_6(306),
        SPHERE_VIDEO_7(307),
        SPHERE_VIDEO_8(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE),
        SPHERE_VIDEO_9(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE),
        FACE_MORPHING_0(400),
        FACE_MORPHING_1(401),
        FACE_MORPHING_2(402),
        FACE_MORPHING_3(403),
        FACE_MORPHING_4(404),
        FACE_MORPHING_5(InterfaceC4413l1.a.b.e),
        FACE_MORPHING_6(InterfaceC4413l1.a.b.f),
        FACE_MORPHING_7(InterfaceC4413l1.a.b.g),
        FACE_MORPHING_8(InterfaceC4413l1.a.b.h),
        FACE_MORPHING_9(InterfaceC4413l1.a.b.i),
        TEST_3D(999),
        SHADER_DUOTONE(1000),
        SHADER_NEGATIVE(1001),
        SHADER_POSTERIZE(1002),
        SHADER_BULGE_DISTORTION(1003),
        SHADER_CGA_COLORSPACE(1004),
        SHADER_COLOR_INVERT(1005),
        SHADER_CROSSHATCH(1006),
        SHADER_FALSE_COLOR(1007),
        SHADER_GLASS_SPHERE(1008),
        SHADER_HALFTONE(1009),
        SHADER_KUWAHARA(1010),
        SHADER_LUMINANCE_THRESHOLD(1011),
        SHADER_PIXELATION(1012),
        SHADER_SOLARIZE(Z3.i),
        SHADER_SWIRL(Z3.j),
        SHADER_ZOOM_BLUR(1015),
        API_PROGRAM(16000),
        STENCIL_CAMERA(17000),
        STENCIL_CAMERA_OPTIMIZED(17001);

        public final int id;

        EffectId(int i) {
            this.id = i;
        }
    }

    public EffectRegistry() {
        long create = create();
        this.nativeInstance = create;
        this.effectHandles = getHandles(create, Arrays.toString(EffectId.class.getEnumConstants()).replaceAll("^.|.$", "").split(", "));
    }

    private static native boolean cameraZoomBlockingRequired(long j, long j2);

    private static native long create();

    private static native boolean duetEffect(long j, long j2);

    private static native boolean fatEffect(long j, long j2);

    private static native HashMap<String, Long> getHandles(long j, String[] strArr);

    private static native int getMinResVersion(long j, long j2);

    private static native boolean groupedEffect(long j, long j2);

    private static native boolean hasWithInputRecognitions(long j);

    private static native boolean inputAudioBitsRequired(long j, long j2);

    private static native boolean inputBlackPatternMatchDetectionRequired(long j, long j2);

    private static native boolean inputCatFaceDetectionRequired(long j, long j2);

    private static native boolean inputClicksRequired(long j, long j2);

    private static native boolean inputCompositeGesturesRequired(long j, long j2);

    private static native boolean inputDeviceRotationMatrixRequired(long j, long j2);

    private static native boolean inputDuetsTouchEventsRequired(long j, long j2);

    private static native boolean inputFace3DMeshesRequired(long j, long j2);

    private static native boolean inputFaceMeshesRequired(long j, long j2);

    private static native boolean inputFacesRequired(long j, long j2);

    private static native boolean inputFriendsAvatarsRequired(long j, long j2);

    private static native boolean inputFriendsNamesRequired(long j, long j2);

    private static native boolean inputFullSegmentationRequired(long j, long j2);

    private static native boolean inputGalleryPhotoRequired(long j, long j2);

    private static native boolean inputGalleryVideoRequired(long j, long j2);

    private static native boolean inputGesturesRequired(long j, long j2);

    private static native boolean inputMorphingRequired(long j, long j2);

    private static native boolean inputMusicTracksMetaRequired(long j, long j2);

    private static native boolean inputRecognitionsRequired(long j, long j2);

    private static native boolean inputRecordingEventsRequired(long j, long j2);

    private static native boolean inputSkySegmentationRequired(long j, long j2);

    private static native boolean inputSolvePnpAnglesRequired(long j, long j2);

    private static native boolean inputTouchesRequired(long j, long j2);

    private static native boolean inputUserCityRequired(long j, long j2);

    private static native boolean inputUserNameRequired(long j, long j2);

    private static native boolean inputWhitePatternMatchDetectionRequired(long j, long j2);

    private static native boolean lastSegmentRestartingRequired(long j, long j2);

    private static native void native_setMaskEngineAsset(String str);

    private static native boolean needsOffCameraStabilization(long j, long j2);

    private static native boolean needsRewindVideo(long j, long j2);

    private static native boolean outputAudioEventsRequired(long j, long j2);

    private static native boolean outputNotificationsRequired(long j, long j2);

    private static native boolean outputRecordingEventsRequired(long j, long j2);

    private static native void release(long j);

    private static native boolean smallSegmentationRequired(long j, long j2);

    private static native boolean tipsRenderRequired(long j, long j2);

    public boolean cameraZoomBlockingRequired(Long l) {
        return l != null && cameraZoomBlockingRequired(this.nativeInstance, l.longValue());
    }

    public boolean duetEffect(Long l) {
        return l != null && duetEffect(this.nativeInstance, l.longValue());
    }

    public boolean fatEffect(Long l) {
        return l != null && fatEffect(this.nativeInstance, l.longValue());
    }

    public Long getEffectHandle(EffectId effectId) {
        if (effectId != null) {
            return this.effectHandles.get(effectId.name());
        }
        return null;
    }

    public Map<String, Long> getHandlesMap() {
        return this.effectHandles;
    }

    public int getMinResVersion(Long l) {
        if (l != null) {
            return getMinResVersion(this.nativeInstance, l.longValue());
        }
        return -1;
    }

    public boolean groupedEffect(Long l) {
        return l != null && groupedEffect(this.nativeInstance, l.longValue());
    }

    public boolean hasEffectWithInputRecognitions() {
        return hasWithInputRecognitions(this.nativeInstance);
    }

    public boolean inputAudioBitsRequired(Long l) {
        return l != null && inputAudioBitsRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputBlackPatternMatchRequired(Long l) {
        return l != null && inputBlackPatternMatchDetectionRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputCatFaceRequired(Long l) {
        return l != null && inputCatFaceDetectionRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputClicksRequired(Long l) {
        return l != null && inputClicksRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputCompositeGesturesRequired(Long l) {
        return l != null && inputCompositeGesturesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputDeviceRotationMatrixRequired(Long l) {
        return l != null && inputDeviceRotationMatrixRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputDuetsTouchEventsRequired(Long l) {
        return l != null && inputDuetsTouchEventsRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputFace3DMeshesRequired(Long l) {
        return l != null && inputFace3DMeshesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputFaceMeshesRequired(Long l) {
        return l != null && inputFaceMeshesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputFacesRequired(Long l) {
        if (l != null) {
            return inputFacesRequired(this.nativeInstance, l.longValue()) || inputFaceMeshesRequired(this.nativeInstance, l.longValue()) || inputFace3DMeshesRequired(this.nativeInstance, l.longValue());
        }
        return false;
    }

    public boolean inputFriendsAvatarsRequired(Long l) {
        return l != null && inputFriendsAvatarsRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputFriendsNamesRequired(Long l) {
        return l != null && inputFriendsNamesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputFullSegmentationRequired(Long l) {
        return l != null && inputFullSegmentationRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputGalleryPhotoRequired(Long l) {
        return l != null && inputGalleryPhotoRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputGalleryVideoRequired(Long l) {
        return l != null && inputGalleryVideoRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputGesturesRequired(Long l) {
        return l != null && inputGesturesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputMorphingRequired(Long l) {
        return l != null && inputMorphingRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputMusicTracksMetaRequired(Long l) {
        return l != null && inputMusicTracksMetaRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputRecognitionsRequired(Long l) {
        return l != null && inputRecognitionsRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputRecordingEventsRequired(Long l) {
        return l != null && inputRecordingEventsRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputSkySegmentationRequired(Long l) {
        return l != null && inputSkySegmentationRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputSolvePnpAnglesRequired(Long l) {
        return l != null && inputSolvePnpAnglesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputTouchesRequired(Long l) {
        return l != null && inputTouchesRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputUserCityRequired(Long l) {
        return l != null && inputUserCityRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputUserNameRequired(Long l) {
        return l != null && inputUserNameRequired(this.nativeInstance, l.longValue());
    }

    public boolean inputWhitePatternMatchRequired(Long l) {
        return l != null && inputWhitePatternMatchDetectionRequired(this.nativeInstance, l.longValue());
    }

    public boolean needOffCameraStabilization(Long l) {
        return l != null && needsOffCameraStabilization(this.nativeInstance, l.longValue());
    }

    public boolean needsRewindVideo(Long l) {
        return l != null && needsRewindVideo(this.nativeInstance, l.longValue());
    }

    public boolean outputAudioEventsRequired(Long l) {
        return l != null && outputAudioEventsRequired(this.nativeInstance, l.longValue());
    }

    public boolean outputNotificationsRequired(Long l) {
        return l != null && outputNotificationsRequired(this.nativeInstance, l.longValue());
    }

    public boolean outputRecordingEventsRequired(Long l) {
        return l != null && outputRecordingEventsRequired(this.nativeInstance, l.longValue());
    }

    public void release() {
        release(this.nativeInstance);
        this.wasReleased = true;
        this.effectHandles.clear();
    }

    public boolean restartingEffectAfterDeletingSingleSegmentRequired(Long l) {
        return l != null && lastSegmentRestartingRequired(this.nativeInstance, l.longValue());
    }

    public void setMaskEngineAsset(String str) {
        native_setMaskEngineAsset(str);
    }

    public boolean smallSegmentationRequired(Long l) {
        return l != null && smallSegmentationRequired(this.nativeInstance, l.longValue());
    }

    public boolean tipsRenderRequired(Long l) {
        return l != null && tipsRenderRequired(this.nativeInstance, l.longValue());
    }
}
