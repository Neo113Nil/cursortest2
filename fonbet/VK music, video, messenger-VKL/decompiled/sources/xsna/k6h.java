package xsna;

import android.content.Context;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: CommunityItemsForReviewDelegate.kt */
/* loaded from: classes18.dex */
public interface k6h {
    void a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, px0 px0Var);

    void b(Context context, UserId userId, boolean z);

    /* compiled from: CommunityItemsForReviewDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final k6h STUB = new C3166a();

        public final k6h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityItemsForReviewDelegate.kt */
        /* renamed from: xsna.k6h$a$a, reason: collision with other inner class name */
        public static final class C3166a implements k6h {
            @Override // xsna.k6h
            public final void a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, px0 px0Var) {
            }

            @Override // xsna.k6h
            public final void b(Context context, UserId userId, boolean z) {
            }
        }
    }
}
