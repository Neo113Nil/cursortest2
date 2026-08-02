package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;

/* compiled from: ClipsOwnerGridBatchResponseMapper.kt */
/* loaded from: classes17.dex */
public final class coe {
    public final b590 a = new b590();

    /* compiled from: ClipsOwnerGridBatchResponseMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupTypeDto.values().length];
            try {
                iArr[GroupsGroupTypeDto.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupTypeDto.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGroupTypeDto.PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
