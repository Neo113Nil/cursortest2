package com.ybsdk.core.transfer.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.d;
import defpackage.cma1;
import defpackage.ga61;
import defpackage.mah0;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.of11;
import defpackage.px11;
import defpackage.rbv;
import defpackage.tls;
import defpackage.umh0;
import defpackage.v4b1;
import defpackage.vmu0;
import defpackage.vng;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/core/transfer/utils/UnconditionalWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/utils/ColorModel;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lzy11;", "setWidgetBackground", "(Lcom/ybsdk/core/utils/ColorModel;)V", "Lpx11;", ClidProvider.STATE, "render", "(Lpx11;)V", "Lkotlin/Function1;", "clickListener", "setClickListener", "(Ltls;)V", "Lga61;", "binding", "Lga61;", "listener", "Ltls;", "currentState", "Lpx11;", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnconditionalWidget extends ConstraintLayout {
    private final ga61 binding;
    private px11 currentState;
    private tls listener;

    public UnconditionalWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(umh0.ybsdk_transfer_unconditional_widget, this);
        int i2 = mah0.unconditionalWidgetDescription;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = mah0.unconditionalWidgetIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                this.binding = new ga61(this, textView, appCompatImageView);
                this.listener = new of11(14);
                setOnClickListener(new vmu0(25, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(UnconditionalWidget unconditionalWidget, View view) {
        px11 px11Var = unconditionalWidget.currentState;
        if (px11Var != null) {
            unconditionalWidget.listener.invoke(px11Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 listener$lambda$0(px11 px11Var) {
        return zy11.a;
    }

    private final void setWidgetBackground(ColorModel backgroundColor) {
        Drawable mutate = vng.t(nyg0.ybsdk_circle_button_background, getContext()).mutate();
        mutate.setTint(backgroundColor.get(getContext()));
        setBackground(mutate);
    }

    public final void render(px11 state) {
        TextView textView = this.binding.b;
        textView.setText(d.a(textView.getContext(), state.a));
        textView.setTextColor(state.d.get(textView.getContext()));
        setWidgetBackground(state.c);
        AppCompatImageView appCompatImageView = this.binding.c;
        rbv rbvVar = state.b;
        appCompatImageView.setVisibility(rbvVar == null ? 4 : 0);
        if (rbvVar != null) {
            v4b1.k(rbvVar, this.binding.c, null, null, 6);
        }
        this.currentState = state;
    }

    public final void setClickListener(tls clickListener) {
        this.listener = clickListener;
    }

    public UnconditionalWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ UnconditionalWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public UnconditionalWidget(Context context) {
        this(context, null, 0, 6, null);
    }
}
