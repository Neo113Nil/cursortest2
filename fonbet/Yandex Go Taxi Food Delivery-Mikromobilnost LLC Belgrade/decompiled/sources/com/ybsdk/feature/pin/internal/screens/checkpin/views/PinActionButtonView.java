package com.ybsdk.feature.pin.internal.screens.checkpin.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.cma1;
import defpackage.fnb0;
import defpackage.fx00;
import defpackage.n761;
import defpackage.nbh0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.utb0;
import defpackage.v4b1;
import defpackage.xnh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/checkpin/views/PinActionButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "hideContent", "()V", "Lutb0;", "model", "showContent", "(Lutb0;)V", "Lkotlin/Function1;", "", "actionHandler", "setActionHandler", "(Ltls;)V", "render", "Ln761;", "binding", "Ln761;", "Ltls;", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinActionButtonView extends FrameLayout {
    private tls actionHandler;
    private final n761 binding;

    public PinActionButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(xnh0.ybsdk_screen_pin_action_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = nbh0.icon;
        ImageView imageView = (ImageView) cma1.O(i2, inflate);
        if (imageView != null) {
            i2 = nbh0.text;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                this.binding = new n761((LinearLayout) inflate, imageView, textView);
                this.actionHandler = new fnb0(2);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 actionHandler$lambda$0(String str) {
        return zy11.a;
    }

    private final void hideContent() {
        setOnClickListener(null);
        b.l(this);
    }

    private final void showContent(utb0 model) {
        this.binding.c.setText(model.a);
        v4b1.k(model.c, this.binding.b, null, null, 6);
        setOnClickListener(new fx00(23, this, model));
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showContent$lambda$1(PinActionButtonView pinActionButtonView, utb0 utb0Var, View view) {
        pinActionButtonView.actionHandler.invoke(utb0Var.b);
    }

    public final void render(utb0 model) {
        if (model == null) {
            hideContent();
        } else {
            showContent(model);
        }
    }

    public final void setActionHandler(tls actionHandler) {
        this.actionHandler = actionHandler;
    }

    public PinActionButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PinActionButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PinActionButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
