package xsna;

import com.vk.auth.verification.base.states.CodeState;
import com.vk.superapp.api.dto.auth.VkAuthSmsInboxField;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.core.api.models.ValidationType;

/* compiled from: CodeStateUtils.kt */
/* loaded from: classes15.dex */
public final class ezf {

    /* compiled from: CodeStateUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                iArr[ValidationType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationType.CALL_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationType.PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkAuthValidatePhoneResult.ValidationType.values().length];
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_IVR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_CALL_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_MAX_MESSENGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_SMS_INBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_MAX_CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static CodeState a(ValidationType validationType, CodeState.SmsWait smsWait, com.vk.superapp.core.api.models.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = aVar.z;
        int i = validationType == null ? -1 : a.$EnumSwitchMapping$0[validationType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? smsWait : new CodeState.EmailWait(currentTimeMillis, j, aVar.y, aVar.t) : new CodeState.PushWait(currentTimeMillis, 0L, aVar.y, 2, null) : new CodeState.CallResetWait(currentTimeMillis, j, aVar.y) : new CodeState.SmsWait(currentTimeMillis, j, aVar.y);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CodeState b(VkAuthValidatePhoneResult.ValidationType validationType, CodeState codeState, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = vkAuthValidatePhoneResult.h;
        String str = vkAuthValidatePhoneResult.s;
        switch (validationType == null ? -1 : a.$EnumSwitchMapping$1[validationType.ordinal()]) {
            case 1:
                return new CodeState.SmsWait(currentTimeMillis, j, vkAuthValidatePhoneResult.k);
            case 2:
                return new CodeState.VoiceCallWait(currentTimeMillis, j);
            case 3:
                if (!vkAuthValidatePhoneResult.g) {
                    return new CodeState.CallResetWait(currentTimeMillis, j, vkAuthValidatePhoneResult.k);
                }
                String str2 = vkAuthValidatePhoneResult.l;
                if (str2 == null) {
                    str2 = "";
                }
                return new CodeState.CallResetPreview(str2);
            case 4:
                return new CodeState.PushWait(currentTimeMillis, 0L, vkAuthValidatePhoneResult.k, 2, null);
            case 5:
                return new CodeState.EmailWait(currentTimeMillis, j, vkAuthValidatePhoneResult.k, vkAuthValidatePhoneResult.n);
            case 6:
                return new CodeState.Passkey(vkAuthValidatePhoneResult.f == null);
            case 7:
                String str3 = vkAuthValidatePhoneResult.r;
                if (str3 != null && str != null) {
                    return new CodeState.MaxMessengerWait(currentTimeMillis, j, str3, str);
                }
                return codeState;
            case 8:
                VkAuthSmsInboxField vkAuthSmsInboxField = vkAuthValidatePhoneResult.t;
                if (vkAuthSmsInboxField != null) {
                    return new CodeState.SmsInbox(vkAuthSmsInboxField.b, vkAuthSmsInboxField.c, vkAuthSmsInboxField.d, vkAuthSmsInboxField.e);
                }
                return codeState;
            case 9:
                if (str != null) {
                    return new CodeState.MaxCodeWait(currentTimeMillis, j, 0, str, vkAuthValidatePhoneResult.u, false, 4, null);
                }
                return codeState;
            default:
                return codeState;
        }
    }

    public static CodeState c(VkAuthValidatePhoneResult vkAuthValidatePhoneResult, CodeState codeState) {
        if (vkAuthValidatePhoneResult == null) {
            return codeState;
        }
        CodeState b = b(vkAuthValidatePhoneResult.e, codeState, vkAuthValidatePhoneResult);
        CodeState.NotReceive notReceive = new CodeState.NotReceive(0L);
        CodeState b2 = b(vkAuthValidatePhoneResult.f, codeState, vkAuthValidatePhoneResult);
        b2.b = notReceive;
        notReceive.c = b2;
        b.getClass();
        notReceive.b = b;
        b.c = notReceive;
        return b;
    }
}
