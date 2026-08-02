package xsna;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClickPreferenceItem;

/* compiled from: PreferencesTracker.kt */
/* loaded from: classes5.dex */
public final class czc0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void b(Preference preference, Object obj) {
        SchemeStat$TypeClickPreferenceItem.Type type;
        SchemeStat$TypeClickPreferenceItem.Type type2;
        SchemeStat$TypeClickPreferenceItem schemeStat$TypeClickPreferenceItem;
        String str = preference.n;
        switch (str.hashCode()) {
            case -2024859263:
                if (str.equals("trackInstalledApps")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.TRACK_INSTALLED_APPS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -1968238014:
                if (str.equals("isRoamingState")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.SAVE_TRAFFIC;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -1808850238:
                if (str.equals("resetContacts")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.RESET_CONTACTS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -1304916919:
                if (str.equals("clearMessagesCache")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.CLEAR_MESSAGES_CACHE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -1097462182:
                if (str.equals("locale")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.CHOOSE_APP_LOCALE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -960983984:
                if (str.equals("useChromeCustomTabs")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.IN_APP_BROWSER;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -759238347:
                if (str.equals("clearCache")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.CLEAR_CACHE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -129475055:
                if (str.equals("app_biometrics_lock")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.APP_BIOMETRICS_LOCK;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case -85291895:
                if (str.equals("doubleTapPostLike")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.DOUBLE_TAP_LIKE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 4192302:
                if (str.equals("downloadAudio")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.DOWNLOAD_AUDIO;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 48818201:
                if (str.equals("sendByEnter")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.SEND_BY_ENTER;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 83039246:
                if (str.equals("syncContacts")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.SYNC_CONTACTS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 365601008:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.CHOOSE_FONT_SIZE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 752611193:
                if (str.equals("clearAudioCache")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.CLEAR_AUDIO_CACHE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 878902666:
                if (str.equals("saveProcessedImage")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.SAVE_EDITED_PHOTOS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1191144930:
                if (str.equals("mytrackerLocationCrapEnabled")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.TRACK_LOCATION_DATA;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1206768458:
                if (str.equals("useProxyServer")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.USE_PROXY_SERVER;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1261173474:
                if (str.equals("prefetchAudioMsg")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.PREFETCH_AUDIO_MESSAGES;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1288327983:
                if (str.equals("enableAudioCache")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.ENABLE_AUDIO_CACHE;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1561858337:
                if (str.equals("audioCacheLocation")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.AUDIO_CACHE_LOCATION;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1879870322:
                if (str.equals("video_background")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.BACKGROUND_PLAY_VIDEOS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 1912589955:
                if (str.equals("compressPhotos")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.COMPRESS_PHOTOS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 2084946266:
                if (str.equals("compressVideos")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.COMPRESS_VIDEOS;
                    type = type2;
                    break;
                }
                type = null;
                break;
            case 2111198279:
                if (str.equals("showMusicSuggestNotification")) {
                    type2 = SchemeStat$TypeClickPreferenceItem.Type.SHOW_MUSIC_SUGGEST_NOTIFICATION;
                    type = type2;
                    break;
                }
                type = null;
                break;
            default:
                type = null;
                break;
        }
        if (type != null) {
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            if (preference instanceof ListPreference) {
                schemeStat$TypeClickPreferenceItem = new SchemeStat$TypeClickPreferenceItem(type, obj != null ? Integer.valueOf(((ListPreference) preference).O((String) obj)) : null, null, 4, null);
            } else {
                schemeStat$TypeClickPreferenceItem = preference instanceof TwoStatePreference ? new SchemeStat$TypeClickPreferenceItem(type, null, (Boolean) obj, 2, null) : new SchemeStat$TypeClickPreferenceItem(type, null, null, 6, null);
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, schemeStat$TypeClickPreferenceItem, 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }

    public final void a(Preference preference) {
        if (!(preference instanceof PreferenceGroup)) {
            if ((preference instanceof ListPreference) || (preference instanceof TwoStatePreference)) {
                preference.f = new bzc0(preference.f, this, preference);
                return;
            } else {
                preference.g = new k5g(preference.g, this, preference);
                return;
            }
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
        int size = preferenceGroup.S.size();
        for (int i = 0; i < size; i++) {
            a(preferenceGroup.Q(i));
        }
    }
}
