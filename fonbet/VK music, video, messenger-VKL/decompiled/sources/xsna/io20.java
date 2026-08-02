package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarZone;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import com.unity3d.services.core.device.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* compiled from: MimeTypes.java */
/* loaded from: classes12.dex */
public final class io20 {
    public static final ArrayList<a> a = new ArrayList<>();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            int i = this.b;
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
        }
    }

    public static boolean a(@Nullable String str, @Nullable String str2) {
        b g;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (g = g(str2)) != null && (a2 = g.a()) != 0 && a2 != 16) {
                }
                break;
        }
        return false;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : y2r0.f0(str)) {
            String e = e(str2);
            if (e != null && l(e)) {
                return e;
            }
        }
        return null;
    }

    @Nullable
    public static String c(@Nullable String str, @Nullable String str2) {
        if (str != null && str2 != null) {
            String[] f0 = y2r0.f0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : f0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(StringUtils.COMMA);
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

    public static int d(String str, @Nullable String str2) {
        b g;
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
                return g.a();
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

    @Nullable
    public static String e(@Nullable String str) {
        b g;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String u = o19.u(str.trim());
        if (u.startsWith(VisualSampleEntry.TYPE3) || u.startsWith(VisualSampleEntry.TYPE4)) {
            return "video/avc";
        }
        if (u.startsWith(VisualSampleEntry.TYPE7) || u.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (u.startsWith("dvav") || u.startsWith("dva1") || u.startsWith("dvhe") || u.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (u.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (u.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP9) || u.startsWith("vp09")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (u.startsWith(PeerVideoSettingsBitrateTable.CODEC_VP8) || u.startsWith("vp08")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8;
        }
        if (u.startsWith(AudioSampleEntry.TYPE3)) {
            if (u.startsWith("mp4a.") && (g = g(u)) != null) {
                str2 = f(g.a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (u.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (u.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (u.startsWith(AudioSampleEntry.TYPE8) || u.startsWith(AC3SpecificBox.TYPE)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (u.startsWith(AudioSampleEntry.TYPE9) || u.startsWith(EC3SpecificBox.TYPE)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        if (u.startsWith("ec+3")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC;
        }
        if (u.startsWith("ac-4") || u.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (u.startsWith("dtsc")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
        }
        if (u.startsWith(AudioSampleEntry.TYPE13)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_EXPRESS;
        }
        if (u.startsWith(AudioSampleEntry.TYPE12) || u.startsWith(AudioSampleEntry.TYPE11)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
        }
        if (u.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (u.startsWith("opus")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
        }
        if (u.startsWith("vorbis")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (u.startsWith("flac")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
        }
        if (u.startsWith(XMLSubtitleSampleEntry.TYPE)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML;
        }
        if (u.startsWith(WebVTTSampleEntry.TYPE)) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.TEXT_VTT;
        }
        if (u.contains("cea708")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708;
        }
        if (u.contains("eia608") || u.contains("cea608")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608;
        }
        ArrayList<a> arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (u.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    @Nullable
    public static String f(int i) {
        if (i == 32) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V;
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
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case JsonToken.BOOLEAN /* 98 */:
            case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
            case 100:
            case 101:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            case INVALID_REQUEST_BUILDER_ERROR_VALUE:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    public static b g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static String h(@Nullable String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(@Nullable String str) {
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
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_ID3.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static int j(String str) {
        return i(e(str));
    }

    @Nullable
    public static String k(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : y2r0.f0(str)) {
            String e = e(str2);
            if (e != null && p(e)) {
                return e;
            }
        }
        return null;
    }

    public static boolean l(@Nullable String str) {
        return "audio".equals(h(str));
    }

    public static boolean m(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith(VisualSampleEntry.TYPE7)) || (str2.startsWith("dvh1") && str.startsWith(VisualSampleEntry.TYPE6)) || ((str2.startsWith("dvav") && str.startsWith(VisualSampleEntry.TYPE4)) || ((str2.startsWith("dva1") && str.startsWith(VisualSampleEntry.TYPE3)) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean n(@Nullable String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean o(@Nullable String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean p(@Nullable String str) {
        return "video".equals(h(str));
    }

    public static String q(String str) {
        String u;
        if (str == null) {
            return null;
        }
        u = o19.u(str);
        u.getClass();
        switch (u) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            default:
                return u;
        }
    }
}
