package xsna;

import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;

/* compiled from: CanCallErrorConvertor.kt */
/* loaded from: classes7.dex */
public final class zo9 {

    /* compiled from: CanCallErrorConvertor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UsersCanNotCallReasonDto.values().length];
            try {
                iArr[UsersCanNotCallReasonDto.PRIVACY_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_YOURSELF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_SERVICE_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_DEAD_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_BANNED_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_DEACTIVATED_USER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UsersCanNotCallReasonDto.CALLING_DELETED_USER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
