package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupNameHistoryActionDto;

/* compiled from: NameHistoryMapping.kt */
/* loaded from: classes5.dex */
public final class wt50 {

    /* compiled from: NameHistoryMapping.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupNameHistoryActionDto.TypeDto.values().length];
            try {
                iArr[GroupsGroupNameHistoryActionDto.TypeDto.RENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupNameHistoryActionDto.TypeDto.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGroupNameHistoryActionDto.TypeDto.COLLAPSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
