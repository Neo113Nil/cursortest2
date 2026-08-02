package yads;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* loaded from: classes10.dex */
public abstract class iu1 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        hu1 b2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (b2 = b(str2)) != null) {
                    int i = b2.b;
                    char c = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                    if (c == 0 || c == 16) {
                    }
                }
                break;
        }
        return false;
    }

    public static int b(String str, String str2) {
        hu1 b2;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (b2 = b(str2)) == null) {
                    return 0;
                }
                int i = b2.b;
                if (i == 2) {
                    return 10;
                }
                if (i == 5) {
                    return 11;
                }
                if (i == 29) {
                    return 12;
                }
                if (i == 42) {
                    return 16;
                }
                if (i != 22) {
                    return i != 23 ? 0 : 15;
                }
                return 1073741824;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(c(str))) {
            return 1;
        }
        if ("video".equals(c(str))) {
            return 2;
        }
        if (e(str)) {
            return 3;
        }
        if ("image".equals(c(str))) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        a2.a(arrayList.get(0));
        throw null;
    }

    public static boolean e(String str) {
        return "text".equals(c(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean f(String str) {
        return "video".equals(c(str));
    }

    public static String a(String str) {
        hu1 b2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String a2 = ki.a(str.trim());
        if (!a2.startsWith(VisualSampleEntry.TYPE3) && !a2.startsWith(VisualSampleEntry.TYPE4)) {
            if (!a2.startsWith(VisualSampleEntry.TYPE7) && !a2.startsWith(VisualSampleEntry.TYPE6)) {
                if (!a2.startsWith("dvav") && !a2.startsWith("dva1") && !a2.startsWith("dvhe") && !a2.startsWith("dvh1")) {
                    if (a2.startsWith("av01")) {
                        return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                    }
                    if (!a2.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP9) && !a2.startsWith("vp09")) {
                        if (!a2.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP8) && !a2.startsWith("vp08")) {
                            if (a2.startsWith(AudioSampleEntry.TYPE3)) {
                                if (a2.startsWith("mp4a.") && (b2 = b(a2)) != null) {
                                    str2 = a(b2.a);
                                }
                                return str2 == null ? "audio/mp4a-latm" : str2;
                            }
                            if (a2.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (a2.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!a2.startsWith(AudioSampleEntry.TYPE8) && !a2.startsWith(AC3SpecificBox.TYPE)) {
                                if (!a2.startsWith(AudioSampleEntry.TYPE9) && !a2.startsWith(EC3SpecificBox.TYPE)) {
                                    if (a2.startsWith("ec+3")) {
                                        return MimeTypes.AUDIO_E_AC3_JOC;
                                    }
                                    if (!a2.startsWith("ac-4") && !a2.startsWith("dac4")) {
                                        if (a2.startsWith("dtsc")) {
                                            return MimeTypes.AUDIO_DTS;
                                        }
                                        if (a2.startsWith(AudioSampleEntry.TYPE13)) {
                                            return MimeTypes.AUDIO_DTS_EXPRESS;
                                        }
                                        if (!a2.startsWith(AudioSampleEntry.TYPE12) && !a2.startsWith(AudioSampleEntry.TYPE11)) {
                                            if (a2.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (a2.startsWith("opus")) {
                                                return MimeTypes.AUDIO_OPUS;
                                            }
                                            if (a2.startsWith("vorbis")) {
                                                return MimeTypes.AUDIO_VORBIS;
                                            }
                                            if (a2.startsWith("flac")) {
                                                return MimeTypes.AUDIO_FLAC;
                                            }
                                            if (a2.startsWith(XMLSubtitleSampleEntry.TYPE)) {
                                                return MimeTypes.APPLICATION_TTML;
                                            }
                                            if (a2.startsWith(WebVTTSampleEntry.TYPE)) {
                                                return MimeTypes.TEXT_VTT;
                                            }
                                            if (a2.contains("cea708")) {
                                                return MimeTypes.APPLICATION_CEA708;
                                            }
                                            if (!a2.contains("eia608") && !a2.contains("cea608")) {
                                                ArrayList arrayList = a;
                                                if (arrayList.size() <= 0) {
                                                    return null;
                                                }
                                                a2.a(arrayList.get(0));
                                                throw null;
                                            }
                                            return MimeTypes.APPLICATION_CEA608;
                                        }
                                        return MimeTypes.AUDIO_DTS_HD;
                                    }
                                    return "audio/ac4";
                                }
                                return MimeTypes.AUDIO_E_AC3;
                            }
                            return MimeTypes.AUDIO_AC3;
                        }
                        return MimeTypes.VIDEO_VP8;
                    }
                    return MimeTypes.VIDEO_VP9;
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static hu1 b(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new hu1(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String a(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
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
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i != 166) {
            switch (i) {
                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                case 97:
                case JsonToken.BOOLEAN /* 98 */:
                case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                case 100:
                case 101:
                    return MimeTypes.VIDEO_MPEG2;
                case 102:
                case 103:
                case 104:
                    return "audio/mp4a-latm";
                case 105:
                case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                    return MimeTypes.AUDIO_MPEG;
                case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                    return MimeTypes.VIDEO_MPEG;
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return MimeTypes.AUDIO_DTS;
                        case 170:
                        case 171:
                            return MimeTypes.AUDIO_DTS_HD;
                        case 173:
                            return MimeTypes.AUDIO_OPUS;
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }
}
