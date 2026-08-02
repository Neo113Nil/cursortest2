package xsna;

import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentStyleDto;

/* compiled from: WallpostAttachmentDtoToAttachmentStyleMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class tax0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[WallWallpostAttachmentStyleDto.values().length];
        try {
            iArr[WallWallpostAttachmentStyleDto.COMPACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WallWallpostAttachmentStyleDto.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[NewsfeedNewsfeedItemHeaderImageDto.StyleDto.values().length];
        try {
            iArr2[NewsfeedNewsfeedItemHeaderImageDto.StyleDto.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NewsfeedNewsfeedItemHeaderImageDto.StyleDto.SQUIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
