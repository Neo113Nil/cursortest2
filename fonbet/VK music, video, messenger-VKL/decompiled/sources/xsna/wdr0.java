package xsna;

import android.content.Intent;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerMode;
import com.vk.music.playlist.PlaylistCarouselItemStyle;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainEventEntity;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainTapEvent;
import com.vk.stat.scheme.CommonAudioStat$TypeAdditionalSettingEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDislikeItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioLongtapItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioLyricsItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioMixOptionsItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioOnboardingItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPopupItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioRestrictionPopup;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSnippetItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapEqualizerEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapGotoEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapPlayEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapSettingsEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapShowEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapStopEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapTimerEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTrackMenuUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudiobookActItem;
import com.vk.stat.scheme.CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem;
import com.vk.stat.scheme.CommonAudioStat$TypeLanguageSettingEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeRadioStationItem;
import com.vk.stat.scheme.CommonAudioStat$TypeRecognitionSettingEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeVibeSettingEnum;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCorePushesStat$TypePushEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeAudioOfflineItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.gzp0;
import xsna.hzp0;
import xsna.k840;

/* compiled from: VKMusicStatsTracker.kt */
/* loaded from: classes3.dex */
public final class wdr0 implements u750 {
    public final md40 b;
    public final izs<String, b.d> c;
    public String d;

    /* compiled from: VKMusicStatsTracker.kt */
    public static final class a {
        public static void a(b.d dVar, boolean z) {
            bn40.b("MusicStats", "[VK_TRACKER]", dVar);
            if (z) {
                dVar.h();
            } else {
                dVar.e();
            }
        }
    }

