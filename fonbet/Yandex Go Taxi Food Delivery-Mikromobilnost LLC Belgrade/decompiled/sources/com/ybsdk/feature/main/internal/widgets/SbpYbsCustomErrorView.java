package com.ybsdk.feature.main.internal.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.e861;
import defpackage.ebh0;
import defpackage.mnh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.xbg0;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/main/internal/widgets/SbpYbsCustomErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/utils/text/Text;", "text", "Lzy11;", "setText", "(Lcom/ybsdk/core/utils/text/Text;)V", "Lkotlin/Function0;", "action", "onPrimaryButtonClick", "(Lsls;)V", "", "isVisible", "renderPrimaryButton", "(Z)V", "Le861;", "binding", "Le861;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbpYbsCustomErrorView extends ConstraintLayout {
    private final e861 binding;

    public SbpYbsCustomErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(mnh0.ybsdk_screen_sbp_partners_error, this);
        int i2 = ebh0.errorNotFoundText;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = ebh0.errorRetryButtonCentral;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
            if (ybButtonView != null) {
                this.binding = new e861(this, textView, ybButtonView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void onPrimaryButtonClick(sls action) {
        this.binding.c.setOnClickListener(new xbg0(6, action));
    }

    public final void renderPrimaryButton(boolean isVisible) {
        this.binding.c.setVisibility(isVisible ? 0 : 8);
    }

    public final void setText(Text text) {
        xty0.d(this.binding.b, text);
    }

    public SbpYbsCustomErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SbpYbsCustomErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SbpYbsCustomErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
