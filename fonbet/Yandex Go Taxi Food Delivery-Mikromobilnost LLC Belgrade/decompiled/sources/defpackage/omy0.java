package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.compose.material.TextFieldType;
import androidx.exifinterface.media.a;
import com.google.android.gms.tasks.Task;
import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import ru.CryptoPro.JCP.pref.ConsoleConfig;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes10.dex */
public final class omy0 implements xi01, n151, pke, ww01, wm10, t77, k6e, qn90, fzh, vm11, n7j0, g8p, h0r, s3z {
    public static final omy0 a = new omy0();
    public static final omy0 b = new omy0();
    public static final omy0 c = new omy0();
    public static final /* synthetic */ omy0 w = new omy0();
    public static final /* synthetic */ omy0 x = new omy0();

    public /* synthetic */ omy0() {
    }

    public static void p(a aVar, a aVar2) {
        for (String str : Arrays.asList("ImageDescription", "Make", "Model", "Software", "DateTime", "Artist", "Copyright", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "ISOSpeedRatings", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ExifVersion", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "FocalLength", "MakerNote", "UserComment", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "FlashpixVersion", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "Orientation")) {
            if (aVar.c(str) != null) {
                aVar2.I(str, aVar.c(str));
            }
        }
        aVar2.E();
    }

    public static r100 s() {
        return new r100();
    }

    public static dmh u(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, fid fidVar, int i) {
        long j22;
        long j23;
        double d;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        if ((i & 1) != 0) {
            bts btsVar = (bts) fidVar;
            j22 = ldc.b(((ldc) btsVar.m(cfe.a)).a, ((Number) btsVar.m(vee.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
        } else {
            j22 = j;
        }
        if ((i & 2) != 0) {
            bts btsVar2 = (bts) fidVar;
            long j48 = ((ldc) btsVar2.m(cfe.a)).a;
            if (((lic) btsVar2.m(mic.a)).e()) {
                rzo.M(j48);
            } else {
                rzo.M(j48);
            }
            j23 = ldc.b(j22, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j23 = j2;
        }
        long b2 = (i & 4) != 0 ? ldc.b(((lic) ((bts) fidVar).m(mic.a)).b(), 0.12f, 0.0f, 0.0f, 0.0f, 14) : j3;
        long c2 = (i & 8) != 0 ? ((lic) ((bts) fidVar).m(mic.a)).c() : j4;
        long a2 = (i & 16) != 0 ? ((lic) ((bts) fidVar).m(mic.a)).a() : j5;
        if ((i & 32) != 0) {
            a7u0 a7u0Var = mic.a;
            bts btsVar3 = (bts) fidVar;
            long c3 = ((lic) btsVar3.m(a7u0Var)).c();
            d = 0.5d;
            long j49 = ((ldc) btsVar3.m(cfe.a)).a;
            j24 = ldc.b(c3, (!((lic) btsVar3.m(a7u0Var)).e() ? ((double) rzo.M(j49)) < 0.5d : ((double) rzo.M(j49)) > 0.5d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            d = 0.5d;
            j24 = j6;
        }
        long b3 = (i & 64) != 0 ? ldc.b(((lic) ((bts) fidVar).m(mic.a)).b(), 0.42f, 0.0f, 0.0f, 0.0f, 14) : j7;
        if ((i & 128) != 0) {
            j25 = j23;
            bts btsVar4 = (bts) fidVar;
            j26 = j22;
            long j50 = ((ldc) btsVar4.m(cfe.a)).a;
            if (((lic) btsVar4.m(mic.a)).e()) {
                rzo.M(j50);
            } else {
                rzo.M(j50);
            }
            j27 = ldc.b(b3, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j25 = j23;
            j26 = j22;
            j27 = j8;
        }
        long a3 = (i & 256) != 0 ? ((lic) ((bts) fidVar).m(mic.a)).a() : j9;
        if ((i & 512) != 0) {
            j28 = j27;
            j29 = ldc.b(((lic) ((bts) fidVar).m(mic.a)).b(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j28 = j27;
            j29 = j10;
        }
        if ((i & 1024) != 0) {
            long j51 = j29;
            bts btsVar5 = (bts) fidVar;
            j30 = a3;
            long j52 = ((ldc) btsVar5.m(cfe.a)).a;
            if (((lic) btsVar5.m(mic.a)).e()) {
                rzo.M(j52);
            } else {
                rzo.M(j52);
            }
            j32 = ldc.b(j51, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            j31 = j51;
        } else {
            j30 = a3;
            j31 = j29;
            j32 = j11;
        }
        long j53 = (i & 2048) != 0 ? j31 : j12;
        if ((i & 4096) != 0) {
            j33 = j32;
            j34 = ldc.b(((lic) ((bts) fidVar).m(mic.a)).b(), 0.54f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j33 = j32;
            j34 = j13;
        }
        if ((i & 8192) != 0) {
            long j54 = j34;
            bts btsVar6 = (bts) fidVar;
            j35 = j31;
            long j55 = ((ldc) btsVar6.m(cfe.a)).a;
            if (((lic) btsVar6.m(mic.a)).e()) {
                rzo.M(j55);
            } else {
                rzo.M(j55);
            }
            j37 = ldc.b(j54, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            j36 = j54;
        } else {
            j35 = j31;
            j36 = j34;
            j37 = j14;
        }
        long a4 = (i & 16384) != 0 ? ((lic) ((bts) fidVar).m(mic.a)).a() : j15;
        if ((i & 32768) != 0) {
            a7u0 a7u0Var2 = mic.a;
            bts btsVar7 = (bts) fidVar;
            long c4 = ((lic) btsVar7.m(a7u0Var2)).c();
            j38 = j37;
            long j56 = ((ldc) btsVar7.m(cfe.a)).a;
            j39 = ldc.b(c4, (!((lic) btsVar7.m(a7u0Var2)).e() ? ((double) rzo.M(j56)) < d : ((double) rzo.M(j56)) > d) ? 0.87f : 1.0f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j38 = j37;
            j39 = j16;
        }
        if ((i & 65536) != 0) {
            a7u0 a7u0Var3 = mic.a;
            bts btsVar8 = (bts) fidVar;
            long b4 = ((lic) btsVar8.m(a7u0Var3)).b();
            j40 = j39;
            long j57 = ((ldc) btsVar8.m(cfe.a)).a;
            j41 = ldc.b(b4, (!((lic) btsVar8.m(a7u0Var3)).e() ? ((double) rzo.M(j57)) < d : ((double) rzo.M(j57)) > d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j40 = j39;
            j41 = j17;
        }
        if ((i & 131072) != 0) {
            bts btsVar9 = (bts) fidVar;
            long j58 = j41;
            long j59 = ((ldc) btsVar9.m(cfe.a)).a;
            if (((lic) btsVar9.m(mic.a)).e()) {
                rzo.M(j59);
            } else {
                rzo.M(j59);
            }
            j43 = ldc.b(j58, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            j42 = j58;
        } else {
            j42 = j41;
            j43 = j18;
        }
        long a5 = (i & 262144) != 0 ? ((lic) ((bts) fidVar).m(mic.a)).a() : j19;
        if ((i & 524288) != 0) {
            a7u0 a7u0Var4 = mic.a;
            bts btsVar10 = (bts) fidVar;
            long b5 = ((lic) btsVar10.m(a7u0Var4)).b();
            j44 = j43;
            long j60 = ((ldc) btsVar10.m(cfe.a)).a;
            j45 = ldc.b(b5, (!((lic) btsVar10.m(a7u0Var4)).e() ? ((double) rzo.M(j60)) < d : ((double) rzo.M(j60)) > d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
        } else {
            j44 = j43;
            j45 = j20;
        }
        if ((i & 1048576) != 0) {
            bts btsVar11 = (bts) fidVar;
            long j61 = j45;
            long j62 = ((ldc) btsVar11.m(cfe.a)).a;
            if (((lic) btsVar11.m(mic.a)).e()) {
                rzo.M(j62);
            } else {
                rzo.M(j62);
            }
            j47 = ldc.b(j61, 0.38f, 0.0f, 0.0f, 0.0f, 14);
            j46 = j61;
        } else {
            j46 = j45;
            j47 = j21;
        }
        return new dmh(j26, j25, c2, a2, j24, b3, j30, j28, j35, j33, j53, j36, j38, a4, b2, j40, j42, j44, a5, j46, j47);
    }

    @Override // defpackage.h0r
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.t77
    public byte[] b(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.n7j0
    public Set c() {
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        if (r15.k(r39) == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(String str, wls wlsVar, boolean z, boolean z2, gy31 gy31Var, h8w h8wVar, boolean z3, wls wlsVar2, wls wlsVar3, wls wlsVar4, wls wlsVar5, ehr0 ehr0Var, jmy0 jmy0Var, j690 j690Var, fid fidVar, int i, int i2) {
        int i3;
        boolean z4;
        ehr0 ehr0Var2;
        int i4;
        int i5;
        ehr0 ehr0Var3;
        bts btsVar;
        j690 j690Var2;
        aii0 v;
        ehr0 ehr0Var4;
        l690 l690Var;
        ehr0 ehr0Var5;
        int i6;
        j690 j690Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2088762355);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i3 |= btsVar2.a(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        int i7 = 2048;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.k(gy31Var) ? 16384 : 8192;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i3 |= btsVar2.k(h8wVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.a(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.e(wlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.e(wlsVar3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.e(wlsVar4) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i8 = 24576 | (btsVar2.e(wlsVar5) ? 4 : 2);
        if ((i2 & 2048) == 0) {
            ehr0Var2 = ehr0Var;
            if (btsVar2.k(ehr0Var2)) {
                i4 = 32;
                int i9 = i8 | i4 | (!btsVar2.k(jmy0Var) ? 256 : 128);
                if ((i2 & 8192) != 0) {
                }
                i7 = 1024;
                i5 = i9 | i7;
                if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378 || (i5 & 9363) != 9362)) {
                    btsVar2.Y();
                    ehr0Var3 = ehr0Var2;
                    btsVar = btsVar2;
                    j690Var2 = j690Var;
                } else {
                    btsVar2.a0();
                    if ((i & 1) == 0 || btsVar2.C()) {
                        if ((i2 & 2048) != 0) {
                            byk0 byk0Var = ((xir0) btsVar2.m(ajr0.a)).a;
                            ngd0 ngd0Var = ffx.a;
                            ehr0Var4 = byk0.b(byk0Var, null, null, ngd0Var, ngd0Var, 3);
                            i5 &= -113;
                        } else {
                            ehr0Var4 = ehr0Var2;
                        }
                        if ((i2 & 8192) != 0) {
                            if (wlsVar2 == null) {
                                l690Var = new l690(16.0f, 16.0f, 16.0f, 16.0f);
                                ehr0Var5 = ehr0Var4;
                            } else {
                                ehr0Var5 = ehr0Var4;
                                l690Var = new l690(16.0f, 20.0f, 16.0f, 10.0f);
                            }
                            i6 = i5 & (-7169);
                            j690Var3 = l690Var;
                            ehr0Var2 = ehr0Var5;
                            btsVar2.u();
                            ehr0Var3 = ehr0Var2;
                            j690 j690Var4 = j690Var3;
                            TextFieldType textFieldType = TextFieldType.Filled;
                            int i10 = i3 << 3;
                            int i11 = i3 >> 9;
                            int i12 = (i10 & 896) | (i10 & 112) | 6 | ((i3 >> 3) & 7168) | (i11 & HProv.ALG_CLASS_ALL) | (i11 & ImageMetadata.JPEG_GPS_COORDINATES) | (i11 & 3670016) | ((i6 << 21) & 29360128) | ((i3 << 15) & 234881024) | ((i3 << 21) & 1879048192);
                            int i13 = ((i3 >> 18) & 14) | ImageMetadata.EDGE_MODE | ((i3 >> 12) & 112) | ((i6 >> 3) & 896);
                            int i14 = i6 << 6;
                            androidx.compose.material.a.b(textFieldType, str, wlsVar, gy31Var, wlsVar2, wlsVar3, wlsVar4, wlsVar5, z2, z4, z3, h8wVar, j690Var4, ehr0Var3, jmy0Var, btsVar2, i12, i13 | (i14 & 7168) | (i14 & HProv.ALG_CLASS_ALL));
                            btsVar = btsVar2;
                            j690Var2 = j690Var4;
                        } else {
                            ehr0Var2 = ehr0Var4;
                        }
                    } else {
                        btsVar2.Y();
                        if ((i2 & 2048) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 8192) != 0) {
                            i5 &= -7169;
                        }
                    }
                    i6 = i5;
                    j690Var3 = j690Var;
                    btsVar2.u();
                    ehr0Var3 = ehr0Var2;
                    j690 j690Var42 = j690Var3;
                    TextFieldType textFieldType2 = TextFieldType.Filled;
                    int i102 = i3 << 3;
                    int i112 = i3 >> 9;
                    int i122 = (i102 & 896) | (i102 & 112) | 6 | ((i3 >> 3) & 7168) | (i112 & HProv.ALG_CLASS_ALL) | (i112 & ImageMetadata.JPEG_GPS_COORDINATES) | (i112 & 3670016) | ((i6 << 21) & 29360128) | ((i3 << 15) & 234881024) | ((i3 << 21) & 1879048192);
                    int i132 = ((i3 >> 18) & 14) | ImageMetadata.EDGE_MODE | ((i3 >> 12) & 112) | ((i6 >> 3) & 896);
                    int i142 = i6 << 6;
                    androidx.compose.material.a.b(textFieldType2, str, wlsVar, gy31Var, wlsVar2, wlsVar3, wlsVar4, wlsVar5, z2, z4, z3, h8wVar, j690Var42, ehr0Var3, jmy0Var, btsVar2, i122, i132 | (i142 & 7168) | (i142 & HProv.ALG_CLASS_ALL));
                    btsVar = btsVar2;
                    j690Var2 = j690Var42;
                }
                v = btsVar.v();
                if (v == null) {
                    v.d = new kmy0(this, str, wlsVar, z, z2, gy31Var, h8wVar, z3, wlsVar2, wlsVar3, wlsVar4, wlsVar5, ehr0Var3, jmy0Var, j690Var2, i, i2);
                    return;
                }
                return;
            }
        } else {
            ehr0Var2 = ehr0Var;
        }
        i4 = 16;
        int i92 = i8 | i4 | (!btsVar2.k(jmy0Var) ? 256 : 128);
        if ((i2 & 8192) != 0) {
        }
        i7 = 1024;
        i5 = i92 | i7;
        if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378 || (i5 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    @Override // defpackage.k6e
    public boolean e(String[] strArr) {
        FileInputStream fileInputStream;
        Throwable th;
        ConsoleConfig.a(strArr);
        if (strArr.length <= 2) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(strArr[2]);
            try {
                JCPPref.importPreferences(fileInputStream);
                fileInputStream.close();
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    @Override // defpackage.g8p
    public i8p f(float f, float f2, float f3) {
        return new i8p(255, sy01.e(f2, f3, f, 0, 255), true);
    }

    @Override // defpackage.s3z
    public Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return new g92(2, 8);
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        if (task.o()) {
            return (Bundle) task.k();
        }
        if (Log.isLoggable("Rpc", 3)) {
            task.j();
        }
        dac.g("SERVICE_NOT_AVAILABLE", task.j());
        return null;
    }

    @Override // defpackage.h0r
    public Object i(File file) {
        return ParcelFileDescriptor.open(file, SelfTester_JCP.IMITA);
    }

    @Override // defpackage.s3z
    public Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        return new g92(2, Integer.valueOf(techBaseMessage.type));
    }

    @Override // defpackage.s3z
    public Object l(Date date) {
        return new g92(2, -3);
    }

    @Override // defpackage.s3z
    public Object m(Date date, RemovedMessageData removedMessageData) {
        return new g92(2, -1);
    }

    @Override // defpackage.h0r
    public void n(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // defpackage.s3z
    public Object o(my40 my40Var, boolean z) {
        return new g92(2, Integer.valueOf(my40Var.g.type));
    }

    @Override // defpackage.wm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.wm10
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // defpackage.vm11
    public /* synthetic */ Object q() {
        return new jdc(0);
    }

    public o0g r(TaxiApplication taxiApplication) {
        return new o0g(taxiApplication);
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof jdc;
    }

    public omy0(wog wogVar) {
    }
}
