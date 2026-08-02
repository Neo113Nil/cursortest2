package xsna;

import android.content.Context;
import com.vk.clips.editor.model.ClipsStickerType;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.d0e;

/* compiled from: VkClipsStickerSelectionProviderImpl.kt */
/* loaded from: classes16.dex */
public final class ulu0 implements x4f {
    @Override // xsna.x4f
    public final EnumSet a(int i, int i2, List list) {
        ClipsStickerType clipsStickerType;
        EnumSet noneOf = EnumSet.noneOf(WebStickerType.class);
        k9l0 i3 = tci.i(i, i2, list);
        WebStickerType webStickerType = WebStickerType.HASHTAG;
        if (o0m0.d(webStickerType) > i3.b) {
            noneOf.add(webStickerType);
        }
        WebStickerType webStickerType2 = WebStickerType.MENTION;
        if (o0m0.d(webStickerType2) > i3.a.size()) {
            noneOf.add(webStickerType2);
        }
        WebStickerType webStickerType3 = WebStickerType.TIME;
        if (o0m0.d(webStickerType3) > i3.i) {
            noneOf.add(webStickerType3);
        }
        noneOf.add(WebStickerType.PHOTO);
        EnumSet noneOf2 = EnumSet.noneOf(ClipsStickerType.class);
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            switch (ldl0.$EnumSwitchMapping$1[((WebStickerType) it.next()).ordinal()]) {
                case 1:
                    clipsStickerType = ClipsStickerType.TEXT;
                    break;
                case 2:
                    clipsStickerType = ClipsStickerType.STICKER;
                    break;
                case 3:
                    clipsStickerType = ClipsStickerType.EMOJI;
                    break;
                case 4:
                    clipsStickerType = ClipsStickerType.LOTTIE;
                    break;
                case 5:
                    clipsStickerType = ClipsStickerType.PHOTO;
                    break;
                case 6:
                    clipsStickerType = ClipsStickerType.HASHTAG;
                    break;
                case 7:
                    clipsStickerType = ClipsStickerType.MENTION;
                    break;
                case 8:
                    clipsStickerType = ClipsStickerType.QUESTION;
                    break;
                case 9:
                    clipsStickerType = ClipsStickerType.MUSIC;
                    break;
                case 10:
                    clipsStickerType = ClipsStickerType.MUSIC_PLAYLIST;
                    break;
                case 11:
                    clipsStickerType = ClipsStickerType.GEO;
                    break;
                case 12:
                    clipsStickerType = ClipsStickerType.GIF;
                    break;
                case 13:
                    clipsStickerType = ClipsStickerType.MARKET_ITEM;
                    break;
                case 14:
                    clipsStickerType = ClipsStickerType.MARKET_SERVICE_ITEM;
                    break;
                case 15:
                    clipsStickerType = ClipsStickerType.SERVICE_YC_ITEM;
                    break;
                case 16:
                    clipsStickerType = ClipsStickerType.LINK;
                    break;
                case 17:
                    clipsStickerType = ClipsStickerType.TIME;
                    break;
                case 18:
                    clipsStickerType = ClipsStickerType.OWNER;
                    break;
                case 19:
                    clipsStickerType = ClipsStickerType.REPLY;
                    break;
                case 20:
                    clipsStickerType = ClipsStickerType.POST;
                    break;
                case 21:
                    clipsStickerType = ClipsStickerType.CLIP_STAT;
                    break;
                case 22:
                    clipsStickerType = ClipsStickerType.CLIP;
                    break;
                case 23:
                    clipsStickerType = ClipsStickerType.VK_VIDEO;
                    break;
                case 24:
                    clipsStickerType = ClipsStickerType.CHANNEL_POST;
                    break;
                case 25:
                    clipsStickerType = ClipsStickerType.POLL;
                    break;
                case 26:
                    clipsStickerType = ClipsStickerType.APP;
                    break;
                case 27:
                    clipsStickerType = ClipsStickerType.SITUATIONAL_THEME;
                    break;
                case 28:
                    clipsStickerType = ClipsStickerType.SITUATIONAL_TEMPLATE;
                    break;
                case 29:
                    clipsStickerType = ClipsStickerType.PHOTO_ALBUM;
                    break;
                case 30:
                    clipsStickerType = ClipsStickerType.VK_TICKET;
                    break;
                case 31:
                    clipsStickerType = ClipsStickerType.REACTION;
                    break;
                case 32:
                    clipsStickerType = ClipsStickerType.AUDIO_TRACK;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            noneOf2.add(clipsStickerType);
        }
        return noneOf2;
    }

    @Override // xsna.x4f
    public final dfi0 b(Context context, d0e.a aVar, boolean z) {
        return new dfi0(context, aVar, z);
    }
}
