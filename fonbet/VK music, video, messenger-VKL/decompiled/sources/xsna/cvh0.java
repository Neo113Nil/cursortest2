package xsna;

import com.vk.catalog2.common.dto.api.ContentType;

/* compiled from: SearchHistoryModelExtensions.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class cvh0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ContentType.values().length];
        try {
            iArr[ContentType.ARTIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentType.CURATOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentType.PODCAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContentType.AUDIO_BOOK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
