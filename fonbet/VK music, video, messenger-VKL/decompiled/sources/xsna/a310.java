package xsna;

import com.vk.api.generated.market.dto.MarketCreateItemReviewCommentResponseDto;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarketItemReviewRepliesRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class a310 extends FunctionReferenceImpl implements izs<MarketCreateItemReviewCommentResponseDto, b4g0> {
    public static final a310 b = new a310(1, c4g0.class, "toReplyCreateResponse", "toReplyCreateResponse(Lcom/vk/api/generated/market/dto/MarketCreateItemReviewCommentResponseDto;)Lcom/vk/ecomm/reviews/impl/replies/domain/model/ReplyCreateResponse;", 1);

    @Override // xsna.izs
    public final b4g0 invoke(MarketCreateItemReviewCommentResponseDto marketCreateItemReviewCommentResponseDto) {
        MarketCreateItemReviewCommentResponseDto marketCreateItemReviewCommentResponseDto2 = marketCreateItemReviewCommentResponseDto;
        return new b4g0(marketCreateItemReviewCommentResponseDto2.d(), marketCreateItemReviewCommentResponseDto2.e());
    }
}
