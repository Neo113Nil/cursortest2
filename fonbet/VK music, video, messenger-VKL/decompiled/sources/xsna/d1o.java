package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;

/* compiled from: DonutOwnerMapper.kt */
/* loaded from: classes2.dex */
public final class d1o {

    /* compiled from: DonutOwnerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupDonutDto.StatusDto.values().length];
            try {
                iArr[GroupsGroupDonutDto.StatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupDonutDto.StatusDto.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
