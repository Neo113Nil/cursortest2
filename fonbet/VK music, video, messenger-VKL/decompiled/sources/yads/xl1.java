package yads;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.cxd0;
import xsna.emb;
import xsna.gsi0;
import xsna.hsi0;

/* loaded from: classes10.dex */
public abstract class xl1 {
    public static final Pattern a;
    public static final HashMap b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static int j;

    static {
        yl1 yl1Var = ql2.e;
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        c = yl1Var.b();
        d = yl1Var.c();
        e = yl1Var.O();
        f = yl1Var.q();
        g = yl1Var.r();
        h = yl1Var.a();
        i = yl1Var.F();
        j = -1;
    }

    public static String a(nx0 nx0Var) {
        Pair b2;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(nx0Var.m)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!"video/dolby-vision".equals(nx0Var.m) || (b2 = b(nx0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) b2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(nx0 nx0Var) {
        int i2;
        int i3;
        int i4;
        int parseInt;
        int i5;
        int parseInt2;
        int i6;
        int i7;
        Integer num;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num2;
        char c2;
        Integer num3;
        Integer num4;
        char c3;
        String str = nx0Var.j;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(nx0Var.m)) {
            String str2 = nx0Var.j;
            if (split.length < 3) {
                ql1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = a.matcher(split[1]);
            if (!matcher.matches()) {
                ql1.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String group = matcher.group(1);
            if (group == null) {
                num2 = 2048;
            } else {
                num2 = 2048;
                switch (group.hashCode()) {
                    case 1536:
                        if (group.equals("00")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1537:
                        if (group.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        num3 = 1;
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
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
                }
                if (num3 != null) {
                    ql1.a("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
                    return null;
                }
                String str3 = split[2];
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case 1537:
                            if (str3.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
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
                            if (str3.equals("03")) {
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
                        case 0:
                            num4 = 1;
                            break;
                        case 1:
                            num4 = 2;
                            break;
                        case 2:
                            num4 = 4;
                            break;
                        case 3:
                            num4 = 8;
                            break;
                        case 4:
                            num4 = 16;
                            break;
                        case 5:
                            num4 = 32;
                            break;
                        case 6:
                            num4 = 64;
                            break;
                        case 7:
                            num4 = 128;
                            break;
                        case '\b':
                            num4 = 256;
                            break;
                        case '\t':
                            num4 = 512;
                            break;
                        case '\n':
                            num4 = 1024;
                            break;
                        case 11:
                            num4 = num2;
                            break;
                        case '\f':
                            num4 = 4096;
                            break;
                    }
                    if (num4 == null) {
                        return new Pair(num3, num4);
                    }
                    ql1.a("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    return null;
                }
                num4 = null;
                if (num4 == null) {
                }
            }
            num3 = null;
            if (num3 != null) {
            }
        } else {
            if (c.equals(split[0]) || d.equals(split[0])) {
                String str4 = nx0Var.j;
                if (split.length < 2) {
                    ql1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        i2 = 16;
                        parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                        i3 = 4;
                        parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        i5 = 2;
                        i4 = 1;
                    } else {
                        i2 = 16;
                        i3 = 4;
                        if (split.length < 3) {
                            ji1.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                            return null;
                        }
                        i4 = 1;
                        parseInt = Integer.parseInt(split[1]);
                        i5 = 2;
                        parseInt2 = Integer.parseInt(split[2]);
                    }
                    int i13 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i2 : 8 : i3 : i5 : i4;
                    if (i13 == -1) {
                        lg1.a("Unknown AVC profile: ", parseInt, "MediaCodecUtil");
                        return null;
                    }
                    switch (parseInt2) {
                        case 10:
                            i6 = i4;
                            break;
                        case 11:
                            i6 = i3;
                            break;
                        case 12:
                            i6 = 8;
                            break;
                        case 13:
                            i6 = i2;
                            break;
                        default:
                            switch (parseInt2) {
                                case 20:
                                    i6 = 32;
                                    break;
                                case 21:
                                    i6 = 64;
                                    break;
                                case 22:
                                    i6 = 128;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 30:
                                            i6 = 256;
                                            break;
                                        case 31:
                                            i6 = 512;
                                            break;
                                        case 32:
                                            i6 = 1024;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 40:
                                                    i6 = 2048;
                                                    break;
                                                case 41:
                                                    i6 = 4096;
                                                    break;
                                                case 42:
                                                    i6 = 8192;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 50:
                                                            i6 = 16384;
                                                            break;
                                                        case 51:
                                                            i6 = 32768;
                                                            break;
                                                        case 52:
                                                            i6 = 65536;
                                                            break;
                                                        default:
                                                            i6 = -1;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                    if (i6 != -1) {
                        return new Pair(Integer.valueOf(i13), Integer.valueOf(i6));
                    }
                    lg1.a("Unknown AVC level: ", parseInt2, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    ql1.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                    return null;
                }
            }
            if (e.equals(split[0])) {
                String str5 = nx0Var.j;
                if (split.length < 3) {
                    ql1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                    return null;
                }
                try {
                    int parseInt3 = Integer.parseInt(split[1]);
                    int parseInt4 = Integer.parseInt(split[2]);
                    int i14 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                    if (i14 == -1) {
                        lg1.a("Unknown VP9 profile: ", parseInt3, "MediaCodecUtil");
                        return null;
                    }
                    if (parseInt4 == 10) {
                        i11 = -1;
                        i12 = 1;
                    } else if (parseInt4 == 11) {
                        i11 = -1;
                        i12 = 2;
                    } else if (parseInt4 == 20) {
                        i11 = -1;
                        i12 = 4;
                    } else if (parseInt4 == 21) {
                        i11 = -1;
                        i12 = 8;
                    } else if (parseInt4 == 30) {
                        i11 = -1;
                        i12 = 16;
                    } else if (parseInt4 == 31) {
                        i11 = -1;
                        i12 = 32;
                    } else if (parseInt4 == 40) {
                        i11 = -1;
                        i12 = 64;
                    } else if (parseInt4 == 41) {
                        i11 = -1;
                        i12 = 128;
                    } else if (parseInt4 == 50) {
                        i11 = -1;
                        i12 = 256;
                    } else if (parseInt4 != 51) {
                        switch (parseInt4) {
                            case 60:
                                i11 = -1;
                                i12 = 2048;
                                break;
                            case 61:
                                i11 = -1;
                                i12 = 4096;
                                break;
                            case 62:
                                i12 = 8192;
                                i11 = -1;
                                break;
                            default:
                                i11 = -1;
                                i12 = -1;
                                break;
                        }
                    } else {
                        i11 = -1;
                        i12 = 512;
                    }
                    if (i12 != i11) {
                        return new Pair(Integer.valueOf(i14), Integer.valueOf(i12));
                    }
                    lg1.a("Unknown VP9 level: ", parseInt4, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    ql1.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                    return null;
                }
            }
            if (!f.equals(split[0]) && !g.equals(split[0])) {
                if (!h.equals(split[0])) {
                    if (i.equals(split[0])) {
                        String str6 = nx0Var.j;
                        if (split.length != 3) {
                            ql1.a("Ignoring malformed MP4A codec string: ", str6, "MediaCodecUtil");
                            return null;
                        }
                        try {
                            if ("audio/mp4a-latm".equals(iu1.a(Integer.parseInt(split[1], 16)))) {
                                int parseInt5 = Integer.parseInt(split[2]);
                                if (parseInt5 == 17) {
                                    i8 = 17;
                                } else if (parseInt5 == 20) {
                                    i8 = 20;
                                } else if (parseInt5 == 23) {
                                    i8 = 23;
                                } else if (parseInt5 == 29) {
                                    i8 = 29;
                                } else if (parseInt5 == 39) {
                                    i8 = 39;
                                } else if (parseInt5 != 42) {
                                    switch (parseInt5) {
                                        case 1:
                                            i8 = 1;
                                            break;
                                        case 2:
                                            i8 = 2;
                                            break;
                                        case 3:
                                            i8 = 3;
                                            break;
                                        case 4:
                                            i8 = 4;
                                            break;
                                        case 5:
                                            i8 = 5;
                                            break;
                                        case 6:
                                            i8 = 6;
                                            break;
                                        default:
                                            i8 = -1;
                                            break;
                                    }
                                } else {
                                    i8 = 42;
                                }
                                if (i8 != -1) {
                                    return new Pair(Integer.valueOf(i8), 0);
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            ql1.a("Ignoring malformed MP4A codec string: ", str6, "MediaCodecUtil");
                        }
                    }
                    return null;
                }
                String str7 = nx0Var.j;
                mx mxVar = nx0Var.y;
                if (split.length < 4) {
                    ql1.a("Ignoring malformed AV1 codec string: ", str7, "MediaCodecUtil");
                    return null;
                }
                try {
                    int parseInt6 = Integer.parseInt(split[1]);
                    int parseInt7 = Integer.parseInt(split[2].substring(0, 2));
                    int parseInt8 = Integer.parseInt(split[3]);
                    if (parseInt6 != 0) {
                        lg1.a("Unknown AV1 profile: ", parseInt6, "MediaCodecUtil");
                        return null;
                    }
                    if (parseInt8 != 8 && parseInt8 != 10) {
                        lg1.a("Unknown AV1 bit depth: ", parseInt8, "MediaCodecUtil");
                        return null;
                    }
                    int i15 = parseInt8 == 8 ? 1 : (mxVar == null || !(mxVar.e != null || (i9 = mxVar.d) == 7 || i9 == 6)) ? 2 : 4096;
                    switch (parseInt7) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 2:
                            i10 = 4;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            i10 = 16;
                            break;
                        case 5:
                            i10 = 32;
                            break;
                        case 6:
                            i10 = 64;
                            break;
                        case 7:
                            i10 = 128;
                            break;
                        case 8:
                            i10 = 256;
                            break;
                        case 9:
                            i10 = 512;
                            break;
                        case 10:
                            i10 = 1024;
                            break;
                        case 11:
                            i10 = 2048;
                            break;
                        case 12:
                            i10 = 4096;
                            break;
                        case 13:
                            i10 = 8192;
                            break;
                        case 14:
                            i10 = 16384;
                            break;
                        case 15:
                            i10 = 32768;
                            break;
                        case 16:
                            i10 = 65536;
                            break;
                        case 17:
                            i10 = 131072;
                            break;
                        case 18:
                            i10 = SQLiteDatabase.OPEN_PRIVATECACHE;
                            break;
                        case 19:
                            i10 = 524288;
                            break;
                        case 20:
                            i10 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            break;
                        case 21:
                            i10 = 2097152;
                            break;
                        case 22:
                            i10 = 4194304;
                            break;
                        case 23:
                            i10 = 8388608;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    if (i10 != -1) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i10));
                    }
                    lg1.a("Unknown AV1 level: ", parseInt7, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    ql1.a("Ignoring malformed AV1 codec string: ", str7, "MediaCodecUtil");
                    return null;
                }
            }
            String str8 = nx0Var.j;
            if (split.length < 4) {
                ql1.a("Ignoring malformed HEVC codec string: ", str8, "MediaCodecUtil");
                return null;
            }
            Matcher matcher2 = a.matcher(split[1]);
            if (!matcher2.matches()) {
                ql1.a("Ignoring malformed HEVC codec string: ", str8, "MediaCodecUtil");
                return null;
            }
            String group2 = matcher2.group(1);
            if ("1".equals(group2)) {
                i7 = 1;
            } else {
                if (!"2".equals(group2)) {
                    ql1.a("Unknown HEVC profile string: ", group2, "MediaCodecUtil");
                    return null;
                }
                i7 = 2;
            }
            String str9 = split[3];
            if (str9 != null) {
                yl1 yl1Var = ql2.e;
                if (yl1Var.A().equals(str9)) {
                    num = 1;
                } else if (yl1Var.B().equals(str9)) {
                    num = 4;
                } else if (yl1Var.C().equals(str9)) {
                    num = 16;
                } else if (yl1Var.D().equals(str9)) {
                    num = 64;
                } else if (yl1Var.E().equals(str9)) {
                    num = 256;
                } else if (yl1Var.s().equals(str9)) {
                    num = 1024;
                } else if (yl1Var.t().equals(str9)) {
                    num = 4096;
                } else if (yl1Var.u().equals(str9)) {
                    num = 16384;
                } else if (yl1Var.v().equals(str9)) {
                    num = 65536;
                } else if (yl1Var.w().equals(str9)) {
                    num = Integer.valueOf(SQLiteDatabase.OPEN_PRIVATECACHE);
                } else if (yl1Var.x().equals(str9)) {
                    num = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                } else if (yl1Var.y().equals(str9)) {
                    num = 4194304;
                } else if (yl1Var.z().equals(str9)) {
                    num = Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
                } else if (yl1Var.l().equals(str9)) {
                    num = 2;
                } else if (yl1Var.m().equals(str9)) {
                    num = 8;
                } else if (yl1Var.n().equals(str9)) {
                    num = 32;
                } else if (yl1Var.o().equals(str9)) {
                    num = 128;
                } else if (yl1Var.p().equals(str9)) {
                    num = 512;
                } else if (yl1Var.d().equals(str9)) {
                    num = 2048;
                } else if (yl1Var.e().equals(str9)) {
                    num = 8192;
                } else if (yl1Var.f().equals(str9)) {
                    num = 32768;
                } else if (yl1Var.g().equals(str9)) {
                    num = 131072;
                } else if (yl1Var.h().equals(str9)) {
                    num = 524288;
                } else if (yl1Var.i().equals(str9)) {
                    num = 2097152;
                } else if (yl1Var.j().equals(str9)) {
                    num = 8388608;
                } else if (yl1Var.k().equals(str9)) {
                    num = 33554432;
                }
                if (num == null) {
                    return new Pair(Integer.valueOf(i7), num);
                }
                ql1.a("Unknown HEVC level string: ", str9, "MediaCodecUtil");
                return null;
            }
            num = null;
            if (num == null) {
            }
        }
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] decode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = emb.b;
            if (new String(decode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), emb.b).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), emb.b).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), emb.b).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:32|(1:34)(2:110|111)|35|(3:36|37|(1:39)(7:88|89|90|91|92|93|(1:100)(1:99)))|(12:79|80|(1:82)|44|45|46|47|48|49|50|51|12)|(3:70|(2:73|75)|12)|44|45|46|47|48|49|50|51|12) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        yads.ji1.b("MediaCodecUtil", "Skipping codec " + r3 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r11 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134 A[Catch: Exception -> 0x017e, TRY_ENTER, TryCatch #3 {Exception -> 0x017e, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:12:0x0153, B:13:0x0031, B:16:0x003c, B:54:0x012c, B:57:0x0134, B:59:0x013a, B:62:0x015b, B:63:0x017c), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(rl1 rl1Var, tl1 tl1Var) {
        String str;
        String str2;
        int i2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean a2;
        boolean a3;
        boolean z;
        boolean z2;
        boolean a4;
        boolean z3;
        boolean isVendor;
        boolean isAlias;
        tl1 tl1Var2 = tl1Var;
        String str3 = "secure-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = rl1Var.a;
            int a5 = tl1Var2.a();
            boolean b2 = tl1Var2.b();
            int i3 = 0;
            while (i3 < a5) {
                MediaCodecInfo a6 = tl1Var2.a(i3);
                int i4 = mc3.a;
                if (i4 >= 29) {
                    isAlias = a6.isAlias();
                }
                String name = a6.getName();
                if (a(a6, name, b2, str4)) {
                    int i5 = i3;
                    String a7 = a(a6, name, str4);
                    if (a7 != null) {
                        try {
                            capabilitiesForType = a6.getCapabilitiesForType(a7);
                            a2 = tl1Var2.a("tunneled-playback", a7, capabilitiesForType);
                            a3 = tl1Var2.a("tunneled-playback", capabilitiesForType);
                            z = rl1Var.c;
                        } catch (Exception e2) {
                            e = e2;
                            str = str3;
                            str2 = name;
                            i2 = i5;
                        }
                        if ((z || !a3) && (!z || a2)) {
                            boolean a8 = tl1Var2.a(str3, a7, capabilitiesForType);
                            boolean a9 = tl1Var2.a(str3, capabilitiesForType);
                            boolean z4 = rl1Var.b;
                            if ((z4 || !a9) && (!z4 || a8)) {
                                if (i4 >= 29) {
                                    z2 = a6.isHardwareAccelerated();
                                } else {
                                    z2 = !a(a6, str4);
                                }
                                try {
                                    a4 = a(a6, str4);
                                    if (i4 >= 29) {
                                        isVendor = a6.isVendor();
                                        str = str3;
                                        i2 = i5;
                                        z3 = isVendor;
                                    } else {
                                        String a10 = ki.a(a6.getName());
                                        str = str3;
                                        try {
                                            try {
                                                if (a10.startsWith(new String(Base64.decode("b214Lmdvb2dsZS4=", 0), emb.b)) || a10.startsWith("c2.android.") || a10.startsWith("c2.google.")) {
                                                    i2 = i5;
                                                    z3 = false;
                                                } else {
                                                    i2 = i5;
                                                    z3 = true;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                i2 = i5;
                                                str2 = name;
                                                if (mc3.a > 23) {
                                                }
                                                ji1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a7 + ")");
                                                throw e;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            i2 = i5;
                                            str2 = name;
                                            if (mc3.a > 23) {
                                            }
                                            ji1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a7 + ")");
                                            throw e;
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str = str3;
                                }
                                if (b2) {
                                    try {
                                        if (rl1Var.b != a8) {
                                        }
                                        str2 = name;
                                        arrayList.add(jl1.a(name, str4, a7, capabilitiesForType, z2, a4, z3, false));
                                    } catch (Exception e6) {
                                        e = e6;
                                        str2 = name;
                                        if (mc3.a > 23) {
                                        }
                                        ji1.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a7 + ")");
                                        throw e;
                                    }
                                    i3 = i2 + 1;
                                    tl1Var2 = tl1Var;
                                    str3 = str;
                                }
                                if (b2 || rl1Var.b) {
                                    str2 = name;
                                    if (!b2 && a8) {
                                        arrayList.add(jl1.a(str2 + ".secure", str4, a7, capabilitiesForType, z2, a4, z3, true));
                                        break;
                                    }
                                    i3 = i2 + 1;
                                    tl1Var2 = tl1Var;
                                    str3 = str;
                                }
                                str2 = name;
                                arrayList.add(jl1.a(name, str4, a7, capabilitiesForType, z2, a4, z3, false));
                                i3 = i2 + 1;
                                tl1Var2 = tl1Var;
                                str3 = str;
                            }
                        }
                    }
                    str = str3;
                    i2 = i5;
                    i3 = i2 + 1;
                    tl1Var2 = tl1Var;
                    str3 = str;
                } else {
                    str = str3;
                    i2 = i3;
                    i3 = i2 + 1;
                    tl1Var2 = tl1Var;
                    str3 = str;
                }
            }
            return arrayList;
        } catch (Exception e7) {
            throw new sl1(e7);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = mc3.a;
        if (i2 < 21) {
            byte[] decode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
            Charset charset = emb.b;
            if (new String(decode, charset).equals(str) || new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str) || new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i2 < 18) {
            byte[] decode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
            Charset charset2 = emb.b;
            if (new String(decode2, charset2).equals(str)) {
                String str3 = new String(Base64.decode("YTcw", 0), charset2);
                String str4 = mc3.b;
                if (str3.equals(str4) || (new String(Base64.decode("WGlhb21p", 0), charset2).equals(mc3.c) && str4.startsWith(new String(Base64.decode("SE0=", 0), charset2)))) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            byte[] decode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
            Charset charset3 = emb.b;
            if (new String(decode3, charset3).equals(str)) {
                String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                String str6 = mc3.b;
                if (str5.equals(str6) || new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6) || new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6) || str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3)) || new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6) || new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6) || new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6) || new String(Base64.decode("U08tMDJF", 0), charset3).equals(str6)) {
                    return false;
                }
            }
        }
        if (i2 == 16) {
            byte[] decode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
            Charset charset4 = emb.b;
            if (new String(decode4, charset4).equals(str)) {
                String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                String str8 = mc3.b;
                if (str7.equals(str8) || new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8) || new String(Base64.decode("QzE2MDU=", 0), charset4).equals(str8)) {
                    return false;
                }
            }
        }
        if (i2 < 24) {
            byte[] decode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset5 = emb.b;
            if ((new String(decode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(mc3.c)) {
                String str9 = mc3.b;
                if (str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5)) || str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5)) || new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9) || new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9) || new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9) || new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9) || new String(Base64.decode("U0NWMzE=", 0), charset5).equals(str9)) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            byte[] decode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
            Charset charset6 = emb.b;
            if (new String(decode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(mc3.c)) {
                String str10 = mc3.b;
                if (str10.startsWith("d2") || str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6)) || str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6)) || str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6)) || str10.startsWith(new String(Base64.decode("dDA=", 0), charset6))) {
                    return false;
                }
            }
        }
        if (i2 <= 19) {
            String str11 = mc3.b;
            byte[] decode7 = Base64.decode("amZsdGU=", 0);
            Charset charset7 = emb.b;
            if (str11.startsWith(new String(decode7, charset7)) && new String(Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), charset7).equals(str)) {
                return false;
            }
        }
        return (i2 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), emb.b).equals(str)) ? false : true;
    }

    public static /* synthetic */ int b(jl1 jl1Var) {
        return jl1Var.a.startsWith(ql2.e.K()) ? 1 : 0;
    }

    public static /* synthetic */ int a(jl1 jl1Var) {
        String str = jl1Var.a;
        yl1 yl1Var = ql2.e;
        if (str.startsWith(yl1Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (mc3.a >= 26 || !str.equals(yl1Var.G())) ? 0 : -1;
    }

    public static /* synthetic */ int a(nx0 nx0Var, jl1 jl1Var) {
        try {
            return jl1Var.a(nx0Var) ? 1 : 0;
        } catch (sl1 unused) {
            return -1;
        }
    }

    public static /* synthetic */ int a(wl1 wl1Var, Object obj, Object obj2) {
        return wl1Var.a(obj2) - wl1Var.a(obj);
    }

    public static void a(ArrayList arrayList, final wl1 wl1Var) {
        Collections.sort(arrayList, new Comparator() { // from class: xsna.uiz0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return yads.xl1.a(yads.wl1.this, obj, obj2);
            }
        });
    }

    public static synchronized List a(String str, boolean z, boolean z2) {
        tl1 ul1Var;
        synchronized (xl1.class) {
            try {
                rl1 rl1Var = new rl1(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(rl1Var);
                if (list != null) {
                    return list;
                }
                int i2 = mc3.a;
                if (i2 >= 21) {
                    ul1Var = new vl1(z, z2);
                } else {
                    ul1Var = new ul1();
                }
                ArrayList a2 = a(rl1Var, ul1Var);
                if (z && a2.isEmpty() && 21 <= i2 && i2 <= 23) {
                    a2 = a(rl1Var, new ul1());
                    if (!a2.isEmpty()) {
                        ji1.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((jl1) a2.get(0)).a);
                    }
                }
                a(str, a2);
                s51 a3 = s51.a((Collection) a2);
                hashMap.put(rl1Var, a3);
                return a3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList a(s51 s51Var, nx0 nx0Var) {
        ArrayList arrayList = new ArrayList(s51Var);
        a(arrayList, new cxd0(nx0Var, 22));
        return arrayList;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (j == -1) {
            int i3 = 0;
            List a2 = a("video/avc", false, false);
            jl1 jl1Var = a2.isEmpty() ? null : (jl1) a2.get(0);
            if (jl1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = jl1Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case SQLiteDatabase.OPEN_PRIVATECACHE /* 262144 */:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, mc3.a >= 21 ? 345600 : 172800);
            }
            j = i3;
        }
        return j;
    }

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (mc3.a < 26) {
                String str2 = mc3.b;
                yl1 yl1Var = ql2.e;
                if (str2.equals(yl1Var.N()) && arrayList.size() == 1 && ((jl1) arrayList.get(0)).a.equals(yl1Var.G())) {
                    arrayList.add(jl1.a(yl1Var.L(), MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false));
                }
            }
            a(arrayList, new gsi0(10));
        }
        int i2 = mc3.a;
        if (i2 < 21 && arrayList.size() > 1) {
            String str3 = ((jl1) arrayList.get(0)).a;
            yl1 yl1Var2 = ql2.e;
            if (yl1Var2.I().equals(str3) || yl1Var2.H().equals(str3) || yl1Var2.J().equals(str3)) {
                a(arrayList, new hsi0(8));
            }
        }
        if (i2 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (ql2.e.M().equals(((jl1) arrayList.get(0)).a)) {
            arrayList.add((jl1) arrayList.remove(0));
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (mc3.a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if ("audio".equals(iu1.c(str))) {
            return true;
        }
        String a2 = ki.a(mediaCodecInfo.getName());
        if (!a2.startsWith("arc.")) {
            byte[] decode = Base64.decode("b214Lmdvb2dsZS4=", 0);
            Charset charset = emb.b;
            if (a2.startsWith(new String(decode, charset)) || a2.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
                return true;
            }
            if ((a2.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && a2.contains(".sw.")) || a2.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
                return true;
            }
            if (!a2.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) && !a2.startsWith("c2.")) {
                return true;
            }
        }
        return false;
    }
}
