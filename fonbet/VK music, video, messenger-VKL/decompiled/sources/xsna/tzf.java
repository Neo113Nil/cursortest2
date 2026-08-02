package xsna;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CodecSpecificDataUtil.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes12.dex */
public final class tzf {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = y2r0.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0412 A[Catch: NumberFormatException -> 0x041d, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x041d, blocks: (B:221:0x03c4, B:223:0x03d6, B:234:0x03f4, B:237:0x0412), top: B:220:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0750  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> b(androidx.media3.common.a aVar) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int parseInt;
        int parseInt2;
        int i8;
        int i9;
        int i10;
        char c3;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num;
        char c4;
        Integer num2;
        char c5;
        char c6;
        Integer num3 = 1;
        String str = aVar.k;
        m6g m6gVar = aVar.D;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(aVar.n)) {
            String str2 = split[0];
            str2.getClass();
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3001066:
                    if (str2.equals("apv1")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006243:
                    if (str2.equals(VisualSampleEntry.TYPE3)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3199032:
                    if (str2.equals(VisualSampleEntry.TYPE7)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3214780:
                    if (str2.equals(VisualSampleEntry.TYPE6)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3224753:
                    if (str2.equals("iamf")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3356560:
                    if (str2.equals(AudioSampleEntry.TYPE3)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3475740:
                    if (str2.equals(VisualSampleEntry.TYPE2)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            int i15 = 65536;
            int i16 = 8192;
            switch (c2) {
                case 0:
                    if (split.length != 4) {
                        xr.a("Ignoring malformed AC-4 codec string: ", str);
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 != 0) {
                                if (parseInt3 != 1) {
                                    if (parseInt3 == 2) {
                                        if (parseInt4 == 1) {
                                            i2 = IronSourceError.ERROR_RV_LOAD_DURING_LOAD;
                                        } else if (parseInt4 == 2) {
                                            i2 = IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED;
                                        }
                                        i3 = -1;
                                    }
                                    i3 = -1;
                                    i2 = -1;
                                } else if (parseInt4 == 0) {
                                    i2 = 513;
                                    i3 = -1;
                                } else {
                                    if (parseInt4 == 1) {
                                        i = 514;
                                        i2 = i;
                                        i3 = -1;
                                    }
                                    i3 = -1;
                                    i2 = -1;
                                }
                                if (i2 == i3) {
                                    ahn.F("Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                    break;
                                } else {
                                    if (parseInt5 == 0) {
                                        i4 = 1;
                                    } else if (parseInt5 == 1) {
                                        i4 = 2;
                                    } else if (parseInt5 == 2) {
                                        i4 = 4;
                                    } else if (parseInt5 == 3) {
                                        i4 = 8;
                                    } else if (parseInt5 != 4) {
                                        i5 = -1;
                                        i4 = -1;
                                        if (i4 == i5) {
                                            break;
                                        } else {
                                            sn.d(parseInt5, "Unknown AC-4 level: ");
                                            break;
                                        }
                                    } else {
                                        i4 = 16;
                                    }
                                    i5 = -1;
                                    if (i4 == i5) {
                                    }
                                }
                            } else {
                                if (parseInt4 == 0) {
                                    i = 257;
                                    i2 = i;
                                    i3 = -1;
                                    if (i2 == i3) {
                                    }
                                }
                                i3 = -1;
                                i2 = -1;
                                if (i2 == i3) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            xr.a("Ignoring malformed AC-4 codec string: ", str);
                            return null;
                        }
                    }
                case 1:
                    if (split.length < 4) {
                        xr.a("Ignoring malformed APV codec string: ", str);
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1].substring(4));
                            int parseInt7 = Integer.parseInt(split[2].substring(4));
                            int parseInt8 = Integer.parseInt(split[3].substring(4));
                            if (parseInt6 != 33) {
                                if (parseInt6 != 44) {
                                    sn.d(parseInt6, "Ignoring invalid APV profile: ");
                                    break;
                                }
                            } else {
                                i16 = 1;
                            }
                            int i17 = (parseInt7 / 30) * 2;
                            if (parseInt7 % 30 == 0) {
                                i17--;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            ahn.G("Ignoring malformed APV codec string: " + str, e);
                            return null;
                        }
                    }
                case 2:
                    if (split.length < 4) {
                        xr.a("Ignoring malformed AV1 codec string: ", str);
                        break;
                    } else {
                        try {
                            int parseInt9 = Integer.parseInt(split[1]);
                            int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt11 = Integer.parseInt(split[3]);
                            if (parseInt9 == 0) {
                                if (parseInt11 != 8 && parseInt11 != 10) {
                                    sn.d(parseInt11, "Unknown AV1 bit depth: ");
                                    break;
                                } else {
                                    int i18 = parseInt11 == 8 ? 1 : (m6gVar == null || !(m6gVar.d != null || (i6 = m6gVar.c) == 7 || i6 == 6)) ? 2 : 4096;
                                    switch (parseInt10) {
                                        case 0:
                                            i7 = -1;
                                            i15 = 1;
                                            break;
                                        case 1:
                                            i7 = -1;
                                            i15 = 2;
                                            break;
                                        case 2:
                                            i7 = -1;
                                            i15 = 4;
                                            break;
                                        case 3:
                                            i15 = 8;
                                            i7 = -1;
                                            break;
                                        case 4:
                                            i15 = 16;
                                            i7 = -1;
                                            break;
                                        case 5:
                                            i15 = 32;
                                            i7 = -1;
                                            break;
                                        case 6:
                                            i15 = 64;
                                            i7 = -1;
                                            break;
                                        case 7:
                                            i15 = 128;
                                            i7 = -1;
                                            break;
                                        case 8:
                                            i15 = 256;
                                            i7 = -1;
                                            break;
                                        case 9:
                                            i15 = 512;
                                            i7 = -1;
                                            break;
                                        case 10:
                                            i15 = 1024;
                                            i7 = -1;
                                            break;
                                        case 11:
                                            i15 = 2048;
                                            i7 = -1;
                                            break;
                                        case 12:
                                            i15 = 4096;
                                            i7 = -1;
                                            break;
                                        case 13:
                                            i15 = 8192;
                                            i7 = -1;
                                            break;
                                        case 14:
                                            i15 = 16384;
                                            i7 = -1;
                                            break;
                                        case 15:
                                            i15 = 32768;
                                            i7 = -1;
                                            break;
                                        case 16:
                                            i7 = -1;
                                            break;
                                        case 17:
                                            i15 = 131072;
                                            i7 = -1;
                                            break;
                                        case 18:
                                            i15 = SQLiteDatabase.OPEN_PRIVATECACHE;
                                            i7 = -1;
                                            break;
                                        case 19:
                                            i15 = 524288;
                                            i7 = -1;
                                            break;
                                        case 20:
                                            i15 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                            i7 = -1;
                                            break;
                                        case 21:
                                            i15 = 2097152;
                                            i7 = -1;
                                            break;
                                        case 22:
                                            i15 = 4194304;
                                            i7 = -1;
                                            break;
                                        case 23:
                                            i15 = 8388608;
                                            i7 = -1;
                                            break;
                                        default:
                                            i7 = -1;
                                            i15 = -1;
                                            break;
                                    }
                                    if (i15 != i7) {
                                        break;
                                    } else {
                                        sn.d(parseInt10, "Unknown AV1 level: ");
                                        break;
                                    }
                                }
                            } else {
                                sn.d(parseInt9, "Unknown AV1 profile: ");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            xr.a("Ignoring malformed AV1 codec string: ", str);
                            return null;
                        }
                    }
                    break;
                case 3:
                case 4:
                    if (split.length < 2) {
                        xr.a("Ignoring malformed AVC codec string: ", str);
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                if (split.length < 3) {
                                    ahn.F("Ignoring malformed AVC codec string: " + str);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt == 66) {
                                i8 = -1;
                                i9 = 1;
                            } else if (parseInt == 77) {
                                i8 = -1;
                                i9 = 2;
                            } else if (parseInt == 88) {
                                i8 = -1;
                                i9 = 4;
                            } else if (parseInt != 100) {
                                if (parseInt == 110) {
                                    i9 = 16;
                                } else if (parseInt == 122) {
                                    i9 = 32;
                                } else if (parseInt != 244) {
                                    i8 = -1;
                                    i9 = -1;
                                } else {
                                    i9 = 64;
                                }
                                i8 = -1;
                            } else {
                                i8 = -1;
                                i9 = 8;
                            }
                            if (i9 != i8) {
                                switch (parseInt2) {
                                    case 10:
                                        i10 = -1;
                                        i15 = 1;
                                        break;
                                    case 11:
                                        i10 = -1;
                                        i15 = 4;
                                        break;
                                    case 12:
                                        i10 = -1;
                                        i15 = 8;
                                        break;
                                    case 13:
                                        i15 = 16;
                                        i10 = -1;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i15 = 32;
                                                i10 = -1;
                                                break;
                                            case 21:
                                                i15 = 64;
                                                i10 = -1;
                                                break;
                                            case 22:
                                                i15 = 128;
                                                i10 = -1;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 30:
                                                        i15 = 256;
                                                        i10 = -1;
                                                        break;
                                                    case 31:
                                                        i15 = 512;
                                                        i10 = -1;
                                                        break;
                                                    case 32:
                                                        i15 = 1024;
                                                        i10 = -1;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 40:
                                                                i15 = 2048;
                                                                i10 = -1;
                                                                break;
                                                            case 41:
                                                                i15 = 4096;
                                                                i10 = -1;
                                                                break;
                                                            case 42:
                                                                i15 = 8192;
                                                                i10 = -1;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i15 = 16384;
                                                                        i10 = -1;
                                                                        break;
                                                                    case 51:
                                                                        i15 = 32768;
                                                                        i10 = -1;
                                                                        break;
                                                                    case 52:
                                                                        i10 = -1;
                                                                        break;
                                                                    default:
                                                                        i10 = -1;
                                                                        i15 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i15 != i10) {
                                    break;
                                } else {
                                    sn.d(parseInt2, "Unknown AVC level: ");
                                    break;
                                }
                            } else {
                                sn.d(parseInt, "Unknown AVC profile: ");
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            xr.a("Ignoring malformed AVC codec string: ", str);
                            return null;
                        }
                    }
                case 7:
                    if (split.length < 4) {
                        xr.a("Ignoring malformed IAMF codec string: ", str);
                        break;
                    } else {
                        try {
                            int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str3 = split[3];
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case 2464863:
                                    if (str3.equals("Opus")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3114792:
                                    if (str3.equals("fLaC")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3238865:
                                    if (str3.equals("ipcm")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3356560:
                                    if (str3.equals(AudioSampleEntry.TYPE3)) {
                                        c3 = 3;
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
                                    i11 = 1;
                                    break;
                                case 1:
                                    i11 = 4;
                                    break;
                                case 2:
                                    i11 = 8;
                                    break;
                                case 3:
                                    i11 = 2;
                                    break;
                                default:
                                    ahn.F("Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e2) {
                            ahn.G("Ignoring malformed primary profile in IAMF codec string: " + split[1], e2);
                            return null;
                        }
                    }
                case '\b':
                    if (split.length != 3) {
                        xr.a("Ignoring malformed MP4A codec string: ", str);
                        break;
                    } else {
                        try {
                            if ("audio/mp4a-latm".equals(io20.f(Integer.parseInt(split[1], 16)))) {
                                int parseInt13 = Integer.parseInt(split[2]);
                                int i19 = 17;
                                if (parseInt13 != 17) {
                                    if (parseInt13 != 20) {
                                        i19 = 23;
                                        if (parseInt13 != 23) {
                                            i19 = 29;
                                            if (parseInt13 != 29) {
                                                i19 = 39;
                                                if (parseInt13 != 39) {
                                                    i19 = 42;
                                                    if (parseInt13 != 42) {
                                                        switch (parseInt13) {
                                                            case 1:
                                                                i12 = -1;
                                                                i19 = 1;
                                                                break;
                                                            case 2:
                                                                i12 = -1;
                                                                i19 = 2;
                                                                break;
                                                            case 3:
                                                                i12 = -1;
                                                                i19 = 3;
                                                                break;
                                                            case 4:
                                                                i12 = -1;
                                                                i19 = 4;
                                                                break;
                                                            case 5:
                                                                i12 = -1;
                                                                i19 = 5;
                                                                break;
                                                            case 6:
                                                                i12 = -1;
                                                                i19 = 6;
                                                                break;
                                                            default:
                                                                i12 = -1;
                                                                i19 = -1;
                                                                break;
                                                        }
                                                        if (i19 == i12) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i19 = 20;
                                    }
                                }
                                i12 = -1;
                                if (i19 == i12) {
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            xr.a("Ignoring malformed MP4A codec string: ", str);
                            return null;
                        }
                    }
                    break;
                case '\t':
                    Pair<Integer, Integer> pair = new Pair<>(num3, num3);
                    if (split.length < 3) {
                        xr.a("Ignoring malformed H263 codec string: ", str);
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            xr.a("Ignoring malformed H263 codec string: ", str);
                            return pair;
                        }
                    }
                case '\n':
                    if (split.length < 3) {
                        xr.a("Ignoring malformed VP9 codec string: ", str);
                        break;
                    } else {
                        try {
                            int parseInt14 = Integer.parseInt(split[1]);
                            int parseInt15 = Integer.parseInt(split[2]);
                            int i20 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i20 != -1) {
                                if (parseInt15 == 10) {
                                    i13 = -1;
                                    i14 = 1;
                                } else if (parseInt15 == 11) {
                                    i13 = -1;
                                    i14 = 2;
                                } else if (parseInt15 == 20) {
                                    i13 = -1;
                                    i14 = 4;
                                } else if (parseInt15 != 21) {
                                    if (parseInt15 == 30) {
                                        i14 = 16;
                                    } else if (parseInt15 == 31) {
                                        i14 = 32;
                                    } else if (parseInt15 == 40) {
                                        i14 = 64;
                                    } else if (parseInt15 == 41) {
                                        i14 = 128;
                                    } else if (parseInt15 == 50) {
                                        i14 = 256;
                                    } else if (parseInt15 != 51) {
                                        switch (parseInt15) {
                                            case 60:
                                                i14 = 2048;
                                                break;
                                            case 61:
                                                i14 = 4096;
                                                break;
                                            case 62:
                                                i14 = 8192;
                                                break;
                                            default:
                                                i13 = -1;
                                                i14 = -1;
                                                break;
                                        }
                                    } else {
                                        i14 = 512;
                                    }
                                    i13 = -1;
                                } else {
                                    i13 = -1;
                                    i14 = 8;
                                }
                                if (i14 != i13) {
                                    break;
                                } else {
                                    sn.d(parseInt15, "Unknown VP9 level: ");
                                    break;
                                }
                            } else {
                                sn.d(parseInt14, "Unknown VP9 profile: ");
                                break;
                            }
                        } catch (NumberFormatException unused6) {
                            xr.a("Ignoring malformed VP9 codec string: ", str);
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            xr.a("Ignoring malformed Dolby Vision codec string: ", str);
            return null;
        }
        Matcher matcher = c.matcher(split[1]);
        if (!matcher.matches()) {
            xr.a("Ignoring malformed Dolby Vision codec string: ", str);
            return null;
        }
        String group = matcher.group(1);
        if (group == null) {
            num = 8;
        } else {
            switch (group.hashCode()) {
                case 1536:
                    num = 8;
                    if (group.equals("00")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1537:
                    if (group.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                        num = 8;
                        c4 = 1;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        num = 8;
                        c4 = 2;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        num = 8;
                        c4 = 3;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        num = 8;
                        c4 = 4;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        num = 8;
                        c4 = 5;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        num = 8;
                        c4 = 6;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        num = 8;
                        c4 = 7;
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        num = 8;
                        c4 = '\b';
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        num = 8;
                        c4 = '\t';
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        num = 8;
                        c4 = '\n';
                        break;
                    }
                    num = 8;
                    c4 = 65535;
                    break;
                default:
                    num = 8;
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
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
                xr.a("Unknown Dolby Vision profile string: ", group);
                return null;
            }
            String str4 = split[2];
            if (str4 != null) {
                switch (str4.hashCode()) {
                    case 1537:
                        if (str4.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1538:
                        if (str4.equals("02")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1539:
                        if (str4.equals("03")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1540:
                        if (str4.equals("04")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1541:
                        if (str4.equals("05")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1542:
                        if (str4.equals("06")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1543:
                        if (str4.equals("07")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1544:
                        if (str4.equals("08")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1545:
                        if (str4.equals("09")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1567:
                        if (str4.equals("10")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1568:
                        if (str4.equals("11")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1569:
                        if (str4.equals("12")) {
                            c6 = 11;
                            c5 = c6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1570:
                        if (str4.equals("13")) {
                            c6 = '\f';
                            c5 = c6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = num;
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
                    return new Pair<>(num2, num3);
                }
                xr.a("Unknown Dolby Vision level string: ", str4);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0165, code lost:
    
        if (r11.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0271  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> c(String str, String[] strArr, @Nullable m6g m6gVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            xr.a("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            xr.a("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        String group = matcher.group(1);
        char c2 = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (m6gVar == null || m6gVar.c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                xr.a("Unknown HEVC profile string: ", group);
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c2 = 25;
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
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = 8388608;
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = 1024;
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = Integer.valueOf(SQLiteDatabase.OPEN_PRIVATECACHE);
                    break;
                case 23:
                    num = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    break;
                case 24:
                    num = 4194304;
                    break;
                case 25:
                    num = Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
                    break;
            }
            if (num == null) {
                return new Pair<>(Integer.valueOf(i), num);
            }
            xr.a("Unknown HEVC level string: ", str2);
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
