package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.sc70;
import defpackage.tc70;
import defpackage.uc70;
import defpackage.v4b1;
import defpackage.w361;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/widgets/common/OperationStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldAnimateStatusIcon", "Lcom/ybsdk/widgets/common/OperationProgressView$Animation;", "getAnimationSetting", "(Z)Lcom/ybsdk/widgets/common/OperationProgressView$Animation;", "Luc70;", ClidProvider.STATE, "Lzy11;", "render", "(Luc70;)V", "Lw361;", "binding", "Lw361;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OperationStatusView extends ConstraintLayout {
    private final w361 binding;

    public OperationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_operation_status_layout, this);
        int i2 = fch0.operationStatusIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = fch0.operationStatusProgress;
            OperationProgressView operationProgressView = (OperationProgressView) cma1.O(i2, this);
            if (operationProgressView != null) {
                i2 = fch0.operationStatusProgressSmall;
                OperationProgressView operationProgressView2 = (OperationProgressView) cma1.O(i2, this);
                if (operationProgressView2 != null) {
                    this.binding = new w361(this, appCompatImageView, operationProgressView, operationProgressView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final OperationProgressView.Animation getAnimationSetting(boolean shouldAnimateStatusIcon) {
        return shouldAnimateStatusIcon ? OperationProgressView.Animation.Required : OperationProgressView.Animation.Skipped;
    }

    public final void render(uc70 state) {
        w361 w361Var = this.binding;
        if (state instanceof sc70) {
            OperationProgressView operationProgressView = w361Var.c;
            AppCompatImageView appCompatImageView = w361Var.b;
            OperationProgressView operationProgressView2 = w361Var.d;
            operationProgressView.setVisibility(8);
            operationProgressView2.setVisibility(0);
            appCompatImageView.setVisibility(0);
            sc70 sc70Var = (sc70) state;
            v4b1.k(sc70Var.a, appCompatImageView, null, null, 6);
            operationProgressView2.configureAnimation(getAnimationSetting(sc70Var.c));
            operationProgressView2.render(sc70Var.b);
            return;
        }
        if (!(state instanceof tc70)) {
            w511.b();
            return;
        }
        OperationProgressView operationProgressView3 = w361Var.c;
        operationProgressView3.setVisibility(0);
        w361Var.d.setVisibility(8);
        w361Var.b.setVisibility(8);
        tc70 tc70Var = (tc70) state;
        operationProgressView3.configureAnimation(getAnimationSetting(tc70Var.b));
        operationProgressView3.render(tc70Var.a);
    }

    public OperationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ OperationStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public OperationStatusView(Context context) {
        this(context, null, 0, 6, null);
    }
}
