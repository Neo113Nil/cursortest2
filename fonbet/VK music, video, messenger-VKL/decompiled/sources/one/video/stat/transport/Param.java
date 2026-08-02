package one.video.stat.transport;

import androidx.core.app.NotificationCompat;
import com.ironsource.O6;
import com.ironsource.X3;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Param.kt */
/* loaded from: classes8.dex */
public final class Param {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Param[] $VALUES;
    public static final Param AUDIO_TRACK_LANG;
    public static final Param BACKEND_UV_ERROR_CODE;
    public static final Param BANDWIDTH_FROM_MANIFEST;
    public static final Param BUFFER_TIME;
    public static final Param CODEC_INFO;
    public static final Param CONNECTION_REUSED;
    public static final Param CONNECTION_TYPE;
    public static final Param CONTENT_TYPE;
    public static final Param DEVICE_MANUFACTURER;
    public static final Param DEVICE_MODEL;
    public static final Param DEVICE_TYPE;
    public static final Param DPI;
    public static final Param ERROR_CATEGORY;
    public static final Param ERROR_MESSAGE;
    public static final Param ERROR_SEVERITY;
    public static final Param FROM_DOWNLOADS;
    public static final Param HTTP_ERROR_CODE;
    public static final Param LIVE;
    public static final Param MODE;
    public static final Param MUTED;
    public static final Param NAVIGATION;
    public static final Param OS;
    public static final Param OS_VERSION;
    public static final Param PLAYBACK_QUALITY;
    public static final Param PLAYBACK_RATE;
    public static final Param PLAYBACK_URL;
    public static final Param PLAYER_ERROR_CODE;
    public static final Param PLAYER_ERROR_TRACE;
    public static final Param PLAYER_HEIGHT;
    public static final Param PLAYER_WIDTH;
    public static final Param RECOM_INFO;
    public static final Param SEEK_TYPE;
    public static final Param SOUND_VOLUME;
    public static final Param STATS_VERSION;
    public static final Param SUBTITLES_ENABLED;
    public static final Param SUBTITLES_TRACK_LANG;
    public static final Param TARGET_DURATION;
    public static final Param USER_QUALITY;
    public static final Param VISIBILITY;
    public static final Param WATCH_INTERVAL;
    private final String value;

    static {
        Param param = new Param("STATS_VERSION", 0, "stats_version");
        STATS_VERSION = param;
        Param param2 = new Param("OS", 1, O6.F);
        OS = param2;
        Param param3 = new Param("OS_VERSION", 2, "os_version");
        OS_VERSION = param3;
        Param param4 = new Param("DEVICE_TYPE", 3, CommonUrlParts.DEVICE_TYPE);
        DEVICE_TYPE = param4;
        Param param5 = new Param("DEVICE_MANUFACTURER", 4, "device_manufacturer");
        DEVICE_MANUFACTURER = param5;
        Param param6 = new Param("DEVICE_MODEL", 5, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL);
        DEVICE_MODEL = param6;
        Param param7 = new Param("NAVIGATION", 6, NotificationCompat.CATEGORY_NAVIGATION);
        NAVIGATION = param7;
        Param param8 = new Param("VISIBILITY", 7, "visibility");
        VISIBILITY = param8;
        Param param9 = new Param("MODE", 8, X3.a.t);
        MODE = param9;
        Param param10 = new Param("BUFFER_TIME", 9, "buffer_time");
        BUFFER_TIME = param10;
        Param param11 = new Param("PLAYBACK_URL", 10, "playback_url");
        PLAYBACK_URL = param11;
        Param param12 = new Param("CONNECTION_TYPE", 11, "connection_type");
        CONNECTION_TYPE = param12;
        Param param13 = new Param("CONNECTION_REUSED", 12, "connection_reused");
        CONNECTION_REUSED = param13;
        Param param14 = new Param("PLAYBACK_QUALITY", 13, "playback_quality");
        PLAYBACK_QUALITY = param14;
        Param param15 = new Param("USER_QUALITY", 14, "user_quality");
        USER_QUALITY = param15;
        Param param16 = new Param("PLAYER_WIDTH", 15, "player_width");
        PLAYER_WIDTH = param16;
        Param param17 = new Param("PLAYER_HEIGHT", 16, "player_height");
        PLAYER_HEIGHT = param17;
        Param param18 = new Param("MUTED", 17, "muted");
        MUTED = param18;
        Param param19 = new Param("SOUND_VOLUME", 18, "sound_volume");
        SOUND_VOLUME = param19;
        Param param20 = new Param("SUBTITLES_ENABLED", 19, "subtitles_enabled");
        SUBTITLES_ENABLED = param20;
        Param param21 = new Param("SUBTITLES_TRACK_LANG", 20, "subtitles_track_lang");
        SUBTITLES_TRACK_LANG = param21;
        Param param22 = new Param("AUDIO_TRACK_LANG", 21, "audio_track_lang");
        AUDIO_TRACK_LANG = param22;
        Param param23 = new Param("PLAYBACK_RATE", 22, "playback_rate");
        PLAYBACK_RATE = param23;
        Param param24 = new Param("WATCH_INTERVAL", 23, "watch_interval");
        WATCH_INTERVAL = param24;
        Param param25 = new Param("CONTENT_TYPE", 24, "content_type");
        CONTENT_TYPE = param25;
        Param param26 = new Param("ERROR_SEVERITY", 25, "error_severity");
        ERROR_SEVERITY = param26;
        Param param27 = new Param("ERROR_CATEGORY", 26, "error_category");
        ERROR_CATEGORY = param27;
        Param param28 = new Param("PLAYER_ERROR_CODE", 27, "player_error_code");
        PLAYER_ERROR_CODE = param28;
        Param param29 = new Param("PLAYER_ERROR_TRACE", 28, "player_error_trace");
        PLAYER_ERROR_TRACE = param29;
        Param param30 = new Param("HTTP_ERROR_CODE", 29, "http_error_code");
        HTTP_ERROR_CODE = param30;
        Param param31 = new Param("BACKEND_UV_ERROR_CODE", 30, "uv_backend_error_code_subcode");
        BACKEND_UV_ERROR_CODE = param31;
        Param param32 = new Param("ERROR_MESSAGE", 31, "error_message");
        ERROR_MESSAGE = param32;
        Param param33 = new Param("CODEC_INFO", 32, "codec_info");
        CODEC_INFO = param33;
        Param param34 = new Param("SEEK_TYPE", 33, "seek_type");
        SEEK_TYPE = param34;
        Param param35 = new Param("LIVE", 34, "live");
        LIVE = param35;
        Param param36 = new Param("DPI", 35, "dpi");
        DPI = param36;
        Param param37 = new Param("FROM_DOWNLOADS", 36, "from_downloads");
        FROM_DOWNLOADS = param37;
        Param param38 = new Param("TARGET_DURATION", 37, "target_duration");
        TARGET_DURATION = param38;
        Param param39 = new Param("BANDWIDTH_FROM_MANIFEST", 38, "bandwidth_from_manifest");
        BANDWIDTH_FROM_MANIFEST = param39;
        Param param40 = new Param("RECOM_INFO", 39, "recom_info");
        RECOM_INFO = param40;
        Param[] paramArr = {param, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28, param29, param30, param31, param32, param33, param34, param35, param36, param37, param38, param39, param40};
        $VALUES = paramArr;
        $ENTRIES = new asp(paramArr);
    }

    public Param(String str, int i, String str2) {
        this.value = str2;
    }

    public static Param valueOf(String str) {
        return (Param) Enum.valueOf(Param.class, str);
    }

    public static Param[] values() {
        return (Param[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
