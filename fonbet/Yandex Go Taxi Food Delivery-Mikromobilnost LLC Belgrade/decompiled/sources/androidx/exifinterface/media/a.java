package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.b64;
import defpackage.dac;
import defpackage.fga1;
import defpackage.gga1;
import defpackage.i77;
import defpackage.mlo;
import defpackage.nlo;
import defpackage.ny61;
import defpackage.olo;
import defpackage.oyr;
import defpackage.plo;
import defpackage.qlo;
import defpackage.w511;
import defpackage.x4e;
import defpackage.yci0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes.dex */
public final class a {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final String[] R;
    public static final int[] S;
    public static final byte[] T;
    public static final olo U;
    public static final olo[][] V;
    public static final olo[] W;
    public static final HashMap[] X;
    public static final HashMap[] Y;
    public static final Set Z;
    public static final HashMap a0;
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final Pattern e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final int[] w;
    public static final int[] x;
    public static final byte[] y;
    public static final byte[] z;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public nlo t;
    public boolean u;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        w = new int[]{8, 8, 8};
        x = new int[]{8};
        y = new byte[]{-1, -40, -1};
        z = new byte[]{102, 116, 121, Alerts.alert_unrecognized_name};
        A = new byte[]{109, 105, 102, 49};
        B = new byte[]{104, 101, 105, 99};
        C = new byte[]{97, 118, 105, 102};
        D = new byte[]{97, 118, 105, 115};
        E = new byte[]{79, 76, 89, 77, Alerts.alert_internal_error, 0};
        F = new byte[]{79, 76, 89, 77, Alerts.alert_internal_error, 85, 83, 0, 73, 73};
        G = new byte[]{-119, Alerts.alert_internal_error, 78, Alerts.alert_insufficient_security, PKIBody._RP, 10, 26, 10};
        H = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        I = new byte[]{82, 73, Alerts.alert_protocol_version, Alerts.alert_protocol_version};
        J = new byte[]{87, 69, 66, Alerts.alert_internal_error};
        K = new byte[]{69, 88, 73, Alerts.alert_protocol_version};
        L = new byte[]{-99, 1, Alerts.alert_bad_certificate};
        M = "VP8X".getBytes(Charset.defaultCharset());
        N = "VP8L".getBytes(Charset.defaultCharset());
        O = "VP8 ".getBytes(Charset.defaultCharset());
        P = "ANIM".getBytes(Charset.defaultCharset());
        Q = "ANMF".getBytes(Charset.defaultCharset());
        R = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        S = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        T = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        olo[] oloVarArr = {new olo("NewSubfileType", 254, 4), new olo("SubfileType", 255, 4), new olo("ImageWidth", 256, 3, 4), new olo("ImageLength", 257, 3, 4), new olo("BitsPerSample", 258, 3), new olo("Compression", MSException.ERROR_NO_MORE_ITEMS, 3), new olo("PhotometricInterpretation", 262, 3), new olo("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new olo("Make", 271, 2), new olo("Model", 272, 2), new olo("StripOffsets", 273, 3, 4), new olo("Orientation", 274, 3), new olo("SamplesPerPixel", 277, 3), new olo("RowsPerStrip", 278, 3, 4), new olo("StripByteCounts", 279, 3, 4), new olo("XResolution", 282, 5), new olo("YResolution", 283, 5), new olo("PlanarConfiguration", 284, 3), new olo("ResolutionUnit", 296, 3), new olo("TransferFunction", IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 3), new olo("Software", 305, 2), new olo("DateTime", 306, 2), new olo("Artist", 315, 2), new olo("WhitePoint", 318, 5), new olo("PrimaryChromaticities", 319, 5), new olo("SubIFDPointer", 330, 4), new olo("JPEGInterchangeFormat", 513, 4), new olo("JPEGInterchangeFormatLength", 514, 4), new olo("YCbCrCoefficients", 529, 5), new olo("YCbCrSubSampling", 530, 3), new olo("YCbCrPositioning", 531, 3), new olo("ReferenceBlackWhite", 532, 5), new olo("Copyright", 33432, 2), new olo("ExifIFDPointer", 34665, 4), new olo("GPSInfoIFDPointer", 34853, 4), new olo("SensorTopBorder", 4, 4), new olo("SensorLeftBorder", 5, 4), new olo("SensorBottomBorder", 6, 4), new olo("SensorRightBorder", 7, 4), new olo("ISO", 23, 3), new olo("JpgFromRaw", 46, 7), new olo("Xmp", 700, 1)};
        olo[] oloVarArr2 = {new olo("ExposureTime", 33434, 5), new olo("FNumber", 33437, 5), new olo("ExposureProgram", 34850, 3), new olo("SpectralSensitivity", 34852, 2), new olo("PhotographicSensitivity", 34855, 3), new olo("OECF", 34856, 7), new olo("SensitivityType", 34864, 3), new olo("StandardOutputSensitivity", 34865, 4), new olo("RecommendedExposureIndex", 34866, 4), new olo("ISOSpeed", 34867, 4), new olo("ISOSpeedLatitudeyyy", 34868, 4), new olo("ISOSpeedLatitudezzz", 34869, 4), new olo("ExifVersion", 36864, 2), new olo("DateTimeOriginal", 36867, 2), new olo("DateTimeDigitized", 36868, 2), new olo("OffsetTime", 36880, 2), new olo("OffsetTimeOriginal", 36881, 2), new olo("OffsetTimeDigitized", 36882, 2), new olo("ComponentsConfiguration", 37121, 7), new olo("CompressedBitsPerPixel", 37122, 5), new olo("ShutterSpeedValue", 37377, 10), new olo("ApertureValue", 37378, 5), new olo("BrightnessValue", 37379, 10), new olo("ExposureBiasValue", 37380, 10), new olo("MaxApertureValue", 37381, 5), new olo("SubjectDistance", 37382, 5), new olo("MeteringMode", 37383, 3), new olo("LightSource", 37384, 3), new olo("Flash", 37385, 3), new olo("FocalLength", 37386, 5), new olo("SubjectArea", 37396, 3), new olo("MakerNote", 37500, 7), new olo("UserComment", 37510, 7), new olo("SubSecTime", 37520, 2), new olo("SubSecTimeOriginal", 37521, 2), new olo("SubSecTimeDigitized", 37522, 2), new olo("FlashpixVersion", HProv.ALG_CLASS_KEY_EXCHANGE, 7), new olo("ColorSpace", 40961, 3), new olo("PixelXDimension", 40962, 3, 4), new olo("PixelYDimension", 40963, 3, 4), new olo("RelatedSoundFile", 40964, 2), new olo("InteroperabilityIFDPointer", 40965, 4), new olo("FlashEnergy", 41483, 5), new olo("SpatialFrequencyResponse", 41484, 7), new olo("FocalPlaneXResolution", 41486, 5), new olo("FocalPlaneYResolution", 41487, 5), new olo("FocalPlaneResolutionUnit", 41488, 3), new olo("SubjectLocation", 41492, 3), new olo("ExposureIndex", 41493, 5), new olo("SensingMethod", 41495, 3), new olo("FileSource", 41728, 7), new olo("SceneType", 41729, 7), new olo("CFAPattern", 41730, 7), new olo("CustomRendered", 41985, 3), new olo("ExposureMode", 41986, 3), new olo("WhiteBalance", 41987, 3), new olo("DigitalZoomRatio", 41988, 5), new olo("FocalLengthIn35mmFilm", 41989, 3), new olo("SceneCaptureType", 41990, 3), new olo("GainControl", 41991, 3), new olo("Contrast", 41992, 3), new olo("Saturation", 41993, 3), new olo("Sharpness", 41994, 3), new olo("DeviceSettingDescription", 41995, 7), new olo("SubjectDistanceRange", 41996, 3), new olo("ImageUniqueID", 42016, 2), new olo("CameraOwnerName", 42032, 2), new olo("BodySerialNumber", 42033, 2), new olo("LensSpecification", 42034, 5), new olo("LensMake", 42035, 2), new olo("LensModel", 42036, 2), new olo("Gamma", 42240, 5), new olo("DNGVersion", 50706, 1), new olo("DefaultCropSize", 50720, 3, 4)};
        olo[] oloVarArr3 = {new olo("GPSVersionID", 0, 1), new olo("GPSLatitudeRef", 1, 2), new olo("GPSLatitude", 2, 5, 10), new olo("GPSLongitudeRef", 3, 2), new olo("GPSLongitude", 4, 5, 10), new olo("GPSAltitudeRef", 5, 1), new olo("GPSAltitude", 6, 5), new olo("GPSTimeStamp", 7, 5), new olo("GPSSatellites", 8, 2), new olo("GPSStatus", 9, 2), new olo("GPSMeasureMode", 10, 2), new olo("GPSDOP", 11, 5), new olo("GPSSpeedRef", 12, 2), new olo("GPSSpeed", 13, 5), new olo("GPSTrackRef", 14, 2), new olo("GPSTrack", 15, 5), new olo("GPSImgDirectionRef", 16, 2), new olo("GPSImgDirection", 17, 5), new olo("GPSMapDatum", 18, 2), new olo("GPSDestLatitudeRef", 19, 2), new olo("GPSDestLatitude", 20, 5), new olo("GPSDestLongitudeRef", 21, 2), new olo("GPSDestLongitude", 22, 5), new olo("GPSDestBearingRef", 23, 2), new olo("GPSDestBearing", 24, 5), new olo("GPSDestDistanceRef", 25, 2), new olo("GPSDestDistance", 26, 5), new olo("GPSProcessingMethod", 27, 7), new olo("GPSAreaInformation", 28, 7), new olo("GPSDateStamp", 29, 2), new olo("GPSDifferential", 30, 3), new olo("GPSHPositioningError", 31, 5)};
        olo[] oloVarArr4 = {new olo("InteroperabilityIndex", 1, 2)};
        olo[] oloVarArr5 = {new olo("NewSubfileType", 254, 4), new olo("SubfileType", 255, 4), new olo("ThumbnailImageWidth", 256, 3, 4), new olo("ThumbnailImageLength", 257, 3, 4), new olo("BitsPerSample", 258, 3), new olo("Compression", MSException.ERROR_NO_MORE_ITEMS, 3), new olo("PhotometricInterpretation", 262, 3), new olo("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new olo("Make", 271, 2), new olo("Model", 272, 2), new olo("StripOffsets", 273, 3, 4), new olo("ThumbnailOrientation", 274, 3), new olo("SamplesPerPixel", 277, 3), new olo("RowsPerStrip", 278, 3, 4), new olo("StripByteCounts", 279, 3, 4), new olo("XResolution", 282, 5), new olo("YResolution", 283, 5), new olo("PlanarConfiguration", 284, 3), new olo("ResolutionUnit", 296, 3), new olo("TransferFunction", IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 3), new olo("Software", 305, 2), new olo("DateTime", 306, 2), new olo("Artist", 315, 2), new olo("WhitePoint", 318, 5), new olo("PrimaryChromaticities", 319, 5), new olo("SubIFDPointer", 330, 4), new olo("JPEGInterchangeFormat", 513, 4), new olo("JPEGInterchangeFormatLength", 514, 4), new olo("YCbCrCoefficients", 529, 5), new olo("YCbCrSubSampling", 530, 3), new olo("YCbCrPositioning", 531, 3), new olo("ReferenceBlackWhite", 532, 5), new olo("Copyright", 33432, 2), new olo("ExifIFDPointer", 34665, 4), new olo("GPSInfoIFDPointer", 34853, 4), new olo("DNGVersion", 50706, 1), new olo("DefaultCropSize", 50720, 3, 4)};
        U = new olo("StripOffsets", 273, 3);
        V = new olo[][]{oloVarArr, oloVarArr2, oloVarArr3, oloVarArr4, oloVarArr5, oloVarArr, new olo[]{new olo("ThumbnailImage", 256, 7), new olo("CameraSettingsIFDPointer", 8224, 4), new olo("ImageProcessingIFDPointer", 8256, 4)}, new olo[]{new olo("PreviewImageStart", 257, 4), new olo("PreviewImageLength", 258, 4)}, new olo[]{new olo("AspectFrame", 4371, 3)}, new olo[]{new olo("ColorSpace", 55, 3)}};
        W = new olo[]{new olo("SubIFDPointer", 330, 4), new olo("ExifIFDPointer", 34665, 4), new olo("GPSInfoIFDPointer", 34853, 4), new olo("InteroperabilityIFDPointer", 40965, 4), new olo("CameraSettingsIFDPointer", 8224, 1), new olo("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        a0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        b0 = forName;
        c0 = "Exif\u0000\u0000".getBytes(forName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            olo[][] oloVarArr6 = V;
            if (i >= oloVarArr6.length) {
                HashMap hashMap = a0;
                olo[] oloVarArr7 = W;
                hashMap.put(Integer.valueOf(oloVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(oloVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(oloVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(oloVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(oloVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(oloVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i] = new HashMap();
            Y[i] = new HashMap();
            for (olo oloVar : oloVarArr6[i]) {
                X[i].put(Integer.valueOf(oloVar.a), oloVar);
                Y[i].put(oloVar.b, oloVar);
            }
            i++;
        }
    }

    public a(InputStream inputStream) {
        olo[][] oloVarArr = V;
        this.f = new HashMap[oloVarArr.length];
        this.g = new HashSet(oloVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            ny61.t("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.c = null;
            this.b = null;
        }
        w(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            yci0.r(e);
            return 0.0d;
        }
    }

    public static Pair s(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair s = s(split[0]);
            if (((Integer) s.first).intValue() == 2) {
                return s;
            }
            for (int i = 1; i < split.length; i++) {
                Pair s2 = s(split[i]);
                int intValue = (((Integer) s2.first).equals(s.first) || ((Integer) s2.second).equals(s.first)) ? ((Integer) s.first).intValue() : -1;
                int intValue2 = (((Integer) s.second).intValue() == -1 || !(((Integer) s2.first).equals(s.second) || ((Integer) s2.second).equals(s.second))) ? -1 : ((Integer) s.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    s = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    s = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return s;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder z(mlo mloVar) {
        short readShort = mloVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        ny61.v(oyr.r(new StringBuilder("Invalid byte order: "), readShort));
        return null;
    }

    public final void A(int i, byte[] bArr) {
        qlo qloVar = new qlo(bArr);
        x(qloVar);
        B(qloVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(qlo qloVar, int i) {
        boolean z2;
        HashMap[] hashMapArr;
        short s;
        boolean z3;
        long j;
        HashMap[] hashMapArr2;
        olo oloVar;
        long j2;
        boolean z4;
        int i2;
        HashMap[] hashMapArr3;
        int i3;
        olo oloVar2;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5;
        int i6 = i;
        Integer valueOf = Integer.valueOf(qloVar.b);
        HashSet hashSet = this.g;
        hashSet.add(valueOf);
        short readShort = qloVar.readShort();
        if (readShort <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z2 = v;
            hashMapArr = this.f;
            if (s2 >= readShort) {
                break;
            }
            int readUnsignedShort2 = qloVar.readUnsignedShort();
            int readUnsignedShort3 = qloVar.readUnsignedShort();
            int readInt = qloVar.readInt();
            short s3 = s2;
            long j4 = qloVar.b + 4;
            olo oloVar3 = (olo) X[i6].get(Integer.valueOf(readUnsignedShort2));
            if (z2) {
                j = 4;
                s = readShort;
                z3 = z2;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i6), Integer.valueOf(readUnsignedShort2), oloVar3 != null ? oloVar3.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
            } else {
                s = readShort;
                z3 = z2;
                j = 4;
            }
            if (oloVar3 != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < S.length) {
                    int i7 = oloVar3.c;
                    if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = oloVar3.d) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i7;
                        }
                        hashMapArr2 = hashMapArr;
                        oloVar = oloVar3;
                        j2 = readInt * r15[readUnsignedShort3];
                        if (j2 >= 0 && j2 <= 2147483647L) {
                            z4 = true;
                            if (z4) {
                                if (j2 > j) {
                                    int readInt2 = qloVar.readInt();
                                    if (this.d == 7) {
                                        hashMapArr3 = hashMapArr2;
                                        oloVar2 = oloVar;
                                        if ("MakerNote".equals(oloVar2.b)) {
                                            this.q = readInt2;
                                        } else if (i6 == 6 && "ThumbnailImage".equals(oloVar2.b)) {
                                            this.r = readInt2;
                                            this.s = readInt;
                                            nlo f = nlo.f(6, this.h);
                                            i3 = readUnsignedShort2;
                                            nlo c = nlo.c(this.r, this.h);
                                            i4 = readInt;
                                            nlo c2 = nlo.c(this.s, this.h);
                                            hashMapArr3[4].put("Compression", f);
                                            hashMapArr3[4].put("JPEGInterchangeFormat", c);
                                            hashMapArr3[4].put("JPEGInterchangeFormatLength", c2);
                                            qloVar.c(readInt2);
                                        }
                                        i3 = readUnsignedShort2;
                                    } else {
                                        hashMapArr3 = hashMapArr2;
                                        i3 = readUnsignedShort2;
                                        oloVar2 = oloVar;
                                    }
                                    i4 = readInt;
                                    qloVar.c(readInt2);
                                } else {
                                    hashMapArr3 = hashMapArr2;
                                    i3 = readUnsignedShort2;
                                    oloVar2 = oloVar;
                                    i4 = readInt;
                                }
                                Integer num = (Integer) a0.get(Integer.valueOf(i3));
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 == 4) {
                                            j3 = qloVar.readInt() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                                        } else if (readUnsignedShort3 == 8) {
                                            readUnsignedShort = qloVar.readShort();
                                        } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                            readUnsignedShort = qloVar.readInt();
                                        } else {
                                            j3 = -1;
                                        }
                                        if (z3) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j3), oloVar2.b);
                                        }
                                        if (j3 > 0 && (((i5 = qloVar.x) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
                                            qloVar.c(j3);
                                            B(qloVar, num.intValue());
                                        }
                                        qloVar.c(j4);
                                    } else {
                                        readUnsignedShort = qloVar.readUnsignedShort();
                                    }
                                    j3 = readUnsignedShort;
                                    if (z3) {
                                    }
                                    if (j3 > 0) {
                                        qloVar.c(j3);
                                        B(qloVar, num.intValue());
                                    }
                                    qloVar.c(j4);
                                } else {
                                    int i8 = qloVar.b + this.p;
                                    byte[] bArr = new byte[(int) j2];
                                    qloVar.readFully(bArr);
                                    nlo nloVar = new nlo(readUnsignedShort3, i4, i8, bArr);
                                    HashMap hashMap = hashMapArr3[i];
                                    String str = oloVar2.b;
                                    hashMap.put(str, nloVar);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && nloVar.j(this.h).contains("PENTAX")) || ("Compression".equals(str) && nloVar.i(this.h) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (qloVar.b != j4) {
                                        qloVar.c(j4);
                                    }
                                }
                            } else {
                                qloVar.c(j4);
                            }
                            s2 = (short) (s3 + 1);
                            i6 = i;
                            readShort = s;
                        }
                        z4 = false;
                        if (z4) {
                        }
                        s2 = (short) (s3 + 1);
                        i6 = i;
                        readShort = s;
                    } else if (z3) {
                        String str2 = R[readUnsignedShort3];
                    }
                }
            }
            oloVar = oloVar3;
            hashMapArr2 = hashMapArr;
            j2 = 0;
            z4 = false;
            if (z4) {
            }
            s2 = (short) (s3 + 1);
            i6 = i;
            readShort = s;
        }
        int readInt3 = qloVar.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
        }
        long j5 = readInt3;
        if (j5 <= 0 || hashSet.contains(Integer.valueOf(readInt3))) {
            return;
        }
        qloVar.c(j5);
        if (hashMapArr[4].isEmpty()) {
            B(qloVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            B(qloVar, 5);
        }
    }

    public final void C(String str) {
        for (int i = 0; i < V.length; i++) {
            this.f[i].remove(str);
        }
    }

    public final void D(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (nlo) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #15 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:66:0x00ef, B:68:0x00f3, B:70:0x0111, B:74:0x0102), top: B:65:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102 A[Catch: all -> 0x00fc, Exception -> 0x00ff, TryCatch #15 {Exception -> 0x00ff, all -> 0x00fc, blocks: (B:66:0x00ef, B:68:0x00f3, B:70:0x0111, B:74:0x0102), top: B:65:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        FileOutputStream fileOutputStream;
        File createTempFile;
        InputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Closeable closeable;
        InputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream3;
        Object obj;
        int i = this.d;
        if (i != 4 && i != 13 && i != 14) {
            ny61.v("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        if (this.b == null && this.a == null) {
            ny61.v("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (this.i && this.j && !this.k) {
            ny61.v("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i2 = this.o;
        InputStream inputStream = null;
        this.n = (i2 == 6 || i2 == 7) ? q() : null;
        try {
            createTempFile = File.createTempFile("temp", CSPDirectoryConstants.SUBDIRECTORY_TMP);
            if (this.a != null) {
                fileInputStream = new FileInputStream(this.a);
            } else {
                Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.b);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            gga1.g(fileInputStream, fileOutputStream);
            gga1.d(fileInputStream);
            gga1.d(fileOutputStream);
            try {
                try {
                    try {
                        fileInputStream3 = new FileInputStream(createTempFile);
                        try {
                            if (this.a != null) {
                                fileOutputStream2 = new FileOutputStream(this.a);
                            } else {
                                Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream2 = new FileOutputStream(this.b);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileOutputStream2 = null;
                            obj = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable = null;
                    gga1.d(inputStream);
                    gga1.d(closeable);
                    if (0 == 0) {
                        createTempFile.delete();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream2 = null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                    try {
                        int i3 = this.d;
                        if (i3 == 4) {
                            F(bufferedInputStream, bufferedOutputStream);
                        } else if (i3 == 13) {
                            G(bufferedInputStream, bufferedOutputStream);
                        } else if (i3 == 14) {
                            H(bufferedInputStream, bufferedOutputStream);
                        }
                        gga1.d(bufferedInputStream);
                        gga1.d(bufferedOutputStream);
                        createTempFile.delete();
                        this.n = null;
                    } catch (Exception e5) {
                        e = e5;
                        inputStream = fileInputStream3;
                        try {
                            try {
                                fileInputStream2 = new FileInputStream(createTempFile);
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                        try {
                            if (this.a == null) {
                                fileOutputStream3 = new FileOutputStream(this.a);
                            } else {
                                Os.lseek(this.b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream3 = new FileOutputStream(this.b);
                            }
                            fileOutputStream2 = fileOutputStream3;
                            gga1.g(fileInputStream2, fileOutputStream2);
                            gga1.d(fileInputStream2);
                            gga1.d(fileOutputStream2);
                            throw new IOException("Failed to save new file", e);
                        } catch (Exception e7) {
                            e = e7;
                            inputStream = fileInputStream2;
                            throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = fileInputStream2;
                            gga1.d(inputStream);
                            gga1.d(fileOutputStream2);
                            throw th;
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                } catch (Throwable th7) {
                    th = th7;
                    closeable = null;
                    inputStream = bufferedInputStream;
                    gga1.d(inputStream);
                    gga1.d(closeable);
                    if (0 == 0) {
                    }
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                obj = null;
                inputStream = fileInputStream3;
                fileInputStream2 = new FileInputStream(createTempFile);
                if (this.a == null) {
                }
                fileOutputStream2 = fileOutputStream3;
                gga1.g(fileInputStream2, fileOutputStream2);
                gga1.d(fileInputStream2);
                gga1.d(fileOutputStream2);
                throw new IOException("Failed to save new file", e);
            }
        } catch (Exception e10) {
            e = e10;
            inputStream = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th8) {
                th = th8;
                gga1.d(inputStream);
                gga1.d(fileOutputStream);
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            inputStream = fileInputStream;
            gga1.d(inputStream);
            gga1.d(fileOutputStream);
            throw th;
        }
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        byte readByte;
        if (v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        mlo mloVar = new mlo(bufferedInputStream);
        i77 i77Var = new i77(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (mloVar.readByte() != -1) {
            ny61.v("Invalid marker");
            return;
        }
        i77Var.c(-1);
        if (mloVar.readByte() != -40) {
            ny61.v("Invalid marker");
            return;
        }
        i77Var.c(-40);
        i77Var.c(-1);
        i77Var.c(-31);
        this.p = N(i77Var);
        nlo nloVar = this.t;
        byte[] bArr = d0;
        if (nloVar != null) {
            i77Var.write(-1);
            i77Var.c(-31);
            i77Var.n(bArr.length + 2 + this.t.d.length);
            i77Var.write(bArr);
            i77Var.write(this.t.d);
            this.u = true;
        }
        byte[] bArr2 = new byte[4096];
        while (mloVar.readByte() == -1) {
            do {
                readByte = mloVar.readByte();
            } while (readByte == -1);
            if (readByte == -39 || readByte == -38) {
                i77Var.c(-1);
                i77Var.c(readByte);
                gga1.g(mloVar, i77Var);
                return;
            }
            if (readByte != -31) {
                i77Var.c(-1);
                i77Var.c(readByte);
                int readUnsignedShort = mloVar.readUnsignedShort();
                i77Var.n(readUnsignedShort);
                int i = readUnsignedShort - 2;
                if (i < 0) {
                    ny61.v("Invalid length");
                    return;
                }
                while (i > 0) {
                    int read = mloVar.read(bArr2, 0, Math.min(i, 4096));
                    if (read >= 0) {
                        i77Var.write(bArr2, 0, read);
                        i -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = mloVar.readUnsignedShort();
                int i2 = readUnsignedShort2 - 2;
                if (i2 < 0) {
                    ny61.v("Invalid length");
                    return;
                }
                int length = bArr.length;
                byte[] bArr3 = c0;
                byte[] bArr4 = i2 >= length ? new byte[bArr.length] : i2 >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    mloVar.readFully(bArr4);
                    if (gga1.k(bArr4, bArr3) || gga1.k(bArr4, bArr)) {
                        mloVar.a(i2 - bArr4.length);
                    }
                }
                i77Var.c(-1);
                i77Var.c(readByte);
                i77Var.n(readUnsignedShort2);
                if (bArr4 != null) {
                    i2 -= bArr4.length;
                    i77Var.write(bArr4);
                }
                while (i2 > 0) {
                    int read2 = mloVar.read(bArr2, 0, Math.min(i2, 4096));
                    if (read2 >= 0) {
                        i77Var.write(bArr2, 0, read2);
                        i2 -= read2;
                    }
                }
            }
        }
        ny61.v("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005b -> B:9:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = androidx.exifinterface.media.a.v
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            mlo r0 = new mlo
            r0.<init>(r9)
            i77 r9 = new i77
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = androidx.exifinterface.media.a.G
            int r10 = r10.length
            defpackage.gga1.f(r0, r9, r10)
            nlo r10 = r8.t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.u
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            defpackage.gga1.g(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.d(r3)
            r9.d(r4)
            int r3 = r3 + 4
            defpackage.gga1.f(r0, r9, r3)
            int r3 = r8.p
            if (r3 != 0) goto L50
            r8.O(r9)
            r1 = r2
        L50:
            nlo r3 = r8.t
            if (r3 == 0) goto L27
            boolean r3 = r8.u
            if (r3 != 0) goto L27
            r8.P(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.O(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = androidx.exifinterface.media.a.H
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            nlo r10 = r8.t
            if (r10 == 0) goto L8f
            r8.P(r9)
        L8f:
            r0.a(r6)
            goto L5b
        L93:
            r9.d(r3)
            r9.d(r4)
            r9.write(r7)
            defpackage.gga1.f(r0, r9, r6)
            goto L27
        La0:
            r9.d(r3)
            r9.d(r4)
            int r3 = r3 + 4
            defpackage.gga1.f(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0264 A[Catch: all -> 0x022c, Exception -> 0x0231, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0231, all -> 0x022c, blocks: (B:22:0x0264, B:121:0x0222, B:126:0x023d), top: B:11:0x003c }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        i77 i77Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        i77 i77Var2;
        int N2;
        ByteArrayOutputStream byteArrayOutputStream3;
        byte[] bArr;
        boolean z2;
        if (v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        mlo mloVar = new mlo(bufferedInputStream, byteOrder);
        i77 i77Var3 = new i77(bufferedOutputStream, byteOrder);
        byte[] bArr2 = I;
        gga1.f(mloVar, i77Var3, bArr2.length);
        int readInt = mloVar.readInt();
        byte[] bArr3 = J;
        mloVar.a(bArr3.length);
        ByteArrayOutputStream byteArrayOutputStream4 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    i77Var = new i77(byteArrayOutputStream, byteOrder);
                    i = this.p;
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
            } catch (Exception e3) {
                e = e3;
                byteArrayOutputStream4 = byteArrayOutputStream;
                throw new IOException("Failed to save WebP file", e);
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream4 = byteArrayOutputStream;
                gga1.d(byteArrayOutputStream4);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream4 = bufferedOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream4 = bufferedOutputStream;
            gga1.d(byteArrayOutputStream4);
            throw th;
        }
        try {
            if (i != 0) {
                gga1.f(mloVar, i77Var, (i - ((bArr2.length + 4) + bArr3.length)) - 8);
                mloVar.a(4);
                int readInt2 = mloVar.readInt();
                if (readInt2 % 2 != 0) {
                    readInt2++;
                }
                mloVar.a(readInt2);
                N2 = N(i77Var);
                i77Var2 = i77Var3;
                i3 = readInt;
                byteArrayOutputStream3 = byteArrayOutputStream;
            } else {
                byte[] bArr4 = new byte[4];
                mloVar.readFully(bArr4);
                byte[] bArr5 = M;
                boolean equals = Arrays.equals(bArr4, bArr5);
                byte[] bArr6 = O;
                byte[] bArr7 = N;
                if (equals) {
                    int readInt3 = mloVar.readInt();
                    byte[] bArr8 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                    mloVar.readFully(bArr8);
                    byte b = (byte) (bArr8[0] | 8);
                    bArr8[0] = b;
                    boolean z3 = ((b >> 1) & 1) == 1;
                    i77Var.write(bArr5);
                    i77Var.d(readInt3);
                    i77Var.write(bArr8);
                    if (z3) {
                        byte[] bArr9 = P;
                        do {
                            bArr = new byte[4];
                            mloVar.readFully(bArr);
                            int readInt4 = mloVar.readInt();
                            i77Var.write(bArr);
                            i77Var.d(readInt4);
                            if (readInt4 % 2 == 1) {
                                readInt4++;
                            }
                            gga1.f(mloVar, i77Var, readInt4);
                        } while (!Arrays.equals(bArr, bArr9));
                        while (true) {
                            byte[] bArr10 = new byte[4];
                            try {
                                mloVar.readFully(bArr10);
                                z2 = !Arrays.equals(bArr10, Q);
                            } catch (EOFException unused) {
                                z2 = true;
                            }
                            if (z2) {
                                break;
                            }
                            int readInt5 = mloVar.readInt();
                            i77Var.write(bArr10);
                            i77Var.d(readInt5);
                            if (readInt5 % 2 == 1) {
                                readInt5++;
                            }
                            gga1.f(mloVar, i77Var, readInt5);
                        }
                        N2 = N(i77Var);
                    } else {
                        while (true) {
                            byte[] bArr11 = new byte[4];
                            mloVar.readFully(bArr11);
                            int readInt6 = mloVar.readInt();
                            i77Var.write(bArr11);
                            i77Var.d(readInt6);
                            if (readInt6 % 2 == 1) {
                                readInt6++;
                            }
                            gga1.f(mloVar, i77Var, readInt6);
                            if (Arrays.equals(bArr11, bArr6) || (bArr7 != null && Arrays.equals(bArr11, bArr7))) {
                                break;
                            }
                        }
                        N2 = N(i77Var);
                    }
                    i77Var2 = i77Var3;
                    i3 = readInt;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                } else {
                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                        int readInt7 = mloVar.readInt();
                        int i8 = readInt7 % 2 == 1 ? readInt7 + 1 : readInt7;
                        boolean z4 = true;
                        byte[] bArr12 = new byte[3];
                        boolean equals2 = Arrays.equals(bArr4, bArr6);
                        i2 = -1;
                        byte[] bArr13 = L;
                        if (equals2) {
                            mloVar.readFully(bArr12);
                            byte[] bArr14 = new byte[3];
                            mloVar.readFully(bArr14);
                            if (!Arrays.equals(bArr13, bArr14)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            i5 = mloVar.readInt();
                            i3 = readInt;
                            i8 -= 10;
                            i6 = (i5 >> 16) & 16383;
                            i4 = i5 & 16383;
                            z4 = false;
                        } else {
                            i3 = readInt;
                            if (!Arrays.equals(bArr4, bArr7)) {
                                i4 = 0;
                                i5 = 0;
                                z4 = false;
                                i6 = 0;
                            } else {
                                if (mloVar.readByte() != 47) {
                                    throw new IOException("Error checking VP8L signature");
                                }
                                i5 = mloVar.readInt();
                                i4 = (i5 & 16383) + 1;
                                i6 = ((i5 & 268419072) >>> 14) + 1;
                                if ((i5 & SelfTester_JCP.IMITA) == 0) {
                                    z4 = false;
                                }
                                i8 -= 5;
                            }
                        }
                        i77Var.write(bArr5);
                        i77Var.d(10);
                        byte[] bArr15 = new byte[10];
                        if (z4) {
                            i7 = i4;
                            bArr15[0] = (byte) (bArr15[0] | PKIBody._CKUANN);
                        } else {
                            i7 = i4;
                        }
                        bArr15[0] = (byte) (bArr15[0] | 8);
                        int i9 = i7 - 1;
                        bufferedOutputStream = byteArrayOutputStream;
                        int i10 = i6 - 1;
                        i77Var2 = i77Var3;
                        try {
                            bArr15[4] = (byte) i9;
                            bArr15[5] = (byte) (i9 >> 8);
                            bArr15[6] = (byte) (i9 >> 16);
                            bArr15[7] = (byte) i10;
                            bArr15[8] = (byte) (i10 >> 8);
                            bArr15[9] = (byte) (i10 >> 16);
                            i77Var.write(bArr15);
                            i77Var.write(bArr4);
                            i77Var.d(readInt7);
                            if (Arrays.equals(bArr4, bArr6)) {
                                i77Var.write(bArr12);
                                i77Var.write(bArr13);
                                i77Var.d(i5);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                i77Var.write(47);
                                i77Var.d(i5);
                            }
                            gga1.f(mloVar, i77Var, i8);
                            N2 = N(i77Var);
                            bufferedOutputStream = bufferedOutputStream;
                            gga1.f(mloVar, i77Var, (i3 + 8) - mloVar.b);
                            i77 i77Var4 = i77Var2;
                            i77Var4.d(bufferedOutputStream.size() + bArr3.length);
                            i77Var4.write(bArr3);
                            if (N2 != i2) {
                                this.p = ((DataOutputStream) i77Var4.c).size() + N2;
                            }
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream2.writeTo(i77Var4);
                            gga1.g(mloVar, i77Var4);
                            gga1.d(byteArrayOutputStream2);
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream4 = byteArrayOutputStream2;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream4 = byteArrayOutputStream2;
                            gga1.d(byteArrayOutputStream4);
                            throw th;
                        }
                    }
                    i77Var2 = i77Var3;
                    i3 = readInt;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    N2 = -1;
                }
            }
            byteArrayOutputStream2.writeTo(i77Var4);
            gga1.g(mloVar, i77Var4);
            gga1.d(byteArrayOutputStream2);
            return;
        } catch (Exception e6) {
            e = e6;
            byteArrayOutputStream4 = byteArrayOutputStream2;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream4 = byteArrayOutputStream2;
            gga1.d(byteArrayOutputStream4);
            throw th;
        }
        i2 = -1;
        bufferedOutputStream = byteArrayOutputStream3;
        gga1.f(mloVar, i77Var, (i3 + 8) - mloVar.b);
        i77 i77Var42 = i77Var2;
        i77Var42.d(bufferedOutputStream.size() + bArr3.length);
        i77Var42.write(bArr3);
        if (N2 != i2) {
        }
        byteArrayOutputStream2 = bufferedOutputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str, String str2) {
        olo oloVar;
        int i;
        int i2;
        String str3 = str2;
        String str4 = "ISOSpeedRatings".equals(str) ? "PhotographicSensitivity" : str;
        int i3 = 2;
        int i4 = 1;
        if (str3 != null) {
            if (Z.contains(str4) && !str3.contains("/")) {
                try {
                    str3 = plo.b(Double.parseDouble(str3)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = e0.matcher(str3);
                if (!matcher.find()) {
                    return;
                }
                str3 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean find = f0.matcher(str3).find();
                boolean find2 = g0.matcher(str3).find();
                if (str3.length() != 19) {
                    return;
                }
                if (!find && !find2) {
                    return;
                }
                if (find2) {
                    str3 = str3.replaceAll("-", ":");
                }
            }
        }
        boolean equals = "Xmp".equals(str4);
        int i5 = 12;
        int i6 = 9;
        int i7 = 4;
        HashMap[] hashMapArr = this.f;
        int i8 = 0;
        if (equals) {
            boolean z2 = hashMapArr[0].containsKey("Xmp") || hashMapArr[5].containsKey("Xmp");
            int i9 = this.d;
            char c = i9 != 4 ? (i9 == 9 || i9 == 15 || i9 == 12 || i9 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c == 2 && (this.t != null || !z2)) || (c == 3 && !z2)) {
                this.t = str3 != null ? nlo.a(str3) : null;
                return;
            }
        }
        int i10 = 0;
        while (i10 < V.length) {
            if ((i10 != i7 || this.i) && (oloVar = (olo) Y[i10].get(str4)) != null) {
                int i11 = oloVar.d;
                int i12 = oloVar.c;
                if (str3 == null) {
                    hashMapArr[i10].remove(str4);
                } else {
                    Pair s = s(str3);
                    if (i12 != ((Integer) s.first).intValue() && i12 != ((Integer) s.second).intValue()) {
                        if (i11 == -1 || (i11 != ((Integer) s.first).intValue() && i11 != ((Integer) s.second).intValue())) {
                            if (i12 != i4 && i12 != 7 && i12 != i3) {
                                if (v) {
                                    String[] strArr = R;
                                    String str5 = strArr[i12];
                                    if (i11 != -1) {
                                        String str6 = strArr[i11];
                                    }
                                    String str7 = strArr[((Integer) s.first).intValue()];
                                    if (((Integer) s.second).intValue() != -1) {
                                        String str8 = strArr[((Integer) s.second).intValue()];
                                    }
                                }
                            }
                        }
                        int[] iArr = S;
                        switch (i11) {
                            case 1:
                                i = i4;
                                i2 = i8;
                                hashMapArr[i10].put(str4, nlo.a(str3));
                                break;
                            case 2:
                            case 7:
                                i = i4;
                                i2 = i8;
                                hashMapArr[i10].put(str4, nlo.b(str3));
                                break;
                            case 3:
                                i = i4;
                                i2 = i8;
                                String[] split = str3.split(",", -1);
                                int[] iArr2 = new int[split.length];
                                for (int i13 = i2; i13 < split.length; i13++) {
                                    iArr2[i13] = Integer.parseInt(split[i13]);
                                }
                                hashMapArr[i10].put(str4, nlo.g(iArr2, this.h));
                                break;
                            case 4:
                                i = i4;
                                i2 = i8;
                                String[] split2 = str3.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i14 = i2; i14 < split2.length; i14++) {
                                    jArr[i14] = Long.parseLong(split2[i14]);
                                }
                                hashMapArr[i10].put(str4, nlo.d(jArr, this.h));
                                break;
                            case 5:
                                i = i4;
                                i2 = i8;
                                String[] split3 = str3.split(",", -1);
                                plo[] ploVarArr = new plo[split3.length];
                                for (int i15 = i2; i15 < split3.length; i15++) {
                                    String[] split4 = split3[i15].split("/", -1);
                                    ploVarArr[i15] = new plo(0, (long) Double.parseDouble(split4[i2]), (long) Double.parseDouble(split4[i]));
                                }
                                hashMapArr[i10].put(str4, nlo.e(ploVarArr, this.h));
                                break;
                            case 9:
                                i = i4;
                                int i16 = i6;
                                i2 = i8;
                                String[] split5 = str3.split(",", -1);
                                int length = split5.length;
                                int[] iArr3 = new int[length];
                                for (int i17 = i2; i17 < split5.length; i17++) {
                                    iArr3[i17] = Integer.parseInt(split5[i17]);
                                }
                                HashMap hashMap = hashMapArr[i10];
                                ByteOrder byteOrder = this.h;
                                ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[i16] * length]);
                                wrap.order(byteOrder);
                                for (int i18 = i2; i18 < length; i18++) {
                                    wrap.putInt(iArr3[i18]);
                                }
                                hashMap.put(str4, new nlo(i16, length, wrap.array()));
                                break;
                            case 10:
                                i2 = i8;
                                String[] split6 = str3.split(",", -1);
                                int length2 = split6.length;
                                plo[] ploVarArr2 = new plo[length2];
                                int i19 = i2;
                                while (i19 < split6.length) {
                                    String[] split7 = split6[i19].split("/", -1);
                                    int i20 = i4;
                                    ploVarArr2[i19] = new plo(0, (long) Double.parseDouble(split7[i2]), (long) Double.parseDouble(split7[i20]));
                                    i19++;
                                    i4 = i20;
                                    iArr = iArr;
                                    i6 = i6;
                                }
                                i = i4;
                                HashMap hashMap2 = hashMapArr[i10];
                                ByteOrder byteOrder2 = this.h;
                                ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                wrap2.order(byteOrder2);
                                for (int i21 = i2; i21 < length2; i21++) {
                                    plo ploVar = ploVarArr2[i21];
                                    wrap2.putInt((int) ploVar.a);
                                    wrap2.putInt((int) ploVar.b);
                                }
                                hashMap2.put(str4, new nlo(10, length2, wrap2.array()));
                                break;
                            case 12:
                                String[] split8 = str3.split(",", -1);
                                int length3 = split8.length;
                                double[] dArr = new double[length3];
                                for (int i22 = i8; i22 < split8.length; i22++) {
                                    dArr[i22] = Double.parseDouble(split8[i22]);
                                }
                                HashMap hashMap3 = hashMapArr[i10];
                                ByteOrder byteOrder3 = this.h;
                                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[i5] * length3]);
                                wrap3.order(byteOrder3);
                                int i23 = i8;
                                while (i23 < length3) {
                                    double[] dArr2 = dArr;
                                    wrap3.putDouble(dArr2[i23]);
                                    i23++;
                                    i8 = i8;
                                    dArr = dArr2;
                                }
                                i2 = i8;
                                hashMap3.put(str4, new nlo(i5, length3, wrap3.array()));
                                i = i4;
                                break;
                        }
                        i10++;
                        i8 = i2;
                        i4 = i;
                        i3 = 2;
                        i5 = 12;
                        i6 = 9;
                        i7 = 4;
                    }
                    i11 = i12;
                    int[] iArr4 = S;
                    switch (i11) {
                    }
                    i10++;
                    i8 = i2;
                    i4 = i;
                    i3 = 2;
                    i5 = 12;
                    i6 = 9;
                    i7 = 4;
                }
            }
            i = i4;
            i2 = i8;
            i10++;
            i8 = i2;
            i4 = i;
            i3 = 2;
            i5 = 12;
            i6 = 9;
            i7 = 4;
        }
    }

    public final void J(mlo mloVar) {
        nlo nloVar;
        HashMap hashMap = this.f[4];
        nlo nloVar2 = (nlo) hashMap.get("Compression");
        if (nloVar2 == null) {
            this.o = 6;
            t(mloVar, hashMap);
            return;
        }
        int i = nloVar2.i(this.h);
        this.o = i;
        if (i != 1) {
            if (i == 6) {
                t(mloVar, hashMap);
                return;
            } else if (i != 7) {
                return;
            }
        }
        nlo nloVar3 = (nlo) hashMap.get("BitsPerSample");
        if (nloVar3 != null) {
            int[] iArr = (int[]) nloVar3.k(this.h);
            int[] iArr2 = w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (nloVar = (nlo) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int i2 = nloVar.i(this.h);
                if ((i2 != 1 || !Arrays.equals(iArr, x)) && (i2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            nlo nloVar4 = (nlo) hashMap.get("StripOffsets");
            nlo nloVar5 = (nlo) hashMap.get("StripByteCounts");
            if (nloVar4 == null || nloVar5 == null) {
                return;
            }
            long[] e = gga1.e(nloVar4.k(this.h));
            long[] e2 = gga1.e(nloVar5.k(this.h));
            if (e == null || e.length == 0 || e2 == null || e2.length == 0 || e.length != e2.length) {
                return;
            }
            long j = 0;
            for (long j2 : e2) {
                j += j2;
            }
            int i3 = (int) j;
            byte[] bArr = new byte[i3];
            this.k = true;
            this.j = true;
            this.i = true;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < e.length; i6++) {
                int i7 = (int) e[i6];
                int i8 = (int) e2[i6];
                if (i6 < e.length - 1 && i7 + i8 != e[i6 + 1]) {
                    this.k = false;
                }
                int i9 = i7 - i4;
                if (i9 < 0) {
                    return;
                }
                try {
                    mloVar.a(i9);
                    int i10 = i4 + i9;
                    byte[] bArr2 = new byte[i8];
                    mloVar.readFully(bArr2);
                    i4 = i10 + i8;
                    System.arraycopy(bArr2, 0, bArr, i5, i8);
                    i5 += i8;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.n = bArr;
            if (this.k) {
                this.l = (int) e[0];
                this.m = i3;
            }
        }
    }

    public final void K(int i, int i2) {
        HashMap[] hashMapArr = this.f;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        nlo nloVar = (nlo) hashMapArr[i].get("ImageLength");
        nlo nloVar2 = (nlo) hashMapArr[i].get("ImageWidth");
        nlo nloVar3 = (nlo) hashMapArr[i2].get("ImageLength");
        nlo nloVar4 = (nlo) hashMapArr[i2].get("ImageWidth");
        if (nloVar == null || nloVar2 == null || nloVar3 == null || nloVar4 == null) {
            return;
        }
        int i3 = nloVar.i(this.h);
        int i4 = nloVar2.i(this.h);
        int i5 = nloVar3.i(this.h);
        int i6 = nloVar4.i(this.h);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void L(qlo qloVar, int i) {
        nlo f;
        nlo f2;
        HashMap[] hashMapArr = this.f;
        nlo nloVar = (nlo) hashMapArr[i].get("DefaultCropSize");
        nlo nloVar2 = (nlo) hashMapArr[i].get("SensorTopBorder");
        nlo nloVar3 = (nlo) hashMapArr[i].get("SensorLeftBorder");
        nlo nloVar4 = (nlo) hashMapArr[i].get("SensorBottomBorder");
        nlo nloVar5 = (nlo) hashMapArr[i].get("SensorRightBorder");
        if (nloVar != null) {
            int i2 = nloVar.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                plo[] ploVarArr = (plo[]) nloVar.k(byteOrder);
                if (ploVarArr == null || ploVarArr.length != 2) {
                    Arrays.toString(ploVarArr);
                    return;
                }
                f = nlo.e(new plo[]{ploVarArr[0]}, this.h);
                f2 = nlo.e(new plo[]{ploVarArr[1]}, this.h);
            } else {
                int[] iArr = (int[]) nloVar.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    f = nlo.f(iArr[0], this.h);
                    f2 = nlo.f(iArr[1], this.h);
                }
            }
            hashMapArr[i].put("ImageWidth", f);
            hashMapArr[i].put("ImageLength", f2);
            return;
        }
        if (nloVar2 != null && nloVar3 != null && nloVar4 != null && nloVar5 != null) {
            int i3 = nloVar2.i(this.h);
            int i4 = nloVar4.i(this.h);
            int i5 = nloVar5.i(this.h);
            int i6 = nloVar3.i(this.h);
            if (i4 <= i3 || i5 <= i6) {
                return;
            }
            nlo f3 = nlo.f(i4 - i3, this.h);
            nlo f4 = nlo.f(i5 - i6, this.h);
            hashMapArr[i].put("ImageLength", f3);
            hashMapArr[i].put("ImageWidth", f4);
            return;
        }
        nlo nloVar6 = (nlo) hashMapArr[i].get("ImageLength");
        nlo nloVar7 = (nlo) hashMapArr[i].get("ImageWidth");
        if (nloVar6 == null || nloVar7 == null) {
            nlo nloVar8 = (nlo) hashMapArr[i].get("JPEGInterchangeFormat");
            nlo nloVar9 = (nlo) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (nloVar8 == null || nloVar9 == null) {
                return;
            }
            int i7 = nloVar8.i(this.h);
            int i8 = nloVar8.i(this.h);
            qloVar.c(i7);
            byte[] bArr = new byte[i8];
            qloVar.readFully(bArr);
            g(new mlo(bArr), i7, i);
        }
    }

    public final void M() {
        K(0, 5);
        K(0, 4);
        K(5, 4);
        HashMap[] hashMapArr = this.f;
        nlo nloVar = (nlo) hashMapArr[1].get("PixelXDimension");
        nlo nloVar2 = (nlo) hashMapArr[1].get("PixelYDimension");
        if (nloVar != null && nloVar2 != null) {
            hashMapArr[0].put("ImageWidth", nloVar);
            hashMapArr[0].put("ImageLength", nloVar2);
        }
        if (hashMapArr[4].isEmpty() && v(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        v(hashMapArr[4]);
        D(0, "ThumbnailOrientation", "Orientation");
        D(0, "ThumbnailImageLength", "ImageLength");
        D(0, "ThumbnailImageWidth", "ImageWidth");
        D(5, "ThumbnailOrientation", "Orientation");
        D(5, "ThumbnailImageLength", "ImageLength");
        D(5, "ThumbnailImageWidth", "ImageWidth");
        D(4, "Orientation", "ThumbnailOrientation");
        D(4, "ImageLength", "ThumbnailImageLength");
        D(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int N(i77 i77Var) {
        HashMap[] hashMapArr;
        int i;
        int i2;
        char c;
        char c2;
        int[] iArr;
        int i3;
        olo[][] oloVarArr = V;
        int[] iArr2 = new int[oloVarArr.length];
        int[] iArr3 = new int[oloVarArr.length];
        olo[] oloVarArr2 = W;
        for (olo oloVar : oloVarArr2) {
            C(oloVar.b);
        }
        if (this.i) {
            if (this.j) {
                C("StripOffsets");
                C("StripByteCounts");
            } else {
                C("JPEGInterchangeFormat");
                C("JPEGInterchangeFormatLength");
            }
        }
        int i4 = 0;
        while (true) {
            int length = oloVarArr.length;
            hashMapArr = this.f;
            if (i4 >= length) {
                break;
            }
            Iterator it = hashMapArr[i4].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i4++;
        }
        if (hashMapArr[1].isEmpty()) {
            i = 1;
            i2 = 0;
        } else {
            i = 1;
            i2 = 0;
            hashMapArr[0].put(oloVarArr2[1].b, nlo.c(0L, this.h));
        }
        if (hashMapArr[2].isEmpty()) {
            c = 2;
        } else {
            c = 2;
            hashMapArr[i2].put(oloVarArr2[2].b, nlo.c(0L, this.h));
        }
        if (hashMapArr[3].isEmpty()) {
            c2 = 3;
        } else {
            c2 = 3;
            hashMapArr[i].put(oloVarArr2[3].b, nlo.c(0L, this.h));
        }
        int i5 = 4;
        if (this.i) {
            if (this.j) {
                hashMapArr[4].put("StripOffsets", nlo.f(i2, this.h));
                hashMapArr[4].put("StripByteCounts", nlo.f(this.m, this.h));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", nlo.c(0L, this.h));
                hashMapArr[4].put("JPEGInterchangeFormatLength", nlo.c(this.m, this.h));
            }
        }
        int i6 = 0;
        while (true) {
            int length2 = oloVarArr.length;
            iArr = S;
            if (i6 >= length2) {
                break;
            }
            Iterator it2 = hashMapArr[i6].entrySet().iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                nlo nloVar = (nlo) ((Map.Entry) it2.next()).getValue();
                nloVar.getClass();
                int i8 = iArr[nloVar.a] * nloVar.b;
                if (i8 > 4) {
                    i7 += i8;
                }
            }
            iArr3[i6] = iArr3[i6] + i7;
            i6++;
        }
        int i9 = 8;
        for (int i10 = 0; i10 < oloVarArr.length; i10++) {
            if (!hashMapArr[i10].isEmpty()) {
                iArr2[i10] = i9;
                i9 = (hashMapArr[i10].size() * 12) + 6 + iArr3[i10] + i9;
            }
        }
        if (this.i) {
            if (this.j) {
                hashMapArr[4].put("StripOffsets", nlo.f(i9, this.h));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", nlo.c(i9, this.h));
            }
            this.l = i9;
            i9 += this.m;
        }
        if (this.d == 4) {
            i9 += 8;
        }
        if (v) {
            for (int i11 = 0; i11 < oloVarArr.length; i11++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr2[i11]), Integer.valueOf(hashMapArr[i11].size()), Integer.valueOf(iArr3[i11]), Integer.valueOf(i9));
            }
        }
        if (!hashMapArr[i].isEmpty()) {
            hashMapArr[0].put(oloVarArr2[i].b, nlo.c(iArr2[i], this.h));
        }
        if (!hashMapArr[c].isEmpty()) {
            hashMapArr[0].put(oloVarArr2[c].b, nlo.c(iArr2[c], this.h));
        }
        if (!hashMapArr[c2].isEmpty()) {
            hashMapArr[i].put(oloVarArr2[c2].b, nlo.c(iArr2[c2], this.h));
        }
        int i12 = this.d;
        if (i12 == 4) {
            if (i9 > 65535) {
                ny61.r(oyr.j(i9, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            i77Var.n(i9);
            i77Var.write(c0);
        } else if (i12 == 13) {
            i77Var.d(i9);
            i77Var.d(1700284774);
        } else if (i12 == 14) {
            i77Var.write(K);
            i77Var.d(i9);
        }
        int size = ((DataOutputStream) i77Var.c).size();
        i77Var.e(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        i77Var.a(this.h);
        i77Var.n(42);
        i77Var.k(8L);
        int i13 = 0;
        while (i13 < oloVarArr.length) {
            if (hashMapArr[i13].isEmpty()) {
                i3 = i5;
            } else {
                i77Var.n(hashMapArr[i13].size());
                int size2 = (hashMapArr[i13].size() * 12) + iArr2[i13] + 2 + i5;
                for (Map.Entry entry : hashMapArr[i13].entrySet()) {
                    int i14 = ((olo) Y[i13].get(entry.getKey())).a;
                    nlo nloVar2 = (nlo) entry.getValue();
                    nloVar2.getClass();
                    int i15 = nloVar2.b;
                    int i16 = nloVar2.a;
                    int i17 = iArr[i16] * i15;
                    i77Var.n(i14);
                    i77Var.n(i16);
                    i77Var.d(i15);
                    if (i17 > 4) {
                        i77Var.k(size2);
                        size2 += i17;
                    } else {
                        i77Var.write(nloVar2.d);
                        if (i17 < 4) {
                            while (i17 < 4) {
                                i77Var.c(0);
                                i17++;
                            }
                        }
                    }
                    i5 = 4;
                }
                int i18 = i5;
                if (i13 != 0 || hashMapArr[i18].isEmpty()) {
                    i77Var.k(0L);
                } else {
                    i77Var.k(iArr2[i18]);
                }
                Iterator it3 = hashMapArr[i13].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((nlo) ((Map.Entry) it3.next()).getValue()).d;
                    if (bArr.length > 4) {
                        i77Var.write(bArr, 0, bArr.length);
                    }
                }
                i3 = 4;
            }
            i13++;
            i5 = i3;
        }
        if (this.i) {
            i77Var.write(q());
        }
        if (this.d == 14 && i9 % 2 == i) {
            i77Var.c(0);
        }
        i77Var.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    public final void O(i77 i77Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.p = ((DataOutputStream) i77Var.c).size() + N(new i77(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        i77Var.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        i77Var.d((int) crc32.getValue());
    }

    public final void P(i77 i77Var) {
        i77Var.d(this.t.d.length + 22);
        CRC32 crc32 = new CRC32();
        i77Var.d(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = H;
        i77Var.write(bArr);
        crc32.update(bArr);
        i77Var.write(this.t.d);
        crc32.update(this.t.d);
        i77Var.d((int) crc32.getValue());
        this.u = true;
    }

    public final void a() {
        String c = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.f;
        if (c != null && c("DateTime") == null) {
            hashMapArr[0].put("DateTime", nlo.b(c));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", nlo.c(0L, this.h));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", nlo.c(0L, this.h));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", nlo.c(0L, this.h));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", nlo.c(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            ny61.t("tag shouldn't be null");
            return null;
        }
        nlo e = e(str);
        if (e != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = e.a;
                if (i == 5 || i == 10) {
                    plo[] ploVarArr = (plo[]) e.k(this.h);
                    if (ploVarArr == null || ploVarArr.length != 3) {
                        Arrays.toString(ploVarArr);
                        return null;
                    }
                    plo ploVar = ploVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (ploVar.a / ploVar.b));
                    plo ploVar2 = ploVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (ploVar2.a / ploVar2.b));
                    plo ploVar3 = ploVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (ploVar3.a / ploVar3.b)));
                }
            } else {
                boolean contains = Z.contains(str);
                ByteOrder byteOrder = this.h;
                if (!contains) {
                    return e.j(byteOrder);
                }
                try {
                    return Double.toString(e.h(byteOrder));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        nlo e = e(str);
        if (e != null) {
            try {
                return e.i(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final nlo e(String str) {
        nlo nloVar;
        int i;
        nlo nloVar2;
        if (str == null) {
            ny61.t("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (nloVar2 = this.t) != null)) {
            return nloVar2;
        }
        for (int i2 = 0; i2 < V.length; i2++) {
            nlo nloVar3 = (nlo) this.f[i2].get(str);
            if (nloVar3 != null) {
                return nloVar3;
            }
        }
        if (!"Xmp".equals(str) || (nloVar = this.t) == null) {
            return null;
        }
        return nloVar;
    }

    public final void f(final qlo qloVar, int i) {
        String str;
        String str2;
        String str3;
        if (i == 15 && Build.VERSION.SDK_INT < 31) {
            w511.x("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                fga1.c(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface$1
                    long mPosition;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                    }

                    @Override // android.media.MediaDataSource
                    public long getSize() throws IOException {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public int readAt(long j, byte[] bArr, int i2, int i3) throws IOException {
                        if (i3 == 0) {
                            return 0;
                        }
                        if (j < 0) {
                            return -1;
                        }
                        try {
                            long j2 = this.mPosition;
                            if (j2 != j) {
                                if (j2 >= 0 && j >= j2 + qloVar.a.available()) {
                                    return -1;
                                }
                                qloVar.c(j);
                                this.mPosition = j;
                            }
                            if (i3 > qloVar.a.available()) {
                                i3 = qloVar.a.available();
                            }
                            int read = qloVar.read(bArr, i2, i3);
                            if (read >= 0) {
                                this.mPosition += read;
                                return read;
                            }
                        } catch (IOException unused) {
                        }
                        this.mPosition = -1L;
                        return -1;
                    }
                });
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", nlo.f(Integer.parseInt(str), this.h));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", nlo.f(Integer.parseInt(str3), this.h));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", nlo.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    qloVar.c(parseInt2);
                    byte[] bArr = new byte[6];
                    qloVar.readFully(bArr);
                    int i2 = parseInt2 + 6;
                    int i3 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i3];
                    qloVar.readFully(bArr2);
                    this.p = i2;
                    A(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    qloVar.c(j);
                    byte[] bArr3 = new byte[parseInt5];
                    qloVar.readFully(bArr3);
                    this.t = new nlo(1, parseInt5, j, bArr3);
                    this.u = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(mlo mloVar, int i, int i2) {
        int i3;
        boolean z2 = v;
        if (z2) {
            Objects.toString(mloVar);
        }
        mloVar.c = ByteOrder.BIG_ENDIAN;
        byte readByte = mloVar.readByte();
        byte b = -1;
        if (readByte != -1) {
            ny61.v(oyr.r(new StringBuilder("Invalid marker: "), readByte & 255));
            return;
        }
        if (mloVar.readByte() != -40) {
            ny61.v(oyr.r(new StringBuilder("Invalid marker: "), readByte & 255));
            return;
        }
        int i4 = 2;
        while (true) {
            byte readByte2 = mloVar.readByte();
            if (readByte2 != b) {
                ny61.v(oyr.r(new StringBuilder("Invalid marker:"), readByte2 & 255));
                return;
            }
            while (true) {
                int i5 = i4 + 1;
                byte readByte3 = mloVar.readByte();
                if (readByte3 != b) {
                    if (z2) {
                        Integer.toHexString(readByte3 & 255);
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = mloVar.readUnsignedShort();
                        int i6 = readUnsignedShort - 2;
                        int i7 = i4 + 4;
                        if (z2) {
                            Integer.toHexString(readByte3 & 255);
                        }
                        if (i6 < 0) {
                            ny61.v("Invalid length");
                            return;
                        }
                        int i8 = 0;
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.f;
                            if (readByte3 != -2) {
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                        }
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        mloVar.a(1);
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", nlo.c(mloVar.readUnsignedShort(), this.h));
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", nlo.c(mloVar.readUnsignedShort(), this.h));
                                                        i6 = readUnsignedShort - 7;
                                                        break;
                                                }
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                        }
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        break;
                                }
                                i8 = i6;
                            } else {
                                byte[] bArr = new byte[i6];
                                mloVar.readFully(bArr);
                                if (c("UserComment") == null) {
                                    hashMapArr[1].put("UserComment", nlo.b(new String(bArr, b0)));
                                }
                            }
                        } else {
                            byte[] bArr2 = new byte[i6];
                            mloVar.readFully(bArr2);
                            int i9 = i7 + i6;
                            byte[] bArr3 = c0;
                            if (gga1.k(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i6);
                                this.p = i + i7 + bArr3.length;
                                A(i2, copyOfRange);
                                J(new mlo(copyOfRange));
                            } else {
                                byte[] bArr4 = d0;
                                if (gga1.k(bArr2, bArr4)) {
                                    int length = i7 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i6);
                                    i3 = i9;
                                    this.t = new nlo(1, copyOfRange2.length, length, copyOfRange2);
                                    this.u = true;
                                    i7 = i3;
                                }
                            }
                            i3 = i9;
                            i7 = i3;
                        }
                        if (i8 < 0) {
                            ny61.v("Invalid length");
                            return;
                        } else {
                            mloVar.a(i8);
                            i4 = i7 + i8;
                            b = -1;
                        }
                    }
                } else {
                    i4 = i5;
                }
            }
        }
        mloVar.c = this.h;
    }

    public final double[] h() {
        String c = c("GPSLatitude");
        String c2 = c("GPSLatitudeRef");
        String c3 = c("GPSLongitude");
        String c4 = c("GPSLongitudeRef");
        if (c == null || c2 == null || c3 == null || c4 == null) {
            return null;
        }
        try {
            return new double[]{b(c, c2), b(c3, c4)};
        } catch (IllegalArgumentException unused) {
            x4e.C(b64.v("latValue=", c, ", latRef=", c2, ", lngValue="), c3, ", lngRef=", c4);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ea, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(BufferedInputStream bufferedInputStream) {
        int i;
        mlo mloVar;
        int i2;
        mlo mloVar2;
        int i3;
        int i4;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = y;
            if (i5 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i5] != bArr3[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr2[i6] != bytes[i6]) {
                        mlo mloVar3 = null;
                        try {
                            mloVar = new mlo(bArr2);
                            try {
                                try {
                                    readInt = mloVar.readInt();
                                    bArr = new byte[4];
                                    mloVar.readFully(bArr);
                                } catch (Exception unused) {
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                mloVar3 = mloVar;
                                if (mloVar3 != null) {
                                    mloVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                            mloVar = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, z)) {
                            if (readInt == 1) {
                                readInt = mloVar.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        mloVar.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, A)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, B)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, C) || Arrays.equals(bArr4, D)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        mloVar.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        mloVar.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception unused3) {
                                            }
                                        }
                                    } catch (EOFException unused4) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                mloVar.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    mloVar2 = new mlo(bArr2);
                                } catch (Exception unused5) {
                                    mloVar2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder z5 = z(mloVar2);
                                    this.h = z5;
                                    mloVar2.c = z5;
                                    short readShort = mloVar2.readShort();
                                    i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                    mloVar2.close();
                                } catch (Exception unused6) {
                                    if (mloVar2 != null) {
                                        mloVar2.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mloVar3 = mloVar2;
                                    if (mloVar3 != null) {
                                        mloVar3.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    mlo mloVar4 = new mlo(bArr2);
                                    try {
                                        ByteOrder z6 = z(mloVar4);
                                        this.h = z6;
                                        mloVar4.c = z6;
                                        i4 = mloVar4.readShort() != 85 ? i : 1;
                                        mloVar4.close();
                                    } catch (Exception unused7) {
                                        mloVar3 = mloVar4;
                                        if (mloVar3 != null) {
                                            mloVar3.close();
                                        }
                                        i4 = i;
                                        if (i4 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        mloVar3 = mloVar4;
                                        if (mloVar3 != null) {
                                            mloVar3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i4 == 0) {
                                    return 10;
                                }
                                int i7 = i;
                                while (true) {
                                    byte[] bArr5 = G;
                                    if (i7 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i7] != bArr5[i7]) {
                                        int i8 = i;
                                        while (true) {
                                            byte[] bArr6 = I;
                                            if (i8 >= bArr6.length) {
                                                int i9 = i;
                                                while (true) {
                                                    byte[] bArr7 = J;
                                                    if (i9 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                            } else {
                                                if (bArr2[i8] != bArr6[i8]) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                        return i;
                                    }
                                    i7++;
                                }
                            }
                        }
                        mloVar.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void j(qlo qloVar) {
        int i;
        int i2;
        m(qloVar);
        HashMap[] hashMapArr = this.f;
        nlo nloVar = (nlo) hashMapArr[1].get("MakerNote");
        if (nloVar != null) {
            qlo qloVar2 = new qlo(nloVar.d);
            qloVar2.c = this.h;
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            qloVar2.readFully(bArr2);
            qloVar2.c(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            qloVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                qloVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                qloVar2.c(12L);
            }
            B(qloVar2, 6);
            nlo nloVar2 = (nlo) hashMapArr[7].get("PreviewImageStart");
            nlo nloVar3 = (nlo) hashMapArr[7].get("PreviewImageLength");
            if (nloVar2 != null && nloVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", nloVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", nloVar3);
            }
            nlo nloVar4 = (nlo) hashMapArr[8].get("AspectFrame");
            if (nloVar4 != null) {
                int[] iArr = (int[]) nloVar4.k(this.h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                nlo f = nlo.f(i5, this.h);
                nlo f2 = nlo.f(i6, this.h);
                hashMapArr[0].put("ImageWidth", f);
                hashMapArr[0].put("ImageLength", f2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r18.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(mlo mloVar) {
        if (v) {
            Objects.toString(mloVar);
        }
        mloVar.c = ByteOrder.BIG_ENDIAN;
        int i = mloVar.b;
        mloVar.a(G.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int readInt = mloVar.readInt();
                int readInt2 = mloVar.readInt();
                int i2 = mloVar.b;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.p = i4;
                    byte[] bArr = new byte[readInt];
                    mloVar.readFully(bArr);
                    int readInt3 = mloVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    A(0, bArr);
                    M();
                    J(new mlo(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = H;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        mloVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = mloVar.b - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            mloVar.readFully(bArr4);
                            this.t = new nlo(1, i6, i5, bArr4);
                            z3 = true;
                        }
                    }
                }
                mloVar.a(i3 - mloVar.b);
            } catch (EOFException e) {
                dac.g("Encountered corrupt PNG file.", e);
                return;
            }
        }
    }

    public final void l(mlo mloVar) {
        if (v) {
            Objects.toString(mloVar);
        }
        mloVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        mloVar.readFully(bArr);
        mloVar.readFully(bArr2);
        mloVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        mloVar.a(i - mloVar.b);
        mloVar.readFully(bArr4);
        g(new mlo(bArr4), i, 5);
        mloVar.a(i3 - mloVar.b);
        mloVar.c = ByteOrder.BIG_ENDIAN;
        int readInt = mloVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = mloVar.readUnsignedShort();
            int readUnsignedShort2 = mloVar.readUnsignedShort();
            if (readUnsignedShort == U.a) {
                short readShort = mloVar.readShort();
                short readShort2 = mloVar.readShort();
                nlo f = nlo.f(readShort, this.h);
                nlo f2 = nlo.f(readShort2, this.h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", f);
                hashMapArr[0].put("ImageWidth", f2);
                return;
            }
            mloVar.a(readUnsignedShort2);
        }
    }

    public final void m(qlo qloVar) {
        x(qloVar);
        B(qloVar, 0);
        L(qloVar, 0);
        L(qloVar, 5);
        L(qloVar, 4);
        M();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f;
            nlo nloVar = (nlo) hashMapArr[1].get("MakerNote");
            if (nloVar != null) {
                qlo qloVar2 = new qlo(nloVar.d);
                qloVar2.c = this.h;
                qloVar2.a(6);
                B(qloVar2, 9);
                nlo nloVar2 = (nlo) hashMapArr[9].get("ColorSpace");
                if (nloVar2 != null) {
                    hashMapArr[1].put("ColorSpace", nloVar2);
                }
            }
        }
    }

    public final int n() {
        switch (d(1, "Orientation")) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void o(qlo qloVar) {
        if (v) {
            Objects.toString(qloVar);
        }
        m(qloVar);
        HashMap[] hashMapArr = this.f;
        nlo nloVar = (nlo) hashMapArr[0].get("JpgFromRaw");
        if (nloVar != null) {
            g(new mlo(nloVar.d), (int) nloVar.c, 5);
        }
        nlo nloVar2 = (nlo) hashMapArr[0].get("ISO");
        nlo nloVar3 = (nlo) hashMapArr[1].get("PhotographicSensitivity");
        if (nloVar2 == null || nloVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", nloVar2);
    }

    public final boolean p(qlo qloVar) {
        byte[] bArr = c0;
        byte[] bArr2 = new byte[bArr.length];
        qloVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = qloVar.a.read(bArr3, i, bArr3.length - i);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.p = bArr.length;
                A(0, copyOf);
                return true;
            }
            i += read;
            qloVar.b += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] q() {
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (this.i) {
            byte[] bArr = this.n;
            if (bArr != null) {
                return bArr;
            }
            try {
                inputStream = this.c;
            } catch (Exception unused) {
                inputStream = null;
                fileDescriptor = null;
            } catch (Throwable th) {
                th = th;
                fileDescriptor = null;
            }
            try {
                if (inputStream != null) {
                    try {
                        if (!inputStream.markSupported()) {
                            gga1.d(inputStream);
                            return null;
                        }
                        inputStream.reset();
                    } catch (Exception unused2) {
                        fileDescriptor = null;
                        gga1.d(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        inputStream2 = inputStream;
                        gga1.d(inputStream2);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } else {
                    if (this.a == null) {
                        FileDescriptor dup = Os.dup(this.b);
                        try {
                            Os.lseek(dup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = dup;
                            inputStream = new FileInputStream(dup);
                            mlo mloVar = new mlo(inputStream);
                            mloVar.a(this.l + this.p);
                            byte[] bArr2 = new byte[this.m];
                            mloVar.readFully(bArr2);
                            this.n = bArr2;
                            gga1.d(inputStream);
                            if (fileDescriptor != null) {
                                gga1.c(fileDescriptor);
                            }
                            return bArr2;
                        } catch (Exception unused3) {
                            fileDescriptor = dup;
                            inputStream = null;
                            gga1.d(inputStream);
                            if (fileDescriptor != null) {
                                gga1.c(fileDescriptor);
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileDescriptor = dup;
                            gga1.d(inputStream2);
                            if (fileDescriptor != null) {
                                gga1.c(fileDescriptor);
                            }
                            throw th;
                        }
                    }
                    inputStream = new FileInputStream(this.a);
                }
                mlo mloVar2 = new mlo(inputStream);
                mloVar2.a(this.l + this.p);
                byte[] bArr22 = new byte[this.m];
                mloVar2.readFully(bArr22);
                this.n = bArr22;
                gga1.d(inputStream);
                if (fileDescriptor != null) {
                }
                return bArr22;
            } catch (Exception unused4) {
                gga1.d(inputStream);
                if (fileDescriptor != null) {
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                inputStream2 = inputStream;
                gga1.d(inputStream2);
                if (fileDescriptor != null) {
                }
                throw th;
            }
            fileDescriptor = null;
        }
        return null;
    }

    public final void r(mlo mloVar) {
        if (v) {
            Objects.toString(mloVar);
        }
        mloVar.c = ByteOrder.LITTLE_ENDIAN;
        mloVar.a(I.length);
        int readInt = mloVar.readInt() + 8;
        byte[] bArr = J;
        mloVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                mloVar.readFully(bArr2);
                int readInt2 = mloVar.readInt();
                int i = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    mloVar.readFully(bArr3);
                    byte[] bArr4 = c0;
                    if (gga1.k(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.p = i;
                    A(0, bArr3);
                    J(new mlo(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                mloVar.a(readInt2);
            } catch (EOFException e) {
                dac.g("Encountered corrupt WebP file.", e);
                return;
            }
        }
    }

    public final void t(mlo mloVar, HashMap hashMap) {
        nlo nloVar = (nlo) hashMap.get("JPEGInterchangeFormat");
        nlo nloVar2 = (nlo) hashMap.get("JPEGInterchangeFormatLength");
        if (nloVar == null || nloVar2 == null) {
            return;
        }
        int i = nloVar.i(this.h);
        int i2 = nloVar2.i(this.h);
        if (this.d == 7) {
            i += this.q;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.i = true;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[i2];
            mloVar.a(i);
            mloVar.readFully(bArr);
            this.n = bArr;
        }
        this.l = i;
        this.m = i2;
    }

    public final void u(String str) {
        FileInputStream fileInputStream;
        boolean z2;
        if (str == null) {
            ny61.t("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            w(fileInputStream);
            gga1.d(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            gga1.d(fileInputStream2);
            throw th;
        }
    }

    public final boolean v(HashMap hashMap) {
        nlo nloVar = (nlo) hashMap.get("ImageLength");
        nlo nloVar2 = (nlo) hashMap.get("ImageWidth");
        if (nloVar == null || nloVar2 == null) {
            return false;
        }
        return nloVar.i(this.h) <= 512 && nloVar2.i(this.h) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(InputStream inputStream) {
        boolean z2 = v;
        for (int i = 0; i < V.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused) {
                    a();
                    if (z2) {
                        y();
                        return;
                    }
                    return;
                }
            } finally {
                a();
                if (z2) {
                    y();
                }
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 != 4 && i2 != 9 && i2 != 13 && i2 != 14) {
            qlo qloVar = new qlo(inputStream);
            if (!z3) {
                int i3 = this.d;
                if (i3 != 12 && i3 != 15) {
                    if (i3 == 7) {
                        j(qloVar);
                    } else if (i3 == 10) {
                        o(qloVar);
                    } else {
                        m(qloVar);
                    }
                }
                f(qloVar, i3);
            } else if (!p(qloVar)) {
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            qloVar.c(this.p);
            J(qloVar);
            a();
            if (z2) {
                return;
            }
            y();
            return;
        }
        mlo mloVar = new mlo(inputStream);
        int i4 = this.d;
        if (i4 == 4) {
            g(mloVar, 0, 0);
        } else if (i4 == 13) {
            k(mloVar);
        } else if (i4 == 9) {
            l(mloVar);
        } else if (i4 == 14) {
            r(mloVar);
        }
        a();
        if (z2) {
        }
    }

    public final void x(qlo qloVar) {
        ByteOrder z2 = z(qloVar);
        this.h = z2;
        qloVar.c = z2;
        int readUnsignedShort = qloVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            ny61.v(oyr.r(new StringBuilder("Invalid start code: "), readUnsignedShort));
            return;
        }
        int readInt = qloVar.readInt();
        if (readInt < 8) {
            ny61.v(oyr.i(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            qloVar.a(i2);
        }
    }

    public final void y() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                nlo nloVar = (nlo) entry.getValue();
                nloVar.toString();
                nloVar.j(this.h);
            }
            i++;
        }
    }

    public a(String str) {
        olo[][] oloVarArr = V;
        this.f = new HashMap[oloVarArr.length];
        this.g = new HashSet(oloVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            u(str);
        } else {
            ny61.t("filename cannot be null");
            throw null;
        }
    }

    public a(File file) {
        olo[][] oloVarArr = V;
        this.f = new HashMap[oloVarArr.length];
        this.g = new HashSet(oloVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            u(file.getAbsolutePath());
        } else {
            ny61.t("file cannot be null");
            throw null;
        }
    }
}
