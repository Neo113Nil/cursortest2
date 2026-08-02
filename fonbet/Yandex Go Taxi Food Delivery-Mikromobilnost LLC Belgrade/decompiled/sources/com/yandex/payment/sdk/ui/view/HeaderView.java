package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.fqa0;
import defpackage.mvt;
import defpackage.njb;
import defpackage.ny61;
import defpackage.o9h0;
import defpackage.sls;
import defpackage.tyh0;
import defpackage.xlh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/payment/sdk/ui/view/HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "Lkotlin/Function0;", "Lzy11;", "onBackButtonClick", "setBackButton", "(ZLsls;)V", "stringId", "setTitleText", "(Ljava/lang/Integer;)V", "", "title", "setTitleTextString", "(Ljava/lang/String;)V", "onActionButtonClick", "setActionButton", "(Ljava/lang/Integer;Lsls;)V", "onCloseButtonClick", "setCloseButton", "setBrandIconVisible", "(Z)V", "Lfqa0;", "binding", "Lfqa0;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderView extends ConstraintLayout {
    private final fqa0 binding;

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xlh0.paymentsdk_view_header, this);
        int i2 = o9h0.action_button;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = o9h0.back_button;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = o9h0.back_button_space;
                Space space = (Space) cma1.O(i2, this);
                if (space != null) {
                    i2 = o9h0.brand_icon;
                    ImageView imageView2 = (ImageView) cma1.O(i2, this);
                    if (imageView2 != null) {
                        i2 = o9h0.close_button;
                        ImageView imageView3 = (ImageView) cma1.O(i2, this);
                        if (imageView3 != null) {
                            i2 = o9h0.title_text;
                            TextView textView2 = (TextView) cma1.O(i2, this);
                            if (textView2 != null) {
                                i2 = o9h0.topContainer;
                                if (((ConstraintLayout) cma1.O(i2, this)) != null) {
                                    this.binding = new fqa0(this, textView, imageView, space, imageView2, imageView3, textView2);
                                    imageView.setVisibility(8);
                                    space.setVisibility(8);
                                    textView.setVisibility(8);
                                    imageView3.setVisibility(8);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setActionButton$default(HeaderView headerView, Integer num, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = new mvt(21);
        }
        headerView.setActionButton(num, slsVar);
    }

    public static /* synthetic */ void setBackButton$default(HeaderView headerView, boolean z, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = new mvt(20);
        }
        headerView.setBackButton(z, slsVar);
    }

    public static /* synthetic */ void setCloseButton$default(HeaderView headerView, boolean z, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = new mvt(22);
        }
        headerView.setCloseButton(z, slsVar);
    }

    public final void setActionButton(Integer stringId, sls onActionButtonClick) {
        fqa0 fqa0Var = this.binding;
        if (stringId == null) {
            fqa0Var.b.setVisibility(8);
            return;
        }
        fqa0Var.b.setVisibility(0);
        this.binding.b.setText(stringId.intValue());
        this.binding.b.setContentDescription(getContext().getString(tyh0.paymentsdk_prebuilt_button_text_content_description, getContext().getString(stringId.intValue())));
        this.binding.b.setOnClickListener(new njb(10, onActionButtonClick));
    }

    public final void setBackButton(boolean visible, sls onBackButtonClick) {
        this.binding.c.setVisibility(visible ? 0 : 8);
        this.binding.c.setOnClickListener(new njb(12, onBackButtonClick));
        this.binding.d.setVisibility(visible ? 0 : 8);
    }

    public final void setBrandIconVisible(boolean visible) {
        this.binding.e.setVisibility(visible ? 0 : 8);
    }

    public final void setCloseButton(boolean visible, sls onCloseButtonClick) {
        this.binding.f.setVisibility(visible ? 0 : 8);
        this.binding.f.setOnClickListener(new njb(11, onCloseButtonClick));
    }

    public final void setTitleText(Integer stringId) {
        String str;
        if (stringId != null) {
            str = getContext().getString(stringId.intValue());
        } else {
            str = null;
        }
        setTitleTextString(str);
    }

    public final void setTitleTextString(String title) {
        fqa0 fqa0Var = this.binding;
        if (title == null) {
            fqa0Var.g.setVisibility(8);
        } else {
            fqa0Var.g.setVisibility(0);
            this.binding.g.setText(title);
        }
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
