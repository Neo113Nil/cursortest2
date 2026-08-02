package com.yandex.go.order.tariffs_suggest.ui;

import android.content.Context;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.b6h0;
import defpackage.cma1;
import defpackage.fes0;
import defpackage.huh0;
import defpackage.l2y;
import defpackage.no40;
import defpackage.ny61;
import defpackage.qke;
import kotlin.Metadata;
import ru.yandex.taxi.plus.design.view.ShaderClipFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/order/tariffs_suggest/ui/SuggestTariffCashbackView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "setupIconShader", "()V", "", "cashbackValue", "setCashbackValue", "(Ljava/lang/String;)V", "Ll2y;", "binding", "Ll2y;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestTariffCashbackView extends GoFrameLayout {
    private final l2y binding;

    public SuggestTariffCashbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(huh0.layout_suggest_tariff_cashback, this);
        int i2 = b6h0.cashback_icon;
        if (((AppCompatImageView) cma1.O(i2, this)) != null) {
            i2 = b6h0.cashback_value;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = b6h0.gradient_icon_container;
                ShaderClipFrameLayout shaderClipFrameLayout = (ShaderClipFrameLayout) cma1.O(i2, this);
                if (shaderClipFrameLayout != null) {
                    this.binding = new l2y(this, robotoTextView, shaderClipFrameLayout);
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
        shaderClipFrameLayout.setOnSizeChangeListener(new no40(fes0Var, 1));
    }

    public final void setCashbackValue(String cashbackValue) {
        this.binding.b.setText(cashbackValue);
    }

    public SuggestTariffCashbackView(Context context) {
        this(context, null, 0);
    }

    public SuggestTariffCashbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
