package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickerAreaDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoClickableStickerItemDto;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ShortVideoClipsClickableStickersMapper.kt */
/* loaded from: classes3.dex */
public final class vfj0 {

    /* compiled from: ShortVideoClipsClickableStickersMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortVideoShortVideoClickableStickerItemDto.TypeDto.values().length];
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.HASHTAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.MARKET_ITEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.STICKER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShortVideoShortVideoClickableStickerItemDto.TypeDto.TICKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static q500 a(ShortVideoShortVideoClickableStickerItemDto shortVideoShortVideoClickableStickerItemDto) {
        Long valueOf = shortVideoShortVideoClickableStickerItemDto.l() != null ? Long.valueOf(r0.intValue()) : null;
        Long valueOf2 = shortVideoShortVideoClickableStickerItemDto.f() != null ? Long.valueOf(r5.intValue()) : null;
        if (valueOf == null || valueOf2 == null) {
            return null;
        }
        long longValue = valueOf2.longValue();
        long longValue2 = valueOf.longValue();
        return new q500(longValue2, longValue + longValue2);
    }

    public static List b(List list) {
        if (list == null) {
            return EmptyList.b;
        }
        List<ShortVideoClickableStickerAreaDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ShortVideoClickableStickerAreaDto shortVideoClickableStickerAreaDto : list2) {
            arrayList.add(new WebClickablePoint(shortVideoClickableStickerAreaDto.d(), shortVideoClickableStickerAreaDto.e()));
        }
        return arrayList;
    }
}
