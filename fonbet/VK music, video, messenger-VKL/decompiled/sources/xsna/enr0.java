package xsna;

import android.content.Context;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.dto.common.ImageSizeKey;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationMethodToUiStateMapper.kt */
/* loaded from: classes3.dex */
public final class enr0 {
    public final Context a;

    /* compiled from: VerificationMethodToUiStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodTypes.values().length];
            try {
                iArr[VerificationMethodTypes.CODEGEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMethodTypes.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMethodTypes.PASSKEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationMethodTypes.PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationMethodTypes.PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationMethodTypes.SMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationMethodTypes.CALLRESET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public enr0(Context context) {
        this.a = context;
    }

    public final String a(VerificationMethodTypes verificationMethodTypes, String str) {
        int i;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[verificationMethodTypes.ordinal()]) {
            case 1:
                i = R.string.vk_otp_method_selection_verification_methods_code_gen_subtitle;
                break;
            case 2:
                i = R.string.vk_otp_method_selection_verification_methods_email_subtitle;
                break;
            case 3:
                i = R.string.vk_otp_method_selection_verification_methods_one_pass_subtitle;
                break;
            case 4:
                i = R.string.vk_otp_method_selection_verification_methods_password_subtitle;
                break;
            case 5:
                i = R.string.vk_otp_method_selection_verification_methods_push_subtitle;
                break;
            case 6:
                i = R.string.vk_otp_method_selection_verification_methods_reserve_codes_subtitle;
                break;
            case 7:
            case 8:
                i = R.string.vk_otp_method_selection_verification_methods_sms_subtitle;
                break;
            case 9:
                i = R.string.vk_otp_method_selection_verification_methods_max_messenger_subtitle;
                break;
            case 10:
                i = R.string.vk_otp_method_selection_verification_methods_official_messenger_subtitle;
                break;
            case 11:
                i = R.string.vk_otp_method_selection_verification_methods_max_otp_subtitle;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = this.a.getString(i);
        switch (iArr[verificationMethodTypes.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return string;
            case 2:
            case 7:
            case 8:
                return String.format(string, Arrays.copyOf(new Object[]{str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183)}, 1));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
