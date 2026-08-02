package defpackage;

import io.flutter.plugins.camerax.AspectRatio;
import io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule;
import io.flutter.plugins.camerax.CameraStateErrorCode;
import io.flutter.plugins.camerax.CameraStateType;
import io.flutter.plugins.camerax.CameraXFlashMode;
import io.flutter.plugins.camerax.InfoSupportedHardwareLevel;
import io.flutter.plugins.camerax.LensFacing;
import io.flutter.plugins.camerax.LiveDataSupportedType;
import io.flutter.plugins.camerax.MeteringMode;
import io.flutter.plugins.camerax.ResolutionStrategyFallbackRule;
import io.flutter.plugins.camerax.VideoQuality;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class bu7 extends vzt0 {
    @Override // defpackage.vzt0
    public Object f(byte b, ByteBuffer byteBuffer) {
        int i = 0;
        if (b == -127) {
            Long l = (Long) e(byteBuffer);
            if (l == null) {
                return null;
            }
            int longValue = (int) l.longValue();
            InfoSupportedHardwareLevel.Companion.getClass();
            InfoSupportedHardwareLevel[] values = InfoSupportedHardwareLevel.values();
            int length = values.length;
            while (i < length) {
                InfoSupportedHardwareLevel infoSupportedHardwareLevel = values[i];
                if (infoSupportedHardwareLevel.getRaw() == longValue) {
                    return infoSupportedHardwareLevel;
                }
                i++;
            }
            return null;
        }
        if (b == -126) {
            Long l2 = (Long) e(byteBuffer);
            if (l2 == null) {
                return null;
            }
            int longValue2 = (int) l2.longValue();
            AspectRatio.Companion.getClass();
            AspectRatio[] values2 = AspectRatio.values();
            int length2 = values2.length;
            while (i < length2) {
                AspectRatio aspectRatio = values2[i];
                if (aspectRatio.getRaw() == longValue2) {
                    return aspectRatio;
                }
                i++;
            }
            return null;
        }
        if (b == -125) {
            Long l3 = (Long) e(byteBuffer);
            if (l3 == null) {
                return null;
            }
            int longValue3 = (int) l3.longValue();
            CameraStateType.Companion.getClass();
            CameraStateType[] values3 = CameraStateType.values();
            int length3 = values3.length;
            while (i < length3) {
                CameraStateType cameraStateType = values3[i];
                if (cameraStateType.getRaw() == longValue3) {
                    return cameraStateType;
                }
                i++;
            }
            return null;
        }
        if (b == -124) {
            Long l4 = (Long) e(byteBuffer);
            if (l4 == null) {
                return null;
            }
            int longValue4 = (int) l4.longValue();
            LiveDataSupportedType.Companion.getClass();
            LiveDataSupportedType[] values4 = LiveDataSupportedType.values();
            int length4 = values4.length;
            while (i < length4) {
                LiveDataSupportedType liveDataSupportedType = values4[i];
                if (liveDataSupportedType.getRaw() == longValue4) {
                    return liveDataSupportedType;
                }
                i++;
            }
            return null;
        }
        if (b == -123) {
            Long l5 = (Long) e(byteBuffer);
            if (l5 == null) {
                return null;
            }
            int longValue5 = (int) l5.longValue();
            VideoQuality.Companion.getClass();
            VideoQuality[] values5 = VideoQuality.values();
            int length5 = values5.length;
            while (i < length5) {
                VideoQuality videoQuality = values5[i];
                if (videoQuality.getRaw() == longValue5) {
                    return videoQuality;
                }
                i++;
            }
            return null;
        }
        if (b == -122) {
            Long l6 = (Long) e(byteBuffer);
            if (l6 == null) {
                return null;
            }
            int longValue6 = (int) l6.longValue();
            MeteringMode.Companion.getClass();
            MeteringMode[] values6 = MeteringMode.values();
            int length6 = values6.length;
            while (i < length6) {
                MeteringMode meteringMode = values6[i];
                if (meteringMode.getRaw() == longValue6) {
                    return meteringMode;
                }
                i++;
            }
            return null;
        }
        if (b == -121) {
            Long l7 = (Long) e(byteBuffer);
            if (l7 == null) {
                return null;
            }
            int longValue7 = (int) l7.longValue();
            LensFacing.Companion.getClass();
            LensFacing[] values7 = LensFacing.values();
            int length7 = values7.length;
            while (i < length7) {
                LensFacing lensFacing = values7[i];
                if (lensFacing.getRaw() == longValue7) {
                    return lensFacing;
                }
                i++;
            }
            return null;
        }
        if (b == -120) {
            Long l8 = (Long) e(byteBuffer);
            if (l8 == null) {
                return null;
            }
            int longValue8 = (int) l8.longValue();
            CameraXFlashMode.Companion.getClass();
            CameraXFlashMode[] values8 = CameraXFlashMode.values();
            int length8 = values8.length;
            while (i < length8) {
                CameraXFlashMode cameraXFlashMode = values8[i];
                if (cameraXFlashMode.getRaw() == longValue8) {
                    return cameraXFlashMode;
                }
                i++;
            }
            return null;
        }
        if (b == -119) {
            Long l9 = (Long) e(byteBuffer);
            if (l9 == null) {
                return null;
            }
            int longValue9 = (int) l9.longValue();
            ResolutionStrategyFallbackRule.Companion.getClass();
            ResolutionStrategyFallbackRule[] values9 = ResolutionStrategyFallbackRule.values();
            int length9 = values9.length;
            while (i < length9) {
                ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = values9[i];
                if (resolutionStrategyFallbackRule.getRaw() == longValue9) {
                    return resolutionStrategyFallbackRule;
                }
                i++;
            }
            return null;
        }
        if (b == -118) {
            Long l10 = (Long) e(byteBuffer);
            if (l10 == null) {
                return null;
            }
            int longValue10 = (int) l10.longValue();
            AspectRatioStrategyFallbackRule.Companion.getClass();
            AspectRatioStrategyFallbackRule[] values10 = AspectRatioStrategyFallbackRule.values();
            int length10 = values10.length;
            while (i < length10) {
                AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = values10[i];
                if (aspectRatioStrategyFallbackRule.getRaw() == longValue10) {
                    return aspectRatioStrategyFallbackRule;
                }
                i++;
            }
            return null;
        }
        if (b != -117) {
            return super.f(b, byteBuffer);
        }
        Long l11 = (Long) e(byteBuffer);
        if (l11 == null) {
            return null;
        }
        int longValue11 = (int) l11.longValue();
        CameraStateErrorCode.Companion.getClass();
        CameraStateErrorCode[] values11 = CameraStateErrorCode.values();
        int length11 = values11.length;
        while (i < length11) {
            CameraStateErrorCode cameraStateErrorCode = values11[i];
            if (cameraStateErrorCode.getRaw() == longValue11) {
                return cameraStateErrorCode;
            }
            i++;
        }
        return null;
    }

    @Override // defpackage.vzt0
    public void k(ckn cknVar, Object obj) {
        if (obj instanceof InfoSupportedHardwareLevel) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Long.valueOf(((InfoSupportedHardwareLevel) obj).getRaw()));
            return;
        }
        if (obj instanceof AspectRatio) {
            cknVar.write(130);
            k(cknVar, Long.valueOf(((AspectRatio) obj).getRaw()));
            return;
        }
        if (obj instanceof CameraStateType) {
            cknVar.write(HProv.PP_FAST_CODE);
            k(cknVar, Long.valueOf(((CameraStateType) obj).getRaw()));
            return;
        }
        if (obj instanceof LiveDataSupportedType) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION);
            k(cknVar, Long.valueOf(((LiveDataSupportedType) obj).getRaw()));
            return;
        }
        if (obj instanceof VideoQuality) {
            cknVar.write(HProv.PP_ENUM_CONTAINER_EXTENSION);
            k(cknVar, Long.valueOf(((VideoQuality) obj).getRaw()));
            return;
        }
        if (obj instanceof MeteringMode) {
            cknVar.write(HProv.PP_CONTAINER_EXTENSION_DEL);
            k(cknVar, Long.valueOf(((MeteringMode) obj).getRaw()));
            return;
        }
        if (obj instanceof LensFacing) {
            cknVar.write(HProv.PP_CONTAINER_DEFAULT);
            k(cknVar, Long.valueOf(((LensFacing) obj).getRaw()));
            return;
        }
        if (obj instanceof CameraXFlashMode) {
            cknVar.write(HProv.PP_LCD_QUERY);
            k(cknVar, Long.valueOf(((CameraXFlashMode) obj).getRaw()));
            return;
        }
        if (obj instanceof ResolutionStrategyFallbackRule) {
            cknVar.write(HProv.PP_ENUM_LOG);
            k(cknVar, Long.valueOf(((ResolutionStrategyFallbackRule) obj).getRaw()));
        } else if (obj instanceof AspectRatioStrategyFallbackRule) {
            cknVar.write(HProv.PP_VERSION_EX);
            k(cknVar, Long.valueOf(((AspectRatioStrategyFallbackRule) obj).getRaw()));
        } else if (!(obj instanceof CameraStateErrorCode)) {
            super.k(cknVar, obj);
        } else {
            cknVar.write(139);
            k(cknVar, Long.valueOf(((CameraStateErrorCode) obj).getRaw()));
        }
    }
}
