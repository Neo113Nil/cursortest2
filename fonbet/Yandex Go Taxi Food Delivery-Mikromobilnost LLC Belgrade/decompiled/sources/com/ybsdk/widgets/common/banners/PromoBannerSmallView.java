package com.ybsdk.widgets.common.banners;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ImageViewWithAspectRatio;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.o461;
import defpackage.plf0;
import defpackage.poh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/widgets/common/banners/PromoBannerSmallView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lplf0;", ClidProvider.STATE, "Lzy11;", "render", "(Lplf0;)Lzy11;", "Landroid/view/View$OnClickListener;", "onCloseClickListener", "setOnCloseClickListener", "(Landroid/view/View$OnClickListener;)V", "Lo461;", "binding", "Lo461;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoBannerSmallView extends ConstraintLayout {
    private final o461 binding;

    public PromoBannerSmallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_promo_banner_small_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.smallBannerCloseButton;
        CloseBannerButtonView closeBannerButtonView = (CloseBannerButtonView) cma1.O(i2, inflate);
        if (closeBannerButtonView != null) {
            i2 = fch0.smallBannerImage;
            ImageViewWithAspectRatio imageViewWithAspectRatio = (ImageViewWithAspectRatio) cma1.O(i2, inflate);
            if (imageViewWithAspectRatio != null) {
                i2 = fch0.smallBannerMessage;
                TextView textView = (TextView) cma1.O(i2, inflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.binding = new o461(constraintLayout, closeBannerButtonView, imageViewWithAspectRatio, textView);
                    constraintLayout.setClipToOutline(true);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setOnCloseClickListener$default(PromoBannerSmallView promoBannerSmallView, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            onClickListener = null;
        }
        promoBannerSmallView.setOnCloseClickListener(onClickListener);
    }

    public final zy11 render(plf0 state) {
        throw null;
    }

    public final void setOnCloseClickListener(View.OnClickListener onCloseClickListener) {
        this.binding.b.setOnClickListener(onCloseClickListener);
    }

    public PromoBannerSmallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PromoBannerSmallView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PromoBannerSmallView(Context context) {
        this(context, null, 0, 6, null);
    }
}
