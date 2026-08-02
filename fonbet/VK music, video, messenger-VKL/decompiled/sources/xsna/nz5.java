package xsna;

import com.vk.api.generated.badges.dto.BadgesObjectEntriesCounterDto;

/* compiled from: BadgesObjectInfoDtoToBadgesSetMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz5 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BadgesObjectEntriesCounterDto.TypeDto.values().length];
        try {
            iArr[BadgesObjectEntriesCounterDto.TypeDto.BADGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgesObjectEntriesCounterDto.TypeDto.TOTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgesObjectEntriesCounterDto.TypeDto.FRIENDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
