package xsna;

import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.dto.user.UserSex;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BaseSexDtoToUserSexMapper.kt */
/* loaded from: classes3.dex */
public final class sm6 {

    /* compiled from: BaseSexDtoToUserSexMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseSexDto.values().length];
            try {
                iArr[BaseSexDto.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseSexDto.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseSexDto.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static UserSex a(BaseSexDto baseSexDto) {
        int i = a.$EnumSwitchMapping$0[baseSexDto.ordinal()];
        if (i == 1) {
            return UserSex.UNKNOWN;
        }
        if (i == 2) {
            return UserSex.FEMALE;
        }
        if (i == 3) {
            return UserSex.MALE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
