package xsna;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserOnlineInfoMapper.kt */
/* loaded from: classes3.dex */
public final class dlq0 {

    /* compiled from: UserOnlineInfoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UsersOnlineInfoDto.StatusDto.values().length];
            try {
                iArr[UsersOnlineInfoDto.StatusDto.RECENTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LAST_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LAST_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LONG_AGO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.NOT_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static OnlineInfo a(UsersOnlineInfoDto usersOnlineInfoDto) {
        InvisibleLastSeenStatus invisibleLastSeenStatus;
        if (usersOnlineInfoDto == null) {
            return null;
        }
        if (usersOnlineInfoDto.f() == null) {
            long intValue = usersOnlineInfoDto.e() != null ? r0.intValue() : 0L;
            Boolean j = usersOnlineInfoDto.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            Integer d = usersOnlineInfoDto.d();
            int intValue2 = d != null ? d.intValue() : 0;
            Boolean i = usersOnlineInfoDto.i();
            return new VisibleStatus(intValue, booleanValue, intValue2, epx.f(i, Boolean.TRUE) ? Platform.MOBILE : epx.f(i, Boolean.FALSE) ? Platform.WEB : Platform.NONE);
        }
        UsersOnlineInfoDto.StatusDto f = usersOnlineInfoDto.f();
        int i2 = f == null ? -1 : a.$EnumSwitchMapping$0[f.ordinal()];
        if (i2 == -1) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.NONE;
        } else if (i2 == 1) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.RECENTLY;
        } else if (i2 == 2) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LAST_WEEK;
        } else if (i2 == 3) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LAST_MONTH;
        } else if (i2 == 4) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LONG_AGO;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            invisibleLastSeenStatus = InvisibleLastSeenStatus.NOT_SHOW;
        }
        return new InvisibleStatus(invisibleLastSeenStatus);
    }
}
