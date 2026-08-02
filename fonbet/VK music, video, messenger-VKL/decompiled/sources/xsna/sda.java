package xsna;

import com.vk.api.generated.search.dto.SearchFilterItemDto;

/* compiled from: CatalogSearchFiltersMapper.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class sda {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SearchFilterItemDto.TypeDto.values().length];
        try {
            iArr[SearchFilterItemDto.TypeDto.FILTER_BINARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SearchFilterItemDto.TypeDto.FILTER_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
