package com.yandex.payment.divkit.select;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import defpackage.cma1;
import defpackage.hmk;
import defpackage.i891;
import defpackage.imk;
import defpackage.jl40;
import defpackage.jmg0;
import defpackage.jmk;
import defpackage.kmk;
import defpackage.l9h0;
import defpackage.lpg0;
import defpackage.mng0;
import defpackage.ny61;
import defpackage.ulh0;
import defpackage.uxh;
import defpackage.w511;
import defpackage.zpa0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/payment/divkit/select/DivCvvNumber;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkmk;", ClidProvider.STATE, "Lzy11;", "applyStateForAnimation", "(Lkmk;)V", "setState", "Lkmk;", "Lzpa0;", "binding", "Lzpa0;", "textColor", CA20Status.STATUS_USER_I, "successColor", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DivCvvNumber extends FrameLayout {
    private final zpa0 binding;
    private kmk state;
    private final int successColor;
    private final int textColor;

    public DivCvvNumber(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.state = hmk.d;
        View inflate = LayoutInflater.from(context).inflate(ulh0.paymentsdk_number_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = l9h0.paymentsdk_number_view_cursor;
        View O = cma1.O(i2, inflate);
        if (O != null) {
            i2 = l9h0.paymentsdk_number_view_number;
            TextView textView = (TextView) cma1.O(i2, inflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.binding = new zpa0(constraintLayout, O, textView);
                this.textColor = i891.i(constraintLayout.getContext().getTheme(), mng0.paymentsdk_cvv_input_text_color);
                this.successColor = constraintLayout.getContext().getColor(lpg0.paymentsdk_divkit_success_cvv_color);
                setState(this.state);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void applyStateForAnimation(kmk state) {
        if ((state instanceof imk) || jl40.l(state, hmk.a)) {
            zpa0 zpa0Var = this.binding;
            zpa0Var.b.startAnimation(AnimationUtils.loadAnimation(zpa0Var.a.getContext(), jmg0.paymentsdk_flash_animation));
            return;
        }
        if (!jl40.l(state, hmk.b) && !jl40.l(state, hmk.c) && !jl40.l(state, hmk.d) && !jl40.l(state, hmk.e) && !(state instanceof jmk)) {
            w511.b();
            return;
        }
        Animation animation = this.binding.b.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setState$lambda$0$0(zpa0 zpa0Var) {
        zpa0Var.c.setText(CompressionResistantListComponent.TEXT_DELIMITER);
    }

    public final void setState(kmk state) {
        zpa0 zpa0Var = this.binding;
        applyStateForAnimation(state);
        if (state.equals(hmk.b)) {
            View view = zpa0Var.b;
            TextView textView = zpa0Var.c;
            view.setVisibility(4);
            textView.setText(CompressionResistantListComponent.TEXT_DELIMITER);
            textView.setVisibility(0);
            textView.setTextColor(this.textColor);
        } else if (state.equals(hmk.d)) {
            zpa0Var.b.setVisibility(4);
            zpa0Var.c.setVisibility(4);
        } else if (state instanceof jmk) {
            TextView textView2 = zpa0Var.c;
            textView2.setTextColor(this.textColor);
            zpa0Var.b.setVisibility(4);
            textView2.setVisibility(0);
            textView2.setText(((jmk) state).a);
            textView2.postDelayed(new uxh(21, zpa0Var), 200L);
        } else if (state.equals(hmk.c)) {
            View view2 = zpa0Var.b;
            TextView textView3 = zpa0Var.c;
            view2.setVisibility(4);
            textView3.setVisibility(0);
            textView3.setText(CompressionResistantListComponent.TEXT_DELIMITER);
            textView3.setTextColor(-65536);
        } else if (state.equals(hmk.a)) {
            zpa0Var.b.setVisibility(0);
            zpa0Var.c.setVisibility(4);
        } else if (state instanceof imk) {
            zpa0Var.b.setVisibility(((imk) state).a ? 0 : 8);
            zpa0Var.c.setVisibility(8);
        } else {
            if (!state.equals(hmk.e)) {
                w511.b();
                return;
            }
            View view3 = zpa0Var.b;
            TextView textView4 = zpa0Var.c;
            view3.setVisibility(4);
            textView4.setVisibility(0);
            textView4.setText(CompressionResistantListComponent.TEXT_DELIMITER);
            textView4.setTextColor(this.successColor);
        }
        this.state = state;
    }

    public DivCvvNumber(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DivCvvNumber(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DivCvvNumber(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
