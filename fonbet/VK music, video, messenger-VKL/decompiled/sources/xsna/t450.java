package xsna;

import com.vk.stat.scheme.CommonAudioStat$TypeMusicSubscriptionItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: MusicParamsValues.kt */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface t450 {
    public static final a b = a.a;

    /* compiled from: MusicParamsValues.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final List<String> b = e43.l("no_subscription", "mini_app", "miniapp", "banner", "audiobook", "geo", "download", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "link", "stickers", "user_profile", "my_music", "audio_kids", "track_menu", "music_promo_mobile", "music_mm_promo_mobile", "kids_subscription");

        public static List a() {
            return b;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
        
            if (r1.equals(io.appmetrica.analytics.impl.L2.g) == false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
        
            return com.vk.stat.scheme.CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.BACKGROUND;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00ee, code lost:
        
            if (r1.equals("background_v2") == false) goto L95;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint b(String str) {
            switch (str.hashCode()) {
                case -1893603539:
                    break;
                case -1396342996:
                    if (str.equals("banner")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.BANNER;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case -1359492551:
                    if (str.equals("mini_app")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.MINI_APP;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case -1332194002:
                    break;
                case -1080973908:
                    if (str.equals("music_promo_mobile")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.MAIN_BANNER;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case -469406254:
                    if (str.equals("my_music")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.MY_MUSIC;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 96432:
                    if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.ADS;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 3321850:
                    if (str.equals("link")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.LINK;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 3452698:
                    if (str.equals("push")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.PUSH;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 188611519:
                    if (str.equals("audiobook")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.AUDIOBOOK;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 577230555:
                    if (str.equals("no_subscription")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NO_SUBSCRIPTION;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 664648013:
                    if (str.equals("audio_download_library")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.AUDIO_DOWNLOAD_LIBRARY;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 967581687:
                    if (str.equals("music_mm_promo_mobile")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.MM_BANNER;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1159721939:
                    if (str.equals("track_menu")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.TRACK_MENU;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1216225589:
                    if (str.equals("user_profile")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.PROFILE;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1427818632:
                    if (str.equals("download")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.DOWNLOAD;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1434631203:
                    if (str.equals("settings")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.SETTINGS;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1549094198:
                    if (str.equals("audio_kids")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.AUDIO_KIDS;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                case 1663082927:
                    if (str.equals("kids_subscription")) {
                        return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.KIDS_SUBSCRIPTION;
                    }
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
                default:
                    return CommonAudioStat$TypeMusicSubscriptionItem.EntryPoint.NONE;
            }
        }
    }
}
