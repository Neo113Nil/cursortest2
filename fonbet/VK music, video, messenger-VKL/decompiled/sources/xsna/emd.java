package xsna;

import android.graphics.Color;
import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickerAreaDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoClickableStickerItemDto;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsClickableStickersMapper.kt */
/* loaded from: classes3.dex */
public final class emd {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ClipsClickableStickersMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShortVideoClickableStickerItemDto.TypeDto.values().length];
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.HASHTAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.PLACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.MARKET_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.POST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.STICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShortVideoClickableStickerItemDto.TypeDto.TICKET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Color.parseColor("#3F8AE0");
    }

    public static q500 a(ShortVideoClickableStickerItemDto shortVideoClickableStickerItemDto) {
        Long valueOf = shortVideoClickableStickerItemDto.u() != null ? Long.valueOf(r0.intValue()) : null;
        Long valueOf2 = shortVideoClickableStickerItemDto.f() != null ? Long.valueOf(r5.intValue()) : null;
        if (valueOf == null || valueOf2 == null) {
            return null;
        }
        long longValue = valueOf2.longValue();
        long longValue2 = valueOf.longValue();
        return new q500(longValue2, longValue + longValue2);
    }

    public static ArrayList b(List list) {
        List<ShortVideoClickableStickerAreaDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ShortVideoClickableStickerAreaDto shortVideoClickableStickerAreaDto : list2) {
            arrayList.add(new WebClickablePoint(shortVideoClickableStickerAreaDto.d(), shortVideoClickableStickerAreaDto.e()));
        }
        return arrayList;
    }
}
