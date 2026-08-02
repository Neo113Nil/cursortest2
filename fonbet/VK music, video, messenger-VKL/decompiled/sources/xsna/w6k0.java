package xsna;

import com.vk.api.generated.ecosystem.dto.EcosystemValidationInfoSmsinboxDto;

/* compiled from: SmsInboxViewState.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class w6k0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[EcosystemValidationInfoSmsinboxDto.StatusDto.values().length];
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.WRONG_PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.WRONG_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EcosystemValidationInfoSmsinboxDto.StatusDto.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
