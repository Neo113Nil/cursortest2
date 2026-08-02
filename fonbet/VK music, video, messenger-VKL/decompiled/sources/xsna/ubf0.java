package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemImageCornersRoundingStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationsCarouselSkeletonItemHolder.kt */
/* loaded from: classes4.dex */
public final class ubf0 extends vif0<Boolean> {
    public final ShimmerFrameLayout n;
    public final View o;

    /* compiled from: RecommendationsCarouselSkeletonItemHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ActionButtonStyle.values().length];
            try {
                iArr[ActionButtonStyle.PrimaryWithNoShadow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionButtonStyle.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionButtonStyle.ContentInverse.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsItemImageStyle.values().length];
            try {
                iArr2[RecommendationsItemImageStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationsItemImageStyle.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RecommendationsItemSizeStyle.values().length];
            try {
                iArr3[RecommendationsItemSizeStyle.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubf0(ViewGroup viewGroup, ActionButtonStyle actionButtonStyle, RecommendationsItemImageStyle recommendationsItemImageStyle, RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle, RecommendationsItemSizeStyle recommendationsItemSizeStyle) {
        super(viewGroup, R.layout.holder_recommendations_carousel_skeleton_item, 0);
        int i;
        viewGroup.getContext();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer);
        this.n = shimmerFrameLayout;
        View findViewById = this.itemView.findViewById(R.id.img);
        this.o = findViewById;
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        Shimmer.c e = ((Shimmer.c) ((Shimmer.c) cVar.d()).g(1.0f).h()).e(800L);
        e.a.q = new pkk(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
        shimmerFrameLayout.b(e.a());
        int i2 = actionButtonStyle == null ? -1 : a.$EnumSwitchMapping$0[actionButtonStyle.ordinal()];
        if (i2 == -1) {
            bwt0.p0(this.itemView.findViewById(R.id.button_container), false);
            View findViewById2 = this.itemView.findViewById(R.id.line2);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = cn70.b(8);
                bVar.l = 0;
                findViewById2.setLayoutParams(bVar);
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.itemView.getContext();
            int b = cn70.b(8);
            this.itemView.getContext();
            View findViewById3 = this.itemView.findViewById(R.id.button_container);
            bwt0.e0(findViewById3, b, cn70.b(8), b, cn70.b(8));
            findViewById3.setForeground(abg0Var.b(R.drawable.bg_rounded_10, R.attr.vk_ui_background_content));
            this.itemView.findViewById(R.id.button_title).setVisibility(4);
            this.itemView.findViewById(R.id.icon).setVisibility(4);
        }
        Context context = this.itemView.getContext();
        int i3 = a.$EnumSwitchMapping$1[recommendationsItemImageStyle.ordinal()];
        int i4 = R.dimen.recomm_carousel_item_width;
        if (i3 == 1) {
            i = recommendationsItemSizeStyle == RecommendationsItemSizeStyle.LARGE ? R.dimen.recomm_carousel_large_item_width : R.dimen.recomm_carousel_item_width;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.dimen.recomm_carousel_portrait_image_height;
        }
        int a2 = e3m.a(i, context);
        int a3 = e3m.a((recommendationsItemSizeStyle != null ? a.$EnumSwitchMapping$2[recommendationsItemSizeStyle.ordinal()] : -1) == 1 ? R.dimen.recomm_carousel_large_item_width : i4, this.itemView.getContext());
        if (recommendationsItemImageCornersRoundingStyle == RecommendationsItemImageCornersRoundingStyle.TOP) {
            this.itemView.getContext();
            findViewById.setBackgroundResource(R.drawable.recommendations_carousel_image_bg_top_corners_rounded);
        }
        f4m.o(a3, a2, findViewById);
        bwt0.r0(a3, this.itemView);
    }

    @Override // xsna.vif0
    public final void i6(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ShimmerFrameLayout shimmerFrameLayout = this.n;
        if (booleanValue) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.a();
        }
    }
}
