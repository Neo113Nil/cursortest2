package com.ybsdk.feature.transfer.internal.screens.common.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.bch0;
import defpackage.cma1;
import defpackage.moh0;
import defpackage.ny61;
import defpackage.o961;
import defpackage.sls;
import defpackage.xbg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/screens/common/widgets/TransferErrorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lzy11;", "listener", "setOnRetryClickListener", "(Lsls;)V", "Lo961;", "binding", "Lo961;", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferErrorView extends ConstraintLayout {
    private final o961 binding;

    public TransferErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(moh0.ybsdk_transfer_error_view_layout, this);
        int i2 = bch0.buttonRetry;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
        if (ybButtonView != null) {
            i2 = bch0.errorText;
            if (((TextView) cma1.O(i2, this)) != null) {
                this.binding = new o961(this, ybButtonView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setOnRetryClickListener(sls listener) {
        this.binding.b.setOnClickListener(new xbg0(16, listener));
    }

    public TransferErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TransferErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TransferErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
