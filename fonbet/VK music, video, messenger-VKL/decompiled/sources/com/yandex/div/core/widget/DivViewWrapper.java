package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import com.yandex.div2.u1;
import xsna.zcl;

/* compiled from: DivViewWrapper.kt */
/* loaded from: classes7.dex */
public class DivViewWrapper extends FrameContainerLayout implements DivBorderSupports, TransientView {
    private final /* synthetic */ TransientViewMixin $$delegate_0;

    public /* synthetic */ DivViewWrapper(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 0) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view");
        }
        super.addView(view, 0, layoutParams);
    }

    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getDivBorderDrawer();
        }
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getNeedClipping();
        }
        return true;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            divBorderSupports.setBorder(bindingContext, u1Var, view);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return;
        }
        divBorderSupports.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new TransientViewMixin();
        setDefaultFocusHighlightEnabled(false);
        setImportantForAccessibility(2);
    }
}
