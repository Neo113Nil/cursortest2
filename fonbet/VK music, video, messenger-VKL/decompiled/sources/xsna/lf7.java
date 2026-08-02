package xsna;

import com.vk.api.generated.stories.dto.StoriesGetInterestingBlockResponseDto;

/* compiled from: BlockTypeDtoToDiscoverBlockTypeMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf7 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[StoriesGetInterestingBlockResponseDto.BlockTypeDto.values().length];
        try {
            iArr[StoriesGetInterestingBlockResponseDto.BlockTypeDto.DISCOVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoriesGetInterestingBlockResponseDto.BlockTypeDto.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StoriesGetInterestingBlockResponseDto.BlockTypeDto.SOCIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StoriesGetInterestingBlockResponseDto.BlockTypeDto.PHONE_BOOK_STORIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
