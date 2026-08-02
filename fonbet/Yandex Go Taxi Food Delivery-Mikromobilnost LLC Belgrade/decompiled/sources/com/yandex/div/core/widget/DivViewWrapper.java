package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.ax01;
import defpackage.cx01;
import defpackage.ny61;
import defpackage.ugk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010*\u001a\u00020!2\u0006\u0010&\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/div/core/widget/DivViewWrapper;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lugk;", "Lax01;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "Lzy11;", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "", "isTransient", "()Z", "getChild", "()Landroid/view/View;", "value", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DivViewWrapper extends FrameContainerLayout implements ugk, ax01 {
    private final /* synthetic */ cx01 $$delegate_0;

    public DivViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new cx01();
        setDefaultFocusHighlightEnabled(false);
        setImportantForAccessibility(2);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() == 0) {
            super.addView(child, 0, params);
        } else {
            ny61.g("ViewWrapper can host only one child view");
        }
    }

    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // defpackage.ugk
    public com.yandex.div.core.view2.divs.widgets.a getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        ugk ugkVar = child instanceof ugk ? (ugk) child : null;
        if (ugkVar != null) {
            return ugkVar.getDivBorderDrawer();
        }
        return null;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        ugk ugkVar = child instanceof ugk ? (ugk) child : null;
        if (ugkVar != null) {
            return ugkVar.getNeedClipping();
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void invalidateBorder() {
        super.invalidateBorder();
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    public void onBoundsChanged(int i, int i2) {
        com.yandex.div.core.view2.divs.widgets.a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.g();
        }
    }

    public /* bridge */ /* synthetic */ void releaseBorderDrawer() {
        super.releaseBorderDrawer();
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        KeyEvent.Callback child = getChild();
        ugk ugkVar = child instanceof ugk ? (ugk) child : null;
        if (ugkVar != null) {
            ugkVar.setBorder(bindingContext, border, view);
        }
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        KeyEvent.Callback child = getChild();
        ugk ugkVar = child instanceof ugk ? (ugk) child : null;
        if (ugkVar == null) {
            return;
        }
        ugkVar.setNeedClipping(z);
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivViewWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivViewWrapper(Context context) {
        this(context, null, 0, 6, null);
    }
}
