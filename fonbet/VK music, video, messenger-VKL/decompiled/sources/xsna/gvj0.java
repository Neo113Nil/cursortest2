package xsna;

import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;

/* compiled from: SinglePhotoHolderState.kt */
/* loaded from: classes4.dex */
public final class gvj0 {
    public final boolean a;
    public final boolean b;
    public final FeedGoodsPhotoHolder.GoodsVisibilityState c;

    public gvj0() {
        this(0);
    }

    public static gvj0 a(gvj0 gvj0Var, FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState, int i) {
        boolean z = (i & 1) != 0 ? gvj0Var.a : true;
        boolean z2 = (i & 2) != 0 ? gvj0Var.b : true;
        if ((i & 4) != 0) {
            goodsVisibilityState = gvj0Var.c;
        }
        return new gvj0(z, z2, goodsVisibilityState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvj0)) {
            return false;
        }
        gvj0 gvj0Var = (gvj0) obj;
        return this.a == gvj0Var.a && this.b == gvj0Var.b && this.c == gvj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "SinglePhotoHolderState(isZoomPhotoAnimated=" + this.a + ", isMarketButtonAnimationWasPlayed=" + this.b + ", productPinsVisibleState=" + this.c + ')';
    }

    public gvj0(boolean z, boolean z2, FeedGoodsPhotoHolder.GoodsVisibilityState goodsVisibilityState) {
        this.a = z;
        this.b = z2;
        this.c = goodsVisibilityState;
    }

    public /* synthetic */ gvj0(int i) {
        this(false, false, FeedGoodsPhotoHolder.GoodsVisibilityState.NOT_DRAWN);
    }
}
