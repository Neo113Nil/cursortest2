package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.search.integration.api.SearchTab;

/* compiled from: SearchInCommunityCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class qvh0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CatalogDataType.values().length];
        try {
            iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CatalogDataType.DATA_TYPE_WALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SearchTab.values().length];
        try {
            iArr2[SearchTab.CLIPS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SearchTab.MARKET.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SearchTab.MUSIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SearchTab.PHOTOS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SearchTab.VIDEOS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SearchTab.WALL.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
