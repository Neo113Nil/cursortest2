package xsna;

import android.graphics.Rect;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import xsna.cuu0;

/* compiled from: RecommendationsCarouselItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class rbf0 extends wtu0 {
    public final /* synthetic */ pbf0 h;

    /* compiled from: RecommendationsCarouselItemHolderV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecommendationsItemSizeStyle.values().length];
            try {
                iArr[RecommendationsItemSizeStyle.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rbf0(pbf0 pbf0Var) {
        this.h = pbf0Var;
        pbf0Var.itemView.getContext();
    }

    @Override // xsna.wtu0, xsna.cuu0.b
    public final Rect a(cuu0.a aVar) {
        pbf0 pbf0Var = this.h;
        boolean z = pbf0Var.q != RecommendationsItemBackgroundStyle.TRANSPARENT;
        int b = z ? cn70.b(16) : cn70.b(0);
        if (a.$EnumSwitchMapping$0[pbf0Var.r.ordinal()] == 1) {
            return new Rect(b, cn70.b(8), b, cn70.b(0));
        }
        Rect a2 = super.a(aVar);
        return new Rect(z ? a2.left : cn70.b(0), a2.top, z ? a2.right : cn70.b(0), a2.bottom);
    }

    @Override // xsna.wtu0, xsna.cuu0.b
    public final cuu0.b.C2687b b(cuu0.a aVar) {
        return a.$EnumSwitchMapping$0[this.h.r.ordinal()] == 1 ? new cuu0.b.C2687b(14.0f, 12.0f, 12.0f) : super.b(aVar);
    }

    @Override // xsna.wtu0, xsna.cuu0.b
    public final Rect d(cuu0.a aVar) {
        pbf0 pbf0Var = this.h;
        boolean z = pbf0Var.q != RecommendationsItemBackgroundStyle.TRANSPARENT;
        int b = z ? cn70.b(8) : cn70.b(0);
        if (a.$EnumSwitchMapping$0[pbf0Var.r.ordinal()] == 1) {
            return new Rect(b, cn70.b(8), b, cn70.b(12));
        }
        Rect d = super.d(aVar);
        return new Rect(z ? d.left : cn70.b(0), d.top, z ? d.right : cn70.b(0), d.bottom);
    }
}
