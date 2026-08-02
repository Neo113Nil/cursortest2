package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewRepliesPatch.kt */
/* loaded from: classes18.dex */
public final class z210 implements com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k {
    public final UserId a;

    public z210(UserId userId) {
        this.a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z210) && epx.f(this.a, ((z210) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ReplyFromChanged(userReplyFrom="), this.a, ')');
    }
}
