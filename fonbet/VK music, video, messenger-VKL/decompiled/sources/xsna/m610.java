package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemsForReviewViewEvent.kt */
/* loaded from: classes18.dex */
public abstract class m610 {

    /* compiled from: MarketItemsForReviewViewEvent.kt */
    public static final class a extends m610 {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketItemsForReviewViewEvent.kt */
    public static final class b extends m610 {
        public final long a;
        public final UserId b;
        public final float c;

        public b(long j, UserId userId, float f) {
            this.a = j;
            this.b = userId;
            this.c = f;
        }
    }
}