    /* compiled from: VKMusicStatsTracker.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaylistCarouselItemStyle.values().length];
            try {
                iArr2[PlaylistCarouselItemStyle.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlaylistCarouselItemStyle.EXTENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.values().length];
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_GOTO_MINI_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_GOTO_MINI_PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_MINI_PLAYER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_MINI_PLAYER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_MINI_PLAYER.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_DELETE_MY_MUSIC_MINI_PLAYER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_MINI_PLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CLOSE_MINI_PLAYER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_MENU_MINI_PLAYER.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_NEXT_MINI_PLAYER.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.SWIPE_PREV_MINI_PLAYER.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_LOCK_SCREEN.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_NOTICE_BLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_SCREEN_WIDGET.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_LOCK_SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_NOTICE_BLOCK.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_SCREEN_WIDGET.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_LOCK_SCREEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_NOTICE_BLOCK.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_SCREEN_WIDGET.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_LOCK_SCREEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_NOTICE_BLOCK.ordinal()] = 22;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_SCREEN_WIDGET.ordinal()] = 23;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_LOCK_SCREEN.ordinal()] = 24;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_NOTICE_BLOCK.ordinal()] = 25;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_SCREEN_WIDGET.ordinal()] = 26;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_LOCK_SCREEN.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_NOTICE_BLOCK.ordinal()] = 28;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_SCREEN_WIDGET.ordinal()] = 29;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_LOCK_SCREEN.ordinal()] = 30;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_NOTICE_BLOCK.ordinal()] = 31;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_LOCK_SCREEN.ordinal()] = 32;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_NOTICE_BLOCK.ordinal()] = 33;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMELINE_LOCK_SCREEN.ordinal()] = 34;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMELINE_NOTICE_BLOCK.ordinal()] = 35;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ALL_SCREEN_WIDGET.ordinal()] = 36;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_ONE_SCREEN_WIDGET.ordinal()] = 37;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_REPEAT_OFF_SCREEN_WIDGET.ordinal()] = 38;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_TO_PLAYLIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlayerMode.values().length];
            try {
                iArr4[PlayerMode.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[PlayerMode.ADVERTISEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wdr0(md40 md40Var, izs<? super String, ? extends b.d> izsVar) {
        this.b = md40Var;
        this.c = izsVar;
    }

    public static CommonAudioStat$TypeAudioLongtapItem a1(CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem, en40 en40Var) {
        return CommonAudioStat$TypeAudioLongtapItem.a(commonAudioStat$TypeAudioLongtapItem, en40Var.a, en40Var.b, en40Var.c, en40Var.d, en40Var.e, en40Var.f);
    }

    public static CommonAudioStat$TypeAudioSnippetItem b1(CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem, c650 c650Var, boolean z) {
        MusicTrack musicTrack = c650Var.a;
        String str = z ? c650Var.b : musicTrack.y;
        Integer num = c650Var.e;
        int i = musicTrack.b;
        long j = musicTrack.c.b;
        Integer b2 = v11.b(1, c650Var.c);
        Integer b3 = v11.b(1, c650Var.d);
        Integer num2 = c650Var.g;
        return CommonAudioStat$TypeAudioSnippetItem.a(commonAudioStat$TypeAudioSnippetItem, num, str, Integer.valueOf(i), Long.valueOf(j), b3, num2, num2, b2);
    }

    public static CommonAudioStat$TypeAudioOnboardingItem.Scenario c1(String str) {
        return epx.f(str, AudioOnboardingScenarioType.CA1.h()) ? CommonAudioStat$TypeAudioOnboardingItem.Scenario.CA1 : epx.f(str, AudioOnboardingScenarioType.CA2.h()) ? CommonAudioStat$TypeAudioOnboardingItem.Scenario.CA2 : epx.f(str, AudioOnboardingScenarioType.CA3.h()) ? CommonAudioStat$TypeAudioOnboardingItem.Scenario.CA3 : epx.f(str, AudioOnboardingScenarioType.CA4.h()) ? CommonAudioStat$TypeAudioOnboardingItem.Scenario.CA4 : CommonAudioStat$TypeAudioOnboardingItem.Scenario.CA4;
    }

    public static void e1(wdr0 wdr0Var, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType eventType, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype eventSubtype, iab0 iab0Var, Boolean bool, String str, int i) {
        CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.Style style;
        Boolean bool2 = (i & 8) != 0 ? null : bool;
        String str2 = (i & 16) != 0 ? null : str;
        int i2 = b.$EnumSwitchMapping$1[iab0Var.a.ordinal()];
        if (i2 == 1) {
            style = CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.Style.COMPACT;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            style = CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.Style.EXTENDED;
        }
        CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem = new CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem(eventType, eventSubtype, style, bool2, iab0Var.b ? CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.Type.RECOMMENDED_PLAYLIST_OFFICIAL : CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.Type.RECOMMENDED_PLAYLIST, iab0Var.c, null, str2, iab0Var.d, 64, null);
        UiTracker uiTracker = UiTracker.a;
        new v050(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeFeedBlockRecommendedPlaylistsItem, 3)).q();
    }

    public static CommonAudioStat$TypeAudioDomainEventItem f1(PlayerMode playerMode) {
        int i = b.$EnumSwitchMapping$3[playerMode.ordinal()];
        if (i == 1) {
            return new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.AUDIO, "")), null, 382, null);
        }
        if (i != 2) {
            return null;
        }
        return new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.ADVERTISEMENT, "")), null, 382, null);
    }

    @Override // xsna.u750
    public final void A(en40 en40Var, int i, int i2) {
        CommonAudioStat$TypeAudioLongtapItem a1 = a1(new CommonAudioStat$TypeAudioLongtapItem(CommonAudioStat$TypeAudioLongtapItem.EventCategory.ACTION, CommonAudioStat$TypeAudioLongtapItem.EventType.ADDED, CommonAudioStat$TypeAudioLongtapItem.EventSubtype.ADD_LONGTAP, Integer.valueOf(i), Integer.valueOf(i2), null, null, null, null, null, null, null, 4064, null), en40Var);
        UiTracker uiTracker = UiTracker.a;
        new b650(UiTracker.c(), a1).q();
    }

    @Override // xsna.u750
    public final void A0(String str) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.CLOSE, c1(str), System.currentTimeMillis(), null, null, 24, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    @Override // xsna.u750
    public final void B() {
        CommonAudioStat$TypeAudioLongtapItem commonAudioStat$TypeAudioLongtapItem = new CommonAudioStat$TypeAudioLongtapItem(CommonAudioStat$TypeAudioLongtapItem.EventCategory.VIEW, CommonAudioStat$TypeAudioLongtapItem.EventType.HINT, CommonAudioStat$TypeAudioLongtapItem.EventSubtype.HINT_LONGTAP, null, null, null, null, null, null, null, null, null, 4088, null);
        UiTracker uiTracker = UiTracker.a;
        new b650(UiTracker.c(), commonAudioStat$TypeAudioLongtapItem).q();
    }

    @Override // xsna.u750
    public final void B0(boolean z) {
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new CommonAudioStat$TypeAudioTapEqualizerEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, null, 510, null), z ? CommonAudioStat$TypeAudioTapEqualizerEventItem.Type.ON : CommonAudioStat$TypeAudioTapEqualizerEventItem.Type.OFF), 3);
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), b2).q();
    }

    @Override // xsna.u750
    public final void C(String str) {
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = new SchemeStat$TypeAudioOfflineItem(SchemeStat$TypeAudioOfflineItem.EventType.REMOVE, str, SchemeStat$TypeAudioOfflineItem.Type.AUDIO);
        UiTracker uiTracker = UiTracker.a;
        new jt70(schemeStat$TypeAudioOfflineItem, UiTracker.c()).q();
    }

    @Override // xsna.u750
    public final void D0() {
        new hzp0.c(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MUSIC, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioPopupItem(new CommonStat$TypeCommonEventItem(null, null, null, null, 15, null), CommonAudioStat$TypeAudioPopupItem.EventType.VPN)).a();
    }

    @Override // xsna.u750
    public final void E(String str, String str2, t750 t750Var) {
        b.d invoke = this.c.invoke("music_subscription_show");
        invoke.b(str, "popup");
        invoke.b(str2, "source");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void F(String str) {
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = new SchemeStat$TypeAudioOfflineItem(SchemeStat$TypeAudioOfflineItem.EventType.REMOVE, str, SchemeStat$TypeAudioOfflineItem.Type.PLAYLIST);
        UiTracker uiTracker = UiTracker.a;
        new jt70(schemeStat$TypeAudioOfflineItem, UiTracker.c()).q();
    }

    @Override // xsna.u750
    public final void F0(int i, UserId userId) {
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem = new CommonAudioStat$TypeAudioLyricsItem(new CommonStat$TypeCommonEventItem(Long.valueOf(i), Long.valueOf(userId.b), null, null, 12, null), CommonAudioStat$TypeAudioLyricsItem.EventType.HIDE_LYRICS);
        UiTracker uiTracker = UiTracker.a;
        new in40(UiTracker.c(), commonAudioStat$TypeAudioLyricsItem).q();
    }

    @Override // xsna.u750
    public final void G(String str, String str2, String str3) {
        b.d invoke = this.c.invoke("rec_artist_click");
        invoke.b(str, "id");
        invoke.b(str3, "refer");
        invoke.b(str2, "track_code");
        a.a(invoke, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a A[SYNTHETIC] */
    @Override // xsna.u750
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(String str, Long l, MixSettingsEntity mixSettingsEntity) {
        Object obj;
        Enum valueOf;
        CommonAudioStat$TypeAdditionalSettingEnum commonAudioStat$TypeAdditionalSettingEnum;
        Enum valueOf2;
        CommonAudioStat$TypeRecognitionSettingEnum commonAudioStat$TypeRecognitionSettingEnum;
        Enum valueOf3;
        CommonAudioStat$TypeLanguageSettingEnum commonAudioStat$TypeLanguageSettingEnum;
        Enum valueOf4;
        CommonAudioStat$TypeVibeSettingEnum commonAudioStat$TypeVibeSettingEnum;
        List<MixCategoryEntity> list = mixSettingsEntity != null ? mixSettingsEntity.e : null;
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((MixCategoryEntity) it.next()).e, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((MixOptionEntity) next).f) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((MixOptionEntity) it3.next()).b);
        }
        List<String> O0 = j5g.O0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (String str2 : O0) {
            if (str2 != null) {
                try {
                    valueOf4 = Enum.valueOf(CommonAudioStat$TypeVibeSettingEnum.class, str2.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
                commonAudioStat$TypeVibeSettingEnum = (CommonAudioStat$TypeVibeSettingEnum) valueOf4;
                if (commonAudioStat$TypeVibeSettingEnum == null) {
                    arrayList4.add(commonAudioStat$TypeVibeSettingEnum);
                }
            }
            valueOf4 = null;
            commonAudioStat$TypeVibeSettingEnum = (CommonAudioStat$TypeVibeSettingEnum) valueOf4;
            if (commonAudioStat$TypeVibeSettingEnum == null) {
            }
        }
        ArrayList arrayList5 = !arrayList4.isEmpty() ? arrayList4 : null;
        ArrayList arrayList6 = new ArrayList();
        for (String str3 : O0) {
            if (str3 != null) {
                try {
                    valueOf3 = Enum.valueOf(CommonAudioStat$TypeLanguageSettingEnum.class, str3.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused2) {
                }
                commonAudioStat$TypeLanguageSettingEnum = (CommonAudioStat$TypeLanguageSettingEnum) valueOf3;
                if (commonAudioStat$TypeLanguageSettingEnum == null) {
                    arrayList6.add(commonAudioStat$TypeLanguageSettingEnum);
                }
            }
            valueOf3 = null;
            commonAudioStat$TypeLanguageSettingEnum = (CommonAudioStat$TypeLanguageSettingEnum) valueOf3;
            if (commonAudioStat$TypeLanguageSettingEnum == null) {
            }
        }
        ArrayList arrayList7 = !arrayList6.isEmpty() ? arrayList6 : null;
        ArrayList arrayList8 = new ArrayList();
        for (String str4 : O0) {
            if (str4 != null) {
                try {
                    valueOf2 = Enum.valueOf(CommonAudioStat$TypeRecognitionSettingEnum.class, str4.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused3) {
                }
                commonAudioStat$TypeRecognitionSettingEnum = (CommonAudioStat$TypeRecognitionSettingEnum) valueOf2;
                if (commonAudioStat$TypeRecognitionSettingEnum == null) {
                    arrayList8.add(commonAudioStat$TypeRecognitionSettingEnum);
                }
            }
            valueOf2 = null;
            commonAudioStat$TypeRecognitionSettingEnum = (CommonAudioStat$TypeRecognitionSettingEnum) valueOf2;
            if (commonAudioStat$TypeRecognitionSettingEnum == null) {
            }
        }
        ArrayList arrayList9 = !arrayList8.isEmpty() ? arrayList8 : null;
        ArrayList arrayList10 = new ArrayList();
        for (String str5 : O0) {
            if (str5 != null) {
                try {
                    valueOf = Enum.valueOf(CommonAudioStat$TypeAdditionalSettingEnum.class, str5.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused4) {
                }
                commonAudioStat$TypeAdditionalSettingEnum = (CommonAudioStat$TypeAdditionalSettingEnum) valueOf;
                if (commonAudioStat$TypeAdditionalSettingEnum == null) {
                    arrayList10.add(commonAudioStat$TypeAdditionalSettingEnum);
                }
            }
            valueOf = null;
            commonAudioStat$TypeAdditionalSettingEnum = (CommonAudioStat$TypeAdditionalSettingEnum) valueOf;
            if (commonAudioStat$TypeAdditionalSettingEnum == null) {
            }
        }
        ArrayList arrayList11 = !arrayList10.isEmpty() ? arrayList10 : null;
        Object obj2 = CommonAudioStat$TypeAudioMixOptionsItem.MixType.COMMON;
        try {
            obj = Enum.valueOf(CommonAudioStat$TypeAudioMixOptionsItem.MixType.class, str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused5) {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem = new CommonAudioStat$TypeAudioMixOptionsItem((CommonAudioStat$TypeAudioMixOptionsItem.MixType) obj2, arrayList5, arrayList7, arrayList9, arrayList11, Long.valueOf(TimeUnit.MILLISECONDS.toMicros(qni0.a())), l);
        UiTracker uiTracker = UiTracker.a;
        new te50(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeAudioMixOptionsItem, 3)).q();
    }

    @Override // xsna.u750
    public final void H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action action, String str) {
        MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem = new MobileOfficialAppsCorePushesStat$TypePushEventItem(action, "vkmusic_headphones", "", x260.b(com.vk.core.utils.newtork.b.c()), null, str, 16, null);
        UiTracker uiTracker = UiTracker.a;
        new dl40(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsCorePushesStat$TypePushEventItem, 3)).q();
    }

    @Override // xsna.u750
    public final void H0(CommonAudioStat$TypeAudioModal.ModalId modalId) {
        if (MusicFeatures.AUDIO_RESTRICTION_ANALYTICS.h()) {
            md40 md40Var = this.b;
            new hzp0.e0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MUSIC, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioModal(modalId, k840.a.i.b(), md40Var != null ? md40Var.V() : null)).a();
        }
    }

    @Override // xsna.u750
    public final void I(String str, String str2, String str3, String str4) {
        b.d invoke = this.c.invoke("rec_audio_click");
        invoke.b(str, "audio_id");
        invoke.b(str2, "owner_id");
        invoke.b(str4, "refer");
        invoke.b(str3, "track_code");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void I0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.PLAY, CommonAudioStat$TypeAudioSnippetItem.EventType.PAUSE, eventSubtype, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void J0(iab0 iab0Var) {
        e1(this, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType.CLICK, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.SHOW_ALL, iab0Var, null, null, 24);
    }

    @Override // xsna.u750
    public final void K(int i) {
        if (MusicFeatures.AUDIO_RESTRICTION_ANALYTICS.h()) {
            md40 md40Var = this.b;
            new hzp0.f0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MUSIC, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioRestrictionPopup(i, k840.a.i.b(), md40Var != null ? md40Var.V() : null)).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u750
    public final void K0(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        long a2 = qni0.a();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonAudioStat$TypeAudioTapEqualizerEventItem(new CommonAudioStat$TypeAudioDomainEventItem(a2, null, null, null, null, null, null, null, commonAudioStat$TypeAudioSourceEnum, 254, null), null, 2, 0 == true ? 1 : 0), 2);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), b2).q();
    }

    @Override // xsna.u750
    public final void L(hg40 hg40Var, boolean z) {
        CommonAudioStat$TypeAudioDislikeItem a2 = CommonAudioStat$TypeAudioDislikeItem.a(new CommonAudioStat$TypeAudioDislikeItem(CommonAudioStat$TypeAudioDislikeItem.EventType.REMOVE_DISLIKE, z ? CommonAudioStat$TypeAudioDislikeItem.EventSubtype.ADDED_TO_MM : null, null, null, null, null, null, null, 252, null), hg40Var.a, hg40Var.b, hg40Var.c, hg40Var.d, hg40Var.e, hg40Var.f);
        UiTracker uiTracker = UiTracker.a;
        gg40 gg40Var = new gg40(UiTracker.c(), a2);
        gg40Var.c = true;
        gg40Var.q();
    }

    @Override // xsna.u750
    public final void L0(c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.ACTION, CommonAudioStat$TypeAudioSnippetItem.EventType.REMOVED, CommonAudioStat$TypeAudioSnippetItem.EventSubtype.REMOVE_SNIPPET, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u750
    public final void M(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioTapGotoEventItem.MenuAction menuAction) {
        Object[] objArr = 0 == true ? 1 : 0;
        CommonAudioStat$TypeAudioTapGotoEventItem commonAudioStat$TypeAudioTapGotoEventItem = new CommonAudioStat$TypeAudioTapGotoEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, commonAudioStat$TypeAudioSourceEnum, 254, null), new CommonStat$TypeCommonEventItem(null, null, null, null, 15, null), menuAction, objArr, 8, null);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(schemeStat$EventItem, commonAudioStat$TypeAudioTapGotoEventItem, 2)).q();
    }

    @Override // xsna.u750
    public final void M0(o4b0 o4b0Var) {
        b.d invoke = this.c.invoke("audio_player");
        invoke.b(o4b0Var.a, "state");
        invoke.b(o4b0Var.b, "prev_state");
        invoke.b(Long.valueOf(o4b0Var.c), "duration");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void N(MusicTrack musicTrack, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem = new CommonAudioStat$TypeAudioTapPlayEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(musicTrack.Tb() ? new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.AUDIO, musicTrack.Fb()) : musicTrack.Wb() ? new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(musicTrack.b)) : new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.AUDIO, musicTrack.Fb())), commonAudioStat$TypeAudioSourceEnum, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), CommonAudioStat$TypeAudioTapPlayEventItem.Type.START);
        UiTracker uiTracker = UiTracker.a;
        new ky4(UiTracker.c(), commonAudioStat$TypeAudioTapPlayEventItem).q();
    }

    @Override // xsna.u750
    public final void O(fv40 fv40Var) {
        a.a(d1(fv40Var, "music_start_playback"), true);
    }

    @Override // xsna.u750
    public final void O0(c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.SYSTEM, CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_PLAYLIST_END, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void P0(en40 en40Var, int i, int i2, String str) {
        CommonAudioStat$TypeAudioLongtapItem a1 = a1(new CommonAudioStat$TypeAudioLongtapItem(CommonAudioStat$TypeAudioLongtapItem.EventCategory.PLAY, CommonAudioStat$TypeAudioLongtapItem.EventType.STOP, CommonAudioStat$TypeAudioLongtapItem.EventSubtype.valueOf(str), Integer.valueOf(i), Integer.valueOf(i2), null, null, null, null, null, null, null, 4064, null), en40Var);
        UiTracker uiTracker = UiTracker.a;
        new b650(UiTracker.c(), a1).q();
    }

    @Override // xsna.u750
    public final void Q(String str) {
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = new SchemeStat$TypeAudioOfflineItem(SchemeStat$TypeAudioOfflineItem.EventType.DOWNLOAD, str, SchemeStat$TypeAudioOfflineItem.Type.PLAYLIST);
        UiTracker uiTracker = UiTracker.a;
        new jt70(schemeStat$TypeAudioOfflineItem, UiTracker.c()).q();
    }

    @Override // xsna.u750
    public final void Q0(String str) {
        SchemeStat$TypeAudioOfflineItem schemeStat$TypeAudioOfflineItem = new SchemeStat$TypeAudioOfflineItem(SchemeStat$TypeAudioOfflineItem.EventType.DOWNLOAD, str, SchemeStat$TypeAudioOfflineItem.Type.AUDIO);
        UiTracker uiTracker = UiTracker.a;
        jt70 jt70Var = new jt70(schemeStat$TypeAudioOfflineItem, UiTracker.c());
        jt70Var.c = true;
        jt70Var.q();
    }

    @Override // xsna.u750
    public final void R(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem = new CommonAudioStat$TypeAudioTapTimerEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, commonAudioStat$TypeAudioSourceEnum, 254, null), CommonAudioStat$TypeAudioTapTimerEventItem.Type.OFF, 0);
        UiTracker uiTracker = UiTracker.a;
        new ny4(UiTracker.c(), commonAudioStat$TypeAudioTapTimerEventItem).q();
    }

    @Override // xsna.u750
    public final void S(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem = new CommonAudioStat$TypeAudioTapStopEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(i))), commonAudioStat$TypeAudioSourceEnum, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), CommonAudioStat$TypeAudioTapStopEventItem.Type.NEXT);
        UiTracker uiTracker = UiTracker.a;
        new my4(UiTracker.c(), commonAudioStat$TypeAudioTapStopEventItem).q();
    }

    @Override // xsna.u750
    public final void S0(en40 en40Var, int i, String str) {
        CommonAudioStat$TypeAudioLongtapItem a1 = a1(new CommonAudioStat$TypeAudioLongtapItem(CommonAudioStat$TypeAudioLongtapItem.EventCategory.VIEW, CommonAudioStat$TypeAudioLongtapItem.EventType.OPEN, CommonAudioStat$TypeAudioLongtapItem.EventSubtype.valueOf(str), Integer.valueOf(i), null, null, null, null, null, null, null, null, 4080, null), en40Var);
        UiTracker uiTracker = UiTracker.a;
        new b650(UiTracker.c(), a1).q();
    }

    @Override // xsna.u750
    public final void T0() {
        CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem = new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.NAV, CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_FEED_OPEN, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), commonAudioStat$TypeAudioSnippetItem).q();
    }

    @Override // xsna.u750
    public final void U(hg40 hg40Var) {
        CommonAudioStat$TypeAudioDislikeItem a2 = CommonAudioStat$TypeAudioDislikeItem.a(new CommonAudioStat$TypeAudioDislikeItem(CommonAudioStat$TypeAudioDislikeItem.EventType.ADD_DISLIKE, null, null, null, null, null, null, null, 254, null), hg40Var.a, hg40Var.b, hg40Var.c, hg40Var.d, hg40Var.e, hg40Var.f);
        UiTracker uiTracker = UiTracker.a;
        gg40 gg40Var = new gg40(UiTracker.c(), a2);
        gg40Var.c = true;
        gg40Var.q();
    }

    @Override // xsna.u750
    public final void U0(c650 c650Var, int i) {
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        Long l2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.ACTION, CommonAudioStat$TypeAudioSnippetItem.EventType.ADDED, CommonAudioStat$TypeAudioSnippetItem.EventSubtype.ADD_SNIPPET, num, str, num2, l, Integer.valueOf(i), Long.valueOf(o25.a().c().b), num3, l2, num4, num5, num6, num7, 32376, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void V(String str, String str2, String str3, String str4) {
        b.d invoke = this.c.invoke("view_recommended_audio");
        invoke.b(str, "audio_id");
        invoke.b(str2, "owner_id");
        invoke.b(str3, "track_code");
        invoke.b(str4, "ref");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void W(String str, String str2) {
        boolean equals = "success".equals(str2);
        b.d invoke = this.c.invoke("music_subscription_purchase_result");
        invoke.b(str, "popup");
        invoke.b(equals ? "success" : X3.g.e, "status");
        if (!equals) {
            invoke.b(str2, "reason");
        }
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void W0(boolean z) {
        b.d invoke = this.c.invoke("audio_download_setting_type_update");
        invoke.b(Boolean.valueOf(z), "celullar_available");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void X(String str, String str2) {
        b.d invoke = this.c.invoke("music_subscription_action");
        invoke.b(str, "popup");
        invoke.b(str2, "action");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void X0(fv40 fv40Var) {
        if ("pause".equals(this.d)) {
            i0(fv40Var);
        }
    }

    @Override // xsna.u750
    public final void Y(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        long a2 = qni0.a();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonAudioStat$TypeAudioTapSettingsEventItem(new CommonAudioStat$TypeAudioDomainEventItem(a2, null, null, null, null, null, null, null, commonAudioStat$TypeAudioSourceEnum, 254, null)), 2);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), b2).q();
    }

    @Override // xsna.u750
    public final void Y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapTimerEventItem commonAudioStat$TypeAudioTapTimerEventItem = new CommonAudioStat$TypeAudioTapTimerEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, CommonAudioStat$TypeAudioSourceEnum.RADIO_PLAYER_MENU, 254, null), CommonAudioStat$TypeAudioTapTimerEventItem.Type.ON, i);
        UiTracker uiTracker = UiTracker.a;
        new ny4(UiTracker.c(), commonAudioStat$TypeAudioTapTimerEventItem).q();
    }

    @Override // xsna.u750
    public final void Z(boolean z) {
        b.d invoke = this.c.invoke("audio_download_alert_show");
        invoke.b(Boolean.valueOf(z), "network_available");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void Z0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.PLAY, CommonAudioStat$TypeAudioSnippetItem.EventType.STOP, eventSubtype, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void a(String str, String str2) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.LIKE, c1(str), System.currentTimeMillis(), arm0.n(str2), null, 16, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    @Override // xsna.u750
    public final void a0(int i, UserId userId) {
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem = new CommonAudioStat$TypeAudioLyricsItem(new CommonStat$TypeCommonEventItem(Long.valueOf(i), Long.valueOf(userId.b), null, null, 12, null), CommonAudioStat$TypeAudioLyricsItem.EventType.SHOW_LYRICS);
        UiTracker uiTracker = UiTracker.a;
        new in40(UiTracker.c(), commonAudioStat$TypeAudioLyricsItem).q();
    }

    @Override // xsna.u750
    public final void b0(iab0 iab0Var, boolean z, Integer num) {
        e1(this, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType.IGNORE, z ? CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.MAIN : CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.PLAYLIST, iab0Var, null, String.valueOf(num), 8);
    }

    @Override // xsna.u750
    public final void c(iab0 iab0Var, boolean z) {
        e1(this, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType.VIEW, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.FEED, iab0Var, Boolean.valueOf(z), null, 16);
    }

    @Override // xsna.u750
    public final void c0() {
        b.d invoke = this.c.invoke("audio_sleep_timer_event");
        invoke.b("music_paused", "type");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void d(int i, String str) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.FINISH, c1(str), System.currentTimeMillis(), null, Integer.valueOf(i), 8, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    @Override // xsna.u750
    public final void d0(String str, String str2) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.DISLIKE, c1(str), System.currentTimeMillis(), arm0.n(str2), null, 16, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    public final b.d d1(fv40 fv40Var, String str) {
        b.d invoke = this.c.invoke(str);
        String str2 = fv40Var.a;
        if (str2 == null) {
            str2 = null;
        }
        invoke.b(str2, "audio_id");
        invoke.b(Integer.valueOf(UUID.randomUUID().hashCode()), "uuid");
        invoke.b(Boolean.valueOf(fv40Var.c.b.getBoolean("__META_PLAYER_SHUFFLED")), "shuffle");
        String str3 = fv40Var.i;
        if (str3 == null) {
            str3 = this.d;
        }
        if (str3 == null) {
            str3 = "auto";
        }
        this.d = str3;
        invoke.b(str3, "reason");
        invoke.b(Long.valueOf(fv40Var.f), "start_time");
        invoke.b(Float.valueOf(fv40Var.h), "playback_started_at");
        invoke.b(fv40Var.g, "track_code");
        invoke.b(Long.valueOf(fv40Var.m), "client_event_microsec");
        invoke.b(Boolean.valueOf(fv40Var.n), "is_crossfade");
        invoke.b(Boolean.valueOf(fv40Var.o), "is_loudness_normalization");
        invoke.b(fv40Var.p, "streaming_url_type");
        invoke.b(fv40Var.q, "url_domain");
        if ("music_start_playback".equals(str) || "music_stop_playback".equals(str)) {
            invoke.b(fv40Var.l.h(), "streaming_type");
        }
        if (!"music_start_playback".equals(str)) {
            invoke.b(Float.valueOf(fv40Var.e), "duration");
        }
        int i = b.$EnumSwitchMapping$0[fv40Var.d.ordinal()];
        if (i == 1) {
            invoke.b("one", "repeat");
        } else if (i != 2) {
            s3q0 s3q0Var = s3q0.a;
        } else {
            invoke.b("all", "repeat");
        }
        invoke.b(fv40Var.b ? L2.g : fv40Var.c.b.getBoolean("__META_PLAYER_FULL_SCREEN") ? "fullscreen" : MBridgeConstans.DYNAMIC_VIEW_WX_APP, "state");
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = fv40Var.c;
        invoke.b(musicPlaybackLaunchContext.t(), "source");
        if (myc0.f(musicPlaybackLaunchContext.b.getString("__META_PLAYLIST_PID"))) {
            invoke.b(musicPlaybackLaunchContext.Kb(), "playlist_id");
        }
        if (musicPlaybackLaunchContext.Nb(4) || musicPlaybackLaunchContext.Nb(8)) {
            invoke.b(Boolean.valueOf(musicPlaybackLaunchContext.Nb(4)), "expanded");
        }
        if (myc0.f(fv40Var.j)) {
            invoke.b(fv40Var.j, "prev_audio_id");
        }
        if (myc0.f(fv40Var.k)) {
            invoke.b(fv40Var.k, "prev_playlist_id");
        }
        if (musicPlaybackLaunchContext.Gb().equals("kids_section")) {
            invoke.b(musicPlaybackLaunchContext.Gb(), "launch_origin");
        }
        return invoke;
    }

    @Override // xsna.u750
    public final void e0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem = new CommonAudioStat$TypeAudioTapStopEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(i))), commonAudioStat$TypeAudioSourceEnum, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), CommonAudioStat$TypeAudioTapStopEventItem.Type.END);
        UiTracker uiTracker = UiTracker.a;
        new my4(UiTracker.c(), commonAudioStat$TypeAudioTapStopEventItem).q();
    }

    @Override // xsna.u750
    public final void f0(String str) {
        b.d invoke = this.c.invoke("playlist_start");
        invoke.b(str, "type");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void g(int i, int i2, String str) {
        CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem = new CommonAudioStat$TypeRadioStationItem(i, CommonAudioStat$TypeRadioStationItem.EventType.OFF, Integer.valueOf(i2), str);
        UiTracker uiTracker = UiTracker.a;
        new zue0(UiTracker.c(), commonAudioStat$TypeRadioStationItem).q();
    }

    @Override // xsna.u750
    public final void g0(long j) {
        b.d invoke = this.c.invoke("audio_sleep_timer_event");
        invoke.b("set", "type");
        invoke.b(Long.valueOf(j), "seconds");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void h() {
        CommonAudioStat$TypeAudioSnippetItem commonAudioStat$TypeAudioSnippetItem = new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.NAV, CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_FEED_EXIT, CommonAudioStat$TypeAudioSnippetItem.EventSubtype.CLOSE, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), commonAudioStat$TypeAudioSnippetItem).q();
    }

    @Override // xsna.u750
    public final void h0(iab0 iab0Var, int i) {
        e1(this, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType.CLICK, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.PLAYLIST_PLAY, iab0Var, null, String.valueOf(i), 8);
    }

    @Override // xsna.u750
    public final void i0(fv40 fv40Var) {
        a.a(d1(fv40Var, "music_stop_playback"), true);
    }

    @Override // xsna.u750
    public final void j() {
        b.d invoke = this.c.invoke("audio_sleep_timer_event");
        invoke.b("show", "type");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType, PlayerMode playerMode) {
        MobileOfficialAppsCoreNavStat$EventScreen c;
        CommonAudioStat$TypeAudioDomainEventItem f1 = f1(playerMode);
        if (f1 == null) {
            return;
        }
        switch (b.$EnumSwitchMapping$2[eventType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                UiTracker uiTracker = UiTracker.a;
                c = UiTracker.c();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                c = MobileOfficialAppsCoreNavStat$EventScreen.SPRINGBOARD;
                break;
            case 39:
                c = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYLIST;
                break;
            default:
                c = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS;
                break;
        }
        new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioPlayerUiClickItem(eventType, f1), 2)).q();
    }

    @Override // xsna.u750
    public final void l(en40 en40Var) {
        CommonAudioStat$TypeAudioLongtapItem a1 = a1(new CommonAudioStat$TypeAudioLongtapItem(CommonAudioStat$TypeAudioLongtapItem.EventCategory.PLAY, CommonAudioStat$TypeAudioLongtapItem.EventType.START, CommonAudioStat$TypeAudioLongtapItem.EventSubtype.LONGTAP, null, null, null, null, null, null, null, null, null, 4088, null), en40Var);
        UiTracker uiTracker = UiTracker.a;
        new b650(UiTracker.c(), a1).q();
    }

    @Override // xsna.u750
    public final void l0(int i, int i2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = null;
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem2 = null;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = null;
        String str = null;
        String str2 = null;
        CommonAudioStat$TypeAudioTapPlayEventItem commonAudioStat$TypeAudioTapPlayEventItem = new CommonAudioStat$TypeAudioTapPlayEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), commonStat$TypeCommonEventItem, commonStat$TypeCommonEventItem2, commonStat$TypeTrackCodeItem, str, str2, Collections.singletonList(Integer.valueOf(i2)), Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(i))), commonAudioStat$TypeAudioSourceEnum, 62, null), CommonAudioStat$TypeAudioTapPlayEventItem.Type.START);
        UiTracker uiTracker = UiTracker.a;
        new ky4(UiTracker.c(), commonAudioStat$TypeAudioTapPlayEventItem).q();
    }

    @Override // xsna.u750
    public final void m(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.PLAY, CommonAudioStat$TypeAudioSnippetItem.EventType.START, eventSubtype, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void m0(String str) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.OFFER, c1(str), System.currentTimeMillis(), null, null, 24, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    @Override // xsna.u750
    public final void o(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem = new CommonAudioStat$TypeAudioTapShowEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, null, commonAudioStat$TypeAudioSourceEnum, 254, null), CommonAudioStat$TypeAudioSourceEnum.RADIOSTATIONS_CURTAIN);
        UiTracker uiTracker = UiTracker.a;
        new ly4(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeAudioTapShowEventItem, 3)).q();
    }

    @Override // xsna.u750
    public final void o0(int i, UserId userId) {
        new hzp0.c(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MUSIC, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioPopupItem(new CommonStat$TypeCommonEventItem(Long.valueOf(i), Long.valueOf(userId.b), null, null, 12, null), CommonAudioStat$TypeAudioPopupItem.EventType.RESTRICTION)).a();
    }

    @Override // xsna.u750
    public final void p(String str, String str2, String str3) {
        b.d invoke = this.c.invoke("view_recommended_artist");
        invoke.b(str, "id");
        invoke.b(str2, "track_code");
        invoke.b(str3, "ref");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void q() {
        gzp0.a.c(new CommonAudioStat$TypeAudioPopupItem(new CommonStat$TypeCommonEventItem(null, null, null, null, 15, null), CommonAudioStat$TypeAudioPopupItem.EventType.VPN));
    }

    @Override // xsna.u750
    public final void q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.NAV, CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_FEED_DRILLDOWN, eventSubtype, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void r0(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.ACTION, eventType, CommonAudioStat$TypeAudioSnippetItem.EventSubtype.SWIPE, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, false);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void s(int i, UserId userId) {
        CommonAudioStat$TypeAudioLyricsItem commonAudioStat$TypeAudioLyricsItem = new CommonAudioStat$TypeAudioLyricsItem(new CommonStat$TypeCommonEventItem(Long.valueOf(i), Long.valueOf(userId.b), null, null, 12, null), CommonAudioStat$TypeAudioLyricsItem.EventType.GO_TO_TIMECODE);
        UiTracker uiTracker = UiTracker.a;
        new in40(UiTracker.c(), commonAudioStat$TypeAudioLyricsItem).q();
    }

    @Override // xsna.u750
    public final void s0(int i, String str, boolean z) {
        CommonAudioStat$TypeAudiobookActItem commonAudioStat$TypeAudiobookActItem = new CommonAudioStat$TypeAudiobookActItem(z ? CommonAudioStat$TypeAudiobookActItem.Type.ADD : CommonAudioStat$TypeAudiobookActItem.Type.DELETE, i, str, System.currentTimeMillis(), CommonAudioStat$TypeAudiobookActItem.AppState.ACTIVE_STATE);
        UiTracker uiTracker = UiTracker.a;
        new hg4(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeAudiobookActItem, 3)).q();
    }

    @Override // xsna.u750
    public final void t() {
        b.d invoke = this.c.invoke("music_subscription_push");
        invoke.b("send", "action");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void t0(String str) {
        b.d invoke = this.c.invoke("audio_download_error");
        invoke.b(0, "code");
        invoke.b(str, "reason");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void u(String str, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem = new CommonAudioStat$TypeAudioTapEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.AUDIO, str)), commonAudioStat$TypeAudioSourceEnum, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), new CommonAudioStat$AudioDomainTapEvent(CommonAudioStat$AudioDomainTapEvent.Action.ADD, false));
        UiTracker uiTracker = UiTracker.a;
        new jy4(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonAudioStat$TypeAudioTapEventItem, 3)).q();
    }

    @Override // xsna.u750
    public final void u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType eventType, PlayerMode playerMode) {
        CommonAudioStat$TypeAudioDomainEventItem f1 = f1(playerMode);
        if (f1 == null) {
            return;
        }
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioTrackMenuUiClickItem(eventType, f1), 2)).q();
    }

    @Override // xsna.u750
    public final void v(iab0 iab0Var, int i) {
        e1(this, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventType.CLICK, CommonAudioStat$TypeFeedBlockRecommendedPlaylistsItem.EventSubtype.PLAYLIST, iab0Var, null, String.valueOf(i), 8);
    }

    @Override // xsna.u750
    public final void v0() {
        b.d invoke = this.c.invoke("music_subscription_push");
        invoke.b("open", "action");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void x(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
        CommonAudioStat$TypeAudioSnippetItem b1 = b1(new CommonAudioStat$TypeAudioSnippetItem(CommonAudioStat$TypeAudioSnippetItem.EventCategory.ACTION, eventType, CommonAudioStat$TypeAudioSnippetItem.EventSubtype.SWIPE, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null), c650Var, true);
        UiTracker uiTracker = UiTracker.a;
        new a650(UiTracker.c(), b1).q();
    }

    @Override // xsna.u750
    public final void x0() {
        b.d invoke = this.c.invoke("audio_sleep_timer_event");
        invoke.b("disable", "type");
        a.a(invoke, false);
    }

    @Override // xsna.u750
    public final void y(int i, String str) {
        CommonAudioStat$TypeRadioStationItem commonAudioStat$TypeRadioStationItem = new CommonAudioStat$TypeRadioStationItem(i, CommonAudioStat$TypeRadioStationItem.EventType.ON, null, str, 4, null);
        UiTracker uiTracker = UiTracker.a;
        new zue0(UiTracker.c(), commonAudioStat$TypeRadioStationItem).q();
    }

    @Override // xsna.u750
    public final void y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        CommonAudioStat$TypeAudioTapStopEventItem commonAudioStat$TypeAudioTapStopEventItem = new CommonAudioStat$TypeAudioTapStopEventItem(new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), null, null, null, null, null, null, Collections.singletonList(new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(i))), commonAudioStat$TypeAudioSourceEnum, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), CommonAudioStat$TypeAudioTapStopEventItem.Type.PREV);
        UiTracker uiTracker = UiTracker.a;
        new my4(UiTracker.c(), commonAudioStat$TypeAudioTapStopEventItem).q();
    }

    @Override // xsna.u750
    public final void z(String str) {
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = new CommonAudioStat$TypeAudioOnboardingItem(CommonAudioStat$TypeAudioOnboardingItem.Event.SEARCH, c1(str), System.currentTimeMillis(), null, null, 24, null);
        UiTracker uiTracker = UiTracker.a;
        new bs4(UiTracker.c(), commonAudioStat$TypeAudioOnboardingItem).q();
    }

    @Override // xsna.u750
    public final void P() {
    }

    @Override // xsna.u750
    public final void R0() {
    }

    @Override // xsna.u750
    public final void T() {
    }

    @Override // xsna.u750
    public final void V0() {
    }

    @Override // xsna.u750
    public final void b() {
    }

    @Override // xsna.u750
    public final void p0() {
    }

    @Override // xsna.u750
    public final void w0() {
    }

    @Override // xsna.u750
    public final void C0(String str) {
    }

    @Override // xsna.u750
    public final void J(fv40 fv40Var) {
    }

    @Override // xsna.u750
    public final void i(boolean z) {
    }

    @Override // xsna.u750
    public final void n(boolean z) {
    }

    @Override // xsna.u750
    public final void n0(long j) {
    }

    @Override // xsna.u750
    public final void onProgress(long j) {
    }

    @Override // xsna.u750
    public final void r(int i) {
    }

    @Override // xsna.u750
    public final void w(boolean z) {
    }

    @Override // xsna.u750
    public final void z0(String str) {
    }

    @Override // xsna.u750
    public final void E0(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void N0(ajc ajcVar, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent) {
    }

    @Override // xsna.u750
    public final void e(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void f(Intent intent, String str) {
    }

    @Override // xsna.u750
    public final void j0(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void k(ajc ajcVar, CommonAudioStat$TypeAudioTapPlayEventItem.Type type) {
    }

    @Override // xsna.u750
    public final void D(String str, boolean z, boolean z2) {
    }
}
