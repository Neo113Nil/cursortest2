package xsna;

import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsAdditionalInfoDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetDetailsResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsPaymentCardDto;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.CardType;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jna0;
import xsna.kna0;

/* compiled from: PinReviewRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class ina0 extends FunctionReferenceImpl implements izs<CommunitySubscriptionsGetDetailsResponseDto, kna0> {
    public static final ina0 b = new ina0(1, jna0.class, "toPinReviewSubscriptionDetails", "toPinReviewSubscriptionDetails(Lcom/vk/api/generated/communitySubscriptions/dto/CommunitySubscriptionsGetDetailsResponseDto;)Lcom/vk/ecomm/reviews/impl/pinnedreview/domain/PinReviewSubscriptionDetails;", 1);

    @Override // xsna.izs
    public final kna0 invoke(CommunitySubscriptionsGetDetailsResponseDto communitySubscriptionsGetDetailsResponseDto) {
        SubscriptionStatus subscriptionStatus;
        String str;
        CommunitySubscriptionsPaymentCardDto.CardTypeDto e;
        String description;
        CommunitySubscriptionsGetDetailsResponseDto communitySubscriptionsGetDetailsResponseDto2 = communitySubscriptionsGetDetailsResponseDto;
        int g = communitySubscriptionsGetDetailsResponseDto2.g();
        int i = jna0.a.$EnumSwitchMapping$0[communitySubscriptionsGetDetailsResponseDto2.k().ordinal()];
        if (i == 1) {
            subscriptionStatus = SubscriptionStatus.Active;
        } else if (i == 2) {
            subscriptionStatus = SubscriptionStatus.Suspended;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            subscriptionStatus = SubscriptionStatus.Canceled;
        }
        kna0.c cVar = new kna0.c(communitySubscriptionsGetDetailsResponseDto2.j().d(), communitySubscriptionsGetDetailsResponseDto2.j().e());
        int f = communitySubscriptionsGetDetailsResponseDto2.f();
        String l = communitySubscriptionsGetDetailsResponseDto2.l();
        CommunitySubscriptionsAdditionalInfoDto d = communitySubscriptionsGetDetailsResponseDto2.d();
        String str2 = "";
        if (d == null || (str = d.getTitle()) == null) {
            str = "";
        }
        CommunitySubscriptionsAdditionalInfoDto d2 = communitySubscriptionsGetDetailsResponseDto2.d();
        if (d2 != null && (description = d2.getDescription()) != null) {
            str2 = description;
        }
        kna0.a aVar = new kna0.a(str, str2);
        CommunitySubscriptionsPaymentCardDto i2 = communitySubscriptionsGetDetailsResponseDto2.i();
        CardType cardType = null;
        String d3 = i2 != null ? i2.d() : null;
        CommunitySubscriptionsPaymentCardDto i3 = communitySubscriptionsGetDetailsResponseDto2.i();
        if (i3 != null && (e = i3.e()) != null) {
            switch (jna0.a.$EnumSwitchMapping$2[e.ordinal()]) {
                case 1:
                    cardType = CardType.JCB;
                    break;
                case 2:
                    cardType = CardType.DINERSCLUB;
                    break;
                case 3:
                    cardType = CardType.MIR;
                    break;
                case 4:
                    cardType = CardType.AMEX;
                    break;
                case 5:
                    cardType = CardType.MAESTRO;
                    break;
                case 6:
                    cardType = CardType.VISA;
                    break;
                case 7:
                    cardType = CardType.MASTERCARD;
                    break;
                case 8:
                    cardType = CardType.CREDIT_CARD;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        kna0.b bVar = new kna0.b(d3, cardType);
        CommunitySubscriptionsGetDetailsResponseDto.NextActionDto e2 = communitySubscriptionsGetDetailsResponseDto2.e();
        int i4 = e2 == null ? -1 : jna0.a.$EnumSwitchMapping$1[e2.ordinal()];
        return new kna0(g, subscriptionStatus, cVar, f, l, aVar, bVar, i4 != 1 ? i4 != 2 ? SubscriptionAction.None : SubscriptionAction.Resume : SubscriptionAction.Suspend);
    }
}
