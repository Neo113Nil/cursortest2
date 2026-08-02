package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class pdq {

    /* compiled from: Extensions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicStickerStyle.values().length];
            try {
                iArr[MusicStickerStyle.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicStickerStyle.Album.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicStickerStyle.HeaderMeta.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ServiceStickerStyle.values().length];
            try {
                iArr2[ServiceStickerStyle.Sticker.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Poll a(Poll poll) {
        PollBackground pollBackground = poll.s;
        if (pollBackground != null) {
            return poll;
        }
        if (pollBackground == null) {
            pollBackground = new PollContentColor(0, 0, StickerCommonStyle.DARK);
        }
        return Poll.zb(poll, null, null, null, 0, 0L, false, pollBackground, null, null, 4063231);
    }

    public static final String b(Context context, StoryMusicInfo storyMusicInfo, MusicStickerStyle musicStickerStyle) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[musicStickerStyle.ordinal()];
        if (i2 == 1) {
            i = R.string.sticker_music_redesign_horizonal_description;
        } else if (i2 == 2) {
            i = R.string.sticker_music_redesign_album_description;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.sticker_music_redesign_only_music_description;
        }
        MusicTrack musicTrack = storyMusicInfo.b;
        return context.getString(i, musicTrack.d, musicTrack.h);
    }

    public static final String c(Context context, StoryServiceItemInfo storyServiceItemInfo, ServiceStickerStyle serviceStickerStyle) {
        if (a.$EnumSwitchMapping$1[serviceStickerStyle.ordinal()] == 1) {
            return context.getString(R.string.sticker_service_base_description, storyServiceItemInfo.a, storyServiceItemInfo.b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
