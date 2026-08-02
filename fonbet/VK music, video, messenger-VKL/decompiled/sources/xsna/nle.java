package xsna;

import android.util.Log;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenChallenge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudio;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsMusicCatalogAnalyticsHelper.kt */
/* loaded from: classes16.dex */
public class nle {

    /* compiled from: ClipsMusicCatalogAnalyticsHelper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(AudioFromMusicCatalogInfo audioFromMusicCatalogInfo, MusicTrack musicTrack, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.EventType eventType) {
        UserId userId;
        String str;
        UiTracker uiTracker = UiTracker.a;
        new ole(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem(eventType, new MobileOfficialAppsClipsStat$ClipsCreateContext(-1, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER), audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.b : null, (audioFromMusicCatalogInfo == null || (str = audioFromMusicCatalogInfo.f) == null) ? null : Collections.singletonList(str), musicTrack != null ? Integer.valueOf(musicTrack.b) : null, (musicTrack == null || (userId = musicTrack.c) == null) ? null : Long.valueOf(userId.b), audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.c : null, audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.d : null), 3)).q();
    }

    public boolean b(cfp0 cfp0Var) {
        UIBlockActionPlayAudio uIBlockActionPlayAudio;
        UIBlockActionOpenChallenge uIBlockActionOpenChallenge;
        Object obj = cfp0Var.b;
        UIBlock uIBlock = cfp0Var.a;
        if (uIBlock instanceof UIBlockLink) {
            MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
            MusicAnalyticsInfo.ClickTarget clickTarget = musicAnalyticsInfo != null ? musicAnalyticsInfo.a : null;
            if ((clickTarget != null ? b.$EnumSwitchMapping$0[clickTarget.ordinal()] : -1) == 1) {
                String str = (String) j5g.k0(drm0.b0(((UIBlockLink) uIBlock).y.e, new char[]{'/'}, 0, 6));
                if (str != null) {
                    List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                    String str2 = (String) j5g.b0(0, c0);
                    Long n = str2 != null ? arm0.n(str2) : null;
                    String str3 = (String) j5g.b0(1, c0);
                    Integer m = str3 != null ? arm0.m(10, str3) : null;
                    AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = (n == null || m == null) ? null : new AudioFromMusicCatalogInfo(null, Integer.valueOf(m.intValue()), Long.valueOf(n.longValue()), false, null, 25, null);
                    if (audioFromMusicCatalogInfo != null) {
                        a(audioFromMusicCatalogInfo, null, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.EventType.PLAYLIST_OPEN);
                        return true;
                    }
                    Log.e("ClipsMusicCatalogAnalyticsHelper", "Incorrect category url");
                    return true;
                }
                return true;
            }
            return false;
        }
        if (uIBlock instanceof UIBlockPlaceholder) {
            MusicAnalyticsInfo musicAnalyticsInfo2 = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
            MusicAnalyticsInfo.ClickTarget clickTarget2 = musicAnalyticsInfo2 != null ? musicAnalyticsInfo2.a : null;
            int i = clickTarget2 != null ? b.$EnumSwitchMapping$0[clickTarget2.ordinal()] : -1;
            if (i == 1 || i == 2) {
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
                Iterator<T> it = uIBlockPlaceholder.G.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uIBlockActionPlayAudio = null;
                        break;
                    }
                    UIBlockAction uIBlockAction = (UIBlockAction) it.next();
                    uIBlockActionPlayAudio = uIBlockAction instanceof UIBlockActionPlayAudio ? (UIBlockActionPlayAudio) uIBlockAction : null;
                    if (uIBlockActionPlayAudio != null) {
                        break;
                    }
                }
                MusicTrack musicTrack = uIBlockActionPlayAudio != null ? uIBlockActionPlayAudio.z : null;
                if (musicTrack == null) {
                    Log.e("ClipsMusicCatalogAnalyticsHelper", "Promo banner has no track");
                    return true;
                }
                Iterator<T> it2 = uIBlockPlaceholder.G.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        uIBlockActionOpenChallenge = null;
                        break;
                    }
                    UIBlockAction uIBlockAction2 = (UIBlockAction) it2.next();
                    uIBlockActionOpenChallenge = uIBlockAction2 instanceof UIBlockActionOpenChallenge ? (UIBlockActionOpenChallenge) uIBlockAction2 : null;
                    if (uIBlockActionOpenChallenge != null) {
                        break;
                    }
                }
                AudioFromMusicCatalogInfo audioFromMusicCatalogInfo2 = new AudioFromMusicCatalogInfo(Integer.valueOf(Integer.parseInt(uIBlockPlaceholder.z)), null, null, false, uIBlockActionOpenChallenge != null ? uIBlockActionOpenChallenge.z : null, 14, null);
                int i2 = b.$EnumSwitchMapping$0[clickTarget2.ordinal()];
                if (i2 == 1) {
                    a(audioFromMusicCatalogInfo2, musicTrack, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.EventType.BANNER_OPEN);
                    return true;
                }
                if (i2 == 2) {
                    a(audioFromMusicCatalogInfo2, musicTrack, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.EventType.BANNER_PLAY);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public void c() {
        a(null, null, MobileOfficialAppsClipsStat$TypeClipMusicCatalogItem.EventType.IMPORT_AUDIO_FROM_GALLERY);
    }

    /* compiled from: ClipsMusicCatalogAnalyticsHelper.kt */
    public static final class a extends nle {
        @Override // xsna.nle
        public final boolean b(cfp0 cfp0Var) {
            return false;
        }

        @Override // xsna.nle
        public final void c() {
        }
    }
}
