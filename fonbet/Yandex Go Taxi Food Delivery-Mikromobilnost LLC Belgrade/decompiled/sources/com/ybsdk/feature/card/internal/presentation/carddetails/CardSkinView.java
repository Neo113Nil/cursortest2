package com.ybsdk.feature.card.internal.presentation.carddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.anh0;
import defpackage.cma1;
import defpackage.dp8;
import defpackage.jiu;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sa61;
import defpackage.sah0;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddetails/CardSkinView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldp8;", ClidProvider.STATE, "Lzy11;", "render", "(Ldp8;)V", "Lsa61;", "binding", "Lsa61;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardSkinView extends FrameLayout {
    private final sa61 binding;

    public CardSkinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(anh0.ybsdk_view_card_skin, this);
        int i2 = sah0.cardImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = sah0.cardShimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i2, this);
            if (shimmerFrameLayout != null) {
                i2 = sah0.samsungPayLayer;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                if (appCompatImageView2 != null) {
                    this.binding = new sa61(this, appCompatImageView, shimmerFrameLayout, appCompatImageView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(dp8 state) {
        sa61 sa61Var = this.binding;
        v4b1.j(state.a, sa61Var.b, false, new jiu(13), new qu(14));
        v4b1.k(state.b, sa61Var.d, null, null, 6);
        boolean z = state.c;
        ShimmerFrameLayout shimmerFrameLayout = sa61Var.c;
        if (z) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
    }

    public CardSkinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CardSkinView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CardSkinView(Context context) {
        this(context, null, 0, 6, null);
    }
}
