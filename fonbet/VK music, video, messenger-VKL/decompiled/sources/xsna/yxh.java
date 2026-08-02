package xsna;

import com.vk.api.generated.market.dto.MarketCreateCommunityReviewCommentResponseDto;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityReviewRepliesInteractor.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class yxh extends FunctionReferenceImpl implements izs<MarketCreateCommunityReviewCommentResponseDto, b4g0> {
    public static final yxh b = new yxh(1, c4g0.class, "toReplyCreateResponse", "toReplyCreateResponse(Lcom/vk/api/generated/market/dto/MarketCreateCommunityReviewCommentResponseDto;)Lcom/vk/ecomm/reviews/impl/replies/domain/model/ReplyCreateResponse;", 1);

    @Override // xsna.izs
    public final b4g0 invoke(MarketCreateCommunityReviewCommentResponseDto marketCreateCommunityReviewCommentResponseDto) {
        MarketCreateCommunityReviewCommentResponseDto marketCreateCommunityReviewCommentResponseDto2 = marketCreateCommunityReviewCommentResponseDto;
        return new b4g0(marketCreateCommunityReviewCommentResponseDto2.d(), marketCreateCommunityReviewCommentResponseDto2.e());
    }
}
