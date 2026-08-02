package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div2.DivAction;
import java.util.List;

/* compiled from: PerformActionSpan.kt */
/* loaded from: classes7.dex */
public final class PerformActionSpan extends ClickableSpan {
    private final List<DivAction> actions;
    private final BindingContext bindingContext;

    public PerformActionSpan(BindingContext bindingContext, List<DivAction> list) {
        this.bindingContext = bindingContext;
        this.actions = list;
    }

    private final DivActionBinder getActionBinder() {
        return this.bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
    }

    public final List<DivAction> getActions() {
        return this.actions;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        getActionBinder().handleTapClick$div_release(this.bindingContext, view, this.actions);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
    }
}
