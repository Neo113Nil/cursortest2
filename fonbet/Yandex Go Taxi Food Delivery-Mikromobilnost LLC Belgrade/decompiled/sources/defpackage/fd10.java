package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import org.webrtc.WebrtcBuildVersion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class fd10 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (tw21.a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((sb10) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(sb10.j("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new oe7(6, new ak00(5)));
        }
        if (tw21.a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((sb10) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((sb10) arrayList.remove(0));
    }

    public static String b(a aVar) {
        Pair d;
        String str = aVar.n;
        String str2 = aVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (d = d(aVar)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0412 A[Catch: NumberFormatException -> 0x0420, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0420, blocks: (B:221:0x03c4, B:223:0x03d6, B:234:0x03f4, B:237:0x0412), top: B:220:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(a aVar) {
        char c;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        char c2;
        Integer num2;
        char c3;
        byte[] bArr = bac.a;
        Integer num3 = 1;
        String str = aVar.k;
        kfc kfcVar = aVar.B;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i6 = 16;
        if (!"video/dolby-vision".equals(aVar.n)) {
            String str2 = split[0];
            str2.getClass();
            switch (str2.hashCode()) {
                case 3004662:
                    if (str2.equals("av01")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    if (str2.equals("avc1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3199032:
                    if (str2.equals("hev1")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3214780:
                    if (str2.equals("hvc1")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i7 = 16384;
            switch (c) {
                case 0:
                    if (split.length >= 4) {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 != 0) {
                                xvz.v(parseInt3, "Unknown AV1 profile: ");
                                return null;
                            }
                            if (parseInt5 != 8 && parseInt5 != 10) {
                                xvz.v(parseInt5, "Unknown AV1 bit depth: ");
                                return null;
                            }
                            int i8 = parseInt5 == 8 ? 1 : (kfcVar == null || !(kfcVar.d != null || (i = kfcVar.c) == 7 || i == 6)) ? 2 : 4096;
                            switch (parseInt4) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 4;
                                    break;
                                case 3:
                                    i7 = 8;
                                    break;
                                case 4:
                                    i7 = 16;
                                    break;
                                case 5:
                                    i7 = 32;
                                    break;
                                case 6:
                                    i7 = 64;
                                    break;
                                case 7:
                                    i7 = 128;
                                    break;
                                case 8:
                                    i7 = 256;
                                    break;
                                case 9:
                                    i7 = 512;
                                    break;
                                case 10:
                                    i7 = 1024;
                                    break;
                                case 11:
                                    i7 = 2048;
                                    break;
                                case 12:
                                    i7 = 4096;
                                    break;
                                case 13:
                                    i7 = 8192;
                                    break;
                                case 14:
                                    break;
                                case 15:
                                    i7 = 32768;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    break;
                                case 17:
                                    i7 = 131072;
                                    break;
                                case 18:
                                    i7 = 262144;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    break;
                                case 22:
                                    i7 = SelfTester_JCP.ENCRYPT_CBC;
                                    break;
                                case 23:
                                    i7 = SelfTester_JCP.ENCRYPT_CNT;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i8), Integer.valueOf(i7));
                            }
                            xvz.v(parseInt4, "Unknown AV1 level: ");
                            return null;
                        } catch (NumberFormatException unused) {
                            lk91.j("Ignoring malformed AV1 codec string: ".concat(str));
                            break;
                        }
                    } else {
                        lk91.j("Ignoring malformed AV1 codec string: ".concat(str));
                        return null;
                    }
                case 1:
                case 2:
                    if (split.length >= 2) {
                        try {
                            if (split[1].length() == 6) {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                if (split.length < 3) {
                                    lk91.j("Ignoring malformed AVC codec string: ".concat(str));
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i2 = -1;
                                i3 = 1;
                            } else if (parseInt == 77) {
                                i2 = -1;
                                i3 = 2;
                            } else if (parseInt == 88) {
                                i2 = -1;
                                i3 = 4;
                            } else if (parseInt != 100) {
                                if (parseInt == 110) {
                                    i3 = 16;
                                } else if (parseInt == 122) {
                                    i3 = 32;
                                } else if (parseInt != 244) {
                                    i2 = -1;
                                    i3 = -1;
                                } else {
                                    i3 = 64;
                                }
                                i2 = -1;
                            } else {
                                i2 = -1;
                                i3 = 8;
                            }
                            if (i3 == i2) {
                                xvz.v(parseInt, "Unknown AVC profile: ");
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i7 = 1;
                                    break;
                                case 11:
                                    i7 = 4;
                                    break;
                                case 12:
                                    i7 = 8;
                                    break;
                                case 13:
                                    i7 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i7 = 32;
                                            break;
                                        case 21:
                                            i7 = 64;
                                            break;
                                        case 22:
                                            i7 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i7 = 256;
                                                    break;
                                                case 31:
                                                    i7 = 512;
                                                    break;
                                                case 32:
                                                    i7 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i7 = 2048;
                                                            break;
                                                        case 41:
                                                            i7 = 4096;
                                                            break;
                                                        case 42:
                                                            i7 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    break;
                                                                case SAFETY_TIPS_VALUE:
                                                                    i7 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i7 = 65536;
                                                                    break;
                                                                default:
                                                                    i7 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i3), Integer.valueOf(i7));
                            }
                            xvz.v(parseInt2, "Unknown AVC level: ");
                            return null;
                        } catch (NumberFormatException unused2) {
                            lk91.j("Ignoring malformed AVC codec string: ".concat(str));
                            break;
                        }
                    } else {
                        lk91.j("Ignoring malformed AVC codec string: ".concat(str));
                        return null;
                    }
                case 3:
                case 4:
                    return bac.c(str, split, kfcVar);
                case 5:
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(eh20.f(Integer.parseInt(split[1], 16)))) {
                                int parseInt6 = Integer.parseInt(split[2]);
                                int i9 = 17;
                                if (parseInt6 != 17) {
                                    if (parseInt6 != 20) {
                                        i9 = 23;
                                        if (parseInt6 != 23) {
                                            i9 = 29;
                                            if (parseInt6 != 29) {
                                                i9 = 39;
                                                if (parseInt6 != 39) {
                                                    i9 = 42;
                                                    if (parseInt6 != 42) {
                                                        switch (parseInt6) {
                                                            case 1:
                                                                i4 = -1;
                                                                i9 = 1;
                                                                break;
                                                            case 2:
                                                                i4 = -1;
                                                                i9 = 2;
                                                                break;
                                                            case 3:
                                                                i4 = -1;
                                                                i9 = 3;
                                                                break;
                                                            case 4:
                                                                i4 = -1;
                                                                i9 = 4;
                                                                break;
                                                            case 5:
                                                                i4 = -1;
                                                                i9 = 5;
                                                                break;
                                                            case 6:
                                                                i4 = -1;
                                                                i9 = 6;
                                                                break;
                                                            default:
                                                                i4 = -1;
                                                                i9 = -1;
                                                                break;
                                                        }
                                                        if (i9 != i4) {
                                                            return new Pair(Integer.valueOf(i9), 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = 20;
                                    }
                                }
                                i4 = -1;
                                if (i9 != i4) {
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            lk91.j("Ignoring malformed MP4A codec string: ".concat(str));
                            break;
                        }
                    } else {
                        lk91.j("Ignoring malformed MP4A codec string: ".concat(str));
                        return null;
                    }
                    break;
                case 6:
                    Pair pair = new Pair(num3, num3);
                    if (split.length < 3) {
                        lk91.j("Ignoring malformed H263 codec string: ".concat(str));
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                    } catch (NumberFormatException unused4) {
                        lk91.j("Ignoring malformed H263 codec string: ".concat(str));
                        return pair;
                    }
                case 7:
                    if (split.length >= 3) {
                        try {
                            int parseInt7 = Integer.parseInt(split[1]);
                            int parseInt8 = Integer.parseInt(split[2]);
                            int i10 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i10 == -1) {
                                xvz.v(parseInt7, "Unknown VP9 profile: ");
                                return null;
                            }
                            if (parseInt8 == 10) {
                                i5 = -1;
                                i6 = 1;
                            } else if (parseInt8 == 11) {
                                i5 = -1;
                                i6 = 2;
                            } else if (parseInt8 == 20) {
                                i5 = -1;
                                i6 = 4;
                            } else if (parseInt8 != 21) {
                                if (parseInt8 != 30) {
                                    if (parseInt8 == 31) {
                                        i6 = 32;
                                    } else if (parseInt8 == 40) {
                                        i6 = 64;
                                    } else if (parseInt8 == 41) {
                                        i6 = 128;
                                    } else if (parseInt8 == 50) {
                                        i6 = 256;
                                    } else if (parseInt8 != 51) {
                                        switch (parseInt8) {
                                            case 60:
                                                i6 = 2048;
                                                break;
                                            case 61:
                                                i6 = 4096;
                                                break;
                                            case 62:
                                                i6 = 8192;
                                                break;
                                            default:
                                                i5 = -1;
                                                i6 = -1;
                                                break;
                                        }
                                    } else {
                                        i6 = 512;
                                    }
                                }
                                i5 = -1;
                            } else {
                                i5 = -1;
                                i6 = 8;
                            }
                            if (i6 != i5) {
                                return new Pair(Integer.valueOf(i10), Integer.valueOf(i6));
                            }
                            xvz.v(parseInt8, "Unknown VP9 level: ");
                            return null;
                        } catch (NumberFormatException unused5) {
                            lk91.j("Ignoring malformed VP9 codec string: ".concat(str));
                            break;
                        }
                    } else {
                        lk91.j("Ignoring malformed VP9 codec string: ".concat(str));
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        if (split.length < 3) {
            lk91.j("Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = bac.c.matcher(split[1]);
        if (!matcher.matches()) {
            lk91.j("Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        String group = matcher.group(1);
        if (group == null) {
            num = 4;
        } else {
            switch (group.hashCode()) {
                case HProv.ALG_TYPE_BLOCK /* 1536 */:
                    num = 4;
                    if (group.equals("00")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        num = 4;
                        c2 = 1;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        num = 4;
                        c2 = 2;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1539:
                    if (group.equals(WebrtcBuildVersion.webrtc_commit)) {
                        num = 4;
                        c2 = 3;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        num = 4;
                        c2 = 4;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        num = 4;
                        c2 = 5;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        num = 4;
                        c2 = 6;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        num = 4;
                        c2 = 7;
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        num = 4;
                        c2 = '\b';
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        num = 4;
                        c2 = '\t';
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        num = 4;
                        c2 = '\n';
                        break;
                    }
                    num = 4;
                    c2 = 65535;
                    break;
                default:
                    num = 4;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = num;
                    break;
                case 3:
                    num2 = 8;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case '\b':
                    num2 = 256;
                    break;
                case '\t':
                    num2 = 512;
                    break;
                case '\n':
                    num2 = 1024;
                    break;
            }
            if (num2 != null) {
                lk91.j("Unknown Dolby Vision profile string: " + group);
                return null;
            }
            String str3 = split[2];
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case 1537:
                        if (str3.equals("01")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1538:
                        if (str3.equals("02")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1539:
                        if (str3.equals(WebrtcBuildVersion.webrtc_commit)) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1540:
                        if (str3.equals("04")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1541:
                        if (str3.equals("05")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1542:
                        if (str3.equals("06")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1543:
                        if (str3.equals("07")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1544:
                        if (str3.equals("08")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1545:
                        if (str3.equals("09")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1567:
                        if (str3.equals("10")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1568:
                        if (str3.equals("11")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1569:
                        if (str3.equals("12")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1570:
                        if (str3.equals("13")) {
                            c3 = '\f';
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = num;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case '\b':
                        num3 = 256;
                        break;
                    case '\t':
                        num3 = 512;
                        break;
                    case '\n':
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case '\f':
                        num3 = 4096;
                        break;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                lk91.j("Unknown Dolby Vision level string: " + str3);
                return null;
            }
            num3 = null;
            if (num3 == null) {
            }
        }
        num2 = null;
        if (num2 != null) {
        }
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (fd10.class) {
            try {
                bd10 bd10Var = new bd10(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(bd10Var);
                if (list != null) {
                    return list;
                }
                ArrayList f = f(bd10Var, new dd10(z, z2, str.equals("video/mv-hevc")));
                if (z && f.isEmpty() && tw21.a <= 23) {
                    f = f(bd10Var, new r100());
                    if (!f.isEmpty()) {
                        lk91.j("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((sb10) f.get(0)).a);
                    }
                }
                a(str, f);
                ImmutableList l = ImmutableList.l(f);
                hashMap.put(bd10Var, l);
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:11:0x0138, B:12:0x0035, B:15:0x0040, B:50:0x0111, B:53:0x0119, B:55:0x011f, B:58:0x0140, B:59:0x0161), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(bd10 bd10Var, cd10 cd10Var) {
        boolean z;
        String str;
        int i;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean q;
        boolean g;
        boolean z2;
        int i2;
        bd10 bd10Var2 = bd10Var;
        boolean z3 = bd10Var2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = bd10Var2.a;
            int t = cd10Var.t();
            boolean y = cd10Var.y();
            int i3 = 0;
            while (i3 < t) {
                MediaCodecInfo n = cd10Var.n(i3);
                int i4 = tw21.a;
                if (i4 < 29 || !n.isAlias()) {
                    String name = n.getName();
                    if (j(n, name, y, str2)) {
                        int i5 = i3;
                        String c = c(n, name, str2);
                        if (c != null) {
                            try {
                                capabilitiesForType = n.getCapabilitiesForType(c);
                                q = cd10Var.q("tunneled-playback", c, capabilitiesForType);
                                g = cd10Var.g("tunneled-playback", capabilitiesForType);
                                z2 = bd10Var2.c;
                            } catch (Exception e) {
                                e = e;
                                z = y;
                                str = name;
                            }
                            if (z2 || !g) {
                                if (!z2 || q) {
                                    boolean q2 = cd10Var.q("secure-playback", c, capabilitiesForType);
                                    boolean g2 = cd10Var.g("secure-playback", capabilitiesForType);
                                    if (z3 || !g2) {
                                        if (!z3 || q2) {
                                            boolean z4 = true;
                                            boolean isHardwareAccelerated = i4 >= 29 ? n.isHardwareAccelerated() : !k(n, str2);
                                            z = y;
                                            try {
                                                boolean k = k(n, str2);
                                                if (i4 >= 29) {
                                                    z4 = n.isVendor();
                                                } else {
                                                    String g3 = f0b1.g(n.getName());
                                                    if (g3.startsWith("omx.google.") || g3.startsWith("c2.android.") || g3.startsWith("c2.google.")) {
                                                        z4 = false;
                                                    }
                                                }
                                                if (!(z && z3 == q2) && (z || z3)) {
                                                    boolean z5 = isHardwareAccelerated;
                                                    i2 = i5;
                                                    boolean z6 = z4;
                                                    if (!z && q2) {
                                                        i = i2;
                                                        str = name;
                                                        try {
                                                            arrayList.add(sb10.j(name + ".secure", str2, c, capabilitiesForType, z5, k, z6, true));
                                                            break;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            if (tw21.a > 23) {
                                                            }
                                                            lk91.e("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + c + Extension.C_BRAKE);
                                                            throw e;
                                                        }
                                                    }
                                                    i = i2;
                                                } else {
                                                    boolean z7 = isHardwareAccelerated;
                                                    i2 = i5;
                                                    try {
                                                        arrayList.add(sb10.j(name, str2, c, capabilitiesForType, z7, k, z4, false));
                                                        i = i2;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i = i2;
                                                        str = name;
                                                        if (tw21.a > 23 || arrayList.isEmpty()) {
                                                            lk91.e("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + c + Extension.C_BRAKE);
                                                            throw e;
                                                        }
                                                        lk91.e("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                        i3 = i + 1;
                                                        bd10Var2 = bd10Var;
                                                        y = z;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                str = name;
                                                i = i5;
                                                if (tw21.a > 23) {
                                                }
                                                lk91.e("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + c + Extension.C_BRAKE);
                                                throw e;
                                            }
                                            i3 = i + 1;
                                            bd10Var2 = bd10Var;
                                            y = z;
                                        }
                                    }
                                }
                            }
                        }
                        z = y;
                        i = i5;
                        i3 = i + 1;
                        bd10Var2 = bd10Var;
                        y = z;
                    }
                }
                z = y;
                i = i3;
                i3 = i + 1;
                bd10Var2 = bd10Var;
                y = z;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e5);
        }
    }

    public static List g(xb10 xb10Var, a aVar, boolean z, boolean z2) {
        List decoderInfos = xb10Var.getDecoderInfos(aVar.n, z, z2);
        String b = b(aVar);
        List p = b == null ? ImmutableList.p() : xb10Var.getDecoderInfos(b, z, z2);
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.d(decoderInfos);
        aVar2.d(p);
        return aVar2.g();
    }

    public static ArrayList h(a aVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new oe7(6, new uhx(9, aVar)));
        return arrayList;
    }

    public static sb10 i() {
        List e = e("audio/raw", false, false);
        if (e.isEmpty()) {
            return null;
        }
        return (sb10) e.get(0);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = tw21.a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str) {
        if (tw21.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (eh20.l(str)) {
            return true;
        }
        String g = f0b1.g(mediaCodecInfo.getName());
        if (g.startsWith("arc.")) {
            return false;
        }
        if (g.startsWith("omx.google.") || g.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((g.startsWith("omx.sec.") && g.contains(".sw.")) || g.equals("omx.qcom.video.decoder.hevcswvdec") || g.startsWith("c2.android.") || g.startsWith("c2.google.")) {
            return true;
        }
        return (g.startsWith("omx.") || g.startsWith("c2.")) ? false : true;
    }
}
