package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes7.dex */
public abstract class g681 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(int i) {
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

    public static String b(String str) {
        i6z0 c;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String a2 = tea1.a(str.trim());
        if (a2.startsWith("avc1") || a2.startsWith("avc3")) {
            return "video/avc";
        }
        if (a2.startsWith("hev1") || a2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (a2.startsWith("dvav") || a2.startsWith("dva1") || a2.startsWith("dvhe") || a2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (a2.startsWith("av01")) {
            return "video/av01";
        }
        if (a2.startsWith("vp9") || a2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (a2.startsWith("vp8") || a2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (a2.startsWith("mp4a")) {
            if (a2.startsWith("mp4a.") && (c = c(a2)) != null) {
                str2 = a(c.b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (a2.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (a2.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (a2.startsWith("ac-3") || a2.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (a2.startsWith("ec-3") || a2.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (a2.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (a2.startsWith("ac-4") || a2.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (a2.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (a2.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (a2.startsWith("dtsh") || a2.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (a2.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (a2.startsWith("opus")) {
            return "audio/opus";
        }
        if (a2.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (a2.startsWith("flac")) {
            return "audio/flac";
        }
        if (a2.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (a2.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (a2.contains("cea708")) {
            return "application/cea-708";
        }
        if (a2.contains("eia608") || a2.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        arrayList.get(0).getClass();
        ny61.u();
        return null;
    }

    public static i6z0 c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new i6z0(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 15);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(d(str))) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(d(str))) {
            return 2;
        }
        if (f(str)) {
            return 3;
        }
        if ("image".equals(d(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
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

    public static boolean f(String str) {
        return "text".equals(d(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }
}
