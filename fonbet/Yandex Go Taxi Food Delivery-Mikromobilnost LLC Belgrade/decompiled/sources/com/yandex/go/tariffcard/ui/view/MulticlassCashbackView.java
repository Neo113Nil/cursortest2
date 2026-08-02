package com.yandex.go.tariffcard.ui.view;

import android.content.Context;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.fes0;
import defpackage.no40;
import defpackage.ny61;
import defpackage.oo40;
import defpackage.qke;
import defpackage.xng0;
import defpackage.xrh0;
import defpackage.yfh0;
import kotlin.Metadata;
import ru.yandex.taxi.plus.design.view.ShaderClipFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/tariffcard/ui/view/MulticlassCashbackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "setupIconShader", "()V", "", "cashbackValue", "setCashbackValue", "(Ljava/lang/String;)V", "invalidateCashbackColor", "Loo40;", "binding", "Loo40;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MulticlassCashbackView extends FrameLayout {
    private final oo40 binding;

    public MulticlassCashbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xrh0.multiclass_cashback_view, this);
        int i2 = yfh0.cashback_icon;
        if (((AppCompatImageView) cma1.O(i2, this)) != null) {
            i2 = yfh0.cashback_value;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = yfh0.gradient_icon_container;
                ShaderClipFrameLayout shaderClipFrameLayout = (ShaderClipFrameLayout) cma1.O(i2, this);
                if (shaderClipFrameLayout != null) {
                    this.binding = new oo40(this, robotoTextView, shaderClipFrameLayout);
                    setupIconShader();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setupIconShader() {
        fes0 fes0Var = new fes0(qke.f, qke.k, qke.m, Shader.TileMode.REPEAT);
        ShaderClipFrameLayout shaderClipFrameLayout = this.binding.c;
        shaderClipFrameLayout.updateShader(fes0Var.b());
        shaderClipFrameLayout.setOnSizeChangeListener(new no40(fes0Var, 0));
    }

    public final void invalidateCashbackColor() {
        this.binding.b.setTextColor(new bdc(xng0.textMain));
    }

    public final void setCashbackValue(String cashbackValue) {
        this.binding.b.setText(cashbackValue);
    }

    public MulticlassCashbackView(Context context) {
        this(context, null, 0);
    }

    public MulticlassCashbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
