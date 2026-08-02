package xsna;

import com.vk.newsfeed.api.stats.NewsEntryEventItemType;

/* compiled from: EventItemMapper.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0q {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NewsEntryEventItemType.values().length];
        try {
            iArr[NewsEntryEventItemType.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NewsEntryEventItemType.CLIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NewsEntryEventItemType.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
