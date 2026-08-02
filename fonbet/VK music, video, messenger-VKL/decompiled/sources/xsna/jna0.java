package xsna;

import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetDetailsResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsPaymentCardDto;

/* compiled from: PinReviewSubscriptionDetailDtoToDomainMapper.kt */
/* loaded from: classes18.dex */
public final class jna0 {

    /* compiled from: PinReviewSubscriptionDetailDtoToDomainMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CommunitySubscriptionsGetDetailsResponseDto.StatusDto.values().length];
            try {
                iArr[CommunitySubscriptionsGetDetailsResponseDto.StatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunitySubscriptionsGetDetailsResponseDto.StatusDto.SUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunitySubscriptionsGetDetailsResponseDto.StatusDto.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommunitySubscriptionsGetDetailsResponseDto.NextActionDto.values().length];
            try {
                iArr2[CommunitySubscriptionsGetDetailsResponseDto.NextActionDto.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CommunitySubscriptionsGetDetailsResponseDto.NextActionDto.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CommunitySubscriptionsPaymentCardDto.CardTypeDto.values().length];
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.JCB.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.DINERSCLUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.MIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.AMEX.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.MAESTRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.VISA.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.MASTERCARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CommunitySubscriptionsPaymentCardDto.CardTypeDto.CREDIT_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
