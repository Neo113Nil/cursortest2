package xsna;

import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewsRepository.kt */
/* loaded from: classes18.dex */
public interface t410 {

    /* compiled from: MarketItemReviewsRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final t410 STUB = new C3715a();

        /* compiled from: MarketItemReviewsRepository.kt */
        /* renamed from: xsna.t410$a$a, reason: collision with other inner class name */
        public static final class C3715a implements t410 {
            @Override // xsna.t410
            public final io.reactivex.rxjava3.core.x<MarketMarketItemFullDto> a(long j, long j2) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.t410
            public final io.reactivex.rxjava3.core.x<MarketGetItemReviewsResponseDto> b(UserId userId, long j, int i, rpz rpzVar) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.t410
            public final io.reactivex.rxjava3.core.x c(UserId userId, long j, int i) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.t410
            public final io.reactivex.rxjava3.core.x d(UserId userId, long j, int i) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final t410 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x<MarketMarketItemFullDto> a(long j, long j2);

    io.reactivex.rxjava3.core.x<MarketGetItemReviewsResponseDto> b(UserId userId, long j, int i, rpz rpzVar);

    io.reactivex.rxjava3.core.x c(UserId userId, long j, int i);

    io.reactivex.rxjava3.core.x d(UserId userId, long j, int i);
}
