package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class llo {
    public static final ylo[] c;
    public static final ylo[][] d;
    public static final HashSet e;
    public static final String f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        ylo[] yloVarArr = {new ylo("ImageWidth", 256, 3, 4), new ylo("ImageLength", 257, 3, 4), new ylo("Make", 271, 2), new ylo("Model", 272, 2), new ylo("Orientation", 274, 3), new ylo("XResolution", 282, 5), new ylo("YResolution", 283, 5), new ylo("ResolutionUnit", 296, 3), new ylo("Software", 305, 2), new ylo("DateTime", 306, 2), new ylo("YCbCrPositioning", 531, 3), new ylo("SubIFDPointer", 330, 4), new ylo("ExifIFDPointer", 34665, 4), new ylo("GPSInfoIFDPointer", 34853, 4)};
        ylo[] yloVarArr2 = {new ylo("ExposureTime", 33434, 5), new ylo("FNumber", 33437, 5), new ylo("ExposureProgram", 34850, 3), new ylo("PhotographicSensitivity", 34855, 3), new ylo("SensitivityType", 34864, 3), new ylo("ExifVersion", 36864, 2), new ylo("DateTimeOriginal", 36867, 2), new ylo("DateTimeDigitized", 36868, 2), new ylo("ComponentsConfiguration", 37121, 7), new ylo("ShutterSpeedValue", 37377, 10), new ylo("ApertureValue", 37378, 5), new ylo("BrightnessValue", 37379, 10), new ylo("ExposureBiasValue", 37380, 10), new ylo("MaxApertureValue", 37381, 5), new ylo("MeteringMode", 37383, 3), new ylo("LightSource", 37384, 3), new ylo("Flash", 37385, 3), new ylo("FocalLength", 37386, 5), new ylo("SubSecTime", 37520, 2), new ylo("SubSecTimeOriginal", 37521, 2), new ylo("SubSecTimeDigitized", 37522, 2), new ylo("FlashpixVersion", HProv.ALG_CLASS_KEY_EXCHANGE, 7), new ylo("ColorSpace", 40961, 3), new ylo("PixelXDimension", 40962, 3, 4), new ylo("PixelYDimension", 40963, 3, 4), new ylo("InteroperabilityIFDPointer", 40965, 4), new ylo("FocalPlaneResolutionUnit", 41488, 3), new ylo("SensingMethod", 41495, 3), new ylo("FileSource", 41728, 7), new ylo("SceneType", 41729, 7), new ylo("CustomRendered", 41985, 3), new ylo("ExposureMode", 41986, 3), new ylo("WhiteBalance", 41987, 3), new ylo("SceneCaptureType", 41990, 3), new ylo("Contrast", 41992, 3), new ylo("Saturation", 41993, 3), new ylo("Sharpness", 41994, 3)};
        ylo[] yloVarArr3 = {new ylo("GPSVersionID", 0, 1), new ylo("GPSLatitudeRef", 1, 2), new ylo("GPSLatitude", 2, 5, 10), new ylo("GPSLongitudeRef", 3, 2), new ylo("GPSLongitude", 4, 5, 10), new ylo("GPSAltitudeRef", 5, 1), new ylo("GPSAltitude", 6, 5), new ylo("GPSTimeStamp", 7, 5), new ylo("GPSSpeedRef", 12, 2), new ylo("GPSTrackRef", 14, 2), new ylo("GPSImgDirectionRef", 16, 2), new ylo("GPSDestBearingRef", 23, 2), new ylo("GPSDestDistanceRef", 25, 2)};
        c = new ylo[]{new ylo("SubIFDPointer", 330, 4), new ylo("ExifIFDPointer", 34665, 4), new ylo("GPSInfoIFDPointer", 34853, 4), new ylo("InteroperabilityIFDPointer", 40965, 4)};
        d = new ylo[][]{yloVarArr, yloVarArr2, yloVarArr3, new ylo[]{new ylo("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public llo(ByteOrder byteOrder, ArrayList arrayList) {
        d6z.y("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        d6z.p(i, 0, 4, oyr.j(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.a.get(i);
    }
}
