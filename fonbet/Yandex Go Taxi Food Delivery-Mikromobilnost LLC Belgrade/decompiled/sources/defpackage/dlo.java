package defpackage;

import android.location.Location;
import androidx.exifinterface.media.a;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes10.dex */
public final class dlo {
    public static final fg1 b = new fg1(6);
    public static final fg1 c = new fg1(7);
    public static final fg1 d = new fg1(8);
    public static final List e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
    public final a a;

    public dlo(a aVar) {
        this.a = aVar;
    }

    public final void a(dlo dloVar) {
        a aVar = dloVar.a;
        ArrayList arrayList = new ArrayList(e);
        arrayList.removeAll(f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String c2 = this.a.c(str);
            String c3 = aVar.c(str);
            if (c2 != null && !c2.equals(c3)) {
                aVar.I(str, c2);
            }
        }
    }

    public final int b() {
        switch (this.a.d(0, "Orientation")) {
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

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        fg1 fg1Var = d;
        String format = ((SimpleDateFormat) fg1Var.get()).format(new Date(currentTimeMillis));
        a aVar = this.a;
        aVar.I("DateTime", format);
        try {
            aVar.I("SubSecTime", Long.toString(currentTimeMillis - ((SimpleDateFormat) fg1Var.get()).parse(format).getTime()));
        } catch (ParseException unused) {
        }
        aVar.E();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:0|1|(1:111)(1:7)|8|(1:10)(1:110)|11|(23:106|107|14|(1:105)(2:(1:18)|19)|20|(16:101|102|23|24|(1:26)|27|(11:87|(1:89)(1:(1:93)(12:94|95|96|97|(1:32)(9:(1:59)(1:86)|60|61|(1:63)|64|(6:66|(2:68|(2:70|(4:74|75|76|77))(1:79))(1:81)|78|75|76|77)|82|(1:84)|85)|33|(6:54|55|36|(3:38|(5:41|42|(3:45|47|43)|48|49)|40)|51|52)|35|36|(0)|51|52))|90|(0)(0)|33|(0)|35|36|(0)|51|52)|30|(0)(0)|33|(0)|35|36|(0)|51|52)|22|23|24|(0)|27|(0)|87|(0)(0)|90|(0)(0)|33|(0)|35|36|(0)|51|52)|13|14|(0)|105|20|(0)|22|23|24|(0)|27|(0)|87|(0)(0)|90|(0)(0)|33|(0)|35|36|(0)|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        if (r3.equals("M") != false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bc A[Catch: ParseException -> 0x00b4, TRY_ENTER, TryCatch #1 {ParseException -> 0x00b4, blocks: (B:89:0x00bc, B:93:0x00d6), top: B:87:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        double h;
        double d2;
        nlo e2;
        double h2;
        String c2;
        String c3;
        String c4;
        String str;
        long j;
        Integer num;
        long j2;
        long time;
        Integer num2;
        Integer num3;
        Integer num4;
        Location location;
        double d3;
        String c5;
        long time2;
        Locale locale = Locale.ENGLISH;
        a aVar = this.a;
        Integer valueOf = Integer.valueOf(aVar.d(0, "ImageWidth"));
        Integer valueOf2 = Integer.valueOf(aVar.d(0, "ImageLength"));
        Integer valueOf3 = Integer.valueOf(b());
        int d4 = aVar.d(0, "Orientation");
        Boolean valueOf4 = Boolean.valueOf(d4 == 4 || d4 == 5 || d4 == 7);
        Boolean valueOf5 = Boolean.valueOf(aVar.d(0, "Orientation") == 2);
        ?? c6 = aVar.c("GPSProcessingMethod");
        double[] h3 = aVar.h();
        nlo e3 = aVar.e("GPSAltitude");
        if (e3 != null) {
            try {
                h = e3.h(aVar.h);
            } catch (NumberFormatException unused) {
            }
            int d5 = aVar.d(-1, "GPSAltitudeRef");
            if (h >= 0.0d || d5 < 0) {
                d2 = 0.0d;
            } else {
                d2 = h * (d5 != 1 ? 1 : -1);
            }
            e2 = aVar.e("GPSSpeed");
            if (e2 != null) {
                try {
                    h2 = e2.h(aVar.h);
                } catch (NumberFormatException unused2) {
                }
                c2 = aVar.c("GPSSpeedRef");
                if (c2 == null) {
                    c2 = CA20Status.STATUS_REQUEST_K;
                }
                c3 = aVar.c("GPSDateStamp");
                c4 = aVar.c("GPSTimeStamp");
                fg1 fg1Var = d;
                long j3 = -1;
                if (c3 == null || c4 != null) {
                    if (c4 == null) {
                        time = ((SimpleDateFormat) b.get()).parse(c3).getTime();
                    } else {
                        if (c3 != null) {
                            str = c6;
                            try {
                                j = ((SimpleDateFormat) fg1Var.get()).parse(g8e.p(c3, " ", c4)).getTime();
                            } catch (ParseException unused3) {
                                j = -1;
                            }
                            num = valueOf;
                            j2 = j;
                            if (h3 == null) {
                                num2 = num;
                                location = null;
                                num3 = valueOf2;
                                num4 = valueOf3;
                            } else {
                                String str2 = str == null ? "dlo" : str;
                                num2 = num;
                                Location location2 = new Location(str2);
                                num3 = valueOf2;
                                num4 = valueOf3;
                                location2.setLatitude(h3[0]);
                                location2.setLongitude(h3[1]);
                                if (d2 != 0.0d) {
                                    location2.setAltitude(d2);
                                }
                                if (h2 != 0.0d) {
                                    int hashCode = c2.hashCode();
                                    if (hashCode == 75) {
                                        c2.equals(CA20Status.STATUS_REQUEST_K);
                                    } else if (hashCode != 77) {
                                        if (hashCode == 78 && c2.equals("N")) {
                                            d3 = 1.15078d;
                                            h2 *= d3;
                                            location2.setSpeed((float) (h2 / 2.23694d));
                                        }
                                    }
                                    d3 = 0.621371d;
                                    h2 *= d3;
                                    location2.setSpeed((float) (h2 / 2.23694d));
                                }
                                if (j2 != -1) {
                                    location2.setTime(j2);
                                }
                                location = location2;
                            }
                            c5 = aVar.c("DateTimeOriginal");
                            if (c5 != null) {
                                try {
                                    time2 = ((SimpleDateFormat) fg1Var.get()).parse(c5).getTime();
                                } catch (ParseException unused4) {
                                }
                                if (time2 != -1) {
                                    String c7 = aVar.c("SubSecTimeOriginal");
                                    if (c7 != null) {
                                        try {
                                            long parseLong = Long.parseLong(c7);
                                            while (parseLong > 1000) {
                                                parseLong /= 10;
                                            }
                                            j3 = time2 + parseLong;
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                    j3 = time2;
                                }
                                return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j3), aVar.c("ImageDescription"));
                            }
                            time2 = -1;
                            if (time2 != -1) {
                            }
                            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j3), aVar.c("ImageDescription"));
                        }
                        time = ((SimpleDateFormat) c.get()).parse(c4).getTime();
                    }
                    num = valueOf;
                    long j4 = time;
                    str = c6;
                    c6 = j4;
                    j2 = c6;
                    if (h3 == null) {
                    }
                    c5 = aVar.c("DateTimeOriginal");
                    if (c5 != null) {
                    }
                    time2 = -1;
                    if (time2 != -1) {
                    }
                    return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j3), aVar.c("ImageDescription"));
                }
                str = c6;
                num = valueOf;
                j2 = -1;
                if (h3 == null) {
                }
                c5 = aVar.c("DateTimeOriginal");
                if (c5 != null) {
                }
                time2 = -1;
                if (time2 != -1) {
                }
                return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j3), aVar.c("ImageDescription"));
            }
            h2 = 0.0d;
            c2 = aVar.c("GPSSpeedRef");
            if (c2 == null) {
            }
            c3 = aVar.c("GPSDateStamp");
            c4 = aVar.c("GPSTimeStamp");
            fg1 fg1Var2 = d;
            long j32 = -1;
            if (c3 == null) {
            }
            if (c4 == null) {
            }
            num = valueOf;
            long j42 = time;
            str = c6;
            c6 = j42;
            j2 = c6;
            if (h3 == null) {
            }
            c5 = aVar.c("DateTimeOriginal");
            if (c5 != null) {
            }
            time2 = -1;
            if (time2 != -1) {
            }
            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j32), aVar.c("ImageDescription"));
        }
        h = -1.0d;
        int d52 = aVar.d(-1, "GPSAltitudeRef");
        if (h >= 0.0d) {
        }
        d2 = 0.0d;
        e2 = aVar.e("GPSSpeed");
        if (e2 != null) {
        }
        h2 = 0.0d;
        c2 = aVar.c("GPSSpeedRef");
        if (c2 == null) {
        }
        c3 = aVar.c("GPSDateStamp");
        c4 = aVar.c("GPSTimeStamp");
        fg1 fg1Var22 = d;
        long j322 = -1;
        if (c3 == null) {
        }
        if (c4 == null) {
        }
        num = valueOf;
        long j422 = time;
        str = c6;
        c6 = j422;
        j2 = c6;
        if (h3 == null) {
        }
        c5 = aVar.c("DateTimeOriginal");
        if (c5 != null) {
        }
        time2 = -1;
        if (time2 != -1) {
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, valueOf4, valueOf5, location, Long.valueOf(j322), aVar.c("ImageDescription"));
    }
}
