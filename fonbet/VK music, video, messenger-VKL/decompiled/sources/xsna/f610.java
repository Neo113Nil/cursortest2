package xsna;

import com.vk.api.generated.market.dto.MarketGetItemsForReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemsForReviewRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class f610 implements e610 {
    public final y6i a;
    public final t510 b;
    public MarketGetItemsForReviewViewTypeDto c;
    public MarketGetItemsForReviewResponseDto d;

    /* compiled from: MarketItemsForReviewRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketGetItemsForReviewViewTypeDto.values().length];
            try {
                iArr[MarketGetItemsForReviewViewTypeDto.COMMUNITY_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f610() {
        y6i y6iVar = new y6i();
        t510 t510Var = new t510();
        this.a = y6iVar;
        this.b = t510Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[Catch: all -> 0x0009, TRY_LEAVE, TryCatch #0 {all -> 0x0009, blocks: (B:39:0x0004, B:8:0x0011, B:10:0x0015, B:14:0x001b, B:4:0x000d, B:7:0x0010, B:34:0x00a1, B:6:0x000e), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: all -> 0x0009, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0009, blocks: (B:39:0x0004, B:8:0x0011, B:10:0x0015, B:14:0x001b, B:4:0x000d, B:7:0x0010, B:34:0x00a1, B:6:0x000e), top: B:38:0x0004, inners: #1 }] */
    @Override // xsna.e610
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<MarketGetItemsForReviewResponseDto> a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, Integer num, Long l, boolean z) {
        MarketGetItemsForReviewResponseDto marketGetItemsForReviewResponseDto;
        synchronized (this) {
            if (!z) {
                try {
                    if (this.c != marketGetItemsForReviewViewTypeDto) {
                    }
                    marketGetItemsForReviewResponseDto = this.d;
                    if (marketGetItemsForReviewResponseDto == null) {
                        return io.reactivex.rxjava3.core.x.k(marketGetItemsForReviewResponseDto);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    yd10 yd10Var = (yd10) this.a.b;
                    Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
                    yd10Var.getClass();
                    tfx tfxVar = new tfx("market.getItemsForReview", new gr(19), new dn(21));
                    if (marketGetItemsForReviewViewTypeDto != null) {
                        tfx.o(tfxVar, "view_type", marketGetItemsForReviewViewTypeDto.i(), 0, 0, 12);
                    }
                    if (userId != null) {
                        tfx.n(tfxVar, "community_id", userId, 0L, 0L, 12);
                    }
                    if (num != null) {
                        tfx.l(tfxVar, "order_id", num.intValue(), 0, 0, 12);
                    }
                    if (valueOf != null) {
                        tfx.l(tfxVar, "item_id", valueOf.intValue(), 0, 0, 12);
                    }
                    return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(tfxVar)), new k41(new bv1(22, this, marketGetItemsForReviewViewTypeDto), 27));
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this) {
                this.d = null;
                marketGetItemsForReviewResponseDto = this.d;
                if (marketGetItemsForReviewResponseDto == null) {
                }
            }
        }
    }
}
