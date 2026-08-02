package xsna;

import com.vk.api.generated.ecosystem.dto.EcosystemValidationInfoSmsinboxDto;

/* compiled from: SmsInboxValidationStatus.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class u6k0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[EcosystemValidationInfoSmsinboxDto.StatusDto.values().length];
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.WRONG_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.WRONG_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.OK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
