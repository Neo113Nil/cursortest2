package xsna;

import com.vk.api.generated.market.dto.MarketGetItemsForReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemsForReviewRepository.kt */
/* loaded from: classes18.dex */
public interface e610 {

    /* compiled from: MarketItemsForReviewRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final e610 STUB = new C2781a();

        /* compiled from: MarketItemsForReviewRepository.kt */
        /* renamed from: xsna.e610$a$a, reason: collision with other inner class name */
        public static final class C2781a implements e610 {
            @Override // xsna.e610
            public final io.reactivex.rxjava3.core.x<MarketGetItemsForReviewResponseDto> a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, Integer num, Long l, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final e610 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x<MarketGetItemsForReviewResponseDto> a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, Integer num, Long l, boolean z);
}
