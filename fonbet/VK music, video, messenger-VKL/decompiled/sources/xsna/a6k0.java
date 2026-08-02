package xsna;

import com.vk.api.generated.auth.dto.AuthUserDto;
import com.vk.auth.smartflow.api.data.AdditionalVerificationMethods;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SmartflowResponsesDtoMappers.kt */
/* loaded from: classes15.dex */
public final class a6k0 {

    /* compiled from: SmartflowResponsesDtoMappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkAuthValidateAccountResponse.NextStep.VerificationMethod.values().length];
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.CALLRESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.CODEGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.PASSKEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.RESERVE_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.OFFICIAL_MESSENGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.LIBVERIFY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.MAX_MESSENGER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.MAX_OTP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.CONNECT_INTERNAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.TRUSTED_HASH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VkAuthValidateAccountResponse.NextStep.VerificationMethod.BLOCKED_WITHOUT_PHONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VerificationMethodState a(VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod) {
        switch (a.$EnumSwitchMapping$0[verificationMethod.ordinal()]) {
            case 1:
                return VerificationMethodTypes.CALLRESET;
            case 2:
                return VerificationMethodTypes.CODEGEN;
            case 3:
                return VerificationMethodTypes.EMAIL;
            case 4:
                return VerificationMethodTypes.PASSKEY;
            case 5:
                return VerificationMethodTypes.PASSWORD;
            case 6:
                return VerificationMethodTypes.PUSH;
            case 7:
                return VerificationMethodTypes.RESERVE_CODE;
            case 8:
                return VerificationMethodTypes.SMS;
            case 9:
                return VerificationMethodTypes.OFFICIAL_MESSENGER;
            case 10:
                return AdditionalVerificationMethods.LIBVERIFY;
            case 11:
                return VerificationMethodTypes.MAX_MESSENGER;
            case 12:
                return VerificationMethodTypes.MAX_OTP_CODE;
            case 13:
                throw new IllegalStateException("VerificationMethod.CONNECT_INTERNAL must not be used in method selection");
            case 14:
                throw new IllegalStateException("VerificationMethod.TRUSTED_HASH must not be used in method selection");
            case 15:
                throw new IllegalStateException("VerificationMethod.BLOCKED_WITHOUT_PHONE must not be used in method selection");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final VkAuthProfileInfo b(AuthUserDto authUserDto) {
        String e = authUserDto.e();
        String i = authUserDto.i();
        boolean f = authUserDto.f();
        String k = authUserDto.k();
        String j = authUserDto.j();
        if (j == null) {
            j = "";
        }
        Boolean d = authUserDto.d();
        boolean booleanValue = d != null ? d.booleanValue() : false;
        Boolean g = authUserDto.g();
        return new VkAuthProfileInfo(e, i, f, k, j, booleanValue, g != null ? g.booleanValue() : false);
    }
}
