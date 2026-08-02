package xsna;

import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.badges.dto.BadgesBadgeStyleDto;

/* compiled from: BadgesBadgeDtoToBadgeItemMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz5 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[BadgesBadgeDto.LockStatusDto.values().length];
        try {
            iArr[BadgesBadgeDto.LockStatusDto.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgesBadgeDto.LockStatusDto.LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgesBadgeDto.LockStatusDto.UNLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[BadgesBadgeStyleDto.ColorSchemeDto.values().length];
        try {
            iArr2[BadgesBadgeStyleDto.ColorSchemeDto.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BadgesBadgeStyleDto.ColorSchemeDto.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
