package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes10.dex */
public abstract class eh20 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        i6z0 g;
        int b2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (g = g(str2)) != null && (b2 = g.b()) != 0 && b2 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : tw21.h0(str)) {
            String e = e(str2);
            if (e != null && l(e)) {
                return e;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] h0 = tw21.h0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : h0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        i6z0 g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (g = g(str2)) == null) {
                    return 0;
                }
                return g.b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        i6z0 g;
        String str2 = null;
        if (str != null) {
            String g2 = f0b1.g(str.trim());
            if (g2.startsWith("avc1") || g2.startsWith("avc3")) {
                return "video/avc";
            }
            if (g2.startsWith("hev1") || g2.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (g2.startsWith("dvav") || g2.startsWith("dva1") || g2.startsWith("dvhe") || g2.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (g2.startsWith("av01")) {
                return "video/av01";
            }
            if (g2.startsWith("vp9") || g2.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (g2.startsWith("vp8") || g2.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (g2.startsWith("mp4a")) {
                if (g2.startsWith("mp4a.") && (g = g(g2)) != null) {
                    str2 = f(g.b);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (g2.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (g2.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (g2.startsWith("ac-3") || g2.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (g2.startsWith("ec-3") || g2.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (g2.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (g2.startsWith("ac-4") || g2.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (g2.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (g2.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (g2.startsWith("dtsh") || g2.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (g2.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (g2.startsWith("opus")) {
                return "audio/opus";
            }
            if (g2.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (g2.startsWith("flac")) {
                return "audio/flac";
            }
            if (g2.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (g2.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (g2.contains("cea708")) {
                return "application/cea-708";
            }
            if (g2.contains("eia608") || g2.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ny61.u();
                return null;
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case HProv.PP_RESERVED1 /* 96 */:
            case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
            case HProv.PP_REBOOT /* 98 */:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case HProv.PP_SET_PIN /* 107 */:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case HProv.PP_EXPORT_CSP /* 172 */:
                        return "audio/vnd.dts";
                    case MSException.ERROR_BUSY /* 170 */:
                    case HProv.PP_REFCOUNT /* 171 */:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static i6z0 g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new i6z0(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 7);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (p(str)) {
            return 2;
        }
        if (o(str)) {
            return 3;
        }
        if (n(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        ny61.u();
        return 0;
    }

    public static int j(String str) {
        return i(e(str));
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : tw21.h0(str)) {
            String e = e(str2);
            if (e != null && p(e)) {
                return e;
            }
        }
        return null;
    }

    public static boolean l(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(h(str));
    }

    public static boolean m(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean n(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean o(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean p(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(h(str));
    }

    public static String q(String str) {
        String g;
        if (str == null) {
            return null;
        }
        g = f0b1.g(str);
        g.getClass();
        switch (g) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return g;
        }
    }
}
