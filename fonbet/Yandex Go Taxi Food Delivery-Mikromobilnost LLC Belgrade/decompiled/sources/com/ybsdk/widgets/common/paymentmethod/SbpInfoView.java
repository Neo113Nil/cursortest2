package com.ybsdk.widgets.common.paymentmethod;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.NumberOptionView;
import com.ybsdk.widgets.common.ToolbarView;
import defpackage.cma1;
import defpackage.eaj0;
import defpackage.fch0;
import defpackage.mdq0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.smg0;
import defpackage.y561;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/widgets/common/paymentmethod/SbpInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmdq0;", "selectPaymentMethodListener", "Lzy11;", "setListener", "(Lmdq0;)V", "listenerSelect", "Lmdq0;", "Ly561;", "binding", "Ly561;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SbpInfoView extends ConstraintLayout {
    private final y561 binding;
    private mdq0 listenerSelect;

    public SbpInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_sbp_info_view_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.sbpInfoBackButton;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = fch0.sbpInfoFirstStep;
            if (((NumberOptionView) cma1.O(i2, inflate)) != null) {
                i2 = fch0.sbpInfoToolbar;
                if (((ToolbarView) cma1.O(i2, inflate)) != null) {
                    this.binding = new y561((ConstraintLayout) inflate, imageView);
                    imageView.setOnClickListener(new eaj0(7, this));
                    imageView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SbpInfoView sbpInfoView, View view) {
        mdq0 mdq0Var = sbpInfoView.listenerSelect;
        if (mdq0Var != null) {
            mdq0Var.onBackPressedFromSbp();
        }
    }

    public final void setListener(mdq0 selectPaymentMethodListener) {
        this.listenerSelect = selectPaymentMethodListener;
    }

    public SbpInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SbpInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SbpInfoView(Context context) {
        this(context, null, 0, 6, null);
    }
}
